.class public final Lcom/supercell/titan/agesignals/AgeSignals;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/supercell/titan/agesignals/AgeSignals$AgeRangeResult;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0018\u00002\u00020\u0001:\u0001\u000fB\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\r\u0010\n\u001a\u00020\t\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u000f\u0010\r\u001a\u0004\u0018\u00010\u000c\u00a2\u0006\u0004\u0008\r\u0010\u000e\u00a8\u0006\u0010"
    }
    d2 = {
        "Lcom/supercell/titan/agesignals/AgeSignals;",
        "",
        "<init>",
        "()V",
        "Landroid/content/Context;",
        "context",
        "",
        "init",
        "(Landroid/content/Context;)V",
        "",
        "isInitDone",
        "()Z",
        "Lcom/supercell/titan/agesignals/AgeSignals$AgeRangeResult;",
        "getAgeRangeResult",
        "()Lcom/supercell/titan/agesignals/AgeSignals$AgeRangeResult;",
        "AgeRangeResult",
        "age-signals"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final MAX_RETRIES:I
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field public static final c:J

.field public static final d:J

.field public static final e:Ljava/text/SimpleDateFormat;


# instance fields
.field public volatile a:Lcom/supercell/titan/agesignals/AgeSignals$AgeRangeResult;

.field public final b:Landroid/os/Handler;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    const-class v0, Lcom/supercell/titan/agesignals/AgeSignals;

    const v1, 0x14

    const v0, 0x5

    sput v0, Lcom/supercell/titan/agesignals/AgeSignals;->MAX_RETRIES:I

    sget-object v0, Lfb0;->b:Leb0;

    .line 2
    .line 3
    sget-object v0, Lib0;->d:Lib0;

    .line 4
    .line 5
    const/4 v1, 0x1

    .line 6
    invoke-static {v1, v0}, Lmn0;->D(ILib0;)J

    .line 7
    .line 8
    .line 9
    move-result-wide v1

    .line 10
    sput-wide v1, Lcom/supercell/titan/agesignals/AgeSignals;->c:J

    .line 11
    .line 12
    const/16 v1, 0x1e

    .line 13
    .line 14
    invoke-static {v1, v0}, Lmn0;->D(ILib0;)J

    .line 15
    .line 16
    .line 17
    move-result-wide v0

    .line 18
    sput-wide v0, Lcom/supercell/titan/agesignals/AgeSignals;->d:J

    .line 19
    .line 20
    new-instance v0, Ljava/text/SimpleDateFormat;

    .line 21
    .line 22
    const-string v1, "yyyy-MM-dd"

    .line 23
    .line 24
    sget-object v2, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 25
    .line 26
    invoke-direct {v0, v1, v2}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    .line 27
    .line 28
    .line 29
    sput-object v0, Lcom/supercell/titan/agesignals/AgeSignals;->e:Ljava/text/SimpleDateFormat;

    .line 30
    .line 31
    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Landroid/os/Handler;

    .line 5
    .line 6
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 11
    .line 12
    .line 13
    iput-object v0, p0, Lcom/supercell/titan/agesignals/AgeSignals;->b:Landroid/os/Handler;

    .line 14
    .line 15
    return-void
.end method


# virtual methods
.method public final a(Ler0;I)V
    .locals 6

    .line 1
    new-instance v0, Ldc0;

    .line 2
    .line 3
    const/16 v1, 0x10

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ldc0;-><init>(I)V

    .line 6
    .line 7
    .line 8
    iget-object v1, p1, Ler0;->b:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v1, Lxg3;

    .line 11
    .line 12
    iget-object v2, v1, Lxg3;->b:Lcom/google/android/gms/internal/playcore_age_signals/zzo;

    .line 13
    .line 14
    const v3, 0x76

    const-string v3, "onError(%d)"

    .line 15
    .line 16
    if-eqz v2, :cond_1

    .line 17
    .line 18
    iget-object v4, v1, Lxg3;->a:Landroid/content/Context;

    .line 19
    .line 20
    invoke-static {v4}, Lcom/google/android/gms/internal/playcore_age_signals/zzr;->zza(Landroid/content/Context;)I

    .line 21
    .line 22
    .line 23
    move-result v4

    .line 24
    const v5, 0x4e904e0

    .line 25
    .line 26
    .line 27
    if-ge v4, v5, :cond_0

    .line 28
    .line 29
    sget-object v0, Lxg3;->c:Lcom/google/android/gms/internal/playcore_age_signals/zzd;

    .line 30
    .line 31
    const/4 v1, -0x6

    .line 32
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 33
    .line 34
    .line 35
    move-result-object v2

    .line 36
    filled-new-array {v2}, [Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v2

    .line 40
    invoke-virtual {v0, v3, v2}, Lcom/google/android/gms/internal/playcore_age_signals/zzd;->zza(Ljava/lang/String;[Ljava/lang/Object;)I

    .line 41
    .line 42
    .line 43
    new-instance v0, La7;

    .line 44
    .line 45
    invoke-direct {v0, v1}, La7;-><init>(I)V

    .line 46
    .line 47
    .line 48
    invoke-static {v0}, Lcom/google/android/gms/tasks/Tasks;->forException(Ljava/lang/Exception;)Lcom/google/android/gms/tasks/Task;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    goto :goto_0

    .line 53
    :cond_0
    new-instance v3, Lcom/google/android/gms/tasks/TaskCompletionSource;

    .line 54
    .line 55
    invoke-direct {v3}, Lcom/google/android/gms/tasks/TaskCompletionSource;-><init>()V

    .line 56
    .line 57
    .line 58
    new-instance v4, Lvf3;

    .line 59
    .line 60
    invoke-direct {v4, v1, v3, v3, v0}, Lvf3;-><init>(Lxg3;Lcom/google/android/gms/tasks/TaskCompletionSource;Lcom/google/android/gms/tasks/TaskCompletionSource;Ldc0;)V

    .line 61
    .line 62
    .line 63
    invoke-virtual {v2, v4, v3}, Lcom/google/android/gms/internal/playcore_age_signals/zzo;->zzt(Lcom/google/android/gms/internal/playcore_age_signals/zze;Lcom/google/android/gms/tasks/TaskCompletionSource;)V

    .line 64
    .line 65
    .line 66
    invoke-virtual {v3}, Lcom/google/android/gms/tasks/TaskCompletionSource;->getTask()Lcom/google/android/gms/tasks/Task;

    .line 67
    .line 68
    .line 69
    move-result-object v0

    .line 70
    goto :goto_0

    .line 71
    :cond_1
    sget-object v0, Lxg3;->c:Lcom/google/android/gms/internal/playcore_age_signals/zzd;

    .line 72
    .line 73
    const/4 v1, -0x2

    .line 74
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 75
    .line 76
    .line 77
    move-result-object v2

    .line 78
    filled-new-array {v2}, [Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    move-result-object v2

    .line 82
    invoke-virtual {v0, v3, v2}, Lcom/google/android/gms/internal/playcore_age_signals/zzd;->zza(Ljava/lang/String;[Ljava/lang/Object;)I

    .line 83
    .line 84
    .line 85
    new-instance v0, La7;

    .line 86
    .line 87
    invoke-direct {v0, v1}, La7;-><init>(I)V

    .line 88
    .line 89
    .line 90
    invoke-static {v0}, Lcom/google/android/gms/tasks/Tasks;->forException(Ljava/lang/Exception;)Lcom/google/android/gms/tasks/Task;

    .line 91
    .line 92
    .line 93
    move-result-object v0

    .line 94
    :goto_0
    new-instance v1, Lf;

    .line 95
    .line 96
    const/4 v2, 0x1

    .line 97
    invoke-direct {v1, p0, v2}, Lf;-><init>(Ljava/lang/Object;I)V

    .line 98
    .line 99
    .line 100
    new-instance v2, Lx6;

    .line 101
    .line 102
    const/4 v3, 0x0

    .line 103
    invoke-direct {v2, v1, v3}, Lx6;-><init>(Ljava/lang/Object;I)V

    .line 104
    .line 105
    .line 106
    invoke-virtual {v0, v2}, Lcom/google/android/gms/tasks/Task;->addOnSuccessListener(Lcom/google/android/gms/tasks/OnSuccessListener;)Lcom/google/android/gms/tasks/Task;

    .line 107
    .line 108
    .line 109
    move-result-object v0

    .line 110
    new-instance v1, Ly6;

    .line 111
    .line 112
    invoke-direct {v1, p0, p2, p1}, Ly6;-><init>(Lcom/supercell/titan/agesignals/AgeSignals;ILer0;)V

    .line 113
    .line 114
    .line 115
    invoke-virtual {v0, v1}, Lcom/google/android/gms/tasks/Task;->addOnFailureListener(Lcom/google/android/gms/tasks/OnFailureListener;)Lcom/google/android/gms/tasks/Task;

    .line 116
    .line 117
    .line 118
    return-void
.end method

.method public final getAgeRangeResult()Lcom/supercell/titan/agesignals/AgeSignals$AgeRangeResult;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/supercell/titan/agesignals/AgeSignals;->a:Lcom/supercell/titan/agesignals/AgeSignals$AgeRangeResult;

    .line 2
    .line 3
    return-object p0
.end method

.method public final init(Landroid/content/Context;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/supercell/titan/agesignals/AgeSignals;->a:Lcom/supercell/titan/agesignals/AgeSignals$AgeRangeResult;

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    return-void

    .line 9
    :cond_0
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    new-instance v0, Ler0;

    .line 14
    .line 15
    new-instance v1, Lxg3;

    .line 16
    .line 17
    invoke-direct {v1, p1}, Lxg3;-><init>(Landroid/content/Context;)V

    .line 18
    .line 19
    .line 20
    const/16 p1, 0x1d

    .line 21
    .line 22
    invoke-direct {v0, v1, p1}, Ler0;-><init>(Ljava/lang/Object;I)V

    .line 23
    .line 24
    .line 25
    const/4 p1, 0x0

    .line 26
    invoke-virtual {p0, v0, p1}, Lcom/supercell/titan/agesignals/AgeSignals;->a(Ler0;I)V

    .line 27
    .line 28
    .line 29
    return-void
.end method

.method public final isInitDone()Z
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/supercell/titan/agesignals/AgeSignals;->a:Lcom/supercell/titan/agesignals/AgeSignals$AgeRangeResult;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    const/4 p0, 0x1

    .line 6
    return p0

    .line 7
    :cond_0
    const/4 p0, 0x0

    .line 8
    return p0
.end method
