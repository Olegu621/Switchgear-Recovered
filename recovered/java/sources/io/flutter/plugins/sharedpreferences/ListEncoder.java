            package io.flutter.plugins.sharedpreferences;

            import android.util.Base64;
            import java.io.ByteArrayInputStream;
            import java.io.ByteArrayOutputStream;
            import java.io.IOException;
            import java.io.ObjectOutputStream;
            import java.util.ArrayList;
            import java.util.List;
            import kotlin.Metadata;
            import okhttp3.HttpUrl;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            @Metadata(m6175d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007H\u0016J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00072\u0006\u0010\t\u001a\u00020\u0005H\u0016¨\u0006\n"}, m6176d2 = {"Lio/flutter/plugins/sharedpreferences/ListEncoder;", "Lio/flutter/plugins/sharedpreferences/SharedPreferencesListEncoder;", "<init>", "()V", "encode", HttpUrl.FRAGMENT_ENCODE_SET, "list", HttpUrl.FRAGMENT_ENCODE_SET, "decode", "listString", "shared_preferences_android_release"}, m6177k = 1, m6178mv = {2, 1, 0}, m6180xi = 48)
            public final class ListEncoder implements SharedPreferencesListEncoder {
                @Override // io.flutter.plugins.sharedpreferences.SharedPreferencesListEncoder
                public List<String> decode(String listString) throws ClassNotFoundException, IOException {
/* 1 */             listString.getClass();
/* 19 */            Object object = new StringListObjectInputStream(new ByteArrayInputStream(Base64.decode(listString, 0))).readObject();
/* 23 */            object.getClass();
/* 30 */            ArrayList arrayList = new ArrayList();
/* 41 */            for (Object obj : (List) object) {
/* 49 */                if (obj instanceof String) {
/* 51 */                    arrayList.add(obj);
                        }
                    }
/* 55 */            return arrayList;
                }

                @Override // io.flutter.plugins.sharedpreferences.SharedPreferencesListEncoder
                public String encode(List<String> list) throws IOException {
/* 1 */             list.getClass();
/* 6 */             ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
/* 11 */            ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
/* 14 */            objectOutputStream.writeObject(list);
/* 17 */            objectOutputStream.flush();
/* 25 */            String strEncodeToString = Base64.encodeToString(byteArrayOutputStream.toByteArray(), 0);
/* 29 */            strEncodeToString.getClass();
/* 32 */            return strEncodeToString;
                }
            }
