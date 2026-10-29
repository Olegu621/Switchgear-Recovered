            package p000;

            import java.util.Iterator;
            import java.util.Map;
            import java.util.Set;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class ch3 extends ph3 {

                /* JADX INFO: renamed from: f */
                public final /* synthetic */ int f2928f;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public /* synthetic */ ch3(String str, Class cls, boolean z, boolean z2, int i) {
/* 3 */             super(str, cls, z, z2);
/* 1 */             this.f2928f = i;
                }

                @Override // p000.ph3
                /* JADX INFO: renamed from: a */
                public void mo1655a(Iterator it, ii3 ii3Var) {
                    switch (this.f2928f) {
                        case 0:
/* 14 */                    if (it.hasNext()) {
/* 16 */                        Object next = it.next();
/* 20 */                        boolean zHasNext = it.hasNext();
/* 24 */                        String str = this.f15131a;
/* 26 */                        if (!zHasNext) {
/* 28 */                            ii3Var.m4549a(str, next);
                                } else {
/* 36 */                            StringBuilder sb = new StringBuilder("[");
/* 39 */                            sb.append(next);
/* 58 */                            do {
/* 44 */                                sb.append(',');
/* 51 */                                sb.append(it.next());
/* 58 */                            } while (it.hasNext());
/* 62 */                            sb.append(']');
/* 69 */                            ii3Var.m4549a(str, sb.toString());
                                }
                            }
                            break;
                        default:
/* 6 */                     super.mo1655a(it, ii3Var);
                            break;
                    }
                }

                @Override // p000.ph3
                /* JADX INFO: renamed from: b */
                public void mo1656b(Object obj, ii3 ii3Var) {
                    switch (this.f2928f) {
                        case 1:
/* 14 */                    gk3 gk3Var = ((kk3) obj).f12866a.f9699c;
/* 16 */                    gk3Var.getClass();
/* 20 */                    int i = 0;
                            while (true) {
/* 35 */                        if (!(i < gk3Var.m3966b() - gk3Var.m3965a())) {
                                    break;
                                } else if (i >= gk3Var.m3966b() - gk3Var.m3965a()) {
/* 116 */                           C1951n4.m6864o();
                                    break;
                                } else {
/* 50 */                            Object[] objArr = gk3Var.f8688b.f9697a;
/* 56 */                            int iM3965a = gk3Var.m3965a() + i;
/* 57 */                            i++;
/* 61 */                            Map.Entry entry = (Map.Entry) objArr[iM3965a];
/* 73 */                            if (((Set) entry.getValue()).isEmpty()) {
/* 112 */                               ii3Var.m4549a((String) entry.getKey(), null);
                                    } else {
/* 81 */                                Iterator it = ((Set) entry.getValue()).iterator();
/* 89 */                                while (it.hasNext()) {
/* 101 */                                   ii3Var.m4549a((String) entry.getKey(), it.next());
                                        }
                                    }
                                }
                            }
                            break;
                        default:
/* 6 */                     super.mo1656b(obj, ii3Var);
                            break;
                    }
                }
            }
