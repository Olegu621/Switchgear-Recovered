.class public abstract Lyy1;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# static fields
.field public static final a:Lwi;

.field public static final b:Lc01;

.field public static final c:Ljava/lang/Object;

.field public static d:Lg63; = null

.field public static e:Ljava/lang/reflect/Field; = null

.field public static f:Z = false

.field public static g:Z = true


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lwi;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lyy1;->a:Lwi;

    .line 7
    .line 8
    new-instance v0, Lc01;

    .line 9
    .line 10
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 11
    .line 12
    .line 13
    sput-object v0, Lyy1;->b:Lc01;

    .line 14
    .line 15
    new-instance v0, Ljava/lang/Object;

    .line 16
    .line 17
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 18
    .line 19
    .line 20
    sput-object v0, Lyy1;->c:Ljava/lang/Object;

    .line 21
    .line 22
    return-void
.end method

.method public static A(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;
    .locals 5

    .line 1
    const-string v0, ""

    .line 2
    .line 3
    if-nez p0, :cond_0

    .line 4
    .line 5
    return-object v0

    .line 6
    :cond_0
    const/4 v1, 0x0

    .line 7
    :try_start_0
    new-instance v2, Ljava/lang/StringBuilder;

    .line 8
    .line 9
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    invoke-virtual {p0, p1}, Landroid/content/res/AssetManager;->open(Ljava/lang/String;)Ljava/io/InputStream;

    .line 17
    .line 18
    .line 19
    move-result-object p0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_2
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 20
    :try_start_1
    new-instance p1, Ljava/io/BufferedReader;

    .line 21
    .line 22
    new-instance v3, Ljava/io/InputStreamReader;

    .line 23
    .line 24
    invoke-direct {v3, p0}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;)V

    .line 25
    .line 26
    .line 27
    invoke-direct {p1, v3}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;)V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 28
    .line 29
    .line 30
    :goto_0
    :try_start_2
    invoke-virtual {p1}, Ljava/io/BufferedReader;->readLine()Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    if-eqz v1, :cond_1

    .line 35
    .line 36
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    goto :goto_0

    .line 40
    :catchall_0
    move-exception v0

    .line 41
    :goto_1
    move-object v1, p0

    .line 42
    goto :goto_4

    .line 43
    :catch_0
    move-exception v1

    .line 44
    goto :goto_3

    .line 45
    :cond_1
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object v0
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 49
    :goto_2
    invoke-static {p0}, Lb40;->e(Ljava/io/Closeable;)V

    .line 50
    .line 51
    .line 52
    invoke-static {p1}, Lb40;->e(Ljava/io/Closeable;)V

    .line 53
    .line 54
    .line 55
    return-object v0

    .line 56
    :catchall_1
    move-exception v0

    .line 57
    move-object p1, v1

    .line 58
    goto :goto_1

    .line 59
    :catch_1
    move-exception p1

    .line 60
    move-object v4, v1

    .line 61
    move-object v1, p1

    .line 62
    move-object p1, v4

    .line 63
    goto :goto_3

    .line 64
    :catchall_2
    move-exception v0

    .line 65
    move-object p1, v1

    .line 66
    goto :goto_4

    .line 67
    :catch_2
    move-exception p0

    .line 68
    move-object p1, v1

    .line 69
    move-object v1, p0

    .line 70
    move-object p0, p1

    .line 71
    :goto_3
    :try_start_3
    const-string v2, "astsUtl"

    .line 72
    .line 73
    const-string v3, "Error in reading the file contents"

    .line 74
    .line 75
    invoke-static {v2, v3, v1}, Lio/sentry/android/core/n0;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 76
    .line 77
    .line 78
    goto :goto_2

    .line 79
    :goto_4
    invoke-static {v1}, Lb40;->e(Ljava/io/Closeable;)V

    .line 80
    .line 81
    .line 82
    invoke-static {p1}, Lb40;->e(Ljava/io/Closeable;)V

    .line 83
    .line 84
    .line 85
    throw v0
.end method

