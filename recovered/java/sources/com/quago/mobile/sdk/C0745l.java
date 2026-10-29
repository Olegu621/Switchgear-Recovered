            package com.quago.mobile.sdk;

            import com.google.firebase.analytics.FirebaseAnalytics;
            import com.pichillilorenzo.flutter_inappwebview_android.credential_database.URLProtectionSpaceContract;
            import java.util.ArrayList;
            import java.util.LinkedList;
            import java.util.TreeMap;
            import p000.AbstractC0886en;
            
            /* JADX INFO: renamed from: com.quago.mobile.sdk.l */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 996 */   public final class C0745l {

                /* JADX INFO: renamed from: A */
                public int f5512A;

                /* JADX INFO: renamed from: B */
                public boolean f5513B;

                /* JADX INFO: renamed from: C */
                public LinkedList f5514C;

                /* JADX INFO: renamed from: D */
                public LinkedList f5515D;

                /* JADX INFO: renamed from: E */
                public LinkedList f5516E;

                /* JADX INFO: renamed from: F */
                public LinkedList f5517F;

                /* JADX INFO: renamed from: G */
                public LinkedList f5518G;

                /* JADX INFO: renamed from: H */
                public LinkedList f5519H;

                /* JADX INFO: renamed from: I */
                public LinkedList f5520I;

                /* JADX INFO: renamed from: J */
                public LinkedList f5521J;

                /* JADX INFO: renamed from: K */
                public LinkedList f5522K;

                /* JADX INFO: renamed from: L */
                public LinkedList f5523L;

                /* JADX INFO: renamed from: M */
                public LinkedList f5524M;

                /* JADX INFO: renamed from: N */
                public LinkedList f5525N;

                /* JADX INFO: renamed from: O */
                public LinkedList f5526O;

                /* JADX INFO: renamed from: P */
                public LinkedList f5527P;

                /* JADX INFO: renamed from: a */
                public String f5528a;

                /* JADX INFO: renamed from: b */
                public String f5529b;

                /* JADX INFO: renamed from: c */
                public String f5530c;

                /* JADX INFO: renamed from: d */
                public int f5531d;

                /* JADX INFO: renamed from: e */
                public String f5532e;

                /* JADX INFO: renamed from: f */
                public String f5533f;

                /* JADX INFO: renamed from: g */
                public String f5534g;

                /* JADX INFO: renamed from: h */
                public String f5535h;

                /* JADX INFO: renamed from: i */
                public String f5536i;

                /* JADX INFO: renamed from: j */
                public String f5537j;

                /* JADX INFO: renamed from: k */
                public String f5538k;

                /* JADX INFO: renamed from: l */
                public String f5539l;

                /* JADX INFO: renamed from: m */
                public int f5540m;

                /* JADX INFO: renamed from: n */
                public int f5541n;

                /* JADX INFO: renamed from: o */
                public int f5542o;

                /* JADX INFO: renamed from: p */
                public int f5543p;

                /* JADX INFO: renamed from: q */
                public long f5544q;

                /* JADX INFO: renamed from: r */
                public long f5545r;

                /* JADX INFO: renamed from: s */
                public C0754p0 f5546s;

                /* JADX INFO: renamed from: t */
                public C0735h1 f5547t;

                /* JADX INFO: renamed from: u */
                public int f5548u;

                /* JADX INFO: renamed from: v */
                public int f5549v;

                /* JADX INFO: renamed from: w */
                public int f5550w;

                /* JADX INFO: renamed from: x */
                public int f5551x;

                /* JADX INFO: renamed from: y */
                public C0712a f5552y;

                /* JADX INFO: renamed from: z */
                public ArrayList f5553z;

                /* JADX INFO: renamed from: a */
                public final TreeMap m2623a() {
/* 3 */             TreeMap treeMap = new TreeMap();
/* 10 */            treeMap.put("app_token", this.f5528a);
/* 17 */            treeMap.put("user_id", this.f5529b);
/* 24 */            treeMap.put("additional_id", this.f5530c);
/* 34 */            treeMap.put("platform", 1);
/* 45 */            treeMap.put("wrapper", Integer.valueOf(this.f5531d));
/* 52 */            treeMap.put("wrapper_version", this.f5532e);
/* 59 */            treeMap.put("seg_name", this.f5533f);
/* 66 */            treeMap.put("seg_id", this.f5534g);
/* 73 */            treeMap.put("session_id", this.f5535h);
/* 80 */            treeMap.put("app_package_name", this.f5536i);
/* 87 */            treeMap.put("app_version_name", this.f5537j);
/* 94 */            treeMap.put("app_version_code", this.f5538k);
/* 101 */           treeMap.put("sdk_version_name", this.f5539l);
/* 112 */           treeMap.put("seg_count", Integer.valueOf(this.f5540m));
/* 123 */           treeMap.put("user_seg_count", Integer.valueOf(this.f5541n));
/* 134 */           treeMap.put("mode", Integer.valueOf(this.f5542o));
/* 145 */           treeMap.put("flavor", Integer.valueOf(this.f5543p));
/* 156 */           treeMap.put("active_sensors", Long.valueOf(this.f5544q));
/* 167 */           treeMap.put("supported_sensors", Long.valueOf(this.f5545r));
/* 170 */           C0754p0 c0754p0 = this.f5546s;
/* 172 */           c0754p0.getClass();
/* 177 */           TreeMap treeMap2 = new TreeMap();
/* 180 */           C0722d0 c0722d0 = c0754p0.f5607a;
/* 182 */           c0722d0.getClass();
/* 187 */           TreeMap treeMap3 = new TreeMap();
/* 194 */           treeMap3.put("board", c0722d0.f5374a);
/* 201 */           treeMap3.put("bootloader", c0722d0.f5375b);
/* 208 */           treeMap3.put("brand", c0722d0.f5376c);
/* 215 */           treeMap3.put("cpu_abi", c0722d0.f5377d);
/* 222 */           treeMap3.put("cpu_abi2", c0722d0.f5378e);
/* 229 */           treeMap3.put("device", c0722d0.f5379f);
/* 236 */           treeMap3.put("display", c0722d0.f5380g);
/* 243 */           treeMap3.put("fingerprint", c0722d0.f5381h);
/* 250 */           treeMap3.put("hardware", c0722d0.f5382i);
/* 257 */           treeMap3.put(URLProtectionSpaceContract.FeedEntry.COLUMN_NAME_HOST, c0722d0.f5383j);
/* 264 */           treeMap3.put("id", c0722d0.f5384k);
/* 271 */           treeMap3.put("manufacturer", c0722d0.f5385l);
/* 278 */           treeMap3.put("model", c0722d0.f5386m);
/* 285 */           treeMap3.put("product", c0722d0.f5387n);
/* 292 */           treeMap3.put("radio", c0722d0.f5388o);
/* 299 */           treeMap3.put("tags", c0722d0.f5389p);
/* 306 */           treeMap3.put("type", c0722d0.f5390q);
/* 313 */           treeMap3.put("user", c0722d0.f5391r);
/* 320 */           treeMap3.put("supported_32_bit_abis", c0722d0.f5392s);
/* 327 */           treeMap3.put("supported_64_bit_abis", c0722d0.f5393t);
/* 334 */           treeMap3.put("supported_abis", c0722d0.f5394u);
/* 345 */           treeMap3.put("time", Long.valueOf(c0722d0.f5395v));
/* 350 */           treeMap2.put("build", treeMap3);
/* 353 */           C0723d1 c0723d1 = c0754p0.f5608b;
/* 355 */           c0723d1.getClass();
/* 360 */           TreeMap treeMap4 = new TreeMap();
/* 367 */           treeMap4.put("base_os", c0723d1.f5397a);
/* 374 */           treeMap4.put("codename", c0723d1.f5398b);
/* 381 */           treeMap4.put("incremental", c0723d1.f5399c);
/* 388 */           treeMap4.put("release", c0723d1.f5400d);
/* 395 */           treeMap4.put("security_patch", c0723d1.f5401e);
/* 406 */           treeMap4.put("preview_sdk_int", Integer.valueOf(c0723d1.f5402f));
/* 417 */           treeMap4.put("sdk_int", Integer.valueOf(c0723d1.f5403g));
/* 422 */           treeMap2.put("version", treeMap4);
/* 425 */           C0773z0 c0773z0 = c0754p0.f5609c;
/* 427 */           c0773z0.getClass();
/* 432 */           TreeMap treeMap5 = new TreeMap();
/* 439 */           treeMap5.put("android_id", c0773z0.f5688a);
/* 446 */           treeMap5.put("bluetooth_on", c0773z0.f5689b);
/* 457 */           treeMap5.put("rooted", Boolean.valueOf(c0773z0.f5690c));
/* 462 */           treeMap2.put("security", treeMap5);
/* 465 */           C0734h0 c0734h0 = c0754p0.f5610d;
/* 467 */           c0734h0.getClass();
/* 472 */           TreeMap treeMap6 = new TreeMap();
/* 483 */           treeMap6.put("flags", Long.valueOf(c0734h0.f5447a));
/* 494 */           treeMap6.put("num_cores", Integer.valueOf(c0734h0.f5448b));
/* 505 */           treeMap6.put("elf_machine", Integer.valueOf(c0734h0.f5449c));
/* 512 */           treeMap6.put("jre_bitness", c0734h0.f5450d);
/* 519 */           treeMap6.put("total_memory", c0734h0.f5451e);
/* 526 */           treeMap6.put("cpu_vendor", c0734h0.f5452f);
/* 533 */           treeMap6.put("gles_code", c0734h0.f5454h);
/* 540 */           treeMap6.put("gles_vendor", c0734h0.f5455i);
/* 547 */           treeMap6.put("gles_version", c0734h0.f5456j);
/* 554 */           treeMap6.put("gles_renderer", c0734h0.f5457k);
/* 565 */           treeMap6.put("duration_millis", Long.valueOf(c0734h0.f5453g));
/* 570 */           treeMap2.put("emulation", treeMap6);
/* 575 */           LinkedList linkedList = new LinkedList();
/* 588 */           for (C0737i0 c0737i0 : c0754p0.f5611e) {
/* 596 */               c0737i0.getClass();
/* 601 */               TreeMap treeMap7 = new TreeMap();
/* 612 */               treeMap7.put("device_id", Integer.valueOf(c0737i0.f5480a));
/* 623 */               treeMap7.put(FirebaseAnalytics.Param.SOURCE, Integer.valueOf(c0737i0.f5481b));
/* 634 */               treeMap7.put("keyboard_type", Integer.valueOf(c0737i0.f5482c));
/* 645 */               treeMap7.put("vendor_id", Integer.valueOf(c0737i0.f5483d));
/* 656 */               treeMap7.put("controller_num", Integer.valueOf(c0737i0.f5484e));
/* 667 */               treeMap7.put("product_id", Integer.valueOf(c0737i0.f5485f));
/* 674 */               treeMap7.put("name", c0737i0.f5486g);
/* 681 */               treeMap7.put("virtual", c0737i0.f5487h);
/* 688 */               treeMap7.put("external", c0737i0.f5488i);
/* 691 */               linkedList.add(treeMap7);
                    }
/* 697 */           treeMap2.put("input_devices", linkedList);
/* 704 */           treeMap2.put("input_devices_motion", c0754p0.f5612f);
/* 711 */           treeMap2.put("input_devices_keys", c0754p0.f5613g);
/* 716 */           treeMap.put("meta_android", treeMap2);
/* 719 */           C0735h1 c0735h1 = this.f5547t;
/* 721 */           c0735h1.getClass();
/* 726 */           TreeMap treeMap8 = new TreeMap();
/* 737 */           treeMap8.put("ts_start", Long.valueOf(c0735h1.f5458a));
/* 748 */           treeMap8.put("ts_end", Long.valueOf(c0735h1.f5459b));
/* 759 */           treeMap8.put("uptime_start", Long.valueOf(c0735h1.f5460c));
/* 770 */           treeMap8.put("uptime_end", Long.valueOf(c0735h1.f5461d));
/* 781 */           treeMap8.put("ts_sdk_init", Long.valueOf(c0735h1.f5462e));
/* 786 */           treeMap.put("times", treeMap8);
/* 797 */           treeMap.put("screen_width", Integer.valueOf(this.f5548u));
/* 808 */           treeMap.put("screen_height", Integer.valueOf(this.f5549v));
/* 819 */           treeMap.put("app_width", Integer.valueOf(this.f5550w));
/* 830 */           treeMap.put("app_height", Integer.valueOf(this.f5551x));
/* 833 */           C0712a c0712a = this.f5552y;
/* 835 */           c0712a.getClass();
/* 840 */           TreeMap treeMap9 = new TreeMap();
/* 851 */           treeMap9.put("xdpi", Float.valueOf(c0712a.f5344a));
/* 862 */           treeMap9.put("ydpi", Float.valueOf(c0712a.f5345b));
/* 867 */           treeMap.put("resolution_android", treeMap9);
/* 874 */           treeMap.put("key_values", this.f5553z);
/* 885 */           treeMap.put("prompt", Integer.valueOf(this.f5512A));
/* 896 */           treeMap.put("is_new", Boolean.valueOf(this.f5513B));
/* 903 */           treeMap.put("seq_life", this.f5514C);
/* 910 */           treeMap.put("seq_motion", this.f5515D);
/* 917 */           treeMap.put("seq_key", this.f5516E);
/* 924 */           treeMap.put("seq_acc", this.f5517F);
/* 931 */           treeMap.put("seq_mag", this.f5518G);
/* 938 */           treeMap.put("seq_gyro", this.f5519H);
/* 945 */           treeMap.put("seq_geomag", this.f5520I);
/* 952 */           treeMap.put("seq_prox", this.f5521J);
/* 959 */           treeMap.put("seq_light", this.f5522K);
/* 966 */           treeMap.put("seq_pressure", this.f5523L);
/* 973 */           treeMap.put("seq_temp", this.f5524M);
/* 980 */           treeMap.put("seq_step", this.f5525N);
/* 987 */           treeMap.put("seq_resolution", this.f5526O);
/* 994 */           treeMap.put("seq_battery", this.f5527P);
/* 997 */           return treeMap;
                }

                public final String toString() {
/* 3 */             StringBuilder sbM3512p = AbstractC0886en.m3512p("name = ");
/* 9 */             sbM3512p.append(this.f5533f);
/* 14 */            sbM3512p.append("\nappToken = ");
/* 19 */            sbM3512p.append(this.f5528a);
/* 24 */            sbM3512p.append("\nsessionId = ");
/* 29 */            sbM3512p.append(this.f5535h);
/* 34 */            sbM3512p.append("\nuserId = ");
/* 39 */            sbM3512p.append(this.f5529b);
/* 44 */            sbM3512p.append("\nmatchingId = ");
/* 49 */            sbM3512p.append(this.f5530c);
/* 54 */            sbM3512p.append("\nmapKeyValues = ");
/* 59 */            sbM3512p.append(this.f5553z);
/* 64 */            sbM3512p.append("\ntimes = ");
/* 69 */            sbM3512p.append(this.f5547t);
/* 74 */            sbM3512p.append("\nplatform = 1\nindex = ");
/* 79 */            sbM3512p.append(this.f5540m);
/* 84 */            sbM3512p.append("\nmode = ");
/* 89 */            sbM3512p.append(this.f5542o);
/* 94 */            sbM3512p.append("\nflavor = ");
/* 103 */           sbM3512p.append(QuagoSettings.QuagoFlavor.valueOf(this.f5543p));
/* 108 */           sbM3512p.append("\nindicator = ");
/* 113 */           sbM3512p.append(this.f5544q);
/* 118 */           sbM3512p.append("\nresolutionData = ");
/* 123 */           sbM3512p.append(this.f5552y);
/* 128 */           sbM3512p.append("\nmetaData = ");
/* 133 */           sbM3512p.append(this.f5546s);
/* 138 */           sbM3512p.append("\nseq_life = ");
/* 143 */           m2622a(sbM3512p, this.f5514C);
/* 148 */           sbM3512p.append("seq_motion = ");
/* 153 */           m2622a(sbM3512p, this.f5515D);
/* 158 */           sbM3512p.append("seq_key = ");
/* 163 */           m2622a(sbM3512p, this.f5516E);
/* 168 */           sbM3512p.append("seq_acc = ");
/* 173 */           m2622a(sbM3512p, this.f5517F);
/* 178 */           sbM3512p.append("seq_mag = ");
/* 183 */           m2622a(sbM3512p, this.f5518G);
/* 188 */           sbM3512p.append("seq_gyro = ");
/* 193 */           m2622a(sbM3512p, this.f5519H);
/* 198 */           sbM3512p.append("Gseq_geomagRV = ");
/* 203 */           m2622a(sbM3512p, this.f5520I);
/* 208 */           sbM3512p.append("seq_prox = ");
/* 213 */           m2622a(sbM3512p, this.f5521J);
/* 218 */           sbM3512p.append("seq_light = ");
/* 223 */           m2622a(sbM3512p, this.f5522K);
/* 228 */           sbM3512p.append("seq_pressure = ");
/* 233 */           m2622a(sbM3512p, this.f5523L);
/* 238 */           sbM3512p.append("seq_temp = ");
/* 243 */           m2622a(sbM3512p, this.f5524M);
/* 248 */           sbM3512p.append("seq_step = ");
/* 253 */           m2622a(sbM3512p, this.f5525N);
/* 258 */           sbM3512p.append("seq_resolution = ");
/* 263 */           m2622a(sbM3512p, this.f5526O);
/* 268 */           sbM3512p.append("Battery = ");
/* 273 */           m2622a(sbM3512p, this.f5527P);
/* 276 */           return sbM3512p.toString();
                }

                /* JADX INFO: renamed from: a */
/* 997 */       public static void m2622a(StringBuilder sb, LinkedList linkedList) {
                    if (linkedList == null) {
                        return;
                    }
/* 998 */           sb.append(linkedList.size());
                    sb.append("\n");
                }
            }
