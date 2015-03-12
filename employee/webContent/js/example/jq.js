/**
 * http://jqfundamentals.com/chapter/jquery-basics
 */
$(function(){
	//Get Some Elements
	$( '#header' ); // select the element with an ID of 'header'	
	$( 'li' );      // select all list items on the page
	$( 'ul li' );   // select list items that are in unordered lists
	$( '.person' ); // select all elements with a class of 'person'
	//alert($( '#header' ));
	
	if ( $( '#nonexistent' ).length ) {
	  // This code will only run if there's a matching element
	  alert("elements with id # nonexistent");
	}

	//Getting single elements from a selection 
	var listItems = $('li');
	var rawListItem = listItems[0]; // or listItems.get( 0 )
	var html = rawListItem.innerHTML;
	//alert(html);
	
	//Note that you cannot call jQuery methods on raw DOM elements. 
	//var html2 = rawListItem.html(); //this wont work.
	//alert(html2);
	
	//you can get a new jQuery object containing a single element by using .eq() and passing the index of the element 
	var secondListItem = listItems.eq(2);
	//secondListItem.remove();		
	var html3 = secondListItem.html();
	//alert(html3);
	
	/**
	 * Working With Selections
		testing a selection .is(). It returns true or false.
		You can also pass the .is() method a jQuery object, a raw DOM element, or even a function
	*/
	var test = $( 'li' ).eq( 0 ).is( '.special' ); // false
	var test2 = $( 'li' ).eq( 1 ).is( '.special' ); // true
	//alert(test2);
	
	
	/**Getters, setters, and implicit iteration
		*getters operate only on the first element in a selection (.text() is a notable exception)
		*setters operate on all elements in a selection, using what's known as implicit iteration.
	*/
	//you want to change the HTML of all of the list items on your page
	//$('li').html('New HTML');
	
	//You can also pass a function to jQuery's setter methods
	//This function's return value is used as the new value, and it receives two arguments: the index of the element in the selection, and the old value of the thing you're trying to change. This is useful when you need information about an element's current state in order to properly set the new state.
/* uncomment to test
 	$('li').html(
			function(index, oldHtml){
				return oldHtml + '!!!!';
				
			}		
	);
*/	
	
	/**	Explicit iteration
		The .each() method lets you do this
		You'll notice that, inside the function that we pass to .each(), we have access to the current raw DOM element in two ways: as this and as elem. 
		In the following code, we use it to add a <b> tag at the beginning of the list item, containing the index of the list item.
	 */		
/* uncomment to test
 	$( 'li' ).each(function( index, elem ) {
		  // this: the current, raw DOM element
		  // index: the current element's index in the selection
		  // elem: the current, raw DOM element (same as this)
		  $( elem ).prepend( '<b>' + index + ': </b>' );
		});
*/	
	
	/** Chaining
		*One of the most lucrative parts of jQuery is the ability to "chain" methods together. This means that we can call a series of methods on a selection without having to repeat the selection or store the selection in a variable. We can even make new selections based on previous selections, all without breaking the chain.
		*$('li').click().find().attr();
	*/
/* uncomment and see the result in browser debugger
 	$('li').click(function(){
		$(this).addClass('clicked');
	})
	.find('span')
		.attr('title','hover over me');
	*/

	//to make above code simple for reading
/*
	var listItems = $( 'li' );
	var spans = listItems.find( 'span' );
	listItems
	  .click(function() {
	    $( this ).addClass( 'clicked' );
	  });
	spans.attr( 'title', 'Hover over me' );
*/
	/**
	 * Traversing
	 * http://api.jquery.com/category/traversing/
	*/
	
	
	//Filtering selections
	
	var listItems = $('li');
	// filter the selection to only items with a class of 'special'
	var special = listItems.filter('.special');
	// filter the selection to only items without a class of 'special'
	var notSpecial = listItems.not('.special');
	// filter the selection to only items that contain a span
	var hasSpan = listItems.has('span');
	
	//Finding elements relative to a selection
	
	// get the first list item on the page
	var listItem = $( 'li' ).first(); // also: .last()
	// get the siblings of the list item
	var siblings = listItem.siblings();
	// get the next sibling of the list item
	var nextSibling = listItem.next(); // also: .prev()
	// get the list item's parent
	var list = listItem.parent();
	// get the list items that are immediate children of the list
	var listItems = list.children();
	// get ALL list items in the list, including nested ones
	var allListItems = list.find( 'li' );
	// find all ancestors of the list item that have a class of "module"
	var modules = listItem.parents( '.module' );
	// find the closest ancestor of the list item that has a class of "module"
	var module = listItem.closest( '.module' );
	
	//You can also add to an existing selection by using the .add() method.
	//You can use the jQuery .end() method to get back to your original selection

	/**
	 * Manipulation
	 * http://api.jquery.com/category/traversing/
	*/
	//Adding and removing classes
	//$( 'li' ).addClass( 'hidden' );
	//$( 'li' ).eq( 1 ).removeClass( 'hidden' );
	//$( 'li' ).eq( 1 ).toggleClass( 'hidden' );
	
	//Changing style
	//jQuery provides the .css() method to allow you to set the style of elements directly.
	
	$( 'li' ).eq( 1 ).css({
		  'font-size': '20px',
		  'padding-left': '20px'
	});
	
	//Changing form values
	//jQuery provides the .val() method for altering the value of form elements such as select and input elements.
	//For text input elements, you can set their content by passing a string to the .val() method:
	$( 'input[type="text"]' ).val( 'new value' );
	//For select elements, you can set the chosen option using .val() as well:
	$( 'select' ).val( '2' );
	//For checkbox input elements, you'll need to set the checked property on the element using the .prop() method.
	$( 'input[type="checkbox"]' ).prop( 'checked', 'checked' );
	
	//Changing other attributes
	//You can use jQuery's .attr() method to change other attributes of elements. 
	//You can also remove attributes entirely using .removeAttr().
	$( 'a' ).attr( 'title', 'Click me!' );
	$( 'a' ).attr( 'href', function(index, value) {
		  return value + '?special=true';
		});
	
	//Getting information from elements
	//For example, the .val() method described above can be used as both a setter and a getter.
	//Likewise, the .css() method can be used to retrieve the value of individual CSS properties by passing only a property name, not a value.

	var listItemColor = $( 'li' ).css( 'color' );
	
	//Placing elements in the document
	//You could append the item to the list by calling .appendTo() on the list item:
	var listItem = $( '#my-unordered-list li' ).first();
	listItem.appendTo( '#my-unordered-list' );
	//You could append the item to the list by calling .append() on the list:
	var listItem = $( '#my-unordered-list li' ).first();
	$( '#my-unordered-list' ).append( listItem );
});	