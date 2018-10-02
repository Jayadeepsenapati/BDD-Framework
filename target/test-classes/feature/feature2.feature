Feature: Gmail login

Scenario Outline: validate userid field
	Given launch gmail site
	When enter userid as "<x>" value
	And click next button
	Then validate userid depends on criteria "<y>" value
	And close site
  Examples: 
      | 				x  				| 			y					|
      | jayadeep.senapati |     valid				|
      | jayadeep.senapaati|     invalid			|
      |										|			invalid			|
Scenario Outline:	validate password field
	Given launch gmail site
	When enter userid as "jayadeep.senapati" value
	And click next button
	When enter password as "<x>" value
	And click password next button
	Then validate password depends on criteria "<y>" value
	And close site
	Examples:
			| 				x  				| 			y					|
      | 		jayenjoy 			|     valid				|
      | 		jayadeep			|     invalid			|
      |										|			invalid			|