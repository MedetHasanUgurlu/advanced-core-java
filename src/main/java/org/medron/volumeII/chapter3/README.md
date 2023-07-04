

# Chapter-3 XML

<div align="center">
<img src="img.png">
</div>

The XML format allows you to express the hierarchy
and record repeated elements without contortions.

It looks similar to an HTML file. There is a good reason for that
—both XML and HTML are descendants of the venerable
_**Standard Generalized Markup Language**_ (SGML).
SGML has been around since the 1970s for describing
the structure of complex documents. However, SGML is quite complex,
so it has never caught on in a big way. XML was designed as a
simplified version of SGML for use on the Internet.


##







Parsing an XML Document.

Java Library supplies two kinds of XML parsers.
1- DOM(Document Object Model) Tree Structure
2- XML (SAX) Streaming Parsers

DOM parser standardized by World Wide Web Consortium (w3c).

<div align="center">
<img src="img_2.png">
</div>
 You can parse file URL, file and input stream.


A document object is an in-memory representation of the tree structure of an XML document.
It is composed of objects whose classes implement the Node interface and its various subinterfaces.

<div align="center">
<img src="img_1.png">
</div>
