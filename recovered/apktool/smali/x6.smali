.class public final synthetic Lx6;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"

# interfaces
.implements Lcom/google/android/gms/tasks/OnSuccessListener;
.implements Lfp1;
.implements Llv0;
.implements Lio/flutter/embedding/engine/systemchannels/KeyEventChannel$EventResponseHandler;
.implements Lio/flutter/plugin/common/BasicMessageChannel$Reply;
.implements Lnw0;
.implements Lud;
.implements Lso0;
.implements Lio/flutter/plugin/common/MethodChannel$MethodCallHandler;
.implements Lbk2;
.implements Lokhttp3/EventListener$Factory;
.implements Lio/flutter/util/ViewUtils$ViewVisitor;
.implements Lcom/google/android/gms/tasks/OnCompleteListener;
.implements Lio/sentry/d4;
.implements Lio/sentry/android/core/m1;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, Lx6;->a:I

    .line 2
    .line 3
    iput-object p3, p0, Lx6;->b:Ljava/lang/Object;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    .line 9
    iput p2, p0, Lx6;->a:I

    iput-object p1, p0, Lx6;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lwb2;)V
    .locals 3

    .line 1
    iget v0, p0, Lx6;->a:I

    .line 2
    .line 3
    iget-object p0, p0, Lx6;->b:Ljava/lang/Object;

    .line 4
    .line 5
    sparse-switch v0, :sswitch_data_0

    .line 6
    .line 7
    .line 8
    check-cast p0, Lcom/supercell/id/scid_plugin/MobileScanner;

    .line 9
    .line 10
    invoke-static {p0, p1}, Lcom/supercell/id/scid_plugin/MobileScanner;->a(Lcom/supercell/id/scid_plugin/MobileScanner;Lwb2;)V

    .line 11
    .line 12
    .line 13
    return-void

    .line 14
    :sswitch_0
    check-cast p0, Lfj1;

    .line 15
    .line 16
    iget-object v0, p1, Lcm0;->b:Lmw0;

    .line 17
    .line 18
    invoke-interface {v0}, Lmw0;->P0()Landroid/media/Image;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    if-nez v0, :cond_0

    .line 23
    .line 24
    invoke-virtual {p1}, Lcm0;->close()V

    .line 25
    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    invoke-virtual {p0}, Lfj1;->a()I

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    iget v1, p0, Lfj1;->a0:I

    .line 33
    .line 34
    if-eq v1, v0, :cond_1

    .line 35
    .line 36
    iput v0, p0, Lfj1;->a0:I

    .line 37
    .line 38
    iget-object v1, p0, Lfj1;->c:Lgj1;

    .line 39
    .line 40
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    invoke-virtual {v1, v0}, Lgj1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    :cond_1
    iget-boolean v0, p0, Lfj1;->Z:Z

    .line 48
    .line 49
    if-nez v0, :cond_2

    .line 50
    .line 51
    invoke-virtual {p1}, Lcm0;->close()V

    .line 52
    .line 53
    .line 54
    goto :goto_0

    .line 55
    :cond_2
    iget-object v0, p0, Lfj1;->V:Ly00;

    .line 56
    .line 57
    new-instance v1, Le8;

    .line 58
    .line 59
    const/4 v2, 0x0

    .line 60
    invoke-direct {v1, p0, p1, v2}, Le8;-><init>(Lfj1;Lwb2;Lc10;)V

    .line 61
    .line 62
    .line 63
    const/4 p0, 0x3

    .line 64
    invoke-static {v0, v2, v1, p0}, Li13;->w(Ly10;Lkt0;Lkotlin/jvm/functions/Function2;I)Lig2;

    .line 65
    .line 66
    .line 67
    move-result-object p0

    .line 68
    invoke-virtual {p0}, Lz01;->start()Z

    .line 69
    .line 70
    .line 71
    :goto_0
    return-void

    .line 72
    :sswitch_1
    check-cast p0, Llv0;

    .line 73
    .line 74
    invoke-interface {p0, p1}, Llv0;->a(Lwb2;)V

    .line 75
    .line 76
    .line 77
    return-void

    .line 78
    nop

    .line 79
    :sswitch_data_0
    .sparse-switch
        0x4 -> :sswitch_1
        0x9 -> :sswitch_0
    .end sparse-switch
.end method

.method public apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    iget-object p0, p0, Lx6;->b:Ljava/lang/Object;

    check-cast p0, Lnd1;

    .line 85
    invoke-virtual {p0, p1}, Lnd1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lsx1;

    return-object p0
.end method

