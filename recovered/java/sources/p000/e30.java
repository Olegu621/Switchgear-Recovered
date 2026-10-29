            package p000;

            import android.content.ComponentName;
            import android.content.Context;
            import android.content.Intent;
            import android.content.pm.PackageManager;
            import android.content.pm.ResolveInfo;
            import android.net.Uri;
            import android.os.Build;
            import android.support.customtabs.ICustomTabsService;
            import io.sentry.android.core.AbstractC1245n0;
            import java.util.ArrayList;
            import java.util.List;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public abstract class e30 {

                /* JADX INFO: renamed from: a */
                public final ICustomTabsService f7492a;

                /* JADX INFO: renamed from: b */
                public final ComponentName f7493b;

                public e30(ICustomTabsService iCustomTabsService, ComponentName componentName) {
/* 4 */             this.f7492a = iCustomTabsService;
/* 6 */             this.f7493b = componentName;
                }

                /* JADX INFO: renamed from: a */
                public static String m3300a(Context context, List list, boolean z) {
                    ResolveInfo resolveInfoResolveActivity;
/* 1 */             PackageManager packageManager = context.getPackageManager();
/* 13 */            List<String> arrayList = list == null ? new ArrayList() : list;
/* 24 */            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("http://"));
/* 28 */            if (!z && (resolveInfoResolveActivity = packageManager.resolveActivity(intent, 0)) != null) {
/* 38 */                String str = resolveInfoResolveActivity.activityInfo.packageName;
/* 48 */                ArrayList arrayList2 = new ArrayList(arrayList.size() + 1);
/* 51 */                arrayList2.add(str);
/* 54 */                if (list != null) {
/* 56 */                    arrayList2.addAll(list);
                        }
/* 59 */                arrayList = arrayList2;
                    }
/* 64 */            Intent intent2 = new Intent("android.support.customtabs.action.CustomTabsService");
/* 75 */            for (String str2 : arrayList) {
/* 83 */                intent2.setPackage(str2);
/* 90 */                if (packageManager.resolveService(intent2, 0) != null) {
/* 92 */                    return str2;
                        }
                    }
/* 97 */            if (Build.VERSION.SDK_INT < 30) {
/* 106 */               return null;
                    }
/* 103 */           AbstractC1245n0.m4889q("CustomTabsClient", "Unable to find any Custom Tabs packages, you may need to add a <queries> element to your manifest. See the docs for CustomTabsClient#getPackageName.");
/* 106 */           return null;
                }
            }
