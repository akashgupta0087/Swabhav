import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { MatToolbarModule } from '@angular/material'
import { HttpClientModule } from '@angular/common/http';
import { FormsModule } from '@angular/forms';
import { Ng2SearchPipeModule } from 'ng2-search-filter';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { WelcomeComponent } from './welcome/welcome.component';
import { ProductListComponent } from './productList/productList.component';
import { ProductDetailComponent } from './productDetail/productDetail.component';
import { StarComponent } from './star/star.component';

@NgModule({
   declarations: [
      AppComponent,
      WelcomeComponent,
      ProductListComponent,
      ProductDetailComponent,
      StarComponent
   ],
   imports: [
      BrowserModule,
      AppRoutingModule,
      MatToolbarModule,
      HttpClientModule,
      FormsModule,
      Ng2SearchPipeModule
   ],
   providers: [],
   bootstrap: [
      AppComponent
   ]
})
export class AppModule { }
