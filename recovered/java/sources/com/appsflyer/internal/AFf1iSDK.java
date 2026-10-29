            package com.appsflyer.internal;

            import android.content.Context;
            import android.os.Build;
            import android.os.Process;
            import com.appsflyer.AFLogger;
            import io.sentry.config.AbstractC1417a;
            import java.io.BufferedReader;
            import java.io.File;
            import java.io.FileInputStream;
            import java.io.FileNotFoundException;
            import java.io.IOException;
            import java.io.InputStreamReader;
            import java.nio.charset.Charset;
            import java.util.Arrays;
            import java.util.HashMap;
            import java.util.HashSet;
            import java.util.Iterator;
            import java.util.Locale;
            import java.util.Map;
            import okhttp3.HttpUrl;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 13 */    public final class AFf1iSDK {
                private static AFf1iSDK getRevenue;
                private final Map<String, String> getCurrencyIso4217Code = new HashMap<String, String>() { // from class: com.appsflyer.internal.AFf1iSDK.3
                    {
/* 10 */                put("aa", "ro.arch");
/* 17 */                put("ab", "ro.chipname");
/* 24 */                put("ac", "ro.dalvik.vm.native.bridge");
/* 31 */                put("ad", "persist.sys.nativebridge");
/* 38 */                put("ae", "ro.enable.native.bridge.exec");
/* 45 */                put("af", "dalvik.vm.isa.x86.features");
/* 52 */                put("ag", "dalvik.vm.isa.x86.variant");
/* 59 */                put("ah", "ro.zygote");
/* 66 */                put("ai", "ro.allow.mock.location");
/* 73 */                put("aj", "ro.dalvik.vm.isa.arm");
/* 80 */                put("ak", "dalvik.vm.isa.arm.features");
/* 87 */                put("al", "dalvik.vm.isa.arm.variant");
/* 94 */                put("am", "dalvik.vm.isa.arm64.features");
/* 101 */               put("an", "dalvik.vm.isa.arm64.variant");
/* 108 */               put("ao", "vzw.os.rooted");
/* 115 */               put("ap", "ro.build.user");
/* 122 */               put("aq", "ro.kernel.qemu");
/* 129 */               put("ar", "ro.hardware");
/* 136 */               put("as", "ro.product.cpu.abi");
/* 143 */               put("at", "ro.product.cpu.abilist");
/* 150 */               put("au", "ro.product.cpu.abilist32");
/* 157 */               put("av", "ro.product.cpu.abilist64");
                    }
                };

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public enum AFa1uSDK {
                    XPOSED("xps"),
                    FRIDA("frd");

                    String getMonetizationNetwork;

                    AFa1uSDK(String str) {
/* 4 */                 this.getMonetizationNetwork = str;
                    }
                }

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public enum AFa1ySDK {
                    HOOKING("hk"),
                    DEBUGGABLE("dbg");

                    String getMonetizationNetwork;

                    AFa1ySDK(String str) {
/* 4 */                 this.getMonetizationNetwork = str;
                    }
                }

                private AFf1iSDK() {
                }

                private static String AFAdRevenueData(String str) {
                    try {
/* 28 */                return (String) Class.forName("android.os.SystemProperties").getMethod("get", String.class).invoke(null, str);
                    } catch (Exception e) {
/* 34 */                AFLogger.afErrorLogForExcManagerOnly("error in props rfl", e);
/* 1 */                 return null;
                    }
                }

                public static AFf1iSDK getCurrencyIso4217Code() {
/* 3 */             if (getRevenue == null) {
/* 10 */                getRevenue = new AFf1iSDK();
                    }
/* 12 */            return getRevenue;
                }

                private AFg1gSDK getMediationNetwork() throws Throwable {
/* 3 */             AFg1gSDK aFg1gSDK = new AFg1gSDK();
                    try {
/* 20 */                for (Map.Entry<String, String> entry : this.getCurrencyIso4217Code.entrySet()) {
/* 34 */                    String strAFAdRevenueData = AFAdRevenueData(entry.getValue());
/* 38 */                    if (strAFAdRevenueData != null && !strAFAdRevenueData.equals(HttpUrl.FRAGMENT_ENCODE_SET)) {
/* 54 */                        aFg1gSDK.getMonetizationNetwork(entry.getKey(), strAFAdRevenueData);
                            }
                        }
/* 60 */                return aFg1gSDK;
                    } catch (Exception e) {
/* 63 */                AFLogger.afErrorLogForExcManagerOnly("failed to create props", e);
/* 66 */                return aFg1gSDK;
                    }
                }

                private static boolean getMonetizationNetwork(Context context) {
                    return (context.getApplicationInfo().flags & 2) != 0;
                }

                private static String getRevenue() {
/* 5 */             StringBuilder sb = new StringBuilder();
                    try {
/* 16 */                Iterator<Map.Entry<Thread, StackTraceElement[]>> it = Thread.getAllStackTraces().entrySet().iterator();
/* 21 */                int i = 0;
/* 22 */                int i2 = 0;
/* 27 */                while (it.hasNext()) {
/* 43 */                    for (StackTraceElement stackTraceElement : it.next().getValue()) {
/* 57 */                        if (stackTraceElement.toString().contains("de.robv.android.xposed") && i2 <= 2) {
/* 62 */                            i2++;
/* 68 */                            sb.append(AFa1uSDK.XPOSED.getMonetizationNetwork);
/* 81 */                            if (stackTraceElement.getMethodName().equals("main")) {
/* 85 */                                sb.append("+a");
                                    }
/* 101 */                           if (stackTraceElement.getMethodName().equals("handleHookedMethod")) {
/* 105 */                               sb.append("+h");
                                    }
/* 108 */                           sb.append(";");
                                }
/* 121 */                       if (stackTraceElement.getClassName().equals("com.android.internal.os.ZygoteInit")) {
/* 123 */                           i++;
                                }
                            }
                        }
/* 129 */               if (i > 1) {
/* 133 */                   sb.append("mz;");
                        }
                    } catch (Throwable th) {
/* 139 */               AFLogger.afErrorLogForExcManagerOnly("hooking check error", th);
                    }
                    try {
/* 146 */               StringBuilder sb2 = new StringBuilder("/proc/");
/* 153 */               sb2.append(Process.myPid());
/* 158 */               sb2.append("/maps");
/* 171 */               if (getRevenue(sb2.toString(), "frida")) {
/* 177 */                   sb.append(AFa1uSDK.FRIDA.getMonetizationNetwork);
/* 184 */                   if (Build.VERSION.SDK_INT < 29 && getRevenue("/proc/net/tcp", "69A2")) {
/* 198 */                       sb.append("+prt");
                            }
                        }
                    } catch (Exception e) {
/* 205 */               AFLogger.afErrorLogForExcManagerOnly("frida detection error", e);
/* 220 */               sb.append(e.getMessage().toLowerCase(Locale.getDefault()));
                    }
/* 223 */           sb.append(";");
/* 226 */           return sb.toString();
                }

/* 14 */        private static boolean getMonetizationNetwork(String str) {
/* 15 */            return str.matches("\\d+");
                }

/* 66 */        private AFg1gSDK getMediationNetwork(Context context) {
/* 67 */            AFg1gSDK aFg1gSDK = new AFg1gSDK();
                    try {
/* 70 */                aFg1gSDK.getMonetizationNetwork(AFa1ySDK.HOOKING.getMonetizationNetwork, getRevenue());
/* 73 */                aFg1gSDK.getMonetizationNetwork(AFa1ySDK.DEBUGGABLE.getMonetizationNetwork, Boolean.valueOf(getMonetizationNetwork(context)));
                        return aFg1gSDK;
                    } catch (Throwable th) {
/* 74 */                AFLogger.afErrorLogForExcManagerOnly("failed to perform analysis checks", th);
                        return aFg1gSDK;
                    }
                }

/* 230 */       public final Object getRevenue(Context context, String str) throws Throwable {
                    String str2 = null;
                    if (str != null) {
                        try {
/* 232 */                   str2 = getMonetizationNetwork(str) ? null : "invalid timestamp";
                        } catch (Exception e) {
/* 236 */                   AFLogger.afErrorLogForExcManagerOnly("could not get anti fraud data", e);
                            return str2;
                        }
                    }
/* 233 */           AFg1gSDK aFg1gSDK = new AFg1gSDK();
/* 234 */           aFg1gSDK.getMonetizationNetwork("pr", getMediationNetwork());
/* 235 */           aFg1gSDK.getMonetizationNetwork("an", getMediationNetwork(context));
                    return aFg1gSDK;
                }

/* 236 */       private static boolean getRevenue(String str, String str2) throws Exception {
                    String line;
/* 237 */           File file = new File(str);
                    try {
/* 238 */               FileInputStream fileInputStreamM5164b = AbstractC1417a.m5164b(file, new FileInputStream(file));
/* 239 */               BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(fileInputStreamM5164b, Charset.defaultCharset()));
/* 240 */               String lowerCase = str2.toLowerCase(Locale.getDefault());
/* 245 */               do {
/* 241 */                   line = bufferedReader.readLine();
                            if (line == null) {
/* 248 */                       bufferedReader.close();
/* 249 */                       fileInputStreamM5164b.close();
                                return false;
                            }
/* 245 */               } while (!new HashSet(Arrays.asList(line.toLowerCase(Locale.getDefault()).split("[\\s.,\\]\\-:/_\\[]"))).contains(lowerCase));
/* 246 */               bufferedReader.close();
/* 247 */               fileInputStreamM5164b.close();
                        return true;
                    } catch (FileNotFoundException e) {
/* 254 */               AFLogger.afErrorLogForExcManagerOnly("FNF", e);
/* 255 */               throw new Exception("FNF");
                    } catch (IOException e2) {
/* 252 */               AFLogger.afErrorLogForExcManagerOnly("IOF", e2);
/* 253 */               throw new Exception("IOF");
                    } catch (Exception e3) {
/* 250 */               AFLogger.afErrorLogForExcManagerOnly("GF", e3);
/* 251 */               throw new Exception("GF");
                    }
                }
            }
