.class public final Lcom/quago/mobile/sdk/q0;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"

# interfaces
.implements Ljava/lang/Thread$UncaughtExceptionHandler;


# instance fields
.field public final synthetic a:Lcom/quago/mobile/sdk/s0;


# direct methods
.method public constructor <init>(Lcom/quago/mobile/sdk/s0;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/quago/mobile/sdk/q0;->a:Lcom/quago/mobile/sdk/s0;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final uncaughtException(Ljava/lang/Thread;Ljava/lang/Throwable;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/quago/mobile/sdk/q0;->a:Lcom/quago/mobile/sdk/s0;

    .line 2
    .line 3
    iget-object v0, v0, Lcom/quago/mobile/sdk/s0;->a:Lcom/quago/mobile/sdk/j0;

    .line 4
    .line 5
    invoke-virtual {p1}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    const-string v1, "Thread = %s"

    .line 14
    .line 15
    const-string v2, "NetworkManager"

    .line 16
    .line 17
    invoke-virtual {v0, v2, v1, p1}, Lcom/quago/mobile/sdk/j0;->b(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 18
    .line 19
    .line 20
    iget-object p0, p0, Lcom/quago/mobile/sdk/q0;->a:Lcom/quago/mobile/sdk/s0;

    .line 21
    .line 22
    iget-object p0, p0, Lcom/quago/mobile/sdk/s0;->a:Lcom/quago/mobile/sdk/j0;

    .line 23
    .line 24
    invoke-virtual {p0, v2, p2}, Lcom/quago/mobile/sdk/j0;->a(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 25
    .line 26
    .line 27
    return-void
.end method
