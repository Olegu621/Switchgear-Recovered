            package com.quago.mobile.sdk;

            import java.util.ArrayList;
            import java.util.Arrays;
            import okhttp3.HttpUrl;
            
            /* JADX INFO: renamed from: com.quago.mobile.sdk.h */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public abstract class AbstractC0733h {

                /* JADX INFO: renamed from: a */
                public static final String[] f5443a = {"com.noshufou.android.su", "com.noshufou.android.su.elite", "eu.chainfire.supersu", "com.koushikdutta.superuser", "com.thirdparty.superuser", "com.yellowes.su", "com.topjohnwu.magisk", "com.kingroot.kinguser", "com.kingo.root", "com.smedialink.oneclickroot", "com.zhiqupk.root.global", "com.alephzain.framaroot"};

                /* JADX INFO: renamed from: b */
                public static final String[] f5444b = {"com.koushikdutta.rommanager", "com.koushikdutta.rommanager.license", "com.dimonvideo.luckypatcher", "com.chelpus.lackypatch", "com.ramdroid.appquarantine", "com.ramdroid.appquarantinepro", "com.android.vending.billing.InAppBillingService.COIN", "com.android.vending.billing.InAppBillingService.LUCK", "com.chelpus.luckypatcher", "com.blackmartalpha", "org.blackmart.market", "com.allinone.free", "com.repodroid.app", "org.creeplays.hack", "com.baseappfull.fwd", "com.zmapp", "com.dv.marketmod.installer", "org.mobilism.android", "com.android.wp.net.log", "com.android.camera.update", "cc.madkite.freedom", "com.solohsu.android.edxp.manager", "org.meowcat.edxposed.manager", "com.xmodgame", "com.cih.game_cih", "com.charles.lpoqasert", "catch_.me_.if_.you_.can_"};

                /* JADX INFO: renamed from: c */
                public static final String[] f5445c = {"/data/local/", "/data/local/bin/", "/data/local/xbin/", "/sbin/", "/su/bin/", "/system/bin/", "/system/bin/.ext/", "/system/bin/failsafe/", "/system/sd/xbin/", "/system/usr/we-need-root/", "/system/xbin/", "/cache/", "/data/", "/dev/"};

                /* JADX INFO: renamed from: d */
                public static final String[] f5446d = {"/system", "/system/bin", "/system/sbin", "/system/xbin", "/vendor/bin", "/sbin", "/etc"};

                /* JADX INFO: renamed from: a */
                public static String[] m2581a() {
/* 9 */             ArrayList arrayList = new ArrayList(Arrays.asList(f5445c));
/* 14 */            String str = System.getenv("PATH");
/* 19 */            if (str == null || HttpUrl.FRAGMENT_ENCODE_SET.equals(str)) {
/* 81 */                return (String[]) arrayList.toArray(new String[0]);
                    }
/* 32 */            String[] strArrSplit = str.split(":");
/* 36 */            int length = strArrSplit.length;
/* 38 */            for (int i = 0; i < length; i++) {
/* 40 */                String strConcat = strArrSplit[i];
/* 48 */                if (!strConcat.endsWith("/")) {
/* 50 */                    strConcat = strConcat.concat("/");
                        }
/* 58 */                if (!arrayList.contains(strConcat)) {
/* 60 */                    arrayList.add(strConcat);
                        }
                    }
/* 72 */            return (String[]) arrayList.toArray(new String[0]);
                }
            }
