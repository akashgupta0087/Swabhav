import { Component, OnInit } from '@angular/core';
import { ProductService } from '../services/productService.service';

@Component({
  selector: 'app-productList',
  templateUrl: './productList.component.html',
  styleUrls: ['./productList.component.css']
})
export class ProductListComponent implements OnInit {

  products: object
  showImage: boolean
  buttonText: String

  constructor(private productService:ProductService) {
    this.showImage = true
    this.buttonText = "Hide image"
   }

  ngOnInit() {
    this.productService.getProducts().subscribe((data)=>{
      this.products = data
      console.log(this.products)
    },
    (error)=>{
      console.log(error)
    })
  }

  displayImages(){
    if(this.showImage == true){
      this.showImage = false
      this.buttonText = "Show image"
    }
    else{
      this.showImage = true
      this.buttonText = "Hide image"
    }
  }

}
