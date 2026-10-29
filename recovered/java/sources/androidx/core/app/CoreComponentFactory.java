            package androidx.core.app;

            import android.app.Activity;
            import android.app.AppComponentFactory;
            import android.app.Application;
            import android.app.Service;
            import android.content.BroadcastReceiver;
            import android.content.ContentProvider;
            import android.content.Intent;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public class CoreComponentFactory extends AppComponentFactory {
                public static <T> T checkCompatWrapper(T t) {
/* 1 */             return t;
                }

                public Activity instantiateActivity(ClassLoader classLoader, String str, Intent intent) throws IllegalAccessException, InstantiationException, ClassNotFoundException {
/* 9 */             return (Activity) checkCompatWrapper(super.instantiateActivity(classLoader, str, intent));
                }

                public Application instantiateApplication(ClassLoader classLoader, String str) throws IllegalAccessException, InstantiationException, ClassNotFoundException {
/* 9 */             return (Application) checkCompatWrapper(super.instantiateApplication(classLoader, str));
                }

                public ContentProvider instantiateProvider(ClassLoader classLoader, String str) throws IllegalAccessException, InstantiationException, ClassNotFoundException {
/* 9 */             return (ContentProvider) checkCompatWrapper(super.instantiateProvider(classLoader, str));
                }

                public BroadcastReceiver instantiateReceiver(ClassLoader classLoader, String str, Intent intent) throws IllegalAccessException, InstantiationException, ClassNotFoundException {
/* 9 */             return (BroadcastReceiver) checkCompatWrapper(super.instantiateReceiver(classLoader, str, intent));
                }

                public Service instantiateService(ClassLoader classLoader, String str, Intent intent) throws IllegalAccessException, InstantiationException, ClassNotFoundException {
/* 9 */             return (Service) checkCompatWrapper(super.instantiateService(classLoader, str, intent));
                }
            }
