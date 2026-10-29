            package androidx.fragment.app;

            import java.io.PrintWriter;
            import java.lang.reflect.Modifier;
            import java.util.ArrayList;
            import java.util.Objects;
            import p000.bn0;
            import p000.dn0;
            import p000.f42;
            import p000.fm0;
            import p000.ga1;
            import p000.om0;
            import p000.s80;
            import p000.tm0;
            
            /* JADX INFO: renamed from: androidx.fragment.app.a */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C0086a implements tm0 {

                /* JADX INFO: renamed from: a */
                public final ArrayList f1385a;

                /* JADX INFO: renamed from: b */
                public int f1386b;

                /* JADX INFO: renamed from: c */
                public int f1387c;

                /* JADX INFO: renamed from: d */
                public int f1388d;

                /* JADX INFO: renamed from: e */
                public int f1389e;

                /* JADX INFO: renamed from: f */
                public int f1390f;

                /* JADX INFO: renamed from: g */
                public boolean f1391g;

                /* JADX INFO: renamed from: h */
                public boolean f1392h;

                /* JADX INFO: renamed from: i */
                public String f1393i;

                /* JADX INFO: renamed from: j */
                public int f1394j;

                /* JADX INFO: renamed from: k */
                public CharSequence f1395k;

                /* JADX INFO: renamed from: l */
                public int f1396l;

                /* JADX INFO: renamed from: m */
                public CharSequence f1397m;

                /* JADX INFO: renamed from: n */
                public ArrayList f1398n;

                /* JADX INFO: renamed from: o */
                public ArrayList f1399o;

                /* JADX INFO: renamed from: p */
                public boolean f1400p;

                /* JADX INFO: renamed from: q */
                public final AbstractC0111w f1401q;

                /* JADX INFO: renamed from: r */
                public boolean f1402r;

                /* JADX INFO: renamed from: s */
                public int f1403s;

                public C0086a(AbstractC0111w abstractC0111w) {
/* 1 */             abstractC0111w.m684I();
/* 4 */             om0 om0Var = abstractC0111w.f1512v;
/* 6 */             if (om0Var != null) {
/* 10 */                om0Var.f14817b.getClassLoader();
                    }
/* 21 */            this.f1385a = new ArrayList();
/* 24 */            this.f1392h = true;
/* 27 */            this.f1400p = false;
/* 30 */            this.f1403s = -1;
/* 32 */            this.f1401q = abstractC0111w;
                }

                @Override // p000.tm0
                /* JADX INFO: renamed from: a */
                public final boolean mo635a(ArrayList arrayList, ArrayList arrayList2) {
/* 6 */             if (AbstractC0111w.m674K(2)) {
/* 8 */                 toString();
                    }
/* 11 */            arrayList.add(this);
/* 16 */            arrayList2.add(Boolean.FALSE);
/* 21 */            if (!this.f1391g) {
/* 30 */                return true;
                    }
/* 27 */            this.f1401q.f1494d.add(this);
/* 30 */            return true;
                }

                /* JADX INFO: renamed from: b */
                public final void m636b(dn0 dn0Var) {
/* 3 */             this.f1385a.add(dn0Var);
/* 8 */             dn0Var.f7328d = this.f1386b;
/* 12 */            dn0Var.f7329e = this.f1387c;
/* 16 */            dn0Var.f7330f = this.f1388d;
/* 20 */            dn0Var.f7331g = this.f1389e;
                }

                /* JADX INFO: renamed from: c */
                public final void m637c(int i) {
/* 3 */             if (this.f1391g) {
/* 11 */                if (AbstractC0111w.m674K(2)) {
/* 13 */                    toString();
                        }
/* 16 */                ArrayList arrayList = this.f1385a;
/* 18 */                int size = arrayList.size();
/* 23 */                for (int i2 = 0; i2 < size; i2++) {
/* 29 */                    dn0 dn0Var = (dn0) arrayList.get(i2);
/* 31 */                    Fragment fragment = dn0Var.f7326b;
/* 33 */                    if (fragment != null) {
/* 38 */                        fragment.mBackStackNesting += i;
/* 44 */                        if (AbstractC0111w.m674K(2)) {
/* 48 */                            Objects.toString(dn0Var.f7326b);
/* 53 */                            int i3 = dn0Var.f7326b.mBackStackNesting;
                                }
                            }
                        }
                    }
                }

                /* JADX INFO: renamed from: d */
                public final int m638d(boolean z) {
/* 3 */             if (this.f1402r) {
/* 62 */                f42.m3656l("commit already called");
/* 65 */                return 0;
                    }
/* 11 */            if (AbstractC0111w.m674K(2)) {
/* 13 */                toString();
/* 23 */                PrintWriter printWriter = new PrintWriter(new ga1());
/* 28 */                m640f("  ", printWriter, true);
/* 31 */                printWriter.close();
                    }
/* 34 */            this.f1402r = true;
/* 36 */            boolean z2 = this.f1391g;
/* 38 */            AbstractC0111w abstractC0111w = this.f1401q;
/* 40 */            if (z2) {
/* 48 */                this.f1403s = abstractC0111w.f1500j.getAndIncrement();
                    } else {
/* 52 */                this.f1403s = -1;
                    }
/* 54 */            abstractC0111w.m726x(this, z);
/* 57 */            return this.f1403s;
                }

                /* JADX INFO: renamed from: e */
                public final void m639e(int i, Fragment fragment, String str, int i2) {
/* 1 */             String str2 = fragment.mPreviousWho;
/* 3 */             if (str2 != null) {
/* 5 */                 bn0.m1398d(fragment, str2);
                    }
/* 8 */             Class<?> cls = fragment.getClass();
/* 12 */            int modifiers = cls.getModifiers();
/* 20 */            if (cls.isAnonymousClass() || !Modifier.isPublic(modifiers) || (cls.isMemberClass() && !Modifier.isStatic(modifiers))) {
/* 184 */               throw new IllegalStateException("Fragment " + cls.getCanonicalName() + " must be a public static class to be  properly recreated from instance state.");
                    }
/* 44 */            if (str != null) {
/* 46 */                String str3 = fragment.mTag;
/* 48 */                if (str3 != null && !str.equals(str3)) {
/* 61 */                    StringBuilder sb = new StringBuilder("Can't change tag of fragment ");
/* 64 */                    sb.append(fragment);
/* 67 */                    sb.append(": was ");
/* 76 */                    f42.m3656l(fm0.m3790p(sb, fragment.mTag, " now ", str));
/* 79 */                    return;
                        }
/* 80 */                fragment.mTag = str;
                    }
/* 82 */            if (i != 0) {
/* 85 */                if (i == -1) {
/* 139 */                   s80.m8426g("Can't add fragment ", fragment, " with tag ", str, " to container view with no id");
/* 142 */                   return;
                        }
/* 87 */                int i3 = fragment.mFragmentId;
/* 89 */                if (i3 != 0 && i3 != i) {
/* 100 */                   StringBuilder sb2 = new StringBuilder("Can't change container ID of fragment ");
/* 103 */                   sb2.append(fragment);
/* 106 */                   int i4 = fragment.mFragmentId;
/* 108 */                   sb2.append(": was ");
/* 111 */                   sb2.append(i4);
/* 114 */                   sb2.append(" now ");
/* 117 */                   sb2.append(i);
/* 127 */                   throw new IllegalStateException(sb2.toString());
                        }
/* 128 */               fragment.mFragmentId = i;
/* 130 */               fragment.mContainerId = i;
                    }
/* 148 */           m636b(new dn0(fragment, i2));
/* 153 */           fragment.mFragmentManager = this.f1401q;
                }

                /* JADX INFO: renamed from: f */
                public final void m640f(String str, PrintWriter printWriter, boolean z) {
                    String str2;
/* 1 */             if (z) {
/* 3 */                 printWriter.print(str);
/* 8 */                 printWriter.print("mName=");
/* 13 */                printWriter.print(this.f1393i);
/* 18 */                printWriter.print(" mIndex=");
/* 23 */                printWriter.print(this.f1403s);
/* 28 */                printWriter.print(" mCommitted=");
/* 33 */                printWriter.println(this.f1402r);
/* 38 */                if (this.f1390f != 0) {
/* 40 */                    printWriter.print(str);
/* 45 */                    printWriter.print("mTransition=#");
/* 54 */                    printWriter.print(Integer.toHexString(this.f1390f));
                        }
/* 59 */                if (this.f1386b != 0 || this.f1387c != 0) {
/* 65 */                    printWriter.print(str);
/* 70 */                    printWriter.print("mEnterAnim=#");
/* 79 */                    printWriter.print(Integer.toHexString(this.f1386b));
/* 84 */                    printWriter.print(" mExitAnim=#");
/* 93 */                    printWriter.println(Integer.toHexString(this.f1387c));
                        }
/* 98 */                if (this.f1388d != 0 || this.f1389e != 0) {
/* 104 */                   printWriter.print(str);
/* 109 */                   printWriter.print("mPopEnterAnim=#");
/* 118 */                   printWriter.print(Integer.toHexString(this.f1388d));
/* 123 */                   printWriter.print(" mPopExitAnim=#");
/* 132 */                   printWriter.println(Integer.toHexString(this.f1389e));
                        }
/* 137 */               if (this.f1394j != 0 || this.f1395k != null) {
/* 143 */                   printWriter.print(str);
/* 148 */                   printWriter.print("mBreadCrumbTitleRes=#");
/* 157 */                   printWriter.print(Integer.toHexString(this.f1394j));
/* 162 */                   printWriter.print(" mBreadCrumbTitleText=");
/* 167 */                   printWriter.println(this.f1395k);
                        }
/* 172 */               if (this.f1396l != 0 || this.f1397m != null) {
/* 178 */                   printWriter.print(str);
/* 183 */                   printWriter.print("mBreadCrumbShortTitleRes=#");
/* 192 */                   printWriter.print(Integer.toHexString(this.f1396l));
/* 197 */                   printWriter.print(" mBreadCrumbShortTitleText=");
/* 202 */                   printWriter.println(this.f1397m);
                        }
                    }
/* 205 */           ArrayList arrayList = this.f1385a;
/* 211 */           if (arrayList.isEmpty()) {
/* 401 */               return;
                    }
/* 213 */           printWriter.print(str);
/* 218 */           printWriter.println("Operations:");
/* 221 */           int size = arrayList.size();
/* 226 */           for (int i = 0; i < size; i++) {
/* 232 */               dn0 dn0Var = (dn0) arrayList.get(i);
                        switch (dn0Var.f7325a) {
                            case 0:
/* 286 */                       str2 = "NULL";
                                break;
                            case 1:
/* 283 */                       str2 = "ADD";
                                break;
                            case 2:
/* 280 */                       str2 = "REPLACE";
                                break;
                            case 3:
/* 277 */                       str2 = "REMOVE";
                                break;
                            case 4:
/* 274 */                       str2 = "HIDE";
                                break;
                            case 5:
/* 271 */                       str2 = "SHOW";
                                break;
                            case 6:
/* 268 */                       str2 = "DETACH";
                                break;
                            case 7:
/* 265 */                       str2 = "ATTACH";
                                break;
                            case 8:
/* 262 */                       str2 = "SET_PRIMARY_NAV";
                                break;
                            case 9:
/* 259 */                       str2 = "UNSET_PRIMARY_NAV";
                                break;
                            case 10:
/* 256 */                       str2 = "OP_SET_MAX_LIFECYCLE";
                                break;
                            default:
/* 251 */                       str2 = "cmd=" + dn0Var.f7325a;
                                break;
                        }
/* 288 */               printWriter.print(str);
/* 293 */               printWriter.print("  Op #");
/* 296 */               printWriter.print(i);
/* 301 */               printWriter.print(": ");
/* 304 */               printWriter.print(str2);
/* 309 */               printWriter.print(" ");
/* 314 */               printWriter.println(dn0Var.f7326b);
/* 317 */               if (z) {
/* 321 */                   if (dn0Var.f7328d != 0 || dn0Var.f7329e != 0) {
/* 327 */                       printWriter.print(str);
/* 332 */                       printWriter.print("enterAnim=#");
/* 341 */                       printWriter.print(Integer.toHexString(dn0Var.f7328d));
/* 346 */                       printWriter.print(" exitAnim=#");
/* 355 */                       printWriter.println(Integer.toHexString(dn0Var.f7329e));
                            }
/* 360 */                   if (dn0Var.f7330f != 0 || dn0Var.f7331g != 0) {
/* 366 */                       printWriter.print(str);
/* 371 */                       printWriter.print("popEnterAnim=#");
/* 380 */                       printWriter.print(Integer.toHexString(dn0Var.f7330f));
/* 385 */                       printWriter.print(" popExitAnim=#");
/* 394 */                       printWriter.println(Integer.toHexString(dn0Var.f7331g));
                            }
                        }
                    }
                }

                public final String toString() {
/* 5 */             StringBuilder sb = new StringBuilder(128);
/* 10 */            sb.append("BackStackEntry{");
/* 21 */            sb.append(Integer.toHexString(System.identityHashCode(this)));
/* 26 */            if (this.f1403s >= 0) {
/* 30 */                sb.append(" #");
/* 35 */                sb.append(this.f1403s);
                    }
/* 40 */            if (this.f1393i != null) {
/* 44 */                sb.append(" ");
/* 49 */                sb.append(this.f1393i);
                    }
/* 54 */            sb.append("}");
/* 57 */            return sb.toString();
                }
            }
