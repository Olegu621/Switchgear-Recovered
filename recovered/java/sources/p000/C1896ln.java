            package p000;

            import android.content.Context;
            import android.hardware.camera2.CameraAccessException;
            import android.hardware.camera2.CameraManager;
            import java.util.ArrayList;
            import java.util.Arrays;
            import java.util.HashMap;
            import java.util.Iterator;
            import java.util.List;
            
            /* JADX INFO: renamed from: ln */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C1896ln {

                /* JADX INFO: renamed from: a */
                public final Context f13421a;

                /* JADX INFO: renamed from: b */
                public final C1837kn f13422b;

                /* JADX INFO: renamed from: c */
                public final C0952gf f13423c;

                /* JADX INFO: renamed from: d */
                public final C1899lq f13424d;

                /* JADX INFO: renamed from: e */
                public final C0816cq f13425e;

                /* JADX INFO: renamed from: f */
                public final ArrayList f13426f;

                /* JADX INFO: renamed from: g */
                public final c90 f13427g;

                /* JADX INFO: renamed from: h */
                public final long f13428h;

                /* JADX INFO: renamed from: i */
                public final HashMap f13429i = new HashMap();

                public C1896ln(Context context, C0952gf c0952gf, C1802jq c1802jq, long j) throws ux0 {
                    String strM4183d;
/* 11 */            this.f13421a = context;
/* 13 */            this.f13423c = c0952gf;
/* 17 */            C0816cq c0816cqM2830a = C0816cq.m2830a(context, c0952gf.f8575b);
/* 21 */            this.f13425e = c0816cqM2830a;
/* 27 */            this.f13427g = c90.m1546b(context);
                    try {
/* 31 */                ArrayList<String> arrayList = new ArrayList();
/* 34 */                C0210cb c0210cb = c0816cqM2830a.f6873a;
/* 36 */                c0210cb.getClass();
                        try {
/* 47 */                    List<String> listAsList = Arrays.asList(((CameraManager) c0210cb.f2804b).getCameraIdList());
/* 51 */                    if (c1802jq == null) {
/* 53 */                        Iterator it = listAsList.iterator();
/* 61 */                        while (it.hasNext()) {
/* 69 */                            arrayList.add((String) it.next());
                                }
                            } else {
                                try {
/* 77 */                            strM4183d = he3.m4183d(c0816cqM2830a, c1802jq.m5880b(), listAsList);
                                } catch (IllegalStateException unused) {
/* 82 */                            strM4183d = null;
                                }
/* 85 */                        ArrayList arrayList2 = new ArrayList();
/* 96 */                        for (String str : listAsList) {
/* 108 */                           if (!str.equals(strM4183d)) {
/* 115 */                               arrayList2.add(m6509b(str));
                                    }
                                }
/* 123 */                       Iterator it2 = c1802jq.m5879a(arrayList2).iterator();
/* 131 */                       while (it2.hasNext()) {
/* 145 */                           arrayList.add(((InterfaceC2469xp) it2.next()).mo310b());
                                }
                            }
/* 151 */                   ArrayList arrayList3 = new ArrayList();
/* 162 */                   for (String str2 : arrayList) {
/* 176 */                       if (str2.equals("0") || str2.equals("1")) {
/* 205 */                           arrayList3.add(str2);
                                } else if (yy1.m10227w(this.f13425e, str2)) {
/* 195 */                           arrayList3.add(str2);
                                } else {
/* 201 */                           hu0.m4312F0("Camera2CameraFactory");
                                }
                            }
/* 209 */                   this.f13426f = arrayList3;
/* 215 */                   C1837kn c1837kn = new C1837kn(this.f13425e);
/* 218 */                   this.f13422b = c1837kn;
/* 222 */                   C1899lq c1899lq = new C1899lq(c1837kn);
/* 225 */                   this.f13424d = c1899lq;
/* 231 */                   ((ArrayList) c1837kn.f12884d).add(c1899lq);
/* 234 */                   this.f13428h = j;
                        } catch (CameraAccessException e) {
/* 243 */                   throw new C1897lo(e);
                        }
                    } catch (C1897lo e2) {
/* 262 */               throw new ux0(new C1936mq(e2));
                    } catch (C1936mq e3) {
/* 250 */               throw new ux0(e3);
                    }
                }

                /* JADX INFO: renamed from: a */
                public final C2467xn m6508a(String str) throws C1936mq {
/* 7 */             if (!this.f13426f.contains(str)) {
/* 40 */                C1951n4.m6859j("The given camera id is not on the available camera id list.");
/* 43 */                return null;
                    }
/* 11 */            C2557zn c2557znM6509b = m6509b(str);
/* 15 */            C0952gf c0952gf = this.f13423c;
/* 34 */            return new C2467xn(this.f13421a, this.f13425e, str, c2557znM6509b, this.f13422b, this.f13424d, c0952gf.f8574a, c0952gf.f8575b, this.f13427g, this.f13428h);
                }

                /* JADX INFO: renamed from: b */
                public final C2557zn m6509b(String str) throws C1936mq {
/* 1 */             HashMap map = this.f13429i;
                    try {
/* 7 */                 C2557zn c2557zn = (C2557zn) map.get(str);
/* 9 */                 if (c2557zn != null) {
/* 21 */                    return c2557zn;
                        }
/* 15 */                C2557zn c2557zn2 = new C2557zn(this.f13425e, str);
/* 18 */                map.put(str, c2557zn2);
/* 21 */                return c2557zn2;
                    } catch (C1897lo e) {
/* 28 */                throw new C1936mq(e);
                    }
                }
            }
