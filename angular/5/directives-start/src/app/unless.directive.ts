import { Directive, Input, TemplateRef, ViewContainerRef } from '@angular/core';

@Directive({
  selector: '[appUnless]'
})
export class UnlessDirective {
  @Input() set appUnless(condition: boolean) {
    if(!condition)
    {
      this.vcfRef.createEmbeddedView(this.templateRef);
    }else
    {
      this.vcfRef.clear();
    }
  };

  constructor(private templateRef: TemplateRef<any>, private vcfRef: ViewContainerRef) { }

}
