            package xhpgvfjuz;

            import java.util.HashMap;
            import okhttp3.HttpUrl;
            
            /* JADX INFO: renamed from: xhpgvfjuz.ao */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            public class C2425ao {

                /* JADX INFO: renamed from: a */
                public final HashMap f19150a = new HashMap();

                /* JADX INFO: renamed from: b */
                public final EnumC2371C f19151b;

                public C2425ao(EnumC2371C enumC2371C) {
                    this.f19151b = enumC2371C;
                }

                /* JADX INFO: renamed from: a */
                public String m9895a(int i) {
                    Object obj = this.f19150a.get(Integer.valueOf(i));
                    return obj != null ? (String) obj : HttpUrl.FRAGMENT_ENCODE_SET;
                }

                /* JADX INFO: renamed from: f */
                public boolean m9896f(int i) {
                    Object obj = this.f19150a.get(Integer.valueOf(i));
                    if (obj != null) {
                        return ((Boolean) obj).booleanValue();
                    }
                    return false;
                }

                /* JADX INFO: renamed from: g */
                public EnumC2371C m9897g() {
                    return this.f19151b;
                }

                /* JADX INFO: renamed from: h */
                public int m9898h(int i) {
                    Object obj = this.f19150a.get(Integer.valueOf(i));
                    if (obj != null) {
                        return ((Integer) obj).intValue();
                    }
                    return 0;
                }
            }
