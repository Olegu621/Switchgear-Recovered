            package p000;

            import android.content.Context;
            import android.content.Intent;
            import android.content.pm.PackageInfo;
            import android.content.pm.PackageManager;
            import android.content.pm.ResolveInfo;
            import android.content.res.XmlResourceParser;
            import android.util.SparseArray;
            import androidx.constraintlayout.widget.C0077d;
            import androidx.constraintlayout.widget.ConstraintLayout;
            import io.sentry.android.core.AbstractC1245n0;
            import io.sentry.android.core.C1248o0;
            import java.io.IOException;
            import java.util.List;
            import org.xmlpull.v1.XmlPullParserException;
            
            /* JADX INFO: renamed from: sz */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 141 */   public final class C2199sz {

                /* JADX INFO: renamed from: a */
                public int f16873a;

                /* JADX INFO: renamed from: b */
                public int f16874b;

                /* JADX INFO: renamed from: c */
                public final Object f16875c;

                /* JADX INFO: renamed from: d */
                public Object f16876d;

                /* JADX INFO: renamed from: e */
                public Object f16877e;

                public C2199sz(Context context, ConstraintLayout constraintLayout, int i) {
                    String str;
/* 5 */             this.f16873a = -1;
/* 7 */             this.f16874b = -1;
/* 14 */            this.f16876d = new SparseArray();
/* 21 */            this.f16877e = new SparseArray();
/* 23 */            this.f16875c = constraintLayout;
/* 29 */            XmlResourceParser xml = context.getResources().getXml(i);
                    try {
/* 37 */                C2125qz c2125qz = null;
/* 39 */                for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
/* 41 */                    if (eventType == 0) {
/* 125 */                       xml.getName();
                            } else if (eventType == 2) {
/* 47 */                        String name = xml.getName();
                                switch (name.hashCode()) {
                                    case -1349929691:
/* 119 */                               if (name.equals("ConstraintSet")) {
/* 121 */                                   m8665e(context, xml);
                                        }
                                        break;
                                    case 80204913:
/* 96 */                                if (name.equals("State")) {
/* 100 */                                   c2125qz = new C2125qz(context, xml);
/* 109 */                                   ((SparseArray) this.f16876d).put(c2125qz.f15805a, c2125qz);
                                        }
                                        break;
                                    case 1382829617:
/* 87 */                                str = "StateSet";
/* 82 */                                name.equals(str);
                                        break;
                                    case 1657696882:
/* 80 */                                str = "layoutDescription";
/* 82 */                                name.equals(str);
                                        break;
                                    case 1901439077:
/* 65 */                                if (name.equals("Variant")) {
/* 69 */                                    C2162rz c2162rz = new C2162rz(context, xml);
/* 72 */                                    if (c2125qz != null) {
/* 76 */                                        c2125qz.f15806b.add(c2162rz);
                                            }
                                        }
                                        break;
                                }
                            }
                        }
                    } catch (IOException e) {
/* 134 */               e.printStackTrace();
                    } catch (XmlPullParserException e2) {
/* 139 */               e2.printStackTrace();
                    }
                }

                /* JADX INFO: renamed from: b */
                public static String m8661b(vi0 vi0Var) {
/* 1 */             vi0Var.m9274a();
/* 4 */             cj0 cj0Var = vi0Var.f18194c;
/* 6 */             String str = cj0Var.f2938e;
/* 8 */             if (str != null) {
/* 10 */                return str;
                    }
/* 11 */            vi0Var.m9274a();
/* 14 */            String str2 = cj0Var.f2935b;
/* 22 */            if (!str2.startsWith("1:")) {
/* 24 */                return str2;
                    }
/* 27 */            String[] strArrSplit = str2.split(":");
/* 34 */            if (strArrSplit.length < 2) {
/* 33 */                return null;
                    }
/* 38 */            String str3 = strArrSplit[1];
/* 44 */            if (str3.isEmpty()) {
/* 33 */                return null;
                    }
/* 47 */            return str3;
                }

                /* JADX INFO: renamed from: a */
                public synchronized String m8662a() {
                    try {
/* 6 */                 if (((String) this.f16876d) == null) {
/* 8 */                     m8666f();
                        }
                    } catch (Throwable th) {
/* 21 */                throw th;
                    }
/* 16 */            return (String) this.f16876d;
                }

                /* JADX INFO: renamed from: c */
                public PackageInfo m8663c(String str) {
                    try {
/* 10 */                return ((Context) this.f16875c).getPackageManager().getPackageInfo(str, 0);
                    } catch (PackageManager.NameNotFoundException e) {
/* 32 */                AbstractC1245n0.m4889q("FirebaseMessaging", "Failed to find package " + e);
/* 35 */                return null;
                    }
                }

                /* JADX WARN: Code duplicated, block: B:24:0x004c A[Catch: all -> 0x0027, TRY_ENTER, TryCatch #0 {, blocks: (B:3:0x0001, B:8:0x000a, B:10:0x001d, B:15:0x0029, B:17:0x002f, B:19:0x0041, B:21:0x0047, B:24:0x004c, B:26:0x005f, B:28:0x0065, B:31:0x006a, B:33:0x0077, B:35:0x007c, B:34:0x007a), top: B:42:0x0001 }] */
                /* JADX WARN: Code duplicated, block: B:31:0x006a A[Catch: all -> 0x0027, TRY_ENTER, TryCatch #0 {, blocks: (B:3:0x0001, B:8:0x000a, B:10:0x001d, B:15:0x0029, B:17:0x002f, B:19:0x0041, B:21:0x0047, B:24:0x004c, B:26:0x005f, B:28:0x0065, B:31:0x006a, B:33:0x0077, B:35:0x007c, B:34:0x007a), top: B:42:0x0001 }] */
                /* JADX WARN: Code duplicated, block: B:33:0x0077 A[Catch: all -> 0x0027, TryCatch #0 {, blocks: (B:3:0x0001, B:8:0x000a, B:10:0x001d, B:15:0x0029, B:17:0x002f, B:19:0x0041, B:21:0x0047, B:24:0x004c, B:26:0x005f, B:28:0x0065, B:31:0x006a, B:33:0x0077, B:35:0x007c, B:34:0x007a), top: B:42:0x0001 }] */
                /* JADX WARN: Code duplicated, block: B:34:0x007a A[Catch: all -> 0x0027, TryCatch #0 {, blocks: (B:3:0x0001, B:8:0x000a, B:10:0x001d, B:15:0x0029, B:17:0x002f, B:19:0x0041, B:21:0x0047, B:24:0x004c, B:26:0x005f, B:28:0x0065, B:31:0x006a, B:33:0x0077, B:35:0x007c, B:34:0x007a), top: B:42:0x0001 }] */
                /* JADX INFO: renamed from: d */
                public boolean m8664d() {
                    int i;
                    List<ResolveInfo> listQueryBroadcastReceivers;
                    synchronized (this) {
/* 2 */                 i = this.f16874b;
/* 6 */                 if (i == 0) {
/* 15 */                    PackageManager packageManager = ((Context) this.f16875c).getPackageManager();
/* 28 */                    if (packageManager.checkPermission("com.google.android.c2dm.permission.SEND", "com.google.android.gms") == -1) {
/* 34 */                        AbstractC1245n0.m4876d("FirebaseMessaging", "Google Play services missing or without correct permission.");
/* 38 */                        i = 0;
                            } else if (j13.m5650l()) {
/* 81 */                        Intent intent = new Intent("com.google.iid.TOKEN_REQUEST");
/* 86 */                        intent.setPackage("com.google.android.gms");
/* 89 */                        listQueryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent, 0);
/* 94 */                        if (listQueryBroadcastReceivers != null) {
/* 111 */                           AbstractC1245n0.m4889q("FirebaseMessaging", "Failed to resolve IID implementation package, falling back");
/* 118 */                           if (j13.m5650l()) {
/* 120 */                               this.f16874b = 2;
                                    } else {
/* 123 */                               this.f16874b = 1;
                                    }
/* 125 */                           i = this.f16874b;
                                } else {
/* 111 */                           AbstractC1245n0.m4889q("FirebaseMessaging", "Failed to resolve IID implementation package, falling back");
/* 118 */                           if (j13.m5650l()) {
/* 120 */                               this.f16874b = 2;
                                    } else {
/* 123 */                               this.f16874b = 1;
                                    }
/* 125 */                           i = this.f16874b;
                                }
                            } else {
/* 52 */                        Intent intent2 = new Intent("com.google.android.c2dm.intent.REGISTER");
/* 57 */                        intent2.setPackage("com.google.android.gms");
/* 60 */                        List<ResolveInfo> listQueryIntentServices = packageManager.queryIntentServices(intent2, 0);
/* 64 */                        if (listQueryIntentServices == null || listQueryIntentServices.size() <= 0) {
/* 81 */                            Intent intent3 = new Intent("com.google.iid.TOKEN_REQUEST");
/* 86 */                            intent3.setPackage("com.google.android.gms");
/* 89 */                            listQueryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent3, 0);
/* 94 */                            if (listQueryBroadcastReceivers != null || listQueryBroadcastReceivers.size() <= 0) {
/* 111 */                               AbstractC1245n0.m4889q("FirebaseMessaging", "Failed to resolve IID implementation package, falling back");
/* 118 */                               if (j13.m5650l()) {
/* 120 */                                   this.f16874b = 2;
                                        } else {
/* 123 */                                   this.f16874b = 1;
                                        }
/* 125 */                               i = this.f16874b;
                                    } else {
/* 102 */                               this.f16874b = 2;
/* 105 */                               i = 2;
                                    }
                                } else {
/* 72 */                            this.f16874b = 1;
/* 75 */                            i = 1;
                                }
                            }
                        }
                    }
                    return i != 0;
                }

                /* JADX INFO: renamed from: e */
                public void m8665e(Context context, XmlResourceParser xmlResourceParser) {
/* 3 */             C0077d c0077d = new C0077d();
/* 6 */             int attributeCount = xmlResourceParser.getAttributeCount();
/* 11 */            for (int i = 0; i < attributeCount; i++) {
/* 13 */                String attributeName = xmlResourceParser.getAttributeName(i);
/* 17 */                String attributeValue = xmlResourceParser.getAttributeValue(i);
/* 21 */                if (attributeName != null && attributeValue != null && "id".equals(attributeName)) {
/* 68 */                    int identifier = attributeValue.contains("/") ? context.getResources().getIdentifier(attributeValue.substring(attributeValue.indexOf(47) + 1), "id", context.getPackageName()) : -1;
/* 69 */                    if (identifier == -1) {
/* 75 */                        if (attributeValue.length() > 1) {
/* 81 */                            identifier = Integer.parseInt(attributeValue.substring(1));
                                } else {
/* 90 */                            AbstractC1245n0.m4876d("ConstraintLayoutStates", "error in parsing id");
                                }
                            }
/* 93 */                    c0077d.m543k(context, xmlResourceParser);
/* 100 */                   ((SparseArray) this.f16877e).put(identifier, c0077d);
/* 103 */                   return;
                        }
                    }
                }

                /* JADX INFO: renamed from: f */
                public synchronized void m8666f() {
/* 10 */            PackageInfo packageInfoM8663c = m8663c(((Context) this.f16875c).getPackageName());
/* 14 */            if (packageInfoM8663c != null) {
/* 22 */                this.f16876d = Integer.toString(packageInfoM8663c.versionCode);
/* 26 */                this.f16877e = packageInfoM8663c.versionName;
                    }
                }

/* 142 */       public C2199sz(Context context) {
/* 144 */           this.f16874b = 0;
/* 145 */           this.f16875c = context;
                }

/* 145 */       public C2199sz() {
/* 149 */           this.f16875c = new C1248o0();
                }
            }
