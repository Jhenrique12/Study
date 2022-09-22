import { Directive, ElementRef } from '@angular/core';

@Directive({
  selector: '[appMarcaTexto]'
})
export class MarcaTextoDirective {

  constructor(private elemento: ElementRef) { }

}
