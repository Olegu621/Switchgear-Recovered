.class public final synthetic Ll70;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic a:Lm70;

.field public final synthetic b:Ljava/util/concurrent/Callable;

.field public final synthetic c:Lgr0;


# direct methods
.method public synthetic constructor <init>(Lm70;Ljava/util/concurrent/Callable;Lgr0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ll70;->a:Lm70;

    .line 5
    .line 6
    iput-object p2, p0, Ll70;->b:Ljava/util/concurrent/Callable;

    .line 7
    .line 8
    iput-object p3, p0, Ll70;->c:Lgr0;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 4

    .line 1
    iget-object v0, p0, Ll70;->a:Lm70;

    .line 2
    .line 3
    iget-object v0, v0, Lm70;->a:Ljava/util/concurrent/ExecutorService;

    .line 4
    .line 5
    new-instance v1, Lj8;

    .line 6
    .line 7
    const/16 v2, 0x12

    .line 8
    .line 9
    iget-object v3, p0, Ll70;->b:Ljava/util/concurrent/Callable;

    .line 10
    .line 11
    iget-object p0, p0, Ll70;->c:Lgr0;

    .line 12
    .line 13
    invoke-direct {v1, v2, v3, p0}, Lj8;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    return-object p0
.end method
