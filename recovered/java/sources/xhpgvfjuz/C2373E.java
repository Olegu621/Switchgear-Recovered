            package xhpgvfjuz;

            import android.util.LruCache;
            import java.util.Collection;
            import java.util.Collections;
            
            /* JADX INFO: renamed from: xhpgvfjuz.E */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            class C2373E extends LruCache implements InterfaceC2375G {
                C2373E(int i) {
                    super(i);
                }

                @Override // xhpgvfjuz.InterfaceC2375G
                /* JADX INFO: renamed from: a */
                public String mo9805a() {
                    return toString();
                }

                @Override // xhpgvfjuz.InterfaceC2375G
                /* JADX INFO: renamed from: a */
                public String mo9806a(int i) {
                    return (String) super.get(Integer.valueOf(i));
                }

                /* JADX INFO: Access modifiers changed from: protected */
                @Override // android.util.LruCache
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public String create(Integer num) {
                    return C2382N.m9819b(num.intValue());
                }

                @Override // xhpgvfjuz.InterfaceC2375G
                /* JADX INFO: renamed from: b */
                public Collection mo9808b() {
                    return Collections.emptyList();
                }

                @Override // xhpgvfjuz.InterfaceC2375G
                /* JADX INFO: renamed from: c */
                public int mo9809c() {
                    return super.hitCount() + super.missCount();
                }
            }
