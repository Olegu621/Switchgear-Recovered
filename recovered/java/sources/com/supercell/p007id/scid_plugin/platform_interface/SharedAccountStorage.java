            package com.supercell.p007id.scid_plugin.platform_interface;

            import android.content.Context;
            import com.supercell.p007id.scid_plugin.IdAccount;
            import com.supercell.p007id.scid_plugin.SharedDataStorage;
            import java.util.Iterator;
            import java.util.List;
            import kotlin.Metadata;
            import okhttp3.HttpUrl;
            import org.json.JSONArray;
            import p000.e70;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            @Metadata(m6175d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0016\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\r\u001a\u00020\f2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0016¢\u0006\u0004\b\r\u0010\u000eJ3\u0010\u0012\u001a\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\u0010j\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t`\u00112\u0006\u0010\u000f\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0014R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0015R\u0014\u0010\u0006\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0015¨\u0006\u0016"}, m6176d2 = {"Lcom/supercell/id/scid_plugin/platform_interface/SharedAccountStorage;", HttpUrl.FRAGMENT_ENCODE_SET, "Landroid/content/Context;", "context", HttpUrl.FRAGMENT_ENCODE_SET, "environment", "scidEnvironment", "<init>", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V", HttpUrl.FRAGMENT_ENCODE_SET, "Lcom/supercell/id/scid_plugin/IdAccount;", "accounts", HttpUrl.FRAGMENT_ENCODE_SET, "saveAccounts", "(Ljava/util/List;)V", "packageName", "Le70;", "Lcom/supercell/id/scid_plugin/Promise;", "loadSharedAccounts", "(Ljava/lang/String;)Le70;", "Landroid/content/Context;", "Ljava/lang/String;", "scid_plugin_release"}, m6177k = 1, m6178mv = {2, 1, 0}, m6180xi = 48)
            public class SharedAccountStorage {
                private final Context context;
                private final String environment;
                private final String scidEnvironment;

                public SharedAccountStorage(Context context, String str, String str2) {
/* 1 */             context.getClass();
/* 4 */             str.getClass();
/* 7 */             str2.getClass();
/* 13 */            this.context = context;
/* 15 */            this.environment = str;
/* 17 */            this.scidEnvironment = str2;
                }

                public e70 loadSharedAccounts(String packageName) {
/* 1 */             packageName.getClass();
/* 13 */            return new SharedDataManager(this.context).getAccountsFromGame(packageName, this.scidEnvironment);
                }

                public void saveAccounts(List<IdAccount> accounts) {
/* 1 */             accounts.getClass();
/* 6 */             JSONArray jSONArray = new JSONArray();
/* 9 */             Iterator<T> it = accounts.iterator();
/* 17 */            while (it.hasNext()) {
/* 29 */                jSONArray = jSONArray.put(((IdAccount) it.next()).toJsonObject());
/* 33 */                jSONArray.getClass();
                    }
/* 37 */            String string = jSONArray.toString();
/* 41 */            string.getClass();
/* 61 */            new SharedDataManager(this.context).insertAccountsToGame(SharedDataStorage.INSTANCE.getKeySharedAccounts(this.scidEnvironment), this.scidEnvironment, string);
                }
            }
