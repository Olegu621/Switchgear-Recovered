            package com.google.android.recaptcha.internal;

            import java.util.Iterator;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public abstract class zzmk implements Iterable {
                public final String toString() {
/* 1 */             Iterator it = iterator();
/* 9 */             StringBuilder sb = new StringBuilder("[");
/* 12 */            boolean z = true;
/* 17 */            while (it.hasNext()) {
/* 19 */                if (!z) {
/* 23 */                    sb.append(", ");
                        }
/* 30 */                sb.append(it.next());
/* 33 */                z = false;
                    }
/* 37 */            sb.append(']');
/* 40 */            return sb.toString();
                }
            }
