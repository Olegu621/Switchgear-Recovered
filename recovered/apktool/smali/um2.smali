.class public abstract Lum2;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# instance fields
.field private final zaa:[Lcom/google/android/gms/common/Feature;

.field private final zab:Z

.field private final zac:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 17
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Lum2;->zaa:[Lcom/google/android/gms/common/Feature;

    const/4 v0, 0x0

    iput-boolean v0, p0, Lum2;->zab:Z

    iput v0, p0, Lum2;->zac:I

    return-void
.end method

.method public constructor <init>([Lcom/google/android/gms/common/Feature;ZI)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lum2;->zaa:[Lcom/google/android/gms/common/Feature;

    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    if-eqz p1, :cond_0

    .line 8
    .line 9
    if-eqz p2, :cond_0

    .line 10
    .line 11
    const/4 v0, 0x1

    .line 12
    :cond_0
    iput-boolean v0, p0, Lum2;->zab:Z

    .line 13
    .line 14
    iput p3, p0, Lum2;->zac:I

    .line 15
    .line 16
    return-void
.end method

.method public static builder()Ltm2;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<A::",
            "Lx8;",
            "ResultT:",
            "Ljava/lang/Object;",
            ">()",
            "Ltm2;"
        }
    .end annotation

    .line 1
    new-instance v0, Ltm2;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    const/4 v1, 0x1

    .line 7
    iput-boolean v1, v0, Ltm2;->b:Z

    .line 8
    .line 9
    const/4 v1, 0x0

    .line 10
    iput v1, v0, Ltm2;->d:I

    .line 11
    .line 12
    return-object v0
.end method


# virtual methods
.method public abstract doExecute(Lx8;Lcom/google/android/gms/tasks/TaskCompletionSource;)V
.end method

.method public shouldAutoResolveMissingFeatures()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lum2;->zab:Z

    .line 2
    .line 3
    return p0
.end method

.method public final zaa()I
    .locals 0

    .line 1
    iget p0, p0, Lum2;->zac:I

    .line 2
    .line 3
    return p0
.end method

.method public final zab()[Lcom/google/android/gms/common/Feature;
    .locals 0

    .line 1
    iget-object p0, p0, Lum2;->zaa:[Lcom/google/android/gms/common/Feature;

    .line 2
    .line 3
    return-object p0
.end method
