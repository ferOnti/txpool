.. To build this file locally ensure docutils Python package is installed and run:
   $ rst2html.py README.rst README.html

web3j-txpool: Java integration library for txpool
=================================================

web3j-txpool is an extension to `web3j <https://github.com/web3j/web3j>`_ providing support for
txpool API.

web3j is a lightweight, reactive, type safe Java library for integrating with clients
(nodes) on distributed ledger or blockchain networks.

For further information on web3j, please refer to the
`main project page <https://github.com/web3j/web3j>`_ and the documentation at
`Read the Docs <http://docs.web3j.io>`_.


Features
--------

- Works out the box with txpool Ethereum rpc 
  
Getting started
---------------

Add the relevant dependency to your project:

Maven
-----

Java 8:

.. code-block:: xml

   <dependency>
     <groupId>org.web3j</groupId>
     <artifactId>txpool</artifactId>
     <version>0.3.0</version>
   </dependency>

Gradle
------

Java 8:

.. code-block:: groovy

   compile ('org.web3j:txpool:0.3.0')


See the `web3j documentation <http://docs.web3j.io/smart_contracts.html>`_ for a detailed overview
of smart contracts and web3j.

