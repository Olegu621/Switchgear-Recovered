.class public final Lv81;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# instance fields
.field public final a:Lwz0;

.field public volatile b:Ljava/lang/Object;

.field public volatile c:Lt81;


# direct methods
.method public constructor <init>(Landroid/os/Looper;Ljava/lang/Object;Ljava/lang/String;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lwz0;

    .line 5
    .line 6
    invoke-direct {v0, p1}, Lwz0;-><init>(Landroid/os/Looper;)V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lv81;->a:Lwz0;

    .line 10
    .line 11
    const-string p1, "Listener must not be null"

    .line 12
    .line 13
    invoke-static {p2, p1}, Lkb1;->o(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    iput-object p2, p0, Lv81;->b:Ljava/lang/Object;

    .line 17
    .line 18
    new-instance p1, Lt81;

    .line 19
    .line 20
    invoke-static {p3}, Lkb1;->k(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    invoke-direct {p1, p2, p3}, Lt81;-><init>(Ljava/lang/Object;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    iput-object p1, p0, Lv81;->c:Lt81;

    .line 27
    .line 28
    return-void
.end method


# virtual methods
.method public final a(Lu81;)V
    .locals 2

    .line 1
    new-instance v0, Lcp0;

    .line 2
    .line 3
    const/16 v1, 0x15

    .line 4
    .line 5
    invoke-direct {v0, v1, p0, p1}, Lcp0;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    iget-object p0, p0, Lv81;->a:Lwz0;

    .line 9
    .line 10
    invoke-virtual {p0, v0}, Lwz0;->execute(Ljava/lang/Runnable;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method
