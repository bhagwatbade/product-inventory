import { Component, OnInit } from '@angular/core';
import { ProductService } from './product.service';
import { Product } from './product';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent implements OnInit {
  title = 'product-inventory';

  products: Product[] = [];
  orignalProducts: Product[] = [];
  sortBy = 'productId';
  searchType = '';
  searchData = '';
  lowPrice = 0;
  highPrice = 0;

  constructor(private productService: ProductService) {

  }

  ngOnInit(): void {
    this.getProducts();
  }

  getProducts(): void {
    this.productService.getProducts()
      .then(products => {
        this.orignalProducts = products;
        return this.products = products;
      })
      .then(() => this.sort(this.sortBy));
  }

  search(): void {
    this.products = this.orignalProducts;
    if (this.searchType) {
      this.products = this.products.filter(element => {
        if (this.searchType !== 'productPrice') {
          if (typeof (element[this.searchType]) === 'string') {
            return element[this.searchType].includes(this.searchData);
          } else if (typeof (element[this.searchType]) === 'number') {
            return element[this.searchType] === Number(this.searchData);
          }
        } else if (this.searchType === 'productPrice') {
          return (element[this.searchType] >= this.lowPrice && element[this.searchType] < this.highPrice);
        }
      });
    }
  }

  sort(sortBy: string): void {
    this.sortBy = sortBy;
    this.products.sort((trg: any, src: any) => {
      if (trg[this.sortBy] < src[this.sortBy]) {
        return -1;
      } else if (trg[this.sortBy] > src[this.sortBy]) {
        return 1;
      } else {
        return 0;
      }
    });
  }
}
