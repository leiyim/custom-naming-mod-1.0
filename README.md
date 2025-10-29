Allows modification of the in-game character name pool to replace all subsequently generated NPC names. 
This is achieved by creating localization files (.lang) in the \resources\locale directory. 
The displayed names will adapt to the player's in-game language settings. 
If no corresponding .lang file exists for a particular language, the game will default to using the original names.

允许修改游戏内人物姓名池，以此替换后续游戏内所有生成的NPC姓名，通过在\resources\locale下创建本地化文件.lang实现，
最终显示根据游戏内玩家的语言，如果没有对应的.lang文件默认加载游戏原本的姓名。

Example示例：  

en.lang  
[names]  
elder=Diligo,Haydex  
male=Aaron,Adam,Alastair,Albert,Alexander  
female=Abigail,Abitha,Alexis,Alicia,Amity  
neutral=Alex,Ash,Bobby,Casey,Darcy  
last=Smith, Johnson,Williams,Brown,Jones,Miller  



