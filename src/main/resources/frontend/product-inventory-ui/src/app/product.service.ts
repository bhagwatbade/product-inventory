import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Product } from './product';

@Injectable({
  providedIn: 'root'
})
export class ProductService {

  private apiUrl = 'http://localhost:8080/';

  private productUrl: string = this.apiUrl + 'getProducts';

  constructor(
    private httpClient: HttpClient
  ) { }

  getProducts(): Promise<Product[]> {

    // return Promise.resolve(HEROES);
    console.log(this.productUrl);
    return this.httpClient.get(this.productUrl)
      .toPromise()
      .then(response => response as Product[])
      .catch(this.handleError);
  }

  private handleError(error: any): Promise<any> {
    console.error('An error occurred', error); // for demo purposes only
    return Promise.reject(error.message || error);
  }
}
