            package p000;

            import android.text.Editable;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class xc0 extends Editable.Factory {

                /* JADX INFO: renamed from: a */
                public static final Object f19025a = new Object();

                /* JADX INFO: renamed from: b */
                public static volatile xc0 f19026b;

                /* JADX INFO: renamed from: c */
                public static Class f19027c;

                @Override // android.text.Editable.Factory
                public final Editable newEditable(CharSequence charSequence) {
/* 1 */             Class cls = f19027c;
                    return cls != null ? new uf2(cls, charSequence) : super.newEditable(charSequence);
                }
            }