.method public apply(Ljava/lang/Object;)Ls81;
    .locals 3

    .line 1
    iget v0, p0, Lx6;->a:I

    .line 2
    .line 3
    iget-object p0, p0, Lx6;->b:Ljava/lang/Object;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    check-cast p0, Ljava/util/ArrayList;

    .line 9
    .line 10
    check-cast p1, Ljava/util/List;

    .line 11
    .line 12
    invoke-static {p1}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    const-string v0, "SyncCaptureSessionBase"

    .line 16
    .line 17
    invoke-static {v0}, Lhu0;->F0(Ljava/lang/String;)Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    const/4 v1, 0x1

    .line 25
    if-eqz v0, :cond_0

    .line 26
    .line 27
    new-instance p0, Ljava/lang/IllegalArgumentException;

    .line 28
    .line 29
    const-string p1, "Unable to open capture session without surfaces"

    .line 30
    .line 31
    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    new-instance p1, Ltw0;

    .line 35
    .line 36
    invoke-direct {p1, p0, v1}, Ltw0;-><init>(Ljava/lang/Object;I)V

    .line 37
    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_0
    const/4 v0, 0x0

    .line 41
    invoke-interface {p1, v0}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 42
    .line 43
    .line 44
    move-result v2

    .line 45
    if-eqz v2, :cond_1

    .line 46
    .line 47
    new-instance v2, Lc70;

    .line 48
    .line 49
    invoke-interface {p1, v0}, Ljava/util/List;->indexOf(Ljava/lang/Object;)I

    .line 50
    .line 51
    .line 52
    move-result p1

    .line 53
    invoke-virtual {p0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object p0

    .line 57
    check-cast p0, Ld70;

    .line 58
    .line 59
    const-string p1, "Surface closed"

    .line 60
    .line 61
    invoke-direct {v2, p1, p0}, Lc70;-><init>(Ljava/lang/String;Ld70;)V

    .line 62
    .line 63
    .line 64
    new-instance p1, Ltw0;

    .line 65
    .line 66
    invoke-direct {p1, v2, v1}, Ltw0;-><init>(Ljava/lang/Object;I)V

    .line 67
    .line 68
    .line 69
    goto :goto_0

    .line 70
    :cond_1
    invoke-static {p1}, Lw11;->t(Ljava/lang/Object;)Ltw0;

    .line 71
    .line 72
    .line 73
    move-result-object p1

    .line 74
    :goto_0
    return-object p1

    .line 75
    :pswitch_0
    check-cast p0, Lo;

    .line 76
    .line 77
    invoke-virtual {p0, p1}, Lo;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    move-result-object p0

    .line 81
    check-cast p0, Ls81;

    .line 82
    .line 83
    return-object p0

    .line 84
    nop

    .line 85
    :pswitch_data_0
    .packed-switch 0xb
        :pswitch_0
    .end packed-switch
.end method

.method public b()V
    .locals 3

    .line 1
    iget-object p0, p0, Lx6;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Lio/sentry/android/core/FeedbackShakeIntegration;

    .line 4
    .line 5
    iget-object v0, p0, Lio/sentry/android/core/FeedbackShakeIntegration;->d:Ljava/lang/ref/WeakReference;

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    check-cast v0, Landroid/app/Activity;

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    const/4 v0, 0x0

    .line 17
    :goto_0
    sget-object v1, Lio/sentry/android/core/g0;->e:Lio/sentry/android/core/g0;

    .line 18
    .line 19
    iget-object v1, v1, Lio/sentry/android/core/g0;->d:Ljava/lang/Boolean;

    .line 20
    .line 21
    if-eqz v0, :cond_1

    .line 22
    .line 23
    iget-object v2, p0, Lio/sentry/android/core/FeedbackShakeIntegration;->c:Lio/sentry/android/core/SentryAndroidOptions;

    .line 24
    .line 25
    if-eqz v2, :cond_1

    .line 26
    .line 27
    iget-boolean v2, p0, Lio/sentry/android/core/FeedbackShakeIntegration;->e:Z

    .line 28
    .line 29
    if-nez v2, :cond_1

    .line 30
    .line 31
    sget-object v2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 32
    .line 33
    invoke-virtual {v2, v1}, Ljava/lang/Boolean;->equals(Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    move-result v1

    .line 37
    if-nez v1, :cond_1

    .line 38
    .line 39
    new-instance v1, Lji1;

    .line 40
    .line 41
    const/16 v2, 0x16

    .line 42
    .line 43
    invoke-direct {v1, v2, p0, v0}, Lji1;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 44
    .line 45
    .line 46
    invoke-virtual {v0, v1}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 47
    .line 48
    .line 49
    :cond_1
    return-void
.end method

.method public c(Lec;)Lbd;
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iget-object v0, v0, Lx6;->b:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v0, Las;

    .line 8
    .line 9
    iget-object v2, v1, Lec;->b:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v2, Ljava/net/URL;

    .line 12
    .line 13
    const-string v3, "CctTransportBackend"

    .line 14
    .line 15
    invoke-static {v3}, Lpy0;->l0(Ljava/lang/String;)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v4

    .line 19
    const/4 v5, 0x4

    .line 20
    invoke-static {v4, v5}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 21
    .line 22
    .line 23
    move-result v4

    .line 24
    if-eqz v4, :cond_0

    .line 25
    .line 26
    filled-new-array {v2}, [Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v4

    .line 30
    const-string v6, "Making request to: %s"

    .line 31
    .line 32
    invoke-static {v6, v4}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    :cond_0
    invoke-virtual {v2}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;

    .line 36
    .line 37
    .line 38
    move-result-object v2

    .line 39
    check-cast v2, Ljava/net/HttpURLConnection;

    .line 40
    .line 41
    const/16 v4, 0x7530

    .line 42
    .line 43
    invoke-virtual {v2, v4}, Ljava/net/URLConnection;->setConnectTimeout(I)V

    .line 44
    .line 45
    .line 46
    iget v4, v0, Las;->g:I

    .line 47
    .line 48
    invoke-virtual {v2, v4}, Ljava/net/URLConnection;->setReadTimeout(I)V

    .line 49
    .line 50
    .line 51
    const/4 v4, 0x1

    .line 52
    invoke-virtual {v2, v4}, Ljava/net/URLConnection;->setDoOutput(Z)V

    .line 53
    .line 54
    .line 55
    const/4 v4, 0x0

    .line 56
    invoke-virtual {v2, v4}, Ljava/net/HttpURLConnection;->setInstanceFollowRedirects(Z)V

    .line 57
    .line 58
    .line 59
    const-string v4, "POST"

    .line 60
    .line 61
    invoke-virtual {v2, v4}, Ljava/net/HttpURLConnection;->setRequestMethod(Ljava/lang/String;)V

    .line 62
    .line 63
    .line 64
    const-string v4, "User-Agent"

    .line 65
    .line 66
    const-string v6, "datatransport/3.1.9 android/"

    .line 67
    .line 68
    invoke-virtual {v2, v4, v6}, Ljava/net/URLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 69
    .line 70
    .line 71
    const-string v4, "Content-Encoding"

    .line 72
    .line 73
    const-string v6, "gzip"

    .line 74
    .line 75
    invoke-virtual {v2, v4, v6}, Ljava/net/URLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 76
    .line 77
    .line 78
    const-string v7, "application/json"

    .line 79
    .line 80
    const-string v8, "Content-Type"

    .line 81
    .line 82
    invoke-virtual {v2, v8, v7}, Ljava/net/URLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 83
    .line 84
    .line 85
    const-string v7, "Accept-Encoding"

    .line 86
    .line 87
    invoke-virtual {v2, v7, v6}, Ljava/net/URLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 88
    .line 89
    .line 90
    iget-object v7, v1, Lec;->d:Ljava/lang/Object;

    .line 91
    .line 92
    check-cast v7, Ljava/lang/String;

    .line 93
    .line 94
    if-eqz v7, :cond_1

    .line 95
    .line 96
    const-string v9, "X-Goog-Api-Key"

    .line 97
    .line 98
    invoke-virtual {v2, v9, v7}, Ljava/net/URLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 99
    .line 100
    .line 101
    :cond_1
    :try_start_0
    invoke-virtual {v2}, Ljava/net/URLConnection;->getOutputStream()Ljava/io/OutputStream;

    .line 102
    .line 103
    .line 104
    move-result-object v10
    :try_end_0
    .catch Ljava/net/ConnectException; {:try_start_0 .. :try_end_0} :catch_3
    .catch Ljava/net/UnknownHostException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Lwd0; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 105
    :try_start_1
    new-instance v11, Ljava/util/zip/GZIPOutputStream;

    .line 106
    .line 107
    invoke-direct {v11, v10}, Ljava/util/zip/GZIPOutputStream;-><init>(Ljava/io/OutputStream;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_4

    .line 108
    .line 109
    .line 110
    :try_start_2
    iget-object v0, v0, Las;->a:Lfs0;

    .line 111
    .line 112
    iget-object v1, v1, Lec;->c:Ljava/lang/Object;

    .line 113
    .line 114
    check-cast v1, Lcf;

    .line 115
    .line 116
    new-instance v13, Ljava/io/BufferedWriter;

    .line 117
    .line 118
    new-instance v12, Ljava/io/OutputStreamWriter;

    .line 119
    .line 120
    invoke-direct {v12, v11}, Ljava/io/OutputStreamWriter;-><init>(Ljava/io/OutputStream;)V

    .line 121
    .line 122
    .line 123
    invoke-direct {v13, v12}, Ljava/io/BufferedWriter;-><init>(Ljava/io/Writer;)V

    .line 124
    .line 125
    .line 126
    new-instance v12, Ll21;

    .line 127
    .line 128
    iget-object v0, v0, Lfs0;->b:Ljava/lang/Object;

    .line 129
    .line 130
    check-cast v0, Li11;

    .line 131
    .line 132
    iget-object v14, v0, Li11;->a:Ljava/util/HashMap;

    .line 133
    .line 134
    iget-object v7, v0, Li11;->b:Ljava/util/HashMap;

    .line 135
    .line 136
    iget-object v9, v0, Li11;->c:Lf11;

    .line 137
    .line 138
    iget-boolean v0, v0, Li11;->d:Z

    .line 139
    .line 140
    move/from16 v17, v0

    .line 141
    .line 142
    move-object v15, v7

    .line 143
    move-object/from16 v16, v9

    .line 144
    .line 145
    invoke-direct/range {v12 .. v17}, Ll21;-><init>(Ljava/io/BufferedWriter;Ljava/util/HashMap;Ljava/util/HashMap;Lf11;Z)V

    .line 146
    .line 147
    .line 148
    invoke-virtual {v12, v1}, Ll21;->f(Ljava/lang/Object;)V

    .line 149
    .line 150
    .line 151
    invoke-virtual {v12}, Ll21;->h()V

    .line 152
    .line 153
    .line 154
    iget-object v0, v12, Ll21;->b:Landroid/util/JsonWriter;

    .line 155
    .line 156
    invoke-virtual {v0}, Landroid/util/JsonWriter;->flush()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_5

    .line 157
    .line 158
    .line 159
    :try_start_3
    invoke-virtual {v11}, Ljava/io/OutputStream;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_4

    .line 160
    .line 161
    .line 162
    if-eqz v10, :cond_2

    .line 163
    .line 164
    :try_start_4
    invoke-virtual {v10}, Ljava/io/OutputStream;->close()V
    :try_end_4
    .catch Ljava/net/ConnectException; {:try_start_4 .. :try_end_4} :catch_3
    .catch Ljava/net/UnknownHostException; {:try_start_4 .. :try_end_4} :catch_2
    .catch Lwd0; {:try_start_4 .. :try_end_4} :catch_1
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_0

    .line 165
    .line 166
    .line 167
    goto :goto_1

    .line 168
    :catch_0
    move-exception v0

    .line 169
    goto/16 :goto_d

    .line 170
    .line 171
    :catch_1
    move-exception v0

    .line 172
    goto/16 :goto_d

    .line 173
    .line 174
    :catch_2
    move-exception v0

    .line 175
    :goto_0
    const-wide/16 v4, 0x0

    .line 176
    .line 177
    const/4 v6, 0x0

    .line 178
    goto/16 :goto_e

    .line 179
    .line 180
    :catch_3
    move-exception v0

    .line 181
    goto :goto_0

    .line 182
    :cond_2
    :goto_1
    invoke-virtual {v2}, Ljava/net/HttpURLConnection;->getResponseCode()I

    .line 183
    .line 184
    .line 185
    move-result v0

    .line 186
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 187
    .line 188
    .line 189
    move-result-object v1

    .line 190
    invoke-static {v3}, Lpy0;->l0(Ljava/lang/String;)Ljava/lang/String;

    .line 191
    .line 192
    .line 193
    move-result-object v7

    .line 194
    invoke-static {v7, v5}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 195
    .line 196
    .line 197
    move-result v5

    .line 198
    if-eqz v5, :cond_3

    .line 199
    .line 200
    filled-new-array {v1}, [Ljava/lang/Object;

    .line 201
    .line 202
    .line 203
    move-result-object v1

    .line 204
    const-string v5, "Status Code: %d"

    .line 205
    .line 206
    invoke-static {v5, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 207
    .line 208
    .line 209
    :cond_3
    const-string v1, "Content-Type: %s"

    .line 210
    .line 211
    invoke-virtual {v2, v8}, Ljava/net/URLConnection;->getHeaderField(Ljava/lang/String;)Ljava/lang/String;

    .line 212
    .line 213
    .line 214
    move-result-object v5

    .line 215
    invoke-static {v3, v1, v5}, Lpy0;->P(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    .line 216
    .line 217
    .line 218
    const-string v1, "Content-Encoding: %s"

    .line 219
    .line 220
    invoke-virtual {v2, v4}, Ljava/net/URLConnection;->getHeaderField(Ljava/lang/String;)Ljava/lang/String;

    .line 221
    .line 222
    .line 223
    move-result-object v5

    .line 224
    invoke-static {v3, v1, v5}, Lpy0;->P(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    .line 225
    .line 226
    .line 227
    const/16 v1, 0x12e

    .line 228
    .line 229
    if-eq v0, v1, :cond_b

    .line 230
    .line 231
    const/16 v1, 0x12d

    .line 232
    .line 233
    if-eq v0, v1, :cond_b

    .line 234
    .line 235
    const/16 v1, 0x133

    .line 236
    .line 237
    if-ne v0, v1, :cond_4

    .line 238
    .line 239
    goto :goto_7

    .line 240
    :cond_4
    const/16 v1, 0xc8

    .line 241
    .line 242
    if-eq v0, v1, :cond_5

    .line 243
    .line 244
    new-instance v1, Lbd;

    .line 245
    .line 246
    const-wide/16 v2, 0x0

    .line 247
    .line 248
    const/4 v4, 0x0

    .line 249
    invoke-direct {v1, v0, v4, v2, v3}, Lbd;-><init>(ILjava/net/URL;J)V

    .line 250
    .line 251
    .line 252
    return-object v1

    .line 253
    :cond_5
    invoke-virtual {v2}, Ljava/net/URLConnection;->getInputStream()Ljava/io/InputStream;

    .line 254
    .line 255
    .line 256
    move-result-object v1

    .line 257
    :try_start_5
    invoke-virtual {v2, v4}, Ljava/net/URLConnection;->getHeaderField(Ljava/lang/String;)Ljava/lang/String;

    .line 258
    .line 259
    .line 260
    move-result-object v2

    .line 261
    invoke-virtual {v6, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 262
    .line 263
    .line 264
    move-result v2

    .line 265
    if-eqz v2, :cond_6

    .line 266
    .line 267
    new-instance v2, Ljava/util/zip/GZIPInputStream;

    .line 268
    .line 269
    invoke-direct {v2, v1}, Ljava/util/zip/GZIPInputStream;-><init>(Ljava/io/InputStream;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 270
    .line 271
    .line 272
    goto :goto_2

    .line 273
    :cond_6
    move-object v2, v1

    .line 274
    :goto_2
    :try_start_6
    new-instance v3, Ljava/io/BufferedReader;

    .line 275
    .line 276
    new-instance v4, Ljava/io/InputStreamReader;

    .line 277
    .line 278
    invoke-direct {v4, v2}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;)V

    .line 279
    .line 280
    .line 281
    invoke-direct {v3, v4}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;)V

    .line 282
    .line 283
    .line 284
    invoke-static {v3}, Ldg;->a(Ljava/io/BufferedReader;)Ldg;

    .line 285
    .line 286
    .line 287
    move-result-object v3

    .line 288
    iget-wide v3, v3, Ldg;->a:J

    .line 289
    .line 290
    new-instance v5, Lbd;

    .line 291
    .line 292
    const/4 v6, 0x0

    .line 293
    invoke-direct {v5, v0, v6, v3, v4}, Lbd;-><init>(ILjava/net/URL;J)V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    .line 294
    .line 295
    .line 296
    if-eqz v2, :cond_7

    .line 297
    .line 298
    :try_start_7
    invoke-virtual {v2}, Ljava/io/InputStream;->close()V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    .line 299
    .line 300
    .line 301
    goto :goto_3

    .line 302
    :catchall_0
    move-exception v0

    .line 303
    move-object v2, v0

    .line 304
    goto :goto_5

    .line 305
    :cond_7
    :goto_3
    if-eqz v1, :cond_8

    .line 306
    .line 307
    invoke-virtual {v1}, Ljava/io/InputStream;->close()V

    .line 308
    .line 309
    .line 310
    :cond_8
    return-object v5

    .line 311
    :catchall_1
    move-exception v0

    .line 312
    move-object v3, v0

    .line 313
    if-eqz v2, :cond_9

    .line 314
    .line 315
    :try_start_8
    invoke-virtual {v2}, Ljava/io/InputStream;->close()V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_2

    .line 316
    .line 317
    .line 318
    goto :goto_4

    .line 319
    :catchall_2
    move-exception v0

    .line 320
    :try_start_9
    invoke-virtual {v3, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 321
    .line 322
    .line 323
    :cond_9
    :goto_4
    throw v3
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_0

    .line 324
    :goto_5
    if-eqz v1, :cond_a

    .line 325
    .line 326
    :try_start_a
    invoke-virtual {v1}, Ljava/io/InputStream;->close()V
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_3

    .line 327
    .line 328
    .line 329
    goto :goto_6

    .line 330
    :catchall_3
    move-exception v0

    .line 331
    invoke-virtual {v2, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 332
    .line 333
    .line 334
    :cond_a
    :goto_6
    throw v2

    .line 335
    :cond_b
    :goto_7
    const-string v1, "Location"

    .line 336
    .line 337
    invoke-virtual {v2, v1}, Ljava/net/URLConnection;->getHeaderField(Ljava/lang/String;)Ljava/lang/String;

    .line 338
    .line 339
    .line 340
    move-result-object v1

    .line 341
    new-instance v2, Lbd;

    .line 342
    .line 343
    new-instance v3, Ljava/net/URL;

    .line 344
    .line 345
    invoke-direct {v3, v1}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    .line 346
    .line 347
    .line 348
    const-wide/16 v4, 0x0

    .line 349
    .line 350
    invoke-direct {v2, v0, v3, v4, v5}, Lbd;-><init>(ILjava/net/URL;J)V

    .line 351
    .line 352
    .line 353
    return-object v2

    .line 354
    :catchall_4
    move-exception v0

    .line 355
    move-object v1, v0

    .line 356
    goto :goto_b

    .line 357
    :goto_8
    move-object v1, v0

    .line 358
    goto :goto_9

    .line 359
    :catchall_5
    move-exception v0

    .line 360
    goto :goto_8

    .line 361
    :goto_9
    :try_start_b
    invoke-virtual {v11}, Ljava/io/OutputStream;->close()V
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_6

    .line 362
    .line 363
    .line 364
    goto :goto_a

    .line 365
    :catchall_6
    move-exception v0

    .line 366
    :try_start_c
    invoke-virtual {v1, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 367
    .line 368
    .line 369
    :goto_a
    throw v1
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_4

    .line 370
    :goto_b
    if-eqz v10, :cond_c

    .line 371
    .line 372
    :try_start_d
    invoke-virtual {v10}, Ljava/io/OutputStream;->close()V
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_7

    .line 373
    .line 374
    .line 375
    goto :goto_c

    .line 376
    :catchall_7
    move-exception v0

    .line 377
    :try_start_e
    invoke-virtual {v1, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 378
    .line 379
    .line 380
    :cond_c
    :goto_c
    throw v1
    :try_end_e
    .catch Ljava/net/ConnectException; {:try_start_e .. :try_end_e} :catch_3
    .catch Ljava/net/UnknownHostException; {:try_start_e .. :try_end_e} :catch_2
    .catch Lwd0; {:try_start_e .. :try_end_e} :catch_1
    .catch Ljava/io/IOException; {:try_start_e .. :try_end_e} :catch_0

    .line 381
    :goto_d
    const-string v1, "Couldn\'t encode request, returning with 400"

    .line 382
    .line 383
    invoke-static {v3, v1, v0}, Lpy0;->R(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Exception;)V

    .line 384
    .line 385
    .line 386
    new-instance v0, Lbd;

    .line 387
    .line 388
    const/16 v1, 0x190

    .line 389
    .line 390
    const-wide/16 v4, 0x0

    .line 391
    .line 392
    const/4 v6, 0x0

    .line 393
    invoke-direct {v0, v1, v6, v4, v5}, Lbd;-><init>(ILjava/net/URL;J)V

    .line 394
    .line 395
    .line 396
    goto :goto_f

    .line 397
    :goto_e
    const-string v1, "Couldn\'t open connection, returning with 500"

    .line 398
    .line 399
    invoke-static {v3, v1, v0}, Lpy0;->R(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Exception;)V

    .line 400
    .line 401
    .line 402
    new-instance v0, Lbd;

    .line 403
    .line 404
    const/16 v1, 0x1f4

    .line 405
    .line 406
    invoke-direct {v0, v1, v6, v4, v5}, Lbd;-><init>(ILjava/net/URL;J)V

    .line 407
    .line 408
    .line 409
    :goto_f
    return-object v0
.end method

.method public create(Lokhttp3/Call;)Lokhttp3/EventListener;
    .locals 0

    .line 1
    iget-object p0, p0, Lx6;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Lokhttp3/EventListener;

    .line 4
    .line 5
    invoke-static {p0, p1}, Lokhttp3/internal/Util;->b(Lokhttp3/EventListener;Lokhttp3/Call;)Lokhttp3/EventListener;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method

.method public d(Lts0;ILandroid/os/Bundle;)Z
    .locals 6

    .line 1
    iget-object p0, p0, Lx6;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Landroidx/appcompat/widget/AppCompatEditText;

    .line 4
    .line 5
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 6
    .line 7
    const/16 v1, 0x19

    .line 8
    .line 9
    const/4 v2, 0x0

    .line 10
    const/4 v3, 0x1

    .line 11
    if-lt v0, v1, :cond_1

    .line 12
    .line 13
    and-int/2addr p2, v3

    .line 14
    if-eqz p2, :cond_1

    .line 15
    .line 16
    :try_start_0
    iget-object p2, p1, Lts0;->a:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast p2, Lfy0;

    .line 19
    .line 20
    invoke-interface {p2}, Lfy0;->b()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 21
    .line 22
    .line 23
    iget-object p2, p1, Lts0;->a:Ljava/lang/Object;

    .line 24
    .line 25
    check-cast p2, Lfy0;

    .line 26
    .line 27
    invoke-interface {p2}, Lfy0;->d()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object p2

    .line 31
    check-cast p2, Landroid/os/Parcelable;

    .line 32
    .line 33
    if-nez p3, :cond_0

    .line 34
    .line 35
    new-instance p3, Landroid/os/Bundle;

    .line 36
    .line 37
    invoke-direct {p3}, Landroid/os/Bundle;-><init>()V

    .line 38
    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_0
    new-instance v1, Landroid/os/Bundle;

    .line 42
    .line 43
    invoke-direct {v1, p3}, Landroid/os/Bundle;-><init>(Landroid/os/Bundle;)V

    .line 44
    .line 45
    .line 46
    move-object p3, v1

    .line 47
    :goto_0
    const-string v1, "androidx.core.view.extra.INPUT_CONTENT_INFO"

    .line 48
    .line 49
    invoke-virtual {p3, v1, p2}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 50
    .line 51
    .line 52
    goto :goto_1

    .line 53
    :catch_0
    move-exception p0

    .line 54
    const-string p1, "InputConnectionCompat"

    .line 55
    .line 56
    const-string p2, "Can\'t insert content from IME; requestPermission() failed"

    .line 57
    .line 58
    invoke-static {p1, p2, p0}, Lio/sentry/android/core/n0;->s(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 59
    .line 60
    .line 61
    return v2

    .line 62
    :cond_1
    :goto_1
    new-instance p2, Landroid/content/ClipData;

    .line 63
    .line 64
    iget-object p1, p1, Lts0;->a:Ljava/lang/Object;

    .line 65
    .line 66
    check-cast p1, Lfy0;

    .line 67
    .line 68
    invoke-interface {p1}, Lfy0;->getDescription()Landroid/content/ClipDescription;

    .line 69
    .line 70
    .line 71
    move-result-object v1

    .line 72
    new-instance v4, Landroid/content/ClipData$Item;

    .line 73
    .line 74
    invoke-interface {p1}, Lfy0;->a()Landroid/net/Uri;

    .line 75
    .line 76
    .line 77
    move-result-object v5

    .line 78
    invoke-direct {v4, v5}, Landroid/content/ClipData$Item;-><init>(Landroid/net/Uri;)V

    .line 79
    .line 80
    .line 81
    invoke-direct {p2, v1, v4}, Landroid/content/ClipData;-><init>(Landroid/content/ClipDescription;Landroid/content/ClipData$Item;)V

    .line 82
    .line 83
    .line 84
    const/16 v1, 0x1f

    .line 85
    .line 86
    const/4 v4, 0x2

    .line 87
    if-lt v0, v1, :cond_2

    .line 88
    .line 89
    new-instance v0, Lgr0;

    .line 90
    .line 91
    invoke-direct {v0, p2, v4}, Lgr0;-><init>(Landroid/content/ClipData;I)V

    .line 92
    .line 93
    .line 94
    goto :goto_2

    .line 95
    :cond_2
    new-instance v0, Lj00;

    .line 96
    .line 97
    invoke-direct {v0}, Lj00;-><init>()V

    .line 98
    .line 99
    .line 100
    iput-object p2, v0, Lj00;->b:Landroid/content/ClipData;

    .line 101
    .line 102
    iput v4, v0, Lj00;->c:I

    .line 103
    .line 104
    :goto_2
    invoke-interface {p1}, Lfy0;->c()Landroid/net/Uri;

    .line 105
    .line 106
    .line 107
    move-result-object p1

    .line 108
    invoke-interface {v0, p1}, Li00;->d(Landroid/net/Uri;)V

    .line 109
    .line 110
    .line 111
    invoke-interface {v0, p3}, Li00;->setExtras(Landroid/os/Bundle;)V

    .line 112
    .line 113
    .line 114
    invoke-interface {v0}, Li00;->build()Ll00;

    .line 115
    .line 116
    .line 117
    move-result-object p1

    .line 118
    invoke-static {p0, p1}, Le33;->i(Landroid/view/View;Ll00;)Ll00;

    .line 119
    .line 120
    .line 121
    move-result-object p0

    .line 122
    if-nez p0, :cond_3

    .line 123
    .line 124
    return v3

    .line 125
    :cond_3
    return v2
.end method

.method public e(Lio/sentry/a1;)V
    .locals 4

    .line 1
    iget v0, p0, Lx6;->a:I

    .line 2
    .line 3
    iget-object p0, p0, Lx6;->b:Ljava/lang/Object;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    :pswitch_0
    check-cast p0, Lio/sentry/android/core/z0;

    .line 9
    .line 10
    iget-object p0, p0, Lio/sentry/android/core/z0;->a:Ljava/util/concurrent/atomic/AtomicLong;

    .line 11
    .line 12
    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicLong;->get()J

    .line 13
    .line 14
    .line 15
    move-result-wide v0

    .line 16
    const-wide/16 v2, 0x0

    .line 17
    .line 18
    cmp-long v0, v0, v2

    .line 19
    .line 20
    if-nez v0, :cond_0

    .line 21
    .line 22
    invoke-interface {p1}, Lio/sentry/a1;->r()Lio/sentry/z6;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    if-eqz p1, :cond_0

    .line 27
    .line 28
    iget-object p1, p1, Lio/sentry/z6;->a:Ljava/util/Date;

    .line 29
    .line 30
    if-eqz p1, :cond_0

    .line 31
    .line 32
    invoke-virtual {p1}, Ljava/util/Date;->getTime()J

    .line 33
    .line 34
    .line 35
    move-result-wide v0

    .line 36
    invoke-virtual {p0, v0, v1}, Ljava/util/concurrent/atomic/AtomicLong;->set(J)V

    .line 37
    .line 38
    .line 39
    :cond_0
    return-void

    .line 40
    :pswitch_1
    check-cast p0, Lio/sentry/m1;

    .line 41
    .line 42
    new-instance v0, Lpn;

    .line 43
    .line 44
    const/16 v1, 0x14

    .line 45
    .line 46
    invoke-direct {v0, v1, p0, p1}, Lpn;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 47
    .line 48
    .line 49
    invoke-interface {p1, v0}, Lio/sentry/a1;->G(Lio/sentry/a4;)V

    .line 50
    .line 51
    .line 52
    return-void

    .line 53
    :pswitch_2
    check-cast p0, Ljava/lang/String;

    .line 54
    .line 55
    invoke-interface {p1, p0}, Lio/sentry/a1;->x(Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    return-void

    .line 59
    :pswitch_3
    check-cast p0, Ljava/util/concurrent/atomic/AtomicReference;

    .line 60
    .line 61
    invoke-interface {p1}, Lio/sentry/a1;->i()Lio/sentry/protocol/w;

    .line 62
    .line 63
    .line 64
    move-result-object p1

    .line 65
    invoke-virtual {p0, p1}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    .line 66
    .line 67
    .line 68
    return-void

    .line 69
    :pswitch_data_0
    .packed-switch 0x18
        :pswitch_3
        :pswitch_0
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method

.method public execute()Ljava/lang/Object;
    .locals 6

    .line 1
    iget v0, p0, Lx6;->a:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iget-object p0, p0, Lx6;->b:Ljava/lang/Object;

    .line 5
    .line 6
    packed-switch v0, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    check-cast p0, Lra2;

    .line 10
    .line 11
    iget-object v0, p0, Lra2;->b:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v0, Ls52;

    .line 14
    .line 15
    new-instance v2, Lf42;

    .line 16
    .line 17
    const/4 v3, 0x2

    .line 18
    invoke-direct {v2, v3}, Lf42;-><init>(I)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0, v2}, Ls52;->g(Lq52;)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    check-cast v0, Ljava/lang/Iterable;

    .line 26
    .line 27
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 32
    .line 33
    .line 34
    move-result v2

    .line 35
    if-eqz v2, :cond_0

    .line 36
    .line 37
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v2

    .line 41
    check-cast v2, Lyg;

    .line 42
    .line 43
    iget-object v3, p0, Lra2;->c:Ljava/lang/Object;

    .line 44
    .line 45
    check-cast v3, Lec;

    .line 46
    .line 47
    const/4 v4, 0x1

    .line 48
    const/4 v5, 0x0

    .line 49
    invoke-virtual {v3, v2, v4, v5}, Lec;->K(Lyg;IZ)V

    .line 50
    .line 51
    .line 52
    goto :goto_0

    .line 53
    :cond_0
    return-object v1

    .line 54
    :pswitch_0
    check-cast p0, Lf31;

    .line 55
    .line 56
    iget-object p0, p0, Lf31;->i:Ljava/lang/Object;

    .line 57
    .line 58
    check-cast p0, Ls52;

    .line 59
    .line 60
    invoke-virtual {p0}, Ls52;->c()Landroid/database/sqlite/SQLiteDatabase;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    invoke-virtual {v0}, Landroid/database/sqlite/SQLiteDatabase;->beginTransaction()V

    .line 65
    .line 66
    .line 67
    :try_start_0
    const-string v2, "DELETE FROM log_event_dropped"

    .line 68
    .line 69
    invoke-virtual {v0, v2}, Landroid/database/sqlite/SQLiteDatabase;->compileStatement(Ljava/lang/String;)Landroid/database/sqlite/SQLiteStatement;

    .line 70
    .line 71
    .line 72
    move-result-object v2

    .line 73
    invoke-virtual {v2}, Landroid/database/sqlite/SQLiteStatement;->execute()V

    .line 74
    .line 75
    .line 76
    new-instance v2, Ljava/lang/StringBuilder;

    .line 77
    .line 78
    const-string v3, "UPDATE global_log_event_state SET last_metrics_upload_ms="

    .line 79
    .line 80
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 81
    .line 82
    .line 83
    iget-object p0, p0, Ls52;->b:Lyv;

    .line 84
    .line 85
    invoke-interface {p0}, Lyv;->a()J

    .line 86
    .line 87
    .line 88
    move-result-wide v3

    .line 89
    invoke-virtual {v2, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 90
    .line 91
    .line 92
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 93
    .line 94
    .line 95
    move-result-object p0

    .line 96
    invoke-virtual {v0, p0}, Landroid/database/sqlite/SQLiteDatabase;->compileStatement(Ljava/lang/String;)Landroid/database/sqlite/SQLiteStatement;

    .line 97
    .line 98
    .line 99
    move-result-object p0

    .line 100
    invoke-virtual {p0}, Landroid/database/sqlite/SQLiteStatement;->execute()V

    .line 101
    .line 102
    .line 103
    invoke-virtual {v0}, Landroid/database/sqlite/SQLiteDatabase;->setTransactionSuccessful()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 104
    .line 105
    .line 106
    invoke-virtual {v0}, Landroid/database/sqlite/SQLiteDatabase;->endTransaction()V

    .line 107
    .line 108
    .line 109
    return-object v1

    .line 110
    :catchall_0
    move-exception p0

    .line 111
    invoke-virtual {v0}, Landroid/database/sqlite/SQLiteDatabase;->endTransaction()V

    .line 112
    .line 113
    .line 114
    throw p0

    .line 115
    :pswitch_data_0
    .packed-switch 0x10
        :pswitch_0
    .end packed-switch
.end method

.method public f(Low0;)V
    .locals 2

    .line 1
    iget v0, p0, Lx6;->a:I

    .line 2
    .line 3
    iget-object p0, p0, Lx6;->b:Ljava/lang/Object;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    check-cast p0, Lzr0;

    .line 9
    .line 10
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    :try_start_0
    invoke-interface {p1}, Low0;->acquireLatestImage()Lmw0;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    if-eqz p1, :cond_0

    .line 18
    .line 19
    iget-object p0, p0, Lzr0;->e:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast p0, Lac1;

    .line 22
    .line 23
    invoke-virtual {p0, p1}, Lac1;->k(Lmw0;)V
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    .line 24
    .line 25
    .line 26
    goto :goto_0

    .line 27
    :catch_0
    move-exception p0

    .line 28
    const-string p1, "ZslControlImpl"

    .line 29
    .line 30
    new-instance v0, Ljava/lang/StringBuilder;

    .line 31
    .line 32
    const-string v1, "Failed to acquire latest image IllegalStateException = "

    .line 33
    .line 34
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 42
    .line 43
    .line 44
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    invoke-static {p1, p0}, Lhu0;->T(Ljava/lang/String;Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    :cond_0
    :goto_0
    return-void

    .line 52
    :pswitch_0
    check-cast p0, Lli1;

    .line 53
    .line 54
    iget-object v0, p0, Lli1;->a:Ljava/lang/Object;

    .line 55
    .line 56
    monitor-enter v0

    .line 57
    :try_start_1
    iget v1, p0, Lli1;->c:I

    .line 58
    .line 59
    add-int/lit8 v1, v1, 0x1

    .line 60
    .line 61
    iput v1, p0, Lli1;->c:I

    .line 62
    .line 63
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 64
    invoke-virtual {p0, p1}, Lli1;->i(Low0;)V

    .line 65
    .line 66
    .line 67
    return-void

    .line 68
    :catchall_0
    move-exception p0

    .line 69
    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 70
    throw p0

    .line 71
    :pswitch_data_0
    .packed-switch 0x8
        :pswitch_0
    .end packed-switch
.end method

.method public g(Lkj;Ljava/util/List;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lx6;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Ltz1;

    .line 4
    .line 5
    invoke-interface {p0, p1, p2}, Ltz1;->e(Lkj;Ljava/util/List;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public onComplete(Lcom/google/android/gms/tasks/Task;)V
    .locals 0

    .line 1
    iget p1, p0, Lx6;->a:I

    .line 2
    .line 3
    iget-object p0, p0, Lx6;->b:Ljava/lang/Object;

    .line 4
    .line 5
    packed-switch p1, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    check-cast p0, Ljava/util/concurrent/ScheduledFuture;

    .line 9
    .line 10
    const/4 p1, 0x0

    .line 11
    invoke-interface {p0, p1}, Ljava/util/concurrent/Future;->cancel(Z)Z

    .line 12
    .line 13
    .line 14
    return-void

    .line 15
    :pswitch_0
    check-cast p0, Lb93;

    .line 16
    .line 17
    iget-object p0, p0, Lb93;->b:Lcom/google/android/gms/tasks/TaskCompletionSource;

    .line 18
    .line 19
    const/4 p1, 0x0

    .line 20
    invoke-virtual {p0, p1}, Lcom/google/android/gms/tasks/TaskCompletionSource;->trySetResult(Ljava/lang/Object;)Z

    .line 21
    .line 22
    .line 23
    return-void

    .line 24
    :pswitch_1
    check-cast p0, Landroid/content/Intent;

    .line 25
    .line 26
    invoke-static {p0}, Lyy1;->l(Landroid/content/Intent;)V

    .line 27
    .line 28
    .line 29
    return-void

    .line 30
    nop

    .line 31
    :pswitch_data_0
    .packed-switch 0x13
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public onFrameworkResponse(Z)V
    .locals 0

    .line 1
    iget-object p0, p0, Lx6;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Lio/flutter/embedding/android/KeyboardManager$Responder$OnKeyEventHandledCallback;

    .line 4
    .line 5
    invoke-static {p0, p1}, Lio/flutter/embedding/android/KeyChannelResponder;->a(Lio/flutter/embedding/android/KeyboardManager$Responder$OnKeyEventHandledCallback;Z)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public onMethodCall(Lio/flutter/plugin/common/MethodCall;Lio/flutter/plugin/common/MethodChannel$Result;)V
    .locals 4

    .line 1
    iget-object p0, p0, Lx6;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Lo92;

    .line 4
    .line 5
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    iget-object v0, p1, Lio/flutter/plugin/common/MethodCall;->method:Ljava/lang/String;

    .line 12
    .line 13
    const/4 v1, 0x0

    .line 14
    if-eqz v0, :cond_8

    .line 15
    .line 16
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    sparse-switch v2, :sswitch_data_0

    .line 21
    .line 22
    .line 23
    goto :goto_0

    .line 24
    :sswitch_0
    const-string v2, "setGyroscopeSamplingPeriod"

    .line 25
    .line 26
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    if-nez v0, :cond_0

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_0
    iget-object p0, p0, Lo92;->v:Ljh2;

    .line 34
    .line 35
    if-eqz p0, :cond_1

    .line 36
    .line 37
    goto :goto_1

    .line 38
    :cond_1
    const-string p0, "gyroscopeStreamHandler"

    .line 39
    .line 40
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->e(Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    throw v1

    .line 44
    :sswitch_1
    const-string v2, "setUserAccelerometerSamplingPeriod"

    .line 45
    .line 46
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 47
    .line 48
    .line 49
    move-result v0

    .line 50
    if-nez v0, :cond_2

    .line 51
    .line 52
    goto :goto_0

    .line 53
    :cond_2
    iget-object p0, p0, Lo92;->i:Ljh2;

    .line 54
    .line 55
    if-eqz p0, :cond_3

    .line 56
    .line 57
    goto :goto_1

    .line 58
    :cond_3
    const-string p0, "userAccelStreamHandler"

    .line 59
    .line 60
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->e(Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    throw v1

    .line 64
    :sswitch_2
    const-string v2, "setMagnetometerSamplingPeriod"

    .line 65
    .line 66
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 67
    .line 68
    .line 69
    move-result v0

    .line 70
    if-nez v0, :cond_4

    .line 71
    .line 72
    goto :goto_0

    .line 73
    :cond_4
    iget-object p0, p0, Lo92;->w:Ljh2;

    .line 74
    .line 75
    if-eqz p0, :cond_5

    .line 76
    .line 77
    goto :goto_1

    .line 78
    :cond_5
    const-string p0, "magnetometerStreamHandler"

    .line 79
    .line 80
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->e(Ljava/lang/String;)V

    .line 81
    .line 82
    .line 83
    throw v1

    .line 84
    :sswitch_3
    const-string v2, "setAccelerationSamplingPeriod"

    .line 85
    .line 86
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 87
    .line 88
    .line 89
    move-result v0

    .line 90
    if-nez v0, :cond_6

    .line 91
    .line 92
    goto :goto_0

    .line 93
    :cond_6
    iget-object p0, p0, Lo92;->f:Ljh2;

    .line 94
    .line 95
    if-eqz p0, :cond_7

    .line 96
    .line 97
    goto :goto_1

    .line 98
    :cond_7
    const-string p0, "accelerometerStreamHandler"

    .line 99
    .line 100
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->e(Ljava/lang/String;)V

    .line 101
    .line 102
    .line 103
    throw v1

    .line 104
    :cond_8
    :goto_0
    move-object p0, v1

    .line 105
    :goto_1
    if-eqz p0, :cond_9

    .line 106
    .line 107
    iget-object p1, p1, Lio/flutter/plugin/common/MethodCall;->arguments:Ljava/lang/Object;

    .line 108
    .line 109
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 110
    .line 111
    .line 112
    check-cast p1, Ljava/lang/Integer;

    .line 113
    .line 114
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 115
    .line 116
    .line 117
    move-result p1

    .line 118
    iput p1, p0, Ljh2;->e:I

    .line 119
    .line 120
    iget-object p1, p0, Ljh2;->a:Landroid/hardware/SensorManager;

    .line 121
    .line 122
    iget-object v0, p0, Ljh2;->c:Lih2;

    .line 123
    .line 124
    if-eqz v0, :cond_9

    .line 125
    .line 126
    invoke-virtual {p1, v0}, Landroid/hardware/SensorManager;->unregisterListener(Landroid/hardware/SensorEventListener;)V

    .line 127
    .line 128
    .line 129
    iget-object v0, p0, Ljh2;->c:Lih2;

    .line 130
    .line 131
    iget-object v2, p0, Ljh2;->d:Landroid/hardware/Sensor;

    .line 132
    .line 133
    iget v3, p0, Ljh2;->e:I

    .line 134
    .line 135
    invoke-virtual {p1, v0, v2, v3}, Landroid/hardware/SensorManager;->registerListener(Landroid/hardware/SensorEventListener;Landroid/hardware/Sensor;I)Z

    .line 136
    .line 137
    .line 138
    :cond_9
    if-eqz p0, :cond_a

    .line 139
    .line 140
    invoke-interface {p2, v1}, Lio/flutter/plugin/common/MethodChannel$Result;->success(Ljava/lang/Object;)V

    .line 141
    .line 142
    .line 143
    return-void

    .line 144
    :cond_a
    invoke-interface {p2}, Lio/flutter/plugin/common/MethodChannel$Result;->notImplemented()V

    .line 145
    .line 146
    .line 147
    return-void

    .line 148
    nop

    .line 149
    :sswitch_data_0
    .sparse-switch
        -0x683794d6 -> :sswitch_3
        -0x47c307f2 -> :sswitch_2
        -0x1f1a2cd6 -> :sswitch_1
        0x4399422b -> :sswitch_0
    .end sparse-switch
.end method

.method public onSuccess(Ljava/lang/Object;)V
    .locals 1

    .line 1
    iget-object p0, p0, Lx6;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Lf;

    .line 4
    .line 5
    sget v0, Lcom/supercell/titan/agesignals/AgeSignals;->MAX_RETRIES:I

    .line 6
    .line 7
    invoke-virtual {p0, p1}, Lf;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public q(Ljava/lang/Object;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lx6;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Lyn;

    .line 4
    .line 5
    invoke-virtual {p0, p1}, Lrk1;->j(Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public reply(Ljava/lang/Object;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lx6;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Lio/flutter/embedding/engine/systemchannels/KeyEventChannel$EventResponseHandler;

    .line 4
    .line 5
    invoke-static {p0, p1}, Lio/flutter/embedding/engine/systemchannels/KeyEventChannel;->a(Lio/flutter/embedding/engine/systemchannels/KeyEventChannel$EventResponseHandler;Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public run(Landroid/view/View;)Z
    .locals 0

    .line 1
    iget-object p0, p0, Lx6;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, [Ljava/lang/Class;

    .line 4
    .line 5
    invoke-static {p0, p1}, Lio/flutter/util/ViewUtils;->b([Ljava/lang/Class;Landroid/view/View;)Z

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    return p0
.end method
