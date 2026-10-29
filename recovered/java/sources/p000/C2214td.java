            package p000;

            import android.content.Context;
            import android.util.TypedValue;
            import com.appsflyer.attribution.RequestError;
            import io.flutter.Build;
            import io.flutter.plugin.editing.FlutterTextUtils;
            import java.io.File;
            import java.io.IOException;
            import java.io.InputStream;
            import java.net.URLConnection;
            import java.util.concurrent.LinkedBlockingDeque;
            import java.util.concurrent.ThreadPoolExecutor;
            import java.util.concurrent.TimeUnit;
            import java.util.zip.GZIPInputStream;
            import okhttp3.internal.p013ws.WebSocketProtocol;
            
            /* JADX INFO: renamed from: td */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C2214td implements rc0 {

                /* JADX INFO: renamed from: a */
                public final Context f17045a;

                public C2214td(Context context, int i) {
                    switch (i) {
                        case 1:
/* 17 */                    this.f17045a = context.getApplicationContext();
                            break;
                        default:
/* 7 */                     this.f17045a = context;
                            break;
                    }
                }

                /* JADX INFO: renamed from: b */
                public static String m8781b(File file) throws IOException {
/* 1 */             String canonicalPath = file.getCanonicalPath();
                    return !canonicalPath.endsWith("/") ? canonicalPath.concat("/") : canonicalPath;
                }

                /* JADX INFO: renamed from: c */
                public static String m8782c(String str) {
/* 1 */             String str2 = null;
/* 2 */             if (str != null) {
/* 6 */                 String strGuessContentTypeFromName = URLConnection.guessContentTypeFromName(str);
/* 10 */                if (strGuessContentTypeFromName == null) {
/* 15 */                    byte b = 46;
/* 17 */                    int iLastIndexOf = str.lastIndexOf(46);
/* 22 */                    if (iLastIndexOf != -1) {
/* 32 */                        String lowerCase = str.substring(iLastIndexOf + 1).toLowerCase();
/* 36 */                        lowerCase.getClass();
                                switch (lowerCase.hashCode()) {
                                    case 3315:
/* 717 */                               b = !lowerCase.equals("gz") ? (byte) -1 : (byte) 0;
                                        break;
                                    case 3401:
/* 705 */                               b = !lowerCase.equals("js") ? (byte) -1 : (byte) 1;
                                        break;
                                    case 97669:
/* 693 */                               b = !lowerCase.equals("bmp") ? (byte) -1 : (byte) 2;
                                        break;
                                    case 98819:
/* 681 */                               b = !lowerCase.equals("css") ? (byte) -1 : (byte) 3;
                                        break;
                                    case 102340:
/* 669 */                               b = !lowerCase.equals("gif") ? (byte) -1 : (byte) 4;
                                        break;
                                    case 103649:
/* 657 */                               b = !lowerCase.equals("htm") ? (byte) -1 : (byte) 5;
                                        break;
                                    case 104085:
/* 645 */                               b = !lowerCase.equals("ico") ? (byte) -1 : (byte) 6;
                                        break;
                                    case 105441:
/* 633 */                               b = !lowerCase.equals("jpg") ? (byte) -1 : (byte) 7;
                                        break;
                                    case 106458:
/* 619 */                               b = !lowerCase.equals("m4a") ? (byte) -1 : (byte) 8;
                                        break;
                                    case 106479:
/* 605 */                               b = !lowerCase.equals("m4v") ? (byte) -1 : (byte) 9;
                                        break;
                                    case 108089:
/* 591 */                               b = !lowerCase.equals("mht") ? (byte) -1 : (byte) 10;
                                        break;
                                    case 108150:
/* 577 */                               b = !lowerCase.equals("mjs") ? (byte) -1 : (byte) 11;
                                        break;
                                    case 108272:
/* 563 */                               b = !lowerCase.equals("mp3") ? (byte) -1 : (byte) 12;
                                        break;
                                    case 108273:
/* 549 */                               b = !lowerCase.equals("mp4") ? (byte) -1 : (byte) 13;
                                        break;
                                    case 108324:
/* 535 */                               b = !lowerCase.equals("mpg") ? (byte) -1 : (byte) 14;
                                        break;
                                    case 109961:
/* 521 */                               b = !lowerCase.equals("oga") ? (byte) -1 : (byte) 15;
                                        break;
                                    case 109967:
/* 507 */                               b = !lowerCase.equals("ogg") ? (byte) -1 : (byte) 16;
                                        break;
                                    case 109973:
/* 493 */                               b = !lowerCase.equals("ogm") ? (byte) -1 : (byte) 17;
                                        break;
                                    case 109982:
/* 479 */                               b = !lowerCase.equals("ogv") ? (byte) -1 : (byte) 18;
                                        break;
                                    case 110834:
/* 465 */                               b = !lowerCase.equals("pdf") ? (byte) -1 : (byte) 19;
                                        break;
                                    case 111030:
/* 451 */                               b = !lowerCase.equals("pjp") ? (byte) -1 : (byte) 20;
                                        break;
                                    case 111145:
/* 437 */                               b = !lowerCase.equals("png") ? (byte) -1 : (byte) 21;
                                        break;
                                    case 114276:
/* 423 */                               b = !lowerCase.equals("svg") ? (byte) -1 : (byte) 22;
                                        break;
                                    case 114791:
/* 409 */                               b = !lowerCase.equals("tgz") ? (byte) -1 : (byte) 23;
                                        break;
                                    case 114833:
/* 395 */                               b = !lowerCase.equals("tif") ? (byte) -1 : (byte) 24;
                                        break;
                                    case 117484:
/* 381 */                               b = !lowerCase.equals("wav") ? (byte) -1 : (byte) 25;
                                        break;
                                    case 118660:
/* 367 */                               b = !lowerCase.equals("xht") ? (byte) -1 : (byte) 26;
                                        break;
                                    case 118807:
/* 353 */                               b = !lowerCase.equals("xml") ? (byte) -1 : (byte) 27;
                                        break;
                                    case 120609:
/* 339 */                               b = !lowerCase.equals("zip") ? (byte) -1 : (byte) 28;
                                        break;
                                    case 3000872:
/* 325 */                               b = !lowerCase.equals("apng") ? (byte) -1 : (byte) 29;
                                        break;
                                    case 3145576:
/* 311 */                               b = !lowerCase.equals("flac") ? (byte) -1 : (byte) 30;
                                        break;
                                    case 3213227:
/* 297 */                               b = !lowerCase.equals("html") ? (byte) -1 : (byte) 31;
                                        break;
                                    case 3259225:
/* 283 */                               b = !lowerCase.equals("jfif") ? (byte) -1 : (byte) 32;
                                        break;
                                    case 3268712:
/* 269 */                               b = !lowerCase.equals("jpeg") ? (byte) -1 : (byte) 33;
                                        break;
                                    case 3271912:
/* 255 */                               b = !lowerCase.equals("json") ? (byte) -1 : (byte) 34;
                                        break;
                                    case 3358085:
/* 241 */                               b = !lowerCase.equals("mpeg") ? (byte) -1 : (byte) 35;
                                        break;
                                    case 3418175:
/* 227 */                               b = !lowerCase.equals("opus") ? (byte) -1 : (byte) 36;
                                        break;
                                    case 3529614:
/* 213 */                               b = !lowerCase.equals("shtm") ? (byte) -1 : (byte) 37;
                                        break;
                                    case 3542678:
/* 199 */                               b = !lowerCase.equals("svgz") ? (byte) -1 : (byte) 38;
                                        break;
                                    case 3559925:
/* 185 */                               b = !lowerCase.equals("tiff") ? (byte) -1 : (byte) 39;
                                        break;
                                    case 3642020:
/* 171 */                               b = !lowerCase.equals("wasm") ? (byte) -1 : (byte) 40;
                                        break;
                                    case 3645337:
/* 158 */                               b = !lowerCase.equals("webm") ? (byte) -1 : (byte) 41;
                                        break;
                                    case 3645340:
/* 145 */                               b = !lowerCase.equals("webp") ? (byte) -1 : (byte) 42;
                                        break;
                                    case 3655064:
/* 132 */                               b = !lowerCase.equals("woff") ? (byte) -1 : (byte) 43;
                                        break;
                                    case 3678569:
/* 119 */                               b = !lowerCase.equals("xhtm") ? (byte) -1 : (byte) 44;
                                        break;
                                    case 96488848:
/* 106 */                               b = !lowerCase.equals("ehtml") ? (byte) -1 : (byte) 45;
                                        break;
                                    case 103877016:
/* 94 */                                if (!lowerCase.equals("mhtml")) {
/* 46 */                                    b = -1;
                                        }
                                        break;
                                    case 106703064:
/* 84 */                                b = !lowerCase.equals("pjpeg") ? (byte) -1 : (byte) 47;
                                        break;
                                    case 109418142:
/* 71 */                                b = !lowerCase.equals("shtml") ? (byte) -1 : (byte) 48;
                                        break;
                                    case 114035747:
/* 58 */                                b = !lowerCase.equals("xhtml") ? (byte) -1 : (byte) 49;
                                        break;
                                    default:
/* 46 */                                b = -1;
                                        break;
                                }
                                switch (b) {
                                    case 0:
                                    case Build.API_LEVELS.API_23 /* 23 */:
/* 814 */                               str2 = "application/gzip";
                                        break;
                                    case 1:
                                    case 11:
/* 811 */                               str2 = "text/javascript";
                                        break;
                                    case 2:
/* 808 */                               str2 = "image/bmp";
                                        break;
                                    case 3:
/* 805 */                               str2 = "text/css";
                                        break;
                                    case 4:
/* 802 */                               str2 = "image/gif";
                                        break;
                                    case 5:
                                    case Build.API_LEVELS.API_31 /* 31 */:
                                    case 37:
                                    case 45:
                                    case 48:
/* 799 */                               str2 = "text/html";
                                        break;
                                    case 6:
/* 796 */                               str2 = "image/x-icon";
                                        break;
                                    case 7:
                                    case 20:
                                    case 32:
                                    case Build.API_LEVELS.API_33 /* 33 */:
                                    case 47:
/* 793 */                               str2 = "image/jpeg";
                                        break;
                                    case 8:
/* 790 */                               str2 = "audio/x-m4a";
                                        break;
                                    case 9:
                                    case FlutterTextUtils.CARRIAGE_RETURN /* 13 */:
/* 787 */                               str2 = "video/mp4";
                                        break;
                                    case 10:
                                    case 46:
/* 784 */                               str2 = "multipart/related";
                                        break;
                                    case 12:
/* 781 */                               str2 = "audio/mpeg";
                                        break;
                                    case 14:
                                    case Build.API_LEVELS.API_35 /* 35 */:
/* 778 */                               str2 = "video/mpeg";
                                        break;
                                    case WebSocketProtocol.B0_MASK_OPCODE /* 15 */:
                                    case 16:
                                    case Build.API_LEVELS.API_36 /* 36 */:
/* 775 */                               str2 = "audio/ogg";
                                        break;
                                    case 17:
                                    case 18:
/* 772 */                               str2 = "video/ogg";
                                        break;
                                    case 19:
/* 769 */                               str2 = "application/pdf";
                                        break;
                                    case Build.API_LEVELS.API_21 /* 21 */:
/* 766 */                               str2 = "image/png";
                                        break;
                                    case Build.API_LEVELS.API_22 /* 22 */:
                                    case 38:
/* 763 */                               str2 = "image/svg+xml";
                                        break;
                                    case 24:
                                    case 39:
/* 760 */                               str2 = "image/tiff";
                                        break;
                                    case Build.API_LEVELS.API_25 /* 25 */:
/* 757 */                               str2 = "audio/wav";
                                        break;
                                    case Build.API_LEVELS.API_26 /* 26 */:
                                    case 44:
                                    case 49:
/* 754 */                               str2 = "application/xhtml+xml";
                                        break;
                                    case Build.API_LEVELS.API_27 /* 27 */:
/* 751 */                               str2 = "text/xml";
                                        break;
                                    case Build.API_LEVELS.API_28 /* 28 */:
/* 748 */                               str2 = "application/zip";
                                        break;
                                    case Build.API_LEVELS.API_29 /* 29 */:
/* 745 */                               str2 = "image/apng";
                                        break;
                                    case Build.API_LEVELS.API_30 /* 30 */:
/* 742 */                               str2 = "audio/flac";
                                        break;
                                    case Build.API_LEVELS.API_34 /* 34 */:
/* 739 */                               str2 = "application/json";
                                        break;
                                    case RequestError.NETWORK_FAILURE /* 40 */:
/* 735 */                               str2 = "application/wasm";
                                        break;
                                    case RequestError.NO_DEV_KEY /* 41 */:
/* 731 */                               str2 = "video/webm";
                                        break;
                                    case 42:
/* 727 */                               str2 = "image/webp";
                                        break;
                                    case 43:
/* 723 */                               str2 = "application/font-woff";
                                        break;
                                }
                            }
                        } else {
/* 12 */                    str2 = strGuessContentTypeFromName;
                        }
                    }
                    return str2 == null ? "text/plain" : str2;
                }

                @Override // p000.rc0
                /* JADX INFO: renamed from: a */
                public void mo6481a(k50 k50Var) {
/* 5 */             ThreadFactoryC2050oy threadFactoryC2050oy = new ThreadFactoryC2050oy("EmojiCompatInitializer");
/* 21 */            ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), threadFactoryC2050oy);
/* 25 */            threadPoolExecutor.allowCoreThreadTimeOut(true);
/* 35 */            threadPoolExecutor.execute(new RunnableC2558zo(8, this, k50Var, threadPoolExecutor));
                }

                /* JADX INFO: renamed from: d */
                public InputStream m8783d(String str) throws IOException {
/* 7 */             if (str.length() > 1 && str.charAt(0) == '/') {
/* 17 */                str = str.substring(1);
                    }
/* 24 */            String[] strArrSplit = str.split("/", -1);
/* 30 */            if (strArrSplit.length != 2) {
/* 128 */               C1951n4.m6859j("Incorrect resource path: ".concat(str));
/* 131 */               return null;
                    }
/* 32 */            String str2 = strArrSplit[0];
/* 34 */            String strSubstring = strArrSplit[1];
/* 38 */            int iLastIndexOf = strSubstring.lastIndexOf(46);
/* 42 */            if (iLastIndexOf != -1) {
/* 44 */                strSubstring = strSubstring.substring(0, iLastIndexOf);
                    }
/* 48 */            Context context = this.f17045a;
/* 58 */            int identifier = context.getResources().getIdentifier(strSubstring, str2, context.getPackageName());
/* 64 */            TypedValue typedValue = new TypedValue();
/* 71 */            context.getResources().getValue(identifier, typedValue, true);
/* 74 */            int i = typedValue.type;
/* 77 */            if (i != 3) {
/* 121 */               throw new IOException(String.format("Expected %s resource to be of TYPE_STRING but was %d", str, Integer.valueOf(i)));
                    }
/* 83 */            InputStream inputStreamOpenRawResource = context.getResources().openRawResource(identifier);
                    return str.endsWith(".svgz") ? new GZIPInputStream(inputStreamOpenRawResource) : inputStreamOpenRawResource;
                }
            }
