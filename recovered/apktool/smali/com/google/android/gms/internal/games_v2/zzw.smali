.class final Lcom/google/android/gms/internal/games_v2/zzw;
.super Lor0;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"

# interfaces
.implements Lcom/google/android/gms/internal/games_v2/zzs;


# static fields
.field private static final zza:Le9;

.field private static final zzb:Lw8;

.field private static final zzc:Lh9;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, Le9;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/google/android/gms/internal/games_v2/zzw;->zza:Le9;

    .line 7
    .line 8
    new-instance v1, Lcom/google/android/gms/internal/games_v2/zzu;

    .line 9
    .line 10
    invoke-direct {v1}, Lcom/google/android/gms/internal/games_v2/zzu;-><init>()V

    .line 11
    .line 12
    .line 13
    sput-object v1, Lcom/google/android/gms/internal/games_v2/zzw;->zzb:Lw8;

    .line 14
    .line 15
    new-instance v2, Lh9;

    .line 16
    .line 17
    const-string v3, "GamesConnect.API"

    .line 18
    .line 19
    invoke-direct {v2, v3, v1, v0}, Lh9;-><init>(Ljava/lang/String;Lw8;Le9;)V

    .line 20
    .line 21
    .line 22
    sput-object v2, Lcom/google/android/gms/internal/games_v2/zzw;->zzc:Lh9;

    .line 23
    .line 24
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lcom/google/android/gms/internal/games_v2/zzq;)V
    .locals 6

    .line 1
    sget-object v3, Lcom/google/android/gms/internal/games_v2/zzw;->zzc:Lh9;

    .line 2
    .line 3
    sget-object v5, Lnr0;->c:Lnr0;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    move-object v0, p0

    .line 7
    move-object v1, p1

    .line 8
    move-object v4, p2

    .line 9
    invoke-direct/range {v0 .. v5}, Lor0;-><init>(Landroid/content/Context;Landroid/app/Activity;Lh9;Lb9;Lnr0;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final zza(Lcom/google/android/gms/internal/games_v2/zzy;Z)Lcom/google/android/gms/tasks/Task;
    .locals 2

    .line 1
    invoke-static {}, Lum2;->builder()Ltm2;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, Lcom/google/android/gms/internal/games_v2/zzt;

    .line 6
    .line 7
    invoke-direct {v1, p0, p1}, Lcom/google/android/gms/internal/games_v2/zzt;-><init>(Lcom/google/android/gms/internal/games_v2/zzw;Lcom/google/android/gms/internal/games_v2/zzy;)V

    .line 8
    .line 9
    .line 10
    iput-object v1, v0, Ltm2;->a:Lc32;

    .line 11
    .line 12
    const/16 p1, 0x1a51

    .line 13
    .line 14
    iput p1, v0, Ltm2;->d:I

    .line 15
    .line 16
    iput-boolean p2, v0, Ltm2;->b:Z

    .line 17
    .line 18
    invoke-virtual {v0}, Ltm2;->a()Lmb3;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    if-eqz p2, :cond_0

    .line 23
    .line 24
    invoke-virtual {p0, p1}, Lor0;->doWrite(Lum2;)Lcom/google/android/gms/tasks/Task;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    return-object p0

    .line 29
    :cond_0
    invoke-virtual {p0, p1}, Lor0;->doBestEffortWrite(Lum2;)Lcom/google/android/gms/tasks/Task;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    return-object p0
.end method
