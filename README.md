# reload-ns

Clean reload namespace for REPL

## Usage

```bash
user=> (ns hello.core)
nil
hello.core=> foo
#object[hello.core$foo 0x56bd037d "hello.core$foo@56bd037d"]
hello.core=> one

CompilerException java.lang.RuntimeException: Unable to resolve symbol: one in this context, compiling:(/private/var/folders/r8/mzg_pxm537dch8g2_xrzvych0000gn/T/form-init4578081020999431011.clj:1:7338) 
hello.core=> (def one 1)
#'hello.core/one
hello.core=> one
1
hello.core=> (ns user)
nil
user=> (reload-ns hello.core (:require [clojure.string :refer [split]]))
nil
hello.core=> foo
#object[hello.core$foo 0x237539dc "hello.core$foo@237539dc"]
hello.core=> one

CompilerException java.lang.RuntimeException: Unable to resolve symbol: one in this context, compiling:(/private/var/folders/r8/mzg_pxm537dch8g2_xrzvych0000gn/T/form-init4578081020999431011.clj:1:7338) 
hello.core=> split
#object[clojure.string$split 0xa3115d2 "clojure.string$split@a3115d2"]
```

## License

Copyright © 2016 Eunmin Kim

Distributed under the Eclipse Public License either version 1.0 or (at
your option) any later version.
