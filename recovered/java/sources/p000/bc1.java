            package p000;

            import io.flutter.plugin.editing.FlutterTextUtils;
            import okhttp3.internal.p013ws.WebSocketProtocol;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class bc1 {

                /* JADX INFO: renamed from: a */
                public final ac1 f2364a;

                public bc1(y83 y83Var, y83 y83Var2, rw1 rw1Var) {
/* 10 */            this.f2364a = new ac1(0, y83Var, y83Var2, rw1Var);
                }

                /* JADX WARN: Code duplicated, block: B:38:0x0109  */
                /* JADX WARN: Code duplicated, block: B:41:0x0112  */
                /* JADX WARN: Code duplicated, block: B:43:0x0116  */
                /* JADX WARN: Code duplicated, block: B:44:0x0128  */
                /* JADX WARN: Code duplicated, block: B:45:0x013a  */
                /* JADX WARN: Code duplicated, block: B:47:0x0143  */
                /* JADX WARN: Code duplicated, block: B:49:0x014c  */
                /* JADX WARN: Code duplicated, block: B:50:0x015a  */
                /* JADX WARN: Code duplicated, block: B:51:0x0167  */
                /* JADX WARN: Code duplicated, block: B:53:0x016b  */
                /* JADX WARN: Code duplicated, block: B:55:0x017a  */
                /* JADX WARN: Code duplicated, block: B:56:0x0183  */
                /* JADX WARN: Code duplicated, block: B:57:0x0191  */
                /* JADX WARN: Code duplicated, block: B:58:0x019b  */
                /* JADX WARN: Code duplicated, block: B:60:0x019f  */
                /* JADX WARN: Code duplicated, block: B:61:0x01ab  */
                /* JADX WARN: Code duplicated, block: B:62:0x01b3  */
                /* JADX WARN: Code duplicated, block: B:63:0x01ba  */
                /* JADX WARN: Code duplicated, block: B:64:0x01c1  */
                /* JADX WARN: Code duplicated, block: B:65:0x01c9  */
                /* JADX WARN: Code duplicated, block: B:66:0x01d6  */
                /* JADX WARN: Code duplicated, block: B:67:0x01e2  */
                /* JADX WARN: Code duplicated, block: B:68:0x01ee  */
                /* JADX WARN: Code duplicated, block: B:69:0x01f6  */
                /* JADX INFO: renamed from: a */
                public static int m1331a(ac1 ac1Var, Object obj, Object obj2) {
                    int iM6543j;
                    int size;
                    int iM6542i;
                    int i;
                    y83 y83Var;
                    int iM6541h;
                    int size2;
                    int iM6542i2;
/* 9 */             y83 y83Var2 = (y83) ac1Var.f177b;
/* 11 */            int i2 = fh0.f8213c;
/* 13 */            int iM6543j2 = 1;
/* 14 */            int iM6541h2 = C1905lw.m6541h(1);
/* 18 */            v83 v83Var = y83.f19522d;
/* 20 */            if (y83Var2 == v83Var) {
/* 22 */                iM6541h2 *= 2;
                    }
                    switch (y83Var2.ordinal()) {
                        case 0:
/* 249 */                   ((Double) obj).getClass();
/* 82 */                    iM6543j = 8;
/* 254 */                   i = iM6543j + iM6541h2;
/* 257 */                   y83Var = (y83) ac1Var.f178c;
/* 260 */                   iM6541h = C1905lw.m6541h(2);
/* 264 */                   if (y83Var == v83Var) {
/* 266 */                       iM6541h *= 2;
                            }
                            switch (y83Var.ordinal()) {
                                case 0:
/* 506 */                           ((Double) obj2).getClass();
/* 321 */                           iM6543j2 = 8;
/* 512 */                           return iM6543j2 + iM6541h + i;
                                case 1:
/* 498 */                           ((Float) obj2).getClass();
/* 330 */                           iM6543j2 = 4;
/* 512 */                           return iM6543j2 + iM6541h + i;
                                case 2:
/* 490 */                           iM6543j2 = C1905lw.m6543j(((Long) obj2).longValue());
/* 512 */                           return iM6543j2 + iM6541h + i;
                                case 3:
/* 478 */                           iM6543j2 = C1905lw.m6543j(((Long) obj2).longValue());
/* 512 */                           return iM6543j2 + iM6541h + i;
                                case 4:
/* 466 */                           iM6543j2 = C1905lw.m6543j(((Integer) obj2).intValue());
/* 512 */                           return iM6543j2 + iM6541h + i;
                                case 5:
/* 453 */                           ((Long) obj2).getClass();
/* 321 */                           iM6543j2 = 8;
/* 512 */                           return iM6543j2 + iM6541h + i;
                                case 6:
/* 446 */                           ((Integer) obj2).getClass();
/* 330 */                           iM6543j2 = 4;
/* 512 */                           return iM6543j2 + iM6541h + i;
                                case 7:
/* 439 */                           ((Boolean) obj2).getClass();
/* 512 */                           return iM6543j2 + iM6541h + i;
                                case 8:
/* 414 */                           if (obj2 instanceof C2259ul) {
/* 419 */                               size2 = ((C2259ul) obj2).size();
/* 423 */                               iM6542i2 = C1905lw.m6542i(size2);
/* 375 */                               iM6543j2 = iM6542i2 + size2;
                                    } else {
/* 431 */                               iM6543j2 = C1905lw.m6540g((String) obj2);
                                    }
/* 512 */                           return iM6543j2 + iM6541h + i;
                                case 9:
/* 407 */                           iM6543j2 = ((tq0) ((AbstractC2350x) obj2)).mo8856a(null);
/* 512 */                           return iM6543j2 + iM6541h + i;
                                case 10:
/* 393 */                           size2 = ((tq0) ((AbstractC2350x) obj2)).mo8856a(null);
/* 397 */                           iM6542i2 = C1905lw.m6542i(size2);
/* 375 */                           iM6543j2 = iM6542i2 + size2;
/* 512 */                           return iM6543j2 + iM6541h + i;
                                case 11:
/* 362 */                           if (obj2 instanceof C2259ul) {
/* 367 */                               size2 = ((C2259ul) obj2).size();
/* 371 */                               iM6542i2 = C1905lw.m6542i(size2);
                                    } else {
/* 382 */                               size2 = ((byte[]) obj2).length;
/* 383 */                               iM6542i2 = C1905lw.m6542i(size2);
                                    }
/* 375 */                           iM6543j2 = iM6542i2 + size2;
/* 512 */                           return iM6543j2 + iM6541h + i;
                                case 12:
/* 354 */                           iM6543j2 = C1905lw.m6542i(((Integer) obj2).intValue());
/* 512 */                           return iM6543j2 + iM6541h + i;
                                case FlutterTextUtils.CARRIAGE_RETURN /* 13 */:
/* 341 */                           iM6543j2 = C1905lw.m6543j(((Integer) obj2).intValue());
/* 512 */                           return iM6543j2 + iM6541h + i;
                                case 14:
/* 327 */                           ((Integer) obj2).getClass();
/* 330 */                           iM6543j2 = 4;
/* 512 */                           return iM6543j2 + iM6541h + i;
                                case WebSocketProtocol.B0_MASK_OPCODE /* 15 */:
/* 318 */                           ((Long) obj2).getClass();
/* 321 */                           iM6543j2 = 8;
/* 512 */                           return iM6543j2 + iM6541h + i;
                                case 16:
/* 300 */                           int iIntValue = ((Integer) obj2).intValue();
/* 309 */                           iM6543j2 = C1905lw.m6542i((iIntValue >> 31) ^ (iIntValue << 1));
/* 512 */                           return iM6543j2 + iM6541h + i;
                                case 17:
/* 282 */                           long jLongValue = ((Long) obj2).longValue();
/* 291 */                           iM6543j2 = C1905lw.m6543j((jLongValue >> 63) ^ (jLongValue << 1));
/* 512 */                           return iM6543j2 + iM6541h + i;
                                default:
/* 275 */                           f42.m3663s("There is no way to get here, but the compiler thinks otherwise.");
/* 28 */                            return 0;
                            }
                        case 1:
/* 242 */                   ((Float) obj).getClass();
/* 90 */                    iM6543j = 4;
/* 254 */                   i = iM6543j + iM6541h2;
/* 257 */                   y83Var = (y83) ac1Var.f178c;
/* 260 */                   iM6541h = C1905lw.m6541h(2);
/* 264 */                   if (y83Var == v83Var) {
/* 266 */                       iM6541h *= 2;
                            }
                            switch (y83Var.ordinal()) {
                                case 0:
/* 506 */                           ((Double) obj2).getClass();
/* 321 */                           iM6543j2 = 8;
/* 512 */                           return iM6543j2 + iM6541h + i;
                                case 1:
/* 498 */                           ((Float) obj2).getClass();
/* 330 */                           iM6543j2 = 4;
/* 512 */                           return iM6543j2 + iM6541h + i;
                                case 2:
/* 490 */                           iM6543j2 = C1905lw.m6543j(((Long) obj2).longValue());
/* 512 */                           return iM6543j2 + iM6541h + i;
                                case 3:
/* 478 */                           iM6543j2 = C1905lw.m6543j(((Long) obj2).longValue());
/* 512 */                           return iM6543j2 + iM6541h + i;
                                case 4:
/* 466 */                           iM6543j2 = C1905lw.m6543j(((Integer) obj2).intValue());
/* 512 */                           return iM6543j2 + iM6541h + i;
                                case 5:
/* 453 */                           ((Long) obj2).getClass();
/* 321 */                           iM6543j2 = 8;
/* 512 */                           return iM6543j2 + iM6541h + i;
                                case 6:
/* 446 */                           ((Integer) obj2).getClass();
/* 330 */                           iM6543j2 = 4;
/* 512 */                           return iM6543j2 + iM6541h + i;
                                case 7:
/* 439 */                           ((Boolean) obj2).getClass();
/* 512 */                           return iM6543j2 + iM6541h + i;
                                case 8:
/* 414 */                           if (obj2 instanceof C2259ul) {
/* 419 */                               size2 = ((C2259ul) obj2).size();
/* 423 */                               iM6542i2 = C1905lw.m6542i(size2);
/* 375 */                               iM6543j2 = iM6542i2 + size2;
                                    } else {
/* 431 */                               iM6543j2 = C1905lw.m6540g((String) obj2);
                                    }
/* 512 */                           return iM6543j2 + iM6541h + i;
                                case 9:
/* 407 */                           iM6543j2 = ((tq0) ((AbstractC2350x) obj2)).mo8856a(null);
/* 512 */                           return iM6543j2 + iM6541h + i;
                                case 10:
/* 393 */                           size2 = ((tq0) ((AbstractC2350x) obj2)).mo8856a(null);
/* 397 */                           iM6542i2 = C1905lw.m6542i(size2);
/* 375 */                           iM6543j2 = iM6542i2 + size2;
/* 512 */                           return iM6543j2 + iM6541h + i;
                                case 11:
/* 362 */                           if (obj2 instanceof C2259ul) {
/* 367 */                               size2 = ((C2259ul) obj2).size();
/* 371 */                               iM6542i2 = C1905lw.m6542i(size2);
                                    } else {
/* 382 */                               size2 = ((byte[]) obj2).length;
/* 383 */                               iM6542i2 = C1905lw.m6542i(size2);
                                    }
/* 375 */                           iM6543j2 = iM6542i2 + size2;
/* 512 */                           return iM6543j2 + iM6541h + i;
                                case 12:
/* 354 */                           iM6543j2 = C1905lw.m6542i(((Integer) obj2).intValue());
/* 512 */                           return iM6543j2 + iM6541h + i;
                                case FlutterTextUtils.CARRIAGE_RETURN /* 13 */:
/* 341 */                           iM6543j2 = C1905lw.m6543j(((Integer) obj2).intValue());
/* 512 */                           return iM6543j2 + iM6541h + i;
                                case 14:
/* 327 */                           ((Integer) obj2).getClass();
/* 330 */                           iM6543j2 = 4;
/* 512 */                           return iM6543j2 + iM6541h + i;
                                case WebSocketProtocol.B0_MASK_OPCODE /* 15 */:
/* 318 */                           ((Long) obj2).getClass();
/* 321 */                           iM6543j2 = 8;
/* 512 */                           return iM6543j2 + iM6541h + i;
                                case 16:
/* 300 */                           int iIntValue2 = ((Integer) obj2).intValue();
/* 309 */                           iM6543j2 = C1905lw.m6542i((iIntValue2 >> 31) ^ (iIntValue2 << 1));
/* 512 */                           return iM6543j2 + iM6541h + i;
                                case 17:
/* 282 */                           long jLongValue2 = ((Long) obj2).longValue();
/* 291 */                           iM6543j2 = C1905lw.m6543j((jLongValue2 >> 63) ^ (jLongValue2 << 1));
/* 512 */                           return iM6543j2 + iM6541h + i;
                                default:
/* 275 */                           f42.m3663s("There is no way to get here, but the compiler thinks otherwise.");
/* 28 */                            return 0;
                            }
                        case 2:
/* 235 */                   iM6543j = C1905lw.m6543j(((Long) obj).longValue());
/* 254 */                   i = iM6543j + iM6541h2;
/* 257 */                   y83Var = (y83) ac1Var.f178c;
/* 260 */                   iM6541h = C1905lw.m6541h(2);
/* 264 */                   if (y83Var == v83Var) {
/* 266 */                       iM6541h *= 2;
                            }
                            switch (y83Var.ordinal()) {
                                case 0:
/* 506 */                           ((Double) obj2).getClass();
/* 321 */                           iM6543j2 = 8;
/* 512 */                           return iM6543j2 + iM6541h + i;
                                case 1:
/* 498 */                           ((Float) obj2).getClass();
/* 330 */                           iM6543j2 = 4;
/* 512 */                           return iM6543j2 + iM6541h + i;
                                case 2:
/* 490 */                           iM6543j2 = C1905lw.m6543j(((Long) obj2).longValue());
/* 512 */                           return iM6543j2 + iM6541h + i;
                                case 3:
/* 478 */                           iM6543j2 = C1905lw.m6543j(((Long) obj2).longValue());
/* 512 */                           return iM6543j2 + iM6541h + i;
                                case 4:
/* 466 */                           iM6543j2 = C1905lw.m6543j(((Integer) obj2).intValue());
/* 512 */                           return iM6543j2 + iM6541h + i;
                                case 5:
/* 453 */                           ((Long) obj2).getClass();
/* 321 */                           iM6543j2 = 8;
/* 512 */                           return iM6543j2 + iM6541h + i;
                                case 6:
/* 446 */                           ((Integer) obj2).getClass();
/* 330 */                           iM6543j2 = 4;
/* 512 */                           return iM6543j2 + iM6541h + i;
                                case 7:
/* 439 */                           ((Boolean) obj2).getClass();
/* 512 */                           return iM6543j2 + iM6541h + i;
                                case 8:
/* 414 */                           if (obj2 instanceof C2259ul) {
/* 419 */                               size2 = ((C2259ul) obj2).size();
/* 423 */                               iM6542i2 = C1905lw.m6542i(size2);
/* 375 */                               iM6543j2 = iM6542i2 + size2;
                                    } else {
/* 431 */                               iM6543j2 = C1905lw.m6540g((String) obj2);
                                    }
/* 512 */                           return iM6543j2 + iM6541h + i;
                                case 9:
/* 407 */                           iM6543j2 = ((tq0) ((AbstractC2350x) obj2)).mo8856a(null);
/* 512 */                           return iM6543j2 + iM6541h + i;
                                case 10:
/* 393 */                           size2 = ((tq0) ((AbstractC2350x) obj2)).mo8856a(null);
/* 397 */                           iM6542i2 = C1905lw.m6542i(size2);
/* 375 */                           iM6543j2 = iM6542i2 + size2;
/* 512 */                           return iM6543j2 + iM6541h + i;
                                case 11:
/* 362 */                           if (obj2 instanceof C2259ul) {
/* 367 */                               size2 = ((C2259ul) obj2).size();
/* 371 */                               iM6542i2 = C1905lw.m6542i(size2);
                                    } else {
/* 382 */                               size2 = ((byte[]) obj2).length;
/* 383 */                               iM6542i2 = C1905lw.m6542i(size2);
                                    }
/* 375 */                           iM6543j2 = iM6542i2 + size2;
/* 512 */                           return iM6543j2 + iM6541h + i;
                                case 12:
/* 354 */                           iM6543j2 = C1905lw.m6542i(((Integer) obj2).intValue());
/* 512 */                           return iM6543j2 + iM6541h + i;
                                case FlutterTextUtils.CARRIAGE_RETURN /* 13 */:
/* 341 */                           iM6543j2 = C1905lw.m6543j(((Integer) obj2).intValue());
/* 512 */                           return iM6543j2 + iM6541h + i;
                                case 14:
/* 327 */                           ((Integer) obj2).getClass();
/* 330 */                           iM6543j2 = 4;
/* 512 */                           return iM6543j2 + iM6541h + i;
                                case WebSocketProtocol.B0_MASK_OPCODE /* 15 */:
/* 318 */                           ((Long) obj2).getClass();
/* 321 */                           iM6543j2 = 8;
/* 512 */                           return iM6543j2 + iM6541h + i;
                                case 16:
/* 300 */                           int iIntValue3 = ((Integer) obj2).intValue();
/* 309 */                           iM6543j2 = C1905lw.m6542i((iIntValue3 >> 31) ^ (iIntValue3 << 1));
/* 512 */                           return iM6543j2 + iM6541h + i;
                                case 17:
/* 282 */                           long jLongValue3 = ((Long) obj2).longValue();
/* 291 */                           iM6543j2 = C1905lw.m6543j((jLongValue3 >> 63) ^ (jLongValue3 << 1));
/* 512 */                           return iM6543j2 + iM6541h + i;
                                default:
/* 275 */                           f42.m3663s("There is no way to get here, but the compiler thinks otherwise.");
/* 28 */                            return 0;
                            }
                        case 3:
/* 224 */                   iM6543j = C1905lw.m6543j(((Long) obj).longValue());
/* 254 */                   i = iM6543j + iM6541h2;
/* 257 */                   y83Var = (y83) ac1Var.f178c;
/* 260 */                   iM6541h = C1905lw.m6541h(2);
/* 264 */                   if (y83Var == v83Var) {
/* 266 */                       iM6541h *= 2;
                            }
                            switch (y83Var.ordinal()) {
                                case 0:
/* 506 */                           ((Double) obj2).getClass();
/* 321 */                           iM6543j2 = 8;
/* 512 */                           return iM6543j2 + iM6541h + i;
                                case 1:
/* 498 */                           ((Float) obj2).getClass();
/* 330 */                           iM6543j2 = 4;
/* 512 */                           return iM6543j2 + iM6541h + i;
                                case 2:
/* 490 */                           iM6543j2 = C1905lw.m6543j(((Long) obj2).longValue());
/* 512 */                           return iM6543j2 + iM6541h + i;
                                case 3:
/* 478 */                           iM6543j2 = C1905lw.m6543j(((Long) obj2).longValue());
/* 512 */                           return iM6543j2 + iM6541h + i;
                                case 4:
/* 466 */                           iM6543j2 = C1905lw.m6543j(((Integer) obj2).intValue());
/* 512 */                           return iM6543j2 + iM6541h + i;
                                case 5:
/* 453 */                           ((Long) obj2).getClass();
/* 321 */                           iM6543j2 = 8;
/* 512 */                           return iM6543j2 + iM6541h + i;
                                case 6:
/* 446 */                           ((Integer) obj2).getClass();
/* 330 */                           iM6543j2 = 4;
/* 512 */                           return iM6543j2 + iM6541h + i;
                                case 7:
/* 439 */                           ((Boolean) obj2).getClass();
/* 512 */                           return iM6543j2 + iM6541h + i;
                                case 8:
/* 414 */                           if (obj2 instanceof C2259ul) {
/* 419 */                               size2 = ((C2259ul) obj2).size();
/* 423 */                               iM6542i2 = C1905lw.m6542i(size2);
/* 375 */                               iM6543j2 = iM6542i2 + size2;
                                    } else {
/* 431 */                               iM6543j2 = C1905lw.m6540g((String) obj2);
                                    }
/* 512 */                           return iM6543j2 + iM6541h + i;
                                case 9:
/* 407 */                           iM6543j2 = ((tq0) ((AbstractC2350x) obj2)).mo8856a(null);
/* 512 */                           return iM6543j2 + iM6541h + i;
                                case 10:
/* 393 */                           size2 = ((tq0) ((AbstractC2350x) obj2)).mo8856a(null);
/* 397 */                           iM6542i2 = C1905lw.m6542i(size2);
/* 375 */                           iM6543j2 = iM6542i2 + size2;
/* 512 */                           return iM6543j2 + iM6541h + i;
                                case 11:
/* 362 */                           if (obj2 instanceof C2259ul) {
/* 367 */                               size2 = ((C2259ul) obj2).size();
/* 371 */                               iM6542i2 = C1905lw.m6542i(size2);
                                    } else {
/* 382 */                               size2 = ((byte[]) obj2).length;
/* 383 */                               iM6542i2 = C1905lw.m6542i(size2);
                                    }
/* 375 */                           iM6543j2 = iM6542i2 + size2;
/* 512 */                           return iM6543j2 + iM6541h + i;
                                case 12:
/* 354 */                           iM6543j2 = C1905lw.m6542i(((Integer) obj2).intValue());
/* 512 */                           return iM6543j2 + iM6541h + i;
                                case FlutterTextUtils.CARRIAGE_RETURN /* 13 */:
/* 341 */                           iM6543j2 = C1905lw.m6543j(((Integer) obj2).intValue());
/* 512 */                           return iM6543j2 + iM6541h + i;
                                case 14:
/* 327 */                           ((Integer) obj2).getClass();
/* 330 */                           iM6543j2 = 4;
/* 512 */                           return iM6543j2 + iM6541h + i;
                                case WebSocketProtocol.B0_MASK_OPCODE /* 15 */:
/* 318 */                           ((Long) obj2).getClass();
/* 321 */                           iM6543j2 = 8;
/* 512 */                           return iM6543j2 + iM6541h + i;
                                case 16:
/* 300 */                           int iIntValue4 = ((Integer) obj2).intValue();
/* 309 */                           iM6543j2 = C1905lw.m6542i((iIntValue4 >> 31) ^ (iIntValue4 << 1));
/* 512 */                           return iM6543j2 + iM6541h + i;
                                case 17:
/* 282 */                           long jLongValue4 = ((Long) obj2).longValue();
/* 291 */                           iM6543j2 = C1905lw.m6543j((jLongValue4 >> 63) ^ (jLongValue4 << 1));
/* 512 */                           return iM6543j2 + iM6541h + i;
                                default:
/* 275 */                           f42.m3663s("There is no way to get here, but the compiler thinks otherwise.");
/* 28 */                            return 0;
                            }
                        case 4:
/* 213 */                   iM6543j = C1905lw.m6543j(((Integer) obj).intValue());
/* 254 */                   i = iM6543j + iM6541h2;
/* 257 */                   y83Var = (y83) ac1Var.f178c;
/* 260 */                   iM6541h = C1905lw.m6541h(2);
/* 264 */                   if (y83Var == v83Var) {
/* 266 */                       iM6541h *= 2;
                            }
                            switch (y83Var.ordinal()) {
                                case 0:
/* 506 */                           ((Double) obj2).getClass();
/* 321 */                           iM6543j2 = 8;
/* 512 */                           return iM6543j2 + iM6541h + i;
                                case 1:
/* 498 */                           ((Float) obj2).getClass();
/* 330 */                           iM6543j2 = 4;
/* 512 */                           return iM6543j2 + iM6541h + i;
                                case 2:
/* 490 */                           iM6543j2 = C1905lw.m6543j(((Long) obj2).longValue());
/* 512 */                           return iM6543j2 + iM6541h + i;
                                case 3:
/* 478 */                           iM6543j2 = C1905lw.m6543j(((Long) obj2).longValue());
/* 512 */                           return iM6543j2 + iM6541h + i;
                                case 4:
/* 466 */                           iM6543j2 = C1905lw.m6543j(((Integer) obj2).intValue());
/* 512 */                           return iM6543j2 + iM6541h + i;
                                case 5:
/* 453 */                           ((Long) obj2).getClass();
/* 321 */                           iM6543j2 = 8;
/* 512 */                           return iM6543j2 + iM6541h + i;
                                case 6:
/* 446 */                           ((Integer) obj2).getClass();
/* 330 */                           iM6543j2 = 4;
/* 512 */                           return iM6543j2 + iM6541h + i;
                                case 7:
/* 439 */                           ((Boolean) obj2).getClass();
/* 512 */                           return iM6543j2 + iM6541h + i;
                                case 8:
/* 414 */                           if (obj2 instanceof C2259ul) {
/* 419 */                               size2 = ((C2259ul) obj2).size();
/* 423 */                               iM6542i2 = C1905lw.m6542i(size2);
/* 375 */                               iM6543j2 = iM6542i2 + size2;
                                    } else {
/* 431 */                               iM6543j2 = C1905lw.m6540g((String) obj2);
                                    }
/* 512 */                           return iM6543j2 + iM6541h + i;
                                case 9:
/* 407 */                           iM6543j2 = ((tq0) ((AbstractC2350x) obj2)).mo8856a(null);
/* 512 */                           return iM6543j2 + iM6541h + i;
                                case 10:
/* 393 */                           size2 = ((tq0) ((AbstractC2350x) obj2)).mo8856a(null);
/* 397 */                           iM6542i2 = C1905lw.m6542i(size2);
/* 375 */                           iM6543j2 = iM6542i2 + size2;
/* 512 */                           return iM6543j2 + iM6541h + i;
                                case 11:
/* 362 */                           if (obj2 instanceof C2259ul) {
/* 367 */                               size2 = ((C2259ul) obj2).size();
/* 371 */                               iM6542i2 = C1905lw.m6542i(size2);
                                    } else {
/* 382 */                               size2 = ((byte[]) obj2).length;
/* 383 */                               iM6542i2 = C1905lw.m6542i(size2);
                                    }
/* 375 */                           iM6543j2 = iM6542i2 + size2;
/* 512 */                           return iM6543j2 + iM6541h + i;
                                case 12:
/* 354 */                           iM6543j2 = C1905lw.m6542i(((Integer) obj2).intValue());
/* 512 */                           return iM6543j2 + iM6541h + i;
                                case FlutterTextUtils.CARRIAGE_RETURN /* 13 */:
/* 341 */                           iM6543j2 = C1905lw.m6543j(((Integer) obj2).intValue());
/* 512 */                           return iM6543j2 + iM6541h + i;
                                case 14:
/* 327 */                           ((Integer) obj2).getClass();
/* 330 */                           iM6543j2 = 4;
/* 512 */                           return iM6543j2 + iM6541h + i;
                                case WebSocketProtocol.B0_MASK_OPCODE /* 15 */:
/* 318 */                           ((Long) obj2).getClass();
/* 321 */                           iM6543j2 = 8;
/* 512 */                           return iM6543j2 + iM6541h + i;
                                case 16:
/* 300 */                           int iIntValue5 = ((Integer) obj2).intValue();
/* 309 */                           iM6543j2 = C1905lw.m6542i((iIntValue5 >> 31) ^ (iIntValue5 << 1));
/* 512 */                           return iM6543j2 + iM6541h + i;
                                case 17:
/* 282 */                           long jLongValue5 = ((Long) obj2).longValue();
/* 291 */                           iM6543j2 = C1905lw.m6543j((jLongValue5 >> 63) ^ (jLongValue5 << 1));
/* 512 */                           return iM6543j2 + iM6541h + i;
                                default:
/* 275 */                           f42.m3663s("There is no way to get here, but the compiler thinks otherwise.");
/* 28 */                            return 0;
                            }
                        case 5:
/* 202 */                   ((Long) obj).getClass();
/* 82 */                    iM6543j = 8;
/* 254 */                   i = iM6543j + iM6541h2;
/* 257 */                   y83Var = (y83) ac1Var.f178c;
/* 260 */                   iM6541h = C1905lw.m6541h(2);
/* 264 */                   if (y83Var == v83Var) {
/* 266 */                       iM6541h *= 2;
                            }
                            switch (y83Var.ordinal()) {
                                case 0:
/* 506 */                           ((Double) obj2).getClass();
/* 321 */                           iM6543j2 = 8;
/* 512 */                           return iM6543j2 + iM6541h + i;
                                case 1:
/* 498 */                           ((Float) obj2).getClass();
/* 330 */                           iM6543j2 = 4;
/* 512 */                           return iM6543j2 + iM6541h + i;
                                case 2:
/* 490 */                           iM6543j2 = C1905lw.m6543j(((Long) obj2).longValue());
/* 512 */                           return iM6543j2 + iM6541h + i;
                                case 3:
/* 478 */                           iM6543j2 = C1905lw.m6543j(((Long) obj2).longValue());
/* 512 */                           return iM6543j2 + iM6541h + i;
                                case 4:
/* 466 */                           iM6543j2 = C1905lw.m6543j(((Integer) obj2).intValue());
/* 512 */                           return iM6543j2 + iM6541h + i;
                                case 5:
/* 453 */                           ((Long) obj2).getClass();
/* 321 */                           iM6543j2 = 8;
/* 512 */                           return iM6543j2 + iM6541h + i;
                                case 6:
/* 446 */                           ((Integer) obj2).getClass();
/* 330 */                           iM6543j2 = 4;
/* 512 */                           return iM6543j2 + iM6541h + i;
                                case 7:
/* 439 */                           ((Boolean) obj2).getClass();
/* 512 */                           return iM6543j2 + iM6541h + i;
                                case 8:
/* 414 */                           if (obj2 instanceof C2259ul) {
/* 419 */                               size2 = ((C2259ul) obj2).size();
/* 423 */                               iM6542i2 = C1905lw.m6542i(size2);
/* 375 */                               iM6543j2 = iM6542i2 + size2;
                                    } else {
/* 431 */                               iM6543j2 = C1905lw.m6540g((String) obj2);
                                    }
/* 512 */                           return iM6543j2 + iM6541h + i;
                                case 9:
/* 407 */                           iM6543j2 = ((tq0) ((AbstractC2350x) obj2)).mo8856a(null);
/* 512 */                           return iM6543j2 + iM6541h + i;
                                case 10:
/* 393 */                           size2 = ((tq0) ((AbstractC2350x) obj2)).mo8856a(null);
/* 397 */                           iM6542i2 = C1905lw.m6542i(size2);
/* 375 */                           iM6543j2 = iM6542i2 + size2;
/* 512 */                           return iM6543j2 + iM6541h + i;
                                case 11:
/* 362 */                           if (obj2 instanceof C2259ul) {
/* 367 */                               size2 = ((C2259ul) obj2).size();
/* 371 */                               iM6542i2 = C1905lw.m6542i(size2);
                                    } else {
/* 382 */                               size2 = ((byte[]) obj2).length;
/* 383 */                               iM6542i2 = C1905lw.m6542i(size2);
                                    }
/* 375 */                           iM6543j2 = iM6542i2 + size2;
/* 512 */                           return iM6543j2 + iM6541h + i;
                                case 12:
/* 354 */                           iM6543j2 = C1905lw.m6542i(((Integer) obj2).intValue());
/* 512 */                           return iM6543j2 + iM6541h + i;
                                case FlutterTextUtils.CARRIAGE_RETURN /* 13 */:
/* 341 */                           iM6543j2 = C1905lw.m6543j(((Integer) obj2).intValue());
/* 512 */                           return iM6543j2 + iM6541h + i;
                                case 14:
/* 327 */                           ((Integer) obj2).getClass();
/* 330 */                           iM6543j2 = 4;
/* 512 */                           return iM6543j2 + iM6541h + i;
                                case WebSocketProtocol.B0_MASK_OPCODE /* 15 */:
/* 318 */                           ((Long) obj2).getClass();
/* 321 */                           iM6543j2 = 8;
/* 512 */                           return iM6543j2 + iM6541h + i;
                                case 16:
/* 300 */                           int iIntValue6 = ((Integer) obj2).intValue();
/* 309 */                           iM6543j2 = C1905lw.m6542i((iIntValue6 >> 31) ^ (iIntValue6 << 1));
/* 512 */                           return iM6543j2 + iM6541h + i;
                                case 17:
/* 282 */                           long jLongValue6 = ((Long) obj2).longValue();
/* 291 */                           iM6543j2 = C1905lw.m6543j((jLongValue6 >> 63) ^ (jLongValue6 << 1));
/* 512 */                           return iM6543j2 + iM6541h + i;
                                default:
/* 275 */                           f42.m3663s("There is no way to get here, but the compiler thinks otherwise.");
/* 28 */                            return 0;
                            }
                        case 6:
/* 196 */                   ((Integer) obj).getClass();
/* 90 */                    iM6543j = 4;
/* 254 */                   i = iM6543j + iM6541h2;
/* 257 */                   y83Var = (y83) ac1Var.f178c;
/* 260 */                   iM6541h = C1905lw.m6541h(2);
/* 264 */                   if (y83Var == v83Var) {
/* 266 */                       iM6541h *= 2;
                            }
                            switch (y83Var.ordinal()) {
                                case 0:
/* 506 */                           ((Double) obj2).getClass();
/* 321 */                           iM6543j2 = 8;
/* 512 */                           return iM6543j2 + iM6541h + i;
                                case 1:
/* 498 */                           ((Float) obj2).getClass();
/* 330 */                           iM6543j2 = 4;
/* 512 */                           return iM6543j2 + iM6541h + i;
                                case 2:
/* 490 */                           iM6543j2 = C1905lw.m6543j(((Long) obj2).longValue());
/* 512 */                           return iM6543j2 + iM6541h + i;
                                case 3:
/* 478 */                           iM6543j2 = C1905lw.m6543j(((Long) obj2).longValue());
/* 512 */                           return iM6543j2 + iM6541h + i;
                                case 4:
/* 466 */                           iM6543j2 = C1905lw.m6543j(((Integer) obj2).intValue());
/* 512 */                           return iM6543j2 + iM6541h + i;
                                case 5:
/* 453 */                           ((Long) obj2).getClass();
/* 321 */                           iM6543j2 = 8;
/* 512 */                           return iM6543j2 + iM6541h + i;
                                case 6:
/* 446 */                           ((Integer) obj2).getClass();
/* 330 */                           iM6543j2 = 4;
/* 512 */                           return iM6543j2 + iM6541h + i;
                                case 7:
/* 439 */                           ((Boolean) obj2).getClass();
/* 512 */                           return iM6543j2 + iM6541h + i;
                                case 8:
/* 414 */                           if (obj2 instanceof C2259ul) {
/* 419 */                               size2 = ((C2259ul) obj2).size();
/* 423 */                               iM6542i2 = C1905lw.m6542i(size2);
/* 375 */                               iM6543j2 = iM6542i2 + size2;
                                    } else {
/* 431 */                               iM6543j2 = C1905lw.m6540g((String) obj2);
                                    }
/* 512 */                           return iM6543j2 + iM6541h + i;
                                case 9:
/* 407 */                           iM6543j2 = ((tq0) ((AbstractC2350x) obj2)).mo8856a(null);
/* 512 */                           return iM6543j2 + iM6541h + i;
                                case 10:
/* 393 */                           size2 = ((tq0) ((AbstractC2350x) obj2)).mo8856a(null);
/* 397 */                           iM6542i2 = C1905lw.m6542i(size2);
/* 375 */                           iM6543j2 = iM6542i2 + size2;
/* 512 */                           return iM6543j2 + iM6541h + i;
                                case 11:
/* 362 */                           if (obj2 instanceof C2259ul) {
/* 367 */                               size2 = ((C2259ul) obj2).size();
/* 371 */                               iM6542i2 = C1905lw.m6542i(size2);
                                    } else {
/* 382 */                               size2 = ((byte[]) obj2).length;
/* 383 */                               iM6542i2 = C1905lw.m6542i(size2);
                                    }
/* 375 */                           iM6543j2 = iM6542i2 + size2;
/* 512 */                           return iM6543j2 + iM6541h + i;
                                case 12:
/* 354 */                           iM6543j2 = C1905lw.m6542i(((Integer) obj2).intValue());
/* 512 */                           return iM6543j2 + iM6541h + i;
                                case FlutterTextUtils.CARRIAGE_RETURN /* 13 */:
/* 341 */                           iM6543j2 = C1905lw.m6543j(((Integer) obj2).intValue());
/* 512 */                           return iM6543j2 + iM6541h + i;
                                case 14:
/* 327 */                           ((Integer) obj2).getClass();
/* 330 */                           iM6543j2 = 4;
/* 512 */                           return iM6543j2 + iM6541h + i;
                                case WebSocketProtocol.B0_MASK_OPCODE /* 15 */:
/* 318 */                           ((Long) obj2).getClass();
/* 321 */                           iM6543j2 = 8;
/* 512 */                           return iM6543j2 + iM6541h + i;
                                case 16:
/* 300 */                           int iIntValue7 = ((Integer) obj2).intValue();
/* 309 */                           iM6543j2 = C1905lw.m6542i((iIntValue7 >> 31) ^ (iIntValue7 << 1));
/* 512 */                           return iM6543j2 + iM6541h + i;
                                case 17:
/* 282 */                           long jLongValue7 = ((Long) obj2).longValue();
/* 291 */                           iM6543j2 = C1905lw.m6543j((jLongValue7 >> 63) ^ (jLongValue7 << 1));
/* 512 */                           return iM6543j2 + iM6541h + i;
                                default:
/* 275 */                           f42.m3663s("There is no way to get here, but the compiler thinks otherwise.");
/* 28 */                            return 0;
                            }
                        case 7:
/* 189 */                   ((Boolean) obj).getClass();
/* 192 */                   iM6543j = 1;
/* 254 */                   i = iM6543j + iM6541h2;
/* 257 */                   y83Var = (y83) ac1Var.f178c;
/* 260 */                   iM6541h = C1905lw.m6541h(2);
/* 264 */                   if (y83Var == v83Var) {
/* 266 */                       iM6541h *= 2;
                            }
                            switch (y83Var.ordinal()) {
                                case 0:
/* 506 */                           ((Double) obj2).getClass();
/* 321 */                           iM6543j2 = 8;
/* 512 */                           return iM6543j2 + iM6541h + i;
                                case 1:
/* 498 */                           ((Float) obj2).getClass();
/* 330 */                           iM6543j2 = 4;
/* 512 */                           return iM6543j2 + iM6541h + i;
                                case 2:
/* 490 */                           iM6543j2 = C1905lw.m6543j(((Long) obj2).longValue());
/* 512 */                           return iM6543j2 + iM6541h + i;
                                case 3:
/* 478 */                           iM6543j2 = C1905lw.m6543j(((Long) obj2).longValue());
/* 512 */                           return iM6543j2 + iM6541h + i;
                                case 4:
/* 466 */                           iM6543j2 = C1905lw.m6543j(((Integer) obj2).intValue());
/* 512 */                           return iM6543j2 + iM6541h + i;
                                case 5:
/* 453 */                           ((Long) obj2).getClass();
/* 321 */                           iM6543j2 = 8;
/* 512 */                           return iM6543j2 + iM6541h + i;
                                case 6:
/* 446 */                           ((Integer) obj2).getClass();
/* 330 */                           iM6543j2 = 4;
/* 512 */                           return iM6543j2 + iM6541h + i;
                                case 7:
/* 439 */                           ((Boolean) obj2).getClass();
/* 512 */                           return iM6543j2 + iM6541h + i;
                                case 8:
/* 414 */                           if (obj2 instanceof C2259ul) {
/* 419 */                               size2 = ((C2259ul) obj2).size();
/* 423 */                               iM6542i2 = C1905lw.m6542i(size2);
/* 375 */                               iM6543j2 = iM6542i2 + size2;
                                    } else {
/* 431 */                               iM6543j2 = C1905lw.m6540g((String) obj2);
                                    }
/* 512 */                           return iM6543j2 + iM6541h + i;
                                case 9:
/* 407 */                           iM6543j2 = ((tq0) ((AbstractC2350x) obj2)).mo8856a(null);
/* 512 */                           return iM6543j2 + iM6541h + i;
                                case 10:
/* 393 */                           size2 = ((tq0) ((AbstractC2350x) obj2)).mo8856a(null);
/* 397 */                           iM6542i2 = C1905lw.m6542i(size2);
/* 375 */                           iM6543j2 = iM6542i2 + size2;
/* 512 */                           return iM6543j2 + iM6541h + i;
                                case 11:
/* 362 */                           if (obj2 instanceof C2259ul) {
/* 367 */                               size2 = ((C2259ul) obj2).size();
/* 371 */                               iM6542i2 = C1905lw.m6542i(size2);
                                    } else {
/* 382 */                               size2 = ((byte[]) obj2).length;
/* 383 */                               iM6542i2 = C1905lw.m6542i(size2);
                                    }
/* 375 */                           iM6543j2 = iM6542i2 + size2;
/* 512 */                           return iM6543j2 + iM6541h + i;
                                case 12:
/* 354 */                           iM6543j2 = C1905lw.m6542i(((Integer) obj2).intValue());
/* 512 */                           return iM6543j2 + iM6541h + i;
                                case FlutterTextUtils.CARRIAGE_RETURN /* 13 */:
/* 341 */                           iM6543j2 = C1905lw.m6543j(((Integer) obj2).intValue());
/* 512 */                           return iM6543j2 + iM6541h + i;
                                case 14:
/* 327 */                           ((Integer) obj2).getClass();
/* 330 */                           iM6543j2 = 4;
/* 512 */                           return iM6543j2 + iM6541h + i;
                                case WebSocketProtocol.B0_MASK_OPCODE /* 15 */:
/* 318 */                           ((Long) obj2).getClass();
/* 321 */                           iM6543j2 = 8;
/* 512 */                           return iM6543j2 + iM6541h + i;
                                case 16:
/* 300 */                           int iIntValue8 = ((Integer) obj2).intValue();
/* 309 */                           iM6543j2 = C1905lw.m6542i((iIntValue8 >> 31) ^ (iIntValue8 << 1));
/* 512 */                           return iM6543j2 + iM6541h + i;
                                case 17:
/* 282 */                           long jLongValue8 = ((Long) obj2).longValue();
/* 291 */                           iM6543j2 = C1905lw.m6543j((jLongValue8 >> 63) ^ (jLongValue8 << 1));
/* 512 */                           return iM6543j2 + iM6541h + i;
                                default:
/* 275 */                           f42.m3663s("There is no way to get here, but the compiler thinks otherwise.");
/* 28 */                            return 0;
                            }
                        case 8:
/* 167 */                   if (obj instanceof C2259ul) {
/* 171 */                       size = ((C2259ul) obj).size();
/* 175 */                       iM6542i = C1905lw.m6542i(size);
/* 132 */                       iM6543j = size + iM6542i;
                            } else {
/* 182 */                       iM6543j = C1905lw.m6540g((String) obj);
                            }
/* 254 */                   i = iM6543j + iM6541h2;
/* 257 */                   y83Var = (y83) ac1Var.f178c;
/* 260 */                   iM6541h = C1905lw.m6541h(2);
/* 264 */                   if (y83Var == v83Var) {
/* 266 */                       iM6541h *= 2;
                            }
                            switch (y83Var.ordinal()) {
                                case 0:
/* 506 */                           ((Double) obj2).getClass();
/* 321 */                           iM6543j2 = 8;
/* 512 */                           return iM6543j2 + iM6541h + i;
                                case 1:
/* 498 */                           ((Float) obj2).getClass();
/* 330 */                           iM6543j2 = 4;
/* 512 */                           return iM6543j2 + iM6541h + i;
                                case 2:
/* 490 */                           iM6543j2 = C1905lw.m6543j(((Long) obj2).longValue());
/* 512 */                           return iM6543j2 + iM6541h + i;
                                case 3:
/* 478 */                           iM6543j2 = C1905lw.m6543j(((Long) obj2).longValue());
/* 512 */                           return iM6543j2 + iM6541h + i;
                                case 4:
/* 466 */                           iM6543j2 = C1905lw.m6543j(((Integer) obj2).intValue());
/* 512 */                           return iM6543j2 + iM6541h + i;
                                case 5:
/* 453 */                           ((Long) obj2).getClass();
/* 321 */                           iM6543j2 = 8;
/* 512 */                           return iM6543j2 + iM6541h + i;
                                case 6:
/* 446 */                           ((Integer) obj2).getClass();
/* 330 */                           iM6543j2 = 4;
/* 512 */                           return iM6543j2 + iM6541h + i;
                                case 7:
/* 439 */                           ((Boolean) obj2).getClass();
/* 512 */                           return iM6543j2 + iM6541h + i;
                                case 8:
/* 414 */                           if (obj2 instanceof C2259ul) {
/* 419 */                               size2 = ((C2259ul) obj2).size();
/* 423 */                               iM6542i2 = C1905lw.m6542i(size2);
/* 375 */                               iM6543j2 = iM6542i2 + size2;
                                    } else {
/* 431 */                               iM6543j2 = C1905lw.m6540g((String) obj2);
                                    }
/* 512 */                           return iM6543j2 + iM6541h + i;
                                case 9:
/* 407 */                           iM6543j2 = ((tq0) ((AbstractC2350x) obj2)).mo8856a(null);
/* 512 */                           return iM6543j2 + iM6541h + i;
                                case 10:
/* 393 */                           size2 = ((tq0) ((AbstractC2350x) obj2)).mo8856a(null);
/* 397 */                           iM6542i2 = C1905lw.m6542i(size2);
/* 375 */                           iM6543j2 = iM6542i2 + size2;
/* 512 */                           return iM6543j2 + iM6541h + i;
                                case 11:
/* 362 */                           if (obj2 instanceof C2259ul) {
/* 367 */                               size2 = ((C2259ul) obj2).size();
/* 371 */                               iM6542i2 = C1905lw.m6542i(size2);
                                    } else {
/* 382 */                               size2 = ((byte[]) obj2).length;
/* 383 */                               iM6542i2 = C1905lw.m6542i(size2);
                                    }
/* 375 */                           iM6543j2 = iM6542i2 + size2;
/* 512 */                           return iM6543j2 + iM6541h + i;
                                case 12:
/* 354 */                           iM6543j2 = C1905lw.m6542i(((Integer) obj2).intValue());
/* 512 */                           return iM6543j2 + iM6541h + i;
                                case FlutterTextUtils.CARRIAGE_RETURN /* 13 */:
/* 341 */                           iM6543j2 = C1905lw.m6543j(((Integer) obj2).intValue());
/* 512 */                           return iM6543j2 + iM6541h + i;
                                case 14:
/* 327 */                           ((Integer) obj2).getClass();
/* 330 */                           iM6543j2 = 4;
/* 512 */                           return iM6543j2 + iM6541h + i;
                                case WebSocketProtocol.B0_MASK_OPCODE /* 15 */:
/* 318 */                           ((Long) obj2).getClass();
/* 321 */                           iM6543j2 = 8;
/* 512 */                           return iM6543j2 + iM6541h + i;
                                case 16:
/* 300 */                           int iIntValue9 = ((Integer) obj2).intValue();
/* 309 */                           iM6543j2 = C1905lw.m6542i((iIntValue9 >> 31) ^ (iIntValue9 << 1));
/* 512 */                           return iM6543j2 + iM6541h + i;
                                case 17:
/* 282 */                           long jLongValue9 = ((Long) obj2).longValue();
/* 291 */                           iM6543j2 = C1905lw.m6543j((jLongValue9 >> 63) ^ (jLongValue9 << 1));
/* 512 */                           return iM6543j2 + iM6541h + i;
                                default:
/* 275 */                           f42.m3663s("There is no way to get here, but the compiler thinks otherwise.");
/* 28 */                            return 0;
                            }
                        case 9:
/* 160 */                   iM6543j = ((tq0) ((AbstractC2350x) obj)).mo8856a(null);
/* 254 */                   i = iM6543j + iM6541h2;
/* 257 */                   y83Var = (y83) ac1Var.f178c;
/* 260 */                   iM6541h = C1905lw.m6541h(2);
/* 264 */                   if (y83Var == v83Var) {
/* 266 */                       iM6541h *= 2;
                            }
                            switch (y83Var.ordinal()) {
                                case 0:
/* 506 */                           ((Double) obj2).getClass();
/* 321 */                           iM6543j2 = 8;
/* 512 */                           return iM6543j2 + iM6541h + i;
                                case 1:
/* 498 */                           ((Float) obj2).getClass();
/* 330 */                           iM6543j2 = 4;
/* 512 */                           return iM6543j2 + iM6541h + i;
                                case 2:
/* 490 */                           iM6543j2 = C1905lw.m6543j(((Long) obj2).longValue());
/* 512 */                           return iM6543j2 + iM6541h + i;
                                case 3:
/* 478 */                           iM6543j2 = C1905lw.m6543j(((Long) obj2).longValue());
/* 512 */                           return iM6543j2 + iM6541h + i;
                                case 4:
/* 466 */                           iM6543j2 = C1905lw.m6543j(((Integer) obj2).intValue());
/* 512 */                           return iM6543j2 + iM6541h + i;
                                case 5:
/* 453 */                           ((Long) obj2).getClass();
/* 321 */                           iM6543j2 = 8;
/* 512 */                           return iM6543j2 + iM6541h + i;
                                case 6:
/* 446 */                           ((Integer) obj2).getClass();
/* 330 */                           iM6543j2 = 4;
/* 512 */                           return iM6543j2 + iM6541h + i;
                                case 7:
/* 439 */                           ((Boolean) obj2).getClass();
/* 512 */                           return iM6543j2 + iM6541h + i;
                                case 8:
/* 414 */                           if (obj2 instanceof C2259ul) {
/* 419 */                               size2 = ((C2259ul) obj2).size();
/* 423 */                               iM6542i2 = C1905lw.m6542i(size2);
/* 375 */                               iM6543j2 = iM6542i2 + size2;
                                    } else {
/* 431 */                               iM6543j2 = C1905lw.m6540g((String) obj2);
                                    }
/* 512 */                           return iM6543j2 + iM6541h + i;
                                case 9:
/* 407 */                           iM6543j2 = ((tq0) ((AbstractC2350x) obj2)).mo8856a(null);
/* 512 */                           return iM6543j2 + iM6541h + i;
                                case 10:
/* 393 */                           size2 = ((tq0) ((AbstractC2350x) obj2)).mo8856a(null);
/* 397 */                           iM6542i2 = C1905lw.m6542i(size2);
/* 375 */                           iM6543j2 = iM6542i2 + size2;
/* 512 */                           return iM6543j2 + iM6541h + i;
                                case 11:
/* 362 */                           if (obj2 instanceof C2259ul) {
/* 367 */                               size2 = ((C2259ul) obj2).size();
/* 371 */                               iM6542i2 = C1905lw.m6542i(size2);
                                    } else {
/* 382 */                               size2 = ((byte[]) obj2).length;
/* 383 */                               iM6542i2 = C1905lw.m6542i(size2);
                                    }
/* 375 */                           iM6543j2 = iM6542i2 + size2;
/* 512 */                           return iM6543j2 + iM6541h + i;
                                case 12:
/* 354 */                           iM6543j2 = C1905lw.m6542i(((Integer) obj2).intValue());
/* 512 */                           return iM6543j2 + iM6541h + i;
                                case FlutterTextUtils.CARRIAGE_RETURN /* 13 */:
/* 341 */                           iM6543j2 = C1905lw.m6543j(((Integer) obj2).intValue());
/* 512 */                           return iM6543j2 + iM6541h + i;
                                case 14:
/* 327 */                           ((Integer) obj2).getClass();
/* 330 */                           iM6543j2 = 4;
/* 512 */                           return iM6543j2 + iM6541h + i;
                                case WebSocketProtocol.B0_MASK_OPCODE /* 15 */:
/* 318 */                           ((Long) obj2).getClass();
/* 321 */                           iM6543j2 = 8;
/* 512 */                           return iM6543j2 + iM6541h + i;
                                case 16:
/* 300 */                           int iIntValue10 = ((Integer) obj2).intValue();
/* 309 */                           iM6543j2 = C1905lw.m6542i((iIntValue10 >> 31) ^ (iIntValue10 << 1));
/* 512 */                           return iM6543j2 + iM6541h + i;
                                case 17:
/* 282 */                           long jLongValue10 = ((Long) obj2).longValue();
/* 291 */                           iM6543j2 = C1905lw.m6543j((jLongValue10 >> 63) ^ (jLongValue10 << 1));
/* 512 */                           return iM6543j2 + iM6541h + i;
                                default:
/* 275 */                           f42.m3663s("There is no way to get here, but the compiler thinks otherwise.");
/* 28 */                            return 0;
                            }
                        case 10:
/* 147 */                   size = ((tq0) ((AbstractC2350x) obj)).mo8856a(null);
/* 151 */                   iM6542i = C1905lw.m6542i(size);
/* 132 */                   iM6543j = size + iM6542i;
/* 254 */                   i = iM6543j + iM6541h2;
/* 257 */                   y83Var = (y83) ac1Var.f178c;
/* 260 */                   iM6541h = C1905lw.m6541h(2);
/* 264 */                   if (y83Var == v83Var) {
/* 266 */                       iM6541h *= 2;
                            }
                            switch (y83Var.ordinal()) {
                                case 0:
/* 506 */                           ((Double) obj2).getClass();
/* 321 */                           iM6543j2 = 8;
/* 512 */                           return iM6543j2 + iM6541h + i;
                                case 1:
/* 498 */                           ((Float) obj2).getClass();
/* 330 */                           iM6543j2 = 4;
/* 512 */                           return iM6543j2 + iM6541h + i;
                                case 2:
/* 490 */                           iM6543j2 = C1905lw.m6543j(((Long) obj2).longValue());
/* 512 */                           return iM6543j2 + iM6541h + i;
                                case 3:
/* 478 */                           iM6543j2 = C1905lw.m6543j(((Long) obj2).longValue());
/* 512 */                           return iM6543j2 + iM6541h + i;
                                case 4:
/* 466 */                           iM6543j2 = C1905lw.m6543j(((Integer) obj2).intValue());
/* 512 */                           return iM6543j2 + iM6541h + i;
                                case 5:
/* 453 */                           ((Long) obj2).getClass();
/* 321 */                           iM6543j2 = 8;
/* 512 */                           return iM6543j2 + iM6541h + i;
                                case 6:
/* 446 */                           ((Integer) obj2).getClass();
/* 330 */                           iM6543j2 = 4;
/* 512 */                           return iM6543j2 + iM6541h + i;
                                case 7:
/* 439 */                           ((Boolean) obj2).getClass();
/* 512 */                           return iM6543j2 + iM6541h + i;
                                case 8:
/* 414 */                           if (obj2 instanceof C2259ul) {
/* 419 */                               size2 = ((C2259ul) obj2).size();
/* 423 */                               iM6542i2 = C1905lw.m6542i(size2);
/* 375 */                               iM6543j2 = iM6542i2 + size2;
                                    } else {
/* 431 */                               iM6543j2 = C1905lw.m6540g((String) obj2);
                                    }
/* 512 */                           return iM6543j2 + iM6541h + i;
                                case 9:
/* 407 */                           iM6543j2 = ((tq0) ((AbstractC2350x) obj2)).mo8856a(null);
/* 512 */                           return iM6543j2 + iM6541h + i;
                                case 10:
/* 393 */                           size2 = ((tq0) ((AbstractC2350x) obj2)).mo8856a(null);
/* 397 */                           iM6542i2 = C1905lw.m6542i(size2);
/* 375 */                           iM6543j2 = iM6542i2 + size2;
/* 512 */                           return iM6543j2 + iM6541h + i;
                                case 11:
/* 362 */                           if (obj2 instanceof C2259ul) {
/* 367 */                               size2 = ((C2259ul) obj2).size();
/* 371 */                               iM6542i2 = C1905lw.m6542i(size2);
                                    } else {
/* 382 */                               size2 = ((byte[]) obj2).length;
/* 383 */                               iM6542i2 = C1905lw.m6542i(size2);
                                    }
/* 375 */                           iM6543j2 = iM6542i2 + size2;
/* 512 */                           return iM6543j2 + iM6541h + i;
                                case 12:
/* 354 */                           iM6543j2 = C1905lw.m6542i(((Integer) obj2).intValue());
/* 512 */                           return iM6543j2 + iM6541h + i;
                                case FlutterTextUtils.CARRIAGE_RETURN /* 13 */:
/* 341 */                           iM6543j2 = C1905lw.m6543j(((Integer) obj2).intValue());
/* 512 */                           return iM6543j2 + iM6541h + i;
                                case 14:
/* 327 */                           ((Integer) obj2).getClass();
/* 330 */                           iM6543j2 = 4;
/* 512 */                           return iM6543j2 + iM6541h + i;
                                case WebSocketProtocol.B0_MASK_OPCODE /* 15 */:
/* 318 */                           ((Long) obj2).getClass();
/* 321 */                           iM6543j2 = 8;
/* 512 */                           return iM6543j2 + iM6541h + i;
                                case 16:
/* 300 */                           int iIntValue11 = ((Integer) obj2).intValue();
/* 309 */                           iM6543j2 = C1905lw.m6542i((iIntValue11 >> 31) ^ (iIntValue11 << 1));
/* 512 */                           return iM6543j2 + iM6541h + i;
                                case 17:
/* 282 */                           long jLongValue11 = ((Long) obj2).longValue();
/* 291 */                           iM6543j2 = C1905lw.m6543j((jLongValue11 >> 63) ^ (jLongValue11 << 1));
/* 512 */                           return iM6543j2 + iM6541h + i;
                                default:
/* 275 */                           f42.m3663s("There is no way to get here, but the compiler thinks otherwise.");
/* 28 */                            return 0;
                            }
                        case 11:
/* 120 */                   if (obj instanceof C2259ul) {
/* 124 */                       size = ((C2259ul) obj).size();
/* 128 */                       iM6542i = C1905lw.m6542i(size);
                            } else {
/* 137 */                       size = ((byte[]) obj).length;
/* 138 */                       iM6542i = C1905lw.m6542i(size);
                            }
/* 132 */                   iM6543j = size + iM6542i;
/* 254 */                   i = iM6543j + iM6541h2;
/* 257 */                   y83Var = (y83) ac1Var.f178c;
/* 260 */                   iM6541h = C1905lw.m6541h(2);
/* 264 */                   if (y83Var == v83Var) {
/* 266 */                       iM6541h *= 2;
                            }
                            switch (y83Var.ordinal()) {
                                case 0:
/* 506 */                           ((Double) obj2).getClass();
/* 321 */                           iM6543j2 = 8;
/* 512 */                           return iM6543j2 + iM6541h + i;
                                case 1:
/* 498 */                           ((Float) obj2).getClass();
/* 330 */                           iM6543j2 = 4;
/* 512 */                           return iM6543j2 + iM6541h + i;
                                case 2:
/* 490 */                           iM6543j2 = C1905lw.m6543j(((Long) obj2).longValue());
/* 512 */                           return iM6543j2 + iM6541h + i;
                                case 3:
/* 478 */                           iM6543j2 = C1905lw.m6543j(((Long) obj2).longValue());
/* 512 */                           return iM6543j2 + iM6541h + i;
                                case 4:
/* 466 */                           iM6543j2 = C1905lw.m6543j(((Integer) obj2).intValue());
/* 512 */                           return iM6543j2 + iM6541h + i;
                                case 5:
/* 453 */                           ((Long) obj2).getClass();
/* 321 */                           iM6543j2 = 8;
/* 512 */                           return iM6543j2 + iM6541h + i;
                                case 6:
/* 446 */                           ((Integer) obj2).getClass();
/* 330 */                           iM6543j2 = 4;
/* 512 */                           return iM6543j2 + iM6541h + i;
                                case 7:
/* 439 */                           ((Boolean) obj2).getClass();
/* 512 */                           return iM6543j2 + iM6541h + i;
                                case 8:
/* 414 */                           if (obj2 instanceof C2259ul) {
/* 419 */                               size2 = ((C2259ul) obj2).size();
/* 423 */                               iM6542i2 = C1905lw.m6542i(size2);
/* 375 */                               iM6543j2 = iM6542i2 + size2;
                                    } else {
/* 431 */                               iM6543j2 = C1905lw.m6540g((String) obj2);
                                    }
/* 512 */                           return iM6543j2 + iM6541h + i;
                                case 9:
/* 407 */                           iM6543j2 = ((tq0) ((AbstractC2350x) obj2)).mo8856a(null);
/* 512 */                           return iM6543j2 + iM6541h + i;
                                case 10:
/* 393 */                           size2 = ((tq0) ((AbstractC2350x) obj2)).mo8856a(null);
/* 397 */                           iM6542i2 = C1905lw.m6542i(size2);
/* 375 */                           iM6543j2 = iM6542i2 + size2;
/* 512 */                           return iM6543j2 + iM6541h + i;
                                case 11:
/* 362 */                           if (obj2 instanceof C2259ul) {
/* 367 */                               size2 = ((C2259ul) obj2).size();
/* 371 */                               iM6542i2 = C1905lw.m6542i(size2);
                                    } else {
/* 382 */                               size2 = ((byte[]) obj2).length;
/* 383 */                               iM6542i2 = C1905lw.m6542i(size2);
                                    }
/* 375 */                           iM6543j2 = iM6542i2 + size2;
/* 512 */                           return iM6543j2 + iM6541h + i;
                                case 12:
/* 354 */                           iM6543j2 = C1905lw.m6542i(((Integer) obj2).intValue());
/* 512 */                           return iM6543j2 + iM6541h + i;
                                case FlutterTextUtils.CARRIAGE_RETURN /* 13 */:
/* 341 */                           iM6543j2 = C1905lw.m6543j(((Integer) obj2).intValue());
/* 512 */                           return iM6543j2 + iM6541h + i;
                                case 14:
/* 327 */                           ((Integer) obj2).getClass();
/* 330 */                           iM6543j2 = 4;
/* 512 */                           return iM6543j2 + iM6541h + i;
                                case WebSocketProtocol.B0_MASK_OPCODE /* 15 */:
/* 318 */                           ((Long) obj2).getClass();
/* 321 */                           iM6543j2 = 8;
/* 512 */                           return iM6543j2 + iM6541h + i;
                                case 16:
/* 300 */                           int iIntValue12 = ((Integer) obj2).intValue();
/* 309 */                           iM6543j2 = C1905lw.m6542i((iIntValue12 >> 31) ^ (iIntValue12 << 1));
/* 512 */                           return iM6543j2 + iM6541h + i;
                                case 17:
/* 282 */                           long jLongValue12 = ((Long) obj2).longValue();
/* 291 */                           iM6543j2 = C1905lw.m6543j((jLongValue12 >> 63) ^ (jLongValue12 << 1));
/* 512 */                           return iM6543j2 + iM6541h + i;
                                default:
/* 275 */                           f42.m3663s("There is no way to get here, but the compiler thinks otherwise.");
/* 28 */                            return 0;
                            }
                        case 12:
/* 112 */                   iM6543j = C1905lw.m6542i(((Integer) obj).intValue());
/* 254 */                   i = iM6543j + iM6541h2;
/* 257 */                   y83Var = (y83) ac1Var.f178c;
/* 260 */                   iM6541h = C1905lw.m6541h(2);
/* 264 */                   if (y83Var == v83Var) {
/* 266 */                       iM6541h *= 2;
                            }
                            switch (y83Var.ordinal()) {
                                case 0:
/* 506 */                           ((Double) obj2).getClass();
/* 321 */                           iM6543j2 = 8;
/* 512 */                           return iM6543j2 + iM6541h + i;
                                case 1:
/* 498 */                           ((Float) obj2).getClass();
/* 330 */                           iM6543j2 = 4;
/* 512 */                           return iM6543j2 + iM6541h + i;
                                case 2:
/* 490 */                           iM6543j2 = C1905lw.m6543j(((Long) obj2).longValue());
/* 512 */                           return iM6543j2 + iM6541h + i;
                                case 3:
/* 478 */                           iM6543j2 = C1905lw.m6543j(((Long) obj2).longValue());
/* 512 */                           return iM6543j2 + iM6541h + i;
                                case 4:
/* 466 */                           iM6543j2 = C1905lw.m6543j(((Integer) obj2).intValue());
/* 512 */                           return iM6543j2 + iM6541h + i;
                                case 5:
/* 453 */                           ((Long) obj2).getClass();
/* 321 */                           iM6543j2 = 8;
/* 512 */                           return iM6543j2 + iM6541h + i;
                                case 6:
/* 446 */                           ((Integer) obj2).getClass();
/* 330 */                           iM6543j2 = 4;
/* 512 */                           return iM6543j2 + iM6541h + i;
                                case 7:
/* 439 */                           ((Boolean) obj2).getClass();
/* 512 */                           return iM6543j2 + iM6541h + i;
                                case 8:
/* 414 */                           if (obj2 instanceof C2259ul) {
/* 419 */                               size2 = ((C2259ul) obj2).size();
/* 423 */                               iM6542i2 = C1905lw.m6542i(size2);
/* 375 */                               iM6543j2 = iM6542i2 + size2;
                                    } else {
/* 431 */                               iM6543j2 = C1905lw.m6540g((String) obj2);
                                    }
/* 512 */                           return iM6543j2 + iM6541h + i;
                                case 9:
/* 407 */                           iM6543j2 = ((tq0) ((AbstractC2350x) obj2)).mo8856a(null);
/* 512 */                           return iM6543j2 + iM6541h + i;
                                case 10:
/* 393 */                           size2 = ((tq0) ((AbstractC2350x) obj2)).mo8856a(null);
/* 397 */                           iM6542i2 = C1905lw.m6542i(size2);
/* 375 */                           iM6543j2 = iM6542i2 + size2;
/* 512 */                           return iM6543j2 + iM6541h + i;
                                case 11:
/* 362 */                           if (obj2 instanceof C2259ul) {
/* 367 */                               size2 = ((C2259ul) obj2).size();
/* 371 */                               iM6542i2 = C1905lw.m6542i(size2);
                                    } else {
/* 382 */                               size2 = ((byte[]) obj2).length;
/* 383 */                               iM6542i2 = C1905lw.m6542i(size2);
                                    }
/* 375 */                           iM6543j2 = iM6542i2 + size2;
/* 512 */                           return iM6543j2 + iM6541h + i;
                                case 12:
/* 354 */                           iM6543j2 = C1905lw.m6542i(((Integer) obj2).intValue());
/* 512 */                           return iM6543j2 + iM6541h + i;
                                case FlutterTextUtils.CARRIAGE_RETURN /* 13 */:
/* 341 */                           iM6543j2 = C1905lw.m6543j(((Integer) obj2).intValue());
/* 512 */                           return iM6543j2 + iM6541h + i;
                                case 14:
/* 327 */                           ((Integer) obj2).getClass();
/* 330 */                           iM6543j2 = 4;
/* 512 */                           return iM6543j2 + iM6541h + i;
                                case WebSocketProtocol.B0_MASK_OPCODE /* 15 */:
/* 318 */                           ((Long) obj2).getClass();
/* 321 */                           iM6543j2 = 8;
/* 512 */                           return iM6543j2 + iM6541h + i;
                                case 16:
/* 300 */                           int iIntValue13 = ((Integer) obj2).intValue();
/* 309 */                           iM6543j2 = C1905lw.m6542i((iIntValue13 >> 31) ^ (iIntValue13 << 1));
/* 512 */                           return iM6543j2 + iM6541h + i;
                                case 17:
/* 282 */                           long jLongValue13 = ((Long) obj2).longValue();
/* 291 */                           iM6543j2 = C1905lw.m6543j((jLongValue13 >> 63) ^ (jLongValue13 << 1));
/* 512 */                           return iM6543j2 + iM6541h + i;
                                default:
/* 275 */                           f42.m3663s("There is no way to get here, but the compiler thinks otherwise.");
/* 28 */                            return 0;
                            }
                        case FlutterTextUtils.CARRIAGE_RETURN /* 13 */:
/* 100 */                   iM6543j = C1905lw.m6543j(((Integer) obj).intValue());
/* 254 */                   i = iM6543j + iM6541h2;
/* 257 */                   y83Var = (y83) ac1Var.f178c;
/* 260 */                   iM6541h = C1905lw.m6541h(2);
/* 264 */                   if (y83Var == v83Var) {
/* 266 */                       iM6541h *= 2;
                            }
                            switch (y83Var.ordinal()) {
                                case 0:
/* 506 */                           ((Double) obj2).getClass();
/* 321 */                           iM6543j2 = 8;
/* 512 */                           return iM6543j2 + iM6541h + i;
                                case 1:
/* 498 */                           ((Float) obj2).getClass();
/* 330 */                           iM6543j2 = 4;
/* 512 */                           return iM6543j2 + iM6541h + i;
                                case 2:
/* 490 */                           iM6543j2 = C1905lw.m6543j(((Long) obj2).longValue());
/* 512 */                           return iM6543j2 + iM6541h + i;
                                case 3:
/* 478 */                           iM6543j2 = C1905lw.m6543j(((Long) obj2).longValue());
/* 512 */                           return iM6543j2 + iM6541h + i;
                                case 4:
/* 466 */                           iM6543j2 = C1905lw.m6543j(((Integer) obj2).intValue());
/* 512 */                           return iM6543j2 + iM6541h + i;
                                case 5:
/* 453 */                           ((Long) obj2).getClass();
/* 321 */                           iM6543j2 = 8;
/* 512 */                           return iM6543j2 + iM6541h + i;
                                case 6:
/* 446 */                           ((Integer) obj2).getClass();
/* 330 */                           iM6543j2 = 4;
/* 512 */                           return iM6543j2 + iM6541h + i;
                                case 7:
/* 439 */                           ((Boolean) obj2).getClass();
/* 512 */                           return iM6543j2 + iM6541h + i;
                                case 8:
/* 414 */                           if (obj2 instanceof C2259ul) {
/* 419 */                               size2 = ((C2259ul) obj2).size();
/* 423 */                               iM6542i2 = C1905lw.m6542i(size2);
/* 375 */                               iM6543j2 = iM6542i2 + size2;
                                    } else {
/* 431 */                               iM6543j2 = C1905lw.m6540g((String) obj2);
                                    }
/* 512 */                           return iM6543j2 + iM6541h + i;
                                case 9:
/* 407 */                           iM6543j2 = ((tq0) ((AbstractC2350x) obj2)).mo8856a(null);
/* 512 */                           return iM6543j2 + iM6541h + i;
                                case 10:
/* 393 */                           size2 = ((tq0) ((AbstractC2350x) obj2)).mo8856a(null);
/* 397 */                           iM6542i2 = C1905lw.m6542i(size2);
/* 375 */                           iM6543j2 = iM6542i2 + size2;
/* 512 */                           return iM6543j2 + iM6541h + i;
                                case 11:
/* 362 */                           if (obj2 instanceof C2259ul) {
/* 367 */                               size2 = ((C2259ul) obj2).size();
/* 371 */                               iM6542i2 = C1905lw.m6542i(size2);
                                    } else {
/* 382 */                               size2 = ((byte[]) obj2).length;
/* 383 */                               iM6542i2 = C1905lw.m6542i(size2);
                                    }
/* 375 */                           iM6543j2 = iM6542i2 + size2;
/* 512 */                           return iM6543j2 + iM6541h + i;
                                case 12:
/* 354 */                           iM6543j2 = C1905lw.m6542i(((Integer) obj2).intValue());
/* 512 */                           return iM6543j2 + iM6541h + i;
                                case FlutterTextUtils.CARRIAGE_RETURN /* 13 */:
/* 341 */                           iM6543j2 = C1905lw.m6543j(((Integer) obj2).intValue());
/* 512 */                           return iM6543j2 + iM6541h + i;
                                case 14:
/* 327 */                           ((Integer) obj2).getClass();
/* 330 */                           iM6543j2 = 4;
/* 512 */                           return iM6543j2 + iM6541h + i;
                                case WebSocketProtocol.B0_MASK_OPCODE /* 15 */:
/* 318 */                           ((Long) obj2).getClass();
/* 321 */                           iM6543j2 = 8;
/* 512 */                           return iM6543j2 + iM6541h + i;
                                case 16:
/* 300 */                           int iIntValue14 = ((Integer) obj2).intValue();
/* 309 */                           iM6543j2 = C1905lw.m6542i((iIntValue14 >> 31) ^ (iIntValue14 << 1));
/* 512 */                           return iM6543j2 + iM6541h + i;
                                case 17:
/* 282 */                           long jLongValue14 = ((Long) obj2).longValue();
/* 291 */                           iM6543j2 = C1905lw.m6543j((jLongValue14 >> 63) ^ (jLongValue14 << 1));
/* 512 */                           return iM6543j2 + iM6541h + i;
                                default:
/* 275 */                           f42.m3663s("There is no way to get here, but the compiler thinks otherwise.");
/* 28 */                            return 0;
                            }
                        case 14:
/* 87 */                    ((Integer) obj).getClass();
/* 90 */                    iM6543j = 4;
/* 254 */                   i = iM6543j + iM6541h2;
/* 257 */                   y83Var = (y83) ac1Var.f178c;
/* 260 */                   iM6541h = C1905lw.m6541h(2);
/* 264 */                   if (y83Var == v83Var) {
/* 266 */                       iM6541h *= 2;
                            }
                            switch (y83Var.ordinal()) {
                                case 0:
/* 506 */                           ((Double) obj2).getClass();
/* 321 */                           iM6543j2 = 8;
/* 512 */                           return iM6543j2 + iM6541h + i;
                                case 1:
/* 498 */                           ((Float) obj2).getClass();
/* 330 */                           iM6543j2 = 4;
/* 512 */                           return iM6543j2 + iM6541h + i;
                                case 2:
/* 490 */                           iM6543j2 = C1905lw.m6543j(((Long) obj2).longValue());
/* 512 */                           return iM6543j2 + iM6541h + i;
                                case 3:
/* 478 */                           iM6543j2 = C1905lw.m6543j(((Long) obj2).longValue());
/* 512 */                           return iM6543j2 + iM6541h + i;
                                case 4:
/* 466 */                           iM6543j2 = C1905lw.m6543j(((Integer) obj2).intValue());
/* 512 */                           return iM6543j2 + iM6541h + i;
                                case 5:
/* 453 */                           ((Long) obj2).getClass();
/* 321 */                           iM6543j2 = 8;
/* 512 */                           return iM6543j2 + iM6541h + i;
                                case 6:
/* 446 */                           ((Integer) obj2).getClass();
/* 330 */                           iM6543j2 = 4;
/* 512 */                           return iM6543j2 + iM6541h + i;
                                case 7:
/* 439 */                           ((Boolean) obj2).getClass();
/* 512 */                           return iM6543j2 + iM6541h + i;
                                case 8:
/* 414 */                           if (obj2 instanceof C2259ul) {
/* 419 */                               size2 = ((C2259ul) obj2).size();
/* 423 */                               iM6542i2 = C1905lw.m6542i(size2);
/* 375 */                               iM6543j2 = iM6542i2 + size2;
                                    } else {
/* 431 */                               iM6543j2 = C1905lw.m6540g((String) obj2);
                                    }
/* 512 */                           return iM6543j2 + iM6541h + i;
                                case 9:
/* 407 */                           iM6543j2 = ((tq0) ((AbstractC2350x) obj2)).mo8856a(null);
/* 512 */                           return iM6543j2 + iM6541h + i;
                                case 10:
/* 393 */                           size2 = ((tq0) ((AbstractC2350x) obj2)).mo8856a(null);
/* 397 */                           iM6542i2 = C1905lw.m6542i(size2);
/* 375 */                           iM6543j2 = iM6542i2 + size2;
/* 512 */                           return iM6543j2 + iM6541h + i;
                                case 11:
/* 362 */                           if (obj2 instanceof C2259ul) {
/* 367 */                               size2 = ((C2259ul) obj2).size();
/* 371 */                               iM6542i2 = C1905lw.m6542i(size2);
                                    } else {
/* 382 */                               size2 = ((byte[]) obj2).length;
/* 383 */                               iM6542i2 = C1905lw.m6542i(size2);
                                    }
/* 375 */                           iM6543j2 = iM6542i2 + size2;
/* 512 */                           return iM6543j2 + iM6541h + i;
                                case 12:
/* 354 */                           iM6543j2 = C1905lw.m6542i(((Integer) obj2).intValue());
/* 512 */                           return iM6543j2 + iM6541h + i;
                                case FlutterTextUtils.CARRIAGE_RETURN /* 13 */:
/* 341 */                           iM6543j2 = C1905lw.m6543j(((Integer) obj2).intValue());
/* 512 */                           return iM6543j2 + iM6541h + i;
                                case 14:
/* 327 */                           ((Integer) obj2).getClass();
/* 330 */                           iM6543j2 = 4;
/* 512 */                           return iM6543j2 + iM6541h + i;
                                case WebSocketProtocol.B0_MASK_OPCODE /* 15 */:
/* 318 */                           ((Long) obj2).getClass();
/* 321 */                           iM6543j2 = 8;
/* 512 */                           return iM6543j2 + iM6541h + i;
                                case 16:
/* 300 */                           int iIntValue15 = ((Integer) obj2).intValue();
/* 309 */                           iM6543j2 = C1905lw.m6542i((iIntValue15 >> 31) ^ (iIntValue15 << 1));
/* 512 */                           return iM6543j2 + iM6541h + i;
                                case 17:
/* 282 */                           long jLongValue15 = ((Long) obj2).longValue();
/* 291 */                           iM6543j2 = C1905lw.m6543j((jLongValue15 >> 63) ^ (jLongValue15 << 1));
/* 512 */                           return iM6543j2 + iM6541h + i;
                                default:
/* 275 */                           f42.m3663s("There is no way to get here, but the compiler thinks otherwise.");
/* 28 */                            return 0;
                            }
                        case WebSocketProtocol.B0_MASK_OPCODE /* 15 */:
/* 79 */                    ((Long) obj).getClass();
/* 82 */                    iM6543j = 8;
/* 254 */                   i = iM6543j + iM6541h2;
/* 257 */                   y83Var = (y83) ac1Var.f178c;
/* 260 */                   iM6541h = C1905lw.m6541h(2);
/* 264 */                   if (y83Var == v83Var) {
/* 266 */                       iM6541h *= 2;
                            }
                            switch (y83Var.ordinal()) {
                                case 0:
/* 506 */                           ((Double) obj2).getClass();
/* 321 */                           iM6543j2 = 8;
/* 512 */                           return iM6543j2 + iM6541h + i;
                                case 1:
/* 498 */                           ((Float) obj2).getClass();
/* 330 */                           iM6543j2 = 4;
/* 512 */                           return iM6543j2 + iM6541h + i;
                                case 2:
/* 490 */                           iM6543j2 = C1905lw.m6543j(((Long) obj2).longValue());
/* 512 */                           return iM6543j2 + iM6541h + i;
                                case 3:
/* 478 */                           iM6543j2 = C1905lw.m6543j(((Long) obj2).longValue());
/* 512 */                           return iM6543j2 + iM6541h + i;
                                case 4:
/* 466 */                           iM6543j2 = C1905lw.m6543j(((Integer) obj2).intValue());
/* 512 */                           return iM6543j2 + iM6541h + i;
                                case 5:
/* 453 */                           ((Long) obj2).getClass();
/* 321 */                           iM6543j2 = 8;
/* 512 */                           return iM6543j2 + iM6541h + i;
                                case 6:
/* 446 */                           ((Integer) obj2).getClass();
/* 330 */                           iM6543j2 = 4;
/* 512 */                           return iM6543j2 + iM6541h + i;
                                case 7:
/* 439 */                           ((Boolean) obj2).getClass();
/* 512 */                           return iM6543j2 + iM6541h + i;
                                case 8:
/* 414 */                           if (obj2 instanceof C2259ul) {
/* 419 */                               size2 = ((C2259ul) obj2).size();
/* 423 */                               iM6542i2 = C1905lw.m6542i(size2);
/* 375 */                               iM6543j2 = iM6542i2 + size2;
                                    } else {
/* 431 */                               iM6543j2 = C1905lw.m6540g((String) obj2);
                                    }
/* 512 */                           return iM6543j2 + iM6541h + i;
                                case 9:
/* 407 */                           iM6543j2 = ((tq0) ((AbstractC2350x) obj2)).mo8856a(null);
/* 512 */                           return iM6543j2 + iM6541h + i;
                                case 10:
/* 393 */                           size2 = ((tq0) ((AbstractC2350x) obj2)).mo8856a(null);
/* 397 */                           iM6542i2 = C1905lw.m6542i(size2);
/* 375 */                           iM6543j2 = iM6542i2 + size2;
/* 512 */                           return iM6543j2 + iM6541h + i;
                                case 11:
/* 362 */                           if (obj2 instanceof C2259ul) {
/* 367 */                               size2 = ((C2259ul) obj2).size();
/* 371 */                               iM6542i2 = C1905lw.m6542i(size2);
                                    } else {
/* 382 */                               size2 = ((byte[]) obj2).length;
/* 383 */                               iM6542i2 = C1905lw.m6542i(size2);
                                    }
/* 375 */                           iM6543j2 = iM6542i2 + size2;
/* 512 */                           return iM6543j2 + iM6541h + i;
                                case 12:
/* 354 */                           iM6543j2 = C1905lw.m6542i(((Integer) obj2).intValue());
/* 512 */                           return iM6543j2 + iM6541h + i;
                                case FlutterTextUtils.CARRIAGE_RETURN /* 13 */:
/* 341 */                           iM6543j2 = C1905lw.m6543j(((Integer) obj2).intValue());
/* 512 */                           return iM6543j2 + iM6541h + i;
                                case 14:
/* 327 */                           ((Integer) obj2).getClass();
/* 330 */                           iM6543j2 = 4;
/* 512 */                           return iM6543j2 + iM6541h + i;
                                case WebSocketProtocol.B0_MASK_OPCODE /* 15 */:
/* 318 */                           ((Long) obj2).getClass();
/* 321 */                           iM6543j2 = 8;
/* 512 */                           return iM6543j2 + iM6541h + i;
                                case 16:
/* 300 */                           int iIntValue16 = ((Integer) obj2).intValue();
/* 309 */                           iM6543j2 = C1905lw.m6542i((iIntValue16 >> 31) ^ (iIntValue16 << 1));
/* 512 */                           return iM6543j2 + iM6541h + i;
                                case 17:
/* 282 */                           long jLongValue16 = ((Long) obj2).longValue();
/* 291 */                           iM6543j2 = C1905lw.m6543j((jLongValue16 >> 63) ^ (jLongValue16 << 1));
/* 512 */                           return iM6543j2 + iM6541h + i;
                                default:
/* 275 */                           f42.m3663s("There is no way to get here, but the compiler thinks otherwise.");
/* 28 */                            return 0;
                            }
                        case 16:
/* 62 */                    int iIntValue17 = ((Integer) obj).intValue();
/* 71 */                    iM6543j = C1905lw.m6542i((iIntValue17 >> 31) ^ (iIntValue17 << 1));
/* 254 */                   i = iM6543j + iM6541h2;
/* 257 */                   y83Var = (y83) ac1Var.f178c;
/* 260 */                   iM6541h = C1905lw.m6541h(2);
/* 264 */                   if (y83Var == v83Var) {
/* 266 */                       iM6541h *= 2;
                            }
                            switch (y83Var.ordinal()) {
                                case 0:
/* 506 */                           ((Double) obj2).getClass();
/* 321 */                           iM6543j2 = 8;
/* 512 */                           return iM6543j2 + iM6541h + i;
                                case 1:
/* 498 */                           ((Float) obj2).getClass();
/* 330 */                           iM6543j2 = 4;
/* 512 */                           return iM6543j2 + iM6541h + i;
                                case 2:
/* 490 */                           iM6543j2 = C1905lw.m6543j(((Long) obj2).longValue());
/* 512 */                           return iM6543j2 + iM6541h + i;
                                case 3:
/* 478 */                           iM6543j2 = C1905lw.m6543j(((Long) obj2).longValue());
/* 512 */                           return iM6543j2 + iM6541h + i;
                                case 4:
/* 466 */                           iM6543j2 = C1905lw.m6543j(((Integer) obj2).intValue());
/* 512 */                           return iM6543j2 + iM6541h + i;
                                case 5:
/* 453 */                           ((Long) obj2).getClass();
/* 321 */                           iM6543j2 = 8;
/* 512 */                           return iM6543j2 + iM6541h + i;
                                case 6:
/* 446 */                           ((Integer) obj2).getClass();
/* 330 */                           iM6543j2 = 4;
/* 512 */                           return iM6543j2 + iM6541h + i;
                                case 7:
/* 439 */                           ((Boolean) obj2).getClass();
/* 512 */                           return iM6543j2 + iM6541h + i;
                                case 8:
/* 414 */                           if (obj2 instanceof C2259ul) {
/* 419 */                               size2 = ((C2259ul) obj2).size();
/* 423 */                               iM6542i2 = C1905lw.m6542i(size2);
/* 375 */                               iM6543j2 = iM6542i2 + size2;
                                    } else {
/* 431 */                               iM6543j2 = C1905lw.m6540g((String) obj2);
                                    }
/* 512 */                           return iM6543j2 + iM6541h + i;
                                case 9:
/* 407 */                           iM6543j2 = ((tq0) ((AbstractC2350x) obj2)).mo8856a(null);
/* 512 */                           return iM6543j2 + iM6541h + i;
                                case 10:
/* 393 */                           size2 = ((tq0) ((AbstractC2350x) obj2)).mo8856a(null);
/* 397 */                           iM6542i2 = C1905lw.m6542i(size2);
/* 375 */                           iM6543j2 = iM6542i2 + size2;
/* 512 */                           return iM6543j2 + iM6541h + i;
                                case 11:
/* 362 */                           if (obj2 instanceof C2259ul) {
/* 367 */                               size2 = ((C2259ul) obj2).size();
/* 371 */                               iM6542i2 = C1905lw.m6542i(size2);
                                    } else {
/* 382 */                               size2 = ((byte[]) obj2).length;
/* 383 */                               iM6542i2 = C1905lw.m6542i(size2);
                                    }
/* 375 */                           iM6543j2 = iM6542i2 + size2;
/* 512 */                           return iM6543j2 + iM6541h + i;
                                case 12:
/* 354 */                           iM6543j2 = C1905lw.m6542i(((Integer) obj2).intValue());
/* 512 */                           return iM6543j2 + iM6541h + i;
                                case FlutterTextUtils.CARRIAGE_RETURN /* 13 */:
/* 341 */                           iM6543j2 = C1905lw.m6543j(((Integer) obj2).intValue());
/* 512 */                           return iM6543j2 + iM6541h + i;
                                case 14:
/* 327 */                           ((Integer) obj2).getClass();
/* 330 */                           iM6543j2 = 4;
/* 512 */                           return iM6543j2 + iM6541h + i;
                                case WebSocketProtocol.B0_MASK_OPCODE /* 15 */:
/* 318 */                           ((Long) obj2).getClass();
/* 321 */                           iM6543j2 = 8;
/* 512 */                           return iM6543j2 + iM6541h + i;
                                case 16:
/* 300 */                           int iIntValue18 = ((Integer) obj2).intValue();
/* 309 */                           iM6543j2 = C1905lw.m6542i((iIntValue18 >> 31) ^ (iIntValue18 << 1));
/* 512 */                           return iM6543j2 + iM6541h + i;
                                case 17:
/* 282 */                           long jLongValue17 = ((Long) obj2).longValue();
/* 291 */                           iM6543j2 = C1905lw.m6543j((jLongValue17 >> 63) ^ (jLongValue17 << 1));
/* 512 */                           return iM6543j2 + iM6541h + i;
                                default:
/* 275 */                           f42.m3663s("There is no way to get here, but the compiler thinks otherwise.");
/* 28 */                            return 0;
                            }
                        case 17:
/* 46 */                    long jLongValue18 = ((Long) obj).longValue();
/* 54 */                    iM6543j = C1905lw.m6543j((jLongValue18 >> 63) ^ (jLongValue18 << 1));
/* 254 */                   i = iM6543j + iM6541h2;
/* 257 */                   y83Var = (y83) ac1Var.f178c;
/* 260 */                   iM6541h = C1905lw.m6541h(2);
/* 264 */                   if (y83Var == v83Var) {
/* 266 */                       iM6541h *= 2;
                            }
                            switch (y83Var.ordinal()) {
                                case 0:
/* 506 */                           ((Double) obj2).getClass();
/* 321 */                           iM6543j2 = 8;
/* 512 */                           return iM6543j2 + iM6541h + i;
                                case 1:
/* 498 */                           ((Float) obj2).getClass();
/* 330 */                           iM6543j2 = 4;
/* 512 */                           return iM6543j2 + iM6541h + i;
                                case 2:
/* 490 */                           iM6543j2 = C1905lw.m6543j(((Long) obj2).longValue());
/* 512 */                           return iM6543j2 + iM6541h + i;
                                case 3:
/* 478 */                           iM6543j2 = C1905lw.m6543j(((Long) obj2).longValue());
/* 512 */                           return iM6543j2 + iM6541h + i;
                                case 4:
/* 466 */                           iM6543j2 = C1905lw.m6543j(((Integer) obj2).intValue());
/* 512 */                           return iM6543j2 + iM6541h + i;
                                case 5:
/* 453 */                           ((Long) obj2).getClass();
/* 321 */                           iM6543j2 = 8;
/* 512 */                           return iM6543j2 + iM6541h + i;
                                case 6:
/* 446 */                           ((Integer) obj2).getClass();
/* 330 */                           iM6543j2 = 4;
/* 512 */                           return iM6543j2 + iM6541h + i;
                                case 7:
/* 439 */                           ((Boolean) obj2).getClass();
/* 512 */                           return iM6543j2 + iM6541h + i;
                                case 8:
/* 414 */                           if (obj2 instanceof C2259ul) {
/* 419 */                               size2 = ((C2259ul) obj2).size();
/* 423 */                               iM6542i2 = C1905lw.m6542i(size2);
/* 375 */                               iM6543j2 = iM6542i2 + size2;
                                    } else {
/* 431 */                               iM6543j2 = C1905lw.m6540g((String) obj2);
                                    }
/* 512 */                           return iM6543j2 + iM6541h + i;
                                case 9:
/* 407 */                           iM6543j2 = ((tq0) ((AbstractC2350x) obj2)).mo8856a(null);
/* 512 */                           return iM6543j2 + iM6541h + i;
                                case 10:
/* 393 */                           size2 = ((tq0) ((AbstractC2350x) obj2)).mo8856a(null);
/* 397 */                           iM6542i2 = C1905lw.m6542i(size2);
/* 375 */                           iM6543j2 = iM6542i2 + size2;
/* 512 */                           return iM6543j2 + iM6541h + i;
                                case 11:
/* 362 */                           if (obj2 instanceof C2259ul) {
/* 367 */                               size2 = ((C2259ul) obj2).size();
/* 371 */                               iM6542i2 = C1905lw.m6542i(size2);
                                    } else {
/* 382 */                               size2 = ((byte[]) obj2).length;
/* 383 */                               iM6542i2 = C1905lw.m6542i(size2);
                                    }
/* 375 */                           iM6543j2 = iM6542i2 + size2;
/* 512 */                           return iM6543j2 + iM6541h + i;
                                case 12:
/* 354 */                           iM6543j2 = C1905lw.m6542i(((Integer) obj2).intValue());
/* 512 */                           return iM6543j2 + iM6541h + i;
                                case FlutterTextUtils.CARRIAGE_RETURN /* 13 */:
/* 341 */                           iM6543j2 = C1905lw.m6543j(((Integer) obj2).intValue());
/* 512 */                           return iM6543j2 + iM6541h + i;
                                case 14:
/* 327 */                           ((Integer) obj2).getClass();
/* 330 */                           iM6543j2 = 4;
/* 512 */                           return iM6543j2 + iM6541h + i;
                                case WebSocketProtocol.B0_MASK_OPCODE /* 15 */:
/* 318 */                           ((Long) obj2).getClass();
/* 321 */                           iM6543j2 = 8;
/* 512 */                           return iM6543j2 + iM6541h + i;
                                case 16:
/* 300 */                           int iIntValue19 = ((Integer) obj2).intValue();
/* 309 */                           iM6543j2 = C1905lw.m6542i((iIntValue19 >> 31) ^ (iIntValue19 << 1));
/* 512 */                           return iM6543j2 + iM6541h + i;
                                case 17:
/* 282 */                           long jLongValue19 = ((Long) obj2).longValue();
/* 291 */                           iM6543j2 = C1905lw.m6543j((jLongValue19 >> 63) ^ (jLongValue19 << 1));
/* 512 */                           return iM6543j2 + iM6541h + i;
                                default:
/* 275 */                           f42.m3663s("There is no way to get here, but the compiler thinks otherwise.");
/* 28 */                            return 0;
                            }
                        default:
/* 40 */                    f42.m3663s("There is no way to get here, but the compiler thinks otherwise.");
/* 28 */                    return 0;
                    }
                }
            }
