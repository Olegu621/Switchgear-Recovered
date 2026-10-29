            package p000;

            import android.content.res.AssetManager;
            import android.os.Build;
            import com.usercentrics.sdk.p009v2.settings.data.CCPASettings;
            import com.usercentrics.sdk.p009v2.settings.data.FirstLayer;
            import com.usercentrics.sdk.p009v2.settings.data.SecondLayer;
            import com.usercentrics.sdk.p009v2.settings.data.UsercentricsCustomization;
            import com.usercentrics.sdk.p009v2.settings.data.UsercentricsLabels;
            import com.usercentrics.sdk.p009v2.settings.data.UsercentricsSettings;
            import com.usercentrics.sdk.p009v2.translation.data.LegalBasisLocalization;
            import java.io.File;
            import java.io.FileInputStream;
            import java.io.FileNotFoundException;
            import java.io.Serializable;
            import java.util.ArrayList;
            import java.util.Iterator;
            import java.util.List;
            import java.util.concurrent.Executor;
            import kotlin.collections.C1839a;
            import kotlin.collections.CollectionsKt;
            import okhttp3.HttpUrl;
            
            /* JADX INFO: renamed from: fm */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 43 */    public final class C0922fm {

                /* JADX INFO: renamed from: a */
                public final String f8273a;

                /* JADX INFO: renamed from: b */
                public boolean f8274b;

                /* JADX INFO: renamed from: c */
                public final Object f8275c;

                /* JADX INFO: renamed from: d */
                public final Object f8276d;

                /* JADX INFO: renamed from: e */
                public final Object f8277e;

                /* JADX INFO: renamed from: f */
                public final Object f8278f;

                /* JADX INFO: renamed from: g */
                public Object f8279g;

                /* JADX INFO: renamed from: h */
                public Object f8280h;

                public C0922fm(AssetManager assetManager, Executor executor, ay1 ay1Var, String str, File file) {
/* 5 */             this.f8274b = false;
/* 7 */             this.f8275c = executor;
/* 9 */             this.f8276d = ay1Var;
/* 11 */            this.f8273a = str;
/* 13 */            this.f8278f = file;
/* 15 */            int i = Build.VERSION.SDK_INT;
/* 19 */            byte[] bArr = null;
/* 20 */            if (i <= 34) {
                        switch (i) {
                            case 24:
                            case io.flutter.Build.API_LEVELS.API_25 /* 25 */:
/* 39 */                        bArr = qj3.f15585f;
                                break;
                            case io.flutter.Build.API_LEVELS.API_26 /* 26 */:
/* 36 */                        bArr = qj3.f15584e;
                                break;
                            case io.flutter.Build.API_LEVELS.API_27 /* 27 */:
/* 33 */                        bArr = qj3.f15583d;
                                break;
                            case io.flutter.Build.API_LEVELS.API_28 /* 28 */:
                            case io.flutter.Build.API_LEVELS.API_29 /* 29 */:
                            case io.flutter.Build.API_LEVELS.API_30 /* 30 */:
/* 30 */                        bArr = qj3.f15582c;
                                break;
                            case io.flutter.Build.API_LEVELS.API_31 /* 31 */:
                            case 32:
                            case io.flutter.Build.API_LEVELS.API_33 /* 33 */:
                            case io.flutter.Build.API_LEVELS.API_34 /* 34 */:
/* 27 */                        bArr = qj3.f15581b;
                                break;
                        }
                    }
/* 41 */            this.f8277e = bArr;
                }

                /* JADX WARN: Code duplicated, block: B:57:0x01dd  */
                /* JADX INFO: renamed from: a */
                public dw1 m3772a() {
                    fj0 fj0Var;
                    ej0 ej0Var;
                    cv1 cv1Var;
                    dj0 dj0Var;
/* 8 */             ur3 ur3Var = (ur3) this.f8276d;
/* 14 */            C0875ec c0875ec = (C0875ec) this.f8277e;
/* 18 */            eq2 eq2Var = (eq2) c0875ec.f7613b;
/* 22 */            nv1 nv1Var = (nv1) c0875ec.f7614c;
/* 28 */            String str = (String) eq2Var.f7836e;
/* 32 */            String str2 = (String) eq2Var.f7837f;
/* 34 */            Object obj = this.f8275c;
/* 37 */            UsercentricsSettings usercentricsSettings = (UsercentricsSettings) obj;
/* 39 */            CCPASettings cCPASettings = usercentricsSettings.f6719s;
/* 41 */            cCPASettings.getClass();
/* 44 */            String str3 = cCPASettings.f6379f;
/* 46 */            CCPASettings cCPASettings2 = usercentricsSettings.f6719s;
/* 57 */            ra2 ra2Var = new ra2(eq2Var, nv1Var, new ec0(str, str2, str3, cCPASettings2.f6375b), (au1) c0875ec.f7615d);
/* 64 */            C0024am c0024am = new C0024am(usercentricsSettings, ur3Var, this.f8274b);
/* 69 */            if (cCPASettings2 == null || (fj0Var = cCPASettings2.f6380g) == null) {
/* 77 */                jw2.Companion.getClass();
/* 80 */                fj0Var = jw2.f12527e;
                    }
/* 82 */            FirstLayer firstLayer = usercentricsSettings.f6722v;
/* 84 */            UsercentricsLabels usercentricsLabels = usercentricsSettings.f6701a;
/* 86 */            cCPASettings2.getClass();
/* 98 */            String str4 = cCPASettings2.f6388o ? cCPASettings2.f6389p : null;
/* 100 */           String str5 = cCPASettings2.f6387n;
/* 102 */           if (str5 == null) {
/* 104 */               str5 = HttpUrl.FRAGMENT_ENCODE_SET;
                    }
/* 106 */           String str6 = str5;
/* 108 */           String str7 = cCPASettings2.f6376c;
/* 110 */           if (firstLayer == null || (ej0Var = firstLayer.f6431b) == null) {
/* 120 */               ej0Var = C0024am.f331c;
                    }
/* 117 */           ej0 ej0Var2 = ej0Var;
/* 123 */           UsercentricsCustomization usercentricsCustomization = usercentricsSettings.f6721u;
/* 132 */           String str8 = usercentricsCustomization != null ? usercentricsCustomization.f6538a : null;
/* 134 */           dv1 dv1Var = ev1.Companion;
/* 136 */           String str9 = usercentricsLabels.f6552D;
/* 138 */           String str10 = usercentricsSettings.f6706f;
/* 142 */           ez2 ez2Var = ez2.PRIVACY_POLICY_LINK;
/* 144 */           dv1Var.getClass();
/* 165 */           List listM7566e = C2085pw.m7566e(dv1.m3243a(str9, str10, ez2Var), dv1.m3243a(usercentricsLabels.f6550C, usercentricsSettings.f6705e, ez2.IMPRINT_LINK));
/* 171 */           ArrayList arrayList = new ArrayList();
/* 182 */           for (Object obj2 : listM7566e) {
/* 195 */               if (!((ev1) obj2).m3602a()) {
/* 197 */                   arrayList.add(obj2);
                        }
                    }
/* 234 */           f31 f31Var = new f31(str7, str4, str6, arrayList, ej0Var2, str8, null, (firstLayer == null || (dj0Var = firstLayer.f6433d) == null) ? null : Boolean.valueOf(dj0Var.equals(dj0.f7269b)), usercentricsLabels.f6607h0);
/* 237 */           ur3 ur3Var2 = c0024am.f332a;
/* 241 */           ju1 ju1Var = (ju1) ur3Var2.f17704b;
/* 257 */           C2131r4 c2131r4 = !cCPASettings2.f6386m ? new C2131r4(cCPASettings2.f6374a) : null;
/* 259 */           boolean z = usercentricsSettings.f6712l;
/* 303 */           xy1 xy1Var = new xy1(null, null, null, new uu1(cCPASettings2.f6375b, bu1.f2609c, ju1Var.f12490e), new uu1(cCPASettings2.f6379f, bu1.f2611e, ju1Var.f12491f), (EnumC0958gl) ur3Var2.f17706d, 7);
/* 341 */           jw2 jw2Var = new jw2(fj0Var, f31Var, new C1029ij(z ? new C2131r4("Powered by Usercentrics Consent Management") : null, c2131r4, c0024am.f333b, xy1Var.m10044h(), xy1Var.m10045i()), nd0.f14189a);
/* 368 */           ur3 ur3Var3 = ur3Var;
/* 370 */           C0849dm c0849dm = new C0849dm((UsercentricsSettings) obj, ur3Var3, this.f8273a, (List) this.f8278f, (List) this.f8279g, this.f8274b, (LegalBasisLocalization) this.f8280h);
/* 375 */           UsercentricsSettings usercentricsSettings2 = c0849dm.f7308b;
/* 377 */           CCPASettings cCPASettings3 = usercentricsSettings2.f6719s;
/* 379 */           SecondLayer secondLayer = usercentricsSettings2.f6702b;
/* 381 */           UsercentricsLabels usercentricsLabels2 = usercentricsSettings2.f6701a;
/* 383 */           cCPASettings3.getClass();
/* 386 */           String str11 = cCPASettings3.f6378e;
/* 388 */           String str12 = cCPASettings3.f6377d;
/* 390 */           ej0 ej0Var3 = C0849dm.f7307w;
/* 392 */           List list = usercentricsSettings2.f6717q;
/* 404 */           ArrayList arrayList2 = new ArrayList(C2122qw.m8020h(list, 10));
/* 407 */           Iterator it = list.iterator();
/* 415 */           while (it.hasNext()) {
/* 428 */               arrayList2.add(new bv1((String) it.next()));
                    }
/* 440 */           List listM6186E = CollectionsKt.m6186E(new wa3(2), arrayList2);
/* 446 */           if (cCPASettings3.f6390q) {
/* 478 */               cv1Var = null;
                    } else {
/* 448 */               listM6186E.getClass();
/* 460 */               if (listM6186E.size() > 1) {
/* 472 */                   cv1Var = new cv1(listM6186E, new bv1(usercentricsSettings2.f6704d));
                        } else {
/* 478 */                   cv1Var = null;
                        }
                    }
/* 480 */           UsercentricsCustomization usercentricsCustomization2 = usercentricsSettings2.f6721u;
/* 489 */           String str13 = usercentricsCustomization2 != null ? usercentricsCustomization2.f6538a : null;
/* 491 */           dv1 dv1Var2 = ev1.Companion;
/* 493 */           String str14 = usercentricsLabels2.f6552D;
/* 495 */           String str15 = usercentricsSettings2.f6706f;
/* 497 */           ez2 ez2Var2 = ez2.PRIVACY_POLICY_LINK;
/* 499 */           dv1Var2.getClass();
/* 520 */           List listM7566e2 = C2085pw.m7566e(dv1.m3243a(str14, str15, ez2Var2), dv1.m3243a(usercentricsLabels2.f6550C, usercentricsSettings2.f6705e, ez2.IMPRINT_LINK));
/* 526 */           ArrayList arrayList3 = new ArrayList();
/* 537 */           for (Object obj3 : listM7566e2) {
/* 550 */               if (!((ev1) obj3).m3602a()) {
/* 552 */                   arrayList3.add(obj3);
                        }
                    }
/* 564 */           qi1 qi1Var = new qi1(str12, str11, arrayList3, ej0Var3, str13, cv1Var);
/* 581 */           C2131r4 c2131r5 = !cCPASettings3.f6386m ? new C2131r4(cCPASettings3.f6374a) : null;
/* 583 */           boolean z2 = usercentricsSettings2.f6712l;
/* 587 */           String str16 = cCPASettings3.f6375b;
/* 589 */           ur3 ur3Var4 = c0849dm.f7309c;
/* 622 */           xy1 xy1Var2 = new xy1(null, null, null, new uu1(str16, bu1.f2609c, ((ju1) ur3Var4.f17704b).f12490e), null, (EnumC0958gl) ur3Var4.f17706d, 23);
/* 649 */           C1029ij c1029ij = new C1029ij(z2 ? new C2131r4("Powered by Usercentrics Consent Management") : null, c2131r5, c0849dm.f7313i, xy1Var2.m10044h(), xy1Var2.m10045i());
/* 654 */           String str17 = secondLayer.f6438a;
/* 660 */           n03.Companion.getClass();
/* 663 */           List list2 = c0849dm.f7311e;
/* 665 */           List list3 = c0849dm.f7312f;
/* 667 */           ArrayList arrayListM6585a = m03.m6585a(list2, list3);
/* 677 */           int i = 10;
/* 683 */           ArrayList arrayList4 = new ArrayList(C2122qw.m8020h(arrayListM6585a, 10));
/* 686 */           Iterator it2 = arrayListM6585a.iterator();
/* 694 */           while (it2.hasNext()) {
/* 700 */               C2471xr c2471xr = (C2471xr) it2.next();
/* 702 */               Iterator it3 = it2;
/* 704 */               ArrayList arrayList5 = c2471xr.f19330c;
/* 706 */               ra2 ra2Var2 = ra2Var;
/* 710 */               ur3 ur3Var5 = ur3Var3;
/* 716 */               ArrayList arrayList6 = new ArrayList(C2122qw.m8020h(arrayList5, i));
/* 727 */               for (Iterator it4 = arrayList5.iterator(); it4.hasNext(); it4 = it4) {
/* 733 */                   m61 m61Var = (m61) it4.next();
/* 760 */                   arrayList6.add(new mv1(m61Var, null, null, usercentricsSettings2.f6694B, c0849dm.m8626l(m61Var.f13590p)));
                        }
/* 792 */               arrayList4.add(new cu1(c2471xr, null, new ov1(arrayList6), c2471xr.f19328a.f6535c, null));
/* 795 */               it2 = it3;
/* 797 */               ra2Var = ra2Var2;
/* 799 */               ur3Var3 = ur3Var5;
/* 801 */               i = 10;
                    }
/* 804 */           ra2 ra2Var3 = ra2Var;
/* 806 */           ur3 ur3Var6 = ur3Var3;
/* 821 */           xv1 xv1Var = new xv1(str17, new eu1(C1839a.m6210b(new du1(null, arrayList4, null))));
/* 826 */           String str18 = secondLayer.f6439b;
/* 832 */           ArrayList<m61> arrayList7 = new ArrayList();
/* 843 */           for (Object obj4 : list3) {
/* 854 */               if (!((m61) obj4).f13599y) {
/* 856 */                   arrayList7.add(obj4);
                        }
                    }
/* 868 */           ArrayList arrayList8 = new ArrayList(C2122qw.m8020h(arrayList7, 10));
/* 879 */           for (m61 m61Var2 : arrayList7) {
/* 921 */               arrayList8.add(new cu1(m61Var2, (vv1) null, new sv1(new mv1(m61Var2, null, null, usercentricsSettings2.f6694B, c0849dm.m8626l(m61Var2.f13590p)))));
                    }
/* 971 */           return new dw1(ur3Var6, ra2Var3, jw2Var, new ac1(qi1Var, c1029ij, C2085pw.m7566e(xv1Var, new xv1(str18, new pv1(C1839a.m6210b(new du1(null, arrayList8, new fu1(c0849dm.f7314v.f6757a.f6792f, c0849dm.f7310d))))))));
                }

                /* JADX INFO: renamed from: b */
                public FileInputStream m3773b(AssetManager assetManager, String str) {
                    try {
/* 5 */                 return assetManager.openFd(str).createInputStream();
                    } catch (FileNotFoundException e) {
/* 11 */                String message = e.getMessage();
/* 15 */                if (message == null) {
/* 22 */                    return null;
                        }
/* 19 */                message.contains("compressed");
/* 22 */                return null;
                    }
                }

                /* JADX INFO: renamed from: c */
                public void m3774c(int i, Serializable serializable) {
/* 11 */            ((Executor) this.f8275c).execute(new RunnableC2524z6(this, i, serializable, 6));
                }

/* 44 */        public C0922fm(UsercentricsSettings usercentricsSettings, ur3 ur3Var, C0875ec c0875ec, String str, List list, List list2, boolean z, LegalBasisLocalization legalBasisLocalization) {
                    usercentricsSettings.getClass();
                    str.getClass();
                    list.getClass();
                    list2.getClass();
                    legalBasisLocalization.getClass();
/* 46 */            this.f8275c = usercentricsSettings;
/* 47 */            this.f8276d = ur3Var;
/* 48 */            this.f8277e = c0875ec;
/* 49 */            this.f8273a = str;
/* 50 */            this.f8278f = list;
/* 51 */            this.f8279g = list2;
/* 52 */            this.f8274b = z;
/* 53 */            this.f8280h = legalBasisLocalization;
                }
            }
