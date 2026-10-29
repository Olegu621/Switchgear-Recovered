.class public Lqc3;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"

# interfaces
.implements Lorg/chromium/support_lib_boundary/WebViewRendererClientBoundaryInterface;
.implements Ljp1;
.implements Ldh1;
.implements Lcom/google/android/gms/tasks/OnSuccessListener;
.implements Lrg1;
.implements Lju;
.implements Lar;
.implements Lk00;
.implements Lge0;
.implements Lsg0;
.implements Lzf0;
.implements Lio/flutter/embedding/android/ExclusiveAppComponent;
.implements Lxo0;


# static fields
.field public static c:Lqc3;

.field public static final d:Lmq0;

.field public static final e:[Ljava/lang/String;

.field public static final f:Ltg3;


# instance fields
.field public final synthetic a:I

.field public b:Ljava/lang/Object;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lmq0;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-direct {v0, v1}, Lmq0;-><init>(I)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lqc3;->d:Lmq0;

    .line 8
    .line 9
    const-string v0, "WEB_VIEW_RENDERER_CLIENT_BASIC_USAGE"

    .line 10
    .line 11
    filled-new-array {v0}, [Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    sput-object v0, Lqc3;->e:[Ljava/lang/String;

    .line 16
    .line 17
    new-instance v0, Ltg3;

    .line 18
    .line 19
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 20
    .line 21
    .line 22
    sput-object v0, Lqc3;->f:Ltg3;

    .line 23
    .line 24
    return-void
.end method

.method public constructor <init>(I)V
    .locals 4

    .line 1
    iput p1, p0, Lqc3;->a:I

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    sparse-switch p1, :sswitch_data_0

    .line 5
    .line 6
    .line 7
    new-instance p1, Llb1;

    .line 8
    .line 9
    :try_start_0
    const-string v1, "com.google.crypto.tink.shaded.protobuf.DescriptorMessageInfoFactory"

    .line 10
    .line 11
    invoke-static {v1}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    const-string v2, "getInstance"

    .line 16
    .line 17
    const/4 v3, 0x0

    .line 18
    invoke-virtual {v1, v2, v3}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    invoke-virtual {v1, v3, v3}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    check-cast v1, Llh1;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :catch_0
    sget-object v1, Lqc3;->d:Lmq0;

    .line 30
    .line 31
    :goto_0
    const/4 v2, 0x2

    .line 32
    new-array v2, v2, [Llh1;

    .line 33
    .line 34
    sget-object v3, Lmq0;->b:Lmq0;

    .line 35
    .line 36
    aput-object v3, v2, v0

    .line 37
    .line 38
    const/4 v0, 0x1

    .line 39
    aput-object v1, v2, v0

    .line 40
    .line 41
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 42
    .line 43
    .line 44
    iput-object v2, p1, Llb1;->a:[Llh1;

    .line 45
    .line 46
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 47
    .line 48
    .line 49
    sget-object v0, Lez0;->a:Ljava/nio/charset/Charset;

    .line 50
    .line 51
    iput-object p1, p0, Lqc3;->b:Ljava/lang/Object;

    .line 52
    .line 53
    return-void

    .line 54
    :sswitch_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 55
    .line 56
    .line 57
    const-class p1, Landroidx/camera/camera2/internal/compat/quirk/SmallDisplaySizeQuirk;

    .line 58
    .line 59
    sget-object v0, Lf80;->a:Ler0;

    .line 60
    .line 61
    invoke-virtual {v0, p1}, Ler0;->h(Ljava/lang/Class;)Lh02;

    .line 62
    .line 63
    .line 64
    move-result-object p1

    .line 65
    check-cast p1, Landroidx/camera/camera2/internal/compat/quirk/SmallDisplaySizeQuirk;

    .line 66
    .line 67
    iput-object p1, p0, Lqc3;->b:Ljava/lang/Object;

    .line 68
    .line 69
    return-void

    .line 70
    :sswitch_1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 71
    .line 72
    .line 73
    new-instance p1, Lts0;

    .line 74
    .line 75
    sget-object v0, Lwq0;->h:Lwq0;

    .line 76
    .line 77
    invoke-direct {p1, v0}, Lts0;-><init>(Ljava/lang/Object;)V

    .line 78
    .line 79
    .line 80
    iput-object p1, p0, Lqc3;->b:Ljava/lang/Object;

    .line 81
    .line 82
    return-void

    .line 83
    :sswitch_2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 84
    .line 85
    .line 86
    return-void

    .line 87
    :sswitch_3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 88
    .line 89
    .line 90
    new-instance p1, Ljava/util/concurrent/atomic/AtomicInteger;

    .line 91
    .line 92
    invoke-direct {p1, v0}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    .line 93
    .line 94
    .line 95
    iput-object p1, p0, Lqc3;->b:Ljava/lang/Object;

    .line 96
    .line 97
    return-void

    .line 98
    :sswitch_4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 99
    .line 100
    .line 101
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 102
    .line 103
    const/16 v0, 0x1a

    .line 104
    .line 105
    if-lt p1, v0, :cond_0

    .line 106
    .line 107
    new-instance p1, Lh1;

    .line 108
    .line 109
    invoke-direct {p1, p0}, Lg1;-><init>(Lqc3;)V

    .line 110
    .line 111
    .line 112
    iput-object p1, p0, Lqc3;->b:Ljava/lang/Object;

    .line 113
    .line 114
    goto :goto_1

    .line 115
    :cond_0
    new-instance p1, Lg1;

    .line 116
    .line 117
    invoke-direct {p1, p0}, Lg1;-><init>(Lqc3;)V

    .line 118
    .line 119
    .line 120
    iput-object p1, p0, Lqc3;->b:Ljava/lang/Object;

    .line 121
    .line 122
    :goto_1
    return-void

    .line 123
    :sswitch_data_0
    .sparse-switch
        0x4 -> :sswitch_4
        0xa -> :sswitch_3
        0xd -> :sswitch_2
        0x14 -> :sswitch_1
        0x15 -> :sswitch_0
    .end sparse-switch
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lqc3;->a:I

    .line 123
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Leh2;->a(Landroid/content/Context;)Leh2;

    move-result-object p1

    iput-object p1, p0, Lqc3;->b:Ljava/lang/Object;

    .line 124
    invoke-virtual {p1}, Leh2;->b()Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;

    .line 125
    const-string p0, "defaultGoogleSignInAccount"

    invoke-virtual {p1, p0}, Leh2;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    .line 126
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const-string v0, "googleSignInOptions"

    .line 127
    invoke-static {v0, p0}, Leh2;->f(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p1, p0}, Leh2;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    if-eqz p0, :cond_1

    .line 128
    :try_start_0
    invoke-static {p0}, Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;->D1(Ljava/lang/String;)Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :cond_1
    :goto_0
    return-void
.end method

.method public constructor <init>(Landroid/view/ContentInfo;)V
    .locals 1

    const/16 v0, 0x12

    iput v0, p0, Lqc3;->a:I

    .line 131
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 132
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 133
    invoke-static {p1}, Lh00;->w(Ljava/lang/Object;)Landroid/view/ContentInfo;

    move-result-object p1

    iput-object p1, p0, Lqc3;->b:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    .line 130
    iput p2, p0, Lqc3;->a:I

    iput-object p1, p0, Lqc3;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Lod2;)V
    .locals 1

    const/16 v0, 0xc

    iput v0, p0, Lqc3;->a:I

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 129
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lqc3;->b:Ljava/lang/Object;

    return-void
.end method

.method public static j(Lgp;)Lqc3;
    .locals 4

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/16 v2, 0x21

    .line 5
    .line 6
    if-lt v0, v2, :cond_2

    .line 7
    .line 8
    invoke-static {}, Ly0;->f()Landroid/hardware/camera2/CameraCharacteristics$Key;

    .line 9
    .line 10
    .line 11
    move-result-object v3

    .line 12
    invoke-virtual {p0, v3}, Lgp;->a(Landroid/hardware/camera2/CameraCharacteristics$Key;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    invoke-static {p0}, Ly0;->g(Ljava/lang/Object;)Landroid/hardware/camera2/params/DynamicRangeProfiles;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    if-nez p0, :cond_0

    .line 21
    .line 22
    goto :goto_1

    .line 23
    :cond_0
    if-lt v0, v2, :cond_1

    .line 24
    .line 25
    const/4 v0, 0x1

    .line 26
    goto :goto_0

    .line 27
    :cond_1
    const/4 v0, 0x0

    .line 28
    :goto_0
    const-string v1, "DynamicRangeProfiles can only be converted to DynamicRangesCompat on API 33 or higher."

    .line 29
    .line 30
    invoke-static {v1, v0}, Lde3;->j(Ljava/lang/String;Z)V

    .line 31
    .line 32
    .line 33
    new-instance v1, Lqc3;

    .line 34
    .line 35
    new-instance v0, Lqb0;

    .line 36
    .line 37
    invoke-direct {v0, p0}, Lqb0;-><init>(Ljava/lang/Object;)V

    .line 38
    .line 39
    .line 40
    const/16 p0, 0x16

    .line 41
    .line 42
    invoke-direct {v1, v0, p0}, Lqc3;-><init>(Ljava/lang/Object;I)V

    .line 43
    .line 44
    .line 45
    :cond_2
    :goto_1
    if-nez v1, :cond_3

    .line 46
    .line 47
    sget-object p0, Lrb0;->a:Lqc3;

    .line 48
    .line 49
    return-object p0

    .line 50
    :cond_3
    return-object v1
.end method

.method public static declared-synchronized m(Landroid/content/Context;)Lqc3;
    .locals 3

    .line 1
    const-class v0, Lqc3;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    const-class v1, Lqc3;

    .line 9
    .line 10
    monitor-enter v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 11
    :try_start_1
    sget-object v2, Lqc3;->c:Lqc3;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 12
    .line 13
    if-eqz v2, :cond_0

    .line 14
    .line 15
    :goto_0
    :try_start_2
    monitor-exit v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 16
    goto :goto_1

    .line 17
    :cond_0
    :try_start_3
    new-instance v2, Lqc3;

    .line 18
    .line 19
    invoke-direct {v2, p0}, Lqc3;-><init>(Landroid/content/Context;)V

    .line 20
    .line 21
    .line 22
    sput-object v2, Lqc3;->c:Lqc3;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :goto_1
    monitor-exit v0

    .line 26
    return-object v2

    .line 27
    :catchall_0
    move-exception p0

    .line 28
    :try_start_4
    monitor-exit v1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 29
    :try_start_5
    throw p0

    .line 30
    :catchall_1
    move-exception p0

    .line 31
    monitor-exit v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 32
    throw p0
.end method

.method public static q(Ljava/lang/String;)Lqc3;
    .locals 10

    .line 1
    invoke-virtual {p0}, Ljava/lang/String;->isEmpty()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-nez v0, :cond_c

    .line 7
    .line 8
    new-instance v0, Lqc3;

    .line 9
    .line 10
    const/16 v2, 0x2f

    .line 11
    .line 12
    const/16 v3, 0x2e

    .line 13
    .line 14
    invoke-virtual {p0, v2, v3}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    sget-object v2, Ljj3;->a:Llj3;

    .line 19
    .line 20
    check-cast v2, Lrj3;

    .line 21
    .line 22
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 23
    .line 24
    .line 25
    sget-object v2, Luj3;->c:Ljava/util/concurrent/atomic/AtomicReference;

    .line 26
    .line 27
    invoke-virtual {v2}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v4

    .line 31
    if-eqz v4, :cond_0

    .line 32
    .line 33
    invoke-virtual {v2}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v2

    .line 37
    check-cast v2, Lwj3;

    .line 38
    .line 39
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 40
    .line 41
    .line 42
    new-instance v2, Lyj3;

    .line 43
    .line 44
    sget-object v3, Ljava/util/logging/Level;->OFF:Ljava/util/logging/Level;

    .line 45
    .line 46
    invoke-direct {v2, p0, v3, v1, v1}, Lyj3;-><init>(Ljava/lang/String;Ljava/util/logging/Level;Ljava/util/Set;Lti3;)V

    .line 47
    .line 48
    .line 49
    goto/16 :goto_6

    .line 50
    .line 51
    :cond_0
    new-instance v4, Luj3;

    .line 52
    .line 53
    const/16 v5, 0x24

    .line 54
    .line 55
    invoke-virtual {p0, v5, v3}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object p0

    .line 59
    invoke-direct {v4, p0}, Lsq3;-><init>(Ljava/lang/Object;)V

    .line 60
    .line 61
    .line 62
    sget-object v3, Landroid/os/Build;->FINGERPRINT:Ljava/lang/String;

    .line 63
    .line 64
    const/4 v5, 0x1

    .line 65
    const/4 v6, 0x0

    .line 66
    if-eqz v3, :cond_1

    .line 67
    .line 68
    const-string v7, "robolectric"

    .line 69
    .line 70
    invoke-virtual {v7, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 71
    .line 72
    .line 73
    move-result v3

    .line 74
    if-eqz v3, :cond_2

    .line 75
    .line 76
    :cond_1
    move v3, v5

    .line 77
    goto :goto_0

    .line 78
    :cond_2
    move v3, v6

    .line 79
    :goto_0
    sget-object v7, Landroid/os/Build;->HARDWARE:Ljava/lang/String;

    .line 80
    .line 81
    const-string v8, "goldfish"

    .line 82
    .line 83
    invoke-virtual {v8, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 84
    .line 85
    .line 86
    move-result v8

    .line 87
    if-nez v8, :cond_3

    .line 88
    .line 89
    const-string v8, "ranchu"

    .line 90
    .line 91
    invoke-virtual {v8, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 92
    .line 93
    .line 94
    move-result v7

    .line 95
    if-eqz v7, :cond_4

    .line 96
    .line 97
    :cond_3
    move v7, v5

    .line 98
    goto :goto_1

    .line 99
    :cond_4
    move v7, v6

    .line 100
    :goto_1
    sget-object v8, Landroid/os/Build;->TYPE:Ljava/lang/String;

    .line 101
    .line 102
    const-string v9, "eng"

    .line 103
    .line 104
    invoke-virtual {v9, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 105
    .line 106
    .line 107
    move-result v9

    .line 108
    if-nez v9, :cond_6

    .line 109
    .line 110
    const-string v9, "userdebug"

    .line 111
    .line 112
    invoke-virtual {v9, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 113
    .line 114
    .line 115
    move-result v8

    .line 116
    if-eqz v8, :cond_5

    .line 117
    .line 118
    goto :goto_2

    .line 119
    :cond_5
    move v5, v6

    .line 120
    :cond_6
    :goto_2
    if-nez v3, :cond_9

    .line 121
    .line 122
    if-eqz v7, :cond_7

    .line 123
    .line 124
    goto :goto_3

    .line 125
    :cond_7
    if-eqz v5, :cond_8

    .line 126
    .line 127
    sget-object v3, Lyj3;->f:Ljava/util/Set;

    .line 128
    .line 129
    sget-object v5, Lyj3;->i:Lti3;

    .line 130
    .line 131
    sget-object v6, Ljava/util/logging/Level;->ALL:Ljava/util/logging/Level;

    .line 132
    .line 133
    sget-object v6, Ljava/util/logging/Level;->OFF:Ljava/util/logging/Level;

    .line 134
    .line 135
    new-instance v7, Lyj3;

    .line 136
    .line 137
    invoke-direct {v7, p0, v6, v3, v5}, Lyj3;-><init>(Ljava/lang/String;Ljava/util/logging/Level;Ljava/util/Set;Lti3;)V

    .line 138
    .line 139
    .line 140
    iput-object v7, v4, Luj3;->b:Lsq3;

    .line 141
    .line 142
    goto :goto_4

    .line 143
    :cond_8
    iput-object v1, v4, Luj3;->b:Lsq3;

    .line 144
    .line 145
    goto :goto_4

    .line 146
    :cond_9
    :goto_3
    new-instance v3, Lxj3;

    .line 147
    .line 148
    invoke-direct {v3, p0}, Lxj3;-><init>(Ljava/lang/String;)V

    .line 149
    .line 150
    .line 151
    iput-object v3, v4, Luj3;->b:Lsq3;

    .line 152
    .line 153
    :goto_4
    sget-object p0, Lsj3;->a:Ljava/util/concurrent/ConcurrentLinkedQueue;

    .line 154
    .line 155
    invoke-virtual {p0, v4}, Ljava/util/concurrent/ConcurrentLinkedQueue;->offer(Ljava/lang/Object;)Z

    .line 156
    .line 157
    .line 158
    invoke-virtual {v2}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 159
    .line 160
    .line 161
    move-result-object p0

    .line 162
    if-eqz p0, :cond_b

    .line 163
    .line 164
    :goto_5
    sget-object p0, Lsj3;->a:Ljava/util/concurrent/ConcurrentLinkedQueue;

    .line 165
    .line 166
    invoke-virtual {p0}, Ljava/util/concurrent/ConcurrentLinkedQueue;->poll()Ljava/lang/Object;

    .line 167
    .line 168
    .line 169
    move-result-object p0

    .line 170
    check-cast p0, Luj3;

    .line 171
    .line 172
    if-eqz p0, :cond_a

    .line 173
    .line 174
    sget-object v2, Luj3;->c:Ljava/util/concurrent/atomic/AtomicReference;

    .line 175
    .line 176
    invoke-virtual {v2}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 177
    .line 178
    .line 179
    move-result-object v2

    .line 180
    check-cast v2, Lwj3;

    .line 181
    .line 182
    iget-object v3, p0, Lsq3;->a:Ljava/lang/Object;

    .line 183
    .line 184
    check-cast v3, Ljava/lang/String;

    .line 185
    .line 186
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 187
    .line 188
    .line 189
    new-instance v2, Lyj3;

    .line 190
    .line 191
    sget-object v5, Ljava/util/logging/Level;->OFF:Ljava/util/logging/Level;

    .line 192
    .line 193
    invoke-direct {v2, v3, v5, v1, v1}, Lyj3;-><init>(Ljava/lang/String;Ljava/util/logging/Level;Ljava/util/Set;Lti3;)V

    .line 194
    .line 195
    .line 196
    iput-object v2, p0, Luj3;->b:Lsq3;

    .line 197
    .line 198
    goto :goto_5

    .line 199
    :cond_a
    invoke-static {}, Luj3;->A()V

    .line 200
    .line 201
    .line 202
    :cond_b
    move-object v2, v4

    .line 203
    :goto_6
    const/4 p0, 0x3

    .line 204
    invoke-direct {v0, v2, p0}, Lqc3;-><init>(Ljava/lang/Object;I)V

    .line 205
    .line 206
    .line 207
    return-object v0

    .line 208
    :cond_c
    const-string p0, "injected class name is empty"

    .line 209
    .line 210
    invoke-static {p0}, Ln4;->j(Ljava/lang/String;)V

    .line 211
    .line 212
    .line 213
    return-object v1
.end method

.method public static s(Ljava/lang/String;Lsg3;)V
    .locals 6

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    new-instance v1, Ljava/util/Date;

    .line 7
    .line 8
    iget-wide v2, p1, Lsg3;->b:J

    .line 9
    .line 10
    const-wide/32 v4, 0xf4240

    .line 11
    .line 12
    .line 13
    div-long/2addr v2, v4

    .line 14
    invoke-direct {v1, v2, v3}, Ljava/util/Date;-><init>(J)V

    .line 15
    .line 16
    .line 17
    new-instance v2, Ljava/text/SimpleDateFormat;

    .line 18
    .line 19
    const-string v3, "yyyy-MM-dd\'T\'HH:mm:ss.SSSZ"

    .line 20
    .line 21
    invoke-direct {v2, v3}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {v2, v1}, Ljava/text/DateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    const-string v1, ": logging error ["

    .line 32
    .line 33
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    iget-object p1, p1, Lsg3;->d:Lhh3;

    .line 37
    .line 38
    if-eqz p1, :cond_1

    .line 39
    .line 40
    sget-object v1, Lhh3;->a:Lfh3;

    .line 41
    .line 42
    if-eq p1, v1, :cond_0

    .line 43
    .line 44
    invoke-virtual {p1}, Lhh3;->a()Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object v1

    .line 48
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 49
    .line 50
    .line 51
    const/16 v1, 0x2e

    .line 52
    .line 53
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 54
    .line 55
    .line 56
    invoke-virtual {p1}, Lhh3;->b()Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object v1

    .line 60
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 61
    .line 62
    .line 63
    const/16 v1, 0x3a

    .line 64
    .line 65
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 66
    .line 67
    .line 68
    invoke-virtual {p1}, Lhh3;->c()I

    .line 69
    .line 70
    .line 71
    move-result p1

    .line 72
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 73
    .line 74
    .line 75
    :cond_0
    const-string p1, "]: "

    .line 76
    .line 77
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 78
    .line 79
    .line 80
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 81
    .line 82
    .line 83
    sget-object p0, Ljava/lang/System;->err:Ljava/io/PrintStream;

    .line 84
    .line 85
    invoke-virtual {p0, v0}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    .line 86
    .line 87
    .line 88
    sget-object p0, Ljava/lang/System;->err:Ljava/io/PrintStream;

    .line 89
    .line 90
    invoke-virtual {p0}, Ljava/io/PrintStream;->flush()V

    .line 91
    .line 92
    .line 93
    return-void

    .line 94
    :cond_1
    const-string p0, "cannot request log site information prior to postProcess()"

    .line 95
    .line 96
    invoke-static {p0}, Lf42;->l(Ljava/lang/String;)V

    .line 97
    .line 98
    .line 99
    return-void
.end method


# virtual methods
.method public a()Landroid/content/ClipData;
    .locals 0

    .line 1
    iget-object p0, p0, Lqc3;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Landroid/view/ContentInfo;

    .line 4
    .line 5
    invoke-static {p0}, Lh00;->c(Landroid/view/ContentInfo;)Landroid/content/ClipData;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method

.method public b()Landroid/view/ContentInfo;
    .locals 0

    .line 1
    iget-object p0, p0, Lqc3;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Landroid/view/ContentInfo;

    .line 4
    .line 5
    return-object p0
.end method

.method public c(Ljg1;Landroid/view/MenuItem;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lqc3;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Lwr;

    .line 4
    .line 5
    iget-object p0, p0, Lwr;->f:Landroid/os/Handler;

    .line 6
    .line 7
    invoke-virtual {p0, p1}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public d(Ljg1;Z)V
    .locals 0

    .line 1
    iget-object p0, p0, Lqc3;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Lwa;

    .line 4
    .line 5
    invoke-virtual {p0, p1}, Lwa;->r(Ljg1;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public detachFromFlutterEngine()V
    .locals 0

    .line 1
    return-void
.end method

.method public e()I
    .locals 0

    .line 1
    iget-object p0, p0, Lqc3;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Landroid/view/ContentInfo;

    .line 4
    .line 5
    invoke-static {p0}, Lh00;->v(Landroid/view/ContentInfo;)I

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    return p0
.end method

.method public f(I)Lf1;
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return-object p0
.end method

.method public g(Ltj;)Ll50;
    .locals 23

    .line 1
    invoke-virtual/range {p1 .. p1}, Ltj;->k()Lf23;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual/range {p1 .. p1}, Ltj;->j()Lzl0;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    iget v1, v1, Lzl0;->a:I

    .line 10
    .line 11
    invoke-virtual/range {p1 .. p1}, Ltj;->j()Lzl0;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    invoke-virtual/range {p1 .. p1}, Ltj;->k()Lf23;

    .line 16
    .line 17
    .line 18
    move-result-object v3

    .line 19
    const/16 v4, 0x8

    .line 20
    .line 21
    invoke-static {v4}, Len;->E(I)[I

    .line 22
    .line 23
    .line 24
    move-result-object v5

    .line 25
    iget-byte v2, v2, Lzl0;->b:B

    .line 26
    .line 27
    aget v2, v5, v2

    .line 28
    .line 29
    move-object/from16 v5, p1

    .line 30
    .line 31
    iget-object v5, v5, Ltj;->a:Ljava/lang/Object;

    .line 32
    .line 33
    check-cast v5, Lsj;

    .line 34
    .line 35
    iget v6, v5, Lsj;->b:I

    .line 36
    .line 37
    const/4 v7, 0x0

    .line 38
    move v8, v7

    .line 39
    :goto_0
    if-ge v8, v6, :cond_2

    .line 40
    .line 41
    move v9, v7

    .line 42
    :goto_1
    if-ge v9, v6, :cond_1

    .line 43
    .line 44
    invoke-static {v2, v8, v9}, Len;->a(III)Z

    .line 45
    .line 46
    .line 47
    move-result v10

    .line 48
    if-eqz v10, :cond_0

    .line 49
    .line 50
    invoke-virtual {v5, v9, v8}, Lsj;->a(II)V

    .line 51
    .line 52
    .line 53
    :cond_0
    add-int/lit8 v9, v9, 0x1

    .line 54
    .line 55
    goto :goto_1

    .line 56
    :cond_1
    add-int/lit8 v8, v8, 0x1

    .line 57
    .line 58
    goto :goto_0

    .line 59
    :cond_2
    iget v2, v3, Lf23;->a:I

    .line 60
    .line 61
    const/4 v8, 0x4

    .line 62
    mul-int/2addr v2, v8

    .line 63
    add-int/lit8 v9, v2, 0x11

    .line 64
    .line 65
    iget v10, v3, Lf23;->d:I

    .line 66
    .line 67
    new-instance v11, Lsj;

    .line 68
    .line 69
    invoke-direct {v11, v9, v9}, Lsj;-><init>(II)V

    .line 70
    .line 71
    .line 72
    const/16 v9, 0x9

    .line 73
    .line 74
    invoke-virtual {v11, v7, v7, v9, v9}, Lsj;->d(IIII)V

    .line 75
    .line 76
    .line 77
    add-int/lit8 v12, v2, 0x9

    .line 78
    .line 79
    invoke-virtual {v11, v12, v7, v4, v9}, Lsj;->d(IIII)V

    .line 80
    .line 81
    .line 82
    invoke-virtual {v11, v7, v12, v9, v4}, Lsj;->d(IIII)V

    .line 83
    .line 84
    .line 85
    iget-object v12, v3, Lf23;->b:[I

    .line 86
    .line 87
    array-length v13, v12

    .line 88
    move v14, v7

    .line 89
    :goto_2
    const/4 v15, 0x2

    .line 90
    const/4 v8, 0x5

    .line 91
    if-ge v14, v13, :cond_7

    .line 92
    .line 93
    aget v16, v12, v14

    .line 94
    .line 95
    add-int/lit8 v4, v16, -0x2

    .line 96
    .line 97
    move/from16 v16, v15

    .line 98
    .line 99
    move v15, v7

    .line 100
    :goto_3
    if-ge v15, v13, :cond_6

    .line 101
    .line 102
    if-nez v14, :cond_3

    .line 103
    .line 104
    if-eqz v15, :cond_5

    .line 105
    .line 106
    add-int/lit8 v7, v13, -0x1

    .line 107
    .line 108
    if-eq v15, v7, :cond_5

    .line 109
    .line 110
    :cond_3
    add-int/lit8 v7, v13, -0x1

    .line 111
    .line 112
    if-ne v14, v7, :cond_4

    .line 113
    .line 114
    if-eqz v15, :cond_5

    .line 115
    .line 116
    :cond_4
    aget v7, v12, v15

    .line 117
    .line 118
    add-int/lit8 v7, v7, -0x2

    .line 119
    .line 120
    invoke-virtual {v11, v7, v4, v8, v8}, Lsj;->d(IIII)V

    .line 121
    .line 122
    .line 123
    :cond_5
    add-int/lit8 v15, v15, 0x1

    .line 124
    .line 125
    const/4 v7, 0x0

    .line 126
    goto :goto_3

    .line 127
    :cond_6
    add-int/lit8 v14, v14, 0x1

    .line 128
    .line 129
    const/16 v4, 0x8

    .line 130
    .line 131
    const/4 v7, 0x0

    .line 132
    const/4 v8, 0x4

    .line 133
    goto :goto_2

    .line 134
    :cond_7
    move/from16 v16, v15

    .line 135
    .line 136
    const/4 v4, 0x6

    .line 137
    const/4 v7, 0x1

    .line 138
    invoke-virtual {v11, v4, v9, v7, v2}, Lsj;->d(IIII)V

    .line 139
    .line 140
    .line 141
    invoke-virtual {v11, v9, v4, v2, v7}, Lsj;->d(IIII)V

    .line 142
    .line 143
    .line 144
    iget v3, v3, Lf23;->a:I

    .line 145
    .line 146
    const/4 v12, 0x3

    .line 147
    if-le v3, v4, :cond_8

    .line 148
    .line 149
    add-int/2addr v2, v4

    .line 150
    const/4 v3, 0x0

    .line 151
    invoke-virtual {v11, v2, v3, v12, v4}, Lsj;->d(IIII)V

    .line 152
    .line 153
    .line 154
    invoke-virtual {v11, v3, v2, v4, v12}, Lsj;->d(IIII)V

    .line 155
    .line 156
    .line 157
    :cond_8
    new-array v2, v10, [B

    .line 158
    .line 159
    add-int/lit8 v3, v6, -0x1

    .line 160
    .line 161
    move v9, v3

    .line 162
    move/from16 v19, v7

    .line 163
    .line 164
    const/4 v13, 0x0

    .line 165
    const/4 v14, 0x0

    .line 166
    const/4 v15, 0x0

    .line 167
    :goto_4
    if-lez v9, :cond_f

    .line 168
    .line 169
    if-ne v9, v4, :cond_9

    .line 170
    .line 171
    add-int/lit8 v9, v9, -0x1

    .line 172
    .line 173
    :cond_9
    const/4 v4, 0x0

    .line 174
    :goto_5
    if-ge v4, v6, :cond_e

    .line 175
    .line 176
    if-eqz v19, :cond_a

    .line 177
    .line 178
    sub-int v20, v3, v4

    .line 179
    .line 180
    move/from16 v8, v20

    .line 181
    .line 182
    goto :goto_6

    .line 183
    :cond_a
    move v8, v4

    .line 184
    :goto_6
    move/from16 v21, v7

    .line 185
    .line 186
    move/from16 v7, v16

    .line 187
    .line 188
    const/4 v12, 0x0

    .line 189
    :goto_7
    if-ge v12, v7, :cond_d

    .line 190
    .line 191
    sub-int v7, v9, v12

    .line 192
    .line 193
    invoke-virtual {v11, v7, v8}, Lsj;->b(II)Z

    .line 194
    .line 195
    .line 196
    move-result v22

    .line 197
    if-nez v22, :cond_c

    .line 198
    .line 199
    add-int/lit8 v14, v14, 0x1

    .line 200
    .line 201
    shl-int/lit8 v15, v15, 0x1

    .line 202
    .line 203
    invoke-virtual {v5, v7, v8}, Lsj;->b(II)Z

    .line 204
    .line 205
    .line 206
    move-result v7

    .line 207
    if-eqz v7, :cond_b

    .line 208
    .line 209
    or-int/lit8 v7, v15, 0x1

    .line 210
    .line 211
    move v15, v7

    .line 212
    :cond_b
    const/16 v7, 0x8

    .line 213
    .line 214
    if-ne v14, v7, :cond_c

    .line 215
    .line 216
    add-int/lit8 v7, v13, 0x1

    .line 217
    .line 218
    int-to-byte v14, v15

    .line 219
    aput-byte v14, v2, v13

    .line 220
    .line 221
    move v13, v7

    .line 222
    const/4 v14, 0x0

    .line 223
    const/4 v15, 0x0

    .line 224
    :cond_c
    add-int/lit8 v12, v12, 0x1

    .line 225
    .line 226
    const/4 v7, 0x2

    .line 227
    goto :goto_7

    .line 228
    :cond_d
    add-int/lit8 v4, v4, 0x1

    .line 229
    .line 230
    move/from16 v7, v21

    .line 231
    .line 232
    const/4 v8, 0x5

    .line 233
    const/4 v12, 0x3

    .line 234
    const/16 v16, 0x2

    .line 235
    .line 236
    goto :goto_5

    .line 237
    :cond_e
    move/from16 v21, v7

    .line 238
    .line 239
    xor-int/lit8 v19, v19, 0x1

    .line 240
    .line 241
    add-int/lit8 v9, v9, -0x2

    .line 242
    .line 243
    const/4 v4, 0x6

    .line 244
    const/4 v8, 0x5

    .line 245
    const/4 v12, 0x3

    .line 246
    const/16 v16, 0x2

    .line 247
    .line 248
    goto :goto_4

    .line 249
    :cond_f
    move/from16 v21, v7

    .line 250
    .line 251
    if-ne v13, v10, :cond_46

    .line 252
    .line 253
    iget v3, v0, Lf23;->d:I

    .line 254
    .line 255
    iget v4, v0, Lf23;->a:I

    .line 256
    .line 257
    if-ne v10, v3, :cond_45

    .line 258
    .line 259
    iget-object v0, v0, Lf23;->c:[Ln7;

    .line 260
    .line 261
    invoke-static {v1}, Len;->y(I)I

    .line 262
    .line 263
    .line 264
    move-result v3

    .line 265
    aget-object v0, v0, v3

    .line 266
    .line 267
    iget-object v3, v0, Ln7;->c:Ljava/lang/Object;

    .line 268
    .line 269
    check-cast v3, [Lm12;

    .line 270
    .line 271
    iget v0, v0, Ln7;->b:I

    .line 272
    .line 273
    array-length v6, v3

    .line 274
    const/4 v7, 0x0

    .line 275
    const/4 v8, 0x0

    .line 276
    :goto_8
    if-ge v8, v6, :cond_10

    .line 277
    .line 278
    aget-object v9, v3, v8

    .line 279
    .line 280
    iget v9, v9, Lm12;->a:I

    .line 281
    .line 282
    add-int/2addr v7, v9

    .line 283
    add-int/lit8 v8, v8, 0x1

    .line 284
    .line 285
    goto :goto_8

    .line 286
    :cond_10
    new-array v6, v7, [Ln7;

    .line 287
    .line 288
    array-length v8, v3

    .line 289
    const/4 v9, 0x0

    .line 290
    const/4 v10, 0x0

    .line 291
    :goto_9
    if-ge v10, v8, :cond_12

    .line 292
    .line 293
    aget-object v11, v3, v10

    .line 294
    .line 295
    const/4 v12, 0x0

    .line 296
    :goto_a
    iget v13, v11, Lm12;->a:I

    .line 297
    .line 298
    if-ge v12, v13, :cond_11

    .line 299
    .line 300
    iget v13, v11, Lm12;->b:I

    .line 301
    .line 302
    add-int v14, v0, v13

    .line 303
    .line 304
    add-int/lit8 v15, v9, 0x1

    .line 305
    .line 306
    const/16 v19, 0x0

    .line 307
    .line 308
    new-instance v5, Ln7;

    .line 309
    .line 310
    new-array v14, v14, [B

    .line 311
    .line 312
    move/from16 v22, v0

    .line 313
    .line 314
    const/4 v0, 0x2

    .line 315
    invoke-direct {v5, v13, v14, v0}, Ln7;-><init>(ILjava/lang/Object;I)V

    .line 316
    .line 317
    .line 318
    aput-object v5, v6, v9

    .line 319
    .line 320
    add-int/lit8 v12, v12, 0x1

    .line 321
    .line 322
    move v9, v15

    .line 323
    move/from16 v0, v22

    .line 324
    .line 325
    goto :goto_a

    .line 326
    :cond_11
    move/from16 v22, v0

    .line 327
    .line 328
    const/16 v19, 0x0

    .line 329
    .line 330
    add-int/lit8 v10, v10, 0x1

    .line 331
    .line 332
    goto :goto_9

    .line 333
    :cond_12
    move/from16 v22, v0

    .line 334
    .line 335
    const/16 v18, 0x0

    .line 336
    .line 337
    const/16 v19, 0x0

    .line 338
    .line 339
    aget-object v0, v6, v18

    .line 340
    .line 341
    iget-object v0, v0, Ln7;->c:Ljava/lang/Object;

    .line 342
    .line 343
    check-cast v0, [B

    .line 344
    .line 345
    array-length v0, v0

    .line 346
    add-int/lit8 v3, v7, -0x1

    .line 347
    .line 348
    :goto_b
    if-ltz v3, :cond_13

    .line 349
    .line 350
    aget-object v5, v6, v3

    .line 351
    .line 352
    iget-object v5, v5, Ln7;->c:Ljava/lang/Object;

    .line 353
    .line 354
    check-cast v5, [B

    .line 355
    .line 356
    array-length v5, v5

    .line 357
    if-eq v5, v0, :cond_13

    .line 358
    .line 359
    add-int/lit8 v3, v3, -0x1

    .line 360
    .line 361
    goto :goto_b

    .line 362
    :cond_13
    add-int/lit8 v3, v3, 0x1

    .line 363
    .line 364
    sub-int v0, v0, v22

    .line 365
    .line 366
    const/4 v5, 0x0

    .line 367
    const/4 v8, 0x0

    .line 368
    :goto_c
    if-ge v5, v0, :cond_15

    .line 369
    .line 370
    const/4 v10, 0x0

    .line 371
    :goto_d
    if-ge v10, v9, :cond_14

    .line 372
    .line 373
    aget-object v11, v6, v10

    .line 374
    .line 375
    iget-object v11, v11, Ln7;->c:Ljava/lang/Object;

    .line 376
    .line 377
    check-cast v11, [B

    .line 378
    .line 379
    add-int/lit8 v12, v8, 0x1

    .line 380
    .line 381
    aget-byte v8, v2, v8

    .line 382
    .line 383
    aput-byte v8, v11, v5

    .line 384
    .line 385
    add-int/lit8 v10, v10, 0x1

    .line 386
    .line 387
    move v8, v12

    .line 388
    goto :goto_d

    .line 389
    :cond_14
    add-int/lit8 v5, v5, 0x1

    .line 390
    .line 391
    goto :goto_c

    .line 392
    :cond_15
    move v5, v3

    .line 393
    :goto_e
    if-ge v5, v9, :cond_16

    .line 394
    .line 395
    aget-object v10, v6, v5

    .line 396
    .line 397
    iget-object v10, v10, Ln7;->c:Ljava/lang/Object;

    .line 398
    .line 399
    check-cast v10, [B

    .line 400
    .line 401
    add-int/lit8 v11, v8, 0x1

    .line 402
    .line 403
    aget-byte v8, v2, v8

    .line 404
    .line 405
    aput-byte v8, v10, v0

    .line 406
    .line 407
    add-int/lit8 v5, v5, 0x1

    .line 408
    .line 409
    move v8, v11

    .line 410
    goto :goto_e

    .line 411
    :cond_16
    const/16 v18, 0x0

    .line 412
    .line 413
    aget-object v5, v6, v18

    .line 414
    .line 415
    iget-object v5, v5, Ln7;->c:Ljava/lang/Object;

    .line 416
    .line 417
    check-cast v5, [B

    .line 418
    .line 419
    array-length v5, v5

    .line 420
    :goto_f
    if-ge v0, v5, :cond_19

    .line 421
    .line 422
    move v10, v8

    .line 423
    const/4 v8, 0x0

    .line 424
    :goto_10
    if-ge v8, v9, :cond_18

    .line 425
    .line 426
    if-ge v8, v3, :cond_17

    .line 427
    .line 428
    move v11, v0

    .line 429
    goto :goto_11

    .line 430
    :cond_17
    add-int/lit8 v11, v0, 0x1

    .line 431
    .line 432
    :goto_11
    aget-object v12, v6, v8

    .line 433
    .line 434
    iget-object v12, v12, Ln7;->c:Ljava/lang/Object;

    .line 435
    .line 436
    check-cast v12, [B

    .line 437
    .line 438
    add-int/lit8 v13, v10, 0x1

    .line 439
    .line 440
    aget-byte v10, v2, v10

    .line 441
    .line 442
    aput-byte v10, v12, v11

    .line 443
    .line 444
    add-int/lit8 v8, v8, 0x1

    .line 445
    .line 446
    move v10, v13

    .line 447
    goto :goto_10

    .line 448
    :cond_18
    add-int/lit8 v0, v0, 0x1

    .line 449
    .line 450
    move v8, v10

    .line 451
    goto :goto_f

    .line 452
    :cond_19
    const/4 v0, 0x0

    .line 453
    const/4 v3, 0x0

    .line 454
    :goto_12
    if-ge v3, v7, :cond_1a

    .line 455
    .line 456
    aget-object v2, v6, v3

    .line 457
    .line 458
    iget v2, v2, Ln7;->b:I

    .line 459
    .line 460
    add-int/2addr v0, v2

    .line 461
    add-int/lit8 v3, v3, 0x1

    .line 462
    .line 463
    goto :goto_12

    .line 464
    :cond_1a
    new-array v9, v0, [B

    .line 465
    .line 466
    const/4 v0, 0x0

    .line 467
    const/4 v3, 0x0

    .line 468
    :goto_13
    if-ge v3, v7, :cond_1f

    .line 469
    .line 470
    aget-object v2, v6, v3

    .line 471
    .line 472
    iget-object v5, v2, Ln7;->c:Ljava/lang/Object;

    .line 473
    .line 474
    check-cast v5, [B

    .line 475
    .line 476
    iget v2, v2, Ln7;->b:I

    .line 477
    .line 478
    array-length v8, v5

    .line 479
    new-array v10, v8, [I

    .line 480
    .line 481
    const/4 v11, 0x0

    .line 482
    :goto_14
    if-ge v11, v8, :cond_1b

    .line 483
    .line 484
    aget-byte v12, v5, v11

    .line 485
    .line 486
    and-int/lit16 v12, v12, 0xff

    .line 487
    .line 488
    aput v12, v10, v11

    .line 489
    .line 490
    add-int/lit8 v11, v11, 0x1

    .line 491
    .line 492
    goto :goto_14

    .line 493
    :cond_1b
    move-object/from16 v11, p0

    .line 494
    .line 495
    :try_start_0
    iget-object v8, v11, Lqc3;->b:Ljava/lang/Object;

    .line 496
    .line 497
    check-cast v8, Lts0;

    .line 498
    .line 499
    array-length v12, v5

    .line 500
    sub-int/2addr v12, v2

    .line 501
    invoke-virtual {v8, v10, v12}, Lts0;->d([II)V
    :try_end_0
    .catch Ld22; {:try_start_0 .. :try_end_0} :catch_0

    .line 502
    .line 503
    .line 504
    const/4 v8, 0x0

    .line 505
    :goto_15
    if-ge v8, v2, :cond_1c

    .line 506
    .line 507
    aget v12, v10, v8

    .line 508
    .line 509
    int-to-byte v12, v12

    .line 510
    aput-byte v12, v5, v8

    .line 511
    .line 512
    add-int/lit8 v8, v8, 0x1

    .line 513
    .line 514
    goto :goto_15

    .line 515
    :cond_1c
    const/4 v8, 0x0

    .line 516
    :goto_16
    if-ge v8, v2, :cond_1d

    .line 517
    .line 518
    add-int/lit8 v10, v0, 0x1

    .line 519
    .line 520
    aget-byte v12, v5, v8

    .line 521
    .line 522
    aput-byte v12, v9, v0

    .line 523
    .line 524
    add-int/lit8 v8, v8, 0x1

    .line 525
    .line 526
    move v0, v10

    .line 527
    goto :goto_16

    .line 528
    :cond_1d
    add-int/lit8 v3, v3, 0x1

    .line 529
    .line 530
    goto :goto_13

    .line 531
    :catch_0
    sget-object v0, Lxt;->c:Lxt;

    .line 532
    .line 533
    sget-boolean v0, Ly02;->a:Z

    .line 534
    .line 535
    if-eqz v0, :cond_1e

    .line 536
    .line 537
    new-instance v0, Lxt;

    .line 538
    .line 539
    invoke-direct {v0}, Ljava/lang/Exception;-><init>()V

    .line 540
    .line 541
    .line 542
    goto :goto_17

    .line 543
    :cond_1e
    sget-object v0, Lxt;->c:Lxt;

    .line 544
    .line 545
    :goto_17
    throw v0

    .line 546
    :cond_1f
    new-instance v0, Luj;

    .line 547
    .line 548
    const/4 v3, 0x0

    .line 549
    invoke-direct {v0, v9, v3}, Luj;-><init>([BI)V

    .line 550
    .line 551
    .line 552
    new-instance v2, Ljava/lang/StringBuilder;

    .line 553
    .line 554
    const/16 v5, 0x32

    .line 555
    .line 556
    invoke-direct {v2, v5}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 557
    .line 558
    .line 559
    new-instance v5, Ljava/util/ArrayList;

    .line 560
    .line 561
    move/from16 v6, v21

    .line 562
    .line 563
    invoke-direct {v5, v6}, Ljava/util/ArrayList;-><init>(I)V

    .line 564
    .line 565
    .line 566
    const/4 v6, -0x1

    .line 567
    move v7, v6

    .line 568
    move v8, v7

    .line 569
    move-object/from16 v10, v19

    .line 570
    .line 571
    move v6, v3

    .line 572
    :goto_18
    :try_start_1
    invoke-virtual {v0}, Luj;->a()I

    .line 573
    .line 574
    .line 575
    move-result v11
    :try_end_1
    .catch Ljava/lang/IllegalArgumentException; {:try_start_1 .. :try_end_1} :catch_1

    .line 576
    const/4 v12, 0x7

    .line 577
    sget-object v13, Lnj1;->b:Lnj1;

    .line 578
    .line 579
    const/4 v14, 0x4

    .line 580
    if-ge v11, v14, :cond_21

    .line 581
    .line 582
    :cond_20
    move-object v11, v13

    .line 583
    goto :goto_19

    .line 584
    :cond_21
    :try_start_2
    invoke-virtual {v0, v14}, Luj;->c(I)I

    .line 585
    .line 586
    .line 587
    move-result v11

    .line 588
    if-eqz v11, :cond_20

    .line 589
    .line 590
    const/4 v15, 0x1

    .line 591
    if-eq v11, v15, :cond_2a

    .line 592
    .line 593
    const/4 v15, 0x2

    .line 594
    if-eq v11, v15, :cond_29

    .line 595
    .line 596
    const/4 v15, 0x3

    .line 597
    if-eq v11, v15, :cond_28

    .line 598
    .line 599
    if-eq v11, v14, :cond_27

    .line 600
    .line 601
    const/4 v14, 0x5

    .line 602
    if-eq v11, v14, :cond_26

    .line 603
    .line 604
    if-eq v11, v12, :cond_25

    .line 605
    .line 606
    const/16 v14, 0x8

    .line 607
    .line 608
    if-eq v11, v14, :cond_24

    .line 609
    .line 610
    const/16 v14, 0x9

    .line 611
    .line 612
    if-eq v11, v14, :cond_23

    .line 613
    .line 614
    const/16 v14, 0xd

    .line 615
    .line 616
    if-ne v11, v14, :cond_22

    .line 617
    .line 618
    sget-object v11, Lnj1;->V:Lnj1;

    .line 619
    .line 620
    goto :goto_19

    .line 621
    :cond_22
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 622
    .line 623
    invoke-direct {v0}, Ljava/lang/IllegalArgumentException;-><init>()V

    .line 624
    .line 625
    .line 626
    throw v0

    .line 627
    :cond_23
    sget-object v11, Lnj1;->U:Lnj1;

    .line 628
    .line 629
    goto :goto_19

    .line 630
    :cond_24
    sget-object v11, Lnj1;->v:Lnj1;

    .line 631
    .line 632
    goto :goto_19

    .line 633
    :cond_25
    sget-object v11, Lnj1;->i:Lnj1;

    .line 634
    .line 635
    goto :goto_19

    .line 636
    :cond_26
    sget-object v11, Lnj1;->w:Lnj1;

    .line 637
    .line 638
    goto :goto_19

    .line 639
    :cond_27
    sget-object v11, Lnj1;->f:Lnj1;

    .line 640
    .line 641
    goto :goto_19

    .line 642
    :cond_28
    sget-object v11, Lnj1;->e:Lnj1;

    .line 643
    .line 644
    goto :goto_19

    .line 645
    :cond_29
    sget-object v11, Lnj1;->d:Lnj1;

    .line 646
    .line 647
    goto :goto_19

    .line 648
    :cond_2a
    sget-object v11, Lnj1;->c:Lnj1;

    .line 649
    .line 650
    :goto_19
    iget-object v14, v11, Lnj1;->a:[I

    .line 651
    .line 652
    invoke-virtual {v11}, Ljava/lang/Enum;->ordinal()I

    .line 653
    .line 654
    .line 655
    move-result v15

    .line 656
    if-eqz v15, :cond_2d

    .line 657
    .line 658
    const/4 v3, 0x3

    .line 659
    if-eq v15, v3, :cond_3d

    .line 660
    .line 661
    const/4 v3, 0x5

    .line 662
    if-eq v15, v3, :cond_37

    .line 663
    .line 664
    if-eq v15, v12, :cond_35

    .line 665
    .line 666
    const/16 v12, 0x8

    .line 667
    .line 668
    if-eq v15, v12, :cond_35

    .line 669
    .line 670
    const/16 v12, 0x1a

    .line 671
    .line 672
    const/16 v3, 0x9

    .line 673
    .line 674
    if-eq v15, v3, :cond_32

    .line 675
    .line 676
    if-gt v4, v3, :cond_2b

    .line 677
    .line 678
    const/4 v3, 0x0

    .line 679
    goto :goto_1a

    .line 680
    :cond_2b
    if-gt v4, v12, :cond_2c

    .line 681
    .line 682
    const/4 v3, 0x1

    .line 683
    goto :goto_1a

    .line 684
    :cond_2c
    const/4 v3, 0x2

    .line 685
    :goto_1a
    aget v3, v14, v3

    .line 686
    .line 687
    invoke-virtual {v0, v3}, Luj;->c(I)I

    .line 688
    .line 689
    .line 690
    move-result v3

    .line 691
    invoke-virtual {v11}, Ljava/lang/Enum;->ordinal()I

    .line 692
    .line 693
    .line 694
    move-result v12

    .line 695
    const/4 v15, 0x1

    .line 696
    if-eq v12, v15, :cond_31

    .line 697
    .line 698
    const/4 v15, 0x2

    .line 699
    if-eq v12, v15, :cond_30

    .line 700
    .line 701
    const/4 v14, 0x4

    .line 702
    if-eq v12, v14, :cond_2f

    .line 703
    .line 704
    const/4 v15, 0x6

    .line 705
    if-ne v12, v15, :cond_2e

    .line 706
    .line 707
    invoke-static {v0, v2, v3}, Lkb1;->w(Luj;Ljava/lang/StringBuilder;I)V

    .line 708
    .line 709
    .line 710
    :cond_2d
    :goto_1b
    const/16 v3, 0x9

    .line 711
    .line 712
    goto :goto_1d

    .line 713
    :cond_2e
    invoke-static {}, Lyl0;->a()Lyl0;

    .line 714
    .line 715
    .line 716
    move-result-object v0

    .line 717
    throw v0

    .line 718
    :cond_2f
    const/4 v15, 0x6

    .line 719
    invoke-static {v0, v2, v3, v10, v5}, Lkb1;->u(Luj;Ljava/lang/StringBuilder;ILtt;Ljava/util/ArrayList;)V

    .line 720
    .line 721
    .line 722
    goto :goto_1b

    .line 723
    :cond_30
    const/4 v15, 0x6

    .line 724
    invoke-static {v0, v2, v3, v6}, Lkb1;->t(Luj;Ljava/lang/StringBuilder;IZ)V

    .line 725
    .line 726
    .line 727
    goto :goto_1b

    .line 728
    :cond_31
    const/4 v15, 0x6

    .line 729
    invoke-static {v0, v2, v3}, Lkb1;->x(Luj;Ljava/lang/StringBuilder;I)V

    .line 730
    .line 731
    .line 732
    goto :goto_1b

    .line 733
    :cond_32
    const/4 v3, 0x4

    .line 734
    invoke-virtual {v0, v3}, Luj;->c(I)I

    .line 735
    .line 736
    .line 737
    move-result v15

    .line 738
    const/16 v3, 0x9

    .line 739
    .line 740
    if-gt v4, v3, :cond_33

    .line 741
    .line 742
    const/4 v12, 0x0

    .line 743
    goto :goto_1c

    .line 744
    :cond_33
    if-gt v4, v12, :cond_34

    .line 745
    .line 746
    const/4 v12, 0x1

    .line 747
    goto :goto_1c

    .line 748
    :cond_34
    const/4 v12, 0x2

    .line 749
    :goto_1c
    aget v12, v14, v12

    .line 750
    .line 751
    invoke-virtual {v0, v12}, Luj;->c(I)I

    .line 752
    .line 753
    .line 754
    move-result v12

    .line 755
    const/4 v14, 0x1

    .line 756
    if-ne v15, v14, :cond_36

    .line 757
    .line 758
    invoke-static {v0, v2, v12}, Lkb1;->v(Luj;Ljava/lang/StringBuilder;I)V

    .line 759
    .line 760
    .line 761
    goto :goto_1d

    .line 762
    :cond_35
    const/16 v3, 0x9

    .line 763
    .line 764
    const/4 v6, 0x1

    .line 765
    :cond_36
    :goto_1d
    const/16 v14, 0x8

    .line 766
    .line 767
    goto/16 :goto_1f

    .line 768
    .line 769
    :cond_37
    const/16 v3, 0x9

    .line 770
    .line 771
    const/16 v14, 0x8

    .line 772
    .line 773
    invoke-virtual {v0, v14}, Luj;->c(I)I

    .line 774
    .line 775
    .line 776
    move-result v10

    .line 777
    and-int/lit16 v12, v10, 0x80

    .line 778
    .line 779
    if-nez v12, :cond_38

    .line 780
    .line 781
    and-int/lit8 v10, v10, 0x7f

    .line 782
    .line 783
    goto :goto_1e

    .line 784
    :cond_38
    and-int/lit16 v12, v10, 0xc0

    .line 785
    .line 786
    const/16 v14, 0x80

    .line 787
    .line 788
    if-ne v12, v14, :cond_39

    .line 789
    .line 790
    const/16 v14, 0x8

    .line 791
    .line 792
    invoke-virtual {v0, v14}, Luj;->c(I)I

    .line 793
    .line 794
    .line 795
    move-result v12

    .line 796
    and-int/lit8 v10, v10, 0x3f

    .line 797
    .line 798
    shl-int/2addr v10, v14

    .line 799
    or-int/2addr v10, v12

    .line 800
    goto :goto_1e

    .line 801
    :cond_39
    and-int/lit16 v12, v10, 0xe0

    .line 802
    .line 803
    const/16 v14, 0xc0

    .line 804
    .line 805
    if-ne v12, v14, :cond_3c

    .line 806
    .line 807
    const/16 v12, 0x10

    .line 808
    .line 809
    invoke-virtual {v0, v12}, Luj;->c(I)I

    .line 810
    .line 811
    .line 812
    move-result v14

    .line 813
    and-int/lit8 v10, v10, 0x1f

    .line 814
    .line 815
    shl-int/2addr v10, v12

    .line 816
    or-int/2addr v10, v14

    .line 817
    :goto_1e
    sget-object v12, Ltt;->c:Ljava/util/HashMap;

    .line 818
    .line 819
    if-ltz v10, :cond_3b

    .line 820
    .line 821
    const/16 v12, 0x384

    .line 822
    .line 823
    if-ge v10, v12, :cond_3b

    .line 824
    .line 825
    sget-object v12, Ltt;->c:Ljava/util/HashMap;

    .line 826
    .line 827
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 828
    .line 829
    .line 830
    move-result-object v10

    .line 831
    invoke-virtual {v12, v10}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 832
    .line 833
    .line 834
    move-result-object v10

    .line 835
    check-cast v10, Ltt;

    .line 836
    .line 837
    if-eqz v10, :cond_3a

    .line 838
    .line 839
    goto :goto_1d

    .line 840
    :cond_3a
    invoke-static {}, Lyl0;->a()Lyl0;

    .line 841
    .line 842
    .line 843
    move-result-object v0

    .line 844
    throw v0

    .line 845
    :cond_3b
    invoke-static {}, Lyl0;->a()Lyl0;

    .line 846
    .line 847
    .line 848
    move-result-object v0

    .line 849
    throw v0

    .line 850
    :cond_3c
    invoke-static {}, Lyl0;->a()Lyl0;

    .line 851
    .line 852
    .line 853
    move-result-object v0

    .line 854
    throw v0

    .line 855
    :cond_3d
    const/16 v3, 0x9

    .line 856
    .line 857
    invoke-virtual {v0}, Luj;->a()I

    .line 858
    .line 859
    .line 860
    move-result v7

    .line 861
    const/16 v12, 0x10

    .line 862
    .line 863
    if-lt v7, v12, :cond_3e

    .line 864
    .line 865
    const/16 v14, 0x8

    .line 866
    .line 867
    invoke-virtual {v0, v14}, Luj;->c(I)I

    .line 868
    .line 869
    .line 870
    move-result v7

    .line 871
    invoke-virtual {v0, v14}, Luj;->c(I)I

    .line 872
    .line 873
    .line 874
    move-result v8

    .line 875
    goto :goto_1f

    .line 876
    :cond_3e
    invoke-static {}, Lyl0;->a()Lyl0;

    .line 877
    .line 878
    .line 879
    move-result-object v0

    .line 880
    throw v0
    :try_end_2
    .catch Ljava/lang/IllegalArgumentException; {:try_start_2 .. :try_end_2} :catch_1

    .line 881
    :goto_1f
    if-ne v11, v13, :cond_44

    .line 882
    .line 883
    move v14, v8

    .line 884
    new-instance v8, Ll50;

    .line 885
    .line 886
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 887
    .line 888
    .line 889
    move-result-object v10

    .line 890
    invoke-virtual {v5}, Ljava/util/ArrayList;->isEmpty()Z

    .line 891
    .line 892
    .line 893
    move-result v0

    .line 894
    if-eqz v0, :cond_3f

    .line 895
    .line 896
    move-object/from16 v11, v19

    .line 897
    .line 898
    :goto_20
    const/4 v15, 0x1

    .line 899
    goto :goto_21

    .line 900
    :cond_3f
    move-object v11, v5

    .line 901
    goto :goto_20

    .line 902
    :goto_21
    if-eq v1, v15, :cond_43

    .line 903
    .line 904
    const/4 v12, 0x2

    .line 905
    if-eq v1, v12, :cond_42

    .line 906
    .line 907
    const/4 v13, 0x3

    .line 908
    if-eq v1, v13, :cond_41

    .line 909
    .line 910
    const/4 v0, 0x4

    .line 911
    if-ne v1, v0, :cond_40

    .line 912
    .line 913
    const-string v0, "H"

    .line 914
    .line 915
    :goto_22
    move-object v12, v0

    .line 916
    move v13, v7

    .line 917
    goto :goto_23

    .line 918
    :cond_40
    throw v19

    .line 919
    :cond_41
    const-string v0, "Q"

    .line 920
    .line 921
    goto :goto_22

    .line 922
    :cond_42
    const-string v0, "M"

    .line 923
    .line 924
    goto :goto_22

    .line 925
    :cond_43
    const-string v0, "L"

    .line 926
    .line 927
    goto :goto_22

    .line 928
    :goto_23
    invoke-direct/range {v8 .. v14}, Ll50;-><init>([BLjava/lang/String;Ljava/util/ArrayList;Ljava/lang/String;II)V

    .line 929
    .line 930
    .line 931
    return-object v8

    .line 932
    :cond_44
    move/from16 v17, v14

    .line 933
    .line 934
    move v14, v8

    .line 935
    const/4 v3, 0x0

    .line 936
    goto/16 :goto_18

    .line 937
    .line 938
    :catch_1
    invoke-static {}, Lyl0;->a()Lyl0;

    .line 939
    .line 940
    .line 941
    move-result-object v0

    .line 942
    throw v0

    .line 943
    :cond_45
    const/16 v19, 0x0

    .line 944
    .line 945
    invoke-static {}, Lf42;->e()V

    .line 946
    .line 947
    .line 948
    return-object v19

    .line 949
    :cond_46
    invoke-static {}, Lyl0;->a()Lyl0;

    .line 950
    .line 951
    .line 952
    move-result-object v0

    .line 953
    throw v0
.end method

.method public get()Ljava/lang/Object;
    .locals 0

    .line 1
    iget-object p0, p0, Lqc3;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Ljavax/inject/Provider;

    .line 4
    .line 5
    invoke-interface {p0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, Landroid/content/Context;

    .line 10
    .line 11
    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    if-eqz p0, :cond_0

    .line 16
    .line 17
    return-object p0

    .line 18
    :cond_0
    const-string p0, "Cannot return null from a non-@Nullable @Provides method"

    .line 19
    .line 20
    invoke-static {p0}, Ln4;->s(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    const/4 p0, 0x0

    .line 24
    return-object p0
.end method

.method public getAppComponent()Ljava/lang/Object;
    .locals 0

    .line 1
    iget-object p0, p0, Lqc3;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Landroid/app/Activity;

    .line 4
    .line 5
    return-object p0
.end method

.method public getFlags()I
    .locals 0

    .line 1
    iget-object p0, p0, Lqc3;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Landroid/view/ContentInfo;

    .line 4
    .line 5
    invoke-static {p0}, Lh00;->b(Landroid/view/ContentInfo;)I

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    return p0
.end method

.method public getHeight()I
    .locals 0

    .line 1
    iget-object p0, p0, Lqc3;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Lcom/google/android/material/floatingactionbutton/ExtendedFloatingActionButton;

    .line 4
    .line 5
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredHeight()I

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    return p0
.end method

.method public getPaddingEnd()I
    .locals 0

    .line 1
    iget-object p0, p0, Lqc3;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Lcom/google/android/material/floatingactionbutton/ExtendedFloatingActionButton;

    .line 4
    .line 5
    iget p0, p0, Lcom/google/android/material/floatingactionbutton/ExtendedFloatingActionButton;->o0:I

    .line 6
    .line 7
    return p0
.end method

.method public getPaddingStart()I
    .locals 0

    .line 1
    iget-object p0, p0, Lqc3;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Lcom/google/android/material/floatingactionbutton/ExtendedFloatingActionButton;

    .line 4
    .line 5
    iget p0, p0, Lcom/google/android/material/floatingactionbutton/ExtendedFloatingActionButton;->n0:I

    .line 6
    .line 7
    return p0
.end method

.method public getSupportedFeatures()[Ljava/lang/String;
    .locals 0

    .line 1
    sget-object p0, Lqc3;->e:[Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public getWidth()I
    .locals 2

    .line 1
    iget-object p0, p0, Lqc3;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Lcom/google/android/material/floatingactionbutton/ExtendedFloatingActionButton;

    .line 4
    .line 5
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    invoke-virtual {p0}, Lcom/google/android/material/floatingactionbutton/ExtendedFloatingActionButton;->getCollapsedPadding()I

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    mul-int/lit8 v1, v1, 0x2

    .line 14
    .line 15
    sub-int/2addr v0, v1

    .line 16
    iget v1, p0, Lcom/google/android/material/floatingactionbutton/ExtendedFloatingActionButton;->n0:I

    .line 17
    .line 18
    add-int/2addr v0, v1

    .line 19
    iget p0, p0, Lcom/google/android/material/floatingactionbutton/ExtendedFloatingActionButton;->o0:I

    .line 20
    .line 21
    add-int/2addr v0, p0

    .line 22
    return v0
.end method

.method public h(I)Lf1;
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return-object p0
.end method

.method public i(Ljg1;Lsg1;)V
    .locals 9

    .line 1
    iget-object v0, p0, Lqc3;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lwr;

    .line 4
    .line 5
    iget-object v1, v0, Lwr;->f:Landroid/os/Handler;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    invoke-virtual {v1, v2}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    iget-object v0, v0, Lwr;->v:Ljava/util/ArrayList;

    .line 12
    .line 13
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 14
    .line 15
    .line 16
    move-result v3

    .line 17
    const/4 v4, 0x0

    .line 18
    :goto_0
    const/4 v5, -0x1

    .line 19
    if-ge v4, v3, :cond_1

    .line 20
    .line 21
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v6

    .line 25
    check-cast v6, Lvr;

    .line 26
    .line 27
    iget-object v6, v6, Lvr;->b:Ljg1;

    .line 28
    .line 29
    if-ne p1, v6, :cond_0

    .line 30
    .line 31
    goto :goto_1

    .line 32
    :cond_0
    add-int/lit8 v4, v4, 0x1

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_1
    move v4, v5

    .line 36
    :goto_1
    if-ne v4, v5, :cond_2

    .line 37
    .line 38
    return-void

    .line 39
    :cond_2
    add-int/lit8 v4, v4, 0x1

    .line 40
    .line 41
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 42
    .line 43
    .line 44
    move-result v3

    .line 45
    if-ge v4, v3, :cond_3

    .line 46
    .line 47
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    move-object v2, v0

    .line 52
    check-cast v2, Lvr;

    .line 53
    .line 54
    :cond_3
    move-object v5, v2

    .line 55
    new-instance v3, Lur;

    .line 56
    .line 57
    const/4 v8, 0x0

    .line 58
    move-object v4, p0

    .line 59
    move-object v7, p1

    .line 60
    move-object v6, p2

    .line 61
    invoke-direct/range {v3 .. v8}, Lur;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 62
    .line 63
    .line 64
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    .line 65
    .line 66
    .line 67
    move-result-wide p0

    .line 68
    const-wide/16 v4, 0xc8

    .line 69
    .line 70
    add-long/2addr p0, v4

    .line 71
    invoke-virtual {v1, v3, v7, p0, p1}, Landroid/os/Handler;->postAtTime(Ljava/lang/Runnable;Ljava/lang/Object;J)Z

    .line 72
    .line 73
    .line 74
    return-void
.end method

.method public k(Landroid/view/View;Lm83;)Lm83;
    .locals 4

    .line 1
    iget p1, p0, Lqc3;->a:I

    .line 2
    .line 3
    const/4 v0, 0x1

    .line 4
    const/4 v1, 0x0

    .line 5
    packed-switch p1, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    iget-object p1, p2, Lm83;->a:Lj83;

    .line 9
    .line 10
    iget-object p0, p0, Lqc3;->b:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout;

    .line 13
    .line 14
    iget-object v2, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->b0:Lm83;

    .line 15
    .line 16
    invoke-static {v2, p2}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    if-nez v2, :cond_5

    .line 21
    .line 22
    iput-object p2, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->b0:Lm83;

    .line 23
    .line 24
    invoke-virtual {p2}, Lm83;->d()I

    .line 25
    .line 26
    .line 27
    move-result v2

    .line 28
    if-lez v2, :cond_0

    .line 29
    .line 30
    move v2, v0

    .line 31
    goto :goto_0

    .line 32
    :cond_0
    move v2, v1

    .line 33
    :goto_0
    iput-boolean v2, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->c0:Z

    .line 34
    .line 35
    if-nez v2, :cond_1

    .line 36
    .line 37
    invoke-virtual {p0}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;

    .line 38
    .line 39
    .line 40
    move-result-object v2

    .line 41
    if-nez v2, :cond_1

    .line 42
    .line 43
    goto :goto_1

    .line 44
    :cond_1
    move v0, v1

    .line 45
    :goto_1
    invoke-virtual {p0, v0}, Landroid/view/View;->setWillNotDraw(Z)V

    .line 46
    .line 47
    .line 48
    invoke-virtual {p1}, Lj83;->m()Z

    .line 49
    .line 50
    .line 51
    move-result v0

    .line 52
    if-eqz v0, :cond_2

    .line 53
    .line 54
    goto :goto_3

    .line 55
    :cond_2
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 56
    .line 57
    .line 58
    move-result v0

    .line 59
    :goto_2
    if-ge v1, v0, :cond_4

    .line 60
    .line 61
    invoke-virtual {p0, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 62
    .line 63
    .line 64
    move-result-object v2

    .line 65
    sget-object v3, Le33;->a:Ljava/util/WeakHashMap;

    .line 66
    .line 67
    invoke-virtual {v2}, Landroid/view/View;->getFitsSystemWindows()Z

    .line 68
    .line 69
    .line 70
    move-result v3

    .line 71
    if-eqz v3, :cond_3

    .line 72
    .line 73
    invoke-virtual {v2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 74
    .line 75
    .line 76
    move-result-object v2

    .line 77
    check-cast v2, Landroidx/coordinatorlayout/widget/c;

    .line 78
    .line 79
    iget-object v2, v2, Landroidx/coordinatorlayout/widget/c;->a:Landroidx/coordinatorlayout/widget/CoordinatorLayout$Behavior;

    .line 80
    .line 81
    if-eqz v2, :cond_3

    .line 82
    .line 83
    invoke-virtual {p1}, Lj83;->m()Z

    .line 84
    .line 85
    .line 86
    move-result v2

    .line 87
    if-eqz v2, :cond_3

    .line 88
    .line 89
    goto :goto_3

    .line 90
    :cond_3
    add-int/lit8 v1, v1, 0x1

    .line 91
    .line 92
    goto :goto_2

    .line 93
    :cond_4
    :goto_3
    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    .line 94
    .line 95
    .line 96
    :cond_5
    return-object p2

    .line 97
    :pswitch_0
    iget-object p0, p0, Lqc3;->b:Ljava/lang/Object;

    .line 98
    .line 99
    check-cast p0, Lcom/google/android/material/appbar/AppBarLayout;

    .line 100
    .line 101
    sget-object p1, Le33;->a:Ljava/util/WeakHashMap;

    .line 102
    .line 103
    invoke-virtual {p0}, Landroid/view/View;->getFitsSystemWindows()Z

    .line 104
    .line 105
    .line 106
    move-result p1

    .line 107
    if-eqz p1, :cond_6

    .line 108
    .line 109
    move-object p1, p2

    .line 110
    goto :goto_4

    .line 111
    :cond_6
    const/4 p1, 0x0

    .line 112
    :goto_4
    iget-object v2, p0, Lcom/google/android/material/appbar/AppBarLayout;->i:Lm83;

    .line 113
    .line 114
    invoke-static {v2, p1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 115
    .line 116
    .line 117
    move-result v2

    .line 118
    if-nez v2, :cond_8

    .line 119
    .line 120
    iput-object p1, p0, Lcom/google/android/material/appbar/AppBarLayout;->i:Lm83;

    .line 121
    .line 122
    iget-object p1, p0, Lcom/google/android/material/appbar/AppBarLayout;->f0:Landroid/graphics/drawable/Drawable;

    .line 123
    .line 124
    if-eqz p1, :cond_7

    .line 125
    .line 126
    invoke-virtual {p0}, Lcom/google/android/material/appbar/AppBarLayout;->getTopInset()I

    .line 127
    .line 128
    .line 129
    move-result p1

    .line 130
    if-lez p1, :cond_7

    .line 131
    .line 132
    move v1, v0

    .line 133
    :cond_7
    xor-int/lit8 p1, v1, 0x1

    .line 134
    .line 135
    invoke-virtual {p0, p1}, Landroid/view/View;->setWillNotDraw(Z)V

    .line 136
    .line 137
    .line 138
    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    .line 139
    .line 140
    .line 141
    :cond_8
    return-object p2

    .line 142
    nop

    .line 143
    :pswitch_data_0
    .packed-switch 0x7
        :pswitch_0
    .end packed-switch
.end method

.method public l(IILandroid/os/Bundle;)Z
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method

.method public declared-synchronized n()V
    .locals 2

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Lqc3;->b:Ljava/lang/Object;

    .line 3
    .line 4
    check-cast v0, Leh2;

    .line 5
    .line 6
    iget-object v1, v0, Leh2;->a:Ljava/util/concurrent/locks/ReentrantLock;

    .line 7
    .line 8
    invoke-virtual {v1}, Ljava/util/concurrent/locks/ReentrantLock;->lock()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 9
    .line 10
    .line 11
    :try_start_1
    iget-object v0, v0, Leh2;->b:Landroid/content/SharedPreferences;

    .line 12
    .line 13
    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->clear()Landroid/content/SharedPreferences$Editor;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 22
    .line 23
    .line 24
    :try_start_2
    invoke-virtual {v1}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 25
    .line 26
    .line 27
    monitor-exit p0

    .line 28
    return-void

    .line 29
    :catchall_0
    move-exception v0

    .line 30
    :try_start_3
    invoke-virtual {v1}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    .line 31
    .line 32
    .line 33
    throw v0

    .line 34
    :goto_0
    monitor-exit p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 35
    throw v0

    .line 36
    :catchall_1
    move-exception v0

    .line 37
    goto :goto_0
.end method

.method public o()Lrg3;
    .locals 3

    .line 1
    sget-object v0, Ljava/util/logging/Level;->WARNING:Ljava/util/logging/Level;

    .line 2
    .line 3
    iget-object v1, p0, Lqc3;->b:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v1, Lsq3;

    .line 6
    .line 7
    invoke-virtual {v1, v0}, Lsq3;->r(Ljava/util/logging/Level;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    iget-object v1, v1, Lsq3;->a:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v1, Ljava/lang/String;

    .line 14
    .line 15
    sget-object v2, Ljj3;->a:Llj3;

    .line 16
    .line 17
    check-cast v2, Lrj3;

    .line 18
    .line 19
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    sget-object v2, Lvj3;->b:Lvj3;

    .line 23
    .line 24
    invoke-virtual {v2, v1, v0}, Lvj3;->a(Ljava/lang/String;Z)V

    .line 25
    .line 26
    .line 27
    if-nez v0, :cond_0

    .line 28
    .line 29
    sget-object p0, Lqc3;->f:Ltg3;

    .line 30
    .line 31
    return-object p0

    .line 32
    :cond_0
    new-instance v0, Lsg3;

    .line 33
    .line 34
    invoke-direct {v0, p0}, Lsg3;-><init>(Lqc3;)V

    .line 35
    .line 36
    .line 37
    return-object v0
.end method

.method public onFailure(Ljava/lang/Throwable;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lqc3;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Lum;

    .line 4
    .line 5
    invoke-virtual {p0, p1}, Lum;->b(Ljava/lang/Throwable;)Z

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public onRendererResponsive(Landroid/webkit/WebView;Ljava/lang/reflect/InvocationHandler;)V
    .locals 2

    .line 1
    sget-object v0, Li73;->c:Ljava/util/WeakHashMap;

    .line 2
    .line 3
    const-class v0, Lorg/chromium/support_lib_boundary/WebViewRendererBoundaryInterface;

    .line 4
    .line 5
    invoke-static {v0, p2}, Lj13;->b(Ljava/lang/Class;Ljava/lang/reflect/InvocationHandler;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p2

    .line 9
    check-cast p2, Lorg/chromium/support_lib_boundary/WebViewRendererBoundaryInterface;

    .line 10
    .line 11
    new-instance v0, Lrc;

    .line 12
    .line 13
    const/4 v1, 0x5

    .line 14
    invoke-direct {v0, p2, v1}, Lrc;-><init>(Ljava/lang/Object;I)V

    .line 15
    .line 16
    .line 17
    invoke-interface {p2, v0}, Lorg/chromium/support_lib_boundary/IsomorphicObjectBoundaryInterface;->getOrCreatePeer(Ljava/util/concurrent/Callable;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object p2

    .line 21
    check-cast p2, Li73;

    .line 22
    .line 23
    iget-object p0, p0, Lqc3;->b:Ljava/lang/Object;

    .line 24
    .line 25
    check-cast p0, Lg73;

    .line 26
    .line 27
    invoke-virtual {p0, p1, p2}, Lg73;->onRenderProcessResponsive(Landroid/webkit/WebView;Lf73;)V

    .line 28
    .line 29
    .line 30
    return-void
.end method

.method public onRendererUnresponsive(Landroid/webkit/WebView;Ljava/lang/reflect/InvocationHandler;)V
    .locals 2

    .line 1
    sget-object v0, Li73;->c:Ljava/util/WeakHashMap;

    .line 2
    .line 3
    const-class v0, Lorg/chromium/support_lib_boundary/WebViewRendererBoundaryInterface;

    .line 4
    .line 5
    invoke-static {v0, p2}, Lj13;->b(Ljava/lang/Class;Ljava/lang/reflect/InvocationHandler;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p2

    .line 9
    check-cast p2, Lorg/chromium/support_lib_boundary/WebViewRendererBoundaryInterface;

    .line 10
    .line 11
    new-instance v0, Lrc;

    .line 12
    .line 13
    const/4 v1, 0x5

    .line 14
    invoke-direct {v0, p2, v1}, Lrc;-><init>(Ljava/lang/Object;I)V

    .line 15
    .line 16
    .line 17
    invoke-interface {p2, v0}, Lorg/chromium/support_lib_boundary/IsomorphicObjectBoundaryInterface;->getOrCreatePeer(Ljava/util/concurrent/Callable;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object p2

    .line 21
    check-cast p2, Li73;

    .line 22
    .line 23
    iget-object p0, p0, Lqc3;->b:Ljava/lang/Object;

    .line 24
    .line 25
    check-cast p0, Lg73;

    .line 26
    .line 27
    invoke-virtual {p0, p1, p2}, Lg73;->onRenderProcessUnresponsive(Landroid/webkit/WebView;Lf73;)V

    .line 28
    .line 29
    .line 30
    return-void
.end method

.method public onSuccess(Ljava/lang/Object;)V
    .locals 17

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v0, p1

    .line 4
    .line 5
    iget v2, v1, Lqc3;->a:I

    .line 6
    .line 7
    packed-switch v2, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    iget-object v1, v1, Lqc3;->b:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v1, Lum;

    .line 13
    .line 14
    :try_start_0
    invoke-virtual {v1, v0}, Lum;->a(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 15
    .line 16
    .line 17
    goto :goto_0

    .line 18
    :catchall_0
    move-exception v0

    .line 19
    invoke-virtual {v1, v0}, Lum;->b(Ljava/lang/Throwable;)Z

    .line 20
    .line 21
    .line 22
    :goto_0
    return-void

    .line 23
    :pswitch_0
    move-object v2, v0

    .line 24
    check-cast v2, Llc;

    .line 25
    .line 26
    iget v0, v2, Llc;->a:I

    .line 27
    .line 28
    const/4 v3, 0x2

    .line 29
    const/4 v4, 0x1

    .line 30
    const/4 v5, 0x0

    .line 31
    if-ne v0, v3, :cond_5

    .line 32
    .line 33
    iget-object v0, v2, Llc;->c:Landroid/app/PendingIntent;

    .line 34
    .line 35
    if-eqz v0, :cond_0

    .line 36
    .line 37
    goto :goto_1

    .line 38
    :cond_0
    move-object v0, v5

    .line 39
    :goto_1
    if-eqz v0, :cond_5

    .line 40
    .line 41
    :try_start_1
    invoke-static {}, Lcom/supercell/titan/AppUpdater;->a()Z

    .line 42
    .line 43
    .line 44
    move-result v0

    .line 45
    if-eqz v0, :cond_9

    .line 46
    .line 47
    sget-object v0, Lcom/supercell/titan/AppUpdater;->a:Lyg3;

    .line 48
    .line 49
    sget-object v3, Lcom/supercell/titan/AppUpdater;->b:Lmc;

    .line 50
    .line 51
    invoke-virtual {v0, v3}, Lyg3;->a(Lmc;)V

    .line 52
    .line 53
    .line 54
    sget-object v0, Lcom/supercell/titan/AppUpdater;->a:Lyg3;

    .line 55
    .line 56
    iget-object v3, v1, Lqc3;->b:Ljava/lang/Object;

    .line 57
    .line 58
    move-object v6, v3

    .line 59
    check-cast v6, Lcom/supercell/titan/GameApp;

    .line 60
    .line 61
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 62
    .line 63
    .line 64
    iget-object v0, v2, Llc;->c:Landroid/app/PendingIntent;

    .line 65
    .line 66
    if-eqz v0, :cond_1

    .line 67
    .line 68
    move-object v3, v0

    .line 69
    goto :goto_2

    .line 70
    :cond_1
    move-object v3, v5

    .line 71
    :goto_2
    if-eqz v3, :cond_4

    .line 72
    .line 73
    iget-boolean v3, v2, Llc;->d:Z

    .line 74
    .line 75
    if-eqz v3, :cond_2

    .line 76
    .line 77
    goto :goto_4

    .line 78
    :cond_2
    iput-boolean v4, v2, Llc;->d:Z

    .line 79
    .line 80
    if-eqz v0, :cond_3

    .line 81
    .line 82
    goto :goto_3

    .line 83
    :cond_3
    move-object v0, v5

    .line 84
    :goto_3
    invoke-virtual {v0}, Landroid/app/PendingIntent;->getIntentSender()Landroid/content/IntentSender;

    .line 85
    .line 86
    .line 87
    move-result-object v7

    .line 88
    const/4 v12, 0x0

    .line 89
    const/4 v13, 0x0

    .line 90
    const/16 v8, 0x4831

    .line 91
    .line 92
    const/4 v9, 0x0

    .line 93
    const/4 v10, 0x0

    .line 94
    const/4 v11, 0x0

    .line 95
    invoke-virtual/range {v6 .. v13}, Landroid/app/Activity;->startIntentSenderForResult(Landroid/content/IntentSender;ILandroid/content/Intent;IIILandroid/os/Bundle;)V

    .line 96
    .line 97
    .line 98
    :cond_4
    :goto_4
    iget-object v0, v1, Lqc3;->b:Ljava/lang/Object;

    .line 99
    .line 100
    check-cast v0, Lcom/supercell/titan/GameApp;

    .line 101
    .line 102
    const-string v3, "LAST_APPUPDATE_REQUESTED"

    .line 103
    .line 104
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 105
    .line 106
    .line 107
    move-result-wide v6

    .line 108
    invoke-static {v6, v7}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    .line 109
    .line 110
    .line 111
    move-result-object v6

    .line 112
    invoke-virtual {v0, v3, v6}, Lcom/supercell/titan/GameApp;->storeKeyValue(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 113
    .line 114
    .line 115
    goto/16 :goto_7

    .line 116
    .line 117
    :catch_0
    move-exception v0

    .line 118
    const-string v3, "AppUpdater"

    .line 119
    .line 120
    const-string v6, "Error starting update"

    .line 121
    .line 122
    invoke-static {v3, v6, v0}, Lio/sentry/android/core/n0;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 123
    .line 124
    .line 125
    goto/16 :goto_7

    .line 126
    .line 127
    :cond_5
    iget v0, v2, Llc;->b:I

    .line 128
    .line 129
    const/16 v3, 0xb

    .line 130
    .line 131
    if-ne v0, v3, :cond_9

    .line 132
    .line 133
    sget-object v3, Lcom/supercell/titan/AppUpdater;->a:Lyg3;

    .line 134
    .line 135
    sget-object v0, Lcom/supercell/titan/AppUpdater;->b:Lmc;

    .line 136
    .line 137
    monitor-enter v3

    .line 138
    :try_start_2
    iget-object v6, v3, Lyg3;->b:Ldf3;

    .line 139
    .line 140
    monitor-enter v6
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 141
    :try_start_3
    iget-object v7, v6, Ldf3;->a:Lc5;

    .line 142
    .line 143
    const-string v8, "unregisterListener"

    .line 144
    .line 145
    const/4 v9, 0x0

    .line 146
    new-array v9, v9, [Ljava/lang/Object;

    .line 147
    .line 148
    invoke-virtual {v7, v8, v9}, Lc5;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 149
    .line 150
    .line 151
    const-string v7, "Unregistered Play Core listener should not be null."

    .line 152
    .line 153
    if-eqz v0, :cond_8

    .line 154
    .line 155
    iget-object v7, v6, Ldf3;->d:Ljava/util/HashSet;

    .line 156
    .line 157
    invoke-virtual {v7, v0}, Ljava/util/HashSet;->remove(Ljava/lang/Object;)Z

    .line 158
    .line 159
    .line 160
    invoke-virtual {v6}, Ldf3;->a()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 161
    .line 162
    .line 163
    :try_start_4
    monitor-exit v6
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 164
    monitor-exit v3

    .line 165
    sget-object v0, Lcom/supercell/titan/AppUpdater;->a:Lyg3;

    .line 166
    .line 167
    iget-object v7, v0, Lyg3;->a:Lwq3;

    .line 168
    .line 169
    iget-object v0, v0, Lyg3;->c:Landroid/content/Context;

    .line 170
    .line 171
    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 172
    .line 173
    .line 174
    move-result-object v10

    .line 175
    iget-object v12, v7, Lwq3;->a:Lyr3;

    .line 176
    .line 177
    if-nez v12, :cond_7

    .line 178
    .line 179
    sget-object v0, Lwq3;->e:Lc5;

    .line 180
    .line 181
    const/16 v3, -0x9

    .line 182
    .line 183
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 184
    .line 185
    .line 186
    move-result-object v6

    .line 187
    filled-new-array {v6}, [Ljava/lang/Object;

    .line 188
    .line 189
    .line 190
    move-result-object v6

    .line 191
    const-string v7, "onError(%d)"

    .line 192
    .line 193
    const-string v8, "PlayCore"

    .line 194
    .line 195
    const/4 v9, 0x6

    .line 196
    invoke-static {v8, v9}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 197
    .line 198
    .line 199
    move-result v9

    .line 200
    if-eqz v9, :cond_6

    .line 201
    .line 202
    iget-object v0, v0, Lc5;->b:Ljava/lang/String;

    .line 203
    .line 204
    invoke-static {v0, v7, v6}, Lc5;->d(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 205
    .line 206
    .line 207
    move-result-object v0

    .line 208
    invoke-static {v8, v0}, Lio/sentry/android/core/n0;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 209
    .line 210
    .line 211
    goto :goto_5

    .line 212
    :cond_6
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 213
    .line 214
    .line 215
    :goto_5
    new-instance v0, Lmy0;

    .line 216
    .line 217
    invoke-direct {v0, v3}, Lmy0;-><init>(I)V

    .line 218
    .line 219
    .line 220
    invoke-static {v0}, Lcom/google/android/gms/tasks/Tasks;->forException(Ljava/lang/Exception;)Lcom/google/android/gms/tasks/Task;

    .line 221
    .line 222
    .line 223
    goto :goto_7

    .line 224
    :cond_7
    sget-object v0, Lwq3;->e:Lc5;

    .line 225
    .line 226
    filled-new-array {v10}, [Ljava/lang/Object;

    .line 227
    .line 228
    .line 229
    move-result-object v3

    .line 230
    const-string v6, "completeUpdate(%s)"

    .line 231
    .line 232
    invoke-virtual {v0, v6, v3}, Lc5;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 233
    .line 234
    .line 235
    new-instance v8, Lcom/google/android/gms/tasks/TaskCompletionSource;

    .line 236
    .line 237
    invoke-direct {v8}, Lcom/google/android/gms/tasks/TaskCompletionSource;-><init>()V

    .line 238
    .line 239
    .line 240
    new-instance v15, Lhm3;

    .line 241
    .line 242
    const/4 v11, 0x1

    .line 243
    move-object v9, v8

    .line 244
    move-object v6, v15

    .line 245
    invoke-direct/range {v6 .. v11}, Lhm3;-><init>(Ljava/lang/Object;Lcom/google/android/gms/tasks/TaskCompletionSource;Lcom/google/android/gms/tasks/TaskCompletionSource;Ljava/lang/Object;I)V

    .line 246
    .line 247
    .line 248
    new-instance v11, Lhm3;

    .line 249
    .line 250
    const/16 v16, 0x2

    .line 251
    .line 252
    move-object v14, v8

    .line 253
    move-object v13, v8

    .line 254
    invoke-direct/range {v11 .. v16}, Lhm3;-><init>(Ljava/lang/Object;Lcom/google/android/gms/tasks/TaskCompletionSource;Lcom/google/android/gms/tasks/TaskCompletionSource;Ljava/lang/Object;I)V

    .line 255
    .line 256
    .line 257
    invoke-virtual {v12}, Lyr3;->a()Landroid/os/Handler;

    .line 258
    .line 259
    .line 260
    move-result-object v0

    .line 261
    invoke-virtual {v0, v11}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 262
    .line 263
    .line 264
    invoke-virtual {v8}, Lcom/google/android/gms/tasks/TaskCompletionSource;->getTask()Lcom/google/android/gms/tasks/Task;

    .line 265
    .line 266
    .line 267
    goto :goto_7

    .line 268
    :catchall_1
    move-exception v0

    .line 269
    goto :goto_6

    .line 270
    :cond_8
    :try_start_5
    new-instance v0, Ljava/lang/NullPointerException;

    .line 271
    .line 272
    invoke-direct {v0, v7}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 273
    .line 274
    .line 275
    throw v0

    .line 276
    :goto_6
    monitor-exit v6
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 277
    :try_start_6
    throw v0

    .line 278
    :catchall_2
    move-exception v0

    .line 279
    monitor-exit v3
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    .line 280
    throw v0

    .line 281
    :cond_9
    :goto_7
    iget v0, v2, Llc;->a:I

    .line 282
    .line 283
    const/4 v3, 0x3

    .line 284
    if-ne v0, v3, :cond_d

    .line 285
    .line 286
    :try_start_7
    sget-object v0, Lcom/supercell/titan/AppUpdater;->a:Lyg3;

    .line 287
    .line 288
    sget-object v3, Lcom/supercell/titan/AppUpdater;->b:Lmc;

    .line 289
    .line 290
    invoke-virtual {v0, v3}, Lyg3;->a(Lmc;)V

    .line 291
    .line 292
    .line 293
    sget-object v0, Lcom/supercell/titan/AppUpdater;->a:Lyg3;

    .line 294
    .line 295
    iget-object v1, v1, Lqc3;->b:Ljava/lang/Object;

    .line 296
    .line 297
    move-object v6, v1

    .line 298
    check-cast v6, Lcom/supercell/titan/GameApp;

    .line 299
    .line 300
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 301
    .line 302
    .line 303
    iget-object v0, v2, Llc;->c:Landroid/app/PendingIntent;

    .line 304
    .line 305
    if-eqz v0, :cond_a

    .line 306
    .line 307
    move-object v1, v0

    .line 308
    goto :goto_8

    .line 309
    :cond_a
    move-object v1, v5

    .line 310
    :goto_8
    if-eqz v1, :cond_d

    .line 311
    .line 312
    iget-boolean v1, v2, Llc;->d:Z

    .line 313
    .line 314
    if-eqz v1, :cond_b

    .line 315
    .line 316
    goto :goto_9

    .line 317
    :cond_b
    iput-boolean v4, v2, Llc;->d:Z

    .line 318
    .line 319
    if-eqz v0, :cond_c

    .line 320
    .line 321
    move-object v5, v0

    .line 322
    :cond_c
    invoke-virtual {v5}, Landroid/app/PendingIntent;->getIntentSender()Landroid/content/IntentSender;

    .line 323
    .line 324
    .line 325
    move-result-object v7

    .line 326
    const/4 v12, 0x0

    .line 327
    const/4 v13, 0x0

    .line 328
    const/16 v8, 0x4831

    .line 329
    .line 330
    const/4 v9, 0x0

    .line 331
    const/4 v10, 0x0

    .line 332
    const/4 v11, 0x0

    .line 333
    invoke-virtual/range {v6 .. v13}, Landroid/app/Activity;->startIntentSenderForResult(Landroid/content/IntentSender;ILandroid/content/Intent;IIILandroid/os/Bundle;)V
    :try_end_7
    .catch Landroid/content/IntentSender$SendIntentException; {:try_start_7 .. :try_end_7} :catch_1

    .line 334
    .line 335
    .line 336
    goto :goto_9

    .line 337
    :catch_1
    move-exception v0

    .line 338
    const-string v1, "AppUpdater"

    .line 339
    .line 340
    const-string v2, "Error resuming update"

    .line 341
    .line 342
    invoke-static {v1, v2, v0}, Lio/sentry/android/core/n0;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 343
    .line 344
    .line 345
    :cond_d
    :goto_9
    return-void

    .line 346
    nop

    .line 347
    :pswitch_data_0
    .packed-switch 0x9
        :pswitch_0
    .end packed-switch
.end method

.method public p()Landroid/view/ViewGroup$LayoutParams;
    .locals 1

    .line 1
    new-instance p0, Landroid/view/ViewGroup$LayoutParams;

    .line 2
    .line 3
    const/4 v0, -0x2

    .line 4
    invoke-direct {p0, v0, v0}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    .line 5
    .line 6
    .line 7
    return-object p0
.end method

.method public r(Landroid/graphics/Typeface;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lqc3;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Lnw;

    .line 4
    .line 5
    invoke-virtual {p0, p1}, Lnw;->n(Landroid/graphics/Typeface;)Z

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    if-eqz p1, :cond_0

    .line 10
    .line 11
    const/4 p1, 0x0

    .line 12
    invoke-virtual {p0, p1}, Lnw;->j(Z)V

    .line 13
    .line 14
    .line 15
    :cond_0
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 1
    iget v0, p0, Lqc3;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-super {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0

    .line 11
    :pswitch_0
    new-instance v0, Ljava/lang/StringBuilder;

    .line 12
    .line 13
    const-string v1, "ContentInfoCompat{"

    .line 14
    .line 15
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    iget-object p0, p0, Lqc3;->b:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast p0, Landroid/view/ContentInfo;

    .line 21
    .line 22
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    const-string p0, "}"

    .line 26
    .line 27
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    return-object p0

    .line 35
    :pswitch_data_0
    .packed-switch 0x12
        :pswitch_0
    .end packed-switch
.end method

.method public x(Ljava/lang/String;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object p0, p0, Lqc3;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Lie0;

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    invoke-interface {p0, p1, v0}, Lie0;->a(Ljava/lang/String;Ljava/security/Provider;)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0
.end method

.method public z(Ljg1;)Z
    .locals 1

    .line 1
    iget-object p0, p0, Lqc3;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Lwa;

    .line 4
    .line 5
    iget-object p0, p0, Lwa;->W:Landroid/view/Window;

    .line 6
    .line 7
    invoke-virtual {p0}, Landroid/view/Window;->getCallback()Landroid/view/Window$Callback;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    if-eqz p0, :cond_0

    .line 12
    .line 13
    const/16 v0, 0x6c

    .line 14
    .line 15
    invoke-interface {p0, v0, p1}, Landroid/view/Window$Callback;->onMenuOpened(ILandroid/view/Menu;)Z

    .line 16
    .line 17
    .line 18
    :cond_0
    const/4 p0, 0x1

    .line 19
    return p0
.end method
