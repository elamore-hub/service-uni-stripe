import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import './vendor';
import { ServiceUniStripeSharedModule } from 'app/shared/shared.module';
import { ServiceUniStripeCoreModule } from 'app/core/core.module';
import { ServiceUniStripeAppRoutingModule } from './app-routing.module';
import { ServiceUniStripeHomeModule } from './home/home.module';
import { ServiceUniStripeEntityModule } from './entities/entity.module';
// jhipster-needle-angular-add-module-import JHipster will add new module here
import { MainComponent } from './layouts/main/main.component';
import { NavbarComponent } from './layouts/navbar/navbar.component';
import { FooterComponent } from './layouts/footer/footer.component';
import { PageRibbonComponent } from './layouts/profiles/page-ribbon.component';
import { ErrorComponent } from './layouts/error/error.component';

@NgModule({
  imports: [
    BrowserModule,
    ServiceUniStripeSharedModule,
    ServiceUniStripeCoreModule,
    ServiceUniStripeHomeModule,
    // jhipster-needle-angular-add-module JHipster will add new module here
    ServiceUniStripeEntityModule,
    ServiceUniStripeAppRoutingModule,
  ],
  declarations: [MainComponent, NavbarComponent, ErrorComponent, PageRibbonComponent, FooterComponent],
  bootstrap: [MainComponent],
})
export class ServiceUniStripeAppModule {}
