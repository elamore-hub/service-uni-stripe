import { NgModule } from '@angular/core';
import { RouterModule } from '@angular/router';

@NgModule({
  imports: [
    RouterModule.forChild([
      {
        path: 'event-uses',
        loadChildren: () => import('./event-uses/event-uses.module').then(m => m.ServiceUniStripeEventUsesModule),
      },
      {
        path: 'product',
        loadChildren: () => import('./product/product.module').then(m => m.ServiceUniStripeProductModule),
      },
      /* jhipster-needle-add-entity-route - JHipster will add entity modules routes here */
    ]),
  ],
})
export class ServiceUniStripeEntityModule {}