.method public static B(Ljava/lang/String;)Ljava/lang/String;
    .locals 5

    .line 1
    const-string v0, "Error reading file: "

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    :try_start_0
    new-instance v2, Ljava/io/File;

    .line 5
    .line 6
    invoke-direct {v2, p0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 7
    .line 8
    .line 9
    new-instance v3, Ljava/io/FileInputStream;

    .line 10
    .line 11
    invoke-direct {v3, v2}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V

    .line 12
    .line 13
    .line 14
    invoke-static {v2, v3}, Lio/sentry/config/a;->b(Ljava/io/File;Ljava/io/FileInputStream;)Ljava/io/FileInputStream;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    invoke-virtual {v2}, Ljava/io/File;->length()J

    .line 19
    .line 20
    .line 21
    move-result-wide v2

    .line 22
    long-to-int v2, v2

    .line 23
    new-array v3, v2, [B

    .line 24
    .line 25
    const/4 v4, 0x0

    .line 26
    invoke-virtual {v1, v3, v4, v2}, Ljava/io/FileInputStream;->read([BII)I

    .line 27
    .line 28
    .line 29
    new-instance v2, Ljava/lang/String;

    .line 30
    .line 31
    invoke-direct {v2, v3}, Ljava/lang/String;-><init>([B)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 32
    .line 33
    .line 34
    invoke-static {v1}, Lb40;->e(Ljava/io/Closeable;)V

    .line 35
    .line 36
    .line 37
    return-object v2

    .line 38
    :catchall_0
    move-exception p0

    .line 39
    goto :goto_0

    .line 40
    :catch_0
    move-exception v2

    .line 41
    :try_start_1
    const-string v3, "fileutil"

    .line 42
    .line 43
    invoke-virtual {v0, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    invoke-static {v3, p0, v2}, Lxe2;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 48
    .line 49
    .line 50
    invoke-static {v1}, Lb40;->e(Ljava/io/Closeable;)V

    .line 51
    .line 52
    .line 53
    const-string p0, ""

    .line 54
    .line 55
    return-object p0

    .line 56
    :goto_0
    invoke-static {v1}, Lb40;->e(Ljava/io/Closeable;)V

    .line 57
    .line 58
    .line 59
    throw p0
.end method

.method public static C(Landroid/content/Context;I)Landroid/util/TypedValue;
    .locals 2

    .line 1
    new-instance v0, Landroid/util/TypedValue;

    .line 2
    .line 3
    invoke-direct {v0}, Landroid/util/TypedValue;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    const/4 v1, 0x1

    .line 11
    invoke-virtual {p0, p1, v0, v1}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z

    .line 12
    .line 13
    .line 14
    move-result p0

    .line 15
    if-eqz p0, :cond_0

    .line 16
    .line 17
    return-object v0

    .line 18
    :cond_0
    const/4 p0, 0x0

    .line 19
    return-object p0
.end method

.method public static D(Landroid/content/Context;Ljava/lang/String;I)I
    .locals 1

    .line 1
    invoke-static {p0, p2}, Lyy1;->C(Landroid/content/Context;I)Landroid/util/TypedValue;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iget p0, v0, Landroid/util/TypedValue;->data:I

    .line 8
    .line 9
    return p0

    .line 10
    :cond_0
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    invoke-virtual {p0, p2}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    filled-new-array {p1, p0}, [Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    const-string p1, "%1$s requires a value for the %2$s attribute to be set in your app theme. You can either set the attribute in your theme or update your theme to inherit from Theme.MaterialComponents (or a descendant)."

    .line 23
    .line 24
    invoke-static {p1, p0}, Lio/sentry/u2;->m(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    const/4 p0, 0x0

    .line 28
    return p0
.end method

.method public static E(Ljava/util/HashMap;)Ljava/util/HashMap;
    .locals 4

    .line 1
    new-instance v0, Ljava/util/HashMap;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 4
    .line 5
    .line 6
    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 7
    .line 8
    const-string v2, "enableLogging"

    .line 9
    .line 10
    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    const-string v2, "notificationChannelId"

    .line 14
    .line 15
    const-string v3, ""

    .line 16
    .line 17
    invoke-virtual {v0, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    const/4 v2, 0x0

    .line 21
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    const-string v3, "notificationSoundId"

    .line 26
    .line 27
    invoke-virtual {v0, v3, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    const-string v3, "notificationIcon"

    .line 31
    .line 32
    invoke-virtual {v0, v3, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    const-string v3, "notificationLargeIcon"

    .line 36
    .line 37
    invoke-virtual {v0, v3, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    const-string v2, "manualLifecycleTracking"

    .line 41
    .line 42
    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    const-string v1, "enableInAppNotification"

    .line 46
    .line 47
    sget-object v2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 48
    .line 49
    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    invoke-virtual {v0, p0}, Ljava/util/HashMap;->putAll(Ljava/util/Map;)V

    .line 53
    .line 54
    .line 55
    return-object v0
.end method

.method public static G(ILxi;Lzz;Z)V
    .locals 6

    .line 1
    iget v0, p2, Lzz;->f0:F

    .line 2
    .line 3
    iget-object v1, p2, Lzz;->J:Loz;

    .line 4
    .line 5
    iget-object v2, v1, Loz;->f:Loz;

    .line 6
    .line 7
    invoke-virtual {v2}, Loz;->d()I

    .line 8
    .line 9
    .line 10
    move-result v2

    .line 11
    iget-object v3, p2, Lzz;->L:Loz;

    .line 12
    .line 13
    iget-object v4, v3, Loz;->f:Loz;

    .line 14
    .line 15
    invoke-virtual {v4}, Loz;->d()I

    .line 16
    .line 17
    .line 18
    move-result v4

    .line 19
    invoke-virtual {v1}, Loz;->e()I

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    add-int/2addr v1, v2

    .line 24
    invoke-virtual {v3}, Loz;->e()I

    .line 25
    .line 26
    .line 27
    move-result v3

    .line 28
    sub-int v3, v4, v3

    .line 29
    .line 30
    const/high16 v5, 0x3f000000    # 0.5f

    .line 31
    .line 32
    if-ne v2, v4, :cond_0

    .line 33
    .line 34
    move v0, v5

    .line 35
    goto :goto_0

    .line 36
    :cond_0
    move v2, v1

    .line 37
    move v4, v3

    .line 38
    :goto_0
    invoke-virtual {p2}, Lzz;->r()I

    .line 39
    .line 40
    .line 41
    move-result v1

    .line 42
    sub-int v3, v4, v2

    .line 43
    .line 44
    sub-int/2addr v3, v1

    .line 45
    if-le v2, v4, :cond_1

    .line 46
    .line 47
    sub-int v3, v2, v4

    .line 48
    .line 49
    sub-int/2addr v3, v1

    .line 50
    :cond_1
    if-lez v3, :cond_2

    .line 51
    .line 52
    int-to-float v3, v3

    .line 53
    mul-float/2addr v0, v3

    .line 54
    add-float/2addr v0, v5

    .line 55
    :goto_1
    float-to-int v0, v0

    .line 56
    goto :goto_2

    .line 57
    :cond_2
    int-to-float v3, v3

    .line 58
    mul-float/2addr v0, v3

    .line 59
    goto :goto_1

    .line 60
    :goto_2
    add-int/2addr v0, v2

    .line 61
    add-int v3, v0, v1

    .line 62
    .line 63
    if-le v2, v4, :cond_3

    .line 64
    .line 65
    sub-int v3, v0, v1

    .line 66
    .line 67
    :cond_3
    invoke-virtual {p2, v0, v3}, Lzz;->K(II)V

    .line 68
    .line 69
    .line 70
    add-int/lit8 p0, p0, 0x1

    .line 71
    .line 72
    invoke-static {p0, p1, p2, p3}, Lyy1;->v(ILxi;Lzz;Z)V

    .line 73
    .line 74
    .line 75
    return-void
.end method

.method public static H(ILzz;Lxi;Lzz;Z)V
    .locals 7

    .line 1
    iget v0, p3, Lzz;->f0:F

    .line 2
    .line 3
    iget-object v1, p3, Lzz;->J:Loz;

    .line 4
    .line 5
    iget-object v2, v1, Loz;->f:Loz;

    .line 6
    .line 7
    invoke-virtual {v2}, Loz;->d()I

    .line 8
    .line 9
    .line 10
    move-result v2

    .line 11
    invoke-virtual {v1}, Loz;->e()I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    add-int/2addr v1, v2

    .line 16
    iget-object v2, p3, Lzz;->L:Loz;

    .line 17
    .line 18
    iget-object v3, v2, Loz;->f:Loz;

    .line 19
    .line 20
    invoke-virtual {v3}, Loz;->d()I

    .line 21
    .line 22
    .line 23
    move-result v3

    .line 24
    invoke-virtual {v2}, Loz;->e()I

    .line 25
    .line 26
    .line 27
    move-result v2

    .line 28
    sub-int/2addr v3, v2

    .line 29
    if-lt v3, v1, :cond_4

    .line 30
    .line 31
    invoke-virtual {p3}, Lzz;->r()I

    .line 32
    .line 33
    .line 34
    move-result v2

    .line 35
    iget v4, p3, Lzz;->i0:I

    .line 36
    .line 37
    const/16 v5, 0x8

    .line 38
    .line 39
    const/high16 v6, 0x3f000000    # 0.5f

    .line 40
    .line 41
    if-eq v4, v5, :cond_3

    .line 42
    .line 43
    iget v4, p3, Lzz;->r:I

    .line 44
    .line 45
    const/4 v5, 0x2

    .line 46
    if-ne v4, v5, :cond_1

    .line 47
    .line 48
    instance-of v2, p1, La00;

    .line 49
    .line 50
    if-eqz v2, :cond_0

    .line 51
    .line 52
    invoke-virtual {p1}, Lzz;->r()I

    .line 53
    .line 54
    .line 55
    move-result p1

    .line 56
    goto :goto_0

    .line 57
    :cond_0
    iget-object p1, p1, Lzz;->V:Lzz;

    .line 58
    .line 59
    invoke-virtual {p1}, Lzz;->r()I

    .line 60
    .line 61
    .line 62
    move-result p1

    .line 63
    :goto_0
    iget v2, p3, Lzz;->f0:F

    .line 64
    .line 65
    mul-float/2addr v2, v6

    .line 66
    int-to-float p1, p1

    .line 67
    mul-float/2addr v2, p1

    .line 68
    float-to-int v2, v2

    .line 69
    goto :goto_1

    .line 70
    :cond_1
    if-nez v4, :cond_2

    .line 71
    .line 72
    sub-int v2, v3, v1

    .line 73
    .line 74
    :cond_2
    :goto_1
    iget p1, p3, Lzz;->u:I

    .line 75
    .line 76
    invoke-static {p1, v2}, Ljava/lang/Math;->max(II)I

    .line 77
    .line 78
    .line 79
    move-result v2

    .line 80
    iget p1, p3, Lzz;->v:I

    .line 81
    .line 82
    if-lez p1, :cond_3

    .line 83
    .line 84
    invoke-static {p1, v2}, Ljava/lang/Math;->min(II)I

    .line 85
    .line 86
    .line 87
    move-result v2

    .line 88
    :cond_3
    sub-int/2addr v3, v1

    .line 89
    sub-int/2addr v3, v2

    .line 90
    int-to-float p1, v3

    .line 91
    mul-float/2addr v0, p1

    .line 92
    add-float/2addr v0, v6

    .line 93
    float-to-int p1, v0

    .line 94
    add-int/2addr v1, p1

    .line 95
    add-int/2addr v2, v1

    .line 96
    invoke-virtual {p3, v1, v2}, Lzz;->K(II)V

    .line 97
    .line 98
    .line 99
    add-int/lit8 p0, p0, 0x1

    .line 100
    .line 101
    invoke-static {p0, p2, p3, p4}, Lyy1;->v(ILxi;Lzz;Z)V

    .line 102
    .line 103
    .line 104
    :cond_4
    return-void
.end method

.method public static I(ILxi;Lzz;)V
    .locals 6

    .line 1
    iget v0, p2, Lzz;->g0:F

    .line 2
    .line 3
    iget-object v1, p2, Lzz;->K:Loz;

    .line 4
    .line 5
    iget-object v2, v1, Loz;->f:Loz;

    .line 6
    .line 7
    invoke-virtual {v2}, Loz;->d()I

    .line 8
    .line 9
    .line 10
    move-result v2

    .line 11
    iget-object v3, p2, Lzz;->M:Loz;

    .line 12
    .line 13
    iget-object v4, v3, Loz;->f:Loz;

    .line 14
    .line 15
    invoke-virtual {v4}, Loz;->d()I

    .line 16
    .line 17
    .line 18
    move-result v4

    .line 19
    invoke-virtual {v1}, Loz;->e()I

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    add-int/2addr v1, v2

    .line 24
    invoke-virtual {v3}, Loz;->e()I

    .line 25
    .line 26
    .line 27
    move-result v3

    .line 28
    sub-int v3, v4, v3

    .line 29
    .line 30
    const/high16 v5, 0x3f000000    # 0.5f

    .line 31
    .line 32
    if-ne v2, v4, :cond_0

    .line 33
    .line 34
    move v0, v5

    .line 35
    goto :goto_0

    .line 36
    :cond_0
    move v2, v1

    .line 37
    move v4, v3

    .line 38
    :goto_0
    invoke-virtual {p2}, Lzz;->l()I

    .line 39
    .line 40
    .line 41
    move-result v1

    .line 42
    sub-int v3, v4, v2

    .line 43
    .line 44
    sub-int/2addr v3, v1

    .line 45
    if-le v2, v4, :cond_1

    .line 46
    .line 47
    sub-int v3, v2, v4

    .line 48
    .line 49
    sub-int/2addr v3, v1

    .line 50
    :cond_1
    if-lez v3, :cond_2

    .line 51
    .line 52
    int-to-float v3, v3

    .line 53
    mul-float/2addr v0, v3

    .line 54
    add-float/2addr v0, v5

    .line 55
    :goto_1
    float-to-int v0, v0

    .line 56
    goto :goto_2

    .line 57
    :cond_2
    int-to-float v3, v3

    .line 58
    mul-float/2addr v0, v3

    .line 59
    goto :goto_1

    .line 60
    :goto_2
    add-int v3, v2, v0

    .line 61
    .line 62
    add-int v5, v3, v1

    .line 63
    .line 64
    if-le v2, v4, :cond_3

    .line 65
    .line 66
    sub-int v3, v2, v0

    .line 67
    .line 68
    sub-int v5, v3, v1

    .line 69
    .line 70
    :cond_3
    invoke-virtual {p2, v3, v5}, Lzz;->L(II)V

    .line 71
    .line 72
    .line 73
    add-int/lit8 p0, p0, 0x1

    .line 74
    .line 75
    invoke-static {p0, p1, p2}, Lyy1;->N(ILxi;Lzz;)V

    .line 76
    .line 77
    .line 78
    return-void
.end method

.method public static J(ILzz;Lxi;Lzz;)V
    .locals 7

    .line 1
    iget v0, p3, Lzz;->g0:F

    .line 2
    .line 3
    iget-object v1, p3, Lzz;->K:Loz;

    .line 4
    .line 5
    iget-object v2, v1, Loz;->f:Loz;

    .line 6
    .line 7
    invoke-virtual {v2}, Loz;->d()I

    .line 8
    .line 9
    .line 10
    move-result v2

    .line 11
    invoke-virtual {v1}, Loz;->e()I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    add-int/2addr v1, v2

    .line 16
    iget-object v2, p3, Lzz;->M:Loz;

    .line 17
    .line 18
    iget-object v3, v2, Loz;->f:Loz;

    .line 19
    .line 20
    invoke-virtual {v3}, Loz;->d()I

    .line 21
    .line 22
    .line 23
    move-result v3

    .line 24
    invoke-virtual {v2}, Loz;->e()I

    .line 25
    .line 26
    .line 27
    move-result v2

    .line 28
    sub-int/2addr v3, v2

    .line 29
    if-lt v3, v1, :cond_4

    .line 30
    .line 31
    invoke-virtual {p3}, Lzz;->l()I

    .line 32
    .line 33
    .line 34
    move-result v2

    .line 35
    iget v4, p3, Lzz;->i0:I

    .line 36
    .line 37
    const/16 v5, 0x8

    .line 38
    .line 39
    const/high16 v6, 0x3f000000    # 0.5f

    .line 40
    .line 41
    if-eq v4, v5, :cond_3

    .line 42
    .line 43
    iget v4, p3, Lzz;->s:I

    .line 44
    .line 45
    const/4 v5, 0x2

    .line 46
    if-ne v4, v5, :cond_1

    .line 47
    .line 48
    instance-of v2, p1, La00;

    .line 49
    .line 50
    if-eqz v2, :cond_0

    .line 51
    .line 52
    invoke-virtual {p1}, Lzz;->l()I

    .line 53
    .line 54
    .line 55
    move-result p1

    .line 56
    goto :goto_0

    .line 57
    :cond_0
    iget-object p1, p1, Lzz;->V:Lzz;

    .line 58
    .line 59
    invoke-virtual {p1}, Lzz;->l()I

    .line 60
    .line 61
    .line 62
    move-result p1

    .line 63
    :goto_0
    mul-float v2, v0, v6

    .line 64
    .line 65
    int-to-float p1, p1

    .line 66
    mul-float/2addr v2, p1

    .line 67
    float-to-int v2, v2

    .line 68
    goto :goto_1

    .line 69
    :cond_1
    if-nez v4, :cond_2

    .line 70
    .line 71
    sub-int v2, v3, v1

    .line 72
    .line 73
    :cond_2
    :goto_1
    iget p1, p3, Lzz;->x:I

    .line 74
    .line 75
    invoke-static {p1, v2}, Ljava/lang/Math;->max(II)I

    .line 76
    .line 77
    .line 78
    move-result v2

    .line 79
    iget p1, p3, Lzz;->y:I

    .line 80
    .line 81
    if-lez p1, :cond_3

    .line 82
    .line 83
    invoke-static {p1, v2}, Ljava/lang/Math;->min(II)I

    .line 84
    .line 85
    .line 86
    move-result v2

    .line 87
    :cond_3
    sub-int/2addr v3, v1

    .line 88
    sub-int/2addr v3, v2

    .line 89
    int-to-float p1, v3

    .line 90
    mul-float/2addr v0, p1

    .line 91
    add-float/2addr v0, v6

    .line 92
    float-to-int p1, v0

    .line 93
    add-int/2addr v1, p1

    .line 94
    add-int/2addr v2, v1

    .line 95
    invoke-virtual {p3, v1, v2}, Lzz;->L(II)V

    .line 96
    .line 97
    .line 98
    add-int/lit8 p0, p0, 0x1

    .line 99
    .line 100
    invoke-static {p0, p2, p3}, Lyy1;->N(ILxi;Lzz;)V

    .line 101
    .line 102
    .line 103
    :cond_4
    return-void
.end method

.method public static K(Landroid/content/Context;Landroid/content/Intent;)Landroid/content/ComponentName;
    .locals 4

    .line 1
    sget-object v0, Lyy1;->c:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    invoke-static {p0}, Lyy1;->h(Landroid/content/Context;)V

    .line 5
    .line 6
    .line 7
    const-string v1, "com.google.firebase.iid.WakeLockHolder.wakefulintent"

    .line 8
    .line 9
    const/4 v2, 0x0

    .line 10
    invoke-virtual {p1, v1, v2}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    const-string v2, "com.google.firebase.iid.WakeLockHolder.wakefulintent"

    .line 15
    .line 16
    const/4 v3, 0x1

    .line 17
    invoke-virtual {p1, v2, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 18
    .line 19
    .line 20
    invoke-virtual {p0, p1}, Landroid/content/Context;->startService(Landroid/content/Intent;)Landroid/content/ComponentName;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    if-nez p0, :cond_0

    .line 25
    .line 26
    const/4 p0, 0x0

    .line 27
    monitor-exit v0

    .line 28
    return-object p0

    .line 29
    :catchall_0
    move-exception p0

    .line 30
    goto :goto_0

    .line 31
    :cond_0
    if-nez v1, :cond_1

    .line 32
    .line 33
    sget-object p1, Lyy1;->d:Lg63;

    .line 34
    .line 35
    invoke-virtual {p1}, Lg63;->a()V

    .line 36
    .line 37
    .line 38
    :cond_1
    monitor-exit v0

    .line 39
    return-object p0

    .line 40
    :goto_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 41
    throw p0
.end method

.method public static L(Landroid/content/Context;Ljava/lang/String;I)Z
    .locals 1

    .line 1
    invoke-static {p0}, Lg93;->a(Landroid/content/Context;)Lv30;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    :try_start_0
    iget-object p0, p0, Lv30;->a:Landroid/content/Context;

    .line 9
    .line 10
    const-string v0, "appops"

    .line 11
    .line 12
    invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    check-cast p0, Landroid/app/AppOpsManager;

    .line 17
    .line 18
    if-eqz p0, :cond_0

    .line 19
    .line 20
    invoke-virtual {p0, p2, p1}, Landroid/app/AppOpsManager;->checkPackage(ILjava/lang/String;)V

    .line 21
    .line 22
    .line 23
    const/4 p0, 0x1

    .line 24
    return p0

    .line 25
    :cond_0
    new-instance p0, Ljava/lang/NullPointerException;

    .line 26
    .line 27
    const-string p1, "context.getSystemService(Context.APP_OPS_SERVICE) is null"

    .line 28
    .line 29
    invoke-direct {p0, p1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    throw p0
    :try_end_0
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_0

    .line 33
    :catch_0
    const/4 p0, 0x0

    .line 34
    return p0
.end method

.method public static final M(Ljava/lang/String;Lkotlin/jvm/functions/Function0;)Z
    .locals 1

    .line 1
    const-string v0, "ReflectionGuard"

    .line 2
    .line 3
    :try_start_0
    invoke-interface {p1}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    check-cast p1, Ljava/lang/Boolean;

    .line 8
    .line 9
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 10
    .line 11
    .line 12
    move-result p1

    .line 13
    if-nez p1, :cond_0

    .line 14
    .line 15
    invoke-static {v0, p0}, Lio/sentry/android/core/n0;->d(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_0

    .line 16
    .line 17
    .line 18
    :cond_0
    return p1

    .line 19
    :catch_0
    const-string p1, "NoSuchMethod: "

    .line 20
    .line 21
    invoke-virtual {p1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    invoke-static {v0, p0}, Lio/sentry/android/core/n0;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 26
    .line 27
    .line 28
    goto :goto_0

    .line 29
    :catch_1
    const-string p1, "ClassNotFound: "

    .line 30
    .line 31
    invoke-virtual {p1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    invoke-static {v0, p0}, Lio/sentry/android/core/n0;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 36
    .line 37
    .line 38
    :goto_0
    const/4 p0, 0x0

    .line 39
    return p0
.end method

.method public static N(ILxi;Lzz;)V
    .locals 19

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    move-object/from16 v1, p2

    .line 4
    .line 5
    iget-boolean v2, v1, Lzz;->n:Z

    .line 6
    .line 7
    if-eqz v2, :cond_0

    .line 8
    .line 9
    goto/16 :goto_4

    .line 10
    .line 11
    :cond_0
    instance-of v2, v1, La00;

    .line 12
    .line 13
    if-nez v2, :cond_1

    .line 14
    .line 15
    invoke-virtual {v1}, Lzz;->A()Z

    .line 16
    .line 17
    .line 18
    move-result v2

    .line 19
    if-eqz v2, :cond_1

    .line 20
    .line 21
    invoke-static {v1}, Lyy1;->d(Lzz;)Z

    .line 22
    .line 23
    .line 24
    move-result v2

    .line 25
    if-eqz v2, :cond_1

    .line 26
    .line 27
    new-instance v2, Lwi;

    .line 28
    .line 29
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 30
    .line 31
    .line 32
    invoke-static {v1, v0, v2}, La00;->W(Lzz;Lxi;Lwi;)V

    .line 33
    .line 34
    .line 35
    :cond_1
    const/4 v2, 0x3

    .line 36
    invoke-virtual {v1, v2}, Lzz;->j(I)Loz;

    .line 37
    .line 38
    .line 39
    move-result-object v2

    .line 40
    const/4 v3, 0x5

    .line 41
    invoke-virtual {v1, v3}, Lzz;->j(I)Loz;

    .line 42
    .line 43
    .line 44
    move-result-object v3

    .line 45
    invoke-virtual {v2}, Loz;->d()I

    .line 46
    .line 47
    .line 48
    move-result v4

    .line 49
    invoke-virtual {v3}, Loz;->d()I

    .line 50
    .line 51
    .line 52
    move-result v5

    .line 53
    iget-object v6, v2, Loz;->a:Ljava/util/HashSet;

    .line 54
    .line 55
    const/16 v8, 0x8

    .line 56
    .line 57
    sget-object v9, Lyz;->c:Lyz;

    .line 58
    .line 59
    if-eqz v6, :cond_d

    .line 60
    .line 61
    iget-boolean v2, v2, Loz;->c:Z

    .line 62
    .line 63
    if-eqz v2, :cond_d

    .line 64
    .line 65
    invoke-virtual {v6}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    .line 66
    .line 67
    .line 68
    move-result-object v2

    .line 69
    :cond_2
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 70
    .line 71
    .line 72
    move-result v6

    .line 73
    if-eqz v6, :cond_d

    .line 74
    .line 75
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    move-result-object v6

    .line 79
    check-cast v6, Loz;

    .line 80
    .line 81
    iget-object v12, v6, Loz;->d:Lzz;

    .line 82
    .line 83
    add-int/lit8 v13, p0, 0x1

    .line 84
    .line 85
    invoke-static {v12}, Lyy1;->d(Lzz;)Z

    .line 86
    .line 87
    .line 88
    move-result v14

    .line 89
    iget-object v15, v12, Lzz;->K:Loz;

    .line 90
    .line 91
    const/16 v16, 0x0

    .line 92
    .line 93
    iget-object v7, v12, Lzz;->M:Loz;

    .line 94
    .line 95
    invoke-virtual {v12}, Lzz;->A()Z

    .line 96
    .line 97
    .line 98
    move-result v17

    .line 99
    if-eqz v17, :cond_3

    .line 100
    .line 101
    if-eqz v14, :cond_3

    .line 102
    .line 103
    new-instance v10, Lwi;

    .line 104
    .line 105
    invoke-direct {v10}, Ljava/lang/Object;-><init>()V

    .line 106
    .line 107
    .line 108
    invoke-static {v12, v0, v10}, La00;->W(Lzz;Lxi;Lwi;)V

    .line 109
    .line 110
    .line 111
    :cond_3
    if-ne v6, v15, :cond_4

    .line 112
    .line 113
    iget-object v10, v7, Loz;->f:Loz;

    .line 114
    .line 115
    if-eqz v10, :cond_4

    .line 116
    .line 117
    iget-boolean v10, v10, Loz;->c:Z

    .line 118
    .line 119
    if-nez v10, :cond_5

    .line 120
    .line 121
    :cond_4
    if-ne v6, v7, :cond_6

    .line 122
    .line 123
    iget-object v10, v15, Loz;->f:Loz;

    .line 124
    .line 125
    if-eqz v10, :cond_6

    .line 126
    .line 127
    iget-boolean v10, v10, Loz;->c:Z

    .line 128
    .line 129
    if-eqz v10, :cond_6

    .line 130
    .line 131
    :cond_5
    const/4 v10, 0x1

    .line 132
    :goto_1
    const/16 v18, 0x1

    .line 133
    .line 134
    goto :goto_2

    .line 135
    :cond_6
    const/4 v10, 0x0

    .line 136
    goto :goto_1

    .line 137
    :goto_2
    iget-object v11, v12, Lzz;->U:[Lyz;

    .line 138
    .line 139
    aget-object v11, v11, v18

    .line 140
    .line 141
    if-ne v11, v9, :cond_9

    .line 142
    .line 143
    if-eqz v14, :cond_7

    .line 144
    .line 145
    goto :goto_3

    .line 146
    :cond_7
    if-ne v11, v9, :cond_2

    .line 147
    .line 148
    iget v6, v12, Lzz;->y:I

    .line 149
    .line 150
    if-ltz v6, :cond_2

    .line 151
    .line 152
    iget v6, v12, Lzz;->x:I

    .line 153
    .line 154
    if-ltz v6, :cond_2

    .line 155
    .line 156
    iget v6, v12, Lzz;->i0:I

    .line 157
    .line 158
    if-eq v6, v8, :cond_8

    .line 159
    .line 160
    iget v6, v12, Lzz;->s:I

    .line 161
    .line 162
    if-nez v6, :cond_2

    .line 163
    .line 164
    iget v6, v12, Lzz;->Y:F

    .line 165
    .line 166
    cmpl-float v6, v6, v16

    .line 167
    .line 168
    if-nez v6, :cond_2

    .line 169
    .line 170
    :cond_8
    invoke-virtual {v12}, Lzz;->z()Z

    .line 171
    .line 172
    .line 173
    move-result v6

    .line 174
    if-nez v6, :cond_2

    .line 175
    .line 176
    iget-boolean v6, v12, Lzz;->G:Z

    .line 177
    .line 178
    if-nez v6, :cond_2

    .line 179
    .line 180
    if-eqz v10, :cond_2

    .line 181
    .line 182
    invoke-virtual {v12}, Lzz;->z()Z

    .line 183
    .line 184
    .line 185
    move-result v6

    .line 186
    if-nez v6, :cond_2

    .line 187
    .line 188
    invoke-static {v13, v1, v0, v12}, Lyy1;->J(ILzz;Lxi;Lzz;)V

    .line 189
    .line 190
    .line 191
    goto :goto_0

    .line 192
    :cond_9
    :goto_3
    invoke-virtual {v12}, Lzz;->A()Z

    .line 193
    .line 194
    .line 195
    move-result v11

    .line 196
    if-eqz v11, :cond_a

    .line 197
    .line 198
    goto/16 :goto_0

    .line 199
    .line 200
    :cond_a
    if-ne v6, v15, :cond_b

    .line 201
    .line 202
    iget-object v11, v7, Loz;->f:Loz;

    .line 203
    .line 204
    if-nez v11, :cond_b

    .line 205
    .line 206
    invoke-virtual {v15}, Loz;->e()I

    .line 207
    .line 208
    .line 209
    move-result v6

    .line 210
    add-int/2addr v6, v4

    .line 211
    invoke-virtual {v12}, Lzz;->l()I

    .line 212
    .line 213
    .line 214
    move-result v7

    .line 215
    add-int/2addr v7, v6

    .line 216
    invoke-virtual {v12, v6, v7}, Lzz;->L(II)V

    .line 217
    .line 218
    .line 219
    invoke-static {v13, v0, v12}, Lyy1;->N(ILxi;Lzz;)V

    .line 220
    .line 221
    .line 222
    goto/16 :goto_0

    .line 223
    .line 224
    :cond_b
    if-ne v6, v7, :cond_c

    .line 225
    .line 226
    iget-object v6, v15, Loz;->f:Loz;

    .line 227
    .line 228
    if-nez v6, :cond_c

    .line 229
    .line 230
    invoke-virtual {v7}, Loz;->e()I

    .line 231
    .line 232
    .line 233
    move-result v6

    .line 234
    sub-int v6, v4, v6

    .line 235
    .line 236
    invoke-virtual {v12}, Lzz;->l()I

    .line 237
    .line 238
    .line 239
    move-result v7

    .line 240
    sub-int v7, v6, v7

    .line 241
    .line 242
    invoke-virtual {v12, v7, v6}, Lzz;->L(II)V

    .line 243
    .line 244
    .line 245
    invoke-static {v13, v0, v12}, Lyy1;->N(ILxi;Lzz;)V

    .line 246
    .line 247
    .line 248
    goto/16 :goto_0

    .line 249
    .line 250
    :cond_c
    if-eqz v10, :cond_2

    .line 251
    .line 252
    invoke-virtual {v12}, Lzz;->z()Z

    .line 253
    .line 254
    .line 255
    move-result v6

    .line 256
    if-nez v6, :cond_2

    .line 257
    .line 258
    invoke-static {v13, v0, v12}, Lyy1;->I(ILxi;Lzz;)V

    .line 259
    .line 260
    .line 261
    goto/16 :goto_0

    .line 262
    .line 263
    :cond_d
    const/16 v16, 0x0

    .line 264
    .line 265
    const/16 v18, 0x1

    .line 266
    .line 267
    instance-of v2, v1, Lbs0;

    .line 268
    .line 269
    if-eqz v2, :cond_e

    .line 270
    .line 271
    :goto_4
    return-void

    .line 272
    :cond_e
    iget-object v2, v3, Loz;->a:Ljava/util/HashSet;

    .line 273
    .line 274
    if-eqz v2, :cond_1a

    .line 275
    .line 276
    iget-boolean v3, v3, Loz;->c:Z

    .line 277
    .line 278
    if-eqz v3, :cond_1a

    .line 279
    .line 280
    invoke-virtual {v2}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    .line 281
    .line 282
    .line 283
    move-result-object v2

    .line 284
    :cond_f
    :goto_5
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 285
    .line 286
    .line 287
    move-result v3

    .line 288
    if-eqz v3, :cond_1a

    .line 289
    .line 290
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 291
    .line 292
    .line 293
    move-result-object v3

    .line 294
    check-cast v3, Loz;

    .line 295
    .line 296
    iget-object v4, v3, Loz;->d:Lzz;

    .line 297
    .line 298
    add-int/lit8 v6, p0, 0x1

    .line 299
    .line 300
    invoke-static {v4}, Lyy1;->d(Lzz;)Z

    .line 301
    .line 302
    .line 303
    move-result v7

    .line 304
    iget-object v10, v4, Lzz;->K:Loz;

    .line 305
    .line 306
    iget-object v11, v4, Lzz;->M:Loz;

    .line 307
    .line 308
    invoke-virtual {v4}, Lzz;->A()Z

    .line 309
    .line 310
    .line 311
    move-result v12

    .line 312
    if-eqz v12, :cond_10

    .line 313
    .line 314
    if-eqz v7, :cond_10

    .line 315
    .line 316
    new-instance v12, Lwi;

    .line 317
    .line 318
    invoke-direct {v12}, Ljava/lang/Object;-><init>()V

    .line 319
    .line 320
    .line 321
    invoke-static {v4, v0, v12}, La00;->W(Lzz;Lxi;Lwi;)V

    .line 322
    .line 323
    .line 324
    :cond_10
    if-ne v3, v10, :cond_11

    .line 325
    .line 326
    iget-object v12, v11, Loz;->f:Loz;

    .line 327
    .line 328
    if-eqz v12, :cond_11

    .line 329
    .line 330
    iget-boolean v12, v12, Loz;->c:Z

    .line 331
    .line 332
    if-nez v12, :cond_12

    .line 333
    .line 334
    :cond_11
    if-ne v3, v11, :cond_13

    .line 335
    .line 336
    iget-object v12, v10, Loz;->f:Loz;

    .line 337
    .line 338
    if-eqz v12, :cond_13

    .line 339
    .line 340
    iget-boolean v12, v12, Loz;->c:Z

    .line 341
    .line 342
    if-eqz v12, :cond_13

    .line 343
    .line 344
    :cond_12
    move/from16 v12, v18

    .line 345
    .line 346
    goto :goto_6

    .line 347
    :cond_13
    const/4 v12, 0x0

    .line 348
    :goto_6
    iget-object v13, v4, Lzz;->U:[Lyz;

    .line 349
    .line 350
    aget-object v13, v13, v18

    .line 351
    .line 352
    if-ne v13, v9, :cond_16

    .line 353
    .line 354
    if-eqz v7, :cond_14

    .line 355
    .line 356
    goto :goto_7

    .line 357
    :cond_14
    if-ne v13, v9, :cond_f

    .line 358
    .line 359
    iget v3, v4, Lzz;->y:I

    .line 360
    .line 361
    if-ltz v3, :cond_f

    .line 362
    .line 363
    iget v3, v4, Lzz;->x:I

    .line 364
    .line 365
    if-ltz v3, :cond_f

    .line 366
    .line 367
    iget v3, v4, Lzz;->i0:I

    .line 368
    .line 369
    if-eq v3, v8, :cond_15

    .line 370
    .line 371
    iget v3, v4, Lzz;->s:I

    .line 372
    .line 373
    if-nez v3, :cond_f

    .line 374
    .line 375
    iget v3, v4, Lzz;->Y:F

    .line 376
    .line 377
    cmpl-float v3, v3, v16

    .line 378
    .line 379
    if-nez v3, :cond_f

    .line 380
    .line 381
    :cond_15
    invoke-virtual {v4}, Lzz;->z()Z

    .line 382
    .line 383
    .line 384
    move-result v3

    .line 385
    if-nez v3, :cond_f

    .line 386
    .line 387
    iget-boolean v3, v4, Lzz;->G:Z

    .line 388
    .line 389
    if-nez v3, :cond_f

    .line 390
    .line 391
    if-eqz v12, :cond_f

    .line 392
    .line 393
    invoke-virtual {v4}, Lzz;->z()Z

    .line 394
    .line 395
    .line 396
    move-result v3

    .line 397
    if-nez v3, :cond_f

    .line 398
    .line 399
    invoke-static {v6, v1, v0, v4}, Lyy1;->J(ILzz;Lxi;Lzz;)V

    .line 400
    .line 401
    .line 402
    goto :goto_5

    .line 403
    :cond_16
    :goto_7
    invoke-virtual {v4}, Lzz;->A()Z

    .line 404
    .line 405
    .line 406
    move-result v7

    .line 407
    if-eqz v7, :cond_17

    .line 408
    .line 409
    goto :goto_5

    .line 410
    :cond_17
    if-ne v3, v10, :cond_18

    .line 411
    .line 412
    iget-object v7, v11, Loz;->f:Loz;

    .line 413
    .line 414
    if-nez v7, :cond_18

    .line 415
    .line 416
    invoke-virtual {v10}, Loz;->e()I

    .line 417
    .line 418
    .line 419
    move-result v3

    .line 420
    add-int/2addr v3, v5

    .line 421
    invoke-virtual {v4}, Lzz;->l()I

    .line 422
    .line 423
    .line 424
    move-result v7

    .line 425
    add-int/2addr v7, v3

    .line 426
    invoke-virtual {v4, v3, v7}, Lzz;->L(II)V

    .line 427
    .line 428
    .line 429
    invoke-static {v6, v0, v4}, Lyy1;->N(ILxi;Lzz;)V

    .line 430
    .line 431
    .line 432
    goto/16 :goto_5

    .line 433
    .line 434
    :cond_18
    if-ne v3, v11, :cond_19

    .line 435
    .line 436
    iget-object v3, v10, Loz;->f:Loz;

    .line 437
    .line 438
    if-nez v3, :cond_19

    .line 439
    .line 440
    invoke-virtual {v11}, Loz;->e()I

    .line 441
    .line 442
    .line 443
    move-result v3

    .line 444
    sub-int v3, v5, v3

    .line 445
    .line 446
    invoke-virtual {v4}, Lzz;->l()I

    .line 447
    .line 448
    .line 449
    move-result v7

    .line 450
    sub-int v7, v3, v7

    .line 451
    .line 452
    invoke-virtual {v4, v7, v3}, Lzz;->L(II)V

    .line 453
    .line 454
    .line 455
    invoke-static {v6, v0, v4}, Lyy1;->N(ILxi;Lzz;)V

    .line 456
    .line 457
    .line 458
    goto/16 :goto_5

    .line 459
    .line 460
    :cond_19
    if-eqz v12, :cond_f

    .line 461
    .line 462
    invoke-virtual {v4}, Lzz;->z()Z

    .line 463
    .line 464
    .line 465
    move-result v3

    .line 466
    if-nez v3, :cond_f

    .line 467
    .line 468
    invoke-static {v6, v0, v4}, Lyy1;->I(ILxi;Lzz;)V

    .line 469
    .line 470
    .line 471
    goto/16 :goto_5

    .line 472
    .line 473
    :cond_1a
    const/4 v2, 0x6

    .line 474
    invoke-virtual {v1, v2}, Lzz;->j(I)Loz;

    .line 475
    .line 476
    .line 477
    move-result-object v2

    .line 478
    iget-object v3, v2, Loz;->a:Ljava/util/HashSet;

    .line 479
    .line 480
    if-eqz v3, :cond_20

    .line 481
    .line 482
    iget-boolean v3, v2, Loz;->c:Z

    .line 483
    .line 484
    if-eqz v3, :cond_20

    .line 485
    .line 486
    invoke-virtual {v2}, Loz;->d()I

    .line 487
    .line 488
    .line 489
    move-result v3

    .line 490
    iget-object v2, v2, Loz;->a:Ljava/util/HashSet;

    .line 491
    .line 492
    invoke-virtual {v2}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    .line 493
    .line 494
    .line 495
    move-result-object v2

    .line 496
    :goto_8
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 497
    .line 498
    .line 499
    move-result v4

    .line 500
    if-eqz v4, :cond_20

    .line 501
    .line 502
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 503
    .line 504
    .line 505
    move-result-object v4

    .line 506
    check-cast v4, Loz;

    .line 507
    .line 508
    iget-object v5, v4, Loz;->d:Lzz;

    .line 509
    .line 510
    add-int/lit8 v11, p0, 0x1

    .line 511
    .line 512
    invoke-static {v5}, Lyy1;->d(Lzz;)Z

    .line 513
    .line 514
    .line 515
    move-result v6

    .line 516
    iget-object v7, v5, Lzz;->N:Loz;

    .line 517
    .line 518
    invoke-virtual {v5}, Lzz;->A()Z

    .line 519
    .line 520
    .line 521
    move-result v8

    .line 522
    if-eqz v8, :cond_1b

    .line 523
    .line 524
    if-eqz v6, :cond_1b

    .line 525
    .line 526
    new-instance v8, Lwi;

    .line 527
    .line 528
    invoke-direct {v8}, Ljava/lang/Object;-><init>()V

    .line 529
    .line 530
    .line 531
    invoke-static {v5, v0, v8}, La00;->W(Lzz;Lxi;Lwi;)V

    .line 532
    .line 533
    .line 534
    :cond_1b
    iget-object v8, v5, Lzz;->U:[Lyz;

    .line 535
    .line 536
    aget-object v8, v8, v18

    .line 537
    .line 538
    if-ne v8, v9, :cond_1d

    .line 539
    .line 540
    if-eqz v6, :cond_1c

    .line 541
    .line 542
    goto :goto_9

    .line 543
    :cond_1c
    move/from16 v4, v18

    .line 544
    .line 545
    goto :goto_b

    .line 546
    :cond_1d
    :goto_9
    invoke-virtual {v5}, Lzz;->A()Z

    .line 547
    .line 548
    .line 549
    move-result v6

    .line 550
    if-eqz v6, :cond_1e

    .line 551
    .line 552
    goto :goto_8

    .line 553
    :cond_1e
    if-ne v4, v7, :cond_1c

    .line 554
    .line 555
    invoke-virtual {v4}, Loz;->e()I

    .line 556
    .line 557
    .line 558
    move-result v4

    .line 559
    add-int/2addr v4, v3

    .line 560
    iget-boolean v6, v5, Lzz;->E:Z

    .line 561
    .line 562
    if-nez v6, :cond_1f

    .line 563
    .line 564
    move/from16 v4, v18

    .line 565
    .line 566
    goto :goto_a

    .line 567
    :cond_1f
    iget v6, v5, Lzz;->c0:I

    .line 568
    .line 569
    sub-int v6, v4, v6

    .line 570
    .line 571
    iget v8, v5, Lzz;->X:I

    .line 572
    .line 573
    add-int/2addr v8, v6

    .line 574
    iput v6, v5, Lzz;->b0:I

    .line 575
    .line 576
    iget-object v10, v5, Lzz;->K:Loz;

    .line 577
    .line 578
    invoke-virtual {v10, v6}, Loz;->l(I)V

    .line 579
    .line 580
    .line 581
    iget-object v6, v5, Lzz;->M:Loz;

    .line 582
    .line 583
    invoke-virtual {v6, v8}, Loz;->l(I)V

    .line 584
    .line 585
    .line 586
    invoke-virtual {v7, v4}, Loz;->l(I)V

    .line 587
    .line 588
    .line 589
    move/from16 v4, v18

    .line 590
    .line 591
    iput-boolean v4, v5, Lzz;->l:Z

    .line 592
    .line 593
    :goto_a
    invoke-static {v11, v0, v5}, Lyy1;->N(ILxi;Lzz;)V

    .line 594
    .line 595
    .line 596
    :goto_b
    move/from16 v18, v4

    .line 597
    .line 598
    goto :goto_8

    .line 599
    :cond_20
    move/from16 v4, v18

    .line 600
    .line 601
    iput-boolean v4, v1, Lzz;->n:Z

    .line 602
    .line 603
    return-void
.end method

.method public static O(Landroid/content/Context;)Ljava/lang/String;
    .locals 2

    .line 1
    :try_start_0
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    sget v1, Lcom/google/android/gms/common/R$string;->common_google_play_services_unknown_issue:I

    .line 6
    .line 7
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getResourcePackageName(I)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object p0
    :try_end_0
    .catch Landroid/content/res/Resources$NotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 11
    return-object p0

    .line 12
    :catch_0
    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    return-object p0
.end method

.method public static final a(Ljava/util/List;Lk40;Ld10;)Ljava/lang/Object;
    .locals 6

    .line 1
    instance-of v0, p2, Le40;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, Le40;

    .line 7
    .line 8
    iget v1, v0, Le40;->d:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Le40;->d:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Le40;

    .line 21
    .line 22
    invoke-direct {v0, p2}, Ld10;-><init>(Lc10;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, Le40;->c:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, Lz10;->a:Lz10;

    .line 28
    .line 29
    iget v2, v0, Le40;->d:I

    .line 30
    .line 31
    const/4 v3, 0x0

    .line 32
    const/4 v4, 0x2

    .line 33
    const/4 v5, 0x1

    .line 34
    if-eqz v2, :cond_3

    .line 35
    .line 36
    if-eq v2, v5, :cond_2

    .line 37
    .line 38
    if-ne v2, v4, :cond_1

    .line 39
    .line 40
    iget-object p0, v0, Le40;->b:Ljava/util/Iterator;

    .line 41
    .line 42
    iget-object p1, v0, Le40;->a:Ljava/io/Serializable;

    .line 43
    .line 44
    check-cast p1, Lh22;

    .line 45
    .line 46
    :try_start_0
    invoke-static {p2}, Lpg3;->A(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 47
    .line 48
    .line 49
    goto :goto_2

    .line 50
    :catchall_0
    move-exception p2

    .line 51
    goto :goto_3

    .line 52
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 53
    .line 54
    invoke-static {p0}, Lf42;->l(Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    return-object v3

    .line 58
    :cond_2
    iget-object p0, v0, Le40;->a:Ljava/io/Serializable;

    .line 59
    .line 60
    check-cast p0, Ljava/util/List;

    .line 61
    .line 62
    invoke-static {p2}, Lpg3;->A(Ljava/lang/Object;)V

    .line 63
    .line 64
    .line 65
    goto :goto_1

    .line 66
    :cond_3
    invoke-static {p2}, Lpg3;->A(Ljava/lang/Object;)V

    .line 67
    .line 68
    .line 69
    new-instance p2, Ljava/util/ArrayList;

    .line 70
    .line 71
    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    .line 72
    .line 73
    .line 74
    new-instance v2, Lg40;

    .line 75
    .line 76
    invoke-direct {v2, p0, p2, v3}, Lg40;-><init>(Ljava/util/List;Ljava/util/ArrayList;Lc10;)V

    .line 77
    .line 78
    .line 79
    iput-object p2, v0, Le40;->a:Ljava/io/Serializable;

    .line 80
    .line 81
    iput v5, v0, Le40;->d:I

    .line 82
    .line 83
    invoke-virtual {p1, v2, v0}, Lk40;->a(Lg40;Ld10;)Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    move-result-object p0

    .line 87
    if-ne p0, v1, :cond_4

    .line 88
    .line 89
    goto :goto_4

    .line 90
    :cond_4
    move-object p0, p2

    .line 91
    :goto_1
    new-instance p1, Lh22;

    .line 92
    .line 93
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 94
    .line 95
    .line 96
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 97
    .line 98
    .line 99
    move-result-object p0

    .line 100
    :cond_5
    :goto_2
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 101
    .line 102
    .line 103
    move-result p2

    .line 104
    if-eqz p2, :cond_7

    .line 105
    .line 106
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 107
    .line 108
    .line 109
    move-result-object p2

    .line 110
    check-cast p2, Lkotlin/jvm/functions/Function1;

    .line 111
    .line 112
    :try_start_1
    iput-object p1, v0, Le40;->a:Ljava/io/Serializable;

    .line 113
    .line 114
    iput-object p0, v0, Le40;->b:Ljava/util/Iterator;

    .line 115
    .line 116
    iput v4, v0, Le40;->d:I

    .line 117
    .line 118
    invoke-interface {p2, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 119
    .line 120
    .line 121
    move-result-object p2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 122
    if-ne p2, v1, :cond_5

    .line 123
    .line 124
    goto :goto_4

    .line 125
    :goto_3
    iget-object v2, p1, Lh22;->a:Ljava/lang/Object;

    .line 126
    .line 127
    if-nez v2, :cond_6

    .line 128
    .line 129
    iput-object p2, p1, Lh22;->a:Ljava/lang/Object;

    .line 130
    .line 131
    goto :goto_2

    .line 132
    :cond_6
    check-cast v2, Ljava/lang/Throwable;

    .line 133
    .line 134
    invoke-static {v2, p2}, Ljf0;->a(Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    .line 135
    .line 136
    .line 137
    goto :goto_2

    .line 138
    :cond_7
    iget-object p0, p1, Lh22;->a:Ljava/lang/Object;

    .line 139
    .line 140
    check-cast p0, Ljava/lang/Throwable;

    .line 141
    .line 142
    if-nez p0, :cond_8

    .line 143
    .line 144
    sget-object v1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 145
    .line 146
    :goto_4
    return-object v1

    .line 147
    :cond_8
    throw p0
.end method

.method public static b(IILjava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 1
    if-gez p0, :cond_0

    .line 2
    .line 3
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    filled-new-array {p2, p0}, [Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    const-string p1, "%s (%s) must not be negative"

    .line 12
    .line 13
    invoke-static {p1, p0}, Li13;->x(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0

    .line 18
    :cond_0
    if-ltz p1, :cond_1

    .line 19
    .line 20
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    filled-new-array {p2, p0, p1}, [Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    const-string p1, "%s (%s) must not be greater than size (%s)"

    .line 33
    .line 34
    invoke-static {p1, p0}, Li13;->x(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    return-object p0

    .line 39
    :cond_1
    const/16 p0, 0x1a

    .line 40
    .line 41
    const-string p2, "negative size: "

    .line 42
    .line 43
    invoke-static {p0, p2, p1}, Lds0;->f(ILjava/lang/Object;I)V

    .line 44
    .line 45
    .line 46
    const/4 p0, 0x0

    .line 47
    return-object p0
.end method

.method public static c(Ljava/util/HashMap;)Lkn;
    .locals 13

    .line 1
    const-string v0, "firstEventId"

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    instance-of v1, v0, Ljava/lang/String;

    .line 8
    .line 9
    const/4 v2, 0x0

    .line 10
    if-nez v1, :cond_0

    .line 11
    .line 12
    goto :goto_1

    .line 13
    :cond_0
    const-string v1, "firstEventTimestamp"

    .line 14
    .line 15
    invoke-virtual {p0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    instance-of v3, v1, Ljava/lang/String;

    .line 20
    .line 21
    if-nez v3, :cond_1

    .line 22
    .line 23
    goto :goto_1

    .line 24
    :cond_1
    const-string v3, "sessionId"

    .line 25
    .line 26
    invoke-virtual {p0, v3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v3

    .line 30
    instance-of v4, v3, Ljava/lang/String;

    .line 31
    .line 32
    if-nez v4, :cond_2

    .line 33
    .line 34
    goto :goto_1

    .line 35
    :cond_2
    const-string v4, "previousSessionId"

    .line 36
    .line 37
    invoke-virtual {p0, v4}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v4

    .line 41
    instance-of v5, v4, Ljava/lang/String;

    .line 42
    .line 43
    if-nez v5, :cond_3

    .line 44
    .line 45
    move-object v4, v2

    .line 46
    :cond_3
    instance-of v5, v4, Ljava/lang/String;

    .line 47
    .line 48
    if-eqz v5, :cond_4

    .line 49
    .line 50
    check-cast v4, Ljava/lang/String;

    .line 51
    .line 52
    move-object v9, v4

    .line 53
    goto :goto_0

    .line 54
    :cond_4
    move-object v9, v2

    .line 55
    :goto_0
    const-string v4, "sessionIndex"

    .line 56
    .line 57
    invoke-virtual {p0, v4}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object v4

    .line 61
    instance-of v5, v4, Ljava/lang/Integer;

    .line 62
    .line 63
    if-nez v5, :cond_5

    .line 64
    .line 65
    goto :goto_1

    .line 66
    :cond_5
    const-string v5, "userId"

    .line 67
    .line 68
    invoke-virtual {p0, v5}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object v5

    .line 72
    instance-of v6, v5, Ljava/lang/String;

    .line 73
    .line 74
    if-nez v6, :cond_6

    .line 75
    .line 76
    goto :goto_1

    .line 77
    :cond_6
    const-string v6, "storageMechanism"

    .line 78
    .line 79
    invoke-virtual {p0, v6}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    move-result-object p0

    .line 83
    instance-of v6, p0, Ljava/lang/String;

    .line 84
    .line 85
    if-nez v6, :cond_7

    .line 86
    .line 87
    :goto_1
    return-object v2

    .line 88
    :cond_7
    move-object v2, v5

    .line 89
    new-instance v5, Lkn;

    .line 90
    .line 91
    move-object v6, v0

    .line 92
    check-cast v6, Ljava/lang/String;

    .line 93
    .line 94
    move-object v7, v1

    .line 95
    check-cast v7, Ljava/lang/String;

    .line 96
    .line 97
    move-object v8, v3

    .line 98
    check-cast v8, Ljava/lang/String;

    .line 99
    .line 100
    check-cast v4, Ljava/lang/Number;

    .line 101
    .line 102
    invoke-virtual {v4}, Ljava/lang/Number;->intValue()I

    .line 103
    .line 104
    .line 105
    move-result v10

    .line 106
    move-object v11, v2

    .line 107
    check-cast v11, Ljava/lang/String;

    .line 108
    .line 109
    move-object v12, p0

    .line 110
    check-cast v12, Ljava/lang/String;

    .line 111
    .line 112
    invoke-direct/range {v5 .. v12}, Lkn;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V

    .line 113
    .line 114
    .line 115
    return-object v5
.end method

.method public static d(Lzz;)Z
    .locals 9

    .line 1
    iget-object v0, p0, Lzz;->U:[Lyz;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    aget-object v2, v0, v1

    .line 5
    .line 6
    const/4 v3, 0x1

    .line 7
    aget-object v0, v0, v3

    .line 8
    .line 9
    iget-object v4, p0, Lzz;->V:Lzz;

    .line 10
    .line 11
    if-eqz v4, :cond_0

    .line 12
    .line 13
    check-cast v4, La00;

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    const/4 v4, 0x0

    .line 17
    :goto_0
    sget-object v5, Lyz;->a:Lyz;

    .line 18
    .line 19
    if-eqz v4, :cond_1

    .line 20
    .line 21
    iget-object v6, v4, Lzz;->U:[Lyz;

    .line 22
    .line 23
    aget-object v6, v6, v1

    .line 24
    .line 25
    :cond_1
    if-eqz v4, :cond_2

    .line 26
    .line 27
    iget-object v4, v4, Lzz;->U:[Lyz;

    .line 28
    .line 29
    aget-object v4, v4, v3

    .line 30
    .line 31
    :cond_2
    sget-object v4, Lyz;->c:Lyz;

    .line 32
    .line 33
    sget-object v6, Lyz;->b:Lyz;

    .line 34
    .line 35
    const/4 v7, 0x0

    .line 36
    if-eq v2, v5, :cond_5

    .line 37
    .line 38
    invoke-virtual {p0}, Lzz;->B()Z

    .line 39
    .line 40
    .line 41
    move-result v8

    .line 42
    if-nez v8, :cond_5

    .line 43
    .line 44
    if-eq v2, v6, :cond_5

    .line 45
    .line 46
    if-ne v2, v4, :cond_3

    .line 47
    .line 48
    iget v8, p0, Lzz;->r:I

    .line 49
    .line 50
    if-nez v8, :cond_3

    .line 51
    .line 52
    iget v8, p0, Lzz;->Y:F

    .line 53
    .line 54
    cmpl-float v8, v8, v7

    .line 55
    .line 56
    if-nez v8, :cond_3

    .line 57
    .line 58
    invoke-virtual {p0, v1}, Lzz;->u(I)Z

    .line 59
    .line 60
    .line 61
    move-result v8

    .line 62
    if-nez v8, :cond_5

    .line 63
    .line 64
    :cond_3
    if-ne v2, v4, :cond_4

    .line 65
    .line 66
    iget v2, p0, Lzz;->r:I

    .line 67
    .line 68
    if-ne v2, v3, :cond_4

    .line 69
    .line 70
    invoke-virtual {p0}, Lzz;->r()I

    .line 71
    .line 72
    .line 73
    move-result v2

    .line 74
    invoke-virtual {p0, v1, v2}, Lzz;->v(II)Z

    .line 75
    .line 76
    .line 77
    move-result v2

    .line 78
    if-eqz v2, :cond_4

    .line 79
    .line 80
    goto :goto_1

    .line 81
    :cond_4
    move v2, v1

    .line 82
    goto :goto_2

    .line 83
    :cond_5
    :goto_1
    move v2, v3

    .line 84
    :goto_2
    if-eq v0, v5, :cond_8

    .line 85
    .line 86
    invoke-virtual {p0}, Lzz;->C()Z

    .line 87
    .line 88
    .line 89
    move-result v5

    .line 90
    if-nez v5, :cond_8

    .line 91
    .line 92
    if-eq v0, v6, :cond_8

    .line 93
    .line 94
    if-ne v0, v4, :cond_6

    .line 95
    .line 96
    iget v5, p0, Lzz;->s:I

    .line 97
    .line 98
    if-nez v5, :cond_6

    .line 99
    .line 100
    iget v5, p0, Lzz;->Y:F

    .line 101
    .line 102
    cmpl-float v5, v5, v7

    .line 103
    .line 104
    if-nez v5, :cond_6

    .line 105
    .line 106
    invoke-virtual {p0, v3}, Lzz;->u(I)Z

    .line 107
    .line 108
    .line 109
    move-result v5

    .line 110
    if-nez v5, :cond_8

    .line 111
    .line 112
    :cond_6
    if-ne v0, v4, :cond_7

    .line 113
    .line 114
    iget v0, p0, Lzz;->s:I

    .line 115
    .line 116
    if-ne v0, v3, :cond_7

    .line 117
    .line 118
    invoke-virtual {p0}, Lzz;->l()I

    .line 119
    .line 120
    .line 121
    move-result v0

    .line 122
    invoke-virtual {p0, v3, v0}, Lzz;->v(II)Z

    .line 123
    .line 124
    .line 125
    move-result v0

    .line 126
    if-eqz v0, :cond_7

    .line 127
    .line 128
    goto :goto_3

    .line 129
    :cond_7
    move v0, v1

    .line 130
    goto :goto_4

    .line 131
    :cond_8
    :goto_3
    move v0, v3

    .line 132
    :goto_4
    iget p0, p0, Lzz;->Y:F

    .line 133
    .line 134
    cmpl-float p0, p0, v7

    .line 135
    .line 136
    if-lez p0, :cond_9

    .line 137
    .line 138
    if-nez v2, :cond_a

    .line 139
    .line 140
    if-eqz v0, :cond_9

    .line 141
    .line 142
    goto :goto_5

    .line 143
    :cond_9
    if-eqz v2, :cond_b

    .line 144
    .line 145
    if-eqz v0, :cond_b

    .line 146
    .line 147
    :cond_a
    :goto_5
    return v3

    .line 148
    :cond_b
    return v1
.end method

.method public static h(Landroid/content/Context;)V
    .locals 2

    .line 1
    sget-object v0, Lyy1;->d:Lg63;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Lg63;

    .line 6
    .line 7
    invoke-direct {v0, p0}, Lg63;-><init>(Landroid/content/Context;)V

    .line 8
    .line 9
    .line 10
    sput-object v0, Lyy1;->d:Lg63;

    .line 11
    .line 12
    iget-object p0, v0, Lg63;->a:Ljava/lang/Object;

    .line 13
    .line 14
    monitor-enter p0

    .line 15
    const/4 v1, 0x1

    .line 16
    :try_start_0
    iput-boolean v1, v0, Lg63;->g:Z

    .line 17
    .line 18
    monitor-exit p0

    .line 19
    return-void

    .line 20
    :catchall_0
    move-exception v0

    .line 21
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 22
    throw v0

    .line 23
    :cond_0
    return-void
.end method

.method public static i(II)V
    .locals 2

    .line 1
    if-ltz p0, :cond_1

    .line 2
    .line 3
    if-lt p0, p1, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    return-void

    .line 7
    :cond_1
    :goto_0
    new-instance v0, Ljava/lang/IndexOutOfBoundsException;

    .line 8
    .line 9
    const-string v1, "index"

    .line 10
    .line 11
    if-ltz p0, :cond_3

    .line 12
    .line 13
    if-gez p1, :cond_2

    .line 14
    .line 15
    const/16 p0, 0x1a

    .line 16
    .line 17
    const-string v0, "negative size: "

    .line 18
    .line 19
    invoke-static {p0, v0, p1}, Lds0;->f(ILjava/lang/Object;I)V

    .line 20
    .line 21
    .line 22
    return-void

    .line 23
    :cond_2
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    filled-new-array {v1, p0, p1}, [Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    const-string p1, "%s (%s) must be less than size (%s)"

    .line 36
    .line 37
    invoke-static {p1, p0}, Li13;->x(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    goto :goto_1

    .line 42
    :cond_3
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 43
    .line 44
    .line 45
    move-result-object p0

    .line 46
    filled-new-array {v1, p0}, [Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object p0

    .line 50
    const-string p1, "%s (%s) must not be negative"

    .line 51
    .line 52
    invoke-static {p1, p0}, Li13;->x(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object p0

    .line 56
    :goto_1
    invoke-direct {v0, p0}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    throw v0
.end method

.method public static j(II)V
    .locals 1

    .line 1
    if-ltz p0, :cond_0

    .line 2
    .line 3
    if-gt p0, p1, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    const-string v0, "index"

    .line 7
    .line 8
    invoke-static {p0, p1, v0}, Lyy1;->b(IILjava/lang/String;)Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    invoke-static {p0}, Ls80;->f(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public static k(III)V
    .locals 1

    .line 1
    if-ltz p0, :cond_1

    .line 2
    .line 3
    if-lt p1, p0, :cond_1

    .line 4
    .line 5
    if-le p1, p2, :cond_0

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    return-void

    .line 9
    :cond_1
    :goto_0
    new-instance v0, Ljava/lang/IndexOutOfBoundsException;

    .line 10
    .line 11
    if-ltz p0, :cond_4

    .line 12
    .line 13
    if-gt p0, p2, :cond_4

    .line 14
    .line 15
    if-ltz p1, :cond_3

    .line 16
    .line 17
    if-le p1, p2, :cond_2

    .line 18
    .line 19
    goto :goto_1

    .line 20
    :cond_2
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    filled-new-array {p1, p0}, [Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    const-string p1, "end index (%s) must not be less than start index (%s)"

    .line 33
    .line 34
    invoke-static {p1, p0}, Li13;->x(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    goto :goto_2

    .line 39
    :cond_3
    :goto_1
    const-string p0, "end index"

    .line 40
    .line 41
    invoke-static {p1, p2, p0}, Lyy1;->b(IILjava/lang/String;)Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object p0

    .line 45
    goto :goto_2

    .line 46
    :cond_4
    const-string p1, "start index"

    .line 47
    .line 48
    invoke-static {p0, p2, p1}, Lyy1;->b(IILjava/lang/String;)Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object p0

    .line 52
    :goto_2
    invoke-direct {v0, p0}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    throw v0
.end method

.method public static l(Landroid/content/Intent;)V
    .locals 3

    .line 1
    sget-object v0, Lyy1;->c:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    sget-object v1, Lyy1;->d:Lg63;

    .line 5
    .line 6
    if-eqz v1, :cond_0

    .line 7
    .line 8
    const-string v1, "com.google.firebase.iid.WakeLockHolder.wakefulintent"

    .line 9
    .line 10
    const/4 v2, 0x0

    .line 11
    invoke-virtual {p0, v1, v2}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-eqz v1, :cond_0

    .line 16
    .line 17
    const-string v1, "com.google.firebase.iid.WakeLockHolder.wakefulintent"

    .line 18
    .line 19
    invoke-virtual {p0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 20
    .line 21
    .line 22
    sget-object p0, Lyy1;->d:Lg63;

    .line 23
    .line 24
    invoke-virtual {p0}, Lg63;->c()V

    .line 25
    .line 26
    .line 27
    goto :goto_0

    .line 28
    :catchall_0
    move-exception p0

    .line 29
    goto :goto_1

    .line 30
    :cond_0
    :goto_0
    monitor-exit v0

    .line 31
    return-void

    .line 32
    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 33
    throw p0
.end method

.method public static m(Ljava/lang/String;)V
    .locals 5

    .line 1
    new-instance v0, Ljava/io/File;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    .line 7
    .line 8
    .line 9
    move-result p0

    .line 10
    if-nez p0, :cond_0

    .line 11
    .line 12
    return-void

    .line 13
    :cond_0
    invoke-virtual {v0}, Ljava/io/File;->listFiles()[Ljava/io/File;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    if-eqz p0, :cond_4

    .line 18
    .line 19
    array-length v1, p0

    .line 20
    if-nez v1, :cond_1

    .line 21
    .line 22
    goto :goto_1

    .line 23
    :cond_1
    array-length v1, p0

    .line 24
    const/4 v2, 0x0

    .line 25
    :goto_0
    if-ge v2, v1, :cond_3

    .line 26
    .line 27
    aget-object v3, p0, v2

    .line 28
    .line 29
    invoke-virtual {v3}, Ljava/io/File;->isDirectory()Z

    .line 30
    .line 31
    .line 32
    move-result v4

    .line 33
    if-eqz v4, :cond_2

    .line 34
    .line 35
    invoke-virtual {v3}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object v4

    .line 39
    invoke-static {v4}, Lyy1;->m(Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    :cond_2
    invoke-virtual {v3}, Ljava/io/File;->delete()Z

    .line 43
    .line 44
    .line 45
    add-int/lit8 v2, v2, 0x1

    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_3
    invoke-virtual {v0}, Ljava/io/File;->delete()Z

    .line 49
    .line 50
    .line 51
    return-void

    .line 52
    :cond_4
    :goto_1
    invoke-virtual {v0}, Ljava/io/File;->delete()Z

    .line 53
    .line 54
    .line 55
    return-void
.end method

.method public static final n(FLandroid/content/Context;)F
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    invoke-virtual {p1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    iget p1, p1, Landroid/util/DisplayMetrics;->density:F

    .line 13
    .line 14
    mul-float/2addr p0, p1

    .line 15
    return p0
.end method

.method public static final o(Landroid/content/Context;I)I
    .locals 0

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    int-to-float p1, p1

    .line 5
    invoke-static {p1, p0}, Lyy1;->n(FLandroid/content/Context;)F

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    float-to-int p0, p0

    .line 10
    return p0
.end method

.method public static final p(Ljava/util/List;)Ljava/util/Collection;
    .locals 2

    .line 1
    invoke-interface {p0}, Ljava/util/Collection;->isEmpty()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x1

    .line 6
    if-ne v0, v1, :cond_0

    .line 7
    .line 8
    const/4 p0, 0x0

    .line 9
    :cond_0
    return-object p0
.end method

.method public static q(Lvl;)Ljava/lang/String;
    .locals 5

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-virtual {p0}, Lvl;->size()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 8
    .line 9
    .line 10
    const/4 v1, 0x0

    .line 11
    :goto_0
    invoke-virtual {p0}, Lvl;->size()I

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    if-ge v1, v2, :cond_4

    .line 16
    .line 17
    invoke-virtual {p0, v1}, Lvl;->a(I)B

    .line 18
    .line 19
    .line 20
    move-result v2

    .line 21
    const/16 v3, 0x22

    .line 22
    .line 23
    if-eq v2, v3, :cond_3

    .line 24
    .line 25
    const/16 v3, 0x27

    .line 26
    .line 27
    if-eq v2, v3, :cond_2

    .line 28
    .line 29
    const/16 v3, 0x5c

    .line 30
    .line 31
    if-eq v2, v3, :cond_1

    .line 32
    .line 33
    packed-switch v2, :pswitch_data_0

    .line 34
    .line 35
    .line 36
    const/16 v4, 0x20

    .line 37
    .line 38
    if-lt v2, v4, :cond_0

    .line 39
    .line 40
    const/16 v4, 0x7e

    .line 41
    .line 42
    if-gt v2, v4, :cond_0

    .line 43
    .line 44
    int-to-char v2, v2

    .line 45
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    goto :goto_1

    .line 49
    :cond_0
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 50
    .line 51
    .line 52
    ushr-int/lit8 v3, v2, 0x6

    .line 53
    .line 54
    and-int/lit8 v3, v3, 0x3

    .line 55
    .line 56
    add-int/lit8 v3, v3, 0x30

    .line 57
    .line 58
    int-to-char v3, v3

    .line 59
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 60
    .line 61
    .line 62
    ushr-int/lit8 v3, v2, 0x3

    .line 63
    .line 64
    and-int/lit8 v3, v3, 0x7

    .line 65
    .line 66
    add-int/lit8 v3, v3, 0x30

    .line 67
    .line 68
    int-to-char v3, v3

    .line 69
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 70
    .line 71
    .line 72
    and-int/lit8 v2, v2, 0x7

    .line 73
    .line 74
    add-int/lit8 v2, v2, 0x30

    .line 75
    .line 76
    int-to-char v2, v2

    .line 77
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 78
    .line 79
    .line 80
    goto :goto_1

    .line 81
    :pswitch_0
    const-string v2, "\\r"

    .line 82
    .line 83
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 84
    .line 85
    .line 86
    goto :goto_1

    .line 87
    :pswitch_1
    const-string v2, "\\f"

    .line 88
    .line 89
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 90
    .line 91
    .line 92
    goto :goto_1

    .line 93
    :pswitch_2
    const-string v2, "\\v"

    .line 94
    .line 95
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 96
    .line 97
    .line 98
    goto :goto_1

    .line 99
    :pswitch_3
    const-string v2, "\\n"

    .line 100
    .line 101
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 102
    .line 103
    .line 104
    goto :goto_1

    .line 105
    :pswitch_4
    const-string v2, "\\t"

    .line 106
    .line 107
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 108
    .line 109
    .line 110
    goto :goto_1

    .line 111
    :pswitch_5
    const-string v2, "\\b"

    .line 112
    .line 113
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 114
    .line 115
    .line 116
    goto :goto_1

    .line 117
    :pswitch_6
    const-string v2, "\\a"

    .line 118
    .line 119
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 120
    .line 121
    .line 122
    goto :goto_1

    .line 123
    :cond_1
    const-string v2, "\\\\"

    .line 124
    .line 125
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 126
    .line 127
    .line 128
    goto :goto_1

    .line 129
    :cond_2
    const-string v2, "\\\'"

    .line 130
    .line 131
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 132
    .line 133
    .line 134
    goto :goto_1

    .line 135
    :cond_3
    const-string v2, "\\\""

    .line 136
    .line 137
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 138
    .line 139
    .line 140
    :goto_1
    add-int/lit8 v1, v1, 0x1

    .line 141
    .line 142
    goto/16 :goto_0

    .line 143
    .line 144
    :cond_4
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 145
    .line 146
    .line 147
    move-result-object p0

    .line 148
    return-object p0

    .line 149
    :pswitch_data_0
    .packed-switch 0x7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public static final r(Ljava/lang/Iterable;)Ljava/util/ArrayList;
    .locals 3

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/ArrayList;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 7
    .line 8
    .line 9
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    :cond_0
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    if-eqz v1, :cond_1

    .line 18
    .line 19
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    check-cast v1, Ljava/lang/CharSequence;

    .line 24
    .line 25
    invoke-static {v1}, Lkotlin/text/StringsKt;->D(Ljava/lang/CharSequence;)Z

    .line 26
    .line 27
    .line 28
    move-result v2

    .line 29
    if-nez v2, :cond_0

    .line 30
    .line 31
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_1
    return-object v0
.end method

.method public static final s(Lo21;)Ljava/lang/Class;
    .locals 0

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    check-cast p0, Lbv;

    .line 5
    .line 6
    invoke-interface {p0}, Lbv;->a()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    return-object p0
.end method

.method public static final t(Lo21;)Ljava/lang/Class;
    .locals 2

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    check-cast p0, Lbv;

    .line 5
    .line 6
    invoke-interface {p0}, Lbv;->a()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    invoke-virtual {p0}, Ljava/lang/Class;->isPrimitive()Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    if-nez v0, :cond_0

    .line 15
    .line 16
    goto/16 :goto_0

    .line 17
    .line 18
    :cond_0
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    sparse-switch v1, :sswitch_data_0

    .line 27
    .line 28
    .line 29
    goto/16 :goto_0

    .line 30
    .line 31
    :sswitch_0
    const-string v1, "short"

    .line 32
    .line 33
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    if-nez v0, :cond_1

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_1
    const-class p0, Ljava/lang/Short;

    .line 41
    .line 42
    return-object p0

    .line 43
    :sswitch_1
    const-string v1, "float"

    .line 44
    .line 45
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 46
    .line 47
    .line 48
    move-result v0

    .line 49
    if-nez v0, :cond_2

    .line 50
    .line 51
    goto :goto_0

    .line 52
    :cond_2
    const-class p0, Ljava/lang/Float;

    .line 53
    .line 54
    return-object p0

    .line 55
    :sswitch_2
    const-string v1, "boolean"

    .line 56
    .line 57
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 58
    .line 59
    .line 60
    move-result v0

    .line 61
    if-nez v0, :cond_3

    .line 62
    .line 63
    goto :goto_0

    .line 64
    :cond_3
    const-class p0, Ljava/lang/Boolean;

    .line 65
    .line 66
    return-object p0

    .line 67
    :sswitch_3
    const-string v1, "void"

    .line 68
    .line 69
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 70
    .line 71
    .line 72
    move-result v0

    .line 73
    if-nez v0, :cond_4

    .line 74
    .line 75
    goto :goto_0

    .line 76
    :cond_4
    const-class p0, Ljava/lang/Void;

    .line 77
    .line 78
    return-object p0

    .line 79
    :sswitch_4
    const-string v1, "long"

    .line 80
    .line 81
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 82
    .line 83
    .line 84
    move-result v0

    .line 85
    if-nez v0, :cond_5

    .line 86
    .line 87
    goto :goto_0

    .line 88
    :cond_5
    const-class p0, Ljava/lang/Long;

    .line 89
    .line 90
    return-object p0

    .line 91
    :sswitch_5
    const-string v1, "char"

    .line 92
    .line 93
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 94
    .line 95
    .line 96
    move-result v0

    .line 97
    if-nez v0, :cond_6

    .line 98
    .line 99
    goto :goto_0

    .line 100
    :cond_6
    const-class p0, Ljava/lang/Character;

    .line 101
    .line 102
    return-object p0

    .line 103
    :sswitch_6
    const-string v1, "byte"

    .line 104
    .line 105
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 106
    .line 107
    .line 108
    move-result v0

    .line 109
    if-nez v0, :cond_7

    .line 110
    .line 111
    goto :goto_0

    .line 112
    :cond_7
    const-class p0, Ljava/lang/Byte;

    .line 113
    .line 114
    return-object p0

    .line 115
    :sswitch_7
    const-string v1, "int"

    .line 116
    .line 117
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 118
    .line 119
    .line 120
    move-result v0

    .line 121
    if-nez v0, :cond_8

    .line 122
    .line 123
    goto :goto_0

    .line 124
    :cond_8
    const-class p0, Ljava/lang/Integer;

    .line 125
    .line 126
    return-object p0

    .line 127
    :sswitch_8
    const-string v1, "double"

    .line 128
    .line 129
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 130
    .line 131
    .line 132
    move-result v0

    .line 133
    if-nez v0, :cond_9

    .line 134
    .line 135
    :goto_0
    return-object p0

    .line 136
    :cond_9
    const-class p0, Ljava/lang/Double;

    .line 137
    .line 138
    return-object p0

    .line 139
    :sswitch_data_0
    .sparse-switch
        -0x4f08842f -> :sswitch_8
        0x197ef -> :sswitch_7
        0x2e6108 -> :sswitch_6
        0x2e9356 -> :sswitch_5
        0x32c67c -> :sswitch_4
        0x375194 -> :sswitch_3
        0x3db6c28 -> :sswitch_2
        0x5d0225c -> :sswitch_1
        0x685847c -> :sswitch_0
    .end sparse-switch
.end method

.method public static v(ILxi;Lzz;Z)V
    .locals 19

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    move-object/from16 v1, p2

    .line 4
    .line 5
    move/from16 v2, p3

    .line 6
    .line 7
    iget-boolean v3, v1, Lzz;->m:Z

    .line 8
    .line 9
    if-eqz v3, :cond_0

    .line 10
    .line 11
    goto/16 :goto_4

    .line 12
    .line 13
    :cond_0
    instance-of v3, v1, La00;

    .line 14
    .line 15
    if-nez v3, :cond_1

    .line 16
    .line 17
    invoke-virtual {v1}, Lzz;->A()Z

    .line 18
    .line 19
    .line 20
    move-result v3

    .line 21
    if-eqz v3, :cond_1

    .line 22
    .line 23
    invoke-static {v1}, Lyy1;->d(Lzz;)Z

    .line 24
    .line 25
    .line 26
    move-result v3

    .line 27
    if-eqz v3, :cond_1

    .line 28
    .line 29
    new-instance v3, Lwi;

    .line 30
    .line 31
    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    .line 32
    .line 33
    .line 34
    invoke-static {v1, v0, v3}, La00;->W(Lzz;Lxi;Lwi;)V

    .line 35
    .line 36
    .line 37
    :cond_1
    const/4 v3, 0x2

    .line 38
    invoke-virtual {v1, v3}, Lzz;->j(I)Loz;

    .line 39
    .line 40
    .line 41
    move-result-object v3

    .line 42
    const/4 v4, 0x4

    .line 43
    invoke-virtual {v1, v4}, Lzz;->j(I)Loz;

    .line 44
    .line 45
    .line 46
    move-result-object v4

    .line 47
    invoke-virtual {v3}, Loz;->d()I

    .line 48
    .line 49
    .line 50
    move-result v5

    .line 51
    invoke-virtual {v4}, Loz;->d()I

    .line 52
    .line 53
    .line 54
    move-result v6

    .line 55
    iget-object v7, v3, Loz;->a:Ljava/util/HashSet;

    .line 56
    .line 57
    sget-object v10, Lyz;->c:Lyz;

    .line 58
    .line 59
    if-eqz v7, :cond_d

    .line 60
    .line 61
    iget-boolean v3, v3, Loz;->c:Z

    .line 62
    .line 63
    if-eqz v3, :cond_d

    .line 64
    .line 65
    invoke-virtual {v7}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    .line 66
    .line 67
    .line 68
    move-result-object v3

    .line 69
    :cond_2
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 70
    .line 71
    .line 72
    move-result v7

    .line 73
    if-eqz v7, :cond_d

    .line 74
    .line 75
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    move-result-object v7

    .line 79
    check-cast v7, Loz;

    .line 80
    .line 81
    iget-object v13, v7, Loz;->d:Lzz;

    .line 82
    .line 83
    add-int/lit8 v14, p0, 0x1

    .line 84
    .line 85
    invoke-static {v13}, Lyy1;->d(Lzz;)Z

    .line 86
    .line 87
    .line 88
    move-result v15

    .line 89
    const/16 v16, 0x0

    .line 90
    .line 91
    iget-object v8, v13, Lzz;->J:Loz;

    .line 92
    .line 93
    const/16 v17, 0x0

    .line 94
    .line 95
    iget-object v11, v13, Lzz;->L:Loz;

    .line 96
    .line 97
    invoke-virtual {v13}, Lzz;->A()Z

    .line 98
    .line 99
    .line 100
    move-result v18

    .line 101
    if-eqz v18, :cond_3

    .line 102
    .line 103
    if-eqz v15, :cond_3

    .line 104
    .line 105
    const/16 v18, 0x1

    .line 106
    .line 107
    new-instance v12, Lwi;

    .line 108
    .line 109
    invoke-direct {v12}, Ljava/lang/Object;-><init>()V

    .line 110
    .line 111
    .line 112
    invoke-static {v13, v0, v12}, La00;->W(Lzz;Lxi;Lwi;)V

    .line 113
    .line 114
    .line 115
    goto :goto_1

    .line 116
    :cond_3
    const/16 v18, 0x1

    .line 117
    .line 118
    :goto_1
    if-ne v7, v8, :cond_4

    .line 119
    .line 120
    iget-object v12, v11, Loz;->f:Loz;

    .line 121
    .line 122
    if-eqz v12, :cond_4

    .line 123
    .line 124
    iget-boolean v12, v12, Loz;->c:Z

    .line 125
    .line 126
    if-nez v12, :cond_5

    .line 127
    .line 128
    :cond_4
    if-ne v7, v11, :cond_6

    .line 129
    .line 130
    iget-object v12, v8, Loz;->f:Loz;

    .line 131
    .line 132
    if-eqz v12, :cond_6

    .line 133
    .line 134
    iget-boolean v12, v12, Loz;->c:Z

    .line 135
    .line 136
    if-eqz v12, :cond_6

    .line 137
    .line 138
    :cond_5
    move/from16 v12, v18

    .line 139
    .line 140
    goto :goto_2

    .line 141
    :cond_6
    move/from16 v12, v17

    .line 142
    .line 143
    :goto_2
    iget-object v9, v13, Lzz;->U:[Lyz;

    .line 144
    .line 145
    aget-object v9, v9, v17

    .line 146
    .line 147
    if-ne v9, v10, :cond_9

    .line 148
    .line 149
    if-eqz v15, :cond_7

    .line 150
    .line 151
    goto :goto_3

    .line 152
    :cond_7
    if-ne v9, v10, :cond_2

    .line 153
    .line 154
    iget v7, v13, Lzz;->v:I

    .line 155
    .line 156
    if-ltz v7, :cond_2

    .line 157
    .line 158
    iget v7, v13, Lzz;->u:I

    .line 159
    .line 160
    if-ltz v7, :cond_2

    .line 161
    .line 162
    iget v7, v13, Lzz;->i0:I

    .line 163
    .line 164
    const/16 v8, 0x8

    .line 165
    .line 166
    if-eq v7, v8, :cond_8

    .line 167
    .line 168
    iget v7, v13, Lzz;->r:I

    .line 169
    .line 170
    if-nez v7, :cond_2

    .line 171
    .line 172
    iget v7, v13, Lzz;->Y:F

    .line 173
    .line 174
    cmpl-float v7, v7, v16

    .line 175
    .line 176
    if-nez v7, :cond_2

    .line 177
    .line 178
    :cond_8
    invoke-virtual {v13}, Lzz;->y()Z

    .line 179
    .line 180
    .line 181
    move-result v7

    .line 182
    if-nez v7, :cond_2

    .line 183
    .line 184
    iget-boolean v7, v13, Lzz;->G:Z

    .line 185
    .line 186
    if-nez v7, :cond_2

    .line 187
    .line 188
    if-eqz v12, :cond_2

    .line 189
    .line 190
    invoke-virtual {v13}, Lzz;->y()Z

    .line 191
    .line 192
    .line 193
    move-result v7

    .line 194
    if-nez v7, :cond_2

    .line 195
    .line 196
    invoke-static {v14, v1, v0, v13, v2}, Lyy1;->H(ILzz;Lxi;Lzz;Z)V

    .line 197
    .line 198
    .line 199
    goto/16 :goto_0

    .line 200
    .line 201
    :cond_9
    :goto_3
    invoke-virtual {v13}, Lzz;->A()Z

    .line 202
    .line 203
    .line 204
    move-result v9

    .line 205
    if-eqz v9, :cond_a

    .line 206
    .line 207
    goto/16 :goto_0

    .line 208
    .line 209
    :cond_a
    if-ne v7, v8, :cond_b

    .line 210
    .line 211
    iget-object v9, v11, Loz;->f:Loz;

    .line 212
    .line 213
    if-nez v9, :cond_b

    .line 214
    .line 215
    invoke-virtual {v8}, Loz;->e()I

    .line 216
    .line 217
    .line 218
    move-result v7

    .line 219
    add-int/2addr v7, v5

    .line 220
    invoke-virtual {v13}, Lzz;->r()I

    .line 221
    .line 222
    .line 223
    move-result v8

    .line 224
    add-int/2addr v8, v7

    .line 225
    invoke-virtual {v13, v7, v8}, Lzz;->K(II)V

    .line 226
    .line 227
    .line 228
    invoke-static {v14, v0, v13, v2}, Lyy1;->v(ILxi;Lzz;Z)V

    .line 229
    .line 230
    .line 231
    goto/16 :goto_0

    .line 232
    .line 233
    :cond_b
    if-ne v7, v11, :cond_c

    .line 234
    .line 235
    iget-object v7, v8, Loz;->f:Loz;

    .line 236
    .line 237
    if-nez v7, :cond_c

    .line 238
    .line 239
    invoke-virtual {v11}, Loz;->e()I

    .line 240
    .line 241
    .line 242
    move-result v7

    .line 243
    sub-int v7, v5, v7

    .line 244
    .line 245
    invoke-virtual {v13}, Lzz;->r()I

    .line 246
    .line 247
    .line 248
    move-result v8

    .line 249
    sub-int v8, v7, v8

    .line 250
    .line 251
    invoke-virtual {v13, v8, v7}, Lzz;->K(II)V

    .line 252
    .line 253
    .line 254
    invoke-static {v14, v0, v13, v2}, Lyy1;->v(ILxi;Lzz;Z)V

    .line 255
    .line 256
    .line 257
    goto/16 :goto_0

    .line 258
    .line 259
    :cond_c
    if-eqz v12, :cond_2

    .line 260
    .line 261
    invoke-virtual {v13}, Lzz;->y()Z

    .line 262
    .line 263
    .line 264
    move-result v7

    .line 265
    if-nez v7, :cond_2

    .line 266
    .line 267
    invoke-static {v14, v0, v13, v2}, Lyy1;->G(ILxi;Lzz;Z)V

    .line 268
    .line 269
    .line 270
    goto/16 :goto_0

    .line 271
    .line 272
    :cond_d
    const/16 v16, 0x0

    .line 273
    .line 274
    const/16 v17, 0x0

    .line 275
    .line 276
    const/16 v18, 0x1

    .line 277
    .line 278
    instance-of v3, v1, Lbs0;

    .line 279
    .line 280
    if-eqz v3, :cond_e

    .line 281
    .line 282
    :goto_4
    return-void

    .line 283
    :cond_e
    iget-object v3, v4, Loz;->a:Ljava/util/HashSet;

    .line 284
    .line 285
    if-eqz v3, :cond_1b

    .line 286
    .line 287
    iget-boolean v4, v4, Loz;->c:Z

    .line 288
    .line 289
    if-eqz v4, :cond_1b

    .line 290
    .line 291
    invoke-virtual {v3}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    .line 292
    .line 293
    .line 294
    move-result-object v3

    .line 295
    :cond_f
    :goto_5
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 296
    .line 297
    .line 298
    move-result v4

    .line 299
    if-eqz v4, :cond_1b

    .line 300
    .line 301
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 302
    .line 303
    .line 304
    move-result-object v4

    .line 305
    check-cast v4, Loz;

    .line 306
    .line 307
    iget-object v5, v4, Loz;->d:Lzz;

    .line 308
    .line 309
    add-int/lit8 v12, p0, 0x1

    .line 310
    .line 311
    invoke-static {v5}, Lyy1;->d(Lzz;)Z

    .line 312
    .line 313
    .line 314
    move-result v7

    .line 315
    iget-object v8, v5, Lzz;->J:Loz;

    .line 316
    .line 317
    iget-object v9, v5, Lzz;->L:Loz;

    .line 318
    .line 319
    invoke-virtual {v5}, Lzz;->A()Z

    .line 320
    .line 321
    .line 322
    move-result v11

    .line 323
    if-eqz v11, :cond_10

    .line 324
    .line 325
    if-eqz v7, :cond_10

    .line 326
    .line 327
    new-instance v11, Lwi;

    .line 328
    .line 329
    invoke-direct {v11}, Ljava/lang/Object;-><init>()V

    .line 330
    .line 331
    .line 332
    invoke-static {v5, v0, v11}, La00;->W(Lzz;Lxi;Lwi;)V

    .line 333
    .line 334
    .line 335
    :cond_10
    if-ne v4, v8, :cond_11

    .line 336
    .line 337
    iget-object v11, v9, Loz;->f:Loz;

    .line 338
    .line 339
    if-eqz v11, :cond_11

    .line 340
    .line 341
    iget-boolean v11, v11, Loz;->c:Z

    .line 342
    .line 343
    if-nez v11, :cond_12

    .line 344
    .line 345
    :cond_11
    if-ne v4, v9, :cond_13

    .line 346
    .line 347
    iget-object v11, v8, Loz;->f:Loz;

    .line 348
    .line 349
    if-eqz v11, :cond_13

    .line 350
    .line 351
    iget-boolean v11, v11, Loz;->c:Z

    .line 352
    .line 353
    if-eqz v11, :cond_13

    .line 354
    .line 355
    :cond_12
    move/from16 v11, v18

    .line 356
    .line 357
    goto :goto_6

    .line 358
    :cond_13
    move/from16 v11, v17

    .line 359
    .line 360
    :goto_6
    iget-object v13, v5, Lzz;->U:[Lyz;

    .line 361
    .line 362
    aget-object v13, v13, v17

    .line 363
    .line 364
    if-ne v13, v10, :cond_14

    .line 365
    .line 366
    if-eqz v7, :cond_15

    .line 367
    .line 368
    :cond_14
    const/16 v7, 0x8

    .line 369
    .line 370
    goto :goto_7

    .line 371
    :cond_15
    if-ne v13, v10, :cond_17

    .line 372
    .line 373
    iget v4, v5, Lzz;->v:I

    .line 374
    .line 375
    if-ltz v4, :cond_17

    .line 376
    .line 377
    iget v4, v5, Lzz;->u:I

    .line 378
    .line 379
    if-ltz v4, :cond_17

    .line 380
    .line 381
    iget v4, v5, Lzz;->i0:I

    .line 382
    .line 383
    const/16 v7, 0x8

    .line 384
    .line 385
    if-eq v4, v7, :cond_16

    .line 386
    .line 387
    iget v4, v5, Lzz;->r:I

    .line 388
    .line 389
    if-nez v4, :cond_f

    .line 390
    .line 391
    iget v4, v5, Lzz;->Y:F

    .line 392
    .line 393
    cmpl-float v4, v4, v16

    .line 394
    .line 395
    if-nez v4, :cond_f

    .line 396
    .line 397
    :cond_16
    invoke-virtual {v5}, Lzz;->y()Z

    .line 398
    .line 399
    .line 400
    move-result v4

    .line 401
    if-nez v4, :cond_f

    .line 402
    .line 403
    iget-boolean v4, v5, Lzz;->G:Z

    .line 404
    .line 405
    if-nez v4, :cond_f

    .line 406
    .line 407
    if-eqz v11, :cond_f

    .line 408
    .line 409
    invoke-virtual {v5}, Lzz;->y()Z

    .line 410
    .line 411
    .line 412
    move-result v4

    .line 413
    if-nez v4, :cond_f

    .line 414
    .line 415
    invoke-static {v12, v1, v0, v5, v2}, Lyy1;->H(ILzz;Lxi;Lzz;Z)V

    .line 416
    .line 417
    .line 418
    goto :goto_5

    .line 419
    :cond_17
    const/16 v7, 0x8

    .line 420
    .line 421
    goto :goto_5

    .line 422
    :goto_7
    invoke-virtual {v5}, Lzz;->A()Z

    .line 423
    .line 424
    .line 425
    move-result v13

    .line 426
    if-eqz v13, :cond_18

    .line 427
    .line 428
    goto/16 :goto_5

    .line 429
    .line 430
    :cond_18
    if-ne v4, v8, :cond_19

    .line 431
    .line 432
    iget-object v13, v9, Loz;->f:Loz;

    .line 433
    .line 434
    if-nez v13, :cond_19

    .line 435
    .line 436
    invoke-virtual {v8}, Loz;->e()I

    .line 437
    .line 438
    .line 439
    move-result v4

    .line 440
    add-int/2addr v4, v6

    .line 441
    invoke-virtual {v5}, Lzz;->r()I

    .line 442
    .line 443
    .line 444
    move-result v8

    .line 445
    add-int/2addr v8, v4

    .line 446
    invoke-virtual {v5, v4, v8}, Lzz;->K(II)V

    .line 447
    .line 448
    .line 449
    invoke-static {v12, v0, v5, v2}, Lyy1;->v(ILxi;Lzz;Z)V

    .line 450
    .line 451
    .line 452
    goto/16 :goto_5

    .line 453
    .line 454
    :cond_19
    if-ne v4, v9, :cond_1a

    .line 455
    .line 456
    iget-object v4, v8, Loz;->f:Loz;

    .line 457
    .line 458
    if-nez v4, :cond_1a

    .line 459
    .line 460
    invoke-virtual {v9}, Loz;->e()I

    .line 461
    .line 462
    .line 463
    move-result v4

    .line 464
    sub-int v4, v6, v4

    .line 465
    .line 466
    invoke-virtual {v5}, Lzz;->r()I

    .line 467
    .line 468
    .line 469
    move-result v8

    .line 470
    sub-int v8, v4, v8

    .line 471
    .line 472
    invoke-virtual {v5, v8, v4}, Lzz;->K(II)V

    .line 473
    .line 474
    .line 475
    invoke-static {v12, v0, v5, v2}, Lyy1;->v(ILxi;Lzz;Z)V

    .line 476
    .line 477
    .line 478
    goto/16 :goto_5

    .line 479
    .line 480
    :cond_1a
    if-eqz v11, :cond_f

    .line 481
    .line 482
    invoke-virtual {v5}, Lzz;->y()Z

    .line 483
    .line 484
    .line 485
    move-result v4

    .line 486
    if-nez v4, :cond_f

    .line 487
    .line 488
    invoke-static {v12, v0, v5, v2}, Lyy1;->G(ILxi;Lzz;Z)V

    .line 489
    .line 490
    .line 491
    goto/16 :goto_5

    .line 492
    .line 493
    :cond_1b
    move/from16 v0, v18

    .line 494
    .line 495
    iput-boolean v0, v1, Lzz;->m:Z

    .line 496
    .line 497
    return-void
.end method

.method public static w(Lcq;Ljava/lang/String;)Z
    .locals 4

    .line 1
    const-string v0, "robolectric"

    .line 2
    .line 3
    sget-object v1, Landroid/os/Build;->FINGERPRINT:Ljava/lang/String;

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const/4 v1, 0x1

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    return v1

    .line 13
    :cond_0
    :try_start_0
    invoke-virtual {p0, p1}, Lcq;->b(Ljava/lang/String;)Lgp;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    sget-object p1, Landroid/hardware/camera2/CameraCharacteristics;->REQUEST_AVAILABLE_CAPABILITIES:Landroid/hardware/camera2/CameraCharacteristics$Key;

    .line 18
    .line 19
    invoke-virtual {p0, p1}, Lgp;->a(Landroid/hardware/camera2/CameraCharacteristics$Key;)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    check-cast p0, [I
    :try_end_0
    .catch Llo; {:try_start_0 .. :try_end_0} :catch_0

    .line 24
    .line 25
    const/4 p1, 0x0

    .line 26
    if-eqz p0, :cond_2

    .line 27
    .line 28
    array-length v0, p0

    .line 29
    move v2, p1

    .line 30
    :goto_0
    if-ge v2, v0, :cond_2

    .line 31
    .line 32
    aget v3, p0, v2

    .line 33
    .line 34
    if-nez v3, :cond_1

    .line 35
    .line 36
    return v1

    .line 37
    :cond_1
    add-int/lit8 v2, v2, 0x1

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_2
    return p1

    .line 41
    :catch_0
    move-exception p0

    .line 42
    new-instance p1, Lux0;

    .line 43
    .line 44
    new-instance v0, Lmq;

    .line 45
    .line 46
    invoke-direct {v0, p0}, Ljava/lang/Exception;-><init>(Ljava/lang/Throwable;)V

    .line 47
    .line 48
    .line 49
    invoke-direct {p1, v0}, Ljava/lang/Exception;-><init>(Ljava/lang/Throwable;)V

    .line 50
    .line 51
    .line 52
    throw p1
.end method

.method public static x(Landroid/content/Context;I)Z
    .locals 3

    .line 1
    const-string v0, "com.google.android.gms"

    .line 2
    .line 3
    invoke-static {p0, v0, p1}, Lyy1;->L(Landroid/content/Context;Ljava/lang/String;I)Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    const/4 v1, 0x0

    .line 8
    if-nez p1, :cond_0

    .line 9
    .line 10
    goto :goto_1

    .line 11
    :cond_0
    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    const/16 v2, 0x40

    .line 16
    .line 17
    :try_start_0
    invoke-virtual {p1, v0, v2}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    .line 18
    .line 19
    .line 20
    move-result-object p1
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 21
    invoke-static {p0}, Las0;->b(Landroid/content/Context;)Las0;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 26
    .line 27
    .line 28
    if-nez p1, :cond_1

    .line 29
    .line 30
    goto :goto_1

    .line 31
    :cond_1
    invoke-static {p1, v1}, Las0;->e(Landroid/content/pm/PackageInfo;Z)Z

    .line 32
    .line 33
    .line 34
    move-result v0

    .line 35
    const/4 v2, 0x1

    .line 36
    if-eqz v0, :cond_2

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_2
    invoke-static {p1, v2}, Las0;->e(Landroid/content/pm/PackageInfo;Z)Z

    .line 40
    .line 41
    .line 42
    move-result p1

    .line 43
    if-eqz p1, :cond_4

    .line 44
    .line 45
    iget-object p0, p0, Las0;->a:Ljava/lang/Object;

    .line 46
    .line 47
    check-cast p0, Landroid/content/Context;

    .line 48
    .line 49
    invoke-static {p0}, Lwr0;->a(Landroid/content/Context;)Z

    .line 50
    .line 51
    .line 52
    move-result p0

    .line 53
    if-eqz p0, :cond_3

    .line 54
    .line 55
    :goto_0
    return v2

    .line 56
    :cond_3
    const-string p0, "GoogleSignatureVerifier"

    .line 57
    .line 58
    const-string p1, "Test-keys aren\'t accepted on this build."

    .line 59
    .line 60
    invoke-static {p0, p1}, Lio/sentry/android/core/n0;->q(Ljava/lang/String;Ljava/lang/String;)I

    .line 61
    .line 62
    .line 63
    :catch_0
    :cond_4
    :goto_1
    return v1
.end method


# virtual methods
.method public F(Landroid/view/View;F)V
    .locals 0

    .line 1
    sget-boolean p0, Lyy1;->g:Z

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    :try_start_0
    invoke-static {p1, p2}, Ldt1;->s(Landroid/view/View;F)V
    :try_end_0
    .catch Ljava/lang/NoSuchMethodError; {:try_start_0 .. :try_end_0} :catch_0

    .line 6
    .line 7
    .line 8
    return-void

    .line 9
    :catch_0
    const/4 p0, 0x0

    .line 10
    sput-boolean p0, Lyy1;->g:Z

    .line 11
    .line 12
    :cond_0
    invoke-virtual {p1, p2}, Landroid/view/View;->setAlpha(F)V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public abstract e(Ll0;Lh0;Lh0;)Z
.end method

.method public abstract f(Ll0;Ljava/lang/Object;Ljava/lang/Object;)Z
.end method

.method public abstract g(Ll0;Lk0;Lk0;)Z
.end method

.method public u(Landroid/view/View;)F
    .locals 0

    .line 1
    sget-boolean p0, Lyy1;->g:Z

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    :try_start_0
    invoke-static {p1}, Ldt1;->a(Landroid/view/View;)F

    .line 6
    .line 7
    .line 8
    move-result p0
    :try_end_0
    .catch Ljava/lang/NoSuchMethodError; {:try_start_0 .. :try_end_0} :catch_0

    .line 9
    return p0

    .line 10
    :catch_0
    const/4 p0, 0x0

    .line 11
    sput-boolean p0, Lyy1;->g:Z

    .line 12
    .line 13
    :cond_0
    invoke-virtual {p1}, Landroid/view/View;->getAlpha()F

    .line 14
    .line 15
    .line 16
    move-result p0

    .line 17
    return p0
.end method

.method public abstract y(Lk0;Lk0;)V
.end method

.method public abstract z(Lk0;Ljava/lang/Thread;)V
.end method
