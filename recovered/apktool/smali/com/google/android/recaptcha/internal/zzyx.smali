.class public final Lcom/google/android/recaptcha/internal/zzyx;
.super Lcom/google/android/recaptcha/internal/zzsn;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"

# interfaces
.implements Lcom/google/android/recaptcha/internal/zztt;


# static fields
.field private static final zzb:Lcom/google/android/recaptcha/internal/zzyx;

.field private static volatile zzd:Lcom/google/android/recaptcha/internal/zzua;


# instance fields
.field private zze:Lcom/google/android/recaptcha/internal/zzsu;

.field private zzf:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lcom/google/android/recaptcha/internal/zzyx;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/google/android/recaptcha/internal/zzyx;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/google/android/recaptcha/internal/zzyx;->zzb:Lcom/google/android/recaptcha/internal/zzyx;

    .line 7
    .line 8
    const-class v1, Lcom/google/android/recaptcha/internal/zzyx;

    .line 9
    .line 10
    invoke-static {v1, v0}, Lcom/google/android/recaptcha/internal/zzsn;->zzI(Ljava/lang/Class;Lcom/google/android/recaptcha/internal/zzsn;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method private constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/google/android/recaptcha/internal/zzsn;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-static {}, Lcom/google/android/recaptcha/internal/zzsn;->zzB()Lcom/google/android/recaptcha/internal/zzsu;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    iput-object v0, p0, Lcom/google/android/recaptcha/internal/zzyx;->zze:Lcom/google/android/recaptcha/internal/zzsu;

    .line 9
    .line 10
    return-void
.end method

.method public static zzf()Lcom/google/android/recaptcha/internal/zzyu;
    .locals 1

    .line 1
    sget-object v0, Lcom/google/android/recaptcha/internal/zzyx;->zzb:Lcom/google/android/recaptcha/internal/zzyx;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/google/android/recaptcha/internal/zzsn;->zzq()Lcom/google/android/recaptcha/internal/zzsh;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lcom/google/android/recaptcha/internal/zzyu;

    .line 8
    .line 9
    return-object v0
.end method

.method public static bridge synthetic zzg()Lcom/google/android/recaptcha/internal/zzyx;
    .locals 1

    .line 1
    sget-object v0, Lcom/google/android/recaptcha/internal/zzyx;->zzb:Lcom/google/android/recaptcha/internal/zzyx;

    .line 2
    .line 3
    return-object v0
.end method

.method public static synthetic zzi(Lcom/google/android/recaptcha/internal/zzyx;Ljava/lang/Iterable;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/google/android/recaptcha/internal/zzyx;->zzl()V

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Lcom/google/android/recaptcha/internal/zzyx;->zze:Lcom/google/android/recaptcha/internal/zzsu;

    .line 5
    .line 6
    invoke-static {p1, p0}, Lcom/google/android/recaptcha/internal/zzpw;->zzc(Ljava/lang/Iterable;Ljava/util/List;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public static synthetic zzj(Lcom/google/android/recaptcha/internal/zzyx;Lcom/google/android/recaptcha/internal/zzyw;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Lcom/google/android/recaptcha/internal/zzyx;->zzl()V

    .line 5
    .line 6
    .line 7
    iget-object p0, p0, Lcom/google/android/recaptcha/internal/zzyx;->zze:Lcom/google/android/recaptcha/internal/zzsu;

    .line 8
    .line 9
    invoke-interface {p0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public static synthetic zzk(Lcom/google/android/recaptcha/internal/zzyx;I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/google/android/recaptcha/internal/zzyx;->zzf:I

    .line 2
    .line 3
    return-void
.end method

.method private final zzl()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/android/recaptcha/internal/zzyx;->zze:Lcom/google/android/recaptcha/internal/zzsu;

    .line 2
    .line 3
    invoke-interface {v0}, Lcom/google/android/recaptcha/internal/zzsu;->zzc()Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-nez v1, :cond_0

    .line 8
    .line 9
    invoke-static {v0}, Lcom/google/android/recaptcha/internal/zzsn;->zzC(Lcom/google/android/recaptcha/internal/zzsu;)Lcom/google/android/recaptcha/internal/zzsu;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    iput-object v0, p0, Lcom/google/android/recaptcha/internal/zzyx;->zze:Lcom/google/android/recaptcha/internal/zzsu;

    .line 14
    .line 15
    :cond_0
    return-void
.end method


# virtual methods
.method public final zzh(ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    add-int/lit8 p1, p1, -0x1

    .line 2
    .line 3
    if-eqz p1, :cond_7

    .line 4
    .line 5
    const/4 p0, 0x2

    .line 6
    if-eq p1, p0, :cond_6

    .line 7
    .line 8
    const/4 p0, 0x3

    .line 9
    if-eq p1, p0, :cond_5

    .line 10
    .line 11
    const/4 p0, 0x4

    .line 12
    const/4 p2, 0x0

    .line 13
    if-eq p1, p0, :cond_4

    .line 14
    .line 15
    const/4 p0, 0x5

    .line 16
    if-eq p1, p0, :cond_3

    .line 17
    .line 18
    const/4 p0, 0x6

    .line 19
    if-ne p1, p0, :cond_2

    .line 20
    .line 21
    sget-object p0, Lcom/google/android/recaptcha/internal/zzyx;->zzd:Lcom/google/android/recaptcha/internal/zzua;

    .line 22
    .line 23
    if-nez p0, :cond_1

    .line 24
    .line 25
    const-class p1, Lcom/google/android/recaptcha/internal/zzyx;

    .line 26
    .line 27
    monitor-enter p1

    .line 28
    :try_start_0
    sget-object p0, Lcom/google/android/recaptcha/internal/zzyx;->zzd:Lcom/google/android/recaptcha/internal/zzua;

    .line 29
    .line 30
    if-nez p0, :cond_0

    .line 31
    .line 32
    new-instance p0, Lcom/google/android/recaptcha/internal/zzsi;

    .line 33
    .line 34
    sget-object p2, Lcom/google/android/recaptcha/internal/zzyx;->zzb:Lcom/google/android/recaptcha/internal/zzyx;

    .line 35
    .line 36
    invoke-direct {p0, p2}, Lcom/google/android/recaptcha/internal/zzsi;-><init>(Lcom/google/android/recaptcha/internal/zzsn;)V

    .line 37
    .line 38
    .line 39
    sput-object p0, Lcom/google/android/recaptcha/internal/zzyx;->zzd:Lcom/google/android/recaptcha/internal/zzua;

    .line 40
    .line 41
    goto :goto_0

    .line 42
    :catchall_0
    move-exception p0

    .line 43
    goto :goto_1

    .line 44
    :cond_0
    :goto_0
    monitor-exit p1

    .line 45
    return-object p0

    .line 46
    :goto_1
    monitor-exit p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 47
    throw p0

    .line 48
    :cond_1
    return-object p0

    .line 49
    :cond_2
    throw p2

    .line 50
    :cond_3
    sget-object p0, Lcom/google/android/recaptcha/internal/zzyx;->zzb:Lcom/google/android/recaptcha/internal/zzyx;

    .line 51
    .line 52
    return-object p0

    .line 53
    :cond_4
    new-instance p0, Lcom/google/android/recaptcha/internal/zzyu;

    .line 54
    .line 55
    invoke-direct {p0, p2}, Lcom/google/android/recaptcha/internal/zzyu;-><init>(Lcom/google/android/recaptcha/internal/zzyy;)V

    .line 56
    .line 57
    .line 58
    return-object p0

    .line 59
    :cond_5
    new-instance p0, Lcom/google/android/recaptcha/internal/zzyx;

    .line 60
    .line 61
    invoke-direct {p0}, Lcom/google/android/recaptcha/internal/zzyx;-><init>()V

    .line 62
    .line 63
    .line 64
    return-object p0

    .line 65
    :cond_6
    const-string p0, "zze"

    .line 66
    .line 67
    const-class p1, Lcom/google/android/recaptcha/internal/zzyw;

    .line 68
    .line 69
    const-string p2, "zzf"

    .line 70
    .line 71
    filled-new-array {p0, p1, p2}, [Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object p0

    .line 75
    sget-object p1, Lcom/google/android/recaptcha/internal/zzyx;->zzb:Lcom/google/android/recaptcha/internal/zzyx;

    .line 76
    .line 77
    const-string p2, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002\u000b"

    .line 78
    .line 79
    invoke-static {p1, p2, p0}, Lcom/google/android/recaptcha/internal/zzsn;->zzF(Lcom/google/android/recaptcha/internal/zzts;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    move-result-object p0

    .line 83
    return-object p0

    .line 84
    :cond_7
    const/4 p0, 0x1

    .line 85
    invoke-static {p0}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    .line 86
    .line 87
    .line 88
    move-result-object p0

    .line 89
    return-object p0
.end method
