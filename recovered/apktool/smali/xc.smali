.class public final Lxc;
.super Lpy0;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# static fields
.field public static volatile l:Lxc;


# instance fields
.field public final k:Lz60;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    const/16 v0, 0x11

    .line 2
    .line 3
    invoke-direct {p0, v0}, Lpy0;-><init>(I)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Lz60;

    .line 7
    .line 8
    invoke-direct {v0}, Lz60;-><init>()V

    .line 9
    .line 10
    .line 11
    iput-object v0, p0, Lxc;->k:Lz60;

    .line 12
    .line 13
    return-void
.end method

.method public static y0()Lxc;
    .locals 2

    .line 1
    sget-object v0, Lxc;->l:Lxc;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    sget-object v0, Lxc;->l:Lxc;

    .line 6
    .line 7
    return-object v0

    .line 8
    :cond_0
    const-class v0, Lxc;

    .line 9
    .line 10
    monitor-enter v0

    .line 11
    :try_start_0
    sget-object v1, Lxc;->l:Lxc;

    .line 12
    .line 13
    if-nez v1, :cond_1

    .line 14
    .line 15
    new-instance v1, Lxc;

    .line 16
    .line 17
    invoke-direct {v1}, Lxc;-><init>()V

    .line 18
    .line 19
    .line 20
    sput-object v1, Lxc;->l:Lxc;

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :catchall_0
    move-exception v1

    .line 24
    goto :goto_1

    .line 25
    :cond_1
    :goto_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 26
    sget-object v0, Lxc;->l:Lxc;

    .line 27
    .line 28
    return-object v0

    .line 29
    :goto_1
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 30
    throw v1
.end method
