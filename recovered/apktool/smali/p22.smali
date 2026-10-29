.class public abstract Lp22;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# instance fields
.field private final zaa:Lv81;

.field private final zab:[Lcom/google/android/gms/common/Feature;

.field private final zac:Z

.field private final zad:I


# direct methods
.method public constructor <init>(Lv81;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lp22;->zaa:Lv81;

    .line 5
    .line 6
    const/4 p1, 0x0

    .line 7
    iput-object p1, p0, Lp22;->zab:[Lcom/google/android/gms/common/Feature;

    .line 8
    .line 9
    const/4 p1, 0x0

    .line 10
    iput-boolean p1, p0, Lp22;->zac:Z

    .line 11
    .line 12
    iput p1, p0, Lp22;->zad:I

    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public clearListener()V
    .locals 1

    .line 1
    iget-object p0, p0, Lp22;->zaa:Lv81;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    iput-object v0, p0, Lv81;->b:Ljava/lang/Object;

    .line 5
    .line 6
    iput-object v0, p0, Lv81;->c:Lt81;

    .line 7
    .line 8
    return-void
.end method

.method public getListenerKey()Lt81;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lt81;"
        }
    .end annotation

    .line 1
    iget-object p0, p0, Lp22;->zaa:Lv81;

    .line 2
    .line 3
    iget-object p0, p0, Lv81;->c:Lt81;

    .line 4
    .line 5
    return-object p0
.end method

.method public getRequiredFeatures()[Lcom/google/android/gms/common/Feature;
    .locals 0

    .line 1
    iget-object p0, p0, Lp22;->zab:[Lcom/google/android/gms/common/Feature;

    .line 2
    .line 3
    return-object p0
.end method

.method public abstract registerListener(Lx8;Lcom/google/android/gms/tasks/TaskCompletionSource;)V
.end method

.method public final zaa()I
    .locals 0

    .line 1
    iget p0, p0, Lp22;->zad:I

    .line 2
    .line 3
    return p0
.end method

.method public final zab()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lp22;->zac:Z

    .line 2
    .line 3
    return p0
.end method
