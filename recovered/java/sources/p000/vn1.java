            package p000;

            import kotlin.jvm.internal.DefaultConstructorMarker;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 12 */    public final class vn1 extends Error {
                /* JADX WARN: Illegal instructions before constructor call */
                public vn1(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
/* 5 */             str = (i & 1) != 0 ? "An operation is not implemented." : str;
/* 7 */             str.getClass();
/* 10 */            super(str);
                }

/* 13 */        public vn1() {
/* 14 */            this(null, 1, null);
                }
            }
