            package p000;

            import java.io.PrintWriter;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class e91 extends b91 {

                /* JADX INFO: renamed from: a */
                public final g71 f7577a;

                /* JADX INFO: renamed from: b */
                public final d91 f7578b;

                public e91(g71 g71Var, t33 t33Var) {
/* 4 */             this.f7577a = g71Var;
/* 10 */            ac1 ac1Var = new ac1(t33Var, d91.f7065f);
/* 15 */            String canonicalName = d91.class.getCanonicalName();
/* 19 */            if (canonicalName != null) {
/* 33 */                this.f7578b = (d91) ac1Var.m182l(d91.class, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(canonicalName));
                    } else {
/* 38 */                C1951n4.m6859j("Local and anonymous classes can not be ViewModels");
/* 42 */                throw null;
                    }
                }

                /* JADX INFO: renamed from: b */
                public final void m3344b(String str, PrintWriter printWriter) {
/* 1 */             d91 d91Var = this.f7578b;
/* 7 */             if (d91Var.f7066d.f18042c <= 0) {
/* 367 */               return;
                    }
/* 9 */             printWriter.print(str);
/* 14 */            printWriter.println("Loaders:");
/* 30 */            String str2 = str + "    ";
/* 35 */            int i = 0;
                    while (true) {
/* 36 */                vf2 vf2Var = d91Var.f7066d;
/* 40 */                if (i >= vf2Var.f18042c) {
/* 367 */                   return;
                        }
/* 46 */                c91 c91Var = (c91) vf2Var.f18041b[i];
/* 48 */                printWriter.print(str);
/* 53 */                printWriter.print("  #");
/* 62 */                printWriter.print(d91Var.f7066d.f18040a[i]);
/* 67 */                printWriter.print(": ");
/* 74 */                printWriter.println(c91Var.toString());
/* 77 */                printWriter.print(str2);
/* 82 */                printWriter.print("mId=");
/* 85 */                printWriter.print(0);
/* 90 */                printWriter.print(" mArgs=");
/* 94 */                printWriter.println((Object) null);
/* 97 */                printWriter.print(str2);
/* 102 */               printWriter.print("mLoader=");
/* 107 */               printWriter.println(c91Var.f2776l);
/* 110 */               lc3 lc3Var = c91Var.f2776l;
/* 114 */               String strConcat = str2.concat("  ");
/* 118 */               lc3Var.getClass();
/* 121 */               printWriter.print(strConcat);
/* 124 */               printWriter.print("mId=");
/* 127 */               printWriter.print(0);
/* 132 */               printWriter.print(" mListener=");
/* 137 */               printWriter.println(lc3Var.f13186a);
/* 144 */               if (lc3Var.f13187b || lc3Var.f13190e) {
/* 151 */                   printWriter.print(strConcat);
/* 154 */                   printWriter.print("mStarted=");
/* 159 */                   printWriter.print(lc3Var.f13187b);
/* 164 */                   printWriter.print(" mContentChanged=");
/* 169 */                   printWriter.print(lc3Var.f13190e);
/* 174 */                   printWriter.print(" mProcessingChange=");
/* 177 */                   printWriter.println(false);
                        }
/* 182 */               if (lc3Var.f13188c || lc3Var.f13189d) {
/* 188 */                   printWriter.print(strConcat);
/* 193 */                   printWriter.print("mAbandoned=");
/* 198 */                   printWriter.print(lc3Var.f13188c);
/* 203 */                   printWriter.print(" mReset=");
/* 208 */                   printWriter.println(lc3Var.f13189d);
                        }
/* 215 */               if (lc3Var.f13192g != null) {
/* 217 */                   printWriter.print(strConcat);
/* 222 */                   printWriter.print("mTask=");
/* 227 */                   printWriter.print(lc3Var.f13192g);
/* 230 */                   printWriter.print(" waiting=");
/* 235 */                   lc3Var.f13192g.getClass();
/* 238 */                   printWriter.println(false);
                        }
/* 243 */               if (lc3Var.f13193h != null) {
/* 245 */                   printWriter.print(strConcat);
/* 250 */                   printWriter.print("mCancellingTask=");
/* 255 */                   printWriter.print(lc3Var.f13193h);
/* 258 */                   printWriter.print(" waiting=");
/* 263 */                   lc3Var.f13193h.getClass();
/* 266 */                   printWriter.println(false);
                        }
/* 271 */               if (c91Var.f2778n != null) {
/* 273 */                   printWriter.print(str2);
/* 278 */                   printWriter.print("mCallbacks=");
/* 283 */                   printWriter.println(c91Var.f2778n);
/* 286 */                   zr3 zr3Var = c91Var.f2778n;
/* 288 */                   String strConcat2 = str2.concat("  ");
/* 292 */                   zr3Var.getClass();
/* 295 */                   printWriter.print(strConcat2);
/* 300 */                   printWriter.print("mDeliveredData=");
/* 305 */                   printWriter.println(zr3Var.f20311b);
                        }
/* 308 */               printWriter.print(str2);
/* 313 */               printWriter.print("mData=");
/* 316 */               lc3 lc3Var2 = c91Var.f2776l;
/* 318 */               Object objMo118d = c91Var.mo118d();
/* 322 */               lc3Var2.getClass();
/* 329 */               StringBuilder sb = new StringBuilder(64);
/* 332 */               he3.m4180a(sb, objMo118d);
/* 337 */               sb.append("}");
/* 344 */               printWriter.println(sb.toString());
/* 347 */               printWriter.print(str2);
/* 350 */               printWriter.print("mStarted=");
/* 360 */               printWriter.println(c91Var.f124c > 0);
/* 363 */               i++;
                    }
                }

                public final String toString() {
/* 5 */             StringBuilder sb = new StringBuilder(128);
/* 10 */            sb.append("LoaderManager{");
/* 21 */            sb.append(Integer.toHexString(System.identityHashCode(this)));
/* 26 */            sb.append(" in ");
/* 31 */            he3.m4180a(sb, this.f7577a);
/* 36 */            sb.append("}}");
/* 39 */            return sb.toString();
                }
            }
