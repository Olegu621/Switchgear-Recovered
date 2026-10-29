            package p000;

            import android.app.Notification;
            import android.app.PendingIntent;
            import android.app.RemoteInput;
            import android.content.Context;
            import android.graphics.Bitmap;
            import android.graphics.PorterDuff;
            import android.net.Uri;
            import android.os.Build;
            import android.os.Bundle;
            import android.text.TextUtils;
            import androidx.core.app.NotificationCompat;
            import androidx.core.graphics.drawable.IconCompat;
            import java.util.ArrayList;
            import java.util.Iterator;
            import java.util.Set;
            import okhttp3.HttpUrl;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class po1 {

                /* JADX INFO: renamed from: a */
                public final Context f15201a;

                /* JADX INFO: renamed from: e */
                public CharSequence f15205e;

                /* JADX INFO: renamed from: f */
                public CharSequence f15206f;

                /* JADX INFO: renamed from: g */
                public PendingIntent f15207g;

                /* JADX INFO: renamed from: h */
                public IconCompat f15208h;

                /* JADX INFO: renamed from: i */
                public int f15209i;

                /* JADX INFO: renamed from: j */
                public int f15210j;

                /* JADX INFO: renamed from: l */
                public sq3 f15212l;

                /* JADX INFO: renamed from: m */
                public String f15213m;

                /* JADX INFO: renamed from: o */
                public Bundle f15215o;

                /* JADX INFO: renamed from: r */
                public String f15218r;

                /* JADX INFO: renamed from: s */
                public final boolean f15219s;

                /* JADX INFO: renamed from: t */
                public final Notification f15220t;

                /* JADX INFO: renamed from: u */
                public final ArrayList f15221u;

                /* JADX INFO: renamed from: b */
                public final ArrayList f15202b = new ArrayList();

                /* JADX INFO: renamed from: c */
                public final ArrayList f15203c = new ArrayList();

                /* JADX INFO: renamed from: d */
                public final ArrayList f15204d = new ArrayList();

                /* JADX INFO: renamed from: k */
                public boolean f15211k = true;

                /* JADX INFO: renamed from: n */
                public boolean f15214n = false;

                /* JADX INFO: renamed from: p */
                public int f15216p = 0;

                /* JADX INFO: renamed from: q */
                public int f15217q = 0;

                public po1(Context context, String str) {
/* 37 */            Notification notification = new Notification();
/* 40 */            this.f15220t = notification;
/* 42 */            this.f15201a = context;
/* 44 */            this.f15218r = str;
/* 50 */            notification.when = System.currentTimeMillis();
/* 53 */            notification.audioStreamType = -1;
/* 55 */            this.f15210j = 0;
/* 62 */            this.f15221u = new ArrayList();
/* 64 */            this.f15219s = true;
                }

                /* JADX INFO: renamed from: b */
                public static CharSequence m7524b(CharSequence charSequence) {
                    return (charSequence != null && charSequence.length() > 5120) ? charSequence.subSequence(0, 5120) : charSequence;
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX INFO: renamed from: a */
                public final Notification m7525a() {
                    String str;
                    ArrayList<xr1> arrayList;
                    Bundle extras;
                    Bundle[] bundleArr;
                    int i;
                    ArrayList arrayList2;
                    int i2;
/* 5 */             ra2 ra2Var = new ra2();
/* 10 */            new ArrayList();
/* 18 */            ra2Var.f15958d = new Bundle();
/* 20 */            ra2Var.f15957c = this;
/* 22 */            Context context = this.f15201a;
/* 24 */            ra2Var.f15955a = context;
/* 30 */            if (Build.VERSION.SDK_INT >= 26) {
/* 38 */                ra2Var.f15956b = uo1.m9048a(context, this.f15218r);
                    } else {
/* 46 */                ra2Var.f15956b = new Notification.Builder(context);
                    }
/* 50 */            Notification.Builder builder = (Notification.Builder) ra2Var.f15956b;
/* 52 */            Notification notification = this.f15220t;
/* 76 */            Context context2 = null;
/* 190 */           builder.setWhen(notification.when).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, null).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS).setOngoing((notification.flags & 2) != 0).setOnlyAlertOnce((notification.flags & 8) != 0).setAutoCancel((notification.flags & 16) != 0).setDefaults(notification.defaults).setContentTitle(this.f15205e).setContentText(this.f15206f).setContentInfo(null).setContentIntent(this.f15207g).setDeleteIntent(notification.deleteIntent).setFullScreenIntent(null, (notification.flags & 128) != 0).setNumber(this.f15209i).setProgress(0, 0, false);
/* 195 */           Notification.Builder builder2 = (Notification.Builder) ra2Var.f15956b;
/* 197 */           IconCompat iconCompat = this.f15208h;
/* 207 */           so1.m8588b(builder2, iconCompat == null ? null : gv0.m4023g(iconCompat, context));
/* 224 */           ((Notification.Builder) ra2Var.f15956b).setSubText(null).setUsesChronometer(false).setPriority(this.f15210j);
/* 229 */           Iterator it = this.f15202b.iterator();
                    while (true) {
/* 237 */               str = "android.support.allowGeneratedReplies";
/* 243 */               if (!it.hasNext()) {
                            break;
                        }
/* 249 */               yn1 yn1Var = (yn1) it.next();
/* 253 */               if (yn1Var.f19715b == null && (i2 = yn1Var.f19721h) != 0) {
/* 263 */                   yn1Var.f19715b = IconCompat.m586b(i2, HttpUrl.FRAGMENT_ENCODE_SET);
                        }
/* 265 */               IconCompat iconCompat2 = yn1Var.f19715b;
/* 267 */               int i3 = yn1Var.f19719f;
/* 269 */               boolean z = yn1Var.f19717d;
/* 271 */               Bundle bundle = yn1Var.f19714a;
/* 285 */               Notification.Action.Builder builderM8587a = so1.m8587a(iconCompat2 != null ? gv0.m4023g(iconCompat2, context2) : context2, yn1Var.f19722i, yn1Var.f19723j);
/* 289 */               g32[] g32VarArr = yn1Var.f19716c;
/* 291 */               if (g32VarArr != null) {
/* 293 */                   int length = g32VarArr.length;
/* 294 */                   RemoteInput[] remoteInputArr = new RemoteInput[length];
/* 298 */                   for (int i4 = 0; i4 < g32VarArr.length; i4++) {
/* 306 */                       remoteInputArr[i4] = g32.m3868a(g32VarArr[i4]);
                            }
/* 312 */                   for (int i5 = 0; i5 < length; i5++) {
/* 316 */                       qo1.m7958c(builderM8587a, remoteInputArr[i5]);
                            }
                        }
/* 332 */               Bundle bundle2 = bundle != null ? new Bundle(bundle) : new Bundle();
/* 335 */               bundle2.putBoolean("android.support.allowGeneratedReplies", z);
/* 338 */               to1.m8816a(builderM8587a, z);
/* 343 */               bundle2.putInt("android.support.action.semanticAction", i3);
/* 346 */               int i6 = Build.VERSION.SDK_INT;
/* 348 */               if (i6 >= 28) {
/* 350 */                   vo1.m9307b(builderM8587a, i3);
                        }
/* 355 */               if (i6 >= 29) {
/* 359 */                   wo1.m9591c(builderM8587a, yn1Var.f19720g);
                        }
/* 364 */               if (i6 >= 31) {
/* 368 */                   xo1.m10009a(builderM8587a, yn1Var.f19724k);
                        }
/* 375 */               bundle2.putBoolean("android.support.action.showsUserInterface", yn1Var.f19718e);
/* 378 */               qo1.m7957b(builderM8587a, bundle2);
/* 389 */               qo1.m7956a((Notification.Builder) ra2Var.f15956b, qo1.m7959d(builderM8587a));
/* 394 */               context2 = null;
                    }
/* 398 */           Bundle bundle3 = this.f15215o;
/* 400 */           if (bundle3 != null) {
/* 406 */               ((Bundle) ra2Var.f15958d).putAll(bundle3);
                    }
/* 415 */           ((Notification.Builder) ra2Var.f15956b).setShowWhen(this.f15211k);
/* 424 */           qo1.m7964i((Notification.Builder) ra2Var.f15956b, this.f15214n);
/* 433 */           qo1.m7962g((Notification.Builder) ra2Var.f15956b, this.f15213m);
/* 441 */           qo1.m7965j((Notification.Builder) ra2Var.f15956b, null);
/* 449 */           qo1.m7963h((Notification.Builder) ra2Var.f15956b, false);
/* 456 */           ro1.m8216b((Notification.Builder) ra2Var.f15956b, null);
/* 465 */           ro1.m8217c((Notification.Builder) ra2Var.f15956b, this.f15216p);
/* 474 */           ro1.m8220f((Notification.Builder) ra2Var.f15956b, this.f15217q);
/* 481 */           ro1.m8218d((Notification.Builder) ra2Var.f15956b, null);
/* 492 */           ro1.m8219e((Notification.Builder) ra2Var.f15956b, notification.sound, notification.audioAttributes);
/* 495 */           int i7 = Build.VERSION.SDK_INT;
/* 497 */           ArrayList arrayList3 = this.f15221u;
/* 499 */           ArrayList<xr1> arrayList4 = this.f15203c;
/* 501 */           if (i7 < 28) {
/* 503 */               if (arrayList4 == null) {
/* 505 */                   arrayList2 = null;
                        } else {
/* 513 */                   arrayList2 = new ArrayList(arrayList4.size());
/* 524 */                   for (xr1 xr1Var : arrayList4) {
/* 532 */                       CharSequence charSequence = xr1Var.f19333a;
/* 534 */                       String str2 = xr1Var.f19335c;
/* 536 */                       if (str2 == null) {
/* 556 */                           str2 = charSequence != null ? "name:" + ((Object) charSequence) : HttpUrl.FRAGMENT_ENCODE_SET;
                                }
/* 557 */                       arrayList2.add(str2);
                            }
                        }
/* 561 */               if (arrayList2 != null) {
/* 564 */                   if (arrayList3 == null) {
/* 566 */                       arrayList3 = arrayList2;
                            } else {
/* 579 */                       C1827kd c1827kd = new C1827kd(arrayList3.size() + arrayList2.size());
/* 582 */                       c1827kd.addAll(arrayList2);
/* 585 */                       c1827kd.addAll(arrayList3);
/* 590 */                       arrayList3 = new ArrayList(c1827kd);
                            }
                        }
                    }
/* 593 */           if (arrayList3 != null && !arrayList3.isEmpty()) {
/* 601 */               Iterator it2 = arrayList3.iterator();
/* 609 */               while (it2.hasNext()) {
/* 621 */                   ro1.m8215a((Notification.Builder) ra2Var.f15956b, (String) it2.next());
                        }
                    }
/* 625 */           ArrayList arrayList5 = this.f15204d;
/* 631 */           if (arrayList5.size() > 0) {
/* 635 */               if (this.f15215o == null) {
/* 642 */                   this.f15215o = new Bundle();
                        }
/* 648 */               Bundle bundle4 = this.f15215o.getBundle("android.car.EXTENSIONS");
/* 652 */               if (bundle4 == null) {
/* 656 */                   bundle4 = new Bundle();
                        }
/* 661 */               Bundle bundle5 = new Bundle(bundle4);
/* 666 */               Bundle bundle6 = new Bundle();
/* 669 */               int i8 = 0;
/* 674 */               while (i8 < arrayList5.size()) {
/* 676 */                   String string = Integer.toString(i8);
/* 684 */                   yn1 yn1Var2 = (yn1) arrayList5.get(i8);
/* 688 */                   Bundle bundle7 = new Bundle();
/* 693 */                   if (yn1Var2.f19715b == null && (i = yn1Var2.f19721h) != 0) {
/* 703 */                       yn1Var2.f19715b = IconCompat.m586b(i, HttpUrl.FRAGMENT_ENCODE_SET);
                            }
/* 705 */                   IconCompat iconCompat3 = yn1Var2.f19715b;
/* 707 */                   Bundle bundle8 = yn1Var2.f19714a;
/* 715 */                   ArrayList arrayList6 = arrayList5;
/* 722 */                   bundle7.putInt("icon", iconCompat3 != null ? iconCompat3.m587c() : 0);
/* 729 */                   bundle7.putCharSequence("title", yn1Var2.f19722i);
/* 736 */                   bundle7.putParcelable("actionIntent", yn1Var2.f19723j);
/* 749 */                   Bundle bundle9 = bundle8 != null ? new Bundle(bundle8) : new Bundle();
/* 754 */                   bundle9.putBoolean(str, yn1Var2.f19717d);
/* 759 */                   bundle7.putBundle("extras", bundle9);
/* 762 */                   g32[] g32VarArr2 = yn1Var2.f19716c;
/* 764 */                   if (g32VarArr2 == null) {
/* 770 */                       bundleArr = null;
                            } else {
/* 776 */                       bundleArr = new Bundle[g32VarArr2.length];
/* 782 */                       int i9 = 0;
/* 784 */                       while (i9 < g32VarArr2.length) {
/* 786 */                           g32 g32Var = g32VarArr2[i9];
/* 788 */                           g32[] g32VarArr3 = g32VarArr2;
/* 792 */                           Bundle bundle10 = new Bundle();
/* 795 */                           int i10 = i9;
/* 799 */                           int i11 = i8;
/* 803 */                           bundle10.putString("resultKey", g32Var.f8451a);
/* 810 */                           bundle10.putCharSequence("label", g32Var.f8452b);
/* 817 */                           bundle10.putCharSequenceArray("choices", g32Var.f8453c);
/* 824 */                           bundle10.putBoolean("allowFreeFormInput", g32Var.f8454d);
/* 829 */                           bundle10.putBundle("extras", g32Var.f8456f);
/* 832 */                           Set set = g32Var.f8457g;
/* 834 */                           if (set != null && !set.isEmpty()) {
/* 848 */                               ArrayList<String> arrayList7 = new ArrayList<>(set.size());
/* 851 */                               Iterator it3 = set.iterator();
/* 859 */                               while (it3.hasNext()) {
/* 867 */                                   arrayList7.add((String) it3.next());
                                        }
/* 873 */                               bundle10.putStringArrayList("allowedDataTypes", arrayList7);
                                    }
/* 876 */                           bundleArr[i10] = bundle10;
/* 878 */                           i9 = i10 + 1;
/* 880 */                           g32VarArr2 = g32VarArr3;
/* 882 */                           i8 = i11;
                                }
                            }
/* 771 */                   int i12 = i8;
/* 887 */                   bundle7.putParcelableArray("remoteInputs", bundleArr);
/* 894 */                   bundle7.putBoolean("showsUserInterface", yn1Var2.f19718e);
/* 901 */                   bundle7.putInt("semanticAction", yn1Var2.f19719f);
/* 904 */                   bundle6.putBundle(string, bundle7);
/* 907 */                   i8 = i12 + 1;
/* 909 */                   arrayList5 = arrayList6;
/* 911 */                   arrayList4 = arrayList4;
/* 913 */                   str = str;
                        }
/* 919 */               arrayList = arrayList4;
/* 923 */               bundle4.putBundle("invisible_actions", bundle6);
/* 926 */               bundle5.putBundle("invisible_actions", bundle6);
/* 931 */               if (this.f15215o == null) {
/* 938 */                   this.f15215o = new Bundle();
                        }
/* 942 */               this.f15215o.putBundle("android.car.EXTENSIONS", bundle4);
/* 949 */               ((Bundle) ra2Var.f15958d).putBundle("android.car.EXTENSIONS", bundle5);
                    } else {
/* 953 */               arrayList = arrayList4;
                    }
/* 961 */           ((Notification.Builder) ra2Var.f15956b).setExtras(this.f15215o);
/* 969 */           to1.m8820e((Notification.Builder) ra2Var.f15956b, null);
/* 972 */           int i13 = Build.VERSION.SDK_INT;
/* 976 */           if (i13 >= 26) {
/* 983 */               uo1.m9049b((Notification.Builder) ra2Var.f15956b, 0);
/* 990 */               uo1.m9052e((Notification.Builder) ra2Var.f15956b, null);
/* 997 */               uo1.m9053f((Notification.Builder) ra2Var.f15956b, null);
/* 1006 */              uo1.m9054g((Notification.Builder) ra2Var.f15956b, 0L);
/* 1014 */              uo1.m9051d((Notification.Builder) ra2Var.f15956b, 0);
/* 1023 */              if (!TextUtils.isEmpty(this.f15218r)) {
/* 1042 */                  ((Notification.Builder) ra2Var.f15956b).setSound(null).setDefaults(0).setLights(0, 0, 0).setVibrate(null);
                        }
                    }
/* 1047 */          if (i13 >= 28) {
/* 1057 */              for (xr1 xr1Var2 : arrayList) {
/* 1067 */                  Notification.Builder builder3 = (Notification.Builder) ra2Var.f15956b;
/* 1069 */                  xr1Var2.getClass();
/* 1076 */                  vo1.m9306a(builder3, wr1.m9609b(xr1Var2));
                        }
                    }
/* 1084 */          if (Build.VERSION.SDK_INT >= 29) {
/* 1092 */              wo1.m9589a((Notification.Builder) ra2Var.f15956b, this.f15219s);
/* 1100 */              wo1.m9590b((Notification.Builder) ra2Var.f15956b, null);
                    }
/* 1105 */          po1 po1Var = (po1) ra2Var.f15957c;
/* 1107 */          sq3 sq3Var = po1Var.f15212l;
/* 1109 */          if (sq3Var != null) {
/* 1111 */              sq3Var.mo5529g(ra2Var);
                    }
/* 1114 */          int i14 = Build.VERSION.SDK_INT;
/* 1118 */          Notification.Builder builder4 = (Notification.Builder) ra2Var.f15956b;
/* 1129 */          Notification notificationBuild = i14 >= 26 ? builder4.build() : builder4.build();
/* 1133 */          if (sq3Var != null) {
/* 1137 */              po1Var.f15212l.getClass();
                    }
/* 1140 */          if (sq3Var != null && (extras = NotificationCompat.getExtras(notificationBuild)) != null) {
/* 1154 */              extras.putString(NotificationCompat.EXTRA_COMPAT_TEMPLATE, sq3Var.mo5530i());
                    }
/* 1157 */          return notificationBuild;
                }

                /* JADX INFO: renamed from: c */
                public final void m7526c(boolean z) {
/* 1 */             Notification notification = this.f15220t;
/* 3 */             if (z) {
/* 9 */                 notification.flags |= 16;
                    } else {
/* 16 */                notification.flags &= -17;
                    }
                }

                /* JADX INFO: renamed from: d */
                public final void m7527d(int i) {
/* 1 */             Notification notification = this.f15220t;
/* 3 */             notification.defaults = i;
/* 7 */             if ((i & 4) != 0) {
/* 13 */                notification.flags |= 1;
                    }
                }

                /* JADX INFO: renamed from: e */
                public final void m7528e(Bitmap bitmap) {
                    IconCompat iconCompat;
/* 1 */             if (bitmap == null) {
/* 3 */                 iconCompat = null;
                    } else {
/* 7 */                 Bitmap bitmapReduceLargeIconSize = NotificationCompat.reduceLargeIconSize(this.f15201a, bitmap);
/* 11 */                PorterDuff.Mode mode = IconCompat.f1245k;
/* 13 */                bitmapReduceLargeIconSize.getClass();
/* 19 */                IconCompat iconCompat2 = new IconCompat(1);
/* 22 */                iconCompat2.f1247b = bitmapReduceLargeIconSize;
/* 24 */                iconCompat = iconCompat2;
                    }
/* 25 */            this.f15208h = iconCompat;
                }

                /* JADX INFO: renamed from: f */
                public final void m7529f(Uri uri) {
/* 1 */             Notification notification = this.f15220t;
/* 3 */             notification.sound = uri;
/* 6 */             notification.audioStreamType = -1;
/* 26 */            notification.audioAttributes = oo1.m7218a(oo1.m7222e(oo1.m7220c(oo1.m7219b(), 4), 5));
                }

                /* JADX INFO: renamed from: g */
                public final void m7530g(sq3 sq3Var) {
/* 3 */             if (this.f15212l != sq3Var) {
/* 5 */                 this.f15212l = sq3Var;
/* 11 */                if (((po1) sq3Var.f16749a) != this) {
/* 13 */                    sq3Var.f16749a = this;
/* 15 */                    m7530g(sq3Var);
                        }
                    }
                }
            }
