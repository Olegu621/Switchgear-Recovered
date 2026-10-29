.class public final Lxr3;
.super Lzr3;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# instance fields
.field public final e:Lkl3;


# direct methods
.method public synthetic constructor <init>(Lkl3;)V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x0

    .line 3
    invoke-direct {p0, v0, v1, v1}, Lzr3;-><init>(ZLjava/lang/String;Ljava/lang/Exception;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lxr3;->e:Lkl3;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final y()V
    .locals 0

    .line 1
    :try_start_0
    iget-object p0, p0, Lxr3;->e:Lkl3;

    .line 2
    .line 3
    invoke-virtual {p0}, Lkl3;->call()Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 4
    .line 5
    .line 6
    return-void

    .line 7
    :catch_0
    move-exception p0

    .line 8
    invoke-static {p0}, Lds0;->p(Ljava/lang/Throwable;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method
