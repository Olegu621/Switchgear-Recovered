.class public final synthetic Lzk0;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"

# interfaces
.implements Lio/flutter/plugin/common/BinaryMessenger$BinaryReply;


# instance fields
.field public final synthetic a:J


# direct methods
.method public synthetic constructor <init>(J)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-wide p1, p0, Lzk0;->a:J

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final reply(Ljava/nio/ByteBuffer;)V
    .locals 2

    .line 1
    iget-wide v0, p0, Lzk0;->a:J

    .line 2
    .line 3
    invoke-static {v0, v1, p1}, Lcom/supercell/id/FlutterSupport;->i(JLjava/nio/ByteBuffer;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method
