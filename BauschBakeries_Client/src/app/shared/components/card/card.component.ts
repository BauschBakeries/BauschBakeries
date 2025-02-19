import { Component, EventEmitter, Input, Output } from '@angular/core';

@Component({
  selector: 'app-card',
  imports: [],
  templateUrl: './card.component.html',
  styleUrl: './card.component.scss'
})
export class CardComponent {
  @Input() title: string = 'Card Title - Replace Me';

  @Output() clicked = new EventEmitter<void>();

  ngOnInit() {}
}
