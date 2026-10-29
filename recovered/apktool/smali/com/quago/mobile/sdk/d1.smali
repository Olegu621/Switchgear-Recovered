.class public final Lcom/quago/mobile/sdk/d1;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# static fields
.field public static final transient h:Lcom/quago/mobile/sdk/j0;


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Ljava/lang/String;

.field public final c:Ljava/lang/String;

.field public final d:Ljava/lang/String;

.field public final e:Ljava/lang/String;

.field public final f:I

.field public final g:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    sget-object v0, Lcom/quago/mobile/sdk/k0;->a:Ljava/util/Locale;

    .line 2
    .line 3
    new-instance v0, Lcom/quago/mobile/sdk/j0;

    .line 4
    .line 5
    const-string v1, "QuagoVersion"

    .line 6
    .line 7
    invoke-direct {v0, v1}, Lcom/quago/mobile/sdk/j0;-><init>(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    sput-object v0, Lcom/quago/mobile/sdk/d1;->h:Lcom/quago/mobile/sdk/j0;

    .line 11
    .line 12
    return-void
.end method

.method public constructor <init>()V
    .locals 6

    .line 1
    const-string v0, "Version"

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    :try_start_0
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :catch_0
    move-exception v2

    .line 11
    sget-object v3, Lcom/quago/mobile/sdk/d1;->h:Lcom/quago/mobile/sdk/j0;

    .line 12
    .line 13
    invoke-virtual {v3, v0, v2}, Lcom/quago/mobile/sdk/j0;->a(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 14
    .line 15
    .line 16
    move v2, v1

    .line 17
    :goto_0
    iput v2, p0, Lcom/quago/mobile/sdk/d1;->g:I

    .line 18
    .line 19
    const/4 v2, 0x0

    .line 20
    :try_start_1
    sget-object v3, Landroid/os/Build$VERSION;->RELEASE:Ljava/lang/String;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 21
    .line 22
    goto :goto_1

    .line 23
    :catch_1
    move-exception v3

    .line 24
    sget-object v4, Lcom/quago/mobile/sdk/d1;->h:Lcom/quago/mobile/sdk/j0;

    .line 25
    .line 26
    invoke-virtual {v4, v0, v3}, Lcom/quago/mobile/sdk/j0;->a(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 27
    .line 28
    .line 29
    move-object v3, v2

    .line 30
    :goto_1
    iput-object v3, p0, Lcom/quago/mobile/sdk/d1;->d:Ljava/lang/String;

    .line 31
    .line 32
    :try_start_2
    sget-object v3, Landroid/os/Build$VERSION;->CODENAME:Ljava/lang/String;
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2

    .line 33
    .line 34
    goto :goto_2

    .line 35
    :catch_2
    move-exception v3

    .line 36
    sget-object v4, Lcom/quago/mobile/sdk/d1;->h:Lcom/quago/mobile/sdk/j0;

    .line 37
    .line 38
    invoke-virtual {v4, v0, v3}, Lcom/quago/mobile/sdk/j0;->a(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 39
    .line 40
    .line 41
    move-object v3, v2

    .line 42
    :goto_2
    iput-object v3, p0, Lcom/quago/mobile/sdk/d1;->b:Ljava/lang/String;

    .line 43
    .line 44
    :try_start_3
    sget-object v3, Landroid/os/Build$VERSION;->INCREMENTAL:Ljava/lang/String;
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_3

    .line 45
    .line 46
    goto :goto_3

    .line 47
    :catch_3
    move-exception v3

    .line 48
    sget-object v4, Lcom/quago/mobile/sdk/d1;->h:Lcom/quago/mobile/sdk/j0;

    .line 49
    .line 50
    invoke-virtual {v4, v0, v3}, Lcom/quago/mobile/sdk/j0;->a(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 51
    .line 52
    .line 53
    move-object v3, v2

    .line 54
    :goto_3
    iput-object v3, p0, Lcom/quago/mobile/sdk/d1;->c:Ljava/lang/String;

    .line 55
    .line 56
    :try_start_4
    sget-object v3, Landroid/os/Build$VERSION;->BASE_OS:Ljava/lang/String;
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_4

    .line 57
    .line 58
    goto :goto_4

    .line 59
    :catch_4
    move-exception v3

    .line 60
    sget-object v4, Lcom/quago/mobile/sdk/d1;->h:Lcom/quago/mobile/sdk/j0;

    .line 61
    .line 62
    invoke-virtual {v4, v0, v3}, Lcom/quago/mobile/sdk/j0;->a(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 63
    .line 64
    .line 65
    move-object v3, v2

    .line 66
    :goto_4
    :try_start_5
    sget v1, Landroid/os/Build$VERSION;->PREVIEW_SDK_INT:I
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_5

    .line 67
    .line 68
    goto :goto_5

    .line 69
    :catch_5
    move-exception v4

    .line 70
    sget-object v5, Lcom/quago/mobile/sdk/d1;->h:Lcom/quago/mobile/sdk/j0;

    .line 71
    .line 72
    invoke-virtual {v5, v0, v4}, Lcom/quago/mobile/sdk/j0;->a(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 73
    .line 74
    .line 75
    :goto_5
    :try_start_6
    sget-object v2, Landroid/os/Build$VERSION;->SECURITY_PATCH:Ljava/lang/String;
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_6

    .line 76
    .line 77
    goto :goto_6

    .line 78
    :catch_6
    move-exception v4

    .line 79
    sget-object v5, Lcom/quago/mobile/sdk/d1;->h:Lcom/quago/mobile/sdk/j0;

    .line 80
    .line 81
    invoke-virtual {v5, v0, v4}, Lcom/quago/mobile/sdk/j0;->a(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 82
    .line 83
    .line 84
    :goto_6
    iput-object v3, p0, Lcom/quago/mobile/sdk/d1;->a:Ljava/lang/String;

    .line 85
    .line 86
    iput v1, p0, Lcom/quago/mobile/sdk/d1;->f:I

    .line 87
    .line 88
    iput-object v2, p0, Lcom/quago/mobile/sdk/d1;->e:Ljava/lang/String;

    .line 89
    .line 90
    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "QuagoVersion{base_os=\'"

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, Lcom/quago/mobile/sdk/d1;->a:Ljava/lang/String;

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const-string v1, "\', codename=\'"

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    iget-object v1, p0, Lcom/quago/mobile/sdk/d1;->b:Ljava/lang/String;

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    const-string v1, "\', incremental=\'"

    .line 24
    .line 25
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    iget-object v1, p0, Lcom/quago/mobile/sdk/d1;->c:Ljava/lang/String;

    .line 29
    .line 30
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    const-string v1, "\', release=\'"

    .line 34
    .line 35
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    iget-object v1, p0, Lcom/quago/mobile/sdk/d1;->d:Ljava/lang/String;

    .line 39
    .line 40
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    const-string v1, "\', security_patch=\'"

    .line 44
    .line 45
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    iget-object v1, p0, Lcom/quago/mobile/sdk/d1;->e:Ljava/lang/String;

    .line 49
    .line 50
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 51
    .line 52
    .line 53
    const-string v1, "\', preview_sdk_int="

    .line 54
    .line 55
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 56
    .line 57
    .line 58
    iget v1, p0, Lcom/quago/mobile/sdk/d1;->f:I

    .line 59
    .line 60
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 61
    .line 62
    .line 63
    const-string v1, ", sdk_int="

    .line 64
    .line 65
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 66
    .line 67
    .line 68
    iget p0, p0, Lcom/quago/mobile/sdk/d1;->g:I

    .line 69
    .line 70
    const/16 v1, 0x7d

    .line 71
    .line 72
    invoke-static {v0, p0, v1}, Len;->n(Ljava/lang/StringBuilder;IC)Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object p0

    .line 76
    return-object p0
.end method
