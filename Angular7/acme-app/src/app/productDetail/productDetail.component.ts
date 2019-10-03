import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { ProductService } from '../services/productService.service';

@Component({
  selector: 'app-productDetail',
  templateUrl: './productDetail.component.html',
  styleUrls: ['./productDetail.component.css']
})
export class ProductDetailComponent implements OnInit {
parameter:String
product:object

constructor(private route:ActivatedRoute, private productService: ProductService) { }

  ngOnInit() {
    this.parameter = this.route.snapshot.params.id
    console.log(this.parameter)
    this.productService.getProducts().subscribe((data:any[])=>{
      console.log(data)
      console.log(data[0].productId)
      for(let i = 0; i < data.length;i++){
        if(data[i].productId == this.parameter){
          this.product = data[i]
        }
      }
      console.log(this.product)
    })
    
  }

}
