.class public abstract Lcy2;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# instance fields
.field private final zaa:Lt81;


# direct methods
.method public constructor <init>(Lt81;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcy2;->zaa:Lt81;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public getListenerKey()Lt81;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lt81;"
        }
    .end annotation

    .line 1
    iget-object p0, p0, Lcy2;->zaa:Lt81;

    .line 2
    .line 3
    return-object p0
.end method

.method public abstract unregisterListener(Lx8;Lcom/google/android/gms/tasks/TaskCompletionSource;)V
.end method
