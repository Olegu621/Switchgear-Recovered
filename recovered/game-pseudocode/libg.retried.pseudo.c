/* Additional machine-derived pseudocode for functions that failed in the main export. */

/* 00735df0 FUN_00735df0; mode=decompile_60_seconds */

/* WARNING: Removing unreachable block (ram,0x0073776c) */
/* WARNING: Type propagation algorithm not settling */
/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_00735df0(long *param_1,int *param_2,long *param_3,long param_4)

{
  uint *puVar1;
  int *piVar2;
  byte bVar3;
  byte bVar4;
  ushort uVar5;
  undefined1 auVar6 [16];
  undefined1 auVar7 [16];
  undefined8 uVar8;
  byte bVar9;
  undefined1 auVar10 [16];
  undefined1 auVar11 [16];
  undefined1 auVar12 [16];
  undefined1 auVar13 [11];
  undefined1 auVar14 [16];
  undefined1 auVar15 [11];
  undefined1 auVar16 [16];
  undefined1 auVar17 [11];
  undefined1 (*pauVar18) [16];
  long *plVar19;
  undefined7 uVar20;
  undefined1 uVar21;
  int iVar22;
  uint uVar24;
  int iVar23;
  float *pfVar25;
  undefined8 *puVar26;
  long *plVar27;
  undefined8 uVar28;
  ulong uVar29;
  ulong uVar30;
  uint *puVar31;
  int *piVar32;
  undefined1 *puVar33;
  ulong uVar34;
  undefined *puVar35;
  ulong *puVar36;
  undefined4 *puVar37;
  ulong *puVar38;
  undefined2 *puVar39;
  undefined8 *puVar40;
  long lVar41;
  ushort *puVar42;
  int *piVar43;
  ulong *puVar44;
  ulong uVar45;
  ulong uVar46;
  undefined8 *puVar47;
  undefined4 *puVar48;
  undefined2 *puVar49;
  undefined4 *puVar50;
  uint uVar51;
  uint uVar52;
  uint uVar53;
  byte *pbVar54;
  uint *puVar55;
  long lVar56;
  ulong uVar57;
  undefined4 *puVar58;
  uint uVar59;
  uint uVar60;
  uint uVar61;
  undefined8 uVar62;
  undefined1 (*pauVar63) [16];
  int *piVar64;
  long *plVar65;
  undefined8 *puVar66;
  ulong uVar67;
  long *plVar68;
  undefined4 *puVar69;
  ulong uVar70;
  undefined8 *puVar71;
  byte *pbVar72;
  int *piVar73;
  ulong uVar74;
  long *plVar75;
  undefined1 *puVar76;
  undefined *puVar77;
  long lVar78;
  undefined2 *puVar79;
  long lVar80;
  int *piVar81;
  float *pfVar82;
  ulong uVar83;
  undefined1 *puVar84;
  long lVar85;
  undefined2 *puVar86;
  undefined8 *puVar87;
  ulong uVar88;
  double dVar89;
  undefined1 auVar96 [16];
  double dVar90;
  double dVar91;
  double dVar92;
  undefined1 auVar97 [16];
  double dVar93;
  double dVar94;
  undefined8 uVar95;
  undefined1 auVar98 [16];
  undefined4 uVar99;
  undefined4 uVar100;
  undefined8 uVar101;
  undefined8 uVar102;
  undefined8 uVar103;
  undefined8 uVar104;
  undefined4 uVar105;
  float fVar106;
  undefined1 auVar107 [16];
  undefined1 auVar108 [16];
  ulong uStack_370;
  long *plStack_360;
  undefined1 *puStack_358;
  ulong uStack_348;
  long *plStack_340;
  ulong uStack_338;
  long lStack_328;
  undefined4 uStack_318;
  undefined4 uStack_314;
  long lStack_310;
  long lStack_300;
  undefined1 *puStack_2e0;
  undefined1 *puStack_2d0;
  undefined *puStack_2c8;
  undefined8 *puStack_2b0;
  long lStack_298;
  undefined1 auStack_290 [16];
  undefined *puStack_280;
  ulong uStack_278;
  ulong uStack_270;
  long *plStack_268;
  long *plStack_260;
  undefined1 *puStack_258;
  byte bStack_250;
  uint7 uStack_24f;
  byte bStack_248;
  uint7 uStack_247;
  int *piStack_240;
  undefined *puStack_230;
  long *plStack_228;
  ulong uStack_220;
  undefined8 uStack_210;
  undefined8 uStack_208;
  undefined *puStack_200;
  long *plStack_1f8;
  long lStack_1f0;
  undefined8 uStack_1e8;
  long *plStack_1e0;
  undefined8 *puStack_1d8;
  undefined8 *puStack_1d0;
  undefined8 *puStack_1c8;
  ulong *puStack_1c0;
  ulong *puStack_1b8;
  ulong *puStack_1b0;
  undefined1 auStack_1a0 [16];
  undefined1 auStack_190 [16];
  long *plStack_180;
  long *plStack_178;
  long *plStack_170;
  byte bStack_168;
  uint7 uStack_167;
  int *piStack_160;
  int *piStack_158;
  ulong *puStack_150;
  ulong *puStack_148;
  ulong *puStack_140;
  undefined *puStack_138;
  byte bStack_130;
  ulong uStack_128;
  byte bStack_120;
  undefined7 uStack_11f;
  uint uStack_118;
  uint uStack_114;
  uint uStack_110;
  uint uStack_10c;
  uint uStack_108;
  uint uStack_104;
  uint uStack_100;
  uint uStack_fc;
  uint uStack_f8;
  undefined4 uStack_f4;
  undefined4 uStack_f0;
  undefined4 uStack_ec;
  undefined4 uStack_e8;
  undefined4 uStack_e4;
  undefined4 uStack_e0;
  undefined4 uStack_dc;
  undefined4 uStack_d8;
  undefined4 uStack_d4;
  undefined4 uStack_d0;
  undefined4 uStack_cc;
  undefined4 uStack_c8;
  undefined4 uStack_c4;
  undefined4 uStack_c0;
  undefined4 uStack_bc;
  
  if ((*(ushort *)((long)param_2 - (long)*param_2) < 0x11) ||
     (uVar29 = (ulong)((ushort *)((long)param_2 - (long)*param_2))[8], uVar29 == 0)) {
LAB_00735eb4:
    uVar29 = 0;
    bStack_120 = 0xd8;
    uStack_11f = 0x30a6;
    uStack_118 = CONCAT31(uStack_118._1_3_,1);
  }
  else {
    puVar55 = (uint *)((long)param_2 + uVar29);
    puVar55 = (uint *)((long)puVar55 + (ulong)*puVar55);
    pbVar54 = (byte *)((long)puVar55 + (ulong)*puVar55 + 2);
    bVar3 = *pbVar54;
    if ((bVar3 & 0xfc) != 0x24) goto LAB_00735eb4;
    bVar4 = *(byte *)((long)puVar55 + (ulong)*puVar55 + 3);
    uVar51 = bVar3 & 3;
    lVar41 = 1L << uVar51;
    puVar55 = (uint *)(pbVar54 + -(ulong)bVar4);
    if (bVar4 < 4) {
      if (1 < bVar4) {
        lVar56 = (long)puVar55 - (ulong)(ushort)*puVar55;
        bStack_120 = (byte)lVar56;
        uStack_11f = (undefined7)((ulong)lVar56 >> 8);
        goto joined_r0x0073c6bc;
      }
      lVar56 = (long)puVar55 - (ulong)(byte)*puVar55;
      bStack_120 = (byte)lVar56;
      uStack_11f = (undefined7)((ulong)lVar56 >> 8);
      if (1 < uVar51) goto LAB_0073c654;
LAB_0073c6c0:
      uStack_118 = CONCAT31(uStack_118._1_3_,(char)lVar41);
      if ((bVar3 & 3) == 0) {
        uVar29 = (ulong)*(byte *)(lVar56 + -lVar41);
      }
      else {
        uVar29 = (ulong)*(ushort *)(lVar56 + -lVar41);
      }
    }
    else {
      if (bVar4 < 8) {
        lVar56 = (long)puVar55 - (ulong)*puVar55;
        bStack_120 = (byte)lVar56;
        uStack_11f = (undefined7)((ulong)lVar56 >> 8);
      }
      else {
        lVar56 = (long)puVar55 - *(long *)puVar55;
        bStack_120 = (byte)lVar56;
        uStack_11f = (undefined7)((ulong)lVar56 >> 8);
      }
joined_r0x0073c6bc:
      if (uVar51 < 2) goto LAB_0073c6c0;
LAB_0073c654:
      uStack_118 = CONCAT31(uStack_118._1_3_,(char)lVar41);
      if (uVar51 == 2) {
        uVar29 = (ulong)*(uint *)(lVar56 + -4);
      }
      else {
        uVar29 = *(ulong *)(lVar56 - lVar41);
      }
    }
  }
  uStack_110 = (uint)uVar29;
  uStack_10c = (uint)(uVar29 >> 0x20);
  auVar107 = FUN_006b0928(&bStack_120,&DAT_002c05ad);
  puVar44 = auVar107._0_8_;
  if (auVar107._8_8_ >> 0x20 == 9) {
    uVar51 = auVar107._8_4_ & 0xff;
    if (uVar51 < 4) {
      if (uVar51 < 2) {
        uVar29 = (ulong)(byte)*puVar44;
      }
      else {
        uVar29 = (ulong)(ushort)*puVar44;
      }
    }
    else if (uVar51 < 8) {
      uVar29 = (ulong)(uint)*puVar44;
    }
    else {
      uVar29 = *puVar44;
    }
    uVar51 = auVar107._9_4_ & 0xff;
    puStack_138 = (undefined *)((long)puVar44 - uVar29);
    bStack_130 = auVar107[9];
    lVar41 = -(ulong)bStack_130;
    if (uVar51 < 4) {
      if (uVar51 < 2) {
        uStack_128 = (ulong)(byte)puStack_138[lVar41];
      }
      else {
        uStack_128 = (ulong)*(ushort *)(puStack_138 + lVar41);
      }
    }
    else if (uVar51 < 8) {
      uStack_128 = (ulong)*(uint *)(puStack_138 + lVar41);
    }
    else {
      uStack_128 = *(ulong *)(puStack_138 + lVar41);
    }
  }
  else {
    uStack_128 = 0;
    puStack_138 = &DAT_0030a6d8;
    bStack_130 = 1;
  }
  puStack_150 = (ulong *)0x0;
  puStack_148 = (ulong *)0x0;
  puStack_140 = (ulong *)0x0;
  auVar107 = FUN_006b0928(&puStack_138,&DAT_002bccd7);
  uVar29 = auVar107._8_8_;
  puVar44 = auVar107._0_8_;
  if (auVar107._12_4_ - 9U < 2) {
    uVar51 = auVar107._8_4_ & 0xff;
    if (uVar51 < 4) {
      if (1 < uVar51) {
        uVar88 = (ulong)(ushort)*puVar44;
        uStack_348 = uVar29 >> 8 & 0xff;
        uVar51 = (uint)uStack_348;
        goto joined_r0x00736064;
      }
      uStack_348 = uVar29 >> 8 & 0xff;
      puStack_358 = (undefined1 *)((long)puVar44 - (ulong)(byte)*puVar44);
      lVar41 = -uStack_348;
      if (3 < (uint)uStack_348) goto LAB_00735fb4;
LAB_00736068:
      if ((uint)uStack_348 < 2) {
        uStack_338 = (ulong)(byte)puStack_358[lVar41];
      }
      else {
        uStack_338 = (ulong)*(ushort *)(puStack_358 + lVar41);
      }
      if (puStack_358 == &DAT_0030a6d9) goto LAB_0073796c;
    }
    else {
      if (uVar51 < 8) {
        uVar88 = (ulong)(uint)*puVar44;
        uStack_348 = uVar29 >> 8 & 0xff;
        uVar51 = (uint)uStack_348;
      }
      else {
        uVar88 = *puVar44;
        uStack_348 = uVar29 >> 8 & 0xff;
        uVar51 = (uint)uStack_348;
      }
joined_r0x00736064:
      lVar41 = -uStack_348;
      puStack_358 = (undefined1 *)((long)puVar44 - uVar88);
      if (uVar51 < 4) goto LAB_00736068;
LAB_00735fb4:
      if ((uint)uStack_348 < 8) {
        uStack_338 = (ulong)*(uint *)(puStack_358 + lVar41);
      }
      else {
        uStack_338 = *(ulong *)(puStack_358 + lVar41);
      }
      if (puStack_358 == &DAT_0030a6d9) goto LAB_0073796c;
    }
    FUN_007433d0(&puStack_150,uStack_338);
    uVar62 = _UNK_00307e88;
    uVar104 = _DAT_00307e80;
    if (uStack_338 != 0) {
      uVar29 = 0;
      piVar64 = (int *)((ulong)&bStack_250 | 1);
      uStack_318 = (undefined4)_UNK_00307e88;
      uStack_314 = (undefined4)((ulong)_UNK_00307e88 >> 0x20);
      do {
        bVar3 = puStack_358[uVar29 + uStack_338 * uStack_348];
        if ((bVar3 & 0xfc) == 0x24) {
          puVar44 = (ulong *)(puStack_358 + uVar29 * uStack_348);
          uVar51 = (uint)uStack_348;
          if (uVar51 < 4) {
            if (uVar51 < 2) {
              uVar88 = (ulong)(byte)*puVar44;
            }
            else {
              uVar88 = (ulong)(ushort)*puVar44;
            }
          }
          else if (uVar51 < 8) {
            uVar88 = (ulong)(uint)*puVar44;
          }
          else {
            uVar88 = *puVar44;
          }
          uVar51 = bVar3 & 3;
          lVar41 = (long)puVar44 - uVar88;
          bStack_120 = (byte)lVar41;
          uStack_11f = (undefined7)((ulong)lVar41 >> 8);
          lVar56 = -(1L << uVar51);
          uStack_118 = CONCAT31(uStack_118._1_3_,(char)(1L << uVar51));
          if (uVar51 < 2) {
            if ((bVar3 & 3) == 0) {
              uVar88 = (ulong)*(byte *)(lVar41 + lVar56);
            }
            else {
              uVar88 = (ulong)*(ushort *)(lVar41 + lVar56);
            }
          }
          else if (uVar51 == 2) {
            uVar88 = (ulong)*(uint *)(lVar41 + -4);
          }
          else {
            uVar88 = *(ulong *)(lVar41 + lVar56);
          }
        }
        else {
          uVar88 = 0;
          bStack_120 = 0xd8;
          uStack_11f = 0x30a6;
          uStack_118 = CONCAT31(uStack_118._1_3_,1);
        }
        uStack_110 = (uint)uVar88;
        uStack_10c = (uint)(uVar88 >> 0x20);
        puVar26 = (undefined8 *)FUN_0061e82c();
        (**(code **)*puVar26)(&plStack_180);
        plVar65 = plStack_180;
        auVar107 = FUN_006b0928(&bStack_120,&DAT_002e82f0);
        puVar44 = auVar107._0_8_;
        uVar51 = auVar107._8_4_;
        if (auVar107._12_4_ == 4) {
          if ((uVar51 & 0xff) < 4) {
            if ((uVar51 & 0xff) < 2) goto LAB_00736284;
LAB_007362a0:
            uVar88 = (ulong)(ushort)*puVar44;
          }
          else {
LAB_007362a8:
            if ((uVar51 & 0xff) < 8) {
              uVar88 = (ulong)(uint)*puVar44;
            }
            else {
              uVar88 = *puVar44;
            }
          }
LAB_007362c8:
          pbVar54 = (byte *)((long)puVar44 - uVar88);
        }
        else {
          if (auVar107._12_4_ == 5) {
            if (3 < (uVar51 & 0xff)) goto LAB_007362a8;
            if (1 < (uVar51 & 0xff)) goto LAB_007362a0;
LAB_00736284:
            uVar88 = (ulong)(byte)*puVar44;
            goto LAB_007362c8;
          }
          pbVar54 = DAT_01342af0;
        }
        (**(code **)(*plVar65 + 0x18))(plVar65,pbVar54);
        plVar65 = plStack_180;
        auVar107 = FUN_006b0928(&bStack_120,&DAT_002a798f);
        puVar44 = auVar107._0_8_;
        uVar51 = auVar107._8_4_;
        if (auVar107._12_4_ == 4) {
          if ((uVar51 & 0xff) < 4) {
            if ((uVar51 & 0xff) < 2) goto LAB_00736318;
LAB_00736334:
            uVar88 = (ulong)(ushort)*puVar44;
          }
          else {
LAB_0073633c:
            if ((uVar51 & 0xff) < 8) {
              uVar88 = (ulong)(uint)*puVar44;
            }
            else {
              uVar88 = *puVar44;
            }
          }
LAB_0073635c:
          pbVar54 = (byte *)((long)puVar44 - uVar88);
        }
        else {
          if (auVar107._12_4_ == 5) {
            if (3 < (uVar51 & 0xff)) goto LAB_0073633c;
            if (1 < (uVar51 & 0xff)) goto LAB_00736334;
LAB_00736318:
            uVar88 = (ulong)(byte)*puVar44;
            goto LAB_0073635c;
          }
          pbVar54 = DAT_01342af0;
        }
        uStack_210._0_4_ = 0;
        uStack_210._4_4_ = 0;
        uStack_208._0_4_ = 0;
        uStack_208._4_4_ = 0;
        puStack_200 = (undefined *)0x0;
        bStack_250 = 0;
        uStack_24f = 0;
        bStack_248 = 0;
        uStack_247 = 0;
        piStack_240 = (int *)0x0;
        (**(code **)(*plVar65 + 0x20))(plVar65,pbVar54,&uStack_210,&bStack_250);
        if (CONCAT71(uStack_24f,bStack_250) != 0) {
          bStack_248 = bStack_250;
          uStack_247 = uStack_24f;
          _ZdlPv();
        }
        if (CONCAT44(uStack_210._4_4_,(undefined4)uStack_210) != 0) {
          uStack_208._0_4_ = (undefined4)uStack_210;
          uStack_208._4_4_ = uStack_210._4_4_;
          _ZdlPv();
        }
        auVar107 = FUN_006b0928(&bStack_120,&DAT_002dd96b);
        puVar44 = auVar107._0_8_;
        uStack_210._0_4_ = auVar107._0_4_;
        uStack_210._4_4_ = auVar107._4_4_;
        uStack_208._0_4_ = auVar107._8_4_;
        uStack_208._4_4_ = auVar107._12_4_;
        if (auVar107._8_8_ >> 0x20 == 0x1a) {
          uVar51 = (uint)uStack_208 & 0xff;
          if (uVar51 < 4) {
            if (uVar51 < 2) {
              uVar88 = (ulong)(byte)*puVar44;
            }
            else {
              uVar88 = (ulong)(ushort)*puVar44;
            }
          }
          else if (uVar51 < 8) {
            uVar88 = (ulong)(uint)*puVar44;
          }
          else {
            uVar88 = *puVar44;
          }
        }
        else {
          uVar88 = FUN_00742b40(&uStack_210);
        }
        if (uVar88 != 0) {
          FUN_00709c8c(plStack_180,0);
        }
        auVar107 = FUN_006b0928(&bStack_120,&DAT_002b2a08);
        uStack_210._0_4_ = auVar107._0_4_;
        uStack_210._4_4_ = auVar107._4_4_;
        uStack_208._0_4_ = auVar107._8_4_;
        uStack_208._4_4_ = auVar107._12_4_;
        uVar51 = FUN_006b37e8(&uStack_210);
        if (uVar51 < 7) {
          lVar41 = (ulong)uVar51 * 4;
          uVar99 = *(undefined4 *)(&DAT_0030ab5c + lVar41);
          uVar100 = *(undefined4 *)(&DAT_0030ab78 + lVar41);
          uVar105 = *(undefined4 *)(&DAT_0030ab94 + lVar41);
        }
        else {
          uVar99 = 0;
          uVar105 = 5;
          uVar100 = 4;
        }
        (**(code **)(*plStack_180 + 0x58))
                  (plStack_180,0,uVar99,uVar99,uVar100,uVar100,uVar105,uVar105);
        auVar107 = FUN_006b0928(&bStack_120,&DAT_002a7985);
        puVar44 = auVar107._0_8_;
        if (auVar107._12_4_ - 9U < 2) {
          uVar51 = auVar107._8_4_ & 0xff;
          if (uVar51 < 4) {
            if (uVar51 < 2) {
              uVar88 = (ulong)(byte)*puVar44;
            }
            else {
              uVar88 = (ulong)(ushort)*puVar44;
            }
          }
          else if (uVar51 < 8) {
            uVar88 = (ulong)(uint)*puVar44;
          }
          else {
            uVar88 = *puVar44;
          }
          uVar30 = auVar107._8_8_ >> 8 & 0xff;
          lVar41 = -(auVar107._8_8_ >> 8 & 0xff);
          uVar51 = (uint)uVar30;
          if (uVar51 < 4) {
            if (uVar51 < 2) {
              uVar45 = (ulong)*(byte *)((long)puVar44 + (lVar41 - uVar88));
            }
            else {
              uVar45 = (ulong)*(ushort *)((long)puVar44 + (lVar41 - uVar88));
            }
          }
          else if (uVar51 < 8) {
            uVar45 = (ulong)*(uint *)((long)puVar44 + (lVar41 - uVar88));
          }
          else {
            uVar45 = *(ulong *)((long)puVar44 + (lVar41 - uVar88));
          }
          if (uVar45 != 0) {
            uVar67 = 0;
LAB_00736590:
            do {
              plVar65 = plStack_180;
              puVar36 = (ulong *)((long)puVar44 + (uVar67 * uVar30 - uVar88));
              bVar3 = *(byte *)((long)puVar44 + uVar67 + (uVar45 * uVar30 - uVar88)) >> 2;
              if (bVar3 == 4) {
                if (uVar51 < 4) {
                  if (uVar51 < 2) goto LAB_007365c0;
LAB_00736628:
                  uVar46 = (ulong)(ushort)*puVar36;
                }
                else {
LAB_00736630:
                  if (uVar51 < 8) {
                    uVar46 = (ulong)(uint)*puVar36;
                  }
                  else {
                    uVar46 = *puVar36;
                  }
                }
LAB_00736650:
                pbVar54 = (byte *)((long)puVar36 - uVar46);
              }
              else {
                if (bVar3 == 5) {
                  if (3 < uVar51) goto LAB_00736630;
                  if (1 < uVar51) goto LAB_00736628;
LAB_007365c0:
                  uVar46 = (ulong)(byte)*puVar36;
                  goto LAB_00736650;
                }
                pbVar54 = DAT_01342af0;
              }
              uVar46 = strlen(pbVar54);
              if (0xffffffffffffffef < uVar46) {
                    /* WARNING: Subroutine does not return */
                FUN_005fbe6c(&uStack_210);
              }
              if (uVar46 < 0x17) {
                uStack_210._0_4_ = CONCAT31(uStack_210._1_3_,(char)((int)uVar46 << 1));
                uVar74 = (ulong)&uStack_210 | 1;
                if (uVar46 != 0) goto LAB_007366cc;
              }
              else {
                uVar74 = _Znwm((uVar46 | 0xf) + 1);
                uStack_210 = (undefined1 *)((uVar46 | 0xf) + 2);
                uStack_208._4_4_ = (uint)(uVar46 >> 0x20);
                uStack_208._0_4_ = (int)uVar46;
                puStack_200 = (undefined *)uVar74;
LAB_007366cc:
                memmove(uVar74,pbVar54,uVar46);
              }
              *(undefined1 *)(uVar74 + uVar46) = 0;
              uVar46 = (**(code **)(*plVar65 + 0x70))(plVar65,&uStack_210);
              if (((ulong)uStack_210 & 1) != 0) {
                _ZdlPv(puStack_200);
              }
              if ((uVar46 & 0xff00000000) != 0) {
                FUN_007096c0(plStack_180,pbVar54);
                uStack_210._0_4_ = CONCAT31(uStack_210._1_3_,1);
                uStack_210._4_4_ = 0;
                FUN_007096c8(plStack_180,uVar46 & 0xffffffff,&uStack_210);
                uVar67 = uVar67 + 1;
                if (uVar67 == uVar45) break;
                goto LAB_00736590;
              }
              uVar46 = 0xcbf29ce484222325;
              bVar3 = *pbVar54;
              while (bVar3 != 0) {
                pbVar54 = pbVar54 + 1;
                uVar46 = (uVar46 ^ bVar3) * 0x100000001b3;
                bVar3 = *pbVar54;
              }
              (**(code **)(*plStack_180 + 0x38))(plStack_180,uVar46,1);
              uVar67 = uVar67 + 1;
            } while (uVar67 != uVar45);
          }
        }
        auVar107 = FUN_006b0928(&bStack_120,&DAT_0029c528);
        puVar44 = auVar107._0_8_;
        if (auVar107._8_8_ >> 0x20 == 9) {
          uVar51 = auVar107._8_4_ & 0xff;
          if (uVar51 < 4) {
            if (uVar51 < 2) {
              uVar88 = (ulong)(byte)*puVar44;
            }
            else {
              uVar88 = (ulong)(ushort)*puVar44;
            }
          }
          else if (uVar51 < 8) {
            uVar88 = (ulong)(uint)*puVar44;
          }
          else {
            uVar88 = *puVar44;
          }
          uVar51 = auVar107._9_4_ & 0xff;
          uStack_210 = (undefined1 *)((long)puVar44 - uVar88);
          lVar41 = -(ulong)auVar107[9];
          uStack_208._0_4_ = CONCAT31(uStack_208._1_3_,auVar107[9]);
          if (uVar51 < 4) {
            if (uVar51 < 2) {
              puStack_200 = (undefined *)(ulong)(byte)uStack_210[lVar41];
            }
            else {
              puStack_200 = (undefined *)(ulong)*(ushort *)(uStack_210 + lVar41);
            }
          }
          else if (uVar51 < 8) {
            puStack_200 = (undefined *)(ulong)*(uint *)(uStack_210 + lVar41);
          }
          else {
            puStack_200 = *(undefined **)(uStack_210 + lVar41);
          }
        }
        else {
          puStack_200 = (undefined *)0x0;
          uStack_210 = &DAT_0030a6d8;
          uStack_208._0_4_ = CONCAT31(uStack_208._1_3_,1);
        }
        auVar107 = FUN_006b0928(&uStack_210,&DAT_002c4418);
        puVar44 = auVar107._0_8_;
        if (auVar107._8_8_ >> 0x20 == 9) {
          uVar51 = auVar107._8_4_ & 0xff;
          if (uVar51 < 4) {
            if (uVar51 < 2) {
              uVar88 = (ulong)(byte)*puVar44;
            }
            else {
              uVar88 = (ulong)(ushort)*puVar44;
            }
          }
          else if (uVar51 < 8) {
            uVar88 = (ulong)(uint)*puVar44;
          }
          else {
            uVar88 = *puVar44;
          }
          uVar30 = auVar107._8_8_ >> 8 & 0xff;
          lVar41 = -(ulong)auVar107[9];
          uVar51 = (uint)uVar30;
          if (uVar51 < 4) {
            if (uVar51 < 2) {
              uVar45 = (ulong)*(byte *)((long)puVar44 + (lVar41 - uVar88));
            }
            else {
              uVar45 = (ulong)*(ushort *)((long)puVar44 + (lVar41 - uVar88));
            }
          }
          else if (uVar51 < 8) {
            uVar45 = (ulong)*(uint *)((long)puVar44 + (lVar41 - uVar88));
          }
          else {
            uVar45 = *(ulong *)((long)puVar44 + (lVar41 - uVar88));
          }
          if (uVar45 != 0) {
            uVar67 = 0;
            puVar36 = (ulong *)((long)puVar44 + ((uVar30 + (ulong)auVar107[9] * -4) - uVar88));
            lVar41 = -uVar30;
            do {
              if (uVar51 < 4) {
                if (uVar51 < 2) {
                  uVar46 = (ulong)(byte)*puVar36;
                  goto LAB_0073697c;
                }
                uVar46 = (ulong)(ushort)*puVar36;
                uVar52 = *(ushort *)((long)puVar36 + uVar30) & 0xff;
                uVar74 = (ulong)*(ushort *)((long)puVar36 + uVar30) & 0xff;
joined_r0x0073696c:
                lVar85 = -uVar74;
                lVar56 = (long)puVar36 - uVar46;
                if (3 < uVar52) goto LAB_00736910;
LAB_00736998:
                if (uVar52 < 2) {
                  uVar46 = (ulong)*(byte *)(lVar56 + lVar85);
                  puVar55 = (uint *)(lVar56 + uVar74 * uVar67);
                }
                else {
                  uVar46 = (ulong)*(ushort *)(lVar56 + lVar85);
                  puVar55 = (uint *)(lVar56 + uVar74 * uVar67);
                }
joined_r0x007369b0:
                if (uVar67 < uVar46) goto LAB_00736930;
LAB_00736a04:
                pbVar54 = DAT_01342af0;
              }
              else {
                if (7 < uVar51) {
                  uVar46 = *puVar36;
LAB_0073697c:
                  uVar74 = (ulong)*(byte *)((long)puVar36 + uVar30);
                  uVar52 = (uint)*(byte *)((long)puVar36 + uVar30);
                  goto joined_r0x0073696c;
                }
                lVar56 = (long)puVar36 - (ulong)(uint)*puVar36;
                uVar52 = *(uint *)((long)puVar36 + uVar30) & 0xff;
                uVar74 = (ulong)*(uint *)((long)puVar36 + uVar30) & 0xff;
                lVar85 = -uVar74;
                if (uVar52 < 4) goto LAB_00736998;
LAB_00736910:
                if (7 < uVar52) {
                  uVar46 = *(ulong *)(lVar56 + lVar85);
                  puVar55 = (uint *)(lVar56 + uVar74 * uVar67);
                  goto joined_r0x007369b0;
                }
                puVar55 = (uint *)(lVar56 + uVar74 * uVar67);
                if (*(uint *)(lVar56 + lVar85) <= uVar67) goto LAB_00736a04;
LAB_00736930:
                if (uVar52 < 4) {
                  if (uVar52 < 2) {
                    pbVar54 = (byte *)((long)puVar55 - (ulong)(byte)*puVar55);
                  }
                  else {
                    pbVar54 = (byte *)((long)puVar55 - (ulong)(ushort)*puVar55);
                  }
                }
                else if (uVar52 < 8) {
                  pbVar54 = (byte *)((long)puVar55 - (ulong)*puVar55);
                }
                else {
                  pbVar54 = (byte *)((long)puVar55 - *(long *)puVar55);
                }
              }
              if (uVar51 < 4) {
                if (1 < uVar51) {
                  uVar46 = (ulong)*(ushort *)((long)puVar44 + (lVar41 - uVar88));
                  goto joined_r0x00736a90;
                }
                uVar46 = (ulong)*(byte *)((long)puVar44 + (lVar41 - uVar88));
                if (uVar46 <= uVar67) goto LAB_00736a50;
LAB_00736a94:
                uVar74 = 1;
                bVar3 = *(byte *)((long)puVar44 + uVar67 + (uVar46 * uVar30 - uVar88));
                if ((bVar3 >> 2) - 9 < 2) {
                  puVar38 = (ulong *)((long)puVar44 + (uVar67 * uVar30 - uVar88));
                  if (uVar51 < 4) {
                    if (1 < uVar51) {
                      uVar46 = (ulong)(ushort)*puVar38;
                      goto joined_r0x00736b80;
                    }
                    uVar46 = (ulong)bVar3 & 3;
                    puVar76 = (undefined1 *)((long)puVar38 - (ulong)(byte)*puVar38);
                    uVar74 = 1L << uVar46;
                    uVar52 = (uint)uVar46;
                    lVar56 = -uVar74;
                    if (1 < uVar52) goto LAB_00736b34;
LAB_00736b84:
                    if (uVar52 == 0) {
                      uVar46 = (ulong)(byte)puVar76[lVar56];
                      uVar74 = 1;
                    }
                    else {
                      uVar46 = (ulong)*(ushort *)(puVar76 + lVar56);
                    }
                  }
                  else {
                    if (uVar51 < 8) {
                      uVar46 = (ulong)(uint)*puVar38;
                    }
                    else {
                      uVar46 = *puVar38;
                    }
joined_r0x00736b80:
                    uVar52 = bVar3 & 3;
                    uVar74 = 1L << ((ulong)bVar3 & 3);
                    lVar56 = -uVar74;
                    puVar76 = (undefined1 *)((long)puVar38 - uVar46);
                    if (uVar52 < 2) goto LAB_00736b84;
LAB_00736b34:
                    if (uVar52 != 2) {
                      uVar46 = *(ulong *)(puVar76 + lVar56);
                      lVar56 = uVar46 << 2;
                      if (uVar46 >> 0x3e != 0) {
                        lVar56 = -1;
                      }
                      goto LAB_00736bb4;
                    }
                    uVar46 = (ulong)*(uint *)(puVar76 + lVar56);
                    uVar74 = 4;
                  }
                  lVar56 = uVar46 << 2;
                }
                else {
                  uVar46 = 0;
                  puVar76 = &DAT_0030a6d9;
                  lVar56 = 0;
                }
              }
              else {
                if (uVar51 < 8) {
                  uVar46 = (ulong)*(uint *)((long)puVar44 + (lVar41 - uVar88));
                }
                else {
                  uVar46 = *(ulong *)((long)puVar44 + (lVar41 - uVar88));
                }
joined_r0x00736a90:
                if (uVar67 < uVar46) goto LAB_00736a94;
LAB_00736a50:
                uVar46 = 0;
                uVar74 = 1;
                puVar76 = &DAT_0030a6d9;
                lVar56 = 0;
              }
LAB_00736bb4:
              pfVar25 = (float *)_Znam(lVar56);
              memset(pfVar25,0,lVar56);
              if (uVar46 != 0) {
                uVar74 = uVar74 & 0xffffffff;
                pbVar72 = puVar76 + uVar46 * uVar74;
                uVar83 = uVar46;
                pfVar82 = pfVar25;
                do {
                  uStack_247 = (uint7)(((ulong)(*pbVar72 >> 2) << 0x20) >> 8) |
                               (uint7)(uint)(1 << ((ulong)*pbVar72 & 3)) | (uint7)(uVar74 >> 8);
                  bStack_250 = (byte)puVar76;
                  uStack_24f = (uint7)((ulong)puVar76 >> 8);
                  bStack_248 = (byte)uVar74;
                  dVar94 = (double)FUN_006b3dec(&bStack_250);
                  uVar83 = uVar83 - 1;
                  puVar76 = puVar76 + uVar74;
                  *pfVar82 = (float)dVar94;
                  pbVar72 = pbVar72 + 1;
                  pfVar82 = pfVar82 + 1;
                } while (uVar83 != 0);
              }
              uVar74 = 0xcbf29ce484222325;
              bVar3 = *pbVar54;
              while (bVar3 != 0) {
                pbVar54 = pbVar54 + 1;
                uVar74 = (uVar74 ^ bVar3) * 0x100000001b3;
                bVar3 = *pbVar54;
              }
              (**(code **)(*plStack_180 + 0x30))(plStack_180,uVar74,pfVar25,uVar46 & 0xffffffff);
              _ZdaPv(pfVar25);
              uVar67 = uVar67 + 1;
            } while (uVar67 != uVar45);
          }
        }
        auVar107 = FUN_006b0928(&uStack_210,&DAT_002fe158);
        puVar44 = auVar107._0_8_;
        if (auVar107._8_8_ >> 0x20 == 9) {
          uVar51 = auVar107._8_4_ & 0xff;
          if (uVar51 < 4) {
            if (uVar51 < 2) {
              uVar88 = (ulong)(byte)*puVar44;
            }
            else {
              uVar88 = (ulong)(ushort)*puVar44;
            }
          }
          else if (uVar51 < 8) {
            uVar88 = (ulong)(uint)*puVar44;
          }
          else {
            uVar88 = *puVar44;
          }
          uVar30 = auVar107._8_8_ >> 8 & 0xff;
          lVar41 = -(ulong)auVar107[9];
          uVar51 = (uint)uVar30;
          if (uVar51 < 4) {
            if (uVar51 < 2) {
              uVar45 = (ulong)*(byte *)((long)puVar44 + (lVar41 - uVar88));
            }
            else {
              uVar45 = (ulong)*(ushort *)((long)puVar44 + (lVar41 - uVar88));
            }
          }
          else if (uVar51 < 8) {
            uVar45 = (ulong)*(uint *)((long)puVar44 + (lVar41 - uVar88));
          }
          else {
            uVar45 = *(ulong *)((long)puVar44 + (lVar41 - uVar88));
          }
          if (uVar45 != 0) {
            uVar67 = 0;
            lVar41 = -uVar30;
            puVar36 = (ulong *)((long)puVar44 + ((uVar30 + (ulong)auVar107[9] * -4) - uVar88));
            do {
              plVar65 = plStack_180;
              if (uVar51 < 4) {
                if (uVar51 < 2) {
                  uVar46 = (ulong)(byte)*puVar36;
                  goto LAB_00736e24;
                }
                uVar46 = (ulong)(ushort)*puVar36;
                uVar52 = *(ushort *)((long)puVar36 + uVar30) & 0xff;
                uVar74 = (ulong)*(ushort *)((long)puVar36 + uVar30) & 0xff;
joined_r0x00736e18:
                lVar85 = -uVar74;
                lVar56 = (long)puVar36 - uVar46;
                if (3 < uVar52) goto LAB_00736dbc;
LAB_00736e40:
                if (uVar52 < 2) {
                  uVar46 = (ulong)*(byte *)(lVar56 + lVar85);
                  puVar55 = (uint *)(lVar56 + uVar74 * uVar67);
                }
                else {
                  uVar46 = (ulong)*(ushort *)(lVar56 + lVar85);
                  puVar55 = (uint *)(lVar56 + uVar74 * uVar67);
                }
joined_r0x00736e5c:
                if (uVar67 < uVar46) goto LAB_00736de0;
LAB_00736eb8:
                pbVar54 = DAT_01342af0;
              }
              else {
                if (7 < uVar51) {
                  uVar46 = *puVar36;
LAB_00736e24:
                  uVar74 = (ulong)*(byte *)((long)puVar36 + uVar30);
                  uVar52 = (uint)*(byte *)((long)puVar36 + uVar30);
                  goto joined_r0x00736e18;
                }
                uVar52 = *(uint *)((long)puVar36 + uVar30) & 0xff;
                uVar74 = (ulong)*(uint *)((long)puVar36 + uVar30) & 0xff;
                lVar56 = (long)puVar36 - (ulong)(uint)*puVar36;
                lVar85 = -uVar74;
                if (uVar52 < 4) goto LAB_00736e40;
LAB_00736dbc:
                if (7 < uVar52) {
                  uVar46 = *(ulong *)(lVar56 + lVar85);
                  puVar55 = (uint *)(lVar56 + uVar74 * uVar67);
                  goto joined_r0x00736e5c;
                }
                puVar55 = (uint *)(lVar56 + uVar74 * uVar67);
                if (*(uint *)(lVar56 + lVar85) <= uVar67) goto LAB_00736eb8;
LAB_00736de0:
                if (uVar52 < 4) {
                  if (uVar52 < 2) {
                    pbVar54 = (byte *)((long)puVar55 - (ulong)(byte)*puVar55);
                  }
                  else {
                    pbVar54 = (byte *)((long)puVar55 - (ulong)(ushort)*puVar55);
                  }
                }
                else if (uVar52 < 8) {
                  pbVar54 = (byte *)((long)puVar55 - (ulong)*puVar55);
                }
                else {
                  pbVar54 = (byte *)((long)puVar55 - *(long *)puVar55);
                }
              }
              uVar46 = 0xcbf29ce484222325;
              bVar3 = *pbVar54;
              while (bVar3 != 0) {
                pbVar54 = pbVar54 + 1;
                uVar46 = (uVar46 ^ bVar3) * 0x100000001b3;
                bVar3 = *pbVar54;
              }
              if (uVar51 < 4) {
                if (1 < uVar51) {
                  uVar74 = (ulong)*(ushort *)((long)puVar44 + (lVar41 - uVar88));
                  goto joined_r0x00736f40;
                }
                uVar74 = (ulong)*(byte *)((long)puVar44 + (lVar41 - uVar88));
                if (uVar74 <= uVar67) goto LAB_00736f44;
LAB_00736d24:
                bVar3 = *(byte *)((long)puVar44 + uVar67 + (uVar74 * uVar30 - uVar88));
                lVar56 = (long)puVar44 + (uVar67 * uVar30 - uVar88);
                uVar74 = (ulong)(bVar3 >> 2) << 0x20 | (ulong)(uint)(1 << ((ulong)bVar3 & 3)) << 8 |
                         uVar30;
              }
              else {
                if (uVar51 < 8) {
                  uVar74 = (ulong)*(uint *)((long)puVar44 + (lVar41 - uVar88));
                }
                else {
                  uVar74 = *(ulong *)((long)puVar44 + (lVar41 - uVar88));
                }
joined_r0x00736f40:
                if (uVar67 < uVar74) goto LAB_00736d24;
LAB_00736f44:
                lVar56 = 0;
                uVar74 = 0x101;
              }
              bStack_250 = (byte)lVar56;
              uStack_24f = (uint7)((ulong)lVar56 >> 8);
              bStack_248 = (byte)uVar74;
              uStack_247 = (uint7)(uVar74 >> 8);
              FUN_006b3dec(&bStack_250);
              (**(code **)(*plVar65 + 0x28))(plVar65,uVar46);
              uVar67 = uVar67 + 1;
            } while (uVar67 != uVar45);
          }
        }
        auVar107 = FUN_006b0928(&uStack_210,&DAT_002f68d7);
        puVar44 = auVar107._0_8_;
        if (auVar107._8_8_ >> 0x20 == 9) {
          uVar51 = auVar107._8_4_ & 0xff;
          if (uVar51 < 4) {
            if (uVar51 < 2) {
              uVar88 = (ulong)(byte)*puVar44;
            }
            else {
              uVar88 = (ulong)(ushort)*puVar44;
            }
          }
          else if (uVar51 < 8) {
            uVar88 = (ulong)(uint)*puVar44;
          }
          else {
            uVar88 = *puVar44;
          }
          uVar30 = auVar107._8_8_ >> 8 & 0xff;
          bVar3 = auVar107[9];
          lVar41 = -(ulong)bVar3;
          uVar51 = (uint)uVar30;
          if (uVar51 < 4) {
            if (uVar51 < 2) {
              uVar45 = (ulong)*(byte *)((long)puVar44 + (lVar41 - uVar88));
            }
            else {
              uVar45 = (ulong)*(ushort *)((long)puVar44 + (lVar41 - uVar88));
            }
          }
          else if (uVar51 < 8) {
            uVar45 = (ulong)*(uint *)((long)puVar44 + (lVar41 - uVar88));
          }
          else {
            uVar45 = *(ulong *)((long)puVar44 + (lVar41 - uVar88));
          }
          if (uVar45 != 0) {
            uVar67 = 0;
            lVar41 = -uVar30;
            puVar36 = (ulong *)((long)puVar44 + ((uVar30 + (ulong)bVar3 * -4) - uVar88));
            do {
              plVar65 = plStack_180;
              if (uVar51 < 4) {
                if (uVar51 < 2) {
                  uVar46 = (ulong)(byte)*puVar36;
                  goto LAB_00737108;
                }
                uVar46 = (ulong)(ushort)*puVar36;
                uVar52 = *(ushort *)((long)puVar36 + uVar30) & 0xff;
                uVar74 = (ulong)*(ushort *)((long)puVar36 + uVar30) & 0xff;
joined_r0x007370fc:
                lVar85 = -uVar74;
                lVar56 = (long)puVar36 - uVar46;
                if (3 < uVar52) goto LAB_007370a0;
LAB_00737124:
                if (uVar52 < 2) {
                  uVar46 = (ulong)*(byte *)(lVar56 + lVar85);
                  puVar55 = (uint *)(lVar56 + uVar74 * uVar67);
                }
                else {
                  uVar46 = (ulong)*(ushort *)(lVar56 + lVar85);
                  puVar55 = (uint *)(lVar56 + uVar74 * uVar67);
                }
joined_r0x00737140:
                if (uVar67 < uVar46) goto LAB_007370c4;
LAB_0073719c:
                pbVar54 = DAT_01342af0;
              }
              else {
                if (7 < uVar51) {
                  uVar46 = *puVar36;
LAB_00737108:
                  uVar74 = (ulong)*(byte *)((long)puVar36 + uVar30);
                  uVar52 = (uint)*(byte *)((long)puVar36 + uVar30);
                  goto joined_r0x007370fc;
                }
                uVar52 = *(uint *)((long)puVar36 + uVar30) & 0xff;
                uVar74 = (ulong)*(uint *)((long)puVar36 + uVar30) & 0xff;
                lVar56 = (long)puVar36 - (ulong)(uint)*puVar36;
                lVar85 = -uVar74;
                if (uVar52 < 4) goto LAB_00737124;
LAB_007370a0:
                if (7 < uVar52) {
                  uVar46 = *(ulong *)(lVar56 + lVar85);
                  puVar55 = (uint *)(lVar56 + uVar74 * uVar67);
                  goto joined_r0x00737140;
                }
                puVar55 = (uint *)(lVar56 + uVar74 * uVar67);
                if (*(uint *)(lVar56 + lVar85) <= uVar67) goto LAB_0073719c;
LAB_007370c4:
                if (uVar52 < 4) {
                  if (uVar52 < 2) {
                    pbVar54 = (byte *)((long)puVar55 - (ulong)(byte)*puVar55);
                  }
                  else {
                    pbVar54 = (byte *)((long)puVar55 - (ulong)(ushort)*puVar55);
                  }
                }
                else if (uVar52 < 8) {
                  pbVar54 = (byte *)((long)puVar55 - (ulong)*puVar55);
                }
                else {
                  pbVar54 = (byte *)((long)puVar55 - *(long *)puVar55);
                }
              }
              uVar46 = 0xcbf29ce484222325;
              bVar4 = *pbVar54;
              while (bVar4 != 0) {
                pbVar54 = pbVar54 + 1;
                uVar46 = (uVar46 ^ bVar4) * 0x100000001b3;
                bVar4 = *pbVar54;
              }
              if (uVar51 < 4) {
                if (1 < uVar51) {
                  uVar74 = (ulong)*(ushort *)((long)puVar44 + (lVar41 - uVar88));
                  goto joined_r0x00737224;
                }
                uVar74 = (ulong)*(byte *)((long)puVar44 + (lVar41 - uVar88));
                if (uVar67 < uVar74) goto LAB_00737228;
LAB_00737028:
                auVar107._8_4_ = uStack_318;
                auVar107._0_8_ = uVar104;
                auVar107._12_4_ = uStack_314;
                bStack_248 = (byte)uVar62;
                uStack_247 = auVar107._9_7_;
                bStack_250 = (byte)uVar104;
                uStack_24f = (uint7)((ulong)uVar104 >> 8);
LAB_00737030:
                uVar74 = FUN_00742b40(&bStack_250);
              }
              else {
                if (uVar51 < 8) {
                  uVar74 = (ulong)*(uint *)((long)puVar44 + (lVar41 - uVar88));
                }
                else {
                  uVar74 = *(ulong *)((long)puVar44 + (lVar41 - uVar88));
                }
joined_r0x00737224:
                if (uVar74 <= uVar67) goto LAB_00737028;
LAB_00737228:
                bVar4 = *(byte *)((long)puVar44 + uVar67 + (uVar74 * uVar30 - uVar88));
                puVar38 = (ulong *)((long)puVar44 + (uVar67 * uVar30 - uVar88));
                bVar9 = bVar4 >> 2;
                uStack_247 = (uint7)(((ulong)bVar9 << 0x20) >> 8) |
                             (uint7)(1L << ((ulong)bVar4 & 3));
                bStack_250 = (byte)puVar38;
                uStack_24f = (uint7)((ulong)puVar38 >> 8);
                bStack_248 = bVar3;
                if (bVar9 != 0x1a) goto LAB_00737030;
                if (uVar51 < 4) {
                  if (uVar51 < 2) {
                    uVar74 = (ulong)(byte)*puVar38;
                  }
                  else {
                    uVar74 = (ulong)(ushort)*puVar38;
                  }
                }
                else if (uVar51 < 8) {
                  uVar74 = (ulong)(uint)*puVar38;
                }
                else {
                  uVar74 = *puVar38;
                }
              }
              (**(code **)(*plVar65 + 0x38))(plVar65,uVar46,uVar74 != 0);
              uVar67 = uVar67 + 1;
            } while (uVar67 != uVar45);
          }
        }
        auVar107 = FUN_006b0928(&uStack_210,&DAT_002dd957);
        puVar44 = auVar107._0_8_;
        if (auVar107._8_8_ >> 0x20 == 9) {
          uVar51 = auVar107._8_4_ & 0xff;
          if (uVar51 < 4) {
            if (uVar51 < 2) {
              uVar88 = (ulong)(byte)*puVar44;
            }
            else {
              uVar88 = (ulong)(ushort)*puVar44;
            }
          }
          else if (uVar51 < 8) {
            uVar88 = (ulong)(uint)*puVar44;
          }
          else {
            uVar88 = *puVar44;
          }
          uVar30 = auVar107._8_8_ >> 8 & 0xff;
          lVar41 = -(ulong)auVar107[9];
          uVar51 = (uint)uVar30;
          if (uVar51 < 4) {
            if (uVar51 < 2) {
              uVar45 = (ulong)*(byte *)((long)puVar44 + (lVar41 - uVar88));
            }
            else {
              uVar45 = (ulong)*(ushort *)((long)puVar44 + (lVar41 - uVar88));
            }
          }
          else if (uVar51 < 8) {
            uVar45 = (ulong)*(uint *)((long)puVar44 + (lVar41 - uVar88));
          }
          else {
            uVar45 = *(ulong *)((long)puVar44 + (lVar41 - uVar88));
          }
          if (uVar45 != 0) {
            uVar67 = 0;
            puVar36 = (ulong *)((long)puVar44 + ((uVar30 + (ulong)auVar107[9] * -4) - uVar88));
            lVar41 = -uVar30;
            do {
              if (uVar51 < 4) {
                if (uVar51 < 2) {
                  uVar46 = (ulong)(byte)*puVar36;
                  goto LAB_00737454;
                }
                uVar46 = (ulong)(ushort)*puVar36;
                uVar52 = *(ushort *)((long)puVar36 + uVar30) & 0xff;
                uVar74 = (ulong)*(ushort *)((long)puVar36 + uVar30) & 0xff;
joined_r0x00737444:
                lVar85 = -uVar74;
                lVar56 = (long)puVar36 - uVar46;
                if (3 < uVar52) goto LAB_007373e8;
LAB_00737470:
                if (uVar52 < 2) {
                  uVar46 = (ulong)*(byte *)(lVar56 + lVar85);
                  puVar55 = (uint *)(lVar56 + uVar74 * uVar67);
                }
                else {
                  uVar46 = (ulong)*(ushort *)(lVar56 + lVar85);
                  puVar55 = (uint *)(lVar56 + uVar74 * uVar67);
                }
joined_r0x00737488:
                if (uVar67 < uVar46) goto LAB_00737408;
LAB_007374dc:
                pbVar54 = DAT_01342af0;
              }
              else {
                if (7 < uVar51) {
                  uVar46 = *puVar36;
LAB_00737454:
                  uVar74 = (ulong)*(byte *)((long)puVar36 + uVar30);
                  uVar52 = (uint)*(byte *)((long)puVar36 + uVar30);
                  goto joined_r0x00737444;
                }
                lVar56 = (long)puVar36 - (ulong)(uint)*puVar36;
                uVar52 = *(uint *)((long)puVar36 + uVar30) & 0xff;
                uVar74 = (ulong)*(uint *)((long)puVar36 + uVar30) & 0xff;
                lVar85 = -uVar74;
                if (uVar52 < 4) goto LAB_00737470;
LAB_007373e8:
                if (7 < uVar52) {
                  uVar46 = *(ulong *)(lVar56 + lVar85);
                  puVar55 = (uint *)(lVar56 + uVar74 * uVar67);
                  goto joined_r0x00737488;
                }
                puVar55 = (uint *)(lVar56 + uVar74 * uVar67);
                if (*(uint *)(lVar56 + lVar85) <= uVar67) goto LAB_007374dc;
LAB_00737408:
                if (uVar52 < 4) {
                  if (uVar52 < 2) {
                    pbVar54 = (byte *)((long)puVar55 - (ulong)(byte)*puVar55);
                  }
                  else {
                    pbVar54 = (byte *)((long)puVar55 - (ulong)(ushort)*puVar55);
                  }
                }
                else if (uVar52 < 8) {
                  pbVar54 = (byte *)((long)puVar55 - (ulong)*puVar55);
                }
                else {
                  pbVar54 = (byte *)((long)puVar55 - *(long *)puVar55);
                }
              }
              piVar73 = piVar64;
              if (uVar51 < 4) {
                if (uVar51 < 2) {
                  uVar46 = (ulong)*(byte *)((long)puVar44 + (lVar41 - uVar88));
                }
                else {
                  uVar46 = (ulong)*(ushort *)((long)puVar44 + (lVar41 - uVar88));
                }
joined_r0x00737554:
                if (uVar46 <= uVar67) goto LAB_00737594;
LAB_00737558:
                bVar3 = *(byte *)((long)puVar44 + uVar67 + (uVar46 * uVar30 - uVar88));
                puVar38 = (ulong *)((long)puVar44 + (uVar67 * uVar30 - uVar88));
                bVar4 = bVar3 >> 2;
                if (bVar4 != 4) {
                  if (bVar4 == 5) {
                    if (uVar51 < 4) {
                      if (uVar51 < 2) {
                        uVar46 = (ulong)(byte)*puVar38;
                      }
                      else {
                        uVar46 = (ulong)(ushort)*puVar38;
                      }
                    }
                    else if (uVar51 < 8) {
                      uVar46 = (ulong)(uint)*puVar38;
                    }
                    else {
                      uVar46 = *puVar38;
                    }
                    uVar74 = (ulong)bVar3 & 3;
                    lVar56 = (long)puVar38 - uVar46;
                    uVar52 = (uint)uVar74;
                    lVar85 = -(1L << uVar74);
                    if (uVar52 < 2) {
                      if (uVar52 == 0) {
                        uVar46 = (ulong)*(byte *)(lVar56 + lVar85);
                      }
                      else {
                        uVar46 = (ulong)*(ushort *)(lVar56 + lVar85);
                      }
                    }
                    else {
                      if (uVar52 != 2) {
                        uVar46 = *(ulong *)(lVar56 + lVar85);
                        goto LAB_00737694;
                      }
                      uVar46 = (ulong)*(uint *)(lVar56 + lVar85);
                    }
                    if (uVar46 < 0x17) goto LAB_007376a4;
                    goto LAB_0073762c;
                  }
                  goto LAB_00737594;
                }
                if (uVar51 < 4) {
                  if (uVar51 < 2) {
                    uVar46 = (ulong)(byte)*puVar38;
                  }
                  else {
                    uVar46 = (ulong)(ushort)*puVar38;
                  }
                }
                else if (uVar51 < 8) {
                  uVar46 = (ulong)(uint)*puVar38;
                }
                else {
                  uVar46 = *puVar38;
                }
                lVar56 = (long)puVar38 - uVar46;
                uVar46 = strlen(lVar56);
LAB_00737694:
                if (0xffffffffffffffef < uVar46) {
                    /* WARNING: Subroutine does not return */
                  FUN_005fbe6c(&bStack_250);
                }
                if (uVar46 < 0x17) {
LAB_007376a4:
                  bStack_250 = (byte)((int)uVar46 << 1);
                  if (uVar46 != 0) goto LAB_007376b4;
                }
                else {
LAB_0073762c:
                  piStack_240 = (int *)_Znwm((uVar46 | 0xf) + 1);
                  lVar85 = (uVar46 | 0xf) + 2;
                  bStack_248 = (byte)uVar46;
                  uStack_247 = (uint7)(uVar46 >> 8);
                  bStack_250 = (byte)lVar85;
                  uStack_24f = (uint7)((ulong)lVar85 >> 8);
                  piVar73 = piStack_240;
LAB_007376b4:
                  memmove(piVar73,lVar56,uVar46);
                }
              }
              else {
                if (7 < uVar51) {
                  uVar46 = *(ulong *)((long)puVar44 + (lVar41 - uVar88));
                  goto joined_r0x00737554;
                }
                uVar46 = (ulong)*(uint *)((long)puVar44 + (lVar41 - uVar88));
                if (uVar67 < uVar46) goto LAB_00737558;
LAB_00737594:
                uVar46 = 0;
                bStack_250 = 0;
              }
              piVar2 = piStack_240;
              *(undefined1 *)((long)piVar73 + uVar46) = 0;
              bVar3 = bStack_250 & 1;
              uVar46 = (ulong)(bStack_250 >> 1);
              piVar73 = piVar64;
              if ((bStack_250 & 1) != 0) {
                uVar46 = CONCAT71(uStack_247,bStack_248);
                piVar73 = piStack_240;
              }
              if (uVar46 == 0) {
LAB_00737708:
                lVar56 = param_4 + 8;
                if (7 < *(int *)(param_4 + 4)) {
                  lVar56 = *(long *)(param_4 + 8);
                }
                lVar85 = strlen(lVar56);
                piVar43 = (int *)(lVar85 + uVar46);
                if ((int *)0xffffffffffffffef < piVar43) goto LAB_0073d460;
                piVar81 = (int *)((ulong)&bStack_168 | 1);
                if (piVar43 < (int *)0x17) {
                  uStack_167 = 0;
                  piStack_160 = (int *)0x0;
                  piStack_158 = (int *)0x0;
                  bStack_168 = (byte)(((uint)piVar43 & 0xff) << 1);
                }
                else {
                  piStack_158 = (int *)_Znwm(((ulong)piVar43 | 0xf) + 1);
                  uVar74 = ((ulong)piVar43 | 0xf) + 2;
                  bStack_168 = (byte)uVar74;
                  uStack_167 = (uint7)(uVar74 >> 8);
                  piStack_160 = piVar43;
                  if ((uVar74 & 1) != 0) {
                    piVar81 = piStack_158;
                  }
                }
                if (lVar85 != 0) {
                  memcpy(piVar81,lVar56,lVar85);
                }
                if (uVar46 != 0) {
                  memmove((long)piVar81 + lVar85,piVar73,uVar46);
                }
                *(undefined1 *)((long)piVar81 + lVar85 + uVar46) = 0;
                if (bVar3 != 0) {
                  _ZdlPv(piVar2);
                }
                piStack_240 = piStack_158;
                bStack_248 = (byte)piStack_160;
                uStack_247 = (uint7)((ulong)piStack_160 >> 8);
                bStack_250 = bStack_168;
                uStack_24f = uStack_167;
              }
              else {
                uVar74 = uVar46;
                do {
                  uVar83 = uVar74;
                  if (uVar83 == 0) goto LAB_00737708;
                  uVar74 = uVar83 - 1;
                } while (*(char *)((long)piVar73 + (uVar83 - 1)) != '/');
                if (uVar83 == 0) goto LAB_00737708;
              }
              piVar73 = piVar64;
              if ((bStack_250 & 1) != 0) {
                piVar73 = piStack_240;
              }
              FUN_0076ae58(&bStack_168,piVar73);
              iVar23 = FUN_0076c198(&bStack_168,0x2e);
              iVar22 = FUN_0076c198(&bStack_168,0x2f);
              if (iVar22 < iVar23) {
                iVar23 = FUN_0076a1d4(&bStack_168);
                FUN_0076ad48(&bStack_168);
                plVar65 = plStack_180;
                if (1 < iVar23) {
                  piVar73 = piVar64;
                  if ((bStack_250 & 1) != 0) {
                    piVar73 = piStack_240;
                  }
                  FUN_0076ae58(&bStack_168,piVar73);
                  FUN_007434c8(plVar65,&bStack_168,pbVar54);
                  goto LAB_00737888;
                }
              }
              else {
LAB_00737888:
                FUN_0076ad48(&bStack_168);
              }
              if ((bStack_250 & 1) != 0) {
                _ZdlPv(piStack_240);
              }
              uVar67 = uVar67 + 1;
            } while (uVar67 != uVar45);
          }
        }
        (**(code **)(*plStack_180 + 0x80))(&uStack_210);
        if (puStack_148 < puStack_140) {
          auVar108._8_4_ = (uint)uStack_208;
          auVar108._0_8_ = uStack_210;
          auVar108._12_4_ = uStack_208._4_4_;
          puStack_148[1] = auVar108._8_8_;
          *puStack_148 = (ulong)uStack_210;
          plVar27 = plStack_180;
          puStack_148 = puStack_148 + 2;
        }
        else {
          puStack_148 = (ulong *)FUN_00743b5c(&puStack_150,&uStack_210);
          plVar65 = (long *)CONCAT44(uStack_208._4_4_,(uint)uStack_208);
          plVar27 = plStack_180;
          if (plVar65 != (long *)0x0) {
            lVar41 = FUN_0129eb20(0xffffffffffffffff,plVar65 + 1);
            plVar27 = plStack_180;
            if (lVar41 == 0) {
              (**(code **)(*plVar65 + 0x10))(plVar65);
              _ZNSt6__ndk119__shared_weak_count14__release_weakEv(plVar65);
              plVar27 = plStack_180;
            }
          }
        }
        plStack_180 = (long *)0x0;
        if (plVar27 != (long *)0x0) {
          plStack_180 = (long *)0x0;
          (**(code **)(*plVar27 + 8))();
        }
        uVar29 = (ulong)((int)uVar29 + 1);
      } while (uVar29 < uStack_338);
    }
  }
LAB_0073796c:
  piStack_160 = (int *)0x0;
  bStack_168 = 0;
  uStack_167 = 0;
  piStack_158 = (int *)0x0;
  puVar42 = (ushort *)((long)param_2 - (long)*param_2);
  lVar41 = -(long)*param_2;
  if ((0x26 < *puVar42) && (uVar29 = (ulong)puVar42[0x13], uVar29 != 0)) {
    puVar55 = (uint *)((long)param_2 + uVar29);
    puVar55 = (uint *)((long)puVar55 + (ulong)*puVar55);
    uVar51 = *puVar55;
    uVar29 = (ulong)uVar51;
    if (uVar51 == 0) {
      auVar97 = ZEXT816(0);
      piVar64 = (int *)0x0;
    }
    else {
      piStack_160 = (int *)_Znwm(uVar29 * 4);
      uVar62 = _UNK_00306588;
      uVar104 = _DAT_00306580;
      piStack_158 = piStack_160 + uVar29;
      uVar88 = 0;
      iVar23 = 0;
      bStack_168 = (byte)piStack_160;
      uStack_167 = (uint7)((ulong)piStack_160 >> 8);
      bStack_250 = 0;
      uStack_24f = 0;
      bStack_248 = 0;
      uStack_247 = 0;
      piStack_240 = (int *)0x0;
      do {
        if (*(ushort *)((long)param_2 - (long)*param_2) < 5) {
          lVar41 = 0;
        }
        else {
          uVar30 = (ulong)((ushort *)((long)param_2 - (long)*param_2))[2];
          lVar41 = 0;
          if (uVar30 != 0) {
            puVar31 = (uint *)((long)param_2 + uVar30);
            lVar41 = (long)puVar31 + (ulong)*puVar31;
          }
        }
        puVar31 = (uint *)((long)puVar55 + (ulong)(uint)((int)uVar88 << 2) + 4);
        piVar64 = (int *)((long)puVar31 + (ulong)*puVar31);
        if ((*(ushort *)((long)piVar64 - (long)*piVar64) < 9) ||
           (uVar30 = (ulong)((ushort *)((long)piVar64 - (long)*piVar64))[4], uVar30 == 0)) {
          iVar22 = -1;
        }
        else {
          iVar22 = *(int *)((long)piVar64 + uVar30);
        }
        puVar31 = (uint *)(lVar41 + (ulong)(uint)(iVar22 << 2) + 4);
        FUN_0074ec84(&uStack_210,param_3,param_2,(long)puVar31 + (ulong)*puVar31);
        piVar73 = piStack_160;
        plVar65 = (long *)CONCAT44(uStack_208._4_4_,(uint)uStack_208);
        if ((*(ushort *)((long)piVar64 - (long)*piVar64) < 0xb) ||
           (uVar30 = (ulong)((ushort *)((long)piVar64 - (long)*piVar64))[5], uVar30 == 0)) {
          puVar31 = (uint *)0x0;
        }
        else {
          puVar31 = (uint *)((long)piVar64 + uVar30);
          puVar31 = (uint *)((long)puVar31 + (ulong)*puVar31);
        }
        uVar51 = *puVar31;
        if (piStack_160 < piStack_158) {
          piVar81 = piStack_160 + 1;
          *piStack_160 = iVar23;
        }
        else {
          piVar2 = (int *)CONCAT71(uStack_167,bStack_168);
          lVar56 = (long)piStack_160 - (long)piVar2;
          lVar41 = lVar56 >> 2;
          uVar30 = lVar41 + 1;
          if (uVar30 >> 0x3e != 0) {
            FUN_0066a69c(&bStack_168);
            goto LAB_0073d488;
          }
          uVar45 = (long)piStack_158 - (long)piVar2 >> 1;
          if (uVar45 <= uVar30) {
            uVar45 = uVar30;
          }
          if (0x7ffffffffffffffb < (ulong)((long)piStack_158 - (long)piVar2)) {
            uVar45 = 0x3fffffffffffffff;
          }
          if (uVar45 == 0) {
            lVar85 = 0;
            piVar43 = (int *)(lVar41 * 4);
            lVar41 = (long)piStack_160 - (long)piVar2;
            piVar81 = piVar43 + 1;
            *piVar43 = iVar23;
            if (lVar41 == 0) goto LAB_007382dc;
LAB_00737b70:
            piVar32 = piVar43;
            if ((lVar41 - 4U < 0x1c) || ((ulong)((long)piVar73 + (-lVar56 - lVar85)) < 0x20)) {
LAB_00737bdc:
              do {
                piVar73 = piVar73 + -1;
                piVar32 = piVar32 + -1;
                *piVar32 = *piVar73;
              } while (piVar73 != piVar2);
            }
            else {
              pauVar63 = (undefined1 (*) [16])(piVar73 + -4);
              uVar30 = (lVar41 - 4U >> 2) + 1;
              uVar46 = uVar30 & 0x7ffffffffffffff8;
              piVar73 = piVar73 + -uVar46;
              piVar32 = piVar43 + -uVar46;
              piVar43 = piVar43 + -4;
              uVar67 = uVar46;
              do {
                pauVar18 = pauVar63 + -1;
                uVar8 = *(undefined8 *)pauVar63[-1];
                auVar107 = *pauVar63;
                uVar67 = uVar67 - 8;
                pauVar63 = pauVar63 + -2;
                *(undefined8 *)(piVar43 + -2) = *(undefined8 *)((long)*pauVar18 + 8);
                *(undefined8 *)(piVar43 + -4) = uVar8;
                *(long *)(piVar43 + 2) = auVar107._8_8_;
                *(long *)piVar43 = auVar107._0_8_;
                piVar43 = piVar43 + -8;
              } while (uVar67 != 0);
              if (uVar30 != uVar46) goto LAB_00737bdc;
            }
            piStack_158 = (int *)(lVar85 + uVar45 * 4);
            bStack_168 = (byte)piVar32;
            uStack_167 = (uint7)((ulong)piVar32 >> 8);
          }
          else {
            if (uVar45 >> 0x3e != 0) goto LAB_0073d438;
            lVar85 = _Znwm(uVar45 << 2);
            piVar43 = (int *)(lVar85 + lVar41 * 4);
            lVar41 = (long)piVar73 - (long)piVar2;
            piVar81 = piVar43 + 1;
            *piVar43 = iVar23;
            if (lVar41 != 0) goto LAB_00737b70;
LAB_007382dc:
            piStack_158 = (int *)(lVar85 + uVar45 * 4);
            bStack_168 = (byte)piVar43;
            uStack_167 = (uint7)((ulong)piVar43 >> 8);
          }
          if (piVar2 != (int *)0x0) {
            _ZdlPv(piVar2);
          }
        }
        if ((*(ushort *)((long)piVar64 - (long)*piVar64) < 5) ||
           (uVar30 = (ulong)((ushort *)((long)piVar64 - (long)*piVar64))[2], uVar30 == 0)) {
LAB_00737c68:
          uVar30 = 0;
          bStack_120 = 0xd8;
          uStack_11f = 0x30a6;
          uStack_118 = CONCAT31(uStack_118._1_3_,1);
        }
        else {
          puVar1 = (uint *)((long)piVar64 + uVar30);
          puVar1 = (uint *)((long)puVar1 + (ulong)*puVar1);
          pbVar54 = (byte *)((long)puVar1 + (ulong)*puVar1 + 2);
          bVar3 = *pbVar54;
          if ((bVar3 & 0xfc) != 0x24) goto LAB_00737c68;
          bVar4 = *(byte *)((long)puVar1 + (ulong)*puVar1 + 3);
          puVar44 = (ulong *)(pbVar54 + -(ulong)bVar4);
          if (bVar4 < 4) {
            if (bVar4 < 2) {
              uVar30 = (ulong)(byte)*puVar44;
            }
            else {
              uVar30 = (ulong)(ushort)*puVar44;
            }
          }
          else if (bVar4 < 8) {
            uVar30 = (ulong)(uint)*puVar44;
          }
          else {
            uVar30 = *puVar44;
          }
          uVar52 = bVar3 & 3;
          lVar41 = (long)puVar44 - uVar30;
          bStack_120 = (byte)lVar41;
          uStack_11f = (undefined7)((ulong)lVar41 >> 8);
          lVar56 = -(1L << uVar52);
          uStack_118 = CONCAT31(uStack_118._1_3_,(char)(1L << uVar52));
          if (uVar52 < 2) {
            if ((bVar3 & 3) == 0) {
              uVar30 = (ulong)*(byte *)(lVar41 + lVar56);
            }
            else {
              uVar30 = (ulong)*(ushort *)(lVar41 + lVar56);
            }
          }
          else if (uVar52 == 2) {
            uVar30 = (ulong)*(uint *)(lVar41 + -4);
          }
          else {
            uVar30 = *(ulong *)(lVar41 + lVar56);
          }
        }
        uStack_110 = (uint)uVar30;
        uStack_10c = (uint)(uVar30 >> 0x20);
        piStack_160 = piVar81;
        auVar107 = FUN_006b0928(&bStack_120,&DAT_002c05ad);
        puVar44 = auVar107._0_8_;
        if (auVar107._8_8_ >> 0x20 == 9) {
          uVar52 = auVar107._8_4_ & 0xff;
          if (uVar52 < 4) {
            if (uVar52 < 2) {
              uVar30 = (ulong)(byte)*puVar44;
            }
            else {
              uVar30 = (ulong)(ushort)*puVar44;
            }
          }
          else if (uVar52 < 8) {
            uVar30 = (ulong)(uint)*puVar44;
          }
          else {
            uVar30 = *puVar44;
          }
          uVar52 = auVar107._9_4_ & 0xff;
          plStack_180 = (long *)((long)puVar44 - uVar30);
          lVar41 = -(ulong)auVar107[9];
          plStack_178 = (long *)CONCAT71(plStack_178._1_7_,auVar107[9]);
          if (uVar52 < 4) {
            if (uVar52 < 2) {
              plStack_170 = (long *)(ulong)*(byte *)((long)plStack_180 + lVar41);
            }
            else {
              plStack_170 = (long *)(ulong)*(ushort *)((long)plStack_180 + lVar41);
            }
          }
          else if (uVar52 < 8) {
            plStack_170 = (long *)(ulong)*(uint *)((long)plStack_180 + lVar41);
          }
          else {
            plStack_170 = *(long **)((long)plStack_180 + lVar41);
          }
        }
        else {
          plStack_170 = (long *)0x0;
          plStack_180 = (long *)&DAT_0030a6d8;
          plStack_178 = (long *)CONCAT71(plStack_178._1_7_,1);
        }
        auVar107 = FUN_006b0928(&plStack_180,"bounds");
        puVar44 = auVar107._0_8_;
        if (auVar107._12_4_ - 9U < 2) {
          uVar52 = auVar107._8_4_ & 0xff;
          if (uVar52 < 4) {
            if (uVar52 < 2) {
              uVar45 = (ulong)(byte)*puVar44;
            }
            else {
              uVar45 = (ulong)(ushort)*puVar44;
            }
          }
          else if (uVar52 < 8) {
            uVar45 = (ulong)(uint)*puVar44;
          }
          else {
            uVar45 = *puVar44;
          }
          uVar30 = auVar107._8_8_ >> 8;
          uVar52 = auVar107._9_4_ & 0xff;
          puStack_2d0 = (undefined1 *)((long)puVar44 - uVar45);
          lVar41 = -(auVar107._8_8_ >> 8 & 0xff);
          if (uVar52 < 4) {
            if (uVar52 < 2) {
              uVar45 = (ulong)(byte)puStack_2d0[lVar41];
            }
            else {
              uVar45 = (ulong)*(ushort *)(puStack_2d0 + lVar41);
            }
          }
          else if (uVar52 < 8) {
            uVar45 = (ulong)*(uint *)(puStack_2d0 + lVar41);
          }
          else {
            uVar45 = *(ulong *)(puStack_2d0 + lVar41);
          }
        }
        else {
          uVar45 = 0;
          puStack_2d0 = &DAT_0030a6d9;
          uVar30 = 1;
        }
        if (uVar51 != 0) {
          piVar64 = (int *)CONCAT71(uStack_247,bStack_248);
          uVar67 = 0;
          puStack_2e0._0_4_ = (uint)uVar30 & 0xff;
          do {
            plVar65 = (long *)CONCAT44(uStack_208._4_4_,(uint)uStack_208);
            if (piVar64 < piStack_240) {
              piVar64[0xc] = 0;
              piVar64[0x11] = -0x800001;
              piVar64[0x12] = -0x800001;
              piVar64[2] = 0;
              piVar64[3] = 0;
              piVar64[0] = 0;
              piVar64[1] = 0;
              piVar64[6] = 0;
              piVar64[7] = 0;
              piVar64[4] = 0;
              piVar64[5] = 0;
              piVar64[10] = 0;
              piVar64[0xb] = 0;
              piVar64[8] = 0;
              piVar64[9] = 0;
              piVar64[1] = 0x3f800000;
              piVar64[5] = 0x3f800000;
              piVar64[9] = 0x3f800000;
              *(undefined8 *)(piVar64 + 0xf) = uVar62;
              *(undefined8 *)(piVar64 + 0xd) = uVar104;
              piVar64 = piVar64 + 0x13;
            }
            else {
              piVar73 = (int *)CONCAT71(uStack_24f,bStack_250);
              lVar41 = (long)piVar64 - (long)piVar73 >> 2;
              uVar46 = lVar41 * -0x79435e50d79435e5 + 1;
              if (0x35e50d79435e50d < uVar46) {
                FUN_00716258(&bStack_250);
LAB_0073d460:
                    /* WARNING: Subroutine does not return */
                FUN_005fbe6c(&bStack_168);
              }
              lVar56 = (long)piStack_240 - (long)piVar73 >> 2;
              uVar74 = lVar56 * 0xd79435e50d79436;
              if (uVar74 <= uVar46) {
                uVar74 = uVar46;
              }
              if (0x1af286bca1af285 < (ulong)(lVar56 * -0x79435e50d79435e5)) {
                uVar74 = 0x35e50d79435e50d;
              }
              if (0x35e50d79435e50d < uVar74) goto LAB_0073d438;
              lVar85 = uVar74 * 0x4c;
              lVar56 = _Znwm(lVar85);
              lVar41 = lVar56 + lVar41 * 4;
              puVar26 = (undefined8 *)(lVar56 + ((long)piVar64 - (long)piVar73));
              *(undefined4 *)(puVar26 + 6) = 0;
              puVar26[1] = 0;
              *puVar26 = 0;
              puVar26[3] = 0;
              puVar26[2] = 0;
              puVar26[5] = 0;
              puVar26[4] = 0;
              *(undefined4 *)(lVar41 + 4) = 0x3f800000;
              *(undefined4 *)(lVar41 + 0x14) = 0x3f800000;
              *(undefined4 *)(lVar41 + 0x24) = 0x3f800000;
              *(undefined8 *)(lVar41 + 0x3c) = uVar62;
              *(undefined8 *)(lVar41 + 0x34) = uVar104;
              *(undefined8 *)(lVar41 + 0x44) = 0xff7fffffff7fffff;
              if (piVar64 == piVar73) {
                bStack_250 = (byte)puVar26;
                uStack_24f = (uint7)((ulong)puVar26 >> 8);
              }
              else {
                puVar66 = puVar26;
                do {
                  uVar8 = *(undefined8 *)(piVar64 + -0x13);
                  puVar71 = (undefined8 *)((long)puVar66 + -0x4c);
                  *(undefined8 *)((long)puVar66 + -0x44) = *(undefined8 *)(piVar64 + -0x11);
                  *(undefined8 *)((long)puVar66 + -0x4c) = uVar8;
                  auVar107 = *(undefined1 (*) [16])(piVar64 + -4);
                  uVar28 = *(undefined8 *)(piVar64 + -5);
                  uVar8 = *(undefined8 *)(piVar64 + -7);
                  uVar102 = *(undefined8 *)(piVar64 + -0xd);
                  uVar101 = *(undefined8 *)(piVar64 + -0xf);
                  uVar103 = *(undefined8 *)(piVar64 + -9);
                  uVar95 = *(undefined8 *)(piVar64 + -0xb);
                  piVar64 = piVar64 + -0x13;
                  puVar66[-1] = auVar107._8_8_;
                  puVar66[-2] = auVar107._0_8_;
                  *(undefined8 *)((long)puVar66 + -0x14) = uVar28;
                  *(undefined8 *)((long)puVar66 + -0x1c) = uVar8;
                  *(undefined8 *)((long)puVar66 + -0x24) = uVar103;
                  *(undefined8 *)((long)puVar66 + -0x2c) = uVar95;
                  *(undefined8 *)((long)puVar66 + -0x34) = uVar102;
                  *(undefined8 *)((long)puVar66 + -0x3c) = uVar101;
                  puVar66 = puVar71;
                } while (piVar64 != piVar73);
                bStack_250 = (byte)puVar71;
                uStack_24f = (uint7)((ulong)puVar71 >> 8);
              }
              piVar64 = (int *)((long)puVar26 + 0x4c);
              piStack_240 = (int *)(lVar56 + lVar85);
              if (piVar73 != (int *)0x0) {
                piStack_240 = (int *)(lVar56 + lVar85);
                piVar64 = (int *)((long)puVar26 + 0x4c);
                _ZdlPv(piVar73);
              }
            }
            bStack_248 = (byte)piVar64;
            uStack_247 = (uint7)((ulong)piVar64 >> 8);
            *(char *)(piVar64 + -0x13) = (char)uVar88;
            *(short *)((long)piVar64 + -0x4a) = (short)puVar31[uVar67 + 1];
            FUN_007704d0(&bStack_120,uStack_210 + uVar67 * 0x40);
            auVar96._8_4_ = *(undefined4 *)((ulong)&bStack_120 | 8);
            auVar96._0_8_ = CONCAT71(uStack_11f,bStack_120);
            auVar96._12_4_ = uStack_110;
            *(ulong *)(piVar64 + -0xc) = CONCAT44(uStack_fc,uStack_100);
            *(ulong *)(piVar64 + -0xe) = CONCAT44(uStack_108,uStack_10c);
            *(long *)(piVar64 + -0x10) = auVar96._8_8_;
            *(ulong *)(piVar64 + -0x12) = CONCAT71(uStack_11f,bStack_120);
            *(ulong *)(piVar64 + -8) = CONCAT44(uStack_e8,uStack_ec);
            *(ulong *)(piVar64 + -10) = CONCAT44(uStack_f0,uStack_f8);
            if (uVar67 < uVar45) {
              bVar3 = puStack_2d0[uVar67 + uVar45 * (uVar30 & 0xff)];
              uVar46 = (ulong)bVar3;
              if (1 < (bVar3 >> 2) - 9) goto LAB_00737ff4;
              puVar44 = (ulong *)(puStack_2d0 + (uVar30 & 0xff) * uVar67);
              if (3 < (uint)puStack_2e0) {
                if (7 < (uint)puStack_2e0) {
                  uVar83 = *puVar44;
                  goto joined_r0x00738120;
                }
                puVar76 = (undefined1 *)((long)puVar44 - (ulong)(uint)*puVar44);
                uVar74 = 1L << (uVar46 & 3);
                lVar41 = -uVar74;
                if ((uint)(uVar46 & 3) < 2) goto LAB_00738158;
LAB_00738124:
                if ((bVar3 & 3) != 2) {
                  uVar83 = *(ulong *)(puVar76 + lVar41);
                  goto joined_r0x00738160;
                }
                uVar83 = (ulong)*(uint *)(puVar76 + lVar41);
                if (uVar83 != 0) goto LAB_00738164;
                goto LAB_00738008;
              }
              if ((uint)puStack_2e0 < 2) {
                puVar76 = (undefined1 *)((long)puVar44 - (ulong)(byte)*puVar44);
                uVar74 = 1L << (uVar46 & 3);
                lVar41 = -uVar74;
                if (1 < (uint)(uVar46 & 3)) goto LAB_00738124;
              }
              else {
                uVar83 = (ulong)(ushort)*puVar44;
joined_r0x00738120:
                uVar74 = 1L << (uVar46 & 3);
                lVar41 = -uVar74;
                puVar76 = (undefined1 *)((long)puVar44 - uVar83);
                if (1 < (bVar3 & 3)) goto LAB_00738124;
              }
LAB_00738158:
              if ((bVar3 & 3) == 0) {
                uVar83 = (ulong)(byte)puVar76[lVar41];
              }
              else {
                uVar83 = (ulong)*(ushort *)(puVar76 + lVar41);
              }
joined_r0x00738160:
              if (uVar83 == 0) goto LAB_00738008;
LAB_00738164:
              uVar46 = (ulong)((byte)puVar76[uVar83 << (uVar46 & 3)] >> 2) << 0x20 |
                       (ulong)(uint)(1 << ((ulong)(byte)puVar76[uVar83 << (uVar46 & 3)] & 3)) << 8 |
                       uVar74;
              bStack_120 = (byte)puVar76;
              uStack_11f = (undefined7)((ulong)puVar76 >> 8);
              uStack_118 = (uint)uVar46;
              uStack_114 = (uint)(uVar46 >> 0x20);
              auVar107 = FUN_006b3dec(&bStack_120);
              dVar94 = auVar107._0_8_;
              if (1 < uVar83) goto LAB_00738024;
LAB_0073819c:
              puStack_230 = (undefined *)0x0;
              plStack_228 = (long *)0x101;
              auVar107 = FUN_006b3dec(&puStack_230);
              dVar90 = auVar107._0_8_;
              if (2 < uVar83) goto LAB_007381b8;
LAB_00738064:
              plStack_268 = (long *)0x0;
              plStack_260 = (long *)0x101;
              auVar107 = FUN_006b3dec(&plStack_268);
              dVar91 = auVar107._0_8_;
              if (uVar83 < 4) goto LAB_00738080;
LAB_007381f8:
              uStack_278 = uVar74 & 0xffffffff;
              puStack_280 = puVar76 + uStack_278 + (uVar74 & 0xffffffff) * 2;
              uStack_278 = (ulong)((byte)puVar76[uVar83 * uStack_278 + 3] >> 2) << 0x20 |
                           (ulong)(uint)(1 << ((ulong)(byte)puVar76[uVar83 * uStack_278 + 3] & 3))
                           << 8 | uStack_278;
              auVar107 = FUN_006b3dec(&puStack_280);
              dVar92 = auVar107._0_8_;
              if (4 < uVar83) goto LAB_0073823c;
LAB_0073809c:
              auStack_190._0_8_ = (undefined1 *)0x0;
              auStack_190._8_8_ = 0x101;
              auVar107 = FUN_006b3dec(auStack_190);
              dVar93 = auVar107._0_8_;
              if (uVar83 < 6) goto LAB_0073827c;
LAB_00737d58:
              auStack_1a0._8_8_ = uVar74 & 0xffffffff;
              auStack_1a0._0_8_ = puVar76 + auStack_1a0._8_8_ + (uVar74 & 0xffffffff) * 4;
              auStack_1a0._8_8_ =
                   (ulong)((byte)puVar76[uVar83 * auStack_1a0._8_8_ + 5] >> 2) << 0x20 |
                   (ulong)(uint)(1 << ((ulong)(byte)puVar76[uVar83 * auStack_1a0._8_8_ + 5] & 3)) <<
                   8 | auStack_1a0._8_8_;
            }
            else {
LAB_00737ff4:
              uVar83 = 0;
              uVar74 = 1;
              puVar76 = &DAT_0030a6d9;
LAB_00738008:
              bStack_120 = 0;
              uStack_11f = 0;
              uStack_118 = 0x101;
              uStack_114 = 0;
              auVar107 = FUN_006b3dec(&bStack_120);
              dVar94 = auVar107._0_8_;
              if (uVar83 < 2) goto LAB_0073819c;
LAB_00738024:
              uVar46 = uVar74 & 0xffffffff;
              puStack_230 = puVar76 + uVar46;
              plStack_228 = (long *)((ulong)((byte)puVar76[uVar83 * uVar46 + 1] >> 2) << 0x20 |
                                     (ulong)(uint)(1 << ((ulong)(byte)puVar76[uVar83 * uVar46 + 1] &
                                                        3)) << 8 | uVar46);
              auVar107 = FUN_006b3dec(&puStack_230);
              dVar90 = auVar107._0_8_;
              if (uVar83 < 3) goto LAB_00738064;
LAB_007381b8:
              plStack_268 = (long *)(puVar76 + (uVar74 & 0xffffffff) * 2);
              plStack_260 = (long *)((ulong)((byte)puVar76[uVar83 * (uVar74 & 0xffffffff) + 2] >> 2)
                                     << 0x20 | (ulong)(uint)(1 << ((ulong)(byte)puVar76[uVar83 * (
                                                  uVar74 & 0xffffffff) + 2] & 3)) << 8 |
                                    uVar74 & 0xffffffff);
              auVar107 = FUN_006b3dec(&plStack_268);
              dVar91 = auVar107._0_8_;
              if (3 < uVar83) goto LAB_007381f8;
LAB_00738080:
              puStack_280 = (undefined *)0x0;
              uStack_278 = 0x101;
              auVar107 = FUN_006b3dec(&puStack_280);
              dVar92 = auVar107._0_8_;
              if (uVar83 < 5) goto LAB_0073809c;
LAB_0073823c:
              auStack_190._0_8_ = puVar76 + (uVar74 & 0xffffffff) * 4;
              auStack_190._8_8_ =
                   (ulong)((byte)puVar76[uVar83 * (uVar74 & 0xffffffff) + 4] >> 2) << 0x20 |
                   (ulong)(uint)(1 << ((ulong)(byte)puVar76[uVar83 * (uVar74 & 0xffffffff) + 4] & 3)
                                ) << 8 | uVar74 & 0xffffffff;
              auVar107 = FUN_006b3dec(auStack_190);
              dVar93 = auVar107._0_8_;
              if (5 < uVar83) goto LAB_00737d58;
LAB_0073827c:
              auStack_1a0._0_8_ = (undefined1 *)0x0;
              auStack_1a0._8_8_ = 0x101;
            }
            dVar89 = (double)FUN_006b3dec(auStack_1a0);
            uVar67 = uVar67 + 1;
            piVar64[-6] = (int)(float)dVar94;
            piVar64[-5] = (int)(float)dVar90;
            piVar64[-4] = (int)(float)dVar91;
            piVar64[-3] = (int)(float)dVar92;
            piVar64[-2] = (int)(float)dVar93;
            piVar64[-1] = (int)(float)dVar89;
          } while (uVar67 != uVar51);
        }
        uVar88 = uVar88 + 1;
        iVar23 = uVar51 + iVar23;
      } while (uVar88 != uVar29);
      auVar97._1_7_ = uStack_24f;
      auVar97[0] = bStack_250;
      auVar97[8] = bStack_248;
      auVar97._9_7_ = uStack_247;
      piVar64 = piStack_240;
    }
    puVar26 = (undefined8 *)_Znwm(0x30);
    *puVar26 = &DAT_012ae5d8;
    lVar41 = *param_1;
    puVar26[1] = 0;
    puVar26[2] = 0;
    puVar26[4] = auVar97._8_8_;
    puVar26[3] = auVar97._0_8_;
    puVar26[5] = piVar64;
    plVar65 = *(long **)(lVar41 + 0xb0);
    bStack_248 = 0;
    uStack_247 = 0;
    piStack_240 = (int *)0x0;
    bStack_250 = 0;
    uStack_24f = 0;
    *(undefined8 **)(lVar41 + 0xa8) = puVar26 + 3;
    *(undefined8 **)(lVar41 + 0xb0) = puVar26;
    if (plVar65 != (long *)0x0) {
      lVar41 = FUN_0129eb20(0xffffffffffffffff,plVar65 + 1);
      if (lVar41 == 0) {
        (**(code **)(*plVar65 + 0x10))(plVar65);
        _ZNSt6__ndk119__shared_weak_count14__release_weakEv(plVar65);
      }
    }
    if (CONCAT71(uStack_24f,bStack_250) != 0) {
      _ZdlPv();
    }
    lVar41 = -(long)*param_2;
  }
  puVar42 = (ushort *)((long)param_2 + lVar41);
  if ((*puVar42 < 0x1d) || ((ulong)puVar42[0xe] == 0)) {
    plStack_340 = (long *)0x0;
    plVar27 = (long *)0x0;
    uVar104 = NEON_fmov(0x3f800000,4);
    puVar42 = (ushort *)((long)param_2 + lVar41);
    uVar5 = *puVar42;
  }
  else {
    puVar55 = (uint *)((long)param_2 + (ulong)puVar42[0xe]);
    puVar55 = (uint *)((long)puVar55 + (ulong)*puVar55);
    uVar51 = *puVar55;
    uVar29 = (ulong)uVar51;
    if (uVar51 == 0) {
      plStack_360 = (long *)0x0;
      plVar27 = (long *)0x0;
      uVar88 = (ulong)puVar42[5];
      if (uVar88 == 0) goto LAB_00738570;
LAB_00738524:
      lVar41 = (long)((long)param_2 + uVar88) + (ulong)*(uint *)((long)param_2 + uVar88);
    }
    else {
      plVar27 = (long *)_Znwm(uVar29 * 0x70);
      plStack_360 = plVar27 + uVar29 * 0xe;
      uVar88 = (ulong)puVar42[5];
      if (uVar88 != 0) goto LAB_00738524;
LAB_00738570:
      lVar41 = 0;
    }
    plStack_228 = (long *)0x0;
    puStack_230 = (undefined *)0x0;
    auVar107 = FUN_006b0928(&puStack_138,&DAT_002dd960);
    bStack_120 = auVar107[0];
    uStack_11f = auVar107._1_7_;
    uStack_118 = auVar107._8_4_;
    uStack_114 = auVar107._12_4_;
    iVar23 = FUN_00742b40(&bStack_120);
    puVar31 = (uint *)(lVar41 + (ulong)(uint)(iVar23 << 2) + 4);
    piVar64 = (int *)((long)puVar31 + (ulong)*puVar31);
    puVar42 = (ushort *)((long)piVar64 - (long)*piVar64);
    if (*puVar42 < 7) {
      uStack_108 = 0;
      iVar23 = 0;
      lVar41 = *param_3;
    }
    else {
      uStack_108 = 0;
      if ((ulong)puVar42[3] != 0) {
        uStack_108 = *(uint *)((long)piVar64 + (ulong)puVar42[3]);
      }
      lVar41 = *param_3;
      if ((*puVar42 < 9) || ((ulong)puVar42[4] == 0)) {
        iVar23 = 0;
      }
      else {
        iVar23 = *(int *)((long)piVar64 + (ulong)puVar42[4]);
      }
    }
    uStack_110 = 0;
    uStack_10c = 0;
    uStack_104 = (uint)DAT_00305948;
    uStack_100 = (uint)((ulong)DAT_00305948 >> 0x20);
    uStack_118 = 0;
    uStack_114 = 0;
    bStack_120 = 0;
    uStack_11f = 0;
    FUN_006075e4(&uStack_210,*DAT_0133bd40,&bStack_120,lVar41 + iVar23,uStack_108);
    plVar65 = plStack_228;
    puStack_230 = uStack_210;
    auVar10._8_4_ = (uint)uStack_208;
    auVar10._0_8_ = uStack_210;
    auVar10._12_4_ = uStack_208._4_4_;
    uStack_210._0_4_ = 0;
    uStack_210._4_4_ = 0;
    uStack_208._0_4_ = 0;
    uStack_208._4_4_ = 0;
    plVar68 = auVar10._8_8_;
    if (plStack_228 != (long *)0x0) {
      plVar68 = plStack_228 + 1;
      plStack_228 = auVar10._8_8_;
      lVar41 = FUN_0129eb20(0xffffffffffffffff,plVar68);
      plVar68 = plStack_228;
      if (lVar41 == 0) {
        (**(code **)(*plVar65 + 0x10))(plVar65);
        _ZNSt6__ndk119__shared_weak_count14__release_weakEv(plVar65);
        plVar68 = plStack_228;
      }
    }
    plStack_228 = plVar68;
    plVar65 = (long *)CONCAT44(uStack_208._4_4_,(uint)uStack_208);
    if ((plVar65 != (long *)0x0) &&
       (lVar41 = FUN_0129eb20(0xffffffffffffffff,plVar65 + 1), lVar41 == 0)) {
      (**(code **)(*plVar65 + 0x10))(plVar65);
      _ZNSt6__ndk119__shared_weak_count14__release_weakEv(plVar65);
    }
    if ((bStack_120 & 1) != 0) {
      _ZdlPv(CONCAT44(uStack_10c,uStack_110));
    }
    uVar104 = DAT_00305e80;
    plStack_340 = plVar27;
    if (uVar51 != 0) {
      uVar88 = 0;
      plVar68 = plVar27;
      do {
        puVar31 = (uint *)((long)puVar55 + (ulong)(uint)((int)uVar88 << 2) + 4);
        piVar64 = (int *)((long)puVar31 + (ulong)*puVar31);
        if ((*(ushort *)((long)piVar64 - (long)*piVar64) < 5) ||
           (uVar30 = (ulong)((ushort *)((long)piVar64 - (long)*piVar64))[2], uVar30 == 0)) {
LAB_0073878c:
          uVar30 = 0;
          bStack_120 = 0xd8;
          uStack_11f = 0x30a6;
          uStack_118 = CONCAT31(uStack_118._1_3_,1);
        }
        else {
          puVar31 = (uint *)((long)piVar64 + uVar30);
          puVar31 = (uint *)((long)puVar31 + (ulong)*puVar31);
          pbVar54 = (byte *)((long)puVar31 + (ulong)*puVar31 + 2);
          bVar3 = *pbVar54;
          if ((bVar3 & 0xfc) != 0x24) goto LAB_0073878c;
          bVar4 = *(byte *)((long)puVar31 + (ulong)*puVar31 + 3);
          puVar44 = (ulong *)(pbVar54 + -(ulong)bVar4);
          if (bVar4 < 4) {
            if (bVar4 < 2) {
              uVar30 = (ulong)(byte)*puVar44;
            }
            else {
              uVar30 = (ulong)(ushort)*puVar44;
            }
          }
          else if (bVar4 < 8) {
            uVar30 = (ulong)(uint)*puVar44;
          }
          else {
            uVar30 = *puVar44;
          }
          uVar51 = bVar3 & 3;
          lVar41 = (long)puVar44 - uVar30;
          bStack_120 = (byte)lVar41;
          uStack_11f = (undefined7)((ulong)lVar41 >> 8);
          lVar56 = -(1L << uVar51);
          uStack_118 = CONCAT31(uStack_118._1_3_,(char)(1L << uVar51));
          if (uVar51 < 2) {
            if ((bVar3 & 3) == 0) {
              uVar30 = (ulong)*(byte *)(lVar41 + lVar56);
            }
            else {
              uVar30 = (ulong)*(ushort *)(lVar41 + lVar56);
            }
          }
          else if (uVar51 == 2) {
            uVar30 = (ulong)*(uint *)(lVar41 + -4);
          }
          else {
            uVar30 = *(ulong *)(lVar41 + lVar56);
          }
        }
        uStack_110 = (uint)uVar30;
        uStack_10c = (uint)(uVar30 >> 0x20);
        auVar107 = FUN_006b0928(&bStack_120,&DAT_002c05ad);
        puVar44 = auVar107._0_8_;
        if (auVar107._8_8_ >> 0x20 == 9) {
          uVar51 = auVar107._8_4_ & 0xff;
          if (uVar51 < 4) {
            if (uVar51 < 2) {
              uVar30 = (ulong)(byte)*puVar44;
            }
            else {
              uVar30 = (ulong)(ushort)*puVar44;
            }
          }
          else if (uVar51 < 8) {
            uVar30 = (ulong)(uint)*puVar44;
          }
          else {
            uVar30 = *puVar44;
          }
          uVar51 = auVar107._9_4_ & 0xff;
          lVar56 = (long)puVar44 - uVar30;
          bStack_248 = auVar107[9];
          lVar41 = -(ulong)bStack_248;
          bStack_250 = (byte)lVar56;
          uStack_24f = (uint7)((ulong)lVar56 >> 8);
          if (uVar51 < 4) {
            if (uVar51 < 2) {
              piStack_240 = (int *)(ulong)*(byte *)(lVar56 + lVar41);
            }
            else {
              piStack_240 = (int *)(ulong)*(ushort *)(lVar56 + lVar41);
            }
          }
          else if (uVar51 < 8) {
            piStack_240 = (int *)(ulong)*(uint *)(lVar56 + lVar41);
          }
          else {
            piStack_240 = *(int **)(lVar56 + lVar41);
          }
        }
        else {
          piStack_240 = (int *)0x0;
          bStack_250 = 0xd8;
          uStack_24f = 0x30a6;
          bStack_248 = 1;
        }
        auVar107 = FUN_006b0928(&bStack_250,"bounds");
        uVar30 = auVar107._8_8_;
        puVar44 = auVar107._0_8_;
        if (auVar107._12_4_ - 9U < 2) {
          uVar51 = auVar107._8_4_ & 0xff;
          if (uVar51 < 4) {
            if (1 < uVar51) {
              uVar45 = (ulong)(ushort)*puVar44;
              uVar30 = uVar30 >> 8 & 0xff;
              uVar51 = (uint)uVar30;
              goto joined_r0x00738a3c;
            }
            uVar30 = uVar30 >> 8 & 0xff;
            puVar44 = (ulong *)((long)puVar44 - (ulong)(byte)*puVar44);
            lVar41 = -uVar30;
            if (3 < (uint)uVar30) goto LAB_00738880;
LAB_00738a40:
            if ((uint)uVar30 < 2) {
              uVar45 = (ulong)*(byte *)((long)puVar44 + lVar41);
            }
            else {
              uVar45 = (ulong)*(ushort *)((long)puVar44 + lVar41);
            }
          }
          else {
            if (uVar51 < 8) {
              uVar45 = (ulong)(uint)*puVar44;
              uVar30 = uVar30 >> 8 & 0xff;
              uVar51 = (uint)uVar30;
            }
            else {
              uVar45 = *puVar44;
              uVar30 = uVar30 >> 8 & 0xff;
              uVar51 = (uint)uVar30;
            }
joined_r0x00738a3c:
            lVar41 = -uVar30;
            puVar44 = (ulong *)((long)puVar44 - uVar45);
            if (uVar51 < 4) goto LAB_00738a40;
LAB_00738880:
            if ((uint)uVar30 < 8) {
              uVar45 = (ulong)*(uint *)((long)puVar44 + lVar41);
            }
            else {
              uVar45 = *(ulong *)((long)puVar44 + lVar41);
            }
          }
          if (uVar45 == 0) goto LAB_00738890;
          puVar36 = (ulong *)((long)puVar44 + uVar45 * uVar30);
          uVar67 = 1;
          bVar3 = (byte)*puVar36;
          uVar51 = (uint)uVar30;
          if (1 < (bVar3 >> 2) - 9) {
            uVar46 = 0;
            puVar76 = &DAT_0030a6d9;
joined_r0x00738ad4:
            if (uVar45 == 1) goto joined_r0x0073ba8c;
LAB_0073ba34:
            bVar3 = *(byte *)((long)puVar36 + 1);
            if (1 < (bVar3 >> 2) - 9) goto joined_r0x0073ba8c;
            puVar44 = (ulong *)((long)puVar44 + uVar30);
            if (uVar51 < 4) {
              if (1 < uVar51) {
                uVar45 = (ulong)(ushort)*puVar44;
                goto joined_r0x0073bb20;
              }
              uVar45 = (ulong)bVar3 & 3;
              plVar65 = (long *)((long)puVar44 - (ulong)(byte)*puVar44);
              uVar30 = 1L << uVar45;
              uVar51 = (uint)uVar45;
              lVar41 = -uVar30;
              if (1 < uVar51) goto LAB_0073bad4;
LAB_0073bb44:
              if (uVar51 != 0) {
                uVar45 = (ulong)*(ushort *)((long)plVar65 + lVar41);
                goto joined_r0x0073bb58;
              }
              uVar45 = (ulong)*(byte *)((long)plVar65 + lVar41);
              uVar30 = 1;
              goto joined_r0x0073ba8c;
            }
            if (uVar51 < 8) {
              uVar45 = (ulong)(uint)*puVar44;
            }
            else {
              uVar45 = *puVar44;
            }
joined_r0x0073bb20:
            uVar51 = bVar3 & 3;
            uVar30 = 1L << ((ulong)bVar3 & 3);
            lVar41 = -uVar30;
            plVar65 = (long *)((long)puVar44 - uVar45);
            if (uVar51 < 2) goto LAB_0073bb44;
LAB_0073bad4:
            if (uVar51 == 2) {
              uVar45 = (ulong)*(uint *)((long)plVar65 + lVar41);
              uVar30 = 4;
              goto joined_r0x0073ba8c;
            }
            uVar45 = *(ulong *)((long)plVar65 + lVar41);
joined_r0x0073bb58:
            if (uVar46 != 0) goto LAB_00738aec;
            goto LAB_007388b0;
          }
          if (uVar51 < 4) {
            if (uVar51 < 2) {
              uVar46 = (ulong)(byte)*puVar44;
            }
            else {
              uVar46 = (ulong)(ushort)*puVar44;
            }
          }
          else if (uVar51 < 8) {
            uVar46 = (ulong)(uint)*puVar44;
          }
          else {
            uVar46 = *puVar44;
          }
          uVar67 = 1L << ((ulong)bVar3 & 3);
          lVar41 = -uVar67;
          puVar76 = (undefined1 *)((long)puVar44 - uVar46);
          if ((bVar3 & 3) < 2) {
            if ((bVar3 & 3) == 0) {
              uVar46 = (ulong)(byte)puVar76[lVar41];
              uVar67 = 1;
            }
            else {
              uVar46 = (ulong)*(ushort *)(puVar76 + lVar41);
            }
            goto joined_r0x00738ad4;
          }
          if ((bVar3 & 3) == 2) {
            uVar46 = (ulong)*(uint *)(puVar76 + lVar41);
            uVar67 = 4;
            goto joined_r0x00738ad4;
          }
          uVar46 = *(ulong *)(puVar76 + lVar41);
          if (uVar45 != 1) goto LAB_0073ba34;
joined_r0x0073ba8c:
          plVar65 = (long *)&DAT_0030a6d9;
          uVar45 = 0;
          uVar30 = 1;
joined_r0x0073ba8c:
          if (uVar46 == 0) goto LAB_007388b0;
LAB_00738aec:
          uVar51 = 1 << ((ulong)(byte)puVar76[uVar46 * (uVar67 & 0xffffffff)] & 3);
          uStack_114 = (uint)((byte)puVar76[uVar46 * (uVar67 & 0xffffffff)] >> 2) | uVar51 >> 0x18;
          uStack_118 = uVar51 << 8 | (uint)uVar67;
          bStack_120 = (byte)puVar76;
          uStack_11f = (undefined7)((ulong)puVar76 >> 8);
          auVar107 = FUN_006b3dec(&bStack_120);
          dVar94 = auVar107._0_8_;
          if (1 < uVar46) goto LAB_007388cc;
LAB_00738b2c:
          uStack_210._0_4_ = 0;
          uStack_210._4_4_ = 0;
          uStack_208._0_4_ = 0x101;
          uStack_208._4_4_ = 0;
          auVar107 = FUN_006b3dec(&uStack_210);
          dVar90 = auVar107._0_8_;
          if (2 < uVar46) goto LAB_00738b48;
LAB_00738910:
          plStack_180 = (long *)0x0;
          plStack_178 = (long *)0x101;
          auVar107 = FUN_006b3dec(&plStack_180);
          dVar91 = auVar107._0_8_;
          if (uVar45 != 0) goto LAB_0073892c;
LAB_00738b8c:
          plStack_268 = (long *)0x0;
          plStack_260 = (long *)0x101;
          auVar107 = FUN_006b3dec(&plStack_268);
          dVar92 = auVar107._0_8_;
          if (uVar45 < 2) goto LAB_00738ba8;
LAB_0073896c:
          uStack_278 = uVar30 & 0xffffffff;
          bVar3 = *(byte *)((long)plVar65 + uVar45 * uStack_278 + 1);
          puStack_280 = (undefined *)((long)plVar65 + uStack_278);
          uStack_278 = (ulong)(bVar3 >> 2) << 0x20 | (ulong)(uint)(1 << ((ulong)bVar3 & 3)) << 8 |
                       uStack_278;
          auVar107 = FUN_006b3dec(&puStack_280);
          dVar93 = auVar107._0_8_;
          if (uVar45 < 3) goto LAB_007389b0;
LAB_00738bc4:
          bVar3 = *(byte *)((long)plVar65 + uVar45 * (uVar30 & 0xffffffff) + 2);
          auStack_190._0_8_ = (long)plVar65 + (uVar30 & 0xffffffff) * 2;
          auStack_190._8_8_ =
               (ulong)(bVar3 >> 2) << 0x20 | (ulong)(uint)(1 << ((ulong)bVar3 & 3)) << 8 |
               uVar30 & 0xffffffff;
        }
        else {
LAB_00738890:
          uVar30 = 1;
          puVar76 = &DAT_0030a6d9;
          uVar45 = 0;
          uVar46 = 0;
          plVar65 = (long *)&DAT_0030a6d9;
          uVar67 = 1;
LAB_007388b0:
          bStack_120 = 0;
          uStack_11f = 0;
          uStack_118 = 0x101;
          uStack_114 = 0;
          auVar107 = FUN_006b3dec(&bStack_120);
          dVar94 = auVar107._0_8_;
          if (uVar46 < 2) goto LAB_00738b2c;
LAB_007388cc:
          uVar51 = 1 << ((ulong)(byte)puVar76[uVar46 * (uVar67 & 0xffffffff) + 1] & 3);
          uStack_208._4_4_ =
               (uint)((byte)puVar76[uVar46 * (uVar67 & 0xffffffff) + 1] >> 2) | uVar51 >> 0x18;
          uStack_210 = puVar76 + (uVar67 & 0xffffffff);
          uStack_208._0_4_ = uVar51 << 8 | (uint)uVar67;
          auVar107 = FUN_006b3dec(&uStack_210);
          dVar90 = auVar107._0_8_;
          if (uVar46 < 3) goto LAB_00738910;
LAB_00738b48:
          plStack_180 = (long *)(puVar76 + (uVar67 & 0xffffffff) * 2);
          plStack_178 = (long *)((ulong)((byte)puVar76[uVar46 * (uVar67 & 0xffffffff) + 2] >> 2) <<
                                 0x20 | (ulong)(uint)(1 << ((ulong)(byte)puVar76[uVar46 * (uVar67 & 
                                                  0xffffffff) + 2] & 3)) << 8 | uVar67 & 0xffffffff)
          ;
          auVar107 = FUN_006b3dec(&plStack_180);
          dVar91 = auVar107._0_8_;
          if (uVar45 == 0) goto LAB_00738b8c;
LAB_0073892c:
          bVar3 = *(byte *)((long)plVar65 + uVar45 * (uVar30 & 0xffffffff));
          plStack_260 = (long *)((ulong)(bVar3 >> 2) << 0x20 |
                                 (ulong)(uint)(1 << ((ulong)bVar3 & 3)) << 8 | uVar30 & 0xffffffff);
          plStack_268 = plVar65;
          auVar107 = FUN_006b3dec(&plStack_268);
          dVar92 = auVar107._0_8_;
          if (1 < uVar45) goto LAB_0073896c;
LAB_00738ba8:
          puStack_280 = (undefined *)0x0;
          uStack_278 = 0x101;
          auVar107 = FUN_006b3dec(&puStack_280);
          dVar93 = auVar107._0_8_;
          if (2 < uVar45) goto LAB_00738bc4;
LAB_007389b0:
          auStack_190._0_8_ = (undefined1 *)0x0;
          auStack_190._8_8_ = 0x101;
        }
        auVar107 = FUN_006b3dec(auStack_190);
        auVar108 = FUN_006b0928(&bStack_250,&DAT_002cf391);
        uVar30 = auVar108._8_8_;
        puVar44 = auVar108._0_8_;
        if (1 < auVar108._12_4_ - 9U) goto LAB_00738d64;
        uVar51 = auVar108._8_4_ & 0xff;
        if (uVar51 < 4) {
          if (1 < uVar51) {
            uVar45 = (ulong)(ushort)*puVar44;
            uVar30 = uVar30 >> 8 & 0xff;
            uVar51 = (uint)uVar30;
            goto joined_r0x00738d2c;
          }
          uVar30 = uVar30 >> 8 & 0xff;
          puVar76 = (undefined1 *)((long)puVar44 - (ulong)(byte)*puVar44);
          lVar41 = -uVar30;
          if (3 < (uint)uVar30) goto LAB_00738c74;
LAB_00738d30:
          if (1 < (uint)uVar30) {
            uVar45 = (ulong)*(ushort *)(puVar76 + lVar41);
            if (puVar76 != &DAT_0030a6d9) goto LAB_00738c90;
            goto LAB_00738d64;
          }
          uVar45 = (ulong)(byte)puVar76[lVar41];
          if (puVar76 == &DAT_0030a6d9) goto LAB_00738d64;
LAB_00738c90:
          if (uVar45 == 0) {
            bStack_120 = 0;
            uStack_11f = 0;
            uStack_118 = 0x101;
            uStack_114 = 0;
            uStack_370 = FUN_00742b40(&bStack_120);
LAB_00738da0:
            puVar33 = (undefined1 *)0x0;
            uVar30 = 0x101;
          }
          else {
            uVar51 = 1 << ((ulong)(byte)puVar76[uVar45 * uVar30] & 3);
            uStack_114 = (uint)((byte)puVar76[uVar45 * uVar30] >> 2) | uVar51 >> 0x18;
            uStack_118 = uVar51 << 8 | (uint)uVar30;
            bStack_120 = (byte)puVar76;
            uStack_11f = (undefined7)((ulong)puVar76 >> 8);
            uStack_370 = FUN_00742b40(&bStack_120);
            if (uVar45 < 2) goto LAB_00738da0;
            puVar33 = puVar76 + uVar30;
            uVar30 = (ulong)((byte)puVar76[uVar45 * uVar30 + 1] >> 2) << 0x20 |
                     (ulong)(uint)(1 << ((ulong)(byte)puVar76[uVar45 * uVar30 + 1] & 3)) << 8 |
                     uVar30;
          }
          bStack_120 = (byte)puVar33;
          uStack_11f = (undefined7)((ulong)puVar33 >> 8);
          uStack_118 = (uint)uVar30;
          uStack_114 = (uint)(uVar30 >> 0x20);
          lVar41 = FUN_00742b40(&bStack_120);
          uStack_370 = uStack_370 | lVar41 << 0x20;
        }
        else {
          if (uVar51 < 8) {
            uVar45 = (ulong)(uint)*puVar44;
            uVar30 = uVar30 >> 8 & 0xff;
            uVar51 = (uint)uVar30;
          }
          else {
            uVar45 = *puVar44;
            uVar30 = uVar30 >> 8 & 0xff;
            uVar51 = (uint)uVar30;
          }
joined_r0x00738d2c:
          lVar41 = -uVar30;
          puVar76 = (undefined1 *)((long)puVar44 - uVar45);
          if (uVar51 < 4) goto LAB_00738d30;
LAB_00738c74:
          if ((uint)uVar30 < 8) {
            uVar45 = (ulong)*(uint *)(puVar76 + lVar41);
            if (puVar76 == &DAT_0030a6d9) goto LAB_00738d64;
            goto LAB_00738c90;
          }
          uVar45 = *(ulong *)(puVar76 + lVar41);
          if (puVar76 != &DAT_0030a6d9) goto LAB_00738c90;
LAB_00738d64:
          uStack_370 = 0;
        }
        plStack_178 = (long *)0x0;
        plStack_180 = (long *)0x0;
        plStack_170 = (long *)0x0;
        puVar31 = (uint *)((long)piVar64 + (ulong)*(ushort *)((long)piVar64 + (10 - (long)*piVar64))
                          );
        uVar51 = *(uint *)((long)puVar31 + (ulong)*puVar31);
        FUN_00743854(&plStack_180,(ulong)uVar51);
        if (uVar51 != 0) {
          uVar30 = 0;
          do {
            if (*(ushort *)((long)piVar64 - (long)*piVar64) < 0xb) {
              lVar41 = 0;
            }
            else {
              uVar45 = (ulong)((ushort *)((long)piVar64 - (long)*piVar64))[5];
              lVar41 = 0;
              if (uVar45 != 0) {
                puVar31 = (uint *)((long)piVar64 + uVar45);
                lVar41 = (long)puVar31 + (ulong)*puVar31;
              }
            }
            puVar31 = (uint *)(lVar41 + (ulong)(uint)((int)uVar30 << 2) + 4);
            piVar73 = (int *)((long)puVar31 + (ulong)*puVar31);
            if ((*(ushort *)((long)piVar73 - (long)*piVar73) < 7) ||
               (uVar45 = (ulong)((ushort *)((long)piVar73 - (long)*piVar73))[3], uVar45 == 0)) {
LAB_00738ec0:
              uVar67 = 0;
              puVar77 = &DAT_0030a6d8;
              uVar45 = 1;
LAB_00738ed0:
              puVar44 = (ulong *)(puVar77 + uVar45 * -3);
              uVar74 = (ulong)(byte)*puVar44;
              uVar46 = (ulong)*(byte *)((long)puVar44 + uVar45);
            }
            else {
              puVar31 = (uint *)((long)piVar73 + uVar45);
              puVar31 = (uint *)((long)puVar31 + (ulong)*puVar31);
              pbVar54 = (byte *)((long)puVar31 + (ulong)*puVar31 + 2);
              bVar3 = *pbVar54;
              if ((bVar3 & 0xfc) != 0x24) goto LAB_00738ec0;
              bVar4 = *(byte *)((long)puVar31 + (ulong)*puVar31 + 3);
              puVar44 = (ulong *)(pbVar54 + -(ulong)bVar4);
              if (bVar4 < 4) {
                if (bVar4 < 2) {
                  uVar45 = (ulong)(byte)*puVar44;
                }
                else {
                  uVar45 = (ulong)(ushort)*puVar44;
                }
              }
              else if (bVar4 < 8) {
                uVar45 = (ulong)(uint)*puVar44;
              }
              else {
                uVar45 = *puVar44;
              }
              uVar52 = bVar3 & 3;
              puVar77 = (undefined *)((long)puVar44 - uVar45);
              uVar45 = 1L << uVar52;
              lVar41 = -uVar45;
              if (uVar52 < 2) {
                if ((bVar3 & 3) != 0) {
                  uVar67 = (ulong)*(ushort *)(puVar77 + lVar41);
                  puVar44 = (ulong *)(puVar77 + -6);
                  uVar74 = (ulong)(ushort)*puVar44;
                  uVar46 = (ulong)*(ushort *)((long)puVar44 + uVar45);
                  goto LAB_00738ee0;
                }
                uVar67 = (ulong)(byte)puVar77[lVar41];
                goto LAB_00738ed0;
              }
              if (uVar52 == 2) {
                uVar67 = (ulong)*(uint *)(puVar77 + -4);
                puVar44 = (ulong *)(puVar77 + -0xc);
                uVar74 = (ulong)(uint)*puVar44;
                uVar46 = (ulong)*(uint *)(puVar77 + -8);
              }
              else {
                uVar67 = *(ulong *)(puVar77 + lVar41);
                puVar44 = (ulong *)(puVar77 + (-3L << uVar52));
                uVar74 = *puVar44;
                uVar46 = (ulong)*(byte *)((long)puVar44 + uVar45);
                uVar45 = 8;
              }
            }
LAB_00738ee0:
            lVar56 = (long)puVar44 - uVar74;
            uVar53 = (uint)uVar46;
            uVar52 = uVar53 & 0xff;
            uVar46 = uVar46 & 0xff;
            lVar41 = -uVar46;
            if (uVar52 < 4) {
              if (uVar52 < 2) {
                uVar74 = (ulong)*(byte *)(lVar56 + lVar41);
              }
              else {
                uVar74 = (ulong)*(ushort *)(lVar56 + lVar41);
              }
joined_r0x00738f60:
              if (7 < (uVar53 - 1 & 0xff)) goto LAB_00738fe8;
LAB_00738f64:
              if ((0x8bU >> (ulong)(uVar53 - 1 & 0x1f) & 1) == 0) goto LAB_00738fe8;
              lVar41 = bsearch(&DAT_002c05ad,lVar56,uVar74,uVar46,
                               (&DAT_012af0a0)[(ulong)(uVar53 - 1) & 0xff]);
              if (lVar41 == 0) goto LAB_00738fe8;
              uVar74 = 0;
              if (uVar46 != 0) {
                uVar74 = (lVar41 - lVar56) / (long)uVar46;
              }
              if ((uVar67 <= uVar74) || ((byte)puVar77[uVar74 + uVar67 * uVar45] >> 2 != 9))
              goto LAB_00738fe8;
              puVar44 = (ulong *)(puVar77 + uVar74 * uVar45);
              uVar52 = (uint)uVar45;
              if (uVar52 < 4) {
                if (uVar52 < 2) {
                  uVar46 = (ulong)(byte)*puVar44;
                }
                else {
                  uVar46 = (ulong)(ushort)*puVar44;
                }
              }
              else if (uVar52 < 8) {
                uVar46 = (ulong)(uint)*puVar44;
              }
              else {
                uVar46 = *puVar44;
              }
              uVar45 = (ulong)(uint)(1 << ((ulong)(byte)puVar77[uVar74 + uVar67 * uVar45] & 3)) << 8
                       | uVar45;
              puVar77 = (undefined *)((long)puVar44 - uVar46);
              uVar67 = uVar45 >> 8 & 0xff;
              lVar41 = -(uVar45 >> 8 & 0xff);
              uVar52 = (uint)uVar67;
              if (uVar52 < 4) {
                if (uVar52 < 2) {
                  uVar45 = (ulong)(byte)puVar77[lVar41];
                }
                else {
                  uVar45 = (ulong)*(ushort *)(puVar77 + lVar41);
                }
              }
              else if (uVar52 < 8) {
                uVar45 = (ulong)*(uint *)(puVar77 + lVar41);
              }
              else {
                uVar45 = *(ulong *)(puVar77 + lVar41);
              }
            }
            else {
              if (7 < uVar52) {
                uVar74 = *(ulong *)(lVar56 + lVar41);
                goto joined_r0x00738f60;
              }
              uVar74 = (ulong)*(uint *)(lVar56 + lVar41);
              if ((uVar53 - 1 & 0xff) < 8) goto LAB_00738f64;
LAB_00738fe8:
              uVar45 = 0;
              uVar67 = 1;
              puVar77 = &DAT_0030a6d8;
            }
            uStack_210._0_4_ = (undefined4)uVar104;
            uStack_210._4_4_ = (uint)((ulong)uVar104 >> 0x20);
            puStack_200 = (undefined *)0x0;
            uStack_208._0_4_ = 0;
            uStack_208._4_4_ = 0;
            lStack_1f0 = 0;
            plStack_1f8 = (long *)0x0;
            plStack_1e0 = (long *)0x0;
            uStack_1e8 = 0;
            puStack_1d0 = (undefined8 *)0x0;
            puStack_1d8 = (undefined8 *)0x0;
            puStack_1c0 = (ulong *)0x0;
            puStack_1c8 = (undefined8 *)0x0;
            puStack_1b0 = (ulong *)0x0;
            puStack_1b8 = (ulong *)0x0;
            plVar65 = plStack_1e0;
            if (*(ushort *)((long)piVar73 - (long)*piVar73) < 0xd) {
LAB_0073907c:
              plStack_1e0 = plVar65;
              puVar42 = (ushort *)((long)param_2 - (long)*param_2);
              if (4 < *puVar42) goto LAB_00739094;
LAB_007390f8:
              lVar41 = 0;
              puVar42 = (ushort *)((long)piVar73 - (long)*piVar73);
              if (10 < *puVar42) goto LAB_00739110;
LAB_00739120:
              iVar23 = -1;
            }
            else {
              uVar46 = (ulong)((ushort *)((long)piVar73 - (long)*piVar73))[6];
              if (uVar46 == 0) goto LAB_0073907c;
              uVar52 = *(uint *)((long)piVar73 + uVar46);
              if ((int)uVar52 < 0) goto LAB_0073907c;
              plVar65 = SUB168(*(undefined1 (*) [16])(puStack_150 + (ulong)uVar52 * 2),8);
              uVar62 = SUB168(*(undefined1 (*) [16])(puStack_150 + (ulong)uVar52 * 2),0);
              if (plVar65 != (long *)0x0) {
                FUN_0129eac0(1,plVar65 + 1);
                plVar27 = plStack_1e0;
                uStack_1e8 = uVar62;
                if (plStack_1e0 != (long *)0x0) {
                  plVar75 = plStack_1e0 + 1;
                  plStack_1e0 = plVar65;
                  lVar41 = FUN_0129eb20(0xffffffffffffffff,plVar75);
                  plVar65 = plStack_1e0;
                  if (lVar41 == 0) {
                    (**(code **)(*plVar27 + 0x10))(plVar27);
                    _ZNSt6__ndk119__shared_weak_count14__release_weakEv(plVar27);
                    puVar42 = (ushort *)((long)param_2 - (long)*param_2);
                    uVar5 = *puVar42;
                    goto joined_r0x007390f4;
                  }
                }
                goto LAB_0073907c;
              }
              puVar42 = (ushort *)((long)param_2 - (long)*param_2);
              uVar5 = *puVar42;
              plStack_1e0 = plVar65;
              uStack_1e8 = uVar62;
joined_r0x007390f4:
              if (uVar5 < 5) goto LAB_007390f8;
LAB_00739094:
              lVar41 = 0;
              if ((ulong)puVar42[2] != 0) {
                puVar31 = (uint *)((long)param_2 + (ulong)puVar42[2]);
                lVar41 = (long)puVar31 + (ulong)*puVar31;
              }
              puVar42 = (ushort *)((long)piVar73 - (long)*piVar73);
              if (*puVar42 < 0xb) goto LAB_00739120;
LAB_00739110:
              if ((ulong)puVar42[5] == 0) goto LAB_00739120;
              iVar23 = *(int *)((long)piVar73 + (ulong)puVar42[5]);
            }
            plVar65 = plStack_228;
            puVar35 = puStack_230;
            puVar31 = (uint *)(lVar41 + (ulong)(uint)(iVar23 << 2) + 4);
            piVar73 = (int *)((long)puVar31 + (ulong)*puVar31);
            puVar42 = (ushort *)((long)piVar73 - (long)*piVar73);
            uVar5 = *puVar42;
            if (uVar5 < 9) {
              uStack_210._4_4_ = 1;
              if (6 < uVar5) goto LAB_0073919c;
              lStack_1f0 = 0;
              uStack_208._0_4_ = 0;
            }
            else {
              if ((ulong)puVar42[4] == 0) {
                uStack_210._4_4_ = 1;
              }
              else {
                uStack_210._4_4_ = (uint)(*(short *)((long)piVar73 + (ulong)puVar42[4]) != 0x1403);
              }
LAB_0073919c:
              iVar23 = 0;
              if ((ulong)puVar42[3] != 0) {
                iVar23 = *(int *)((long)piVar73 + (ulong)puVar42[3]);
              }
              lStack_1f0 = (long)iVar23;
              if ((uVar5 < 0xb) || ((ulong)puVar42[5] == 0)) {
                uStack_208._0_4_ = 0;
              }
              else {
                uStack_208._0_4_ = *(uint *)((long)piVar73 + (ulong)puVar42[5]);
              }
            }
            uStack_210._0_4_ = 4;
            if (plStack_228 != (long *)0x0) {
              uStack_210._0_4_ = 4;
              FUN_0129eac0(1,plStack_228 + 1);
            }
            plVar27 = plStack_1f8;
            puStack_200 = puVar35;
            plStack_1f8 = plVar65;
            if ((plVar27 == (long *)0x0) ||
               (lVar41 = FUN_0129eb20(0xffffffffffffffff,plVar27 + 1), lVar41 != 0)) {
              uVar46 = (ulong)bStack_130;
              puVar44 = (ulong *)(puStack_138 + uVar46 * -3);
              if (bStack_130 < 4) goto LAB_00739234;
LAB_007392cc:
              if (7 < (uint)uVar46) {
                uVar74 = *puVar44;
                goto LAB_007392fc;
              }
              uVar52 = *(uint *)((long)puVar44 + uVar46);
              uVar83 = (ulong)uVar52;
              lVar41 = (long)puVar44 - (ulong)(uint)*puVar44;
joined_r0x007392f0:
              uVar83 = uVar83 & 0xff;
              uVar53 = uVar52 & 0xff;
              lVar56 = -uVar83;
              uVar24 = uVar52;
              if (uVar53 < 4) goto LAB_00739318;
LAB_00739264:
              uVar24 = uVar52;
              if (7 < uVar53) {
                uVar46 = *(ulong *)(lVar41 + lVar56);
                goto joined_r0x00739294;
              }
              uVar46 = (ulong)*(uint *)(lVar41 + lVar56);
joined_r0x0073927c:
              uVar99 = uVar24 - 1;
              if ((uVar99 & 0xff) < 8) goto LAB_0073934c;
LAB_007393d4:
              uVar74 = 0;
              uVar46 = 1;
              puVar76 = &DAT_0030a6d9;
            }
            else {
              (**(code **)(*plVar27 + 0x10))(plVar27);
              _ZNSt6__ndk119__shared_weak_count14__release_weakEv(plVar27);
              uVar46 = (ulong)bStack_130;
              puVar44 = (ulong *)(puStack_138 + uVar46 * -3);
              if (3 < bStack_130) goto LAB_007392cc;
LAB_00739234:
              if (1 < (uint)uVar46) {
                uVar83 = (ulong)*(ushort *)((long)puVar44 + uVar46);
                lVar41 = (long)puVar44 - (ulong)(ushort)*puVar44;
                uVar52 = (uint)*(ushort *)((long)puVar44 + uVar46);
                goto joined_r0x007392f0;
              }
              uVar74 = (ulong)(byte)*puVar44;
LAB_007392fc:
              bVar3 = *(byte *)((long)puVar44 + uVar46);
              uVar83 = (ulong)bVar3;
              uVar52 = (uint)bVar3;
              lVar41 = (long)puVar44 - uVar74;
              uVar53 = (uint)bVar3;
              lVar56 = -uVar83;
              uVar24 = (uint)bVar3;
              if (3 < uVar53) goto LAB_00739264;
LAB_00739318:
              if (uVar53 < 2) {
                uVar46 = (ulong)*(byte *)(lVar41 + lVar56);
                goto joined_r0x0073927c;
              }
              uVar46 = (ulong)*(ushort *)(lVar41 + lVar56);
joined_r0x00739294:
              uVar99 = uVar24 - 1;
              if (7 < (uVar99 & 0xff)) goto LAB_007393d4;
LAB_0073934c:
              if (((0x8bU >> (ulong)(uVar99 & 0x1f) & 1) == 0) ||
                 (lVar56 = bsearch(&DAT_00295342,lVar41,uVar46,uVar83,
                                   (&DAT_012af0a0)[(ulong)(uint)uVar99 & 0xff]), lVar56 == 0))
              goto LAB_007393d4;
              uVar46 = 0;
              if (uVar83 != 0) {
                uVar46 = (lVar56 - lVar41) / (long)uVar83;
              }
              if (uStack_128 <= uVar46) goto LAB_007393d4;
              if (1 < ((byte)puStack_138[uVar46 + uStack_128 * bStack_130] >> 2) - 9)
              goto LAB_007393d4;
              puVar44 = (ulong *)(puStack_138 + uVar46 * bStack_130);
              if (bStack_130 < 4) {
                if (bStack_130 < 2) {
                  uVar74 = (ulong)(byte)*puVar44;
                }
                else {
                  uVar74 = (ulong)(ushort)*puVar44;
                }
              }
              else if (bStack_130 < 8) {
                uVar74 = (ulong)(uint)*puVar44;
              }
              else {
                uVar74 = *puVar44;
              }
              uVar83 = (ulong)(byte)puStack_138[uVar46 + uStack_128 * bStack_130] & 3;
              puVar76 = (undefined1 *)((long)puVar44 - uVar74);
              uVar46 = 1L << uVar83;
              uVar52 = (uint)uVar83;
              lVar41 = -uVar46;
              if (uVar52 < 2) {
                if (uVar52 == 0) {
                  uVar74 = (ulong)(byte)puVar76[lVar41];
                }
                else {
                  uVar74 = (ulong)*(ushort *)(puVar76 + lVar41);
                }
              }
              else if (uVar52 == 2) {
                uVar74 = (ulong)*(uint *)(puVar76 + lVar41);
              }
              else {
                uVar74 = *(ulong *)(puVar76 + lVar41);
              }
            }
            uVar52 = (uint)uVar67;
            puVar44 = (ulong *)(puVar77 + uVar67 * -3);
            if (uVar52 < 4) {
              if (uVar52 < 2) {
                uVar83 = (ulong)(byte)*puVar44;
                goto LAB_00739478;
              }
              uVar83 = (ulong)(ushort)*puVar44;
              uVar5 = *(ushort *)((long)puVar44 + uVar67);
              uVar59 = (uint)uVar5;
              uVar24 = (uint)uVar5;
              uVar53 = uVar5 & 0xff;
              uVar34 = (ulong)uVar5 & 0xff;
joined_r0x0073946c:
              lVar56 = -uVar34;
              lVar41 = (long)puVar44 - uVar83;
              if (3 < uVar53) goto LAB_00739430;
LAB_00739494:
              if (uVar53 < 2) {
                uVar83 = (ulong)*(byte *)(lVar41 + lVar56);
              }
              else {
                uVar83 = (ulong)*(ushort *)(lVar41 + lVar56);
              }
joined_r0x007394ac:
              uVar24 = uVar59 - 1;
              if (7 < (uVar24 & 0xff)) goto LAB_007394ec;
LAB_007394e0:
              if ((0x8bU >> (ulong)(uVar24 & 0x1f) & 1) == 0) goto LAB_007394ec;
              lVar56 = bsearch(&DAT_002b9514,lVar41,uVar83,uVar34,
                               (&DAT_012af0a0)[(ulong)uVar24 & 0xff]);
              if (lVar56 == 0) {
                puVar35 = (undefined *)0x0;
                uStack_114 = 0;
                uVar24 = 0;
                uVar53 = 1;
                uVar59 = 0x100;
              }
              else {
                uVar83 = 0;
                if (uVar34 != 0) {
                  uVar83 = (lVar56 - lVar41) / (long)uVar34;
                }
                if (uVar83 < uVar45) {
                  puVar35 = puVar77 + uVar83 * uVar67;
                  uVar83 = (ulong)((byte)puVar77[uVar83 + uVar45 * uVar67] >> 2) << 0x20 |
                           (ulong)(uint)(1 << ((ulong)(byte)puVar77[uVar83 + uVar45 * uVar67] & 3))
                           << 8 | uVar67;
                }
                else {
                  puVar35 = (undefined *)0x0;
                  uVar83 = 0x101;
                }
                uStack_114 = (uint)(uVar83 >> 0x20);
                uVar53 = (uint)uVar83;
                uVar24 = uVar53 & 0xffff0000;
                uVar59 = uVar53 & 0xff00;
                uVar53 = uVar53 & 0xff;
              }
            }
            else {
              if (7 < uVar52) {
                uVar83 = *puVar44;
LAB_00739478:
                bVar3 = *(byte *)((long)puVar44 + uVar67);
                uVar34 = (ulong)bVar3;
                uVar59 = (uint)bVar3;
                uVar24 = (uint)bVar3;
                uVar53 = (uint)bVar3;
                goto joined_r0x0073946c;
              }
              uVar24 = *(uint *)((long)puVar44 + uVar67);
              uVar53 = uVar24 & 0xff;
              uVar34 = (ulong)uVar24 & 0xff;
              lVar41 = (long)puVar44 - (ulong)(uint)*puVar44;
              lVar56 = -uVar34;
              uVar59 = uVar24;
              if (uVar53 < 4) goto LAB_00739494;
LAB_00739430:
              if (7 < uVar53) {
                uVar83 = *(ulong *)(lVar41 + lVar56);
                uVar59 = uVar24;
                goto joined_r0x007394ac;
              }
              uVar83 = (ulong)*(uint *)(lVar41 + lVar56);
              uVar24 = uVar24 - 1;
              if ((uVar24 & 0xff) < 8) goto LAB_007394e0;
LAB_007394ec:
              puVar35 = (undefined *)0x0;
              uVar53 = 0;
              uVar59 = 0;
              uStack_114 = 0;
              uVar24 = 0;
            }
            uStack_118 = uVar59 | uVar53 | uVar24;
            bStack_120 = (byte)puVar35;
            uStack_11f = (undefined7)((ulong)puVar35 >> 8);
            uVar83 = FUN_00742b40(&bStack_120);
            uVar83 = uVar83 & 0xffffffff;
            if (uVar83 < uVar74) {
              bVar3 = puVar76[uVar83 + uVar74 * uVar46];
              if ((bVar3 & 0xfc) != 0x24) goto LAB_00739554;
              puVar36 = (ulong *)(puVar76 + uVar83 * (uVar46 & 0xffffffff));
              uVar53 = (uint)uVar46;
              if (uVar53 < 4) {
                if (uVar53 < 2) {
                  uVar46 = (ulong)(byte)*puVar36;
                }
                else {
                  uVar46 = (ulong)(ushort)*puVar36;
                }
              }
              else if (uVar53 < 8) {
                uVar46 = (ulong)(uint)*puVar36;
              }
              else {
                uVar46 = *puVar36;
              }
              uVar53 = bVar3 & 3;
              puVar35 = (undefined *)((long)puVar36 - uVar46);
              lVar41 = 1L << uVar53;
              lVar56 = -lVar41;
              if (uVar53 < 2) {
                if ((bVar3 & 3) != 0) {
                  uVar46 = (ulong)*(ushort *)(puVar35 + lVar56);
                  puVar42 = (ushort *)(puVar35 + -6);
                  uVar5 = *(ushort *)((long)puVar42 + lVar41);
                  uVar59 = (uint)uVar5;
                  uVar24 = (uint)uVar5;
                  lVar56 = (long)puVar42 - (ulong)*puVar42;
                  uVar53 = uVar5 & 0xff;
                  uVar74 = (ulong)uVar5 & 0xff;
                  goto joined_r0x007396bc;
                }
                uVar46 = (ulong)(byte)puVar35[lVar56];
                goto LAB_00739560;
              }
              if (uVar53 == 2) {
                uVar46 = (ulong)*(uint *)(puVar35 + -4);
                uVar24 = *(uint *)(puVar35 + -8);
                lVar56 = (long)(puVar35 + -0xc) - (ulong)*(uint *)(puVar35 + -0xc);
                uVar53 = uVar24 & 0xff;
                uVar74 = (ulong)uVar24 & 0xff;
                lVar85 = -uVar74;
                uVar59 = uVar24;
                if (3 < uVar53) goto LAB_00739728;
                goto LAB_00739588;
              }
              uVar46 = *(ulong *)(puVar35 + lVar56);
              plVar65 = (long *)(puVar35 + (-3L << uVar53));
              bVar3 = *(byte *)((long)plVar65 + lVar41);
              uVar74 = (ulong)bVar3;
              uVar59 = (uint)bVar3;
              uVar24 = (uint)bVar3;
              lVar56 = (long)plVar65 - *plVar65;
              uVar53 = (uint)bVar3;
joined_r0x007396bc:
              lVar85 = -uVar74;
              if (uVar53 < 4) goto LAB_00739588;
LAB_00739728:
              uVar24 = uVar59;
              if (uVar53 < 8) {
                uVar83 = (ulong)*(uint *)(lVar56 + lVar85);
                goto joined_r0x00739740;
              }
              uVar83 = *(ulong *)(lVar56 + lVar85);
joined_r0x00739758:
              uVar99 = uVar24 - 1;
              if ((uVar99 & 0xff) < 8) goto LAB_0073975c;
LAB_007399c4:
              if (uVar52 < 4) {
                if (uVar52 < 2) {
                  uVar46 = (ulong)(byte)*puVar44;
                  goto LAB_00739a4c;
                }
                uVar46 = (ulong)(ushort)*puVar44;
                uVar5 = *(ushort *)((long)puVar44 + uVar67);
                uVar59 = (uint)uVar5;
                uVar24 = (uint)uVar5;
                uVar53 = uVar5 & 0xff;
                uVar74 = (ulong)uVar5 & 0xff;
joined_r0x00739a40:
                lVar56 = -uVar74;
                lVar41 = (long)puVar44 - uVar46;
                if (3 < uVar53) goto LAB_00739a04;
LAB_00739a68:
                if (uVar53 < 2) {
                  uVar46 = (ulong)*(byte *)(lVar41 + lVar56);
                }
                else {
                  uVar46 = (ulong)*(ushort *)(lVar41 + lVar56);
                }
              }
              else {
                if (7 < uVar52) {
                  uVar46 = *puVar44;
LAB_00739a4c:
                  bVar3 = *(byte *)((long)puVar44 + uVar67);
                  uVar74 = (ulong)bVar3;
                  uVar59 = (uint)bVar3;
                  uVar24 = (uint)bVar3;
                  uVar53 = (uint)bVar3;
                  goto joined_r0x00739a40;
                }
                uVar24 = *(uint *)((long)puVar44 + uVar67);
                uVar53 = uVar24 & 0xff;
                uVar74 = (ulong)uVar24 & 0xff;
                lVar41 = (long)puVar44 - (ulong)(uint)*puVar44;
                lVar56 = -uVar74;
                uVar59 = uVar24;
                if (uVar53 < 4) goto LAB_00739a68;
LAB_00739a04:
                uVar59 = uVar24;
                if (uVar53 < 8) {
                  uVar46 = (ulong)*(uint *)(lVar41 + lVar56);
                }
                else {
                  uVar46 = *(ulong *)(lVar41 + lVar56);
                }
              }
              uVar59 = uVar59 - 1;
              if ((((uVar59 & 0xff) < 8) && ((0x8bU >> (ulong)(uVar59 & 0x1f) & 1) != 0)) &&
                 (lVar56 = bsearch(&DAT_002a7996,lVar41,uVar46,uVar74,
                                   (&DAT_012af0a0)[(ulong)uVar59 & 0xff]), lVar56 != 0)) {
                uVar46 = 0;
                if (uVar74 != 0) {
                  uVar46 = (lVar56 - lVar41) / (long)uVar74;
                }
                if ((uVar46 < uVar45) && (((byte)puVar77[uVar46 + uVar45 * uVar67] >> 2) - 9 < 2)) {
                  puVar44 = (ulong *)(puVar77 + uVar46 * uVar67);
                  if (uVar52 < 4) {
                    if (uVar52 < 2) {
                      uVar74 = (ulong)(byte)*puVar44;
                    }
                    else {
                      uVar74 = (ulong)(ushort)*puVar44;
                    }
                  }
                  else if (uVar52 < 8) {
                    uVar74 = (ulong)(uint)*puVar44;
                  }
                  else {
                    uVar74 = *puVar44;
                  }
                  uVar45 = (ulong)(byte)puVar77[uVar46 + uVar45 * uVar67] & 3;
                  lStack_300 = (long)puVar44 - uVar74;
                  lStack_310 = 1L << uVar45;
                  uVar52 = (uint)uVar45;
                  lVar41 = -lStack_310;
                  if (uVar52 < 2) {
                    if (uVar52 == 0) {
                      uVar46 = (ulong)*(byte *)(lStack_300 + lVar41);
                    }
                    else {
                      uVar46 = (ulong)*(ushort *)(lStack_300 + lVar41);
                    }
                  }
                  else if (uVar52 == 2) {
                    uVar46 = (ulong)*(uint *)(lStack_300 + lVar41);
                  }
                  else {
                    uVar46 = *(ulong *)(lStack_300 + lVar41);
                  }
                  plStack_268 = (long *)((ulong)plStack_268 & 0xffffffff00000000);
                  if (uVar46 != 0) goto LAB_00739c08;
                }
              }
            }
            else {
LAB_00739554:
              uVar46 = 0;
              puVar35 = &DAT_0030a6d8;
LAB_00739560:
              lVar41 = 1;
              bVar3 = puVar35[-2];
              uVar74 = (ulong)bVar3;
              uVar24 = (uint)bVar3;
              uVar53 = (uint)bVar3;
              lVar56 = (long)(puVar35 + -3) - (ulong)(byte)puVar35[-3];
              lVar85 = -uVar74;
              uVar59 = uVar24;
              if (3 < bVar3) goto LAB_00739728;
LAB_00739588:
              if (1 < uVar53) {
                uVar83 = (ulong)*(ushort *)(lVar56 + lVar85);
                goto joined_r0x00739758;
              }
              uVar83 = (ulong)*(byte *)(lVar56 + lVar85);
joined_r0x00739740:
              uVar99 = uVar24 - 1;
              if (7 < (uVar99 & 0xff)) goto LAB_007399c4;
LAB_0073975c:
              if (((0x8bU >> (ulong)(uVar99 & 0x1f) & 1) == 0) ||
                 (lVar85 = bsearch(&DAT_002a7996,lVar56,uVar83,uVar74,
                                   (&DAT_012af0a0)[(ulong)(uint)uVar99 & 0xff]), lVar85 == 0))
              goto LAB_007399c4;
              uVar83 = 0;
              if (uVar74 != 0) {
                uVar83 = (lVar85 - lVar56) / (long)uVar74;
              }
              if ((uVar46 <= uVar83) || (1 < ((byte)puVar35[uVar83 + uVar46 * lVar41] >> 2) - 9))
              goto LAB_007399c4;
              puVar36 = (ulong *)(puVar35 + uVar83 * lVar41);
              uVar53 = (uint)lVar41;
              if (uVar53 < 4) {
                if (uVar53 < 2) {
                  uVar74 = (ulong)(byte)*puVar36;
                }
                else {
                  uVar74 = (ulong)(ushort)*puVar36;
                }
              }
              else if (uVar53 < 8) {
                uVar74 = (ulong)(uint)*puVar36;
              }
              else {
                uVar74 = *puVar36;
              }
              uVar46 = (ulong)(byte)puVar35[uVar83 + uVar46 * lVar41] & 3;
              lStack_300 = (long)puVar36 - uVar74;
              lStack_310 = 1L << uVar46;
              uVar53 = (uint)uVar46;
              lVar41 = -lStack_310;
              if (uVar53 < 2) {
                if (uVar53 == 0) {
                  uVar46 = (ulong)*(byte *)(lStack_300 + lVar41);
                }
                else {
                  uVar46 = (ulong)*(ushort *)(lStack_300 + lVar41);
                }
              }
              else if (uVar53 == 2) {
                uVar46 = (ulong)*(uint *)(lStack_300 + lVar41);
              }
              else {
                uVar46 = *(ulong *)(lStack_300 + lVar41);
              }
              if (uVar46 == 0) goto LAB_007399c4;
              plStack_268 = (long *)((ulong)plStack_268 & 0xffffffff00000000);
LAB_00739c08:
              uVar45 = 0;
              do {
                bVar3 = *(byte *)(lStack_300 + uVar46 * lStack_310 + uVar45);
                if ((bVar3 & 0xfc) == 0x24) {
                  puVar44 = (ulong *)(lStack_300 + uVar45 * lStack_310);
                  uVar52 = (uint)lStack_310;
                  if (uVar52 < 4) {
                    if (uVar52 < 2) {
                      uVar45 = (ulong)(byte)*puVar44;
                    }
                    else {
                      uVar45 = (ulong)(ushort)*puVar44;
                    }
                  }
                  else if (uVar52 < 8) {
                    uVar45 = (ulong)(uint)*puVar44;
                  }
                  else {
                    uVar45 = *puVar44;
                  }
                  uVar53 = bVar3 & 3;
                  puVar77 = (undefined *)((long)puVar44 - uVar45);
                  uVar67 = 1L << uVar53;
                  uVar52 = (uint)uVar67;
                  lVar41 = -uVar67;
                  if (uVar53 < 2) {
                    if ((bVar3 & 3) != 0) {
                      uVar45 = (ulong)*(ushort *)(puVar77 + lVar41);
                      uVar21 = true;
                      puVar44 = (ulong *)(puVar77 + -6);
                      uVar5 = *(ushort *)((long)puVar44 + uVar67);
                      uVar24 = (uint)uVar5;
                      lVar41 = (long)puVar44 - (ulong)(ushort)*puVar44;
                      uVar53 = uVar5 & 0xff;
                      uVar74 = (ulong)uVar5 & 0xff;
                      goto joined_r0x00739d54;
                    }
                    uVar45 = (ulong)(byte)puVar77[lVar41];
                    goto LAB_00739c84;
                  }
                  if (uVar53 != 2) {
                    uVar45 = *(ulong *)(puVar77 + lVar41);
                    uVar21 = false;
                    puVar44 = (ulong *)(puVar77 + (-3L << uVar53));
                    bVar3 = *(byte *)((long)puVar44 + uVar67);
                    uVar74 = (ulong)bVar3;
                    uVar24 = (uint)bVar3;
                    lVar41 = (long)puVar44 - *puVar44;
                    uVar53 = (uint)bVar3;
joined_r0x00739d54:
                    lVar56 = -uVar74;
                    if (3 < uVar53) goto LAB_00739d58;
                    goto LAB_00739cb4;
                  }
                  uVar45 = (ulong)*(uint *)(puVar77 + -4);
                  uVar21 = false;
                  puVar44 = (ulong *)(puVar77 + -0xc);
                  uVar24 = *(uint *)(puVar77 + -8);
                  uVar52 = 4;
                  lVar41 = (long)puVar44 - (ulong)(uint)*puVar44;
                  uVar53 = uVar24 & 0xff;
                  uVar74 = (ulong)uVar24 & 0xff;
                  lVar56 = -uVar74;
                  if (uVar53 < 4) goto LAB_00739cb4;
LAB_00739d58:
                  if (7 < uVar53) {
                    uVar83 = *(ulong *)(lVar41 + lVar56);
                    goto joined_r0x00739cf4;
                  }
                  uVar83 = (ulong)*(uint *)(lVar41 + lVar56);
joined_r0x00739ccc:
                  uVar99 = uVar24 - 1;
                  if ((uVar99 & 0xff) < 8) goto LAB_00739dc8;
LAB_00739dd4:
                  puVar35 = (undefined *)0x0;
                  uVar53 = 0;
                  uVar59 = 0;
                  uStack_114 = 0;
                  uVar24 = 0;
                }
                else {
                  uVar45 = 0;
                  puVar77 = &DAT_0030a6d8;
LAB_00739c84:
                  uVar21 = true;
                  uVar67 = 1;
                  puVar44 = (ulong *)(puVar77 + -3);
                  bVar3 = puVar77[-2];
                  uVar74 = (ulong)bVar3;
                  uVar24 = (uint)bVar3;
                  uVar53 = (uint)bVar3;
                  uVar52 = 1;
                  lVar41 = (long)puVar44 - (ulong)(byte)*puVar44;
                  lVar56 = -uVar74;
                  if (3 < bVar3) goto LAB_00739d58;
LAB_00739cb4:
                  if (uVar53 < 2) {
                    uVar83 = (ulong)*(byte *)(lVar41 + lVar56);
                    goto joined_r0x00739ccc;
                  }
                  uVar83 = (ulong)*(ushort *)(lVar41 + lVar56);
joined_r0x00739cf4:
                  uVar99 = uVar24 - 1;
                  if (7 < (uVar99 & 0xff)) goto LAB_00739dd4;
LAB_00739dc8:
                  if ((0x8bU >> (ulong)(uVar99 & 0x1f) & 1) == 0) goto LAB_00739dd4;
                  lVar56 = bsearch(&DAT_002f2cf1,lVar41,uVar83,uVar74,
                                   (&DAT_012af0a0)[(ulong)(uint)uVar99 & 0xff]);
                  if (lVar56 == 0) {
                    puVar35 = (undefined *)0x0;
                    uStack_114 = 0;
                    uVar24 = 0;
                    uVar53 = 1;
                    uVar59 = 0x100;
                  }
                  else {
                    uVar83 = 0;
                    if (uVar74 != 0) {
                      uVar83 = (lVar56 - lVar41) / (long)uVar74;
                    }
                    if (uVar83 < uVar45) {
                      puVar35 = puVar77 + uVar83 * uVar67;
                      uVar74 = (ulong)((byte)puVar77[uVar83 + uVar45 * uVar67] >> 2) << 0x20 |
                               (ulong)(uint)(1 << ((ulong)(byte)puVar77[uVar83 + uVar45 * uVar67] &
                                                  3)) << 8 | uVar67;
                    }
                    else {
                      puVar35 = (undefined *)0x0;
                      uVar74 = 0x101;
                    }
                    uStack_114 = (uint)(uVar74 >> 0x20) & 0x3fffffff;
                    uVar53 = (uint)uVar74;
                    uVar24 = uVar53 & 0xffff0000;
                    uVar59 = uVar53 & 0xff00;
                    uVar53 = uVar53 & 0xff;
                  }
                }
                uStack_118 = uVar59 | uVar53 | uVar24;
                bStack_120 = (byte)puVar35;
                uStack_11f = (undefined7)((ulong)puVar35 >> 8);
                uVar99 = FUN_00742b40(&bStack_120);
                puVar36 = puStack_1b8;
                puStack_280 = (undefined *)CONCAT44(puStack_280._4_4_,uVar99);
                if (puStack_1b8 < puStack_1b0) {
                  uVar100 = (int)plStack_268;
                  *puStack_1b8 = (ulong)puStack_230;
                  puStack_1b8[1] = (ulong)plStack_228;
                  if (plStack_228 != (long *)0x0) {
                    FUN_0129eac0(1,plStack_228 + 1);
                  }
                  *(undefined4 *)(puVar36 + 2) = uVar100;
                  *(undefined4 *)((long)puVar36 + 0x14) = uVar99;
                  puStack_1b8 = puVar36 + 3;
                  if (puStack_1c8 <= puStack_1d0) goto LAB_00739e54;
LAB_00739f0c:
                  puVar26 = puStack_1d0 + 6;
                  puStack_1d0[1] = 0;
                  *puStack_1d0 = 0;
                  puStack_1d0[3] = 0;
                  puStack_1d0[2] = 0;
                  puStack_1d0[5] = 0;
                  puStack_1d0[4] = 0;
                  *(undefined4 *)puStack_1d0 = 0xffffffff;
                  puStack_1d0[2] = 0;
                  puStack_1d0[1] = 0;
                  puStack_1d0[4] = 0;
                  puStack_1d0[3] = 0;
                  *(undefined4 *)(puStack_1d0 + 5) = 0;
                  *(int *)puStack_1d0 = (int)plStack_268;
                  puStack_1d0 = puVar26;
                  if ((bool)uVar21) goto LAB_00739f40;
LAB_0073a0e4:
                  if (uVar52 < 8) {
                    uVar74 = (ulong)(uint)*puVar44;
                    uVar53 = *(uint *)((long)puVar44 + uVar67);
                    uVar83 = (ulong)uVar53;
                    goto joined_r0x00739fd4;
                  }
                  uVar74 = *puVar44;
LAB_0073a168:
                  bVar3 = *(byte *)((long)puVar44 + uVar67);
                  uVar83 = (ulong)bVar3;
                  uVar59 = (uint)bVar3;
                  uVar53 = (uint)bVar3;
                  uVar24 = (uint)bVar3;
                  lVar41 = (long)puVar44 - uVar74;
                  lVar56 = -uVar83;
                  if (uVar24 < 4) goto LAB_0073a184;
LAB_00739fd8:
                  if (7 < uVar24) {
                    uVar74 = *(ulong *)(lVar41 + lVar56);
                    goto joined_r0x0073a1b4;
                  }
                  uVar74 = (ulong)*(uint *)(lVar41 + lVar56);
joined_r0x0073a19c:
                  uVar99 = uVar53 - 1;
                  if (7 < (uVar99 & 0xff)) goto LAB_0073a1c4;
LAB_0073a1b8:
                  puVar26 = puStack_1d0;
                  if ((0x8bU >> (ulong)(uVar99 & 0x1f) & 1) == 0) goto LAB_0073a1c4;
                  lVar56 = bsearch(&DAT_002fa4f3,lVar41,uVar74,uVar83,
                                   (&DAT_012af0a0)[(ulong)(uint)uVar99 & 0xff]);
                  if (lVar56 == 0) {
                    puVar35 = (undefined *)0x0;
                    uStack_114 = 0;
                    uVar24 = 0;
                    uVar53 = 1;
                    uVar59 = 0x100;
                  }
                  else {
                    uVar74 = 0;
                    if (uVar83 != 0) {
                      uVar74 = (lVar56 - lVar41) / (long)uVar83;
                    }
                    if (uVar74 < uVar45) {
                      puVar35 = puVar77 + uVar74 * uVar67;
                      uVar74 = (ulong)((byte)puVar77[uVar74 + uVar45 * uVar67] >> 2) << 0x20 |
                               (ulong)(uint)(1 << ((ulong)(byte)puVar77[uVar74 + uVar45 * uVar67] &
                                                  3)) << 8 | uVar67;
                    }
                    else {
                      puVar35 = (undefined *)0x0;
                      uVar74 = 0x101;
                    }
                    uStack_114 = (uint)(uVar74 >> 0x20) & 0x3fffffff;
                    uVar53 = (uint)uVar74;
                    uVar24 = uVar53 & 0xffff0000;
                    uVar59 = uVar53 & 0xff00;
                    uVar53 = uVar53 & 0xff;
                  }
                }
                else {
                  puStack_1b8 = (ulong *)FUN_00743144(&puStack_1c0,&plStack_268,&puStack_230,
                                                      &puStack_280);
                  if (puStack_1d0 < puStack_1c8) goto LAB_00739f0c;
LAB_00739e54:
                  puVar26 = puStack_1d0;
                  puVar66 = puStack_1d8;
                  plVar65 = (long *)CONCAT44(uStack_208._4_4_,(uint)uStack_208);
                  lVar41 = (long)puStack_1d0 - (long)puStack_1d8 >> 4;
                  uVar74 = lVar41 * -0x5555555555555555 + 1;
                  if (0x555555555555555 < uVar74) {
                    /* WARNING: Subroutine does not return */
                    FUN_00602548(&puStack_1d8);
                  }
                  lVar56 = (long)puStack_1c8 - (long)puStack_1d8 >> 4;
                  uVar83 = lVar56 * 0x5555555555555556;
                  if (uVar83 <= uVar74) {
                    uVar83 = uVar74;
                  }
                  if (0x2aaaaaaaaaaaaa9 < (ulong)(lVar56 * -0x5555555555555555)) {
                    uVar83 = 0x555555555555555;
                  }
                  if (uVar83 == 0) {
                    lVar56 = 0;
                  }
                  else {
                    if (0x555555555555555 < uVar83) goto LAB_0073d438;
                    lVar56 = _Znwm(uVar83 * 0x30);
                  }
                  puVar40 = puStack_1d8;
                  puVar47 = (undefined8 *)(lVar56 + lVar41 * 0x10);
                  puStack_1c8 = (undefined8 *)(lVar56 + uVar83 * 0x30);
                  puVar71 = puVar47 + 6;
                  puVar47[1] = 0;
                  *puVar47 = 0;
                  puVar47[3] = 0;
                  puVar47[2] = 0;
                  puVar47[5] = 0;
                  puVar47[4] = 0;
                  *(undefined4 *)puVar47 = 0xffffffff;
                  puVar47[2] = 0;
                  puVar47[1] = 0;
                  puVar47[4] = 0;
                  puVar47[3] = 0;
                  *(undefined4 *)(puVar47 + 5) = 0;
                  puStack_1d8 = puVar47;
                  puVar87 = puVar71;
                  if (puVar26 != puVar66) {
                    lVar41 = 0;
                    do {
                      lVar56 = lVar41 + -0x30;
                      uVar99 = *(undefined4 *)((long)puVar26 + lVar41 + -0x30);
                      *(undefined8 *)((long)puVar47 + lVar41 + -0x20) = 0;
                      *(undefined8 *)((long)puVar47 + lVar41 + -0x18) = 0;
                      *(undefined4 *)((long)puVar47 + lVar41 + -0x30) = uVar99;
                      auVar108 = *(undefined1 (*) [16])((long)puVar26 + lVar41 + -0x28);
                      *(long *)((long)puVar47 + lVar41 + -0x20) = auVar108._8_8_;
                      *(long *)((long)puVar47 + lVar41 + -0x28) = auVar108._0_8_;
                      *(undefined8 *)((long)puVar47 + lVar41 + -0x18) =
                           *(undefined8 *)((long)puVar26 + lVar41 + -0x18);
                      *(undefined8 *)((long)puVar26 + lVar41 + -0x28) = 0;
                      *(undefined8 *)((long)puVar26 + lVar41 + -0x20) = 0;
                      *(undefined8 *)((long)puVar26 + lVar41 + -0x18) = 0;
                      uVar62 = *(undefined8 *)((long)puVar26 + lVar41 + -0x10);
                      *(undefined4 *)((long)puVar47 + lVar41 + -8) =
                           *(undefined4 *)((long)puVar26 + lVar41 + -8);
                      *(undefined8 *)((long)puVar47 + lVar41 + -0x10) = uVar62;
                      lVar41 = lVar56;
                    } while ((undefined8 *)((long)puVar26 + lVar56) != puVar66);
                    puStack_1d8 = (undefined8 *)((long)puVar47 + lVar56);
                    puVar26 = puVar71;
                    puVar66 = puStack_1d0;
                    while( true ) {
                      puStack_1d0 = puVar26;
                      puVar26 = puVar40;
                      puVar87 = puStack_1d0;
                      if (puVar66 == puVar40) break;
                      lVar41 = *(long *)((long)puVar66 + 0xffffffffffffffd8);
                      if (lVar41 != 0) {
                        lVar85 = *(long *)((long)puVar66 + 0xffffffffffffffe0);
                        lVar56 = lVar41;
                        if (lVar85 != lVar41) {
                          do {
                            if ((*(byte *)(lVar85 + -0x18) & 1) != 0) {
                              _ZdlPv(*(undefined8 *)(lVar85 + -8));
                            }
                            lVar85 = lVar85 + -0x28;
                          } while (lVar85 != lVar41);
                          lVar56 = *(long *)((long)puVar66 + 0xffffffffffffffd8);
                        }
                        *(long *)((long)puVar66 + 0xffffffffffffffe0) = lVar41;
                        _ZdlPv(lVar56);
                      }
                      puVar66 = (undefined8 *)((long)puVar66 + 0xffffffffffffffd0);
                      puVar26 = puStack_1d0;
                    }
                  }
                  puStack_1d0 = puVar87;
                  if (puVar26 != (undefined8 *)0x0) {
                    _ZdlPv(puVar26);
                  }
                  *(int *)puVar47 = (int)plStack_268;
                  puStack_1d0 = puVar71;
                  if (!(bool)uVar21) goto LAB_0073a0e4;
LAB_00739f40:
                  if (uVar52 < 2) {
                    uVar74 = (ulong)(byte)*puVar44;
                    goto LAB_0073a168;
                  }
                  uVar74 = (ulong)(ushort)*puVar44;
                  uVar83 = (ulong)*(ushort *)((long)puVar44 + uVar67);
                  uVar53 = (uint)*(ushort *)((long)puVar44 + uVar67);
joined_r0x00739fd4:
                  uVar83 = uVar83 & 0xff;
                  uVar24 = uVar53 & 0xff;
                  lVar56 = -uVar83;
                  lVar41 = (long)puVar44 - uVar74;
                  uVar59 = uVar53;
                  if (3 < uVar24) goto LAB_00739fd8;
LAB_0073a184:
                  uVar53 = uVar59;
                  if (uVar24 < 2) {
                    uVar74 = (ulong)*(byte *)(lVar41 + lVar56);
                    goto joined_r0x0073a19c;
                  }
                  uVar74 = (ulong)*(ushort *)(lVar41 + lVar56);
joined_r0x0073a1b4:
                  uVar99 = uVar53 - 1;
                  if ((uVar99 & 0xff) < 8) goto LAB_0073a1b8;
LAB_0073a1c4:
                  puVar35 = (undefined *)0x0;
                  uVar53 = 0;
                  uVar59 = 0;
                  uStack_114 = 0;
                  uVar24 = 0;
                  puVar26 = puStack_1d0;
                }
                uStack_118 = uVar59 | uVar53 | uVar24;
                bStack_120 = (byte)puVar35;
                uStack_11f = (undefined7)((ulong)puVar35 >> 8);
                uVar74 = FUN_00742b40(&bStack_120);
                puVar26[-2] = uVar74 & 0xffffffff;
                if ((bool)uVar21) {
                  if (uVar52 < 2) {
                    uVar74 = (ulong)(byte)*puVar44;
                    goto LAB_0073a2e4;
                  }
                  uVar74 = (ulong)(ushort)*puVar44;
                  uVar5 = *(ushort *)((long)puVar44 + uVar67);
                  uVar24 = (uint)uVar5;
                  uVar53 = (uint)uVar5;
                  uVar52 = uVar5 & 0xff;
                  uVar83 = (ulong)uVar5 & 0xff;
joined_r0x0073a2d8:
                  lVar56 = -uVar83;
                  lVar41 = (long)puVar44 - uVar74;
                  if (3 < uVar52) goto LAB_0073a234;
LAB_0073a300:
                  if (uVar52 < 2) {
                    uVar74 = (ulong)*(byte *)(lVar41 + lVar56);
                  }
                  else {
                    uVar74 = (ulong)*(ushort *)(lVar41 + lVar56);
                  }
                }
                else {
                  if (7 < uVar52) {
                    uVar74 = *puVar44;
LAB_0073a2e4:
                    bVar3 = *(byte *)((long)puVar44 + uVar67);
                    uVar83 = (ulong)bVar3;
                    uVar24 = (uint)bVar3;
                    uVar53 = (uint)bVar3;
                    uVar52 = (uint)bVar3;
                    goto joined_r0x0073a2d8;
                  }
                  uVar53 = *(uint *)((long)puVar44 + uVar67);
                  uVar52 = uVar53 & 0xff;
                  uVar83 = (ulong)uVar53 & 0xff;
                  lVar41 = (long)puVar44 - (ulong)(uint)*puVar44;
                  lVar56 = -uVar83;
                  uVar24 = uVar53;
                  if (uVar52 < 4) goto LAB_0073a300;
LAB_0073a234:
                  uVar24 = uVar53;
                  if (uVar52 < 8) {
                    uVar74 = (ulong)*(uint *)(lVar41 + lVar56);
                  }
                  else {
                    uVar74 = *(ulong *)(lVar41 + lVar56);
                  }
                }
                uVar24 = uVar24 - 1;
                if ((((uVar24 & 0xff) < 8) && ((0x8bU >> (ulong)(uVar24 & 0x1f) & 1) != 0)) &&
                   (lVar56 = bsearch(&DAT_002f2d12,lVar41,uVar74,uVar83,
                                     (&DAT_012af0a0)[(ulong)uVar24 & 0xff]), lVar56 != 0)) {
                  uVar74 = 0;
                  if (uVar83 != 0) {
                    uVar74 = (lVar56 - lVar41) / (long)uVar83;
                  }
                  if ((uVar74 < uVar45) && (((byte)puVar77[uVar74 + uVar45 * uVar67] >> 2) - 9 < 2))
                  {
                    puVar44 = (ulong *)(puVar77 + uVar74 * uVar67);
                    uVar52 = (uint)uVar67;
                    if (uVar52 < 4) {
                      if (uVar52 < 2) {
                        uVar83 = (ulong)(byte)*puVar44;
                      }
                      else {
                        uVar83 = (ulong)(ushort)*puVar44;
                      }
                    }
                    else if (uVar52 < 8) {
                      uVar83 = (ulong)(uint)*puVar44;
                    }
                    else {
                      uVar83 = *puVar44;
                    }
                    uVar45 = (ulong)(byte)puVar77[uVar74 + uVar45 * uVar67] & 3;
                    uVar52 = (uint)uVar45;
                    lVar41 = -(1L << uVar45);
                    if (uVar52 < 2) {
                      if (uVar52 == 0) {
                        uVar67 = (ulong)*(byte *)((long)puVar44 + (lVar41 - uVar83));
                      }
                      else {
                        uVar67 = (ulong)*(ushort *)((long)puVar44 + (lVar41 - uVar83));
                      }
                    }
                    else if (uVar52 == 2) {
                      uVar67 = (ulong)*(uint *)((long)puVar44 + (lVar41 - uVar83));
                    }
                    else {
                      uVar67 = *(ulong *)((long)puVar44 + (lVar41 - uVar83));
                    }
                    if (uVar67 != 0) {
                      uVar74 = 0;
                      uVar53 = 0;
                      do {
                        plVar65 = (long *)CONCAT44(uStack_208._4_4_,(uint)uStack_208);
                        uVar34 = 1;
                        bVar3 = *(byte *)((long)puVar44 + uVar74 + ((uVar67 << uVar45) - uVar83));
                        uVar24 = (uint)bVar3;
                        if ((bVar3 & 0xfc) != 0x24) {
                          uVar74 = 0;
                          puVar77 = &DAT_0030a6d8;
                          puVar50 = (undefined4 *)puVar26[-4];
                          puVar37 = (undefined4 *)puVar26[-3];
                          if (puVar37 <= puVar50) goto LAB_0073a5e0;
                          goto LAB_0073a674;
                        }
                        puVar31 = (uint *)((long)puVar44 + ((uVar74 << uVar45) - uVar83));
                        if (uVar52 < 2) {
                          if (uVar52 == 0) {
                            uVar74 = (ulong)(byte)*puVar31;
                            goto joined_r0x0073adfc;
                          }
                          puVar77 = (undefined *)((long)puVar31 - (ulong)(ushort)*puVar31);
                          uVar34 = 1L << (uVar24 & 3);
                          lVar41 = -uVar34;
                          if ((uVar24 & 3) < 2) goto LAB_0073a5cc;
LAB_0073a6b8:
                          if ((uVar24 & 3) != 2) {
                            uVar74 = *(ulong *)(puVar77 + lVar41);
                            puVar50 = (undefined4 *)puVar26[-4];
                            puVar37 = (undefined4 *)puVar26[-3];
                            if (puVar37 <= puVar50) goto LAB_0073a5e0;
                            goto LAB_0073a674;
                          }
                          uVar74 = (ulong)*(uint *)(puVar77 + lVar41);
                          uVar34 = 4;
                          puVar50 = (undefined4 *)puVar26[-4];
                          puVar37 = (undefined4 *)puVar26[-3];
                          if (puVar50 < puVar37) goto LAB_0073a674;
LAB_0073a5e0:
                          puVar69 = (undefined4 *)puVar26[-5];
                          lVar41 = (long)puVar50 - (long)puVar69 >> 3;
                          uVar70 = lVar41 * -0x3333333333333333 + 1;
                          if (0x666666666666666 < uVar70) {
                    /* WARNING: Subroutine does not return */
                            FUN_0060255c(puVar26 + -5);
                          }
                          lVar56 = (long)puVar37 - (long)puVar69 >> 3;
                          uVar57 = lVar56 * -0x6666666666666666;
                          if (uVar57 <= uVar70) {
                            uVar57 = uVar70;
                          }
                          if (0x333333333333332 < (ulong)(lVar56 * -0x3333333333333333)) {
                            uVar57 = 0x666666666666666;
                          }
                          if (uVar57 == 0) {
                            lVar56 = 0;
                          }
                          else {
                            if (0x666666666666666 < uVar57) goto LAB_0073d438;
                            lVar56 = _Znwm(uVar57 * 0x28);
                          }
                          puVar48 = (undefined4 *)(lVar56 + lVar41 * 8);
                          lVar56 = lVar56 + uVar57 * 0x28;
                          puVar37 = puVar48 + 10;
                          *puVar48 = 0xffffffff;
                          *(undefined8 *)(puVar48 + 3) = 0;
                          *(undefined8 *)(puVar48 + 1) = 0;
                          *(undefined8 *)(puVar48 + 7) = 0;
                          *(undefined8 *)(puVar48 + 5) = 0;
                          puVar48[9] = 0;
                          if (puVar50 == puVar69) {
                            puVar26[-5] = puVar48;
                            puVar26[-4] = puVar37;
                            puVar26[-3] = lVar56;
                          }
                          else {
                            do {
                              uVar62 = *(undefined8 *)(puVar50 + -10);
                              *(undefined8 *)(puVar48 + -8) = *(undefined8 *)(puVar50 + -8);
                              *(undefined8 *)(puVar48 + -10) = uVar62;
                              auVar108 = *(undefined1 (*) [16])(puVar50 + -6);
                              *(undefined8 *)(puVar48 + -2) = *(undefined8 *)(puVar50 + -2);
                              puVar58 = puVar50 + -10;
                              *(long *)(puVar48 + -4) = auVar108._8_8_;
                              *(long *)(puVar48 + -6) = auVar108._0_8_;
                              puVar48 = puVar48 + -10;
                              *(undefined8 *)(puVar50 + -4) = 0;
                              *(undefined8 *)(puVar50 + -2) = 0;
                              *(undefined8 *)(puVar50 + -6) = 0;
                              puVar50 = puVar58;
                            } while (puVar58 != puVar69);
                            puVar50 = (undefined4 *)puVar26[-5];
                            puVar69 = (undefined4 *)puVar26[-4];
                            puVar26[-5] = puVar48;
                            puVar26[-4] = puVar37;
                            puVar26[-3] = lVar56;
                            for (; puVar69 != puVar50; puVar69 = puVar69 + -10) {
                              if ((*(byte *)(puVar69 + -6) & 1) != 0) {
                                _ZdlPv(*(undefined8 *)(puVar69 + -2));
                              }
                            }
                          }
                          if (puVar50 != (undefined4 *)0x0) {
                            _ZdlPv(puVar50);
                          }
                        }
                        else {
                          if (uVar52 == 3) {
                            uVar74 = *(ulong *)puVar31;
                          }
                          else {
                            uVar74 = (ulong)*puVar31;
                          }
joined_r0x0073adfc:
                          uVar34 = 1L << (uVar24 & 3);
                          lVar41 = -uVar34;
                          puVar77 = (undefined *)((long)puVar31 - uVar74);
                          if (1 < (uVar24 & 3)) goto LAB_0073a6b8;
LAB_0073a5cc:
                          if ((bVar3 & 3) != 0) {
                            uVar74 = (ulong)*(ushort *)(puVar77 + lVar41);
                            puVar50 = (undefined4 *)puVar26[-4];
                            puVar37 = (undefined4 *)puVar26[-3];
                            if (puVar50 < puVar37) goto LAB_0073a674;
                            goto LAB_0073a5e0;
                          }
                          uVar74 = (ulong)(byte)puVar77[lVar41];
                          uVar34 = 1;
                          puVar50 = (undefined4 *)puVar26[-4];
                          puVar37 = (undefined4 *)puVar26[-3];
                          if (puVar37 <= puVar50) goto LAB_0073a5e0;
LAB_0073a674:
                          puVar37 = puVar50 + 10;
                          *puVar50 = 0xffffffff;
                          puVar50[9] = 0;
                          *(undefined8 *)(puVar50 + 3) = 0;
                          *(undefined8 *)(puVar50 + 1) = 0;
                          *(undefined8 *)(puVar50 + 7) = 0;
                          *(undefined8 *)(puVar50 + 5) = 0;
                        }
                        uVar70 = uVar34 & 0xffffffff;
                        uVar24 = (uint)uVar34;
                        puVar26[-4] = puVar37;
                        puVar36 = (ulong *)(puVar77 + uVar70 + (uVar34 & 0xffffffff) * -4);
                        if (uVar24 < 4) {
                          if (uVar24 < 2) {
                            uVar34 = (ulong)(byte)*puVar36;
                            goto LAB_0073a824;
                          }
                          uVar34 = (ulong)(ushort)*puVar36;
                          uVar5 = *(ushort *)((long)puVar36 + uVar70);
                          uVar60 = (uint)uVar5;
                          uVar61 = (uint)uVar5;
                          uVar59 = uVar5 & 0xff;
                          uVar57 = (ulong)uVar5 & 0xff;
joined_r0x0073a818:
                          lVar56 = -uVar57;
                          lVar41 = (long)puVar36 - uVar34;
                          if (3 < uVar59) goto LAB_0073a7dc;
LAB_0073a840:
                          if (uVar59 < 2) {
                            uVar34 = (ulong)*(byte *)(lVar41 + lVar56);
                          }
                          else {
                            uVar34 = (ulong)*(ushort *)(lVar41 + lVar56);
                          }
joined_r0x0073a858:
                          uVar61 = uVar60 - 1;
                          if (7 < (uVar61 & 0xff)) goto LAB_0073a898;
LAB_0073a88c:
                          if ((0x8bU >> (ulong)(uVar61 & 0x1f) & 1) == 0) goto LAB_0073a898;
                          lVar56 = bsearch(&DAT_002e0dd8,lVar41,uVar34,uVar57,
                                           (&DAT_012af0a0)[(ulong)uVar61 & 0xff]);
                          if (lVar56 == 0) {
                            puVar35 = (undefined *)0x0;
                            uStack_114 = 0;
                            uVar61 = 0;
                            uVar59 = 1;
                            uVar60 = 0x100;
                          }
                          else {
                            uVar34 = 0;
                            if (uVar57 != 0) {
                              uVar34 = (lVar56 - lVar41) / (long)uVar57;
                            }
                            if (uVar34 < uVar74) {
                              puVar35 = puVar77 + uVar34 * uVar70;
                              uVar34 = (ulong)((byte)puVar77[uVar34 + uVar74 * uVar70] >> 2) << 0x20
                                       | (ulong)(uint)(1 << ((ulong)(byte)puVar77[uVar34 + uVar74 * 
                                                  uVar70] & 3)) << 8 | uVar70;
                            }
                            else {
                              puVar35 = (undefined *)0x0;
                              uVar34 = 0x101;
                            }
                            uStack_114 = (uint)(uVar34 >> 0x20);
                            uVar59 = (uint)uVar34;
                            uVar61 = uVar59 & 0xffff0000;
                            uVar60 = uVar59 & 0xff00;
                            uVar59 = uVar59 & 0xff;
                          }
                        }
                        else {
                          if (7 < uVar24) {
                            uVar34 = *puVar36;
LAB_0073a824:
                            bVar3 = *(byte *)((long)puVar36 + uVar70);
                            uVar57 = (ulong)bVar3;
                            uVar60 = (uint)bVar3;
                            uVar61 = (uint)bVar3;
                            uVar59 = (uint)bVar3;
                            goto joined_r0x0073a818;
                          }
                          uVar61 = *(uint *)((long)puVar36 + uVar70);
                          uVar59 = uVar61 & 0xff;
                          uVar57 = (ulong)uVar61 & 0xff;
                          lVar41 = (long)puVar36 - (ulong)(uint)*puVar36;
                          lVar56 = -uVar57;
                          uVar60 = uVar61;
                          if (uVar59 < 4) goto LAB_0073a840;
LAB_0073a7dc:
                          if (7 < uVar59) {
                            uVar34 = *(ulong *)(lVar41 + lVar56);
                            uVar60 = uVar61;
                            goto joined_r0x0073a858;
                          }
                          uVar34 = (ulong)*(uint *)(lVar41 + lVar56);
                          uVar61 = uVar61 - 1;
                          if ((uVar61 & 0xff) < 8) goto LAB_0073a88c;
LAB_0073a898:
                          puVar35 = (undefined *)0x0;
                          uVar59 = 0;
                          uVar60 = 0;
                          uStack_114 = 0;
                          uVar61 = 0;
                        }
                        uStack_118 = uVar60 | uVar59 | uVar61;
                        bStack_120 = (byte)puVar35;
                        uStack_11f = (undefined7)((ulong)puVar35 >> 8);
                        uVar99 = FUN_006b37e8(&bStack_120);
                        puVar37[-9] = uVar99;
                        if (uVar24 < 4) {
                          if (uVar24 < 2) {
                            uVar34 = (ulong)(byte)*puVar36;
                            goto LAB_0073a9b8;
                          }
                          uVar34 = (ulong)(ushort)*puVar36;
                          uVar5 = *(ushort *)((long)puVar36 + uVar70);
                          uVar60 = (uint)uVar5;
                          uVar61 = (uint)uVar5;
                          uVar59 = uVar5 & 0xff;
                          uVar57 = (ulong)uVar5 & 0xff;
joined_r0x0073a9ac:
                          lVar56 = -uVar57;
                          lVar41 = (long)puVar36 - uVar34;
                          if (3 < uVar59) goto LAB_0073a908;
LAB_0073a9d4:
                          if (uVar59 < 2) {
                            uVar34 = (ulong)*(byte *)(lVar41 + lVar56);
                          }
                          else {
                            uVar34 = (ulong)*(ushort *)(lVar41 + lVar56);
                          }
joined_r0x0073a9ec:
                          uVar61 = uVar60 - 1;
                          if (7 < (uVar61 & 0xff)) goto LAB_0073aa2c;
LAB_0073aa20:
                          if ((0x8bU >> (ulong)(uVar61 & 0x1f) & 1) == 0) goto LAB_0073aa2c;
                          lVar56 = bsearch(&DAT_0029c532,lVar41,uVar34,uVar57,
                                           (&DAT_012af0a0)[(ulong)uVar61 & 0xff]);
                          if (lVar56 == 0) {
                            puVar35 = (undefined *)0x0;
                            uStack_114 = 0;
                            uVar61 = 0;
                            uVar59 = 1;
                            uVar60 = 0x100;
                          }
                          else {
                            uVar34 = 0;
                            if (uVar57 != 0) {
                              uVar34 = (lVar56 - lVar41) / (long)uVar57;
                            }
                            if (uVar34 < uVar74) {
                              puVar35 = puVar77 + uVar34 * uVar70;
                              uVar34 = (ulong)((byte)puVar77[uVar34 + uVar74 * uVar70] >> 2) << 0x20
                                       | (ulong)(uint)(1 << ((ulong)(byte)puVar77[uVar34 + uVar74 * 
                                                  uVar70] & 3)) << 8 | uVar70;
                            }
                            else {
                              puVar35 = (undefined *)0x0;
                              uVar34 = 0x101;
                            }
                            uStack_114 = (uint)(uVar34 >> 0x20);
                            uVar59 = (uint)uVar34;
                            uVar61 = uVar59 & 0xffff0000;
                            uVar60 = uVar59 & 0xff00;
                            uVar59 = uVar59 & 0xff;
                          }
                        }
                        else {
                          if (7 < uVar24) {
                            uVar34 = *puVar36;
LAB_0073a9b8:
                            bVar3 = *(byte *)((long)puVar36 + uVar70);
                            uVar57 = (ulong)bVar3;
                            uVar60 = (uint)bVar3;
                            uVar61 = (uint)bVar3;
                            uVar59 = (uint)bVar3;
                            goto joined_r0x0073a9ac;
                          }
                          uVar61 = *(uint *)((long)puVar36 + uVar70);
                          uVar59 = uVar61 & 0xff;
                          uVar57 = (ulong)uVar61 & 0xff;
                          lVar41 = (long)puVar36 - (ulong)(uint)*puVar36;
                          lVar56 = -uVar57;
                          uVar60 = uVar61;
                          if (uVar59 < 4) goto LAB_0073a9d4;
LAB_0073a908:
                          if (7 < uVar59) {
                            uVar34 = *(ulong *)(lVar41 + lVar56);
                            uVar60 = uVar61;
                            goto joined_r0x0073a9ec;
                          }
                          uVar34 = (ulong)*(uint *)(lVar41 + lVar56);
                          uVar61 = uVar61 - 1;
                          if ((uVar61 & 0xff) < 8) goto LAB_0073aa20;
LAB_0073aa2c:
                          puVar35 = (undefined *)0x0;
                          uVar59 = 0;
                          uVar60 = 0;
                          uStack_114 = 0;
                          uVar61 = 0;
                        }
                        uStack_118 = uVar60 | uVar59 | uVar61;
                        bStack_120 = (byte)puVar35;
                        uStack_11f = (undefined7)((ulong)puVar35 >> 8);
                        uVar99 = FUN_00742b40(&bStack_120);
                        puVar37[-10] = uVar99;
                        if (uVar24 < 4) {
                          if (uVar24 < 2) {
                            uVar34 = (ulong)(byte)*puVar36;
                            goto LAB_0073ab4c;
                          }
                          uVar34 = (ulong)(ushort)*puVar36;
                          uVar5 = *(ushort *)((long)puVar36 + uVar70);
                          uVar60 = (uint)uVar5;
                          uVar61 = (uint)uVar5;
                          uVar59 = uVar5 & 0xff;
                          uVar57 = (ulong)uVar5 & 0xff;
joined_r0x0073ab40:
                          lVar56 = -uVar57;
                          lVar41 = (long)puVar36 - uVar34;
                          if (3 < uVar59) goto LAB_0073aa9c;
LAB_0073ab68:
                          if (uVar59 < 2) {
                            uVar34 = (ulong)*(byte *)(lVar41 + lVar56);
                          }
                          else {
                            uVar34 = (ulong)*(ushort *)(lVar41 + lVar56);
                          }
joined_r0x0073ab80:
                          uVar61 = uVar60 - 1;
                          if (7 < (uVar61 & 0xff)) goto LAB_0073ac34;
LAB_0073abb4:
                          if (((0x8bU >> (ulong)(uVar61 & 0x1f) & 1) == 0) ||
                             (lVar56 = bsearch(&DAT_002e82f0,lVar41,uVar34,uVar57,
                                               (&DAT_012af0a0)[(ulong)uVar61 & 0xff]), lVar56 == 0))
                          goto LAB_0073ac34;
                          uVar34 = 0;
                          if (uVar57 != 0) {
                            uVar34 = (lVar56 - lVar41) / (long)uVar57;
                          }
                          if (uVar74 <= uVar34) goto LAB_0073ac34;
                          puVar38 = (ulong *)(puVar77 + uVar34 * uVar70);
                          bVar3 = (byte)puVar77[uVar34 + uVar74 * uVar70] >> 2;
                          if (bVar3 == 4) {
                            if (uVar24 < 4) {
                              if (uVar24 < 2) {
                                uVar34 = (ulong)(byte)*puVar38;
                              }
                              else {
                                uVar34 = (ulong)(ushort)*puVar38;
                              }
                            }
                            else if (uVar24 < 8) {
                              uVar34 = (ulong)(uint)*puVar38;
                            }
                            else {
                              uVar34 = *puVar38;
                            }
                            puStack_358 = (undefined1 *)((long)puVar38 - uVar34);
                            uVar34 = strlen();
LAB_0073afcc:
                            if (0xffffffffffffffef < uVar34) {
                    /* WARNING: Subroutine does not return */
                              FUN_005fbe6c(&bStack_120);
                            }
                            goto joined_r0x0073b020;
                          }
                          if (bVar3 != 5) goto LAB_0073ac34;
                          if (uVar24 < 4) {
                            if (uVar24 < 2) {
                              uVar57 = (ulong)(byte)*puVar38;
                            }
                            else {
                              uVar57 = (ulong)(ushort)*puVar38;
                            }
                          }
                          else if (uVar24 < 8) {
                            uVar57 = (ulong)(uint)*puVar38;
                          }
                          else {
                            uVar57 = *puVar38;
                          }
                          uVar34 = (ulong)(byte)puVar77[uVar34 + uVar74 * uVar70] & 3;
                          puStack_358 = (undefined1 *)((long)puVar38 - uVar57);
                          uVar59 = (uint)uVar34;
                          lVar41 = -(1L << uVar34);
                          if (1 < uVar59) {
                            if (uVar59 != 2) {
                              uVar34 = *(ulong *)((long)puStack_358 + lVar41);
                              goto LAB_0073afcc;
                            }
                            uVar34 = (ulong)*(uint *)((long)puStack_358 + lVar41);
joined_r0x0073b020:
                            if (0x16 < uVar34) goto LAB_0073af64;
LAB_0073afe0:
                            bStack_120 = (byte)((int)uVar34 << 1);
                            puVar76 = (undefined1 *)((ulong)&bStack_120 | 1);
                            if (uVar34 != 0) goto LAB_0073aff0;
                            goto LAB_0073ac40;
                          }
                          if (uVar59 == 0) {
                            uVar34 = (ulong)*(byte *)((long)puStack_358 + lVar41);
                            goto joined_r0x0073b020;
                          }
                          uVar34 = (ulong)*(ushort *)((long)puStack_358 + lVar41);
                          if (uVar34 < 0x17) goto LAB_0073afe0;
LAB_0073af64:
                          puVar76 = (undefined1 *)_Znwm((uVar34 | 0xf) + 1);
                          uStack_118 = (uint)uVar34;
                          uStack_114 = (uint)(uVar34 >> 0x20);
                          uStack_110 = (uint)puVar76;
                          uStack_10c = (uint)((ulong)puVar76 >> 0x20);
                          lVar41 = (uVar34 | 0xf) + 2;
                          bStack_120 = (byte)lVar41;
                          uStack_11f = (undefined7)((ulong)lVar41 >> 8);
LAB_0073aff0:
                          memmove(puVar76,puStack_358,uVar34);
                          puVar76[uVar34] = 0;
                          bVar3 = *(byte *)(puVar37 + -6);
                        }
                        else {
                          if (7 < uVar24) {
                            uVar34 = *puVar36;
LAB_0073ab4c:
                            bVar3 = *(byte *)((long)puVar36 + uVar70);
                            uVar57 = (ulong)bVar3;
                            uVar60 = (uint)bVar3;
                            uVar61 = (uint)bVar3;
                            uVar59 = (uint)bVar3;
                            goto joined_r0x0073ab40;
                          }
                          uVar61 = *(uint *)((long)puVar36 + uVar70);
                          uVar59 = uVar61 & 0xff;
                          uVar57 = (ulong)uVar61 & 0xff;
                          lVar41 = (long)puVar36 - (ulong)(uint)*puVar36;
                          lVar56 = -uVar57;
                          uVar60 = uVar61;
                          if (uVar59 < 4) goto LAB_0073ab68;
LAB_0073aa9c:
                          if (7 < uVar59) {
                            uVar34 = *(ulong *)(lVar41 + lVar56);
                            uVar60 = uVar61;
                            goto joined_r0x0073ab80;
                          }
                          uVar34 = (ulong)*(uint *)(lVar41 + lVar56);
                          uVar61 = uVar61 - 1;
                          if ((uVar61 & 0xff) < 8) goto LAB_0073abb4;
LAB_0073ac34:
                          bStack_120 = 0;
LAB_0073ac40:
                          *(undefined1 *)((ulong)&bStack_120 | 1) = 0;
                          bVar3 = *(byte *)(puVar37 + -6);
                        }
                        if ((bVar3 & 1) != 0) {
                          _ZdlPv(*(undefined8 *)(puVar37 + -2));
                        }
                        auVar11._8_4_ = uStack_118;
                        auVar11._0_8_ = CONCAT71(uStack_11f,bStack_120);
                        auVar11._12_4_ = uStack_114;
                        *(ulong *)(puVar37 + -2) = CONCAT44(uStack_10c,uStack_110);
                        *(long *)(puVar37 + -4) = auVar11._8_8_;
                        *(ulong *)(puVar37 + -6) = CONCAT71(uStack_11f,bStack_120);
                        if (uVar24 < 4) {
                          if (uVar24 < 2) {
                            uVar34 = (ulong)(byte)*puVar36;
                            goto LAB_0073ad08;
                          }
                          uVar34 = (ulong)(ushort)*puVar36;
                          uVar5 = *(ushort *)((long)puVar36 + uVar70);
                          uVar61 = (uint)uVar5;
                          uVar59 = (uint)uVar5;
                          uVar24 = uVar5 & 0xff;
                          uVar57 = (ulong)uVar5 & 0xff;
joined_r0x0073acfc:
                          lVar56 = -uVar57;
                          lVar41 = (long)puVar36 - uVar34;
                          if (3 < uVar24) goto LAB_0073acc0;
LAB_0073ad24:
                          if (uVar24 < 2) {
                            uVar34 = (ulong)*(byte *)(lVar41 + lVar56);
                          }
                          else {
                            uVar34 = (ulong)*(ushort *)(lVar41 + lVar56);
                          }
joined_r0x0073ad3c:
                          uVar59 = uVar61 - 1;
                          if (7 < (uVar59 & 0xff)) goto LAB_0073a538;
LAB_0073ad70:
                          if ((0x8bU >> (ulong)(uVar59 & 0x1f) & 1) == 0) goto LAB_0073a538;
                          lVar56 = bsearch(&DAT_002f2cf1,lVar41,uVar34,uVar57,
                                           (&DAT_012af0a0)[(ulong)uVar59 & 0xff]);
                          if (lVar56 == 0) {
                            puVar35 = (undefined *)0x0;
                            uStack_114 = 0;
                            uVar59 = 0;
                            uVar24 = 1;
                            uVar61 = 0x100;
                          }
                          else {
                            uVar34 = 0;
                            if (uVar57 != 0) {
                              uVar34 = (lVar56 - lVar41) / (long)uVar57;
                            }
                            if (uVar34 < uVar74) {
                              puVar35 = puVar77 + uVar34 * uVar70;
                              uVar70 = (ulong)((byte)puVar77[uVar34 + uVar74 * uVar70] >> 2) << 0x20
                                       | (ulong)(uint)(1 << ((ulong)(byte)puVar77[uVar34 + uVar74 * 
                                                  uVar70] & 3)) << 8 | uVar70;
                            }
                            else {
                              puVar35 = (undefined *)0x0;
                              uVar70 = 0x101;
                            }
                            uStack_114 = (uint)(uVar70 >> 0x20);
                            uVar24 = (uint)uVar70;
                            uVar59 = uVar24 & 0xffff0000;
                            uVar61 = uVar24 & 0xff00;
                            uVar24 = uVar24 & 0xff;
                          }
                        }
                        else {
                          if (7 < uVar24) {
                            uVar34 = *puVar36;
LAB_0073ad08:
                            bVar3 = *(byte *)((long)puVar36 + uVar70);
                            uVar57 = (ulong)bVar3;
                            uVar61 = (uint)bVar3;
                            uVar59 = (uint)bVar3;
                            uVar24 = (uint)bVar3;
                            goto joined_r0x0073acfc;
                          }
                          uVar59 = *(uint *)((long)puVar36 + uVar70);
                          uVar24 = uVar59 & 0xff;
                          uVar57 = (ulong)uVar59 & 0xff;
                          lVar41 = (long)puVar36 - (ulong)(uint)*puVar36;
                          lVar56 = -uVar57;
                          uVar61 = uVar59;
                          if (uVar24 < 4) goto LAB_0073ad24;
LAB_0073acc0:
                          if (7 < uVar24) {
                            uVar34 = *(ulong *)(lVar41 + lVar56);
                            uVar61 = uVar59;
                            goto joined_r0x0073ad3c;
                          }
                          uVar34 = (ulong)*(uint *)(lVar41 + lVar56);
                          uVar59 = uVar59 - 1;
                          if ((uVar59 & 0xff) < 8) goto LAB_0073ad70;
LAB_0073a538:
                          puVar35 = (undefined *)0x0;
                          uVar24 = 0;
                          uVar61 = 0;
                          uStack_114 = 0;
                          uVar59 = 0;
                        }
                        uStack_118 = uVar61 | uVar24 | uVar59;
                        bStack_120 = (byte)puVar35;
                        uStack_11f = (undefined7)((ulong)puVar35 >> 8);
                        uVar34 = FUN_00742b40(&bStack_120);
                        uVar53 = uVar53 + 1;
                        uVar74 = (ulong)uVar53;
                        *(ulong *)(puVar37 + -8) = uVar34 & 0xffffffff;
                      } while (uVar74 < uVar67);
                    }
                  }
                }
                uVar45 = (ulong)((int)plStack_268 + 1U);
                plStack_268 = (long *)CONCAT44(plStack_268._4_4_,(int)plStack_268 + 1U);
              } while (uVar45 < uVar46);
            }
            plVar65 = plStack_178;
            if (plStack_178 < plStack_170) {
              bStack_120 = (byte)(undefined4)uStack_210;
              uStack_11f = (undefined7)(CONCAT44(uStack_210._4_4_,(undefined4)uStack_210) >> 8);
              uStack_100 = (uint)lStack_1f0;
              uStack_fc = (uint)((ulong)lStack_1f0 >> 0x20);
              uStack_f0 = SUB84(plStack_1e0,0);
              uStack_ec = (undefined4)((ulong)plStack_1e0 >> 0x20);
              uStack_f8 = (uint)uStack_1e8;
              uStack_f4 = (undefined4)((ulong)uStack_1e8 >> 0x20);
              uStack_d8 = SUB84(puStack_1c8,0);
              uStack_d4 = (undefined4)((ulong)puStack_1c8 >> 0x20);
              uStack_e0 = SUB84(puStack_1d0,0);
              uStack_dc = (undefined4)((ulong)puStack_1d0 >> 0x20);
              uStack_e8 = SUB84(puStack_1d8,0);
              uStack_e4 = (undefined4)((ulong)puStack_1d8 >> 0x20);
              uStack_c0 = SUB84(puStack_1b0,0);
              uStack_bc = (undefined4)((ulong)puStack_1b0 >> 0x20);
              uStack_108 = (uint)plStack_1f8;
              uStack_104 = (uint)((ulong)plStack_1f8 >> 0x20);
              uStack_110 = (uint)puStack_200;
              uStack_10c = (uint)((ulong)puStack_200 >> 0x20);
              puStack_200 = (undefined *)0x0;
              plStack_1f8 = (long *)0x0;
              uStack_1e8 = 0;
              plStack_1e0 = (long *)0x0;
              puStack_1d8 = (undefined8 *)0x0;
              puStack_1d0 = (undefined8 *)0x0;
              uStack_c8 = SUB84(puStack_1b8,0);
              uStack_c4 = (undefined4)((ulong)puStack_1b8 >> 0x20);
              uStack_d0 = SUB84(puStack_1c0,0);
              uStack_cc = (undefined4)((ulong)puStack_1c0 >> 0x20);
              puStack_1c0 = (ulong *)0x0;
              puStack_1b8 = (ulong *)0x0;
              puStack_1c8 = (undefined8 *)0x0;
              puStack_1b0 = (ulong *)0x0;
              uStack_118 = (uint)uStack_208;
              uStack_114 = uStack_208._4_4_;
              FUN_00735514(plStack_178,&bStack_120);
              uVar100 = uStack_cc;
              uVar99 = uStack_d0;
              lVar41 = CONCAT44(uStack_cc,uStack_d0);
              if (lVar41 != 0) {
                lVar56 = CONCAT44(uStack_c4,uStack_c8);
                if (lVar56 != lVar41) {
                  do {
                    plVar27 = *(long **)(lVar56 + -0x10);
                    if ((plVar27 != (long *)0x0) &&
                       (lVar85 = FUN_0129eb20(0xffffffffffffffff,plVar27 + 1), lVar85 == 0)) {
                      (**(code **)(*plVar27 + 0x10))(plVar27);
                      _ZNSt6__ndk119__shared_weak_count14__release_weakEv(plVar27);
                    }
                    lVar56 = lVar56 + -0x18;
                  } while (lVar56 != lVar41);
                  lVar41 = CONCAT44(uStack_cc,uStack_d0);
                }
                uStack_c8 = uVar99;
                uStack_c4 = uVar100;
                _ZdlPv(lVar41);
              }
              uVar100 = uStack_e4;
              uVar99 = uStack_e8;
              lVar41 = CONCAT44(uStack_e4,uStack_e8);
              if (lVar41 != 0) {
                lVar56 = CONCAT44(uStack_dc,uStack_e0);
                if (lVar56 != lVar41) {
                  do {
                    lVar85 = *(long *)(lVar56 + -0x28);
                    if (lVar85 != 0) {
                      lVar78 = *(long *)(lVar56 + -0x20);
                      lVar80 = lVar85;
                      if (lVar78 != lVar85) {
                        do {
                          if ((*(byte *)(lVar78 + -0x18) & 1) != 0) {
                            _ZdlPv(*(undefined8 *)(lVar78 + -8));
                          }
                          lVar78 = lVar78 + -0x28;
                        } while (lVar78 != lVar85);
                        lVar80 = *(long *)(lVar56 + -0x28);
                      }
                      *(long *)(lVar56 + -0x20) = lVar85;
                      _ZdlPv(lVar80);
                    }
                    lVar56 = lVar56 + -0x30;
                  } while (lVar56 != lVar41);
                  lVar41 = CONCAT44(uStack_e4,uStack_e8);
                }
                uStack_e0 = uVar99;
                uStack_dc = uVar100;
                _ZdlPv(lVar41);
              }
              plVar27 = (long *)CONCAT44(uStack_ec,uStack_f0);
              if ((plVar27 == (long *)0x0) ||
                 (lVar41 = FUN_0129eb20(0xffffffffffffffff,plVar27 + 1), lVar41 != 0)) {
                plVar27 = (long *)CONCAT44(uStack_104,uStack_108);
              }
              else {
                (**(code **)(*plVar27 + 0x10))(plVar27);
                _ZNSt6__ndk119__shared_weak_count14__release_weakEv(plVar27);
                plVar27 = (long *)CONCAT44(uStack_104,uStack_108);
              }
              if ((plVar27 != (long *)0x0) &&
                 (lVar41 = FUN_0129eb20(0xffffffffffffffff,plVar27 + 1), lVar41 == 0)) {
                (**(code **)(*plVar27 + 0x10))(plVar27);
                _ZNSt6__ndk119__shared_weak_count14__release_weakEv(plVar27);
              }
              plStack_178 = plVar65 + 0xe;
              puVar44 = puStack_1c0;
            }
            else {
              plStack_178 = (long *)FUN_00715c8c(&plStack_180,&uStack_210);
              puVar44 = puStack_1c0;
            }
            puStack_1c0 = puVar44;
            if (puVar44 != (ulong *)0x0) {
              for (puVar36 = puStack_1b8; puVar36 != puVar44; puVar36 = puVar36 + -3) {
                plVar65 = (long *)puVar36[-2];
                if ((plVar65 != (long *)0x0) &&
                   (lVar41 = FUN_0129eb20(0xffffffffffffffff,plVar65 + 1), lVar41 == 0)) {
                  (**(code **)(*plVar65 + 0x10))(plVar65);
                  _ZNSt6__ndk119__shared_weak_count14__release_weakEv(plVar65);
                }
              }
              puStack_1b8 = puVar44;
              _ZdlPv(puStack_1c0);
            }
            puVar66 = puStack_1d8;
            puVar26 = puStack_1d0;
            if (puStack_1d8 != (undefined8 *)0x0) {
              for (; puVar26 != puVar66; puVar26 = puVar26 + -6) {
                lVar41 = puVar26[-5];
                if (lVar41 != 0) {
                  lVar85 = puVar26[-4];
                  lVar56 = lVar41;
                  if (lVar85 != lVar41) {
                    do {
                      if ((*(byte *)(lVar85 + -0x18) & 1) != 0) {
                        _ZdlPv(*(undefined8 *)(lVar85 + -8));
                      }
                      lVar85 = lVar85 + -0x28;
                    } while (lVar85 != lVar41);
                    lVar56 = puVar26[-5];
                  }
                  puVar26[-4] = lVar41;
                  _ZdlPv(lVar56);
                }
              }
              puStack_1d0 = puVar66;
              _ZdlPv(puStack_1d8);
            }
            plVar27 = plStack_1e0;
            plVar65 = plStack_1f8;
            if (plStack_1e0 != (long *)0x0) {
              lVar41 = FUN_0129eb20(0xffffffffffffffff,plStack_1e0 + 1);
              plVar65 = plStack_1f8;
              if (lVar41 == 0) {
                (**(code **)(*plVar27 + 0x10))(plVar27);
                _ZNSt6__ndk119__shared_weak_count14__release_weakEv(plVar27);
                plVar65 = plStack_1f8;
              }
            }
            plStack_1f8 = plVar65;
            if ((plVar65 != (long *)0x0) &&
               (lVar41 = FUN_0129eb20(0xffffffffffffffff,plVar65 + 1), lVar41 == 0)) {
              (**(code **)(*plVar65 + 0x10))(plVar65);
              _ZNSt6__ndk119__shared_weak_count14__release_weakEv(plVar65);
            }
            uVar30 = uVar30 + 1;
          } while (uVar30 != uVar51);
        }
        plVar19 = plStack_170;
        plVar75 = plStack_178;
        plVar27 = plStack_180;
        plStack_180 = (long *)0x0;
        plStack_178 = (long *)0x0;
        plStack_170 = (long *)0x0;
        bStack_120 = 0;
        uStack_11f = 0;
        uStack_118 = 0;
        uStack_210._0_4_ = 0;
        uStack_210._4_4_ = 0;
        uStack_210 = (undefined *)0x0;
        uStack_208._0_4_ = 0;
        plVar65 = (long *)((ulong)uStack_208._4_4_ << 0x20);
        plStack_268 = (long *)0x0;
        plStack_260 = (long *)((ulong)plStack_260 & 0xffffffff00000000);
        if (plStack_340 < plStack_360) {
          *plStack_340 = (long)plVar27;
          plStack_340[1] = (long)plVar75;
          plStack_340[2] = (long)plVar19;
          *(float *)(plStack_340 + 3) = (float)dVar94;
          *(float *)((long)plStack_340 + 0x1c) = (float)dVar90;
          *(float *)(plStack_340 + 4) = (float)dVar91;
          *(float *)((long)plStack_340 + 0x24) = (float)dVar92;
          *(float *)(plStack_340 + 5) = (float)dVar93;
          *(float *)((long)plStack_340 + 0x2c) = (float)auVar107._0_8_;
          plStack_340[6] = uStack_370;
          *(undefined4 *)(plStack_340 + 7) = 0x3f800000;
          *(undefined8 *)((long)plStack_340 + 0x3c) = 0;
          *(undefined4 *)((long)plStack_340 + 0x44) = 0;
          *(undefined4 *)(plStack_340 + 9) = 0x3f800000;
          *(undefined8 *)((long)plStack_340 + 0x4c) = 0;
          *(undefined4 *)((long)plStack_340 + 0x54) = 0;
          *(undefined4 *)(plStack_340 + 0xb) = 0x3f800000;
          *(undefined4 *)((long)plStack_340 + 100) = 0;
          *(undefined8 *)((long)plStack_340 + 0x5c) = 0;
          *(undefined1 *)(plStack_340 + 0xd) = 0;
          plVar27 = plVar68;
          plVar65 = plStack_340;
        }
        else {
          lVar41 = (long)plStack_340 - (long)plVar68 >> 4;
          uVar30 = lVar41 * 0x6db6db6db6db6db7 + 1;
          if (0x249249249249249 < uVar30) goto LAB_0073d488;
          lVar56 = (long)plStack_360 - (long)plVar68 >> 4;
          uVar45 = lVar56 * -0x2492492492492492;
          if (uVar45 <= uVar30) {
            uVar45 = uVar30;
          }
          if (0x124924924924923 < (ulong)(lVar56 * 0x6db6db6db6db6db7)) {
            uVar45 = 0x249249249249249;
          }
          uStack_210 = (undefined *)0x0;
          if (0x249249249249249 < uVar45) goto LAB_0073d438;
          lVar56 = _Znwm(uVar45 * 0x70);
          plVar65 = (long *)(lVar56 + ((long)plStack_340 - (long)plVar68));
          lVar41 = lVar56 + lVar41 * 0x10;
          *plVar65 = (long)plVar27;
          plVar65[1] = (long)plVar75;
          plVar65[2] = (long)plVar19;
          *(ulong *)(lVar41 + 0x30) = uStack_370;
          *(undefined4 *)(lVar41 + 0x38) = 0x3f800000;
          *(undefined8 *)(lVar41 + 0x44) = 0x3f80000000000000;
          *(undefined8 *)(lVar41 + 0x54) = 0x3f80000000000000;
          *(float *)(lVar41 + 0x18) = (float)dVar94;
          *(float *)(lVar41 + 0x1c) = (float)dVar90;
          *(float *)(lVar41 + 0x20) = (float)dVar91;
          *(float *)(lVar41 + 0x24) = (float)dVar92;
          *(float *)(lVar41 + 0x28) = (float)dVar93;
          *(float *)(lVar41 + 0x2c) = (float)auVar107._0_8_;
          *(undefined8 *)(lVar41 + 0x3c) = 0;
          *(undefined8 *)(lVar41 + 0x4c) = 0;
          *(undefined8 *)(lVar41 + 0x61) = 0;
          *(undefined8 *)(lVar41 + 0x5c) = 0;
          plVar27 = plVar65;
          if (plStack_340 != plVar68) {
            lVar41 = 0;
            do {
              lVar85 = lVar41 + -0x70;
              *(undefined8 *)((long)plVar65 + lVar41 + -0x68) = 0;
              *(undefined8 *)((long)plVar65 + lVar41 + -0x60) = 0;
              uVar62 = *(undefined8 *)((long)plStack_340 + lVar41 + -0x70);
              *(undefined8 *)((long)plVar65 + lVar41 + -0x68) =
                   *(undefined8 *)((long)plStack_340 + lVar41 + -0x68);
              *(undefined8 *)((long)plVar65 + lVar41 + -0x70) = uVar62;
              *(undefined8 *)((long)plVar65 + lVar41 + -0x60) =
                   *(undefined8 *)((long)plStack_340 + lVar41 + -0x60);
              uVar28 = *(undefined8 *)((long)plStack_340 + lVar41 + -0x38);
              uVar21 = *(undefined1 *)((long)plStack_340 + lVar41 + -8);
              uVar8 = *(undefined8 *)((long)plStack_340 + lVar41 + -0x20);
              uVar62 = *(undefined8 *)((long)plStack_340 + lVar41 + -0x28);
              uVar102 = *(undefined8 *)((long)plStack_340 + lVar41 + -0x10);
              uVar101 = *(undefined8 *)((long)plStack_340 + lVar41 + -0x18);
              *(undefined8 *)((long)plStack_340 + lVar41 + -0x68) = 0;
              *(undefined8 *)((long)plStack_340 + lVar41 + -0x60) = 0;
              *(undefined8 *)((long)plStack_340 + lVar41 + -0x70) = 0;
              *(undefined8 *)((long)plVar65 + lVar41 + -0x30) =
                   *(undefined8 *)((long)plStack_340 + lVar41 + -0x30);
              *(undefined8 *)((long)plVar65 + lVar41 + -0x38) = uVar28;
              *(undefined1 *)((long)plVar65 + lVar41 + -8) = uVar21;
              *(undefined8 *)((long)plVar65 + lVar41 + -0x10) = uVar102;
              *(undefined8 *)((long)plVar65 + lVar41 + -0x18) = uVar101;
              *(undefined8 *)((long)plVar65 + lVar41 + -0x20) = uVar8;
              *(undefined8 *)((long)plVar65 + lVar41 + -0x28) = uVar62;
              auVar107 = *(undefined1 (*) [16])((long)plStack_340 + lVar41 + -0x48);
              uVar8 = *(undefined8 *)((long)plStack_340 + lVar41 + -0x50);
              uVar62 = *(undefined8 *)((long)plStack_340 + lVar41 + -0x58);
              *(long *)((long)plVar65 + lVar41 + -0x40) = auVar107._8_8_;
              *(long *)((long)plVar65 + lVar41 + -0x48) = auVar107._0_8_;
              *(undefined8 *)((long)plVar65 + lVar41 + -0x50) = uVar8;
              *(undefined8 *)((long)plVar65 + lVar41 + -0x58) = uVar62;
              lVar41 = lVar85;
            } while ((long *)((long)plStack_340 + lVar85) != plVar68);
            plVar27 = (long *)((long)plVar65 + lVar85);
            do {
              plVar75 = plStack_340 + -0xe;
              lVar41 = *plVar75;
              if (lVar41 != 0) {
                lVar80 = plStack_340[-0xd];
                lVar85 = lVar41;
                if (lVar80 != lVar41) {
                  do {
                    lVar80 = lVar80 + -0x70;
                    FUN_007160a4(lVar80);
                  } while (lVar80 != lVar41);
                  lVar85 = *plVar75;
                }
                plStack_340[-0xd] = lVar41;
                _ZdlPv(lVar85);
              }
              plStack_340 = plVar75;
            } while (plVar75 != plVar68);
          }
          if (plVar68 != (long *)0x0) {
            _ZdlPv(plVar68);
          }
          plStack_360 = (long *)(lVar56 + uVar45 * 0x70);
        }
        plStack_340 = plVar65 + 0xe;
        auVar107 = FUN_006b0928(&bStack_250,&DAT_002da050);
        uVar30 = auVar107._8_8_;
        puVar44 = auVar107._0_8_;
        if (auVar107._12_4_ - 9U < 2) {
          uVar51 = auVar107._8_4_ & 0xff;
          if (uVar51 < 4) {
            if (1 < uVar51) {
              uVar45 = (ulong)(ushort)*puVar44;
              uVar30 = uVar30 >> 8 & 0xff;
              uVar51 = (uint)uVar30;
              goto joined_r0x0073b6f4;
            }
            uVar30 = uVar30 >> 8 & 0xff;
            puVar76 = (undefined1 *)((long)puVar44 - (ulong)(byte)*puVar44);
            lVar41 = -uVar30;
            if (3 < (uint)uVar30) goto LAB_0073b684;
LAB_0073b6f8:
            if ((uint)uVar30 < 2) {
              uVar45 = (ulong)(byte)puVar76[lVar41];
            }
            else {
              uVar45 = (ulong)*(ushort *)(puVar76 + lVar41);
            }
            if (puVar76 == &DAT_0030a6d9) goto LAB_0073b918;
          }
          else {
            if (uVar51 < 8) {
              uVar45 = (ulong)(uint)*puVar44;
              uVar30 = uVar30 >> 8 & 0xff;
              uVar51 = (uint)uVar30;
            }
            else {
              uVar45 = *puVar44;
              uVar30 = uVar30 >> 8 & 0xff;
              uVar51 = (uint)uVar30;
            }
joined_r0x0073b6f4:
            lVar41 = -uVar30;
            puVar76 = (undefined1 *)((long)puVar44 - uVar45);
            if (uVar51 < 4) goto LAB_0073b6f8;
LAB_0073b684:
            if ((uint)uVar30 < 8) {
              uVar45 = (ulong)*(uint *)(puVar76 + lVar41);
            }
            else {
              uVar45 = *(ulong *)(puVar76 + lVar41);
            }
            if (puVar76 == &DAT_0030a6d9) goto LAB_0073b918;
          }
          if (uVar45 != 0) {
            uVar67 = 0;
            pfVar25 = (float *)(plVar65 + 7);
            puVar84 = puVar76;
            puVar33 = puVar76;
            do {
              bVar3 = puVar76[uVar67 + uVar45 * uVar30];
              if ((bVar3 >> 2) - 9 < 2) {
                puVar44 = (ulong *)(puVar76 + uVar67 * uVar30);
                uVar51 = (uint)uVar30;
                if (uVar51 < 4) {
                  if (1 < uVar51) {
                    uVar46 = (ulong)(ushort)*puVar44;
                    goto joined_r0x0073b87c;
                  }
                  uVar46 = (ulong)(byte)*puVar44;
                  uVar83 = (ulong)bVar3 & 3;
                  lVar41 = (long)puVar44 - uVar46;
                  uVar74 = 1L << uVar83;
                  uVar51 = (uint)uVar83;
                  lVar56 = -uVar74;
                  if (1 < uVar51) goto LAB_0073b828;
LAB_0073b880:
                  if (uVar51 == 0) {
                    uVar83 = (ulong)*(byte *)(lVar41 + lVar56);
                    uVar74 = 1;
                  }
                  else {
                    uVar83 = (ulong)*(ushort *)(lVar41 + lVar56);
                  }
                }
                else {
                  if (uVar51 < 8) {
                    uVar46 = (ulong)(uint)*puVar44;
                  }
                  else {
                    uVar46 = *puVar44;
                  }
joined_r0x0073b87c:
                  uVar51 = bVar3 & 3;
                  uVar74 = 1L << ((ulong)bVar3 & 3);
                  lVar56 = -uVar74;
                  lVar41 = (long)puVar44 - uVar46;
                  if (uVar51 < 2) goto LAB_0073b880;
LAB_0073b828:
                  if (uVar51 == 2) {
                    uVar83 = (ulong)*(uint *)(lVar41 + lVar56);
                    uVar74 = 4;
                  }
                  else {
                    uVar83 = *(ulong *)(lVar41 + lVar56);
                  }
                }
                if (uVar83 != 0) {
                  lVar41 = (long)puVar84 - uVar46;
                  pbVar54 = puVar33 + (uVar83 * (uVar74 & 0xffffffff) - uVar46);
                  pfVar82 = pfVar25;
                  do {
                    uVar51 = 1 << ((ulong)*pbVar54 & 3);
                    uStack_114 = (uint)(*pbVar54 >> 2) | uVar51 >> 0x18;
                    uStack_118 = uVar51 << 8 | (uint)uVar74;
                    bStack_120 = (byte)lVar41;
                    uStack_11f = (undefined7)((ulong)lVar41 >> 8);
                    dVar94 = (double)FUN_006b3dec(&bStack_120);
                    uVar83 = uVar83 - 1;
                    lVar41 = lVar41 + (uVar74 & 0xffffffff);
                    *pfVar82 = (float)dVar94;
                    pbVar54 = pbVar54 + 1;
                    pfVar82 = pfVar82 + 1;
                  } while (uVar83 != 0);
                }
              }
              uVar67 = uVar67 + 1;
              pfVar25 = pfVar25 + 3;
              puVar33 = puVar33 + uVar30;
              puVar84 = puVar84 + uVar30;
            } while (uVar67 != uVar45);
          }
          *(undefined1 *)(plVar65 + 0xd) = 1;
        }
LAB_0073b918:
        plVar68 = plStack_180;
        plVar65 = plStack_178;
        if (plStack_180 != (long *)0x0) {
          for (; plVar65 != plVar68; plVar65 = plVar65 + -0xe) {
            FUN_007160a4(plVar65 + -0xe);
          }
          plStack_178 = plVar68;
          _ZdlPv(plStack_180);
        }
        uVar88 = uVar88 + 1;
        plVar68 = plVar27;
      } while (uVar88 != uVar29);
    }
    plVar65 = plStack_228;
    if ((plStack_228 != (long *)0x0) &&
       (lVar41 = FUN_0129eb20(0xffffffffffffffff,plStack_228 + 1), lVar41 == 0)) {
      (**(code **)(*plVar65 + 0x10))(plVar65);
      _ZNSt6__ndk119__shared_weak_count14__release_weakEv(plVar65);
    }
    uVar104 = NEON_fmov(0x3f800000,4);
    puVar42 = (ushort *)((long)param_2 - (long)*param_2);
    uVar5 = *puVar42;
  }
  if ((0x1e < uVar5) && ((ulong)puVar42[0xf] != 0)) {
    puVar55 = (uint *)((long)param_2 + (ulong)puVar42[0xf]);
    puVar55 = (uint *)((long)puVar55 + (ulong)*puVar55);
    uVar51 = *puVar55;
    FUN_00730320(param_1,(ulong)uVar51);
    if (uVar51 == 0) {
      FUN_00731910(*param_1 + 0x18,0);
    }
    else {
      uVar29 = 0;
      iVar23 = 0;
      do {
        puVar31 = (uint *)((long)puVar55 + (uVar29 & 0xfffffffc) + 4);
        piVar64 = (int *)((long)puVar31 + (ulong)*puVar31);
        if (((0xe < *(ushort *)((long)piVar64 - (long)*piVar64)) &&
            (uVar88 = (ulong)((ushort *)((long)piVar64 - (long)*piVar64))[7], uVar88 != 0)) &&
           (*(int *)((long)piVar64 + uVar88) != -1)) {
          iVar23 = iVar23 + 1;
        }
        uVar29 = uVar29 + 4;
      } while ((ulong)uVar51 * 4 != uVar29);
      FUN_00731910(*param_1 + 0x18,iVar23);
      uVar8 = _UNK_003070d8;
      uVar62 = _DAT_003070d0;
      if (uVar51 != 0) {
        uVar29 = 0;
        do {
          puVar76 = &DAT_002aadd1;
          puVar31 = (uint *)((long)puVar55 + (ulong)(uint)((int)uVar29 << 2) + 4);
          piVar64 = (int *)((long)puVar31 + (ulong)*puVar31);
          if ((*(ushort *)((long)piVar64 - (long)*piVar64) < 9) ||
             (uVar88 = (ulong)((ushort *)((long)piVar64 - (long)*piVar64))[4], uVar88 == 0)) {
LAB_0073bd14:
            uVar88 = 0;
            bStack_120 = 0xd8;
            uStack_11f = 0x30a6;
            uStack_118 = CONCAT31(uStack_118._1_3_,1);
          }
          else {
            puVar31 = (uint *)((long)piVar64 + uVar88);
            puVar31 = (uint *)((long)puVar31 + (ulong)*puVar31);
            pbVar54 = (byte *)((long)puVar31 + (ulong)*puVar31 + 2);
            bVar3 = *pbVar54;
            if ((bVar3 & 0xfc) != 0x24) goto LAB_0073bd14;
            bVar4 = *(byte *)((long)puVar31 + (ulong)*puVar31 + 3);
            puVar44 = (ulong *)(pbVar54 + -(ulong)bVar4);
            if (bVar4 < 4) {
              if (bVar4 < 2) {
                uVar88 = (ulong)(byte)*puVar44;
              }
              else {
                uVar88 = (ulong)(ushort)*puVar44;
              }
            }
            else if (bVar4 < 8) {
              uVar88 = (ulong)(uint)*puVar44;
            }
            else {
              uVar88 = *puVar44;
            }
            uVar52 = bVar3 & 3;
            lVar41 = (long)puVar44 - uVar88;
            bStack_120 = (byte)lVar41;
            uStack_11f = (undefined7)((ulong)lVar41 >> 8);
            lVar56 = -(1L << uVar52);
            uStack_118 = CONCAT31(uStack_118._1_3_,(char)(1L << uVar52));
            if (uVar52 < 2) {
              if ((bVar3 & 3) == 0) {
                uVar88 = (ulong)*(byte *)(lVar41 + lVar56);
              }
              else {
                uVar88 = (ulong)*(ushort *)(lVar41 + lVar56);
              }
            }
            else if (uVar52 == 2) {
              uVar88 = (ulong)*(uint *)(lVar41 + -4);
            }
            else {
              uVar88 = *(ulong *)(lVar41 + lVar56);
            }
          }
          uStack_110 = (uint)uVar88;
          uStack_10c = (uint)(uVar88 >> 0x20);
          auVar107 = FUN_006b0928(&bStack_120,&DAT_002c05ad);
          puVar44 = auVar107._0_8_;
          if (auVar107._8_8_ >> 0x20 == 9) {
            uVar52 = auVar107._8_4_ & 0xff;
            if (uVar52 < 4) {
              if (uVar52 < 2) {
                uVar88 = (ulong)(byte)*puVar44;
              }
              else {
                uVar88 = (ulong)(ushort)*puVar44;
              }
            }
            else if (uVar52 < 8) {
              uVar88 = (ulong)(uint)*puVar44;
            }
            else {
              uVar88 = *puVar44;
            }
            uVar52 = auVar107._9_4_ & 0xff;
            uStack_210 = (undefined1 *)((long)puVar44 - uVar88);
            lVar41 = -(ulong)auVar107[9];
            uStack_208._0_4_ = CONCAT31(uStack_208._1_3_,auVar107[9]);
            if (uVar52 < 4) {
              if (uVar52 < 2) {
                puStack_200 = (undefined *)(ulong)(byte)uStack_210[lVar41];
              }
              else {
                puStack_200 = (undefined *)(ulong)*(ushort *)(uStack_210 + lVar41);
              }
            }
            else if (uVar52 < 8) {
              puStack_200 = (undefined *)(ulong)*(uint *)(uStack_210 + lVar41);
            }
            else {
              puStack_200 = *(undefined **)(uStack_210 + lVar41);
            }
          }
          else {
            puStack_200 = (undefined *)0x0;
            uStack_210 = &DAT_0030a6d8;
            uStack_208._0_4_ = CONCAT31(uStack_208._1_3_,1);
          }
          if ((0x10 < *(ushort *)((long)piVar64 - (long)*piVar64)) &&
             (uVar88 = (ulong)((ushort *)((long)piVar64 - (long)*piVar64))[8], uVar88 != 0)) {
            puVar31 = (uint *)((long)piVar64 + uVar88);
            puVar76 = (undefined1 *)((long)puVar31 + (ulong)*puVar31 + 4);
          }
          uVar88 = FUN_007306a0(param_1,puVar76);
          lVar41 = (long)*piVar64;
          uVar30 = uVar88 & 0xffffffff;
          puVar42 = (ushort *)((long)piVar64 - lVar41);
          if (*puVar42 < 0xf) {
            if (4 < *puVar42) goto LAB_0073bf58;
          }
          else if (((ulong)puVar42[7] == 0) ||
                  (iVar23 = *(int *)((long)piVar64 + (ulong)puVar42[7]), iVar23 == -1)) {
LAB_0073bf58:
            if (((ulong)puVar42[2] != 0) &&
               (((iVar23 = *(int *)((long)piVar64 + (ulong)puVar42[2]), iVar23 != -1 &&
                 (0xe < *(ushort *)((long)param_2 - (long)*param_2))) &&
                (uVar45 = (ulong)((ushort *)((long)param_2 - (long)*param_2))[7], uVar45 != 0)))) {
              puVar31 = (uint *)((long)param_2 + uVar45);
              puVar31 = (uint *)((long)puVar31 + (ulong)(uint)(iVar23 << 2) + (ulong)*puVar31 + 4);
              piVar73 = (int *)((long)puVar31 + (ulong)*puVar31);
              puVar42 = (ushort *)((long)piVar73 - (long)*piVar73);
              if (*puVar42 < 0xf) {
                if (0xc < *puVar42) goto LAB_0073c09c;
              }
              else if (((ulong)puVar42[7] == 0) ||
                      (*(char *)((long)piVar73 + (ulong)puVar42[7]) == '\0')) {
LAB_0073c09c:
                uVar45 = (ulong)puVar42[6];
                if (uVar45 != 0) {
                  puVar31 = (uint *)((long)piVar73 + uVar45);
                  fVar106 = 0.0;
                  uVar99 = 0;
                  piVar2 = (int *)((long)puVar31 + (ulong)*puVar31);
                  if ((4 < *(ushort *)((long)piVar2 - (long)*piVar2)) &&
                     (uVar67 = (ulong)((ushort *)((long)piVar2 - (long)*piVar2))[2], uVar67 != 0)) {
                    uVar99 = *(undefined4 *)((long)piVar2 + uVar67);
                  }
                  piVar2 = (int *)((long)puVar31 + (ulong)*puVar31);
                  if ((10 < *(ushort *)((long)piVar2 - (long)*piVar2)) &&
                     (uVar67 = (ulong)((ushort *)((long)piVar2 - (long)*piVar2))[5], uVar67 != 0)) {
                    fVar106 = *(float *)((long)piVar2 + uVar67);
                  }
                  puVar31 = (uint *)((long)piVar73 + uVar45);
                  uVar100 = 0;
                  uVar105 = 0;
                  piVar73 = (int *)((long)puVar31 + (ulong)*puVar31);
                  if ((0xe < *(ushort *)((long)piVar73 - (long)*piVar73)) &&
                     (uVar45 = (ulong)((ushort *)((long)piVar73 - (long)*piVar73))[7], uVar45 != 0))
                  {
                    uVar105 = *(undefined4 *)((long)piVar73 + uVar45);
                  }
                  piVar73 = (int *)((long)puVar31 + (ulong)*puVar31);
                  if ((0xc < *(ushort *)((long)piVar73 - (long)*piVar73)) &&
                     (uVar45 = (ulong)((ushort *)((long)piVar73 - (long)*piVar73))[6], uVar45 != 0))
                  {
                    uVar100 = *(undefined4 *)((long)piVar73 + uVar45);
                  }
                  lVar41 = *param_1;
                  if (*(long *)(lVar41 + 200) == 0) {
                    puVar26 = (undefined8 *)_Znwm(0x18);
                    puVar26[1] = 0;
                    puVar26[2] = 0;
                    *puVar26 = 0;
                    plVar65 = *(long **)(lVar41 + 200);
                    *(undefined8 **)(lVar41 + 200) = puVar26;
                    if (plVar65 != (long *)0x0) {
                      if (*plVar65 != 0) {
                        plVar65[1] = *plVar65;
                        _ZdlPv();
                      }
                      _ZdlPv(plVar65);
                    }
                  }
                  plVar65 = (long *)CONCAT44(uStack_208._4_4_,(uint)uStack_208);
                  puVar44 = *(ulong **)(*param_1 + 200);
                  puVar86 = (undefined2 *)puVar44[1];
                  if (puVar86 < (undefined2 *)puVar44[2]) {
                    *puVar86 = (short)uVar30;
                    puVar39 = puVar86 + 10;
                    *(undefined4 *)(puVar86 + 2) = uVar99;
                    *(float *)(puVar86 + 4) = fVar106 * 57.295826;
                    *(undefined4 *)(puVar86 + 6) = uVar105;
                    *(undefined4 *)(puVar86 + 8) = uVar100;
                  }
                  else {
                    puVar79 = (undefined2 *)*puVar44;
                    lVar41 = (long)puVar86 - (long)puVar79 >> 2;
                    uVar45 = lVar41 * -0x3333333333333333 + 1;
                    if (0xccccccccccccccc < uVar45) {
                    /* WARNING: Subroutine does not return */
                      FUN_00743cac(puVar44);
                    }
                    lVar56 = (long)puVar44[2] - (long)puVar79 >> 2;
                    uVar67 = lVar56 * -0x6666666666666666;
                    if (uVar67 <= uVar45) {
                      uVar67 = uVar45;
                    }
                    if (0x666666666666665 < (ulong)(lVar56 * -0x3333333333333333)) {
                      uVar67 = 0xccccccccccccccc;
                    }
                    if (uVar67 == 0) {
                      lVar56 = 0;
                    }
                    else {
                      if (0xccccccccccccccc < uVar67) {
LAB_0073d438:
                        uStack_208 = plVar65;
                    /* WARNING: Subroutine does not return */
                        FUN_005f9a24();
                      }
                      lVar56 = _Znwm(uVar67 * 0x14);
                    }
                    puVar39 = (undefined2 *)(lVar56 + lVar41 * 4);
                    *puVar39 = (short)uVar30;
                    *(undefined4 *)(puVar39 + 2) = uVar99;
                    *(float *)(puVar39 + 4) = fVar106 * 57.295826;
                    *(undefined4 *)(puVar39 + 6) = uVar105;
                    *(undefined4 *)(puVar39 + 8) = uVar100;
                    puVar49 = puVar39;
                    if (puVar86 != puVar79) {
                      do {
                        puVar50 = (undefined4 *)(puVar86 + -2);
                        auVar107 = *(undefined1 (*) [16])(puVar86 + -10);
                        puVar86 = puVar86 + -10;
                        *(undefined4 *)(puVar49 + -2) = *puVar50;
                        *(long *)(puVar49 + -6) = auVar107._8_8_;
                        *(long *)(puVar49 + -10) = auVar107._0_8_;
                        puVar49 = puVar49 + -10;
                      } while (puVar86 != puVar79);
                      puVar86 = (undefined2 *)*puVar44;
                    }
                    puVar39 = puVar39 + 10;
                    *puVar44 = (ulong)puVar49;
                    puVar44[1] = (ulong)puVar39;
                    puVar44[2] = lVar56 + uVar67 * 0x14;
                    if (puVar86 != (undefined2 *)0x0) {
                      _ZdlPv(puVar86);
                    }
                  }
                  puVar44[1] = (ulong)puVar39;
                }
              }
            }
          }
          else {
            pbVar54 = (byte *)(plVar27 + (long)iVar23 * 0xe);
            if (*(long *)pbVar54 != *(long *)(pbVar54 + 8)) {
              uStack_118 = 0;
              uStack_114 = 0;
              bStack_120 = 0;
              uStack_11f = 0;
              uStack_108 = 0;
              uStack_104 = 0;
              uStack_110 = 0;
              uStack_10c = 0;
              uStack_100 = 0xffffffff;
              uStack_f4 = (undefined4)DAT_0133c010[1];
              uStack_f0 = (undefined4)((ulong)DAT_0133c010[1] >> 0x20);
              uStack_fc = (uint)*DAT_0133c010;
              uStack_f8 = (uint)((ulong)*DAT_0133c010 >> 0x20);
              uStack_e4 = (undefined4)DAT_0133c010[3];
              uStack_e0 = (undefined4)((ulong)DAT_0133c010[3] >> 0x20);
              uStack_ec = (undefined4)DAT_0133c010[2];
              uStack_e8 = (undefined4)((ulong)DAT_0133c010[2] >> 0x20);
              auVar107 = *(undefined1 (*) [16])(DAT_0133c010 + 4);
              uStack_d4 = auVar107._8_4_;
              uStack_d0 = auVar107._12_4_;
              uStack_dc = auVar107._0_4_;
              uStack_d8 = auVar107._4_4_;
              uStack_c4 = (undefined4)DAT_0133c010[7];
              uStack_c0 = (undefined4)((ulong)DAT_0133c010[7] >> 0x20);
              uStack_cc = (undefined4)DAT_0133c010[6];
              uStack_c8 = (undefined4)((ulong)DAT_0133c010[6] >> 0x20);
              if (&bStack_120 != pbVar54) {
                FUN_00730fa4(&bStack_120,*(long *)pbVar54,*(long *)(pbVar54 + 8),
                             (*(long *)(pbVar54 + 8) - *(long *)pbVar54 >> 4) * 0x6db6db6db6db6db7);
                lVar41 = (long)*piVar64;
              }
              if (((0x16 < *(ushort *)((long)piVar64 - lVar41)) &&
                  (uVar45 = (ulong)((ushort *)((long)piVar64 - lVar41))[0xb], uVar45 != 0)) &&
                 (uVar52 = *(uint *)((long)piVar64 + uVar45), -1 < (int)uVar52)) {
                uStack_100 = *(uint *)(CONCAT71(uStack_167,bStack_168) + (ulong)uVar52 * 4);
              }
              uStack_108 = (uint)plVar27[(long)iVar23 * 0xe + 6];
              uStack_104 = (uint)((ulong)plVar27[(long)iVar23 * 0xe + 6] >> 0x20);
              plVar65 = (long *)FUN_00730cc4(param_1,uVar30,&bStack_120);
              uVar20 = uStack_11f;
              auVar107 = *(undefined1 (*) [16])(plVar27 + (long)iVar23 * 0xe + 3);
              plVar65[8] = plVar27[(long)iVar23 * 0xe + 5];
              plVar65[7] = auVar107._8_8_;
              plVar65[6] = auVar107._0_8_;
              if ((char)plVar27[(long)iVar23 * 0xe + 0xd] != '\0') {
                auVar107 = *(undefined1 (*) [16])(plVar27 + (long)iVar23 * 0xe + 0xb);
                lVar41 = plVar27[(long)iVar23 * 0xe + 9];
                lVar85 = plVar27[(long)iVar23 * 0xe + 8];
                lVar56 = plVar27[(long)iVar23 * 0xe + 7];
                plVar65[3] = plVar27[(long)iVar23 * 0xe + 10];
                plVar65[2] = lVar41;
                plVar65[5] = auVar107._8_8_;
                plVar65[4] = auVar107._0_8_;
                plVar65[1] = lVar85;
                *plVar65 = lVar56;
                *(undefined1 *)((long)plVar65 + 0x6e) = 1;
              }
              lVar41 = CONCAT71(uStack_11f,bStack_120);
              if (lVar41 != 0) {
                lVar85 = CONCAT44(uStack_114,uStack_118);
                lVar56 = lVar41;
                if (lVar85 != lVar41) {
                  do {
                    lVar85 = lVar85 + -0x70;
                    FUN_007160a4(lVar85);
                  } while (lVar85 != lVar41);
                  lVar56 = CONCAT71(uStack_11f,bStack_120);
                }
                uStack_118 = (uint)lVar41;
                uStack_114 = (uint)((uint7)uVar20 >> 0x18);
                _ZdlPv(lVar56);
              }
            }
          }
          puVar42 = (ushort *)((long)piVar64 - (long)*piVar64);
          uVar5 = *puVar42;
          uVar28 = uVar62;
          uVar101 = uVar8;
          if (uVar5 < 0x19) {
            if (0x14 < uVar5) goto LAB_0073c34c;
            uVar102 = NEON_fmov(0x3f800000,4);
            uVar103 = 0;
            uVar99 = 0;
            uVar100 = 0x3f800000;
            uVar95 = 0;
            if (0x12 < uVar5) goto LAB_0073c398;
          }
          else {
            if ((ulong)puVar42[0xc] == 0) {
LAB_0073c34c:
              uVar103 = 0;
              uVar95 = 0;
              uVar99 = 0;
              uVar45 = (ulong)puVar42[10];
              if (uVar45 != 0) goto LAB_0073c35c;
LAB_0073c334:
              uVar100 = 0x3f800000;
              uVar102 = uVar104;
            }
            else {
              puVar31 = (uint *)((long)piVar64 + (ulong)puVar42[0xc]);
              uVar95 = *(undefined8 *)((long)puVar31 + (ulong)*puVar31 + 4);
              uVar99 = *(undefined4 *)((long)puVar31 + (ulong)*puVar31 + 0xc);
              uVar45 = (ulong)puVar42[10];
              uVar103 = uVar95;
              if (uVar45 == 0) goto LAB_0073c334;
LAB_0073c35c:
              puVar31 = (uint *)((long)piVar64 + uVar45);
              uVar102 = *(undefined8 *)((long)puVar31 + (ulong)*puVar31 + 4);
              uVar100 = *(undefined4 *)((long)puVar31 + (ulong)*puVar31 + 0xc);
              uVar95 = uVar103;
            }
LAB_0073c398:
            uVar103 = uVar95;
            if ((ulong)puVar42[9] != 0) {
              puVar31 = (uint *)((long)piVar64 + (ulong)puVar42[9]);
              uVar28 = *(undefined8 *)((long)puVar31 + (ulong)*puVar31 + 4);
              uVar101 = *(undefined8 *)((long)puVar31 + (ulong)*puVar31 + 0xc);
            }
          }
          puVar26 = (undefined8 *)(*(long *)(*param_1 + 0x48) + (uVar88 & 0xffff) * 0x28);
          puVar26[1] = uVar101;
          *puVar26 = uVar28;
          puVar26[2] = uVar103;
          *(undefined4 *)(puVar26 + 3) = uVar99;
          *(undefined8 *)((long)puVar26 + 0x1c) = uVar102;
          *(undefined4 *)((long)puVar26 + 0x24) = uVar100;
          auVar107 = FUN_006b0928(&uStack_210,&DAT_002b9526);
          bStack_120 = auVar107[0];
          uStack_11f = auVar107._1_7_;
          uStack_118 = auVar107._8_4_;
          uStack_114 = auVar107._12_4_;
          if (auVar107._8_8_ >> 0x20 != 0) {
            uVar28 = FUN_00742b40(&bStack_120);
            FUN_00730d74(param_1,uVar30,uVar28);
          }
          uVar29 = uVar29 + 1;
        } while (uVar29 != uVar51);
      }
    }
  }
  auVar107 = FUN_006b0928(&puStack_138,&DAT_002ebb75);
  puVar44 = auVar107._0_8_;
  puVar77 = uStack_210;
  if (auVar107._8_8_ >> 0x20 != 9) {
    plStack_180 = (long *)&DAT_0030a6d8;
    goto LAB_0073d2a8;
  }
  uVar51 = auVar107._8_4_ & 0xff;
  if (uVar51 < 4) {
    if (uVar51 < 2) {
      uVar29 = (ulong)(byte)*puVar44;
    }
    else {
      uVar29 = (ulong)(ushort)*puVar44;
    }
  }
  else if (uVar51 < 8) {
    uVar29 = (ulong)(uint)*puVar44;
  }
  else {
    uVar29 = *puVar44;
  }
  uVar51 = auVar107._9_4_ & 0xff;
  plStack_180 = (long *)((long)puVar44 - uVar29);
  lVar41 = -(ulong)auVar107[9];
  plStack_178 = (long *)CONCAT71(plStack_178._1_7_,auVar107[9]);
  if (uVar51 < 4) {
    if (uVar51 < 2) {
      plStack_170 = (long *)(ulong)*(byte *)((long)plStack_180 + lVar41);
    }
    else {
      plStack_170 = (long *)(ulong)*(ushort *)((long)plStack_180 + lVar41);
    }
  }
  else if (uVar51 < 8) {
    plStack_170 = (long *)(ulong)*(uint *)((long)plStack_180 + lVar41);
  }
  else {
    plStack_170 = *(long **)((long)plStack_180 + lVar41);
  }
  if (plStack_180 == (long *)&DAT_0030a6d8) goto LAB_0073d2a8;
  auVar107 = FUN_006b0928(&plStack_180,&DAT_002b5dca);
  bStack_120 = auVar107[0];
  uStack_11f = auVar107._1_7_;
  uStack_118 = auVar107._8_4_;
  uStack_114 = auVar107._12_4_;
  FUN_006b3dec(&bStack_120);
  auVar107 = FUN_006b0928(&plStack_180,&DAT_00301c02);
  bStack_120 = auVar107[0];
  uStack_11f = auVar107._1_7_;
  uStack_118 = auVar107._8_4_;
  uStack_114 = auVar107._12_4_;
  uVar29 = FUN_00742b40(&bStack_120);
  auVar107 = FUN_006b0928(&plStack_180,&DAT_002ef48e);
  puVar44 = auVar107._0_8_;
  if (auVar107._8_8_ >> 0x20 == 9) {
    uVar51 = auVar107._8_4_ & 0xff;
    if (uVar51 < 4) {
      if (uVar51 < 2) {
        uVar88 = (ulong)(byte)*puVar44;
      }
      else {
        uVar88 = (ulong)(ushort)*puVar44;
      }
    }
    else if (uVar51 < 8) {
      uVar88 = (ulong)(uint)*puVar44;
    }
    else {
      uVar88 = *puVar44;
    }
    uVar51 = auVar107._9_4_ & 0xff;
    puStack_230 = (undefined *)((long)puVar44 - uVar88);
    lVar41 = -(ulong)auVar107[9];
    plStack_228 = (long *)CONCAT71(plStack_228._1_7_,auVar107[9]);
    if (uVar51 < 4) {
      if (uVar51 < 2) {
        uStack_220 = (ulong)(byte)puStack_230[lVar41];
      }
      else {
        uStack_220 = (ulong)*(ushort *)(puStack_230 + lVar41);
      }
    }
    else if (uVar51 < 8) {
      uStack_220 = (ulong)*(uint *)(puStack_230 + lVar41);
    }
    else {
      uStack_220 = *(ulong *)(puStack_230 + lVar41);
    }
    if (puStack_230 == &DAT_0030a6d8) goto LAB_0073c5cc;
    auVar107 = FUN_006b0928(&puStack_230,&DAT_002b5dd4);
    puVar44 = auVar107._0_8_;
    if (auVar107._12_4_ - 9U < 2) {
      uVar51 = auVar107._8_4_ & 0xff;
      if (uVar51 < 4) {
        if (uVar51 < 2) {
          uVar88 = (ulong)(byte)*puVar44;
        }
        else {
          uVar88 = (ulong)(ushort)*puVar44;
        }
      }
      else if (uVar51 < 8) {
        uVar88 = (ulong)(uint)*puVar44;
      }
      else {
        uVar88 = *puVar44;
      }
      uVar30 = auVar107._8_8_ >> 8;
      uVar51 = auVar107._9_4_ & 0xff;
      puStack_2e0 = (undefined1 *)((long)puVar44 - uVar88);
      lVar41 = -(auVar107._8_8_ >> 8 & 0xff);
      if (uVar51 < 4) {
        if (uVar51 < 2) {
          uVar88 = (ulong)(byte)puStack_2e0[lVar41];
        }
        else {
          uVar88 = (ulong)*(ushort *)(puStack_2e0 + lVar41);
        }
      }
      else if (uVar51 < 8) {
        uVar88 = (ulong)*(uint *)(puStack_2e0 + lVar41);
      }
      else {
        uVar88 = *(ulong *)(puStack_2e0 + lVar41);
      }
    }
    else {
      uVar88 = 0;
      puStack_2e0 = &DAT_0030a6d9;
      uVar30 = 1;
    }
    if ((*(ushort *)((long)param_2 - (long)*param_2) < 5) ||
       (uVar45 = (ulong)((ushort *)((long)param_2 - (long)*param_2))[2], uVar45 == 0)) {
      lVar41 = 0;
    }
    else {
      puVar55 = (uint *)((long)param_2 + uVar45);
      lVar41 = (long)puVar55 + (ulong)*puVar55;
    }
    auVar107 = FUN_006b0928(&puStack_230,&DAT_002c4425);
    bStack_120 = auVar107[0];
    uStack_11f = auVar107._1_7_;
    uStack_118 = auVar107._8_4_;
    uStack_114 = auVar107._12_4_;
    iVar23 = FUN_00742b40(&bStack_120);
    puVar55 = (uint *)(lVar41 + (ulong)(uint)(iVar23 << 2) + 4);
    FUN_0074ec84(&uStack_210,param_3,param_2,(long)puVar55 + (ulong)*puVar55);
    if ((*(ushort *)((long)param_2 - (long)*param_2) < 5) ||
       (uVar45 = (ulong)((ushort *)((long)param_2 - (long)*param_2))[2], uVar45 == 0)) {
      lVar41 = 0;
    }
    else {
      puVar55 = (uint *)((long)param_2 + uVar45);
      lVar41 = (long)puVar55 + (ulong)*puVar55;
    }
    auVar107 = FUN_006b0928(&puStack_230,&DAT_002d2ea4);
    bStack_120 = auVar107[0];
    uStack_11f = auVar107._1_7_;
    uStack_118 = auVar107._8_4_;
    uStack_114 = auVar107._12_4_;
    iVar23 = FUN_00742b40(&bStack_120);
    puVar55 = (uint *)(lVar41 + (ulong)(uint)(iVar23 << 2) + 4);
    FUN_0074ec84(&bStack_250,param_3,param_2,(long)puVar55 + (ulong)*puVar55);
    puVar77 = uStack_210;
    puStack_2c8 = uStack_210;
    puVar55 = (uint *)CONCAT71(uStack_24f,bStack_250);
    auStack_190 = FUN_006b0928(&puStack_230,&DAT_002aee9e);
    if (auStack_190._8_8_ >> 0x20 == 0) {
      puStack_2b0 = (undefined8 *)0x0;
    }
    else {
      if ((*(ushort *)((long)param_2 - (long)*param_2) < 5) ||
         (uVar45 = (ulong)((ushort *)((long)param_2 - (long)*param_2))[2], uVar45 == 0)) {
        lVar41 = 0;
      }
      else {
        puVar31 = (uint *)((long)param_2 + uVar45);
        lVar41 = (long)puVar31 + (ulong)*puVar31;
      }
      iVar23 = FUN_00742b40(auStack_190);
      puVar31 = (uint *)(lVar41 + (ulong)(uint)(iVar23 << 2) + 4);
      FUN_0074ec84(&bStack_120,param_3,param_2,(long)puVar31 + (ulong)*puVar31);
      puStack_2b0 = (undefined8 *)CONCAT71(uStack_11f,bStack_120);
    }
    auStack_1a0 = FUN_006b0928(&puStack_230,&DAT_002fa4f3);
    uVar45 = auStack_1a0._8_8_ >> 0x20;
    if (uVar45 == 0) {
      uVar67 = FUN_0074ef68(&uStack_210);
      uVar67 = uVar67 >> 1 & 0x7fffffff;
      lStack_328 = _Znam(uVar67 << 1);
      memcpy(lStack_328,puVar77,uVar67 << 1);
      uVar51 = 0;
    }
    else {
      uVar51 = FUN_00742b40(auStack_1a0);
      uVar67 = (ulong)uVar51 * (uVar29 & 0xffffffff);
      lVar41 = uVar67 * 2;
      if ((long)uVar67 < 0) {
        lVar41 = -1;
      }
      lStack_328 = _Znam(lVar41);
    }
    plStack_268 = (long *)0x0;
    plStack_260 = (long *)0x0;
    puStack_258 = (undefined1 *)0x0;
    lVar85 = *param_1;
    lVar41 = *(long *)(lVar85 + 0x50) - *(long *)(lVar85 + 0x48);
    lVar56 = lVar41 >> 3;
    uVar46 = lVar56 * -0x3333333333333333;
    if (lVar41 == 0) {
      plVar65 = (long *)0x0;
      if (uVar88 != 0) goto LAB_0073ca6c;
LAB_0073cd74:
      uVar52 = 0;
    }
    else {
      if (0x5d1745d1745d174 < uVar46) goto LAB_0073d494;
      lVar56 = lVar56 * 0x333333333333333c;
      plVar65 = (long *)_Znwm(lVar56);
      lVar41 = ((lVar56 - 0x2cU) / 0x2c) * 0x2c + 0x2c;
      puStack_258 = (undefined1 *)((long)plVar65 + lVar56);
      plStack_268 = plVar65;
      memset(plVar65,0,lVar41);
      plStack_260 = (long *)((long)plVar65 + lVar41);
      if (uVar88 == 0) goto LAB_0073cd74;
LAB_0073ca6c:
      lStack_300._0_4_ = (uint)uVar30 & 0xff;
      uVar74 = 0;
      uVar53 = 0;
      uVar52 = 0;
      lVar41 = lStack_328;
      do {
        bVar3 = puStack_2e0[uVar74 + uVar88 * (uVar30 & 0xff)];
        if ((bVar3 & 0xfc) == 0x24) {
          puVar44 = (ulong *)(puStack_2e0 + uVar74 * (uVar30 & 0xff));
          if ((uint)lStack_300 < 4) {
            if ((uint)lStack_300 < 2) {
              uVar74 = (ulong)(byte)*puVar44;
            }
            else {
              uVar74 = (ulong)(ushort)*puVar44;
            }
          }
          else if ((uint)lStack_300 < 8) {
            uVar74 = (ulong)(uint)*puVar44;
          }
          else {
            uVar74 = *puVar44;
          }
          uVar24 = bVar3 & 3;
          puStack_280 = (undefined *)((long)puVar44 - uVar74);
          lVar56 = -(1L << uVar24);
          uStack_278 = CONCAT71(uStack_278._1_7_,(char)(1L << uVar24));
          if (uVar24 < 2) {
            if ((bVar3 & 3) == 0) {
              uStack_270 = (ulong)(byte)puStack_280[lVar56];
            }
            else {
              uStack_270 = (ulong)*(ushort *)(puStack_280 + lVar56);
            }
          }
          else if (uVar24 == 2) {
            uStack_270 = (ulong)*(uint *)(puStack_280 + -4);
          }
          else {
            uStack_270 = *(ulong *)(puStack_280 + lVar56);
          }
        }
        else {
          uStack_270 = 0;
          puStack_280 = &DAT_0030a6d8;
          uStack_278 = CONCAT71(uStack_278._1_7_,1);
        }
        auVar107 = FUN_006b0928(&puStack_280,&DAT_00301c10);
        bStack_120 = auVar107[0];
        uStack_11f = auVar107._1_7_;
        uStack_118 = auVar107._8_4_;
        uStack_114 = auVar107._12_4_;
        uVar24 = FUN_00742b40(&bStack_120);
        if (uVar52 < uVar24) {
          puVar26 = (undefined8 *)((long)plVar65 + (ulong)uVar52 * 0x2c);
          lVar80 = (ulong)uVar24 - (ulong)uVar52;
          lVar56 = ((ulong)uVar52 + (ulong)uVar52 * 4) * 8;
          do {
            FUN_0072923c(&bStack_120,*(long *)(lVar85 + 0x48) + lVar56);
            lVar80 = lVar80 + -1;
            auVar15._3_4_ = uStack_104;
            auVar15._0_3_ = uStack_108._1_3_;
            auVar15._7_4_ = uStack_100;
            auVar14._11_4_ = uStack_fc;
            auVar14._0_11_ = auVar15;
            auVar14[0xf] = (undefined1)uStack_f8;
            lVar56 = lVar56 + 0x28;
            *(long *)((long)puVar26 + 0x21) = auVar14._8_8_;
            *(long *)((long)puVar26 + 0x19) = auVar15._0_8_;
            puVar26[1] = CONCAT44(uStack_114,uStack_118);
            *puVar26 = CONCAT71(uStack_11f,bStack_120);
            puVar26[3] = CONCAT44(uStack_104,uStack_108);
            puVar26[2] = CONCAT44(uStack_10c,uStack_110);
            puVar26 = (undefined8 *)((long)puVar26 + 0x2c);
          } while (lVar80 != 0);
        }
        uStack_f8 = uStack_f8 & 0xffffff00;
        uStack_118 = *puVar55;
        uStack_114 = puVar55[1];
        uStack_110 = puVar55[2];
        if (puStack_2b0 == (undefined8 *)0x0) {
          auVar6._8_4_ = 0xffff8001;
          auVar6._0_8_ = 0xffff8001ffff8001;
          puStack_2b0 = (undefined8 *)0x0;
          uStack_fc = puVar55[0xb];
          auVar98._0_4_ = (int)(float)(int)((float)puVar55[3] * 32767.0);
          auVar98._4_4_ = (int)(float)(int)((float)puVar55[4] * 32767.0);
          auVar98._8_4_ = (int)(float)(int)((float)puVar55[5] * 32767.0);
          auVar98._12_4_ = (int)(float)(int)((float)puVar55[6] * 32767.0);
          auVar6._12_4_ = 0xffff8001;
          auVar107 = NEON_smax(auVar98,auVar6,4);
          auVar7._8_4_ = 0x7fff;
          auVar7._0_8_ = 0x7fff00007fff;
          auVar7._12_4_ = 0x7fff;
          auVar107 = NEON_smin(auVar107,auVar7,4);
          puVar31 = puVar55 + 7;
          puVar1 = puVar55 + 9;
          puVar55 = puVar55 + 0xc;
          uStack_104 = (uint)*(undefined8 *)puVar1;
          uStack_100 = (uint)((ulong)*(undefined8 *)puVar1 >> 0x20);
          uStack_10c = (uint)*(undefined8 *)puVar31;
          uStack_108 = (uint)((ulong)*(undefined8 *)puVar31 >> 0x20);
          bStack_120 = auVar107[0];
          uStack_11f = (undefined7)
                       (CONCAT26(auVar107._12_2_,
                                 CONCAT24(auVar107._8_2_,CONCAT22(auVar107._4_2_,auVar107._0_2_)))
                       >> 8);
        }
        else {
          uStack_10c = puVar55[3];
          uStack_108 = puVar55[4];
          bStack_120 = (byte)*puStack_2b0;
          uStack_11f = (undefined7)((ulong)*puStack_2b0 >> 8);
          uStack_104 = puVar55[5];
          uStack_100 = puVar55[6];
          uStack_fc = puVar55[7];
          puVar55 = puVar55 + 8;
          puStack_2b0 = puStack_2b0 + 1;
        }
        auVar107 = FUN_006b0928(&puStack_280,&DAT_002ebb7f);
        auStack_290 = auVar107;
        uVar21 = FUN_00742b40(auStack_290);
        uStack_f8 = CONCAT31(uStack_f8._1_3_,uVar21);
        lVar56 = FUN_00728bbc(&bStack_120);
        if ((uVar45 != 0) && (lVar56 != 0)) {
          auVar107 = FUN_006b0928(&puStack_280,&DAT_002cb516);
          auStack_290 = auVar107;
          uVar52 = FUN_00742b40(auStack_290);
          FUN_007292a0(lVar41,uVar51,puStack_2c8,uVar52,lVar56,uVar29 & 0xffffffff);
          lVar41 = lVar41 + lVar56 * 2;
          puStack_2c8 = puStack_2c8 + (ulong)uVar52 * 2;
          plVar65 = plStack_268;
        }
        auVar13._3_4_ = uStack_104;
        auVar13._0_3_ = uStack_108._1_3_;
        auVar13._7_4_ = uStack_100;
        auVar12._11_4_ = uStack_fc;
        auVar12._0_11_ = auVar13;
        auVar12[0xf] = (undefined1)uStack_f8;
        puVar26 = (undefined8 *)((long)plVar65 + (ulong)uVar24 * 0x2c);
        uVar53 = uVar53 + 1;
        uVar74 = (ulong)uVar53;
        uVar52 = uVar24 + 1;
        *(long *)((long)puVar26 + 0x21) = auVar12._8_8_;
        *(long *)((long)puVar26 + 0x19) = auVar13._0_8_;
        puVar26[1] = CONCAT44(uStack_114,uStack_118);
        *puVar26 = CONCAT71(uStack_11f,bStack_120);
        puVar26[3] = CONCAT44(uStack_104,uStack_108);
        puVar26[2] = CONCAT44(uStack_10c,uStack_110);
      } while (uVar74 < uVar88);
    }
    uVar88 = (ulong)uVar52;
    if (uVar88 < uVar46) {
      do {
        uVar52 = uVar52 + 1;
        FUN_0072923c(&bStack_120,*(long *)(lVar85 + 0x48) + uVar88 * 0x28);
        puVar26 = (undefined8 *)((long)plVar65 + uVar88 * 0x2c);
        auVar17._3_4_ = uStack_104;
        auVar17._0_3_ = uStack_108._1_3_;
        auVar17._7_4_ = uStack_100;
        auVar16._11_4_ = uStack_fc;
        auVar16._0_11_ = auVar17;
        auVar16[0xf] = (undefined1)uStack_f8;
        uVar88 = (ulong)uVar52;
        *(long *)((long)puVar26 + 0x21) = auVar16._8_8_;
        *(long *)((long)puVar26 + 0x19) = auVar17._0_8_;
        puVar26[1] = CONCAT44(uStack_114,uStack_118);
        *puVar26 = CONCAT71(uStack_11f,bStack_120);
        puVar26[3] = CONCAT44(uStack_104,uStack_108);
        puVar26[2] = CONCAT44(uStack_10c,uStack_110);
      } while (uVar88 < uVar46);
    }
    lStack_298 = lStack_328;
    FUN_00730e98(param_1,plVar65,((long)plStack_260 - (long)plVar65 >> 2) * 0x2e8ba2e8ba2e8ba3,
                 &lStack_298,uVar67,uVar29);
    lVar41 = lStack_298;
    lStack_298 = 0;
    if (lVar41 != 0) {
      _ZdaPv();
    }
    puVar77 = uStack_210;
    if (plVar65 == (long *)0x0) goto LAB_0073d2a8;
    plStack_260 = plVar65;
  }
  else {
    uStack_220 = 0;
    puStack_230 = &DAT_0030a6d8;
    plStack_228 = (long *)CONCAT71(plStack_228._1_7_,1);
LAB_0073c5cc:
    auVar107 = FUN_006b0928(&plStack_180,&DAT_002b5dd4);
    puVar44 = auVar107._0_8_;
    if (auVar107._12_4_ - 9U < 2) {
      uVar51 = auVar107._8_4_ & 0xff;
      if (uVar51 < 4) {
        if (uVar51 < 2) {
          uVar30 = (ulong)(byte)*puVar44;
        }
        else {
          uVar30 = (ulong)(ushort)*puVar44;
        }
      }
      else if (uVar51 < 8) {
        uVar30 = (ulong)(uint)*puVar44;
      }
      else {
        uVar30 = *puVar44;
      }
      uVar88 = auVar107._8_8_ >> 8;
      uVar51 = auVar107._9_4_ & 0xff;
      puStack_2d0 = (undefined1 *)((long)puVar44 - uVar30);
      lVar41 = -(auVar107._8_8_ >> 8 & 0xff);
      if (uVar51 < 4) {
        if (1 < uVar51) {
          puStack_2c8 = (undefined *)(ulong)*(ushort *)(puStack_2d0 + lVar41);
          puVar42 = (ushort *)((long)param_2 - (long)*param_2);
          uVar5 = *puVar42;
          goto joined_r0x0073cebc;
        }
        puStack_2c8 = (undefined *)(ulong)(byte)puStack_2d0[lVar41];
        puVar42 = (ushort *)((long)param_2 - (long)*param_2);
        uVar5 = *puVar42;
        goto joined_r0x0073c628;
      }
      if (7 < uVar51) {
        puStack_2c8 = *(undefined **)(puStack_2d0 + lVar41);
        puVar42 = (ushort *)((long)param_2 - (long)*param_2);
        uVar5 = *puVar42;
        goto joined_r0x0073c628;
      }
      puStack_2c8 = (undefined *)(ulong)*(uint *)(puStack_2d0 + lVar41);
      puVar42 = (ushort *)((long)param_2 - (long)*param_2);
      uVar5 = *puVar42;
joined_r0x0073cebc:
      if (4 < uVar5) goto LAB_0073cf08;
LAB_0073cf20:
      lVar41 = 0;
    }
    else {
      uVar88 = 1;
      puStack_2d0 = &DAT_0030a6d9;
      puStack_2c8 = (undefined *)0x0;
      puVar42 = (ushort *)((long)param_2 - (long)*param_2);
      uVar5 = *puVar42;
joined_r0x0073c628:
      if (uVar5 < 5) goto LAB_0073cf20;
LAB_0073cf08:
      if ((ulong)puVar42[2] == 0) goto LAB_0073cf20;
      puVar55 = (uint *)((long)param_2 + (ulong)puVar42[2]);
      lVar41 = (long)puVar55 + (ulong)*puVar55;
    }
    auVar107 = FUN_006b0928(&plStack_180,&DAT_002e4954);
    uStack_210._0_4_ = auVar107._0_4_;
    uStack_210._4_4_ = auVar107._4_4_;
    uStack_208._0_4_ = auVar107._8_4_;
    uStack_208._4_4_ = auVar107._12_4_;
    iVar23 = FUN_00742b40(&uStack_210);
    puVar55 = (uint *)(lVar41 + (ulong)(uint)(iVar23 << 2) + 4);
    FUN_0074ec84(&bStack_120,param_3,param_2,(long)puVar55 + (ulong)*puVar55);
    puVar50 = (undefined4 *)CONCAT71(uStack_11f,bStack_120);
    uStack_208._0_4_ = 0;
    uStack_208._4_4_ = 0;
    uStack_208 = (long *)0x0;
    puStack_200 = (undefined *)0x0;
    uStack_210._0_4_ = 0;
    uStack_210._4_4_ = 0;
    uStack_210 = (undefined *)0x0;
    lVar41 = *(long *)(*param_1 + 0x50) - *(long *)(*param_1 + 0x48);
    if (lVar41 != 0) {
      lVar41 = lVar41 >> 3;
      if (0xaaaaaaaaaaaaaaa < (ulong)(lVar41 * -0x3333333333333333)) goto LAB_0073d48c;
      lVar41 = lVar41 * 0x3333333333333338;
      lVar56 = _Znwm(lVar41);
      uStack_210._0_4_ = (undefined4)lVar56;
      uStack_210._4_4_ = (uint)((ulong)lVar56 >> 0x20);
      lVar85 = ((lVar41 - 0x18U) / 0x18) * 0x18 + 0x18;
      puStack_200 = (undefined *)(lVar56 + lVar41);
      memset(lVar56,0,lVar85);
      uStack_208 = (long *)(lVar56 + lVar85);
    }
    uVar8 = _UNK_003070d8;
    uVar62 = _DAT_003070d0;
    if (puStack_2c8 != (undefined *)0x0) {
      uVar30 = 0;
      do {
        uStack_247 = (uint7)(((ulong)((byte)puStack_2d0
                                            [uVar30 + (long)puStack_2c8 * (uVar88 & 0xff)] >> 2) <<
                             0x20) >> 8) |
                     (uint7)(uint)(1 << ((ulong)(byte)puStack_2d0
                                                      [uVar30 + (long)puStack_2c8 * (uVar88 & 0xff)]
                                        & 3));
        bStack_250 = (byte)(puStack_2d0 + uVar30 * (uVar88 & 0xff));
        uStack_24f = (uint7)((ulong)(puStack_2d0 + uVar30 * (uVar88 & 0xff)) >> 8);
        bStack_248 = (byte)uVar88;
        uVar45 = FUN_00742b40(&bStack_250);
        if ((int)uVar29 != 0) {
          lVar41 = CONCAT44(uStack_210._4_4_,(undefined4)uStack_210) + (uVar45 & 0xffffffff) * 0x18;
          iVar23 = 0;
          plVar68 = (long *)(CONCAT44(uStack_210._4_4_,(undefined4)uStack_210) +
                            (uVar45 & 0xffffffff) * 0x18);
          puVar66 = (undefined8 *)(lVar41 + 8);
          puVar26 = (undefined8 *)*puVar66;
          puVar37 = puVar50;
          do {
            if (puVar26 < *(undefined8 **)(lVar41 + 0x10)) {
              puVar26[4] = uVar104;
              puVar26[1] = uVar8;
              *puVar26 = uVar62;
              puVar26[3] = uVar8;
              puVar26[2] = uVar62;
              puVar26 = puVar26 + 5;
            }
            else {
              puVar71 = (undefined8 *)*plVar68;
              lVar56 = (long)puVar26 - (long)puVar71 >> 3;
              uVar45 = lVar56 * -0x3333333333333333 + 1;
              if (0x666666666666666 < uVar45) {
                    /* WARNING: Subroutine does not return */
                FUN_007155d8(plVar68);
              }
              lVar85 = (long)*(undefined8 **)(lVar41 + 0x10) - (long)puVar71 >> 3;
              uVar67 = lVar85 * -0x6666666666666666;
              if (uVar67 <= uVar45) {
                uVar67 = uVar45;
              }
              if (0x333333333333332 < (ulong)(lVar85 * -0x3333333333333333)) {
                uVar67 = 0x666666666666666;
              }
              plVar65 = uStack_208;
              uStack_210 = (undefined *)CONCAT44(uStack_210._4_4_,(undefined4)uStack_210);
              if (0x666666666666666 < uVar67) goto LAB_0073d438;
              lVar80 = uVar67 * 0x28;
              lVar85 = _Znwm(lVar80);
              lVar56 = lVar85 + lVar56 * 8;
              puVar40 = (undefined8 *)(lVar85 + ((long)puVar26 - (long)puVar71));
              puVar87 = puVar40 + 5;
              puVar40[1] = uVar8;
              *puVar40 = uVar62;
              *(undefined8 *)(lVar56 + 0x18) = uVar8;
              *(undefined8 *)(lVar56 + 0x10) = uVar62;
              *(undefined8 *)(lVar56 + 0x20) = uVar104;
              if (puVar26 == puVar71) {
                *plVar68 = (long)puVar40;
                *puVar66 = puVar87;
                *(long *)(lVar41 + 0x10) = lVar85 + lVar80;
              }
              else {
                do {
                  puVar47 = puVar26 + -1;
                  auVar107 = *(undefined1 (*) [16])(puVar26 + -3);
                  uVar101 = puVar26[-4];
                  uVar28 = puVar26[-5];
                  puVar26 = puVar26 + -5;
                  puVar40[-1] = *puVar47;
                  puVar47 = puVar40 + -5;
                  puVar40[-2] = auVar107._8_8_;
                  puVar40[-3] = auVar107._0_8_;
                  puVar40[-4] = uVar101;
                  puVar40[-5] = uVar28;
                  puVar40 = puVar47;
                } while (puVar26 != puVar71);
                *plVar68 = (long)puVar47;
                *puVar66 = puVar87;
                *(long *)(lVar41 + 0x10) = lVar85 + lVar80;
              }
              if (puVar71 != (undefined8 *)0x0) {
                _ZdlPv(puVar71);
              }
              puVar26 = puVar87;
            }
            *puVar66 = puVar26;
            iVar23 = iVar23 + 1;
            puVar50 = puVar37 + 10;
            *(undefined4 *)(puVar26 + -3) = *puVar37;
            *(undefined4 *)((long)puVar26 + -0x14) = puVar37[1];
            *(undefined4 *)(puVar26 + -2) = puVar37[2];
            *(undefined4 *)(puVar26 + -5) = puVar37[3];
            *(undefined4 *)((long)puVar26 + -0x24) = puVar37[4];
            *(undefined4 *)(puVar26 + -4) = puVar37[5];
            *(undefined4 *)((long)puVar26 + -0x1c) = puVar37[6];
            *(undefined4 *)((long)puVar26 + -0xc) = puVar37[7];
            *(undefined4 *)(puVar26 + -1) = puVar37[8];
            *(undefined4 *)((long)puVar26 + -4) = puVar37[9];
            puVar37 = puVar50;
          } while (iVar23 != (int)uVar29);
        }
        uVar30 = (ulong)((int)uVar30 + 1);
      } while (uVar30 < puStack_2c8);
    }
    FUN_00730dd8(param_1,&uStack_210);
    uVar51 = uStack_210._4_4_;
    uVar99 = (undefined4)uStack_210;
    plVar65 = (long *)CONCAT44(uStack_210._4_4_,(undefined4)uStack_210);
    puVar77 = (undefined *)0x0;
    if (plVar65 == (long *)0x0) goto LAB_0073d2a8;
    if (uStack_208 != plVar65) {
      plVar68 = uStack_208;
      do {
        plVar75 = plVar68 + -3;
        if (*plVar75 != 0) {
          plVar68[-2] = *plVar75;
          _ZdlPv();
        }
        plVar68 = plVar75;
      } while (plVar75 != plVar65);
      plVar65 = (long *)CONCAT44(uStack_210._4_4_,(undefined4)uStack_210);
    }
    uStack_208._0_4_ = uVar99;
    uStack_208._4_4_ = uVar51;
  }
  _ZdlPv(plVar65);
  puVar77 = uStack_210;
LAB_0073d2a8:
  uStack_210 = puVar77;
  if (plVar27 != (long *)0x0) {
    if (plStack_340 != plVar27) {
      do {
        plVar65 = plStack_340 + -0xe;
        lVar41 = *plVar65;
        if (lVar41 != 0) {
          lVar85 = plStack_340[-0xd];
          lVar56 = lVar41;
          uStack_210 = puVar77;
          if (lVar85 != lVar41) {
            do {
              lVar85 = lVar85 + -0x70;
              uStack_210 = puVar77;
              FUN_007160a4(lVar85);
              puVar77 = uStack_210;
            } while (lVar85 != lVar41);
            lVar56 = *plVar65;
          }
          plStack_340[-0xd] = lVar41;
          _ZdlPv(lVar56);
          puVar77 = uStack_210;
        }
        plStack_340 = plVar65;
      } while (plVar65 != plVar27);
    }
    uStack_210 = puVar77;
    _ZdlPv(plVar27);
  }
  if (CONCAT71(uStack_167,bStack_168) != 0) {
    _ZdlPv();
  }
  puVar36 = puStack_150;
  puVar44 = puStack_148;
  if (puStack_150 != (ulong *)0x0) {
    for (; puVar44 != puVar36; puVar44 = puVar44 + -2) {
      plVar65 = (long *)puVar44[-1];
      if (plVar65 != (long *)0x0) {
        lVar41 = FUN_0129eb20(0xffffffffffffffff,plVar65 + 1);
        if (lVar41 == 0) {
          (**(code **)(*plVar65 + 0x10))(plVar65);
          _ZNSt6__ndk119__shared_weak_count14__release_weakEv(plVar65);
        }
      }
    }
    puStack_148 = puVar36;
    _ZdlPv(puStack_150);
  }
  return;
LAB_0073d488:
  FUN_00743c98();
LAB_0073d48c:
  FUN_007153f4(&uStack_210);
LAB_0073d494:
                    /* WARNING: Subroutine does not return */
  FUN_00730f90(&plStack_268);
}



/* 00745154 FUN_00745154; mode=normalize_15_seconds_lower_level */
/* DECOMPILATION FAILED: Low-level Error: Overlapping input varnodes */

/* 008ed16c FUN_008ed16c; mode=decompile_60_seconds */

/* WARNING: Type propagation algorithm not settling */
/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_008ed16c(long param_1)

{
  byte *pbVar1;
  byte *pbVar2;
  byte *pbVar3;
  uint uVar4;
  long *plVar5;
  undefined8 *puVar6;
  long *plVar7;
  undefined7 uVar8;
  undefined6 uVar9;
  bool bVar10;
  int iVar11;
  int iVar12;
  long lVar13;
  undefined8 uVar14;
  long *plVar15;
  ulong uVar16;
  ulong uVar17;
  undefined8 uVar18;
  undefined8 uVar19;
  undefined8 *puVar20;
  long *plVar21;
  long lVar22;
  ulong uVar23;
  undefined *puVar24;
  long lVar25;
  byte *pbVar26;
  long *plVar27;
  byte *pbVar28;
  undefined8 *puVar29;
  byte *pbVar30;
  long *plVar31;
  undefined8 *puVar32;
  long lVar33;
  long *plVar34;
  int *piVar35;
  undefined8 *puVar36;
  long lVar37;
  undefined8 *puVar38;
  undefined8 *puVar39;
  ulong uVar40;
  byte bVar41;
  undefined8 uVar42;
  undefined8 uVar43;
  undefined8 uVar44;
  float fVar45;
  undefined8 uVar46;
  float fVar47;
  undefined4 uVar48;
  undefined1 auStack_1e0 [16];
  byte *pbStack_1d0;
  byte *pbStack_1c8;
  undefined8 uStack_1c0;
  ulong uStack_1b8;
  ulong uStack_1b0;
  ulong uStack_1a8;
  ulong uStack_1a0;
  ulong uStack_198;
  ulong uStack_190;
  long lStack_188;
  long lStack_180;
  undefined8 uStack_178;
  long lStack_170;
  undefined8 uStack_168;
  undefined8 *puStack_160;
  undefined8 *puStack_158;
  undefined8 uStack_150;
  undefined8 *puStack_148;
  undefined8 *puStack_140;
  undefined8 uStack_138;
  undefined8 *puStack_130;
  undefined8 *puStack_128;
  undefined8 uStack_120;
  undefined8 *puStack_118;
  undefined8 *puStack_110;
  undefined8 uStack_108;
  long *plStack_100;
  long *plStack_f8;
  long *plStack_f0;
  byte bStack_e8;
  undefined4 uStack_e7;
  undefined1 uStack_e3;
  undefined1 uStack_e2;
  undefined1 uStack_e1;
  undefined1 uStack_e0;
  undefined1 uStack_df;
  undefined1 uStack_de;
  undefined1 uStack_dd;
  undefined1 uStack_dc;
  undefined1 uStack_db;
  undefined1 uStack_da;
  undefined1 uStack_d9;
  undefined8 uStack_d8;
  byte bStack_d0;
  undefined5 uStack_cf;
  undefined1 uStack_ca;
  undefined1 uStack_c9;
  undefined1 uStack_c8;
  undefined1 uStack_c7;
  undefined1 uStack_c6;
  undefined1 uStack_c5;
  undefined1 uStack_c4;
  undefined1 uStack_c3;
  undefined1 uStack_c2;
  undefined1 uStack_c1;
  undefined1 uStack_c0;
  undefined1 uStack_bf;
  undefined1 uStack_be;
  undefined1 uStack_bd;
  undefined1 uStack_bc;
  undefined1 uStack_bb;
  undefined2 uStack_ba;
  ulong uStack_b8;
  undefined8 uStack_b0;
  undefined8 *puStack_a8;
  undefined4 uStack_a0;
  undefined1 uStack_9c;
  undefined8 uStack_98;
  long *plStack_90;
  
  lVar13 = FUN_00df5044();
  if (lVar13 == 0) {
    plVar34 = (long *)0x0;
  }
  else {
    lVar13 = FUN_00df5044();
    plVar34 = *(long **)(lVar13 + 0x28);
  }
  puStack_118 = (undefined8 *)0x0;
  puStack_110 = (undefined8 *)0x0;
  uStack_108 = 0;
  if (((_DAT_01407dbc == 2) && (*(char *)(param_1 + 0xd0) != '\0')) &&
     (iVar11 = FUN_00f37a94(*(undefined8 *)(param_1 + 200)), 0 < iVar11)) {
    iVar11 = FUN_00f37a94(*(undefined8 *)(param_1 + 200));
    if (0 < iVar11) {
      iVar11 = 0;
      do {
        uVar14 = FUN_00f37a7c(*(undefined8 *)(param_1 + 200),iVar11);
        FUN_008f06b8(&puStack_118,uVar14,param_1 + 0x90);
        iVar11 = iVar11 + 1;
        iVar12 = FUN_00f37a94(*(undefined8 *)(param_1 + 200));
      } while (iVar11 < iVar12);
    }
  }
  else {
    iVar11 = FUN_00f37a2c(*(undefined8 *)(param_1 + 200));
    if (0 < iVar11) {
      iVar11 = 0;
      do {
        uVar14 = FUN_00f37a14(*(undefined8 *)(param_1 + 200),iVar11);
        FUN_008f06b8(&puStack_118,uVar14,param_1 + 0x90);
        iVar11 = iVar11 + 1;
        iVar12 = FUN_00f37a2c(*(undefined8 *)(param_1 + 200));
      } while (iVar11 < iVar12);
    }
  }
  puStack_130 = (undefined8 *)0x0;
  puStack_128 = (undefined8 *)0x0;
  uStack_120 = 0;
  iVar11 = FUN_00f37a4c(*(undefined8 *)(param_1 + 200));
  if (0 < iVar11) {
    iVar11 = 0;
    do {
      uVar14 = FUN_00f37a3c(*(undefined8 *)(param_1 + 200),iVar11);
      FUN_008f06b8(&puStack_130,uVar14,param_1 + 0x90);
      iVar11 = iVar11 + 1;
      iVar12 = FUN_00f37a4c(*(undefined8 *)(param_1 + 200));
    } while (iVar11 < iVar12);
  }
  puStack_148 = (undefined8 *)0x0;
  puStack_140 = (undefined8 *)0x0;
  uStack_138 = 0;
  plVar15 = (long *)FUN_0079b36c(*(undefined8 *)(*(long *)(param_1 + 0x88) + 0xa0),1);
  if ((*plVar15 != plVar15[1]) &&
     (iVar11 = FUN_00f37a6c(*(undefined8 *)(param_1 + 200)), 0 < iVar11)) {
    iVar11 = 0;
    do {
      uVar14 = FUN_00f37a5c(*(undefined8 *)(param_1 + 200),iVar11);
      FUN_008f06b8(&puStack_148,uVar14,param_1 + 0x90);
      iVar11 = iVar11 + 1;
      iVar12 = FUN_00f37a6c(*(undefined8 *)(param_1 + 200));
    } while (iVar11 < iVar12);
  }
  puStack_160 = (undefined8 *)0x0;
  puStack_158 = (undefined8 *)0x0;
  uStack_150 = 0;
  lStack_170 = 0;
  uStack_168 = 0;
  if ((plVar34 != (long *)0x0) && (iVar11 = FUN_0108682c(plVar34), 0 < iVar11)) {
    lVar13 = 0;
    do {
      while( true ) {
        lVar25 = *(long *)(*plVar34 + lVar13 * 8);
        uVar14 = FUN_00f027b0(**(undefined8 **)
                                (*(long *)(lVar25 + 0x70) + (long)*(int *)(lVar25 + 0x80) * 8));
        lVar25 = (long)uStack_168._4_4_;
        if (uStack_168._4_4_ != (int)uStack_168) break;
        FUN_0076aed8(&plStack_100);
        iVar11 = 5;
        if ((int)uStack_168 * 2 != 0) {
          iVar11 = (int)uStack_168 * 2;
        }
        if ((int)uStack_168 < iVar11) {
          FUN_00623bf8(&lStack_170);
        }
        lVar25 = (long)uStack_168._4_4_;
        uStack_168 = CONCAT44(uStack_168._4_4_ + 1,(int)uStack_168);
        FUN_0076aa88(lStack_170 + lVar25 * 0x10,&plStack_100);
        FUN_0076ad48(&plStack_100);
        lVar13 = lVar13 + 1;
        iVar11 = FUN_0108682c(plVar34);
        if (iVar11 <= lVar13) goto LAB_008ed3c0;
      }
      uStack_168 = CONCAT44(uStack_168._4_4_ + 1,(int)uStack_168);
      FUN_0076b33c(lStack_170 + lVar25 * 0x10,uVar14);
      lVar13 = lVar13 + 1;
      iVar11 = FUN_0108682c(plVar34);
    } while (lVar13 < iVar11);
  }
LAB_008ed3c0:
  lStack_188 = 0;
  lStack_180 = 0;
  uStack_178 = 0;
  FUN_008f7eb4(&lStack_188,0,puStack_118,puStack_110,(long)puStack_110 - (long)puStack_118 >> 4);
  FUN_008f7eb4(&lStack_188,lStack_180,puStack_130,puStack_128,
               (long)puStack_128 - (long)puStack_130 >> 4);
  FUN_008f7eb4(&lStack_188,lStack_180,puStack_148,puStack_140,
               (long)puStack_140 - (long)puStack_148 >> 4);
  lVar13 = FUN_00856ae8();
  iVar11 = *(int *)(lVar13 + 0x88);
  uStack_1a0 = 0;
  uStack_198 = 0;
  uStack_190 = 0;
  uStack_1b8 = 0;
  uStack_1b0 = 0;
  uStack_1a8 = 0;
  pbStack_1d0 = (byte *)0x0;
  pbStack_1c8 = (byte *)0x0;
  uStack_1c0 = 0;
  lVar13 = FUN_00df5044();
  if (lVar13 != 0) {
    lVar13 = FUN_00df5044();
    uVar16 = FUN_01086d6c(*(undefined8 *)(lVar13 + 0x28),0x41);
    if ((uVar16 & 1) != 0) {
      FUN_0076ae58(&plStack_100,&DAT_0030213a);
      FUN_008f06b8(&puStack_160,&plStack_100,param_1 + 0x90);
      FUN_0076ad48(&plStack_100);
    }
  }
  puVar36 = puStack_110;
  uVar44 = _UNK_00308868;
  uVar42 = _DAT_00308860;
  uVar14 = _UNK_003079d8;
  uVar16 = _DAT_003079d0;
  if (puStack_118 != puStack_110) {
    puVar38 = (undefined8 *)((ulong)&plStack_100 | 1);
    piVar35 = DAT_0133c500;
    puVar29 = puStack_118;
LAB_008ed4ec:
    pbVar26 = (byte *)*puVar29;
    pbVar30 = *(byte **)(pbVar26 + 0x10);
    if ((*pbVar26 & 1) == 0) {
      pbVar30 = pbVar26 + 1;
    }
    FUN_0076ae58(&uStack_98,pbVar30);
    uVar17 = FUN_0076d5c0(&uStack_98,&DAT_002c83ff);
    if ((uVar17 & 1) != 0) {
      if (*piVar35 == 3) {
        puVar24 = &DAT_002b98f9;
      }
      else {
        puVar24 = &DAT_002d6b14;
      }
      FUN_0076ae58(&plStack_100,puVar24);
      FUN_008f06b8(&puStack_130,&plStack_100,param_1 + 0x90);
      FUN_0076ad48(&plStack_100);
    }
    uVar17 = FUN_0076d5c0(&uStack_98,&DAT_002da4d5);
    if (((uVar17 & 1) != 0) && (*piVar35 == 3)) {
      FUN_0076ae58(&plStack_100,&DAT_002cb938);
      FUN_008f06b8(&puStack_130,&plStack_100,param_1 + 0x90);
      FUN_0076ad48(&plStack_100);
    }
    uVar17 = FUN_0076d5c0(&uStack_98,&DAT_002b6268);
    if (((uVar17 & 1) != 0) && (*piVar35 == 3)) {
      FUN_0076ae58(&plStack_100,&DAT_002d6b3e);
      FUN_008f06b8(&puStack_130,&plStack_100,param_1 + 0x90);
      FUN_0076ad48(&plStack_100);
    }
    uVar17 = FUN_0076d5c0(&uStack_98,&DAT_002a0330);
    if (((uVar17 & 1) != 0) && (*piVar35 == 4)) {
      FUN_0076ae58(&plStack_100,&DAT_002bd228);
      FUN_008f06b8(&puStack_130,&plStack_100,param_1 + 0x90);
      FUN_0076ad48(&plStack_100);
    }
    uVar17 = FUN_0076d5c0(&uStack_98,&DAT_002cf983);
    if (((uVar17 & 1) != 0) && (iVar11 == 2)) {
      if (0 < uStack_168._4_4_) {
        lVar25 = 0;
        lVar13 = 0;
        do {
          uVar17 = FUN_0076b7e4(lStack_170 + lVar25,&DAT_002f315d);
          if ((uVar17 & 1) != 0) {
            if (-1 < (int)lVar13) goto LAB_008ed758;
            break;
          }
          lVar13 = lVar13 + 1;
          lVar25 = lVar25 + 0x10;
        } while (lVar13 < uStack_168._4_4_);
      }
      plStack_f8 = (long *)((ulong)plStack_f8 & 0xffffffffffffff);
      uStack_db = 0;
      *puVar38 = CONCAT26(DAT_002bd255._6_2_,(undefined6)DAT_002bd255);
      plStack_100 = (long *)CONCAT71(plStack_100._1_7_,0x1c);
      *(ulong *)((long)puVar38 + 6) = CONCAT62(_UNK_002bd25d,DAT_002bd255._6_2_);
      bStack_e8 = 0x18;
      uStack_df = 0x61;
      uStack_de = 99;
      uStack_dd = 0x68;
      uStack_dc = 0x69;
      uStack_e7 = (undefined4)DAT_002f315d;
      uStack_e3 = (undefined1)((ulong)DAT_002f315d >> 0x20);
      uStack_e2 = (undefined1)((ulong)DAT_002f315d >> 0x28);
      uStack_e1 = (undefined1)((ulong)DAT_002f315d >> 0x30);
      uStack_e0 = (undefined1)((ulong)DAT_002f315d >> 0x38);
      bStack_d0 = 0x26;
      uStack_bc = 0;
      uStack_b8 = 0;
      uStack_b0 = 0;
      uStack_bf = 0x75;
      uStack_be = 0x6c;
      uStack_bd = 0x74;
      uStack_c7 = (undefined1)_UNK_002e886c;
      uStack_c6 = (undefined1)((ulong)_UNK_002e886c >> 8);
      uStack_c5 = (undefined1)((ulong)_UNK_002e886c >> 0x10);
      uStack_c4 = (undefined1)((ulong)_UNK_002e886c >> 0x18);
      uStack_c3 = (undefined1)((ulong)_UNK_002e886c >> 0x20);
      uStack_c2 = (undefined1)((ulong)_UNK_002e886c >> 0x28);
      uStack_c1 = (undefined1)((ulong)_UNK_002e886c >> 0x30);
      uStack_c0 = (undefined1)((ulong)_UNK_002e886c >> 0x38);
      uStack_cf = (undefined5)_DAT_002e8864;
      uStack_ca = (undefined1)((ulong)_DAT_002e8864 >> 0x28);
      uStack_c9 = (undefined1)((ulong)_DAT_002e8864 >> 0x30);
      uStack_c8 = (undefined1)((ulong)_DAT_002e8864 >> 0x38);
      puStack_a8 = (undefined8 *)0x0;
      uStack_a0 = 0xffffffff;
      uStack_9c = 0;
      FUN_008f8218(&pbStack_1d0,&plStack_100);
      if ((uStack_b8 & 1) != 0) {
        _ZdlPv(puStack_a8);
      }
      if ((bStack_d0 & 1) != 0) {
        _ZdlPv(CONCAT26(uStack_ba,
                        CONCAT15(uStack_bb,
                                 CONCAT14(uStack_bc,
                                          CONCAT13(uStack_bd,
                                                   CONCAT12(uStack_be,CONCAT11(uStack_bf,uStack_c0))
                                                  )))));
      }
      if ((bStack_e8 & 1) != 0) {
        _ZdlPv(uStack_d8);
      }
      if (((ulong)plStack_100 & 1) != 0) {
        _ZdlPv(plStack_f0);
      }
LAB_008ed758:
      if (0 < uStack_168._4_4_) {
        lVar25 = 0;
        lVar13 = 0;
        do {
          uVar17 = FUN_0076b7e4(lStack_170 + lVar25,&DAT_002b2da9);
          if ((uVar17 & 1) != 0) {
            if (-1 < (int)lVar13) goto LAB_008ed888;
            break;
          }
          lVar13 = lVar13 + 1;
          lVar25 = lVar25 + 0x10;
        } while (lVar13 < uStack_168._4_4_);
      }
      uVar46 = _UNK_0029906f;
      uVar43 = _DAT_00299067;
      plStack_100 = (long *)CONCAT71(plStack_100._1_7_,0x22);
      *(undefined1 *)(puVar38 + 2) = 0x6f;
      uVar8 = (undefined7)DAT_002c4993;
      bStack_e8 = 0x10;
      uStack_e7 = 0x6863754c;
      uStack_e3 = 0x61;
      uStack_e2 = 100;
      uStack_e1 = 0x6f;
      uStack_e0 = 0x72;
      puVar38[1] = uVar46;
      *puVar38 = uVar43;
      plStack_f0._0_3_ = (uint3)(ushort)plStack_f0;
      uStack_cf = (undefined5)uVar8;
      uStack_ca = (undefined1)((uint7)uVar8 >> 0x28);
      uStack_c9 = (undefined1)((uint7)uVar8 >> 0x30);
      uStack_df = 0;
      uStack_c8 = DAT_002c4993._7_1_;
      uStack_c7 = (undefined1)_UNK_002c499b;
      uStack_c6 = (undefined1)((uint7)_UNK_002c499b >> 8);
      uStack_c5 = (undefined1)((uint7)_UNK_002c499b >> 0x10);
      uStack_c4 = (undefined1)((uint7)_UNK_002c499b >> 0x18);
      uStack_c3 = (undefined1)((uint7)_UNK_002c499b >> 0x20);
      uStack_c2 = (undefined1)((uint7)_UNK_002c499b >> 0x28);
      uStack_c1 = (undefined1)((uint7)_UNK_002c499b >> 0x30);
      bStack_d0 = 0x1e;
      uStack_c0 = 0;
      uStack_b0 = 0;
      puStack_a8 = (undefined8 *)0x0;
      uStack_b8 = 0;
      uStack_a0 = 0xffffffff;
      uStack_9c = 0;
      FUN_008f8218(&pbStack_1d0,&plStack_100);
      if ((uStack_b8 & 1) != 0) {
        _ZdlPv(puStack_a8);
      }
      if ((bStack_d0 & 1) != 0) {
        _ZdlPv(CONCAT26(uStack_ba,
                        CONCAT15(uStack_bb,
                                 CONCAT14(uStack_bc,
                                          CONCAT13(uStack_bd,
                                                   CONCAT12(uStack_be,CONCAT11(uStack_bf,uStack_c0))
                                                  )))));
      }
      if ((bStack_e8 & 1) != 0) {
        _ZdlPv(uStack_d8);
      }
      if (((ulong)plStack_100 & 1) != 0) {
        _ZdlPv(plStack_f0);
      }
LAB_008ed888:
      if (0 < uStack_168._4_4_) {
        lVar25 = 0;
        lVar13 = 0;
        do {
          uVar17 = FUN_0076b7e4(lStack_170 + lVar25,&DAT_002af509);
          if ((uVar17 & 1) != 0) {
            if (-1 < (int)lVar13) goto LAB_008ed9dc;
            break;
          }
          lVar13 = lVar13 + 1;
          lVar25 = lVar25 + 0x10;
        } while (lVar13 < uStack_168._4_4_);
      }
      plStack_100 = (long *)CONCAT71(plStack_100._1_7_,0x1e);
      *puVar38 = CONCAT17(DAT_002ab57d._7_1_,(undefined7)DAT_002ab57d);
      plStack_f0 = (long *)((ulong)plStack_f0 & 0xffffffffffffff00);
      *(ulong *)((long)puVar38 + 7) = CONCAT71(_UNK_002ab585,DAT_002ab57d._7_1_);
      bStack_e8 = 0x10;
      uStack_df = 0;
      bStack_d0 = 0x1e;
      uStack_c0 = 0;
      uStack_e7 = 0x65726946;
      uStack_e3 = 0x44;
      uStack_e2 = 0x75;
      uStack_e1 = 100;
      uStack_e0 = 0x65;
      uStack_cf = (undefined5)(undefined7)DAT_002da40d;
      uStack_ca = (undefined1)((uint7)(undefined7)DAT_002da40d >> 0x28);
      uStack_c9 = (undefined1)((uint7)(undefined7)DAT_002da40d >> 0x30);
      uStack_c8 = DAT_002da40d._7_1_;
      uStack_c7 = (undefined1)_UNK_002da415;
      uStack_c6 = (undefined1)((uint7)_UNK_002da415 >> 8);
      uStack_c5 = (undefined1)((uint7)_UNK_002da415 >> 0x10);
      uStack_c4 = (undefined1)((uint7)_UNK_002da415 >> 0x18);
      uStack_c3 = (undefined1)((uint7)_UNK_002da415 >> 0x20);
      uStack_c2 = (undefined1)((uint7)_UNK_002da415 >> 0x28);
      uStack_c1 = (undefined1)((uint7)_UNK_002da415 >> 0x30);
      puStack_a8 = (undefined8 *)_Znwm(0x20);
      uVar19 = _UNK_002cf9b3;
      uVar18 = _DAT_002cf9a1;
      uVar46 = CONCAT26(_UNK_002cf9b1,_DAT_002cf9ab);
      uStack_b0 = uVar14;
      uStack_b8 = uVar16;
      uVar43 = CONCAT62(_DAT_002cf9ab,_UNK_002cf9a9);
      *(undefined1 *)((long)puStack_a8 + 0x1a) = 0;
      puStack_a8[1] = uVar43;
      *puStack_a8 = uVar18;
      *(undefined8 *)((long)puStack_a8 + 0x12) = uVar19;
      *(undefined8 *)((long)puStack_a8 + 10) = uVar46;
      uStack_a0 = 0xffffffff;
      uStack_9c = 0;
      FUN_008f8218(&pbStack_1d0,&plStack_100);
      if ((uStack_b8 & 1) != 0) {
        _ZdlPv(puStack_a8);
      }
      if ((bStack_d0 & 1) != 0) {
        _ZdlPv(CONCAT26(uStack_ba,
                        CONCAT15(uStack_bb,
                                 CONCAT14(uStack_bc,
                                          CONCAT13(uStack_bd,
                                                   CONCAT12(uStack_be,CONCAT11(uStack_bf,uStack_c0))
                                                  )))));
      }
      if ((bStack_e8 & 1) != 0) {
        _ZdlPv(uStack_d8);
      }
      if (((ulong)plStack_100 & 1) != 0) {
        _ZdlPv(plStack_f0);
      }
    }
LAB_008ed9dc:
    uVar17 = FUN_0076d5c0(&uStack_98,&DAT_002a7fa1);
    if ((uVar17 & 1) != 0) {
      if (iVar11 == 2) {
        if (0 < uStack_168._4_4_) {
          lVar25 = 0;
          lVar13 = 0;
          do {
            uVar17 = FUN_0076b7e4(lStack_170 + lVar25,&DAT_002fab5c);
            if ((uVar17 & 1) != 0) {
              if (-1 < (int)lVar13) goto LAB_008edbb0;
              break;
            }
            lVar13 = lVar13 + 1;
            lVar25 = lVar25 + 0x10;
          } while (lVar13 < uStack_168._4_4_);
        }
        bVar41 = -(*DAT_0133c4c0 == '\0');
        uVar43 = NEON_scvtf(CONCAT44((int)((ulong)*(undefined8 *)(param_1 + 0xd4) >> 0x20) * 300,
                                     (int)*(undefined8 *)(param_1 + 0xd4) * 300),4);
        uVar46 = 0;
        if (*DAT_0133c4c0 != '\0') {
          uVar46 = 0x43340000;
        }
        uVar17 = CONCAT17((byte)((ulong)uVar43 >> 0x38) & ~bVar41,
                          CONCAT16((byte)((ulong)uVar43 >> 0x30) & ~bVar41,
                                   CONCAT15((byte)((ulong)uVar43 >> 0x28) & ~bVar41,
                                            CONCAT14((byte)((ulong)uVar43 >> 0x20) & ~bVar41,
                                                     CONCAT13((byte)((ulong)uVar43 >> 0x18) &
                                                              ~bVar41,CONCAT12((byte)((ulong)uVar43
                                                                                     >> 0x10) &
                                                                               ~bVar41,CONCAT11((
                                                  byte)((ulong)uVar43 >> 8) & ~bVar41,
                                                  (byte)uVar43 & ~bVar41)))))));
        FUN_0076ae58(&plStack_100,&DAT_002fab5c);
        uVar43 = FUN_00f1ed50(&plStack_100,0);
        FUN_0076ad48(&plStack_100);
        FUN_0076ae58(&plStack_100,&DAT_002cf9bc);
        lVar13 = FUN_00f1fd80(&plStack_100,0);
        FUN_0076ad48(&plStack_100);
        FUN_0076ae58(&plStack_100,&DAT_00302183);
        uVar18 = FUN_00f20520(&plStack_100,0,0);
        FUN_0076ad48(&plStack_100);
        uVar19 = FUN_00f6529c(*(undefined8 *)(lVar13 + 0x98));
        uVar19 = FUN_00f2057c(uVar19,0);
        piVar35 = DAT_0133c500;
        lVar13 = FUN_008fe9a0(*(undefined8 *)(param_1 + 0x88),uVar43,lVar13,uVar18,uVar19,0,
                              0xffffffff);
        FUN_00793bb8(uVar17,uVar17 >> 0x20,0,*(undefined8 *)(lVar13 + 0x110));
        FUN_007941bc(uVar46,*(undefined8 *)(lVar13 + 0x110));
        FUN_00794240(0x3fdf417c,*(undefined8 *)(lVar13 + 0x110));
        FUN_008d2420(*(undefined8 *)(lVar13 + 0x130));
      }
LAB_008edbb0:
      uVar43 = FUN_00f027b0(*(undefined8 *)(param_1 + 200));
      uVar17 = FUN_0076b7e4(uVar43,&DAT_002e4e87);
      if ((iVar11 == 2) && ((uVar17 & 1) != 0)) {
        if (0 < uStack_168._4_4_) {
          lVar25 = 0;
          lVar13 = 0;
          do {
            uVar17 = FUN_0076b7e4(lStack_170 + lVar25,&DAT_002a3fe3);
            if ((uVar17 & 1) != 0) {
              if (-1 < (int)lVar13) goto LAB_008edd50;
              break;
            }
            lVar13 = lVar13 + 1;
            lVar25 = lVar25 + 0x10;
          } while (lVar13 < uStack_168._4_4_);
        }
        bVar41 = -(*DAT_0133c4c0 == '\0');
        uVar43 = NEON_scvtf(CONCAT44((int)((ulong)*(undefined8 *)(param_1 + 0xd4) >> 0x20) * 300,
                                     (int)*(undefined8 *)(param_1 + 0xd4) * 300),4);
        uVar46 = 0;
        if (*DAT_0133c4c0 != '\0') {
          uVar46 = 0x43340000;
        }
        uVar17 = CONCAT17((byte)((ulong)uVar43 >> 0x38) & ~bVar41,
                          CONCAT16((byte)((ulong)uVar43 >> 0x30) & ~bVar41,
                                   CONCAT15((byte)((ulong)uVar43 >> 0x28) & ~bVar41,
                                            CONCAT14((byte)((ulong)uVar43 >> 0x20) & ~bVar41,
                                                     CONCAT13((byte)((ulong)uVar43 >> 0x18) &
                                                              ~bVar41,CONCAT12((byte)((ulong)uVar43
                                                                                     >> 0x10) &
                                                                               ~bVar41,CONCAT11((
                                                  byte)((ulong)uVar43 >> 8) & ~bVar41,
                                                  (byte)uVar43 & ~bVar41)))))));
        FUN_0076ae58(&plStack_100,&DAT_002a3fe3);
        uVar43 = FUN_00f1ed50(&plStack_100,0);
        FUN_0076ad48(&plStack_100);
        FUN_0076ae58(&plStack_100,&DAT_002b628e);
        lVar13 = FUN_00f1fd80(&plStack_100,0);
        FUN_0076ad48(&plStack_100);
        FUN_0076ae58(&plStack_100,&DAT_002ebfb7);
        uVar18 = FUN_00f20520(&plStack_100,0,0);
        FUN_0076ad48(&plStack_100);
        uVar19 = FUN_00f6529c(*(undefined8 *)(lVar13 + 0x98));
        uVar19 = FUN_00f2057c(uVar19,0);
        piVar35 = DAT_0133c500;
        lVar13 = FUN_008fe9a0(*(undefined8 *)(param_1 + 0x88),uVar43,lVar13,uVar18,uVar19,0,
                              0xffffffff);
        FUN_00793bb8(uVar17,uVar17 >> 0x20,0,*(undefined8 *)(lVar13 + 0x110));
        FUN_007941bc(uVar46,*(undefined8 *)(lVar13 + 0x110));
        FUN_00794240(0x3fdf417c,*(undefined8 *)(lVar13 + 0x110));
        FUN_008d2420(*(undefined8 *)(lVar13 + 0x130));
      }
LAB_008edd50:
      if (0 < uStack_168._4_4_) {
        lVar25 = 0;
        lVar13 = 0;
        do {
          uVar17 = FUN_0076b7e4(lStack_170 + lVar25,&DAT_002b2db2);
          if ((uVar17 & 1) != 0) {
            if ((-1 < (int)lVar13) && (0 < uStack_168._4_4_)) {
              lVar25 = 0;
              lVar13 = 0;
              goto LAB_008eddac;
            }
            break;
          }
          lVar13 = lVar13 + 1;
          lVar25 = lVar25 + 0x10;
        } while (lVar13 < uStack_168._4_4_);
      }
      goto LAB_008edde0;
    }
    goto LAB_008ede28;
  }
  puVar36 = puStack_118;
LAB_008ef4ac:
  plStack_100 = (long *)0x0;
  plStack_f8 = (long *)0x0;
  plStack_f0 = (long *)0x0;
  bVar10 = *DAT_0133c4c0 != '\0';
  uVar48 = 0;
  if (bVar10) {
    uVar48 = 0x43340000;
  }
  fVar45 = 0.0;
  if (bVar10) {
    fVar45 = (float)*(int *)(param_1 + 0xd4);
  }
  puVar29 = puStack_128;
  puVar38 = puStack_118;
  fVar47 = 0.0;
  if (bVar10) {
    fVar47 = (float)*(int *)(param_1 + 0xd8);
  }
  for (; puStack_128 = puVar29, puVar38 != puVar36; puVar38 = puVar38 + 2) {
    uStack_98 = *puVar38;
    plStack_90 = (long *)puVar38[1];
    if (plStack_90 != (long *)0x0) {
      FUN_0129eac0(1,plStack_90 + 1);
    }
    lVar13 = FUN_008fb7fc(fVar45,fVar47,uVar48,*(undefined8 *)(param_1 + 0x88),&uStack_98,0,1,1,1,1)
    ;
    plVar15 = plStack_f8;
    plVar34 = plStack_100;
    if (plStack_f8 < plStack_f0) {
      plVar21 = plStack_f8 + 1;
      *plStack_f8 = lVar13;
    }
    else {
      lVar25 = (long)plStack_f8 - (long)plStack_100;
      lVar22 = lVar25 >> 3;
      uVar16 = lVar22 + 1;
      if (uVar16 >> 0x3d != 0) goto LAB_008f06a0;
      uVar17 = (long)plStack_f0 - (long)plStack_100 >> 2;
      if (uVar17 <= uVar16) {
        uVar17 = uVar16;
      }
      if (0x7ffffffffffffff7 < (ulong)((long)plStack_f0 - (long)plStack_100)) {
        uVar17 = 0x1fffffffffffffff;
      }
      if (uVar17 == 0) {
        lVar33 = 0;
        *(long *)(lVar22 * 8) = lVar13;
        plVar21 = (long *)(lVar22 * 8);
        plVar7 = plStack_100;
      }
      else {
        if (uVar17 >> 0x3d != 0) goto LAB_008f06a8;
        lVar33 = _Znwm(uVar17 << 3);
        plVar21 = (long *)(lVar33 + lVar22 * 8);
        *plVar21 = lVar13;
        plVar7 = plStack_100;
      }
      plStack_100 = plVar21;
      lVar13 = (long)plVar15 - (long)plVar34;
      plVar21 = plStack_100 + 1;
      if (lVar13 != 0) {
        uVar16 = lVar13 - 8;
        plVar27 = plStack_100;
        if ((uVar16 < 0x38) || ((ulong)((long)plVar15 + (-lVar25 - lVar33)) < 0x20)) {
LAB_008ef64c:
          do {
            plVar15 = plVar15 + -1;
            plVar27 = plVar27 + -1;
            *plVar27 = *plVar15;
          } while (plVar15 != plVar34);
        }
        else {
          plVar31 = plVar15 + -2;
          uVar16 = (uVar16 >> 3) + 1;
          uVar23 = uVar16 & 0x3ffffffffffffffc;
          plVar15 = plVar15 + -uVar23;
          plVar27 = plStack_100 + -uVar23;
          plStack_100 = plStack_100 + -2;
          uVar40 = uVar23;
          do {
            plVar5 = plVar31 + -1;
            lVar22 = plVar31[-2];
            lVar25 = plVar31[1];
            lVar13 = *plVar31;
            uVar40 = uVar40 - 4;
            plVar31 = plVar31 + -4;
            plStack_100[-1] = *plVar5;
            plStack_100[-2] = lVar22;
            plStack_100[1] = lVar25;
            *plStack_100 = lVar13;
            plStack_100 = plStack_100 + -4;
          } while (uVar40 != 0);
          if (uVar16 != uVar23) goto LAB_008ef64c;
        }
        plStack_100 = plVar27;
        plVar15 = plVar7;
      }
      plStack_f0 = (long *)(lVar33 + uVar17 * 8);
      if (plVar15 != (long *)0x0) {
        plStack_f8 = plVar21;
        _ZdlPv(plVar15);
      }
    }
    plVar34 = plStack_90;
    plStack_f8 = plVar21;
    if ((plStack_90 != (long *)0x0) &&
       (lVar13 = FUN_0129eb20(0xffffffffffffffff,plStack_90 + 1), lVar13 == 0)) {
      (**(code **)(*plVar34 + 0x10))(plVar34);
      _ZNSt6__ndk119__shared_weak_count14__release_weakEv(plVar34);
    }
    puVar29 = puStack_128;
  }
  puVar38 = puStack_140;
  for (puVar36 = puStack_130; puStack_140 = puVar38, puVar36 != puVar29; puVar36 = puVar36 + 2) {
    uStack_98 = *puVar36;
    plStack_90 = (long *)puVar36[1];
    if (plStack_90 != (long *)0x0) {
      FUN_0129eac0(1,plStack_90 + 1);
    }
    lVar13 = FUN_008fb7fc(fVar45,fVar47,uVar48,*(undefined8 *)(param_1 + 0x88),&uStack_98,8,1,1,1,1)
    ;
    plVar15 = plStack_f8;
    plVar34 = plStack_100;
    if (plStack_f8 < plStack_f0) {
      plVar21 = plStack_f8 + 1;
      *plStack_f8 = lVar13;
    }
    else {
      lVar25 = (long)plStack_f8 - (long)plStack_100;
      lVar22 = lVar25 >> 3;
      uVar16 = lVar22 + 1;
      if (uVar16 >> 0x3d != 0) goto LAB_008f06a0;
      uVar17 = (long)plStack_f0 - (long)plStack_100 >> 2;
      if (uVar17 <= uVar16) {
        uVar17 = uVar16;
      }
      if (0x7ffffffffffffff7 < (ulong)((long)plStack_f0 - (long)plStack_100)) {
        uVar17 = 0x1fffffffffffffff;
      }
      if (uVar17 == 0) {
        lVar33 = 0;
        *(long *)(lVar22 * 8) = lVar13;
        plVar21 = (long *)(lVar22 * 8);
        plVar7 = plStack_100;
      }
      else {
        if (uVar17 >> 0x3d != 0) goto LAB_008f06a8;
        lVar33 = _Znwm(uVar17 << 3);
        plVar21 = (long *)(lVar33 + lVar22 * 8);
        *plVar21 = lVar13;
        plVar7 = plStack_100;
      }
      plStack_100 = plVar21;
      lVar13 = (long)plVar15 - (long)plVar34;
      plVar21 = plStack_100 + 1;
      if (lVar13 != 0) {
        uVar16 = lVar13 - 8;
        plVar27 = plStack_100;
        if ((uVar16 < 0x38) || ((ulong)((long)plVar15 + (-lVar25 - lVar33)) < 0x20)) {
LAB_008ef81c:
          do {
            plVar15 = plVar15 + -1;
            plVar27 = plVar27 + -1;
            *plVar27 = *plVar15;
          } while (plVar15 != plVar34);
        }
        else {
          plVar31 = plVar15 + -2;
          uVar16 = (uVar16 >> 3) + 1;
          uVar23 = uVar16 & 0x3ffffffffffffffc;
          plVar15 = plVar15 + -uVar23;
          plVar27 = plStack_100 + -uVar23;
          plStack_100 = plStack_100 + -2;
          uVar40 = uVar23;
          do {
            plVar5 = plVar31 + -1;
            lVar22 = plVar31[-2];
            lVar25 = plVar31[1];
            lVar13 = *plVar31;
            uVar40 = uVar40 - 4;
            plVar31 = plVar31 + -4;
            plStack_100[-1] = *plVar5;
            plStack_100[-2] = lVar22;
            plStack_100[1] = lVar25;
            *plStack_100 = lVar13;
            plStack_100 = plStack_100 + -4;
          } while (uVar40 != 0);
          if (uVar16 != uVar23) goto LAB_008ef81c;
        }
        plStack_100 = plVar27;
        plVar15 = plVar7;
      }
      plStack_f0 = (long *)(lVar33 + uVar17 * 8);
      if (plVar15 != (long *)0x0) {
        plStack_f8 = plVar21;
        _ZdlPv(plVar15);
      }
    }
    plVar34 = plStack_90;
    plStack_f8 = plVar21;
    if ((plStack_90 != (long *)0x0) &&
       (lVar13 = FUN_0129eb20(0xffffffffffffffff,plStack_90 + 1), lVar13 == 0)) {
      (**(code **)(*plVar34 + 0x10))(plVar34);
      _ZNSt6__ndk119__shared_weak_count14__release_weakEv(plVar34);
    }
    puVar38 = puStack_140;
  }
  puVar29 = puStack_160;
  puVar20 = puStack_158;
  puVar36 = puStack_148;
  while( true ) {
    puStack_160 = puVar29;
    puStack_158 = puVar20;
    if (puVar36 == puVar38) break;
    uStack_98 = *puVar36;
    plStack_90 = (long *)puVar36[1];
    if (plStack_90 != (long *)0x0) {
      FUN_0129eac0(1,plStack_90 + 1);
    }
    lVar13 = FUN_008fb7fc(fVar45,fVar47,uVar48,*(undefined8 *)(param_1 + 0x88),&uStack_98,4,1,1,1,1)
    ;
    plVar15 = plStack_f8;
    plVar34 = plStack_100;
    if (plStack_f8 < plStack_f0) {
      plVar21 = plStack_f8 + 1;
      *plStack_f8 = lVar13;
    }
    else {
      lVar25 = (long)plStack_f8 - (long)plStack_100;
      lVar22 = lVar25 >> 3;
      uVar16 = lVar22 + 1;
      if (uVar16 >> 0x3d != 0) {
LAB_008f06a0:
                    /* WARNING: Subroutine does not return */
        FUN_00797298(&plStack_100);
      }
      uVar17 = (long)plStack_f0 - (long)plStack_100 >> 2;
      if (uVar17 <= uVar16) {
        uVar17 = uVar16;
      }
      if (0x7ffffffffffffff7 < (ulong)((long)plStack_f0 - (long)plStack_100)) {
        uVar17 = 0x1fffffffffffffff;
      }
      if (uVar17 == 0) {
        lVar33 = 0;
        *(long *)(lVar22 * 8) = lVar13;
        plVar21 = (long *)(lVar22 * 8);
        plVar7 = plStack_100;
      }
      else {
        if (uVar17 >> 0x3d != 0) goto LAB_008f06a8;
        lVar33 = _Znwm(uVar17 << 3);
        plVar21 = (long *)(lVar33 + lVar22 * 8);
        *plVar21 = lVar13;
        plVar7 = plStack_100;
      }
      plStack_100 = plVar21;
      lVar13 = (long)plVar15 - (long)plVar34;
      plVar21 = plStack_100 + 1;
      if (lVar13 != 0) {
        uVar16 = lVar13 - 8;
        plVar27 = plStack_100;
        if ((uVar16 < 0x38) || ((ulong)((long)plVar15 + (-lVar25 - lVar33)) < 0x20)) {
LAB_008ef9ec:
          do {
            plVar15 = plVar15 + -1;
            plVar27 = plVar27 + -1;
            *plVar27 = *plVar15;
          } while (plVar15 != plVar34);
        }
        else {
          plVar31 = plVar15 + -2;
          uVar16 = (uVar16 >> 3) + 1;
          uVar23 = uVar16 & 0x3ffffffffffffffc;
          plVar15 = plVar15 + -uVar23;
          plVar27 = plStack_100 + -uVar23;
          plStack_100 = plStack_100 + -2;
          uVar40 = uVar23;
          do {
            plVar5 = plVar31 + -1;
            lVar22 = plVar31[-2];
            lVar25 = plVar31[1];
            lVar13 = *plVar31;
            uVar40 = uVar40 - 4;
            plVar31 = plVar31 + -4;
            plStack_100[-1] = *plVar5;
            plStack_100[-2] = lVar22;
            plStack_100[1] = lVar25;
            *plStack_100 = lVar13;
            plStack_100 = plStack_100 + -4;
          } while (uVar40 != 0);
          if (uVar16 != uVar23) goto LAB_008ef9ec;
        }
        plStack_100 = plVar27;
        plVar15 = plVar7;
      }
      plStack_f0 = (long *)(lVar33 + uVar17 * 8);
      if (plVar15 != (long *)0x0) {
        plStack_f8 = plVar21;
        _ZdlPv(plVar15);
      }
    }
    plVar34 = plStack_90;
    plStack_f8 = plVar21;
    if ((plStack_90 != (long *)0x0) &&
       (lVar13 = FUN_0129eb20(0xffffffffffffffff,plStack_90 + 1), lVar13 == 0)) {
      (**(code **)(*plVar34 + 0x10))(plVar34);
      _ZNSt6__ndk119__shared_weak_count14__release_weakEv(plVar34);
    }
    puVar36 = puVar36 + 2;
    puVar29 = puStack_160;
    puVar20 = puStack_158;
  }
  while( true ) {
    pbVar26 = pbStack_1c8;
    pbVar30 = pbStack_1d0;
    if (puVar29 == puVar20) break;
    uStack_98 = *puVar29;
    plStack_90 = (long *)puVar29[1];
    if (plStack_90 != (long *)0x0) {
      FUN_0129eac0(1,plStack_90 + 1);
    }
    FUN_008fb7fc(fVar45,fVar47,uVar48,*(undefined8 *)(param_1 + 0x88),&uStack_98,5,0,1,1,1);
    plVar34 = plStack_90;
    if ((plStack_90 != (long *)0x0) &&
       (lVar13 = FUN_0129eb20(0xffffffffffffffff,plStack_90 + 1), lVar13 == 0)) {
      (**(code **)(*plVar34 + 0x10))(plVar34);
      _ZNSt6__ndk119__shared_weak_count14__release_weakEv(plVar34);
    }
    puVar29 = puVar29 + 2;
  }
  for (; pbVar30 != pbVar26; pbVar30 = pbVar30 + 0x68) {
    pbVar28 = *(byte **)(pbVar30 + 0x10);
    if ((*pbVar30 & 1) == 0) {
      pbVar28 = pbVar30 + 1;
    }
    pbVar1 = pbVar30 + 0x19;
    if ((pbVar30[0x18] & 1) != 0) {
      pbVar1 = *(byte **)(pbVar30 + 0x28);
    }
    pbVar2 = pbVar30 + 0x31;
    if ((pbVar30[0x30] & 1) != 0) {
      pbVar2 = *(byte **)(pbVar30 + 0x40);
    }
    pbVar3 = pbVar30 + 0x49;
    if ((pbVar30[0x48] & 1) != 0) {
      pbVar3 = *(byte **)(pbVar30 + 0x58);
    }
    FUN_008f0958(param_1,&plStack_100,pbVar28,pbVar1,pbVar2,pbVar3,*(undefined4 *)(pbVar30 + 0x60),
                 pbVar30[100]);
  }
  plVar21 = (long *)FUN_00f18e90(0x42);
  iVar11 = (**(code **)(*plVar21 + 0x20))();
  uVar16 = uStack_1b0;
  uVar17 = uStack_1a0;
  uVar40 = uStack_198;
  plVar34 = plStack_100;
  plVar15 = plStack_f8;
  if (0 < iVar11) {
    iVar11 = 0;
    do {
      uVar14 = (**(code **)(*plVar21 + 0x28))(plVar21,iVar11);
      lVar13 = FUN_00f36100();
      if (lVar13 == *(long *)(param_1 + 200)) {
        iVar12 = FUN_00f360f8(uVar14);
        if (iVar12 == 0) {
          puVar38 = (undefined8 *)_Znwm(0x10);
          puVar36 = *(undefined8 **)(param_1 + 0x170);
          puVar29 = *(undefined8 **)(param_1 + 0x178);
          *puVar38 = uVar14;
          puVar38[1] = 0;
          if (puVar36 < puVar29) {
            *puVar36 = puVar38;
            *(undefined8 **)(param_1 + 0x170) = puVar36 + 1;
          }
          else {
            puVar20 = *(undefined8 **)(param_1 + 0x168);
            lVar13 = (long)puVar36 - (long)puVar20 >> 3;
            uVar16 = lVar13 + 1;
            if (uVar16 >> 0x3d != 0) {
                    /* WARNING: Subroutine does not return */
              FUN_008f8528(param_1 + 0x168);
            }
            uVar40 = (long)puVar29 - (long)puVar20;
            uVar17 = (long)uVar40 >> 2;
            if (uVar17 <= uVar16) {
              uVar17 = uVar16;
            }
            if (0x7ffffffffffffff7 < uVar40) {
              uVar17 = 0x1fffffffffffffff;
            }
            if (uVar17 == 0) {
              lVar25 = 0;
              puVar29 = (undefined8 *)(lVar13 * 8);
              lVar13 = (long)puVar36 - (long)puVar20;
              puVar39 = puVar29 + 1;
              *puVar29 = puVar38;
              if (lVar13 != 0) goto LAB_008efccc;
LAB_008efed8:
              *(undefined8 **)(param_1 + 0x168) = puVar29;
              *(undefined8 **)(param_1 + 0x170) = puVar39;
              *(ulong *)(param_1 + 0x178) = lVar25 + uVar17 * 8;
            }
            else {
              if (uVar17 >> 0x3d != 0) {
LAB_008f06a8:
                    /* WARNING: Subroutine does not return */
                FUN_005f9a24();
              }
              lVar25 = _Znwm(uVar17 << 3);
              puVar29 = (undefined8 *)(lVar25 + lVar13 * 8);
              lVar13 = (long)puVar36 - (long)puVar20;
              puVar39 = puVar29 + 1;
              *puVar29 = puVar38;
              if (lVar13 == 0) goto LAB_008efed8;
LAB_008efccc:
              puVar38 = puVar29;
              if ((lVar13 - 8U < 0x38) ||
                 ((ulong)((long)puVar36 + (-((long)puVar36 - (long)puVar20) - lVar25)) < 0x20)) {
LAB_008efd38:
                do {
                  puVar36 = puVar36 + -1;
                  puVar38 = puVar38 + -1;
                  *puVar38 = *puVar36;
                } while (puVar36 != puVar20);
              }
              else {
                puVar32 = puVar36 + -2;
                uVar16 = (lVar13 - 8U >> 3) + 1;
                uVar23 = uVar16 & 0x3ffffffffffffffc;
                puVar36 = puVar36 + -uVar23;
                puVar38 = puVar29 + -uVar23;
                puVar29 = puVar29 + -2;
                uVar40 = uVar23;
                do {
                  puVar6 = puVar32 + -1;
                  uVar44 = puVar32[-2];
                  uVar42 = puVar32[1];
                  uVar14 = *puVar32;
                  uVar40 = uVar40 - 4;
                  puVar32 = puVar32 + -4;
                  puVar29[-1] = *puVar6;
                  puVar29[-2] = uVar44;
                  puVar29[1] = uVar42;
                  *puVar29 = uVar14;
                  puVar29 = puVar29 + -4;
                } while (uVar40 != 0);
                if (uVar16 != uVar23) goto LAB_008efd38;
              }
              puVar36 = *(undefined8 **)(param_1 + 0x168);
              *(undefined8 **)(param_1 + 0x168) = puVar38;
              *(undefined8 **)(param_1 + 0x170) = puVar39;
              *(ulong *)(param_1 + 0x178) = lVar25 + uVar17 * 8;
            }
            if (puVar36 != (undefined8 *)0x0) {
              _ZdlPv(puVar36);
            }
            *(undefined8 **)(param_1 + 0x170) = puVar39;
          }
        }
        else {
          iVar12 = FUN_00f360f8(uVar14);
          if (iVar12 == 1) {
            lVar13 = FUN_00f36110(uVar14);
            plVar34 = (long *)(lVar13 + 8);
            if (7 < *(int *)(lVar13 + 4)) {
              plVar34 = (long *)*(long *)(lVar13 + 8);
            }
            if (0 < uStack_168._4_4_) {
              lVar25 = 0;
              lVar13 = 0;
              do {
                uVar16 = FUN_0076b7e4(lStack_170 + lVar25,plVar34);
                if ((uVar16 & 1) != 0) {
                  if (-1 < (int)lVar13) {
                    lVar13 = FUN_00f36108(uVar14);
                    uVar4 = *(uint *)(lVar13 + 0xc);
                    if (0 < (int)uVar4) {
                      lVar13 = 0;
                      do {
                        plVar34 = (long *)FUN_00f36108(uVar14);
                        uVar16 = uStack_198;
                        if (uStack_198 < uStack_190) {
                          FUN_0076aed8(uStack_198,*plVar34 + lVar13);
                          uStack_198 = uVar16 + 0x10;
                        }
                        else {
                          uStack_198 = FUN_00623ac8(&uStack_1a0,*plVar34 + lVar13);
                        }
                        lVar13 = lVar13 + 0x10;
                      } while ((ulong)uVar4 * 0x10 != lVar13);
                    }
                  }
                  break;
                }
                lVar13 = lVar13 + 1;
                lVar25 = lVar25 + 0x10;
              } while (lVar13 < uStack_168._4_4_);
            }
          }
          else {
            iVar12 = FUN_00f360f8(uVar14);
            if (iVar12 == 2) {
              lVar13 = FUN_00f36110(uVar14);
              plVar34 = (long *)(lVar13 + 8);
              if (7 < *(int *)(lVar13 + 4)) {
                plVar34 = (long *)*(long *)(lVar13 + 8);
              }
              if (0 < uStack_168._4_4_) {
                lVar25 = 0;
                lVar13 = 0;
                do {
                  uVar16 = FUN_0076b7e4(lStack_170 + lVar25,plVar34);
                  if ((uVar16 & 1) != 0) {
                    if (-1 < (int)lVar13) {
                      lVar13 = FUN_00f36108(uVar14);
                      uVar4 = *(uint *)(lVar13 + 0xc);
                      if (0 < (int)uVar4) {
                        lVar13 = 0;
                        do {
                          plVar34 = (long *)FUN_00f36108(uVar14);
                          uVar16 = uStack_1b0;
                          if (uStack_1b0 < uStack_1a8) {
                            FUN_0076aed8(uStack_1b0,*plVar34 + lVar13);
                            uStack_1b0 = uVar16 + 0x10;
                          }
                          else {
                            uStack_1b0 = FUN_00623ac8(&uStack_1b8,*plVar34 + lVar13);
                          }
                          lVar13 = lVar13 + 0x10;
                        } while ((ulong)uVar4 * 0x10 != lVar13);
                      }
                    }
                    break;
                  }
                  lVar13 = lVar13 + 1;
                  lVar25 = lVar25 + 0x10;
                } while (lVar13 < uStack_168._4_4_);
              }
            }
            else {
              iVar12 = FUN_00f360f8(uVar14);
              if (iVar12 == 3) {
                lVar13 = FUN_00f36110(uVar14);
                plVar34 = (long *)(lVar13 + 8);
                if (7 < *(int *)(lVar13 + 4)) {
                  plVar34 = (long *)*(long *)(lVar13 + 8);
                }
                if (0 < uStack_168._4_4_) {
                  lVar25 = 0;
                  lVar13 = 0;
                  do {
                    uVar16 = FUN_0076b7e4(lStack_170 + lVar25,plVar34);
                    if ((uVar16 & 1) != 0) {
                      if (-1 < (int)lVar13) goto LAB_008efba0;
                      break;
                    }
                    lVar13 = lVar13 + 1;
                    lVar25 = lVar25 + 0x10;
                  } while (lVar13 < uStack_168._4_4_);
                }
                lVar13 = FUN_00f36108(uVar14);
                if (0 < (int)*(uint *)(lVar13 + 0xc)) {
                  lVar25 = (ulong)*(uint *)(lVar13 + 0xc) * 0x10;
                  lVar13 = 0;
                  do {
                    while( true ) {
                      plVar34 = (long *)FUN_00f36108(uVar14);
                      uVar16 = uStack_198;
                      if (uStack_190 <= uStack_198) break;
                      FUN_0076aed8(uStack_198,*plVar34 + lVar13);
                      uStack_198 = uVar16 + 0x10;
                      lVar13 = lVar13 + 0x10;
                      if (lVar25 == lVar13) goto LAB_008efba0;
                    }
                    uStack_198 = FUN_00623ac8(&uStack_1a0,*plVar34 + lVar13);
                    lVar13 = lVar13 + 0x10;
                  } while (lVar25 != lVar13);
                }
              }
            }
          }
        }
      }
LAB_008efba0:
      iVar11 = iVar11 + 1;
      iVar12 = (**(code **)(*plVar21 + 0x20))(plVar21);
      uVar16 = uStack_1b0;
      uVar17 = uStack_1a0;
      uVar40 = uStack_198;
      plVar34 = plStack_100;
      plVar15 = plStack_f8;
    } while (iVar11 < iVar12);
  }
  while( true ) {
    uVar23 = uStack_198;
    uStack_1b0 = uVar16;
    if (uVar17 == uStack_198) break;
    uStack_198 = uVar40;
    plStack_100 = plVar34;
    plStack_f8 = plVar15;
    if (plVar34 != plVar15) {
      do {
        lVar25 = *plVar34;
        lVar13 = *(long *)(lVar25 + 8);
        if (lVar13 != 0) {
          lVar22 = uVar17 + 8;
          if (7 < *(int *)(uVar17 + 4)) {
            lVar22 = *(long *)(uVar17 + 8);
          }
          lVar22 = FUN_0072c834(lVar22);
          uVar16 = *(long *)(lVar13 + 0x80) - *(long *)(lVar13 + 0x78);
          if (0 < (int)(uVar16 >> 3)) {
            uVar40 = 0;
            do {
              if (*(long *)(*(long *)(lVar13 + 0x78) + uVar40 * 8) == lVar22) {
                lVar33 = *(long *)(lVar25 + 8);
                lVar13 = *(long *)(lVar33 + 0x18);
                lVar22 = *(long *)(lVar33 + 0x20);
                if ((int)((ulong)(lVar22 - lVar13) >> 4) * -0x49249249 != 0) {
                  uVar16 = 0;
                  lVar37 = 0x6c;
                  do {
                    if ((uint)*(ushort *)(lVar13 + lVar37) == (uint)uVar40) {
                      FUN_00797188(lVar25,uVar16 & 0xffffffff,0);
                      lVar13 = *(long *)(lVar33 + 0x18);
                      lVar22 = *(long *)(lVar33 + 0x20);
                    }
                    uVar16 = uVar16 + 1;
                    lVar37 = lVar37 + 0x70;
                  } while (uVar16 < (uint)((int)((ulong)(lVar22 - lVar13) >> 4) * -0x49249249));
                }
                break;
              }
              uVar40 = uVar40 + 1;
            } while ((uVar16 >> 3 & 0xffffffff) != uVar40);
          }
        }
        plVar34 = plVar34 + 1;
      } while (plVar34 != plVar15);
    }
    uVar16 = uStack_1b0;
    uVar17 = uVar17 + 0x10;
    uVar40 = uStack_198;
    plVar34 = plStack_100;
    plVar15 = plStack_f8;
    uStack_198 = uVar23;
  }
  uVar17 = uStack_1b8;
  uStack_198 = uVar40;
  while( true ) {
    plStack_100 = plVar34;
    plStack_f8 = plVar15;
    if (uVar17 == uVar16) break;
    for (; plVar34 != plVar15; plVar34 = plVar34 + 1) {
      lVar13 = *plVar34;
      lVar25 = *(long *)(lVar13 + 8);
      if ((lVar25 != 0) && (lVar22 = *(long *)(lVar25 + 0x18), *(long *)(lVar25 + 0x20) != lVar22))
      {
        uVar40 = 0;
        do {
          pbVar26 = (byte *)FUN_0072c950(*(undefined8 *)
                                          (*(long *)(*(long *)(lVar13 + 8) + 0x78) +
                                          (ulong)*(ushort *)(lVar22 + uVar40 * 0x70 + 0x6c) * 8));
          pbVar30 = *(byte **)(pbVar26 + 0x10);
          if ((*pbVar26 & 1) == 0) {
            pbVar30 = pbVar26 + 1;
          }
          FUN_0076ae58(&uStack_98,pbVar30);
          uVar23 = FUN_0076d574(&uStack_98,uVar17);
          if ((uVar23 & 1) != 0) {
            FUN_00797188(lVar13,uVar40,0);
          }
          FUN_0076ad48(&uStack_98);
          lVar22 = *(long *)(lVar25 + 0x18);
          uVar40 = (ulong)((int)uVar40 + 1);
        } while (uVar40 < (ulong)((*(long *)(lVar25 + 0x20) - lVar22 >> 4) * 0x6db6db6db6db6db7));
      }
    }
    uVar17 = uVar17 + 0x10;
    plVar34 = plStack_100;
    plVar15 = plStack_f8;
  }
  lVar13 = FUN_00856ae8();
  if (*(int *)(lVar13 + 0x88) == 0) {
    FUN_0076ae58(auStack_1e0,&DAT_002c0b09);
    plVar15 = plStack_f8;
    for (plVar34 = plStack_100; plVar34 != plVar15; plVar34 = plVar34 + 1) {
      lVar13 = *plVar34;
      lVar25 = *(long *)(lVar13 + 8);
      if ((lVar25 != 0) && (lVar22 = *(long *)(lVar25 + 0x18), *(long *)(lVar25 + 0x20) != lVar22))
      {
        uVar16 = 0;
        do {
          pbVar26 = (byte *)FUN_0072c950(*(undefined8 *)
                                          (*(long *)(*(long *)(lVar13 + 8) + 0x78) +
                                          (ulong)*(ushort *)(lVar22 + uVar16 * 0x70 + 0x6c) * 8));
          pbVar30 = *(byte **)(pbVar26 + 0x10);
          if ((*pbVar26 & 1) == 0) {
            pbVar30 = pbVar26 + 1;
          }
          FUN_0076ae58(&uStack_98,pbVar30);
          uVar17 = FUN_0076d690(&uStack_98,auStack_1e0);
          if ((uVar17 & 1) != 0) {
            FUN_00797188(lVar13,uVar16,0);
          }
          FUN_0076ad48(&uStack_98);
          lVar22 = *(long *)(lVar25 + 0x18);
          uVar16 = (ulong)((int)uVar16 + 1);
        } while (uVar16 < (ulong)((*(long *)(lVar25 + 0x20) - lVar22 >> 4) * 0x6db6db6db6db6db7));
      }
    }
    FUN_0076ad48(auStack_1e0);
  }
  if (puStack_148 != puStack_140) {
    FUN_0090457c(*(undefined8 *)(param_1 + 0x88));
  }
  FUN_008f0cec(param_1,0,0);
  if (plStack_100 != (long *)0x0) {
    plStack_f8 = plStack_100;
    _ZdlPv();
  }
  pbVar30 = pbStack_1d0;
  if (pbStack_1d0 != (byte *)0x0) {
    for (pbVar26 = pbStack_1c8; pbVar26 != pbVar30; pbVar26 = pbVar26 + -0x68) {
      if ((pbVar26[-0x20] & 1) == 0) {
        if ((pbVar26[-0x38] & 1) != 0) goto LAB_008f0350;
LAB_008f032c:
        if ((pbVar26[-0x50] & 1) != 0) goto LAB_008f0360;
LAB_008f0334:
        bVar41 = pbVar26[-0x68];
      }
      else {
        _ZdlPv(*(undefined8 *)(pbVar26 + -0x10));
        if ((pbVar26[-0x38] & 1) == 0) goto LAB_008f032c;
LAB_008f0350:
        _ZdlPv(*(undefined8 *)(pbVar26 + -0x28));
        if ((pbVar26[-0x50] & 1) == 0) goto LAB_008f0334;
LAB_008f0360:
        _ZdlPv(*(undefined8 *)(pbVar26 + -0x40));
        bVar41 = pbVar26[-0x68];
      }
      if ((bVar41 & 1) != 0) {
        _ZdlPv(*(undefined8 *)(pbVar26 + -0x58));
      }
    }
    _ZdlPv(pbVar30);
  }
  uVar17 = uStack_1b8;
  uVar16 = uStack_1b0;
  if (uStack_1b8 != 0) {
    for (; uVar16 != uVar17; uVar16 = uVar16 - 0x10) {
      FUN_0076ad48(uVar16 - 0x10);
    }
    uStack_1b0 = uVar17;
    _ZdlPv(uStack_1b8);
  }
  uVar17 = uStack_1a0;
  uVar16 = uStack_198;
  if (uStack_1a0 != 0) {
    for (; uVar16 != uVar17; uVar16 = uVar16 - 0x10) {
      FUN_0076ad48(uVar16 - 0x10);
    }
    uStack_198 = uVar17;
    _ZdlPv(uStack_1a0);
  }
  lVar25 = lStack_188;
  lVar13 = lStack_180;
  if (lStack_188 != 0) {
    for (; lVar13 != lVar25; lVar13 = lVar13 + -0x10) {
      plVar34 = *(long **)(lVar13 + -8);
      if ((plVar34 != (long *)0x0) &&
         (lVar22 = FUN_0129eb20(0xffffffffffffffff,plVar34 + 1), lVar22 == 0)) {
        (**(code **)(*plVar34 + 0x10))(plVar34);
        _ZNSt6__ndk119__shared_weak_count14__release_weakEv(plVar34);
      }
    }
    lStack_180 = lVar25;
    _ZdlPv(lStack_188);
  }
  if (lStack_170 != 0) {
    plVar34 = (long *)(lStack_170 + -8);
    lVar13 = *plVar34;
    if (lVar13 != 0) {
      lVar13 = lVar13 << 4;
      lVar25 = lStack_170 + -0x10;
      do {
        FUN_0076ad48(lVar25 + lVar13);
        lVar13 = lVar13 + -0x10;
      } while (lVar13 != 0);
    }
    _ZdaPv(plVar34);
  }
  puVar29 = puStack_160;
  puVar36 = puStack_158;
  if (puStack_160 != (undefined8 *)0x0) {
    for (; puVar36 != puVar29; puVar36 = puVar36 + -2) {
      plVar34 = (long *)puVar36[-1];
      if ((plVar34 != (long *)0x0) &&
         (lVar13 = FUN_0129eb20(0xffffffffffffffff,plVar34 + 1), lVar13 == 0)) {
        (**(code **)(*plVar34 + 0x10))(plVar34);
        _ZNSt6__ndk119__shared_weak_count14__release_weakEv(plVar34);
      }
    }
    puStack_158 = puVar29;
    _ZdlPv(puStack_160);
  }
  puVar29 = puStack_148;
  puVar36 = puStack_140;
  if (puStack_148 != (undefined8 *)0x0) {
    for (; puVar36 != puVar29; puVar36 = puVar36 + -2) {
      plVar34 = (long *)puVar36[-1];
      if ((plVar34 != (long *)0x0) &&
         (lVar13 = FUN_0129eb20(0xffffffffffffffff,plVar34 + 1), lVar13 == 0)) {
        (**(code **)(*plVar34 + 0x10))(plVar34);
        _ZNSt6__ndk119__shared_weak_count14__release_weakEv(plVar34);
      }
    }
    puStack_140 = puVar29;
    _ZdlPv(puStack_148);
  }
  puVar29 = puStack_130;
  puVar36 = puStack_128;
  if (puStack_130 != (undefined8 *)0x0) {
    for (; puVar36 != puVar29; puVar36 = puVar36 + -2) {
      plVar34 = (long *)puVar36[-1];
      if ((plVar34 != (long *)0x0) &&
         (lVar13 = FUN_0129eb20(0xffffffffffffffff,plVar34 + 1), lVar13 == 0)) {
        (**(code **)(*plVar34 + 0x10))(plVar34);
        _ZNSt6__ndk119__shared_weak_count14__release_weakEv(plVar34);
      }
    }
    puStack_128 = puVar29;
    _ZdlPv(puStack_130);
  }
  puVar29 = puStack_118;
  puVar36 = puStack_110;
  if (puStack_118 != (undefined8 *)0x0) {
    for (; puVar36 != puVar29; puVar36 = puVar36 + -2) {
      plVar34 = (long *)puVar36[-1];
      if ((plVar34 != (long *)0x0) &&
         (lVar13 = FUN_0129eb20(0xffffffffffffffff,plVar34 + 1), lVar13 == 0)) {
        (**(code **)(*plVar34 + 0x10))(plVar34);
        _ZNSt6__ndk119__shared_weak_count14__release_weakEv(plVar34);
      }
    }
    puStack_110 = puVar29;
    _ZdlPv(puStack_118);
  }
  return;
  while( true ) {
    lVar13 = lVar13 + 1;
    lVar25 = lVar25 + 0x10;
    if (uStack_168._4_4_ <= lVar13) break;
LAB_008eddac:
    uVar17 = FUN_0076b7e4(lStack_170 + lVar25,&DAT_002af512);
    if ((uVar17 & 1) != 0) {
      if (-1 < (int)lVar13) goto LAB_008ede28;
      break;
    }
  }
LAB_008edde0:
  FUN_0076ae58(&plStack_100,&DAT_002da4f2);
  uVar17 = uStack_198;
  if (uStack_198 < uStack_190) {
    FUN_0076af5c(uStack_198,&plStack_100);
    uStack_198 = uVar17 + 0x10;
  }
  else {
    uStack_198 = FUN_0062f690(&uStack_1a0,&plStack_100);
  }
  FUN_0076ad48(&plStack_100);
LAB_008ede28:
  uVar17 = FUN_0076d5c0(&uStack_98,&DAT_002d6b6a);
  if (((uVar17 & 1) != 0) && (0 < uStack_168._4_4_)) {
    lVar25 = 0;
    lVar13 = 0;
    do {
      uVar17 = FUN_0076b7e4(lStack_170 + lVar25,&DAT_002a3fe3);
      if ((uVar17 & 1) != 0) {
        if (-1 < (int)lVar13) {
          FUN_0076ae58(&plStack_100,&DAT_002e4e93);
          uVar17 = uStack_1b0;
          if (uStack_1b0 < uStack_1a8) {
            FUN_0076af5c(uStack_1b0,&plStack_100);
            uStack_1b0 = uVar17 + 0x10;
          }
          else {
            uStack_1b0 = FUN_0062f690(&uStack_1b8,&plStack_100);
          }
          FUN_0076ad48(&plStack_100);
        }
        break;
      }
      lVar13 = lVar13 + 1;
      lVar25 = lVar25 + 0x10;
    } while (lVar13 < uStack_168._4_4_);
    if (uStack_168._4_4_ < 1) {
LAB_008edf68:
    }
    else {
      lVar25 = 0;
      lVar13 = 0;
      do {
        uVar17 = FUN_0076b7e4(lStack_170 + lVar25,&DAT_002b2db9);
        if ((uVar17 & 1) != 0) {
          if (-1 < (int)lVar13) {
            FUN_0076ae58(&plStack_100,&DAT_002f6ff8);
            uVar17 = uStack_1b0;
            if (uStack_1b0 < uStack_1a8) {
              FUN_0076af5c(uStack_1b0,&plStack_100);
              uStack_1b0 = uVar17 + 0x10;
            }
            else {
              uStack_1b0 = FUN_0062f690(&uStack_1b8,&plStack_100);
            }
            FUN_0076ad48(&plStack_100);
          }
          goto LAB_008edf68;
        }
        lVar13 = lVar13 + 1;
        lVar25 = lVar25 + 0x10;
      } while (lVar13 < uStack_168._4_4_);
    }
    if (0 < uStack_168._4_4_) {
      lVar25 = 0;
      lVar13 = 0;
      do {
        uVar17 = FUN_0076b7e4(lStack_170 + lVar25,&DAT_00291dc7);
        if ((uVar17 & 1) != 0) {
          if (-1 < (int)lVar13) {
            FUN_0076ae58(&plStack_100,&DAT_002e1312);
            uVar17 = uStack_1b0;
            if (uStack_1b0 < uStack_1a8) {
              FUN_0076af5c(uStack_1b0,&plStack_100);
              uStack_1b0 = uVar17 + 0x10;
            }
            else {
              uStack_1b0 = FUN_0062f690(&uStack_1b8,&plStack_100);
            }
            FUN_0076ad48(&plStack_100);
          }
          break;
        }
        lVar13 = lVar13 + 1;
        lVar25 = lVar25 + 0x10;
      } while (lVar13 < uStack_168._4_4_);
    }
  }
  uVar17 = FUN_0076d5c0(&uStack_98,&DAT_002d6b83);
  if ((uVar17 & 1) != 0) {
    if (0 < uStack_168._4_4_) {
      lVar25 = 0;
      lVar13 = 0;
      do {
        uVar17 = FUN_0076b7e4(lStack_170 + lVar25,&DAT_002b991e);
        if ((uVar17 & 1) != 0) {
          if ((-1 < (int)lVar13) && (0 < uStack_168._4_4_)) {
            lVar25 = 0;
            lVar13 = 0;
            goto LAB_008ee068;
          }
          break;
        }
        lVar13 = lVar13 + 1;
        lVar25 = lVar25 + 0x10;
      } while (lVar13 < uStack_168._4_4_);
    }
    goto LAB_008ee0e4;
  }
  goto LAB_008ee12c;
  while( true ) {
    lVar13 = lVar13 + 1;
    lVar25 = lVar25 + 0x10;
    if (uStack_168._4_4_ <= lVar13) break;
LAB_008ee068:
    uVar17 = FUN_0076b7e4(lStack_170 + lVar25,&DAT_002e1319);
    if ((uVar17 & 1) != 0) {
      if ((-1 < (int)lVar13) && (0 < uStack_168._4_4_)) {
        lVar25 = 0;
        lVar13 = 0;
        goto LAB_008ee0b0;
      }
      break;
    }
  }
  goto LAB_008ee0e4;
  while( true ) {
    lVar13 = lVar13 + 1;
    lVar25 = lVar25 + 0x10;
    if (uStack_168._4_4_ <= lVar13) break;
LAB_008ee0b0:
    uVar17 = FUN_0076b7e4(lStack_170 + lVar25,&DAT_002d331c);
    if ((uVar17 & 1) != 0) {
      if (-1 < (int)lVar13) goto LAB_008ee12c;
      break;
    }
  }
LAB_008ee0e4:
  FUN_0076ae58(&plStack_100,&DAT_002fab66);
  uVar17 = uStack_198;
  if (uStack_198 < uStack_190) {
    FUN_0076af5c(uStack_198,&plStack_100);
    uStack_198 = uVar17 + 0x10;
  }
  else {
    uStack_198 = FUN_0062f690(&uStack_1a0,&plStack_100);
  }
  FUN_0076ad48(&plStack_100);
LAB_008ee12c:
  uVar17 = FUN_0076d5c0(&uStack_98,&DAT_002d6b9e);
  if ((uVar17 & 1) != 0) {
    if (iVar11 == 2) {
      if (0 < uStack_168._4_4_) {
        lVar25 = 0;
        lVar13 = 0;
        do {
          uVar17 = FUN_0076b7e4(lStack_170 + lVar25,&DAT_002cf9cd);
          if ((uVar17 & 1) != 0) {
            if (-1 < (int)lVar13) goto LAB_008ee244;
            break;
          }
          lVar13 = lVar13 + 1;
          lVar25 = lVar25 + 0x10;
        } while (lVar13 < uStack_168._4_4_);
      }
      plStack_f8._0_7_ = (uint7)(uint6)plStack_f8;
      uStack_dc = 0;
      *puVar38 = CONCAT35(DAT_002a7fc2._5_3_,(undefined5)DAT_002a7fc2);
      plStack_100 = (long *)CONCAT71(plStack_100._1_7_,0x1a);
      *(ulong *)((long)puVar38 + 5) = CONCAT53(_UNK_002a7fca,DAT_002a7fc2._5_3_);
      bStack_e8 = 0x16;
      uStack_df = 0x75;
      uStack_de = 100;
      uStack_dd = 0x65;
      uStack_bd = 0;
      uStack_e7 = (undefined4)DAT_002cf9cd;
      uStack_e3 = (undefined1)((ulong)DAT_002cf9cd >> 0x20);
      uStack_e2 = (undefined1)((ulong)DAT_002cf9cd >> 0x28);
      uStack_e1 = (undefined1)((ulong)DAT_002cf9cd >> 0x30);
      uStack_e0 = (undefined1)((ulong)DAT_002cf9cd >> 0x38);
      bStack_d0 = 0x24;
      uStack_b8 = uStack_b8 & 0xffffffffffff0000;
      uStack_bf = 0x6c;
      uStack_be = 0x74;
      uStack_c7 = (undefined1)_UNK_002c49ab;
      uStack_c6 = (undefined1)((ulong)_UNK_002c49ab >> 8);
      uStack_c5 = (undefined1)((ulong)_UNK_002c49ab >> 0x10);
      uStack_c4 = (undefined1)((ulong)_UNK_002c49ab >> 0x18);
      uStack_c3 = (undefined1)((ulong)_UNK_002c49ab >> 0x20);
      uStack_c2 = (undefined1)((ulong)_UNK_002c49ab >> 0x28);
      uStack_c1 = (undefined1)((ulong)_UNK_002c49ab >> 0x30);
      uStack_c0 = (undefined1)((ulong)_UNK_002c49ab >> 0x38);
      uStack_cf = (undefined5)_DAT_002c49a3;
      uStack_ca = (undefined1)((ulong)_DAT_002c49a3 >> 0x28);
      uStack_c9 = (undefined1)((ulong)_DAT_002c49a3 >> 0x30);
      uStack_c8 = (undefined1)((ulong)_DAT_002c49a3 >> 0x38);
      uStack_a0 = 5;
      uStack_9c = 0;
      FUN_008f8218(&pbStack_1d0,&plStack_100);
      if ((uStack_b8 & 1) != 0) {
        _ZdlPv(puStack_a8);
      }
      if ((bStack_d0 & 1) != 0) {
        _ZdlPv(CONCAT26(uStack_ba,
                        CONCAT15(uStack_bb,
                                 CONCAT14(uStack_bc,
                                          CONCAT13(uStack_bd,
                                                   CONCAT12(uStack_be,CONCAT11(uStack_bf,uStack_c0))
                                                  )))));
      }
      if ((bStack_e8 & 1) != 0) {
        _ZdlPv(uStack_d8);
      }
      if (((ulong)plStack_100 & 1) != 0) {
        _ZdlPv(plStack_f0);
      }
    }
LAB_008ee244:
    if (0 < uStack_168._4_4_) {
      lVar25 = 0;
      lVar13 = 0;
      do {
        uVar17 = FUN_0076b7e4(lStack_170 + lVar25,&DAT_002cb95b);
        if ((uVar17 & 1) != 0) {
          if ((-1 < (int)lVar13) && (0 < uStack_168._4_4_)) {
            lVar25 = 0;
            lVar13 = 0;
            goto LAB_008ee2a0;
          }
          break;
        }
        lVar13 = lVar13 + 1;
        lVar25 = lVar25 + 0x10;
      } while (lVar13 < uStack_168._4_4_);
    }
LAB_008ee304:
    FUN_0076ae58(&plStack_100,&DAT_002da4f2);
    uVar17 = uStack_198;
    if (uStack_198 < uStack_190) {
      FUN_0076af5c(uStack_198,&plStack_100);
      uStack_198 = uVar17 + 0x10;
    }
    else {
      uStack_198 = FUN_0062f690(&uStack_1a0,&plStack_100);
    }
    FUN_0076ad48(&plStack_100);
  }
LAB_008ee34c:
  uVar17 = FUN_0076d5c0(&uStack_98,&DAT_002ebfcc);
  if ((uVar17 & 1) != 0) {
    if (0 < uStack_168._4_4_) {
      lVar25 = 0;
      lVar13 = 0;
      do {
        uVar17 = FUN_0076b7e4(lStack_170 + lVar25,&DAT_002e8878);
        if ((uVar17 & 1) != 0) {
          if (-1 < (int)lVar13) goto LAB_008ee460;
          break;
        }
        lVar13 = lVar13 + 1;
        lVar25 = lVar25 + 0x10;
      } while (lVar13 < uStack_168._4_4_);
    }
    uVar46 = _UNK_002efa83;
    uVar43 = _DAT_002efa7b;
    if (iVar11 == 2) {
      plStack_100 = (long *)CONCAT71(plStack_100._1_7_,0x22);
      *(undefined1 *)(puVar38 + 2) = 0x79;
      uVar9 = (undefined6)DAT_002d6bba;
      puVar38[1] = uVar46;
      *puVar38 = uVar43;
      uStack_e7 = (undefined4)uVar9;
      uStack_e3 = (undefined1)((uint6)uVar9 >> 0x20);
      uStack_e2 = (undefined1)((uint6)uVar9 >> 0x28);
      bStack_e8 = 0x1c;
      uStack_e1 = (undefined1)DAT_002d6bba._6_2_;
      uStack_e0 = (undefined1)((ushort)DAT_002d6bba._6_2_ >> 8);
      uStack_df = (undefined1)_UNK_002d6bc2;
      uStack_de = (undefined1)((uint6)_UNK_002d6bc2 >> 8);
      uStack_dd = (undefined1)((uint6)_UNK_002d6bc2 >> 0x10);
      uStack_dc = (undefined1)((uint6)_UNK_002d6bc2 >> 0x18);
      uStack_db = (undefined1)((uint6)_UNK_002d6bc2 >> 0x20);
      uStack_da = (undefined1)((uint6)_UNK_002d6bc2 >> 0x28);
      plStack_f0._0_3_ = (uint3)(ushort)plStack_f0;
      uStack_cf = (undefined5)DAT_00299079;
      uStack_d9 = 0;
      uStack_ca = (undefined1)DAT_00299079._5_3_;
      uStack_c9 = (undefined1)((uint3)DAT_00299079._5_3_ >> 8);
      uStack_c8 = (undefined1)((uint3)DAT_00299079._5_3_ >> 0x10);
      uStack_c7 = (undefined1)_UNK_00299081;
      uStack_c6 = (undefined1)((uint5)_UNK_00299081 >> 8);
      uStack_c5 = (undefined1)((uint5)_UNK_00299081 >> 0x10);
      uStack_c4 = (undefined1)((uint5)_UNK_00299081 >> 0x18);
      uStack_c3 = (undefined1)((uint5)_UNK_00299081 >> 0x20);
      bStack_d0 = 0x1a;
      uStack_c2 = 0;
      uStack_b8 = uStack_b8 & 0xffffffffffff0000;
      uStack_a0 = 3;
      uStack_9c = 0;
      FUN_008f8218(&pbStack_1d0,&plStack_100);
      if ((uStack_b8 & 1) != 0) {
        _ZdlPv(puStack_a8);
      }
      if ((bStack_d0 & 1) != 0) {
        _ZdlPv(CONCAT26(uStack_ba,
                        CONCAT15(uStack_bb,
                                 CONCAT14(uStack_bc,
                                          CONCAT13(uStack_bd,
                                                   CONCAT12(uStack_be,CONCAT11(uStack_bf,uStack_c0))
                                                  )))));
      }
      if ((bStack_e8 & 1) != 0) {
        _ZdlPv(uStack_d8);
      }
      if (((ulong)plStack_100 & 1) != 0) {
        _ZdlPv(plStack_f0);
      }
    }
  }
LAB_008ee460:
  uVar17 = FUN_0076d5c0(&uStack_98,&DAT_002fe61c);
  uVar43 = DAT_002af520;
  if ((uVar17 & 1) != 0) {
    uVar46 = CONCAT35(DAT_002b9928._5_3_,(undefined5)DAT_002b9928);
    uVar18 = CONCAT53(_UNK_002b9930,DAT_002b9928._5_3_);
    bStack_e8 = 0xc;
    plStack_100 = (long *)CONCAT71(plStack_100._1_7_,0x1a);
    uStack_e7 = 0x6c6c6f52;
    uStack_e3 = 0x65;
    uStack_e2 = 0x72;
    bStack_d0 = 0x14;
    *puVar38 = uVar46;
    *(undefined8 *)((long)puVar38 + 5) = uVar18;
    uStack_cf = (undefined5)uVar43;
    uStack_ca = (undefined1)((ulong)uVar43 >> 0x28);
    uStack_c9 = (undefined1)((ulong)uVar43 >> 0x30);
    uStack_c8 = (undefined1)((ulong)uVar43 >> 0x38);
    plStack_f8._0_7_ = (uint7)(uint6)plStack_f8;
    uStack_e1 = 0;
    uStack_c7 = 0x6e;
    uStack_c6 = 0x6b;
    uStack_c5 = 0;
    uStack_b8 = uStack_b8 & 0xffffffffffff0000;
    uStack_a0 = 0x10;
    uStack_9c = 0;
    FUN_008f8218(&pbStack_1d0,&plStack_100);
    if ((uStack_b8 & 1) != 0) {
      _ZdlPv(puStack_a8);
    }
    if ((bStack_d0 & 1) != 0) {
      _ZdlPv(CONCAT26(uStack_ba,
                      CONCAT15(uStack_bb,
                               CONCAT14(uStack_bc,
                                        CONCAT13(uStack_bd,
                                                 CONCAT12(uStack_be,CONCAT11(uStack_bf,uStack_c0))))
                              )));
    }
    if ((bStack_e8 & 1) != 0) {
      _ZdlPv(uStack_d8);
    }
    if (((ulong)plStack_100 & 1) != 0) {
      _ZdlPv(plStack_f0);
    }
    plStack_100 = (long *)CONCAT71(plStack_100._1_7_,0x1a);
    *puVar38 = uVar46;
    *(undefined8 *)((long)puVar38 + 5) = uVar18;
    plStack_f8._0_7_ = (uint7)(uint6)plStack_f8;
    bStack_e8 = 0x10;
    uStack_e7 = 0x44757453;
    uStack_e3 = 0x72;
    uStack_e2 = 0x75;
    uStack_e1 = 0x6d;
    uStack_e0 = 0x73;
    uStack_df = 0;
    bStack_d0 = 0x10;
    uStack_cf = 0x7244757453;
    uStack_ca = 0x75;
    uStack_c9 = 0x6d;
    uStack_c8 = 0x73;
    uStack_c7 = 0;
    uStack_b8 = uStack_b8 & 0xffffffffffff0000;
    uStack_a0 = 0x10;
    uStack_9c = 0;
    FUN_008f8218(&pbStack_1d0,&plStack_100);
    if ((uStack_b8 & 1) != 0) {
      _ZdlPv(puStack_a8);
    }
    if ((bStack_d0 & 1) != 0) {
      _ZdlPv(CONCAT26(uStack_ba,
                      CONCAT15(uStack_bb,
                               CONCAT14(uStack_bc,
                                        CONCAT13(uStack_bd,
                                                 CONCAT12(uStack_be,CONCAT11(uStack_bf,uStack_c0))))
                              )));
    }
    if ((bStack_e8 & 1) != 0) {
      _ZdlPv(uStack_d8);
    }
    if (((ulong)plStack_100 & 1) != 0) {
      _ZdlPv(plStack_f0);
    }
    plStack_f8 = (long *)((ulong)plStack_f8 & 0xffffffffffffff);
    *puVar38 = CONCAT26(DAT_002a7fd0._6_2_,(undefined6)DAT_002a7fd0);
    uStack_df = 0;
    *(ulong *)((long)puVar38 + 6) = CONCAT62(_UNK_002a7fd8,DAT_002a7fd0._6_2_);
    uStack_e7 = 0x65706f52;
    uStack_e3 = 0x44;
    uStack_e2 = 0x75;
    uStack_e1 = 100;
    uStack_e0 = 0x65;
    bStack_d0 = 0x18;
    plStack_100 = (long *)CONCAT71(plStack_100._1_7_,0x1c);
    bStack_e8 = 0x10;
    uStack_c7 = 0x50;
    uStack_c6 = 0x75;
    uStack_c5 = 0x6e;
    uStack_c4 = 0x6b;
    uStack_cf = (undefined5)DAT_002b629f;
    uStack_ca = (undefined1)((ulong)DAT_002b629f >> 0x28);
    uStack_c9 = (undefined1)((ulong)DAT_002b629f >> 0x30);
    uStack_c8 = (undefined1)((ulong)DAT_002b629f >> 0x38);
    uStack_c3 = 0;
    uStack_b8 = uStack_b8 & 0xffffffffffff0000;
    uStack_a0 = 0x10;
    uStack_9c = 0;
    FUN_008f8218(&pbStack_1d0,&plStack_100);
    if ((uStack_b8 & 1) != 0) {
      _ZdlPv(puStack_a8);
    }
    if ((bStack_d0 & 1) != 0) {
      _ZdlPv(CONCAT26(uStack_ba,
                      CONCAT15(uStack_bb,
                               CONCAT14(uStack_bc,
                                        CONCAT13(uStack_bd,
                                                 CONCAT12(uStack_be,CONCAT11(uStack_bf,uStack_c0))))
                              )));
    }
    if ((bStack_e8 & 1) != 0) {
      _ZdlPv(uStack_d8);
    }
    if (((ulong)plStack_100 & 1) != 0) {
      _ZdlPv(plStack_f0);
    }
    plStack_f8 = (long *)((ulong)plStack_f8 & 0xffffffffffffff);
    uStack_db = 0;
    *puVar38 = CONCAT26(DAT_002bd255._6_2_,(undefined6)DAT_002bd255);
    plStack_100 = (long *)CONCAT71(plStack_100._1_7_,0x1c);
    *(ulong *)((long)puVar38 + 6) = CONCAT62(_UNK_002bd25d,DAT_002bd255._6_2_);
    bStack_e8 = 0x18;
    uStack_df = 0x61;
    uStack_de = 99;
    uStack_dd = 0x68;
    uStack_dc = 0x69;
    uStack_e7 = (undefined4)DAT_002f315d;
    uStack_e3 = (undefined1)((ulong)DAT_002f315d >> 0x20);
    uStack_e2 = (undefined1)((ulong)DAT_002f315d >> 0x28);
    uStack_e1 = (undefined1)((ulong)DAT_002f315d >> 0x30);
    uStack_e0 = (undefined1)((ulong)DAT_002f315d >> 0x38);
    uStack_bf = 0;
    bStack_d0 = 0x20;
    uStack_c7 = (undefined1)_UNK_002a3ff3;
    uStack_c6 = (undefined1)((ulong)_UNK_002a3ff3 >> 8);
    uStack_c5 = (undefined1)((ulong)_UNK_002a3ff3 >> 0x10);
    uStack_c4 = (undefined1)((ulong)_UNK_002a3ff3 >> 0x18);
    uStack_c3 = (undefined1)((ulong)_UNK_002a3ff3 >> 0x20);
    uStack_c2 = (undefined1)((ulong)_UNK_002a3ff3 >> 0x28);
    uStack_c1 = (undefined1)((ulong)_UNK_002a3ff3 >> 0x30);
    uStack_c0 = (undefined1)((ulong)_UNK_002a3ff3 >> 0x38);
    uStack_cf = (undefined5)_DAT_002a3feb;
    uStack_ca = (undefined1)((ulong)_DAT_002a3feb >> 0x28);
    uStack_c9 = (undefined1)((ulong)_DAT_002a3feb >> 0x30);
    uStack_c8 = (undefined1)((ulong)_DAT_002a3feb >> 0x38);
    uStack_b8 = uStack_b8 & 0xffffffffffff0000;
    uStack_a0 = 0x10;
    uStack_9c = 0;
    FUN_008f8218(&pbStack_1d0,&plStack_100);
    if ((uStack_b8 & 1) != 0) {
      _ZdlPv(puStack_a8);
    }
    if ((bStack_d0 & 1) != 0) {
      _ZdlPv(CONCAT26(uStack_ba,
                      CONCAT15(uStack_bb,
                               CONCAT14(uStack_bc,
                                        CONCAT13(uStack_bd,
                                                 CONCAT12(uStack_be,CONCAT11(uStack_bf,uStack_c0))))
                              )));
    }
    if ((bStack_e8 & 1) != 0) {
      _ZdlPv(uStack_d8);
    }
    if (((ulong)plStack_100 & 1) != 0) {
      _ZdlPv(plStack_f0);
    }
  }
  uVar17 = FUN_0076d5c0(&uStack_98,&DAT_002c83ff);
  if ((uVar17 & 1) != 0) {
    if (0 < uStack_168._4_4_) {
      lVar25 = 0;
      lVar13 = 0;
      do {
        uVar17 = FUN_0076b7e4(lStack_170 + lVar25,&DAT_002d331c);
        if ((uVar17 & 1) != 0) {
          if (-1 < (int)lVar13) {
            FUN_0076ae58(&plStack_100,&DAT_00299087);
            uVar17 = uStack_198;
            if (uStack_198 < uStack_190) {
              FUN_0076af5c(uStack_198,&plStack_100);
              uStack_198 = uVar17 + 0x10;
            }
            else {
              uStack_198 = FUN_0062f690(&uStack_1a0,&plStack_100);
            }
            FUN_0076ad48(&plStack_100);
            FUN_0076ae58(&plStack_100,&DAT_0029c95a);
            uVar17 = uStack_198;
            if (uStack_198 < uStack_190) {
              FUN_0076af5c(uStack_198,&plStack_100);
              uStack_198 = uVar17 + 0x10;
            }
            else {
              uStack_198 = FUN_0062f690(&uStack_1a0,&plStack_100);
            }
            FUN_0076ad48(&plStack_100);
            FUN_0076ae58(&plStack_100,&DAT_002da4fc);
            uVar17 = uStack_198;
            if (uStack_198 < uStack_190) {
              FUN_0076af5c(uStack_198,&plStack_100);
              uStack_198 = uVar17 + 0x10;
            }
            else {
              uStack_198 = FUN_0062f690(&uStack_1a0,&plStack_100);
            }
            FUN_0076ad48(&plStack_100);
          }
          break;
        }
        lVar13 = lVar13 + 1;
        lVar25 = lVar25 + 0x10;
      } while (lVar13 < uStack_168._4_4_);
      if (0 < uStack_168._4_4_) {
        lVar25 = 0;
        lVar13 = 0;
        do {
          uVar17 = FUN_0076b7e4(lStack_170 + lVar25,&DAT_002f6ffe);
          if ((uVar17 & 1) != 0) {
            if (-1 < (int)lVar13) {
              FUN_0076ae58(&plStack_100,&DAT_002f316a);
              uVar17 = uStack_198;
              if (uStack_198 < uStack_190) {
                FUN_0076af5c(uStack_198,&plStack_100);
                uStack_198 = uVar17 + 0x10;
              }
              else {
                uStack_198 = FUN_0062f690(&uStack_1a0,&plStack_100);
              }
              FUN_0076ad48(&plStack_100);
            }
            break;
          }
          lVar13 = lVar13 + 1;
          lVar25 = lVar25 + 0x10;
        } while (lVar13 < uStack_168._4_4_);
      }
    }
    if (iVar11 == 2) {
      if (0 < uStack_168._4_4_) {
        lVar25 = 0;
        lVar13 = 0;
        do {
          uVar17 = FUN_0076b7e4(lStack_170 + lVar25,&DAT_002cf9cd);
          if ((uVar17 & 1) != 0) {
            if (-1 < (int)lVar13) goto LAB_008eead8;
            break;
          }
          lVar13 = lVar13 + 1;
          lVar25 = lVar25 + 0x10;
        } while (lVar13 < uStack_168._4_4_);
      }
      uVar43 = CONCAT53(_UNK_002a7fca,DAT_002a7fc2._5_3_);
      plStack_100 = (long *)CONCAT71(plStack_100._1_7_,0x1a);
      *puVar38 = CONCAT35(DAT_002a7fc2._5_3_,(undefined5)DAT_002a7fc2);
      bStack_e8 = 0x16;
      *(undefined8 *)((long)puVar38 + 5) = uVar43;
      plStack_f8._0_7_ = (uint7)(uint6)plStack_f8;
      uStack_df = 0x75;
      uStack_de = 100;
      uStack_dd = 0x65;
      uStack_e7 = (undefined4)DAT_002cf9cd;
      uStack_e3 = (undefined1)((ulong)DAT_002cf9cd >> 0x20);
      uStack_e2 = (undefined1)((ulong)DAT_002cf9cd >> 0x28);
      uStack_e1 = (undefined1)((ulong)DAT_002cf9cd >> 0x30);
      uStack_e0 = (undefined1)((ulong)DAT_002cf9cd >> 0x38);
      uStack_dc = 0;
      puVar20 = (undefined8 *)_Znwm(0x20);
      uVar19 = _UNK_002ebffe;
      uVar18 = _DAT_002ebfea;
      uVar46 = CONCAT44(_UNK_002ebffa,_DAT_002ebff6);
      uStack_c0 = SUB81(puVar20,0);
      uStack_bf = (undefined1)((ulong)puVar20 >> 8);
      uStack_be = (undefined1)((ulong)puVar20 >> 0x10);
      uStack_bd = (undefined1)((ulong)puVar20 >> 0x18);
      uStack_bc = (undefined1)((ulong)puVar20 >> 0x20);
      uStack_bb = (undefined1)((ulong)puVar20 >> 0x28);
      uStack_ba = (undefined2)((ulong)puVar20 >> 0x30);
      uStack_c8 = (undefined1)uVar44;
      uStack_c7 = (undefined1)((ulong)uVar44 >> 8);
      uStack_c6 = (undefined1)((ulong)uVar44 >> 0x10);
      uStack_c5 = (undefined1)((ulong)uVar44 >> 0x18);
      uStack_c4 = (undefined1)((ulong)uVar44 >> 0x20);
      uStack_c3 = (undefined1)((ulong)uVar44 >> 0x28);
      uStack_c2 = (undefined1)((ulong)uVar44 >> 0x30);
      uStack_c1 = (undefined1)((ulong)uVar44 >> 0x38);
      bStack_d0 = (byte)uVar42;
      uStack_cf = (undefined5)((ulong)uVar42 >> 8);
      uStack_ca = (undefined1)((ulong)uVar42 >> 0x30);
      uStack_c9 = (undefined1)((ulong)uVar42 >> 0x38);
      uVar43 = CONCAT44(_DAT_002ebff6,_UNK_002ebff2);
      *(undefined1 *)((long)puVar20 + 0x1c) = 0;
      puVar20[1] = uVar43;
      *puVar20 = uVar18;
      *(undefined8 *)((long)puVar20 + 0x14) = uVar19;
      *(undefined8 *)((long)puVar20 + 0xc) = uVar46;
      uStack_b8 = uStack_b8 & 0xffffffffffff0000;
      uStack_a0 = 5;
      uStack_9c = 0;
      FUN_008f8218(&pbStack_1d0,&plStack_100);
      if ((uStack_b8 & 1) != 0) {
        _ZdlPv(puStack_a8);
      }
      if ((bStack_d0 & 1) != 0) {
        _ZdlPv(CONCAT26(uStack_ba,
                        CONCAT15(uStack_bb,
                                 CONCAT14(uStack_bc,
                                          CONCAT13(uStack_bd,
                                                   CONCAT12(uStack_be,CONCAT11(uStack_bf,uStack_c0))
                                                  )))));
      }
      if ((bStack_e8 & 1) != 0) {
        _ZdlPv(uStack_d8);
      }
      if (((ulong)plStack_100 & 1) != 0) {
        _ZdlPv(plStack_f0);
      }
    }
  }
LAB_008eead8:
  FUN_0076d5c0(&uStack_98,&DAT_0029587e);
  uVar17 = FUN_0076d5c0(&uStack_98,&DAT_002c0b4f);
  if ((uVar17 & 1) != 0) {
    if (iVar11 != 2) {
      FUN_0076d5c0(&uStack_98,&DAT_002b9936);
      goto LAB_008ef264;
    }
    if (0 < uStack_168._4_4_) {
      lVar25 = 0;
      lVar13 = 0;
      do {
        uVar17 = FUN_0076b7e4(lStack_170 + lVar25,"Silencer");
        if ((uVar17 & 1) != 0) {
          if (-1 < (int)lVar13) goto LAB_008eec40;
          break;
        }
        lVar13 = lVar13 + 1;
        lVar25 = lVar25 + 0x10;
      } while (lVar13 < uStack_168._4_4_);
    }
    plStack_f8 = (long *)((ulong)plStack_f8 & 0xffffffffffffff);
    *puVar38 = CONCAT26(DAT_0029c964._6_2_,(undefined6)DAT_0029c964);
    plStack_100 = (long *)CONCAT71(plStack_100._1_7_,0x1c);
    *(ulong *)((long)puVar38 + 6) = CONCAT62(_UNK_0029c96c,DAT_0029c964._6_2_);
    bStack_e8 = 0x10;
    uStack_df = 0;
    uStack_e7 = 0x656c6953;
    uStack_e3 = 0x6e;
    uStack_e2 = 99;
    uStack_e1 = 0x65;
    uStack_e0 = 0x72;
    uStack_c0 = 0;
    uStack_b8 = uStack_b8 & 0xffffffffffff0000;
    uStack_cf = (undefined5)(undefined7)DAT_002af534;
    uStack_ca = (undefined1)((uint7)(undefined7)DAT_002af534 >> 0x28);
    uStack_c9 = (undefined1)((uint7)(undefined7)DAT_002af534 >> 0x30);
    bStack_d0 = 0x1e;
    uStack_c8 = DAT_002af534._7_1_;
    uStack_c7 = (undefined1)_UNK_002af53c;
    uStack_c6 = (undefined1)((uint7)_UNK_002af53c >> 8);
    uStack_c5 = (undefined1)((uint7)_UNK_002af53c >> 0x10);
    uStack_c4 = (undefined1)((uint7)_UNK_002af53c >> 0x18);
    uStack_c3 = (undefined1)((uint7)_UNK_002af53c >> 0x20);
    uStack_c2 = (undefined1)((uint7)_UNK_002af53c >> 0x28);
    uStack_c1 = (undefined1)((uint7)_UNK_002af53c >> 0x30);
    uStack_a0 = 0x10;
    uStack_9c = 0;
    FUN_008f8218(&pbStack_1d0,&plStack_100);
    if ((uStack_b8 & 1) != 0) {
      _ZdlPv(puStack_a8);
    }
    if ((bStack_d0 & 1) != 0) {
      _ZdlPv(CONCAT26(uStack_ba,
                      CONCAT15(uStack_bb,
                               CONCAT14(uStack_bc,
                                        CONCAT13(uStack_bd,
                                                 CONCAT12(uStack_be,CONCAT11(uStack_bf,uStack_c0))))
                              )));
    }
    if ((bStack_e8 & 1) != 0) {
      _ZdlPv(uStack_d8);
    }
    if (((ulong)plStack_100 & 1) != 0) {
      _ZdlPv(plStack_f0);
    }
  }
LAB_008eec40:
  uVar17 = FUN_0076d5c0(&uStack_98,&DAT_002b9936);
  if ((uVar17 & 1) != 0) {
    if (iVar11 != 2) goto LAB_008ef264;
    if (0 < uStack_168._4_4_) {
      lVar25 = 0;
      lVar13 = 0;
      do {
        uVar17 = FUN_0076b7e4(lStack_170 + lVar25,&DAT_002da507);
        if ((uVar17 & 1) != 0) {
          if (-1 < (int)lVar13) goto LAB_008eed90;
          break;
        }
        lVar13 = lVar13 + 1;
        lVar25 = lVar25 + 0x10;
      } while (lVar13 < uStack_168._4_4_);
    }
    uVar46 = _DAT_002e8881;
    uVar43 = CONCAT53(DAT_002e888e._3_5_,(undefined3)DAT_002e888e);
    plStack_100 = (long *)CONCAT71(plStack_100._1_7_,0x2a);
    puVar38[1] = CONCAT35((undefined3)DAT_002e888e,_UNK_002e8889);
    *puVar38 = uVar46;
    *(undefined8 *)((long)puVar38 + 0xd) = uVar43;
    plStack_f0._0_7_ = (uint7)(uint6)plStack_f0;
    uStack_e7 = (undefined4)(undefined5)DAT_002da507;
    uStack_e3 = (undefined1)((uint5)(undefined5)DAT_002da507 >> 0x20);
    bStack_e8 = 0x1a;
    uStack_e2 = (undefined1)DAT_002da507._5_3_;
    uStack_e1 = (undefined1)((uint3)DAT_002da507._5_3_ >> 8);
    uStack_e0 = (undefined1)((uint3)DAT_002da507._5_3_ >> 0x10);
    uStack_df = (undefined1)_UNK_002da50f;
    uStack_de = (undefined1)((uint5)_UNK_002da50f >> 8);
    uStack_dd = (undefined1)((uint5)_UNK_002da50f >> 0x10);
    uStack_dc = (undefined1)((uint5)_UNK_002da50f >> 0x18);
    uStack_db = (undefined1)((uint5)_UNK_002da50f >> 0x20);
    bStack_d0 = 0x28;
    uStack_da = 0;
    uStack_bb = 0;
    uStack_bf = 0x61;
    uStack_be = 0x75;
    uStack_bd = 0x6c;
    uStack_bc = 0x74;
    uStack_a0 = 0x14;
    uStack_c7 = (undefined1)_UNK_002dde63;
    uStack_c6 = (undefined1)((ulong)_UNK_002dde63 >> 8);
    uStack_c5 = (undefined1)((ulong)_UNK_002dde63 >> 0x10);
    uStack_c4 = (undefined1)((ulong)_UNK_002dde63 >> 0x18);
    uStack_c3 = (undefined1)((ulong)_UNK_002dde63 >> 0x20);
    uStack_c2 = (undefined1)((ulong)_UNK_002dde63 >> 0x28);
    uStack_c1 = (undefined1)((ulong)_UNK_002dde63 >> 0x30);
    uStack_c0 = (undefined1)((ulong)_UNK_002dde63 >> 0x38);
    uStack_cf = (undefined5)_DAT_002dde5b;
    uStack_ca = (undefined1)((ulong)_DAT_002dde5b >> 0x28);
    uStack_c9 = (undefined1)((ulong)_DAT_002dde5b >> 0x30);
    uStack_c8 = (undefined1)((ulong)_DAT_002dde5b >> 0x38);
    uStack_b8 = uStack_b8 & 0xffffffffffff0000;
    uStack_9c = 1;
    FUN_008f8218(&pbStack_1d0,&plStack_100);
    if ((uStack_b8 & 1) != 0) {
      _ZdlPv(puStack_a8);
    }
    if ((bStack_d0 & 1) != 0) {
      _ZdlPv(CONCAT26(uStack_ba,
                      CONCAT15(uStack_bb,
                               CONCAT14(uStack_bc,
                                        CONCAT13(uStack_bd,
                                                 CONCAT12(uStack_be,CONCAT11(uStack_bf,uStack_c0))))
                              )));
    }
    if ((bStack_e8 & 1) != 0) {
      _ZdlPv(uStack_d8);
    }
    if (((ulong)plStack_100 & 1) != 0) {
      _ZdlPv(plStack_f0);
    }
  }
LAB_008eed90:
  if (iVar11 == 2) {
    uVar17 = FUN_0076d5c0(&uStack_98,&DAT_002f3174);
    if ((uVar17 & 1) != 0) {
      if (0 < uStack_168._4_4_) {
        lVar25 = 0;
        lVar13 = 0;
        do {
          uVar17 = FUN_0076b7e4(lStack_170 + lVar25,&DAT_002cf9d9);
          if ((uVar17 & 1) != 0) {
            if (-1 < (int)lVar13) goto LAB_008eeed4;
            break;
          }
          lVar13 = lVar13 + 1;
          lVar25 = lVar25 + 0x10;
        } while (lVar13 < uStack_168._4_4_);
      }
      plStack_f8 = (long *)((ulong)plStack_f8 & 0xffffffffffffff);
      uStack_e1 = 0;
      *puVar38 = CONCAT26(DAT_002da515._6_2_,(undefined6)DAT_002da515);
      plStack_100 = (long *)CONCAT71(plStack_100._1_7_,0x1c);
      *(ulong *)((long)puVar38 + 6) = CONCAT62(_UNK_002da51d,DAT_002da515._6_2_);
      bStack_e8 = 0xc;
      uStack_c2 = 0;
      uStack_e7 = 0x6d616853;
      uStack_e3 = 0x61;
      uStack_e2 = 0x6e;
      uStack_b8 = uStack_b8 & 0xffffffffffff0000;
      uStack_cf = (undefined5)DAT_002dde70;
      bStack_d0 = 0x1a;
      uStack_ca = (undefined1)DAT_002dde70._5_3_;
      uStack_c9 = (undefined1)((uint3)DAT_002dde70._5_3_ >> 8);
      uStack_c8 = (undefined1)((uint3)DAT_002dde70._5_3_ >> 0x10);
      uStack_c7 = (undefined1)_UNK_002dde78;
      uStack_c6 = (undefined1)((uint5)_UNK_002dde78 >> 8);
      uStack_c5 = (undefined1)((uint5)_UNK_002dde78 >> 0x10);
      uStack_c4 = (undefined1)((uint5)_UNK_002dde78 >> 0x18);
      uStack_c3 = (undefined1)((uint5)_UNK_002dde78 >> 0x20);
      uStack_a0 = 1;
      uStack_9c = 0;
      FUN_008f8218(&pbStack_1d0,&plStack_100);
      if ((uStack_b8 & 1) != 0) {
        _ZdlPv(puStack_a8);
      }
      if ((bStack_d0 & 1) != 0) {
        _ZdlPv(CONCAT26(uStack_ba,
                        CONCAT15(uStack_bb,
                                 CONCAT14(uStack_bc,
                                          CONCAT13(uStack_bd,
                                                   CONCAT12(uStack_be,CONCAT11(uStack_bf,uStack_c0))
                                                  )))));
      }
      if ((bStack_e8 & 1) != 0) {
        _ZdlPv(uStack_d8);
      }
      if (((ulong)plStack_100 & 1) != 0) {
        _ZdlPv(plStack_f0);
      }
LAB_008eeed4:
      if (0 < uStack_168._4_4_) {
        lVar25 = 0;
        lVar13 = 0;
        do {
          uVar17 = FUN_0076b7e4(lStack_170 + lVar25,&DAT_002e8897);
          if ((uVar17 & 1) != 0) {
            if (-1 < (int)lVar13) goto LAB_008ef004;
            break;
          }
          lVar13 = lVar13 + 1;
          lVar25 = lVar25 + 0x10;
        } while (lVar13 < uStack_168._4_4_);
      }
      uVar43 = DAT_002d3325;
      plStack_100 = (long *)CONCAT71(plStack_100._1_7_,0x18);
      *(undefined4 *)(puVar38 + 1) = 0x6f625f72;
      *puVar38 = uVar43;
      bStack_e8 = 0xe;
      plStack_f8._0_6_ = (uint6)(uint5)plStack_f8;
      uStack_e0 = 0;
      uStack_e7 = 0x44776f42;
      uStack_e3 = 0x75;
      uStack_e2 = 100;
      uStack_e1 = 0x65;
      uStack_c1 = 0;
      uStack_cf = (undefined5)(undefined6)DAT_002fab6e;
      uStack_ca = (undefined1)((uint6)(undefined6)DAT_002fab6e >> 0x28);
      bStack_d0 = 0x1c;
      uStack_c9 = (undefined1)DAT_002fab6e._6_2_;
      uStack_c8 = (undefined1)((ushort)DAT_002fab6e._6_2_ >> 8);
      uStack_c7 = (undefined1)_UNK_002fab76;
      uStack_c6 = (undefined1)((uint6)_UNK_002fab76 >> 8);
      uStack_c5 = (undefined1)((uint6)_UNK_002fab76 >> 0x10);
      uStack_c4 = (undefined1)((uint6)_UNK_002fab76 >> 0x18);
      uStack_c3 = (undefined1)((uint6)_UNK_002fab76 >> 0x20);
      uStack_c2 = (undefined1)((uint6)_UNK_002fab76 >> 0x28);
      uStack_b8 = uStack_b8 & 0xffffffffffff0000;
      uStack_a0 = 1;
      uStack_9c = 0;
      FUN_008f8218(&pbStack_1d0,&plStack_100);
      if ((uStack_b8 & 1) != 0) {
        _ZdlPv(puStack_a8);
      }
      if ((bStack_d0 & 1) != 0) {
        _ZdlPv(CONCAT26(uStack_ba,
                        CONCAT15(uStack_bb,
                                 CONCAT14(uStack_bc,
                                          CONCAT13(uStack_bd,
                                                   CONCAT12(uStack_be,CONCAT11(uStack_bf,uStack_c0))
                                                  )))));
      }
      if ((bStack_e8 & 1) != 0) {
        _ZdlPv(uStack_d8);
      }
      if (((ulong)plStack_100 & 1) != 0) {
        _ZdlPv(plStack_f0);
      }
LAB_008ef004:
      if (0 < uStack_168._4_4_) {
        lVar25 = 0;
        lVar13 = 0;
        do {
          uVar17 = FUN_0076b7e4(lStack_170 + lVar25,&DAT_002efa8d);
          if ((uVar17 & 1) != 0) {
            if (-1 < (int)lVar13) goto LAB_008ef134;
            break;
          }
          lVar13 = lVar13 + 1;
          lVar25 = lVar25 + 0x10;
        } while (lVar13 < uStack_168._4_4_);
      }
      plStack_f8 = (long *)((ulong)plStack_f8 & 0xffffffffffffff);
      uStack_e2 = 0;
      *puVar38 = CONCAT26(DAT_002a7fdf._6_2_,(undefined6)DAT_002a7fdf);
      plStack_100 = (long *)CONCAT71(plStack_100._1_7_,0x1c);
      *(ulong *)((long)puVar38 + 6) = CONCAT62(_UNK_002a7fe7,DAT_002a7fdf._6_2_);
      bStack_e8 = 10;
      uStack_c7 = 0x61;
      uStack_c6 = 0x75;
      uStack_c5 = 0x6c;
      uStack_c4 = 0x74;
      uStack_e7 = 0x6a6e694e;
      uStack_e3 = 0x61;
      bStack_d0 = 0x18;
      uStack_c3 = 0;
      uStack_b8 = uStack_b8 & 0xffffffffffff0000;
      uStack_cf = (undefined5)DAT_00302195;
      uStack_ca = (undefined1)((ulong)DAT_00302195 >> 0x28);
      uStack_c9 = (undefined1)((ulong)DAT_00302195 >> 0x30);
      uStack_c8 = (undefined1)((ulong)DAT_00302195 >> 0x38);
      uStack_a0 = 0x14;
      uStack_9c = 1;
      FUN_008f8218(&pbStack_1d0,&plStack_100);
      if ((uStack_b8 & 1) != 0) {
        _ZdlPv(puStack_a8);
      }
      if ((bStack_d0 & 1) != 0) {
        _ZdlPv(CONCAT26(uStack_ba,
                        CONCAT15(uStack_bb,
                                 CONCAT14(uStack_bc,
                                          CONCAT13(uStack_bd,
                                                   CONCAT12(uStack_be,CONCAT11(uStack_bf,uStack_c0))
                                                  )))));
      }
      if ((bStack_e8 & 1) != 0) {
        _ZdlPv(uStack_d8);
      }
      if (((ulong)plStack_100 & 1) != 0) {
        _ZdlPv(plStack_f0);
      }
    }
LAB_008ef134:
    uVar17 = FUN_0076d5c0(&uStack_98,&DAT_002c0b6b);
    if ((uVar17 & 1) != 0) {
      if (0 < uStack_168._4_4_) {
        lVar25 = 0;
        lVar13 = 0;
        do {
          uVar17 = FUN_0076b7e4(lStack_170 + lVar25,&DAT_002efa93);
          if ((uVar17 & 1) != 0) {
            if (-1 < (int)lVar13) goto LAB_008ef264;
            break;
          }
          lVar13 = lVar13 + 1;
          lVar25 = lVar25 + 0x10;
        } while (lVar13 < uStack_168._4_4_);
      }
      uVar46 = DAT_002efa93;
      uVar43 = _DAT_002b9956;
      bStack_e8 = 0x12;
      puVar38[1] = _UNK_002b995e;
      *puVar38 = uVar43;
      plStack_100 = (long *)CONCAT71(plStack_100._1_7_,0x20);
      uStack_e7 = (undefined4)uVar46;
      uStack_e3 = (undefined1)((ulong)uVar46 >> 0x20);
      uStack_e2 = (undefined1)((ulong)uVar46 >> 0x28);
      uStack_e1 = (undefined1)((ulong)uVar46 >> 0x30);
      uStack_e0 = (undefined1)((ulong)uVar46 >> 0x38);
      plStack_f0._0_2_ = (ushort)(byte)plStack_f0;
      uStack_a0 = 0x14;
      uStack_df = 0x6e;
      uStack_de = 0;
      bStack_d0 = 0x20;
      uStack_c7 = (undefined1)_UNK_002e132b;
      uStack_c6 = (undefined1)((ulong)_UNK_002e132b >> 8);
      uStack_c5 = (undefined1)((ulong)_UNK_002e132b >> 0x10);
      uStack_c4 = (undefined1)((ulong)_UNK_002e132b >> 0x18);
      uStack_c3 = (undefined1)((ulong)_UNK_002e132b >> 0x20);
      uStack_c2 = (undefined1)((ulong)_UNK_002e132b >> 0x28);
      uStack_c1 = (undefined1)((ulong)_UNK_002e132b >> 0x30);
      uStack_c0 = (undefined1)((ulong)_UNK_002e132b >> 0x38);
      uStack_cf = (undefined5)_DAT_002e1323;
      uStack_ca = (undefined1)((ulong)_DAT_002e1323 >> 0x28);
      uStack_c9 = (undefined1)((ulong)_DAT_002e1323 >> 0x30);
      uStack_c8 = (undefined1)((ulong)_DAT_002e1323 >> 0x38);
      uStack_bf = 0;
      uStack_b8 = uStack_b8 & 0xffffffffffff0000;
      uStack_9c = 1;
      FUN_008f8218(&pbStack_1d0,&plStack_100);
      if ((uStack_b8 & 1) != 0) {
        _ZdlPv(puStack_a8);
      }
      if ((bStack_d0 & 1) != 0) {
        _ZdlPv(CONCAT26(uStack_ba,
                        CONCAT15(uStack_bb,
                                 CONCAT14(uStack_bc,
                                          CONCAT13(uStack_bd,
                                                   CONCAT12(uStack_be,CONCAT11(uStack_bf,uStack_c0))
                                                  )))));
      }
      if ((bStack_e8 & 1) != 0) {
        _ZdlPv(uStack_d8);
      }
      if (((ulong)plStack_100 & 1) != 0) {
        _ZdlPv(plStack_f0);
      }
    }
  }
LAB_008ef264:
  uVar17 = FUN_0076d5c0(&uStack_98,&DAT_002cb961);
  if ((((uVar17 & 1) != 0) && (lVar13 = FUN_00df5044(), lVar13 != 0)) &&
     (lVar13 = FUN_00df5044(), *(int *)(*(long *)(lVar13 + 0x28) + 0x124) == 0x17)) {
    FUN_0076ae58(&plStack_100,&DAT_002ec007);
    uVar17 = uStack_198;
    if (uStack_198 < uStack_190) {
      FUN_0076af5c(uStack_198,&plStack_100);
      uStack_198 = uVar17 + 0x10;
    }
    else {
      uStack_198 = FUN_0062f690(&uStack_1a0,&plStack_100);
    }
    FUN_0076ad48(&plStack_100);
    FUN_0076ae58(&plStack_100,&DAT_002e4e99);
    uVar17 = uStack_198;
    if (uStack_198 < uStack_190) {
      FUN_0076af5c(uStack_198,&plStack_100);
      uStack_198 = uVar17 + 0x10;
    }
    else {
      uStack_198 = FUN_0062f690(&uStack_1a0,&plStack_100);
    }
    FUN_0076ad48(&plStack_100);
    FUN_0076ae58(&plStack_100,&DAT_002c0b8a);
    uVar17 = uStack_198;
    if (uStack_198 < uStack_190) {
      FUN_0076af5c(uStack_198,&plStack_100);
      uStack_198 = uVar17 + 0x10;
    }
    else {
      uStack_198 = FUN_0062f690(&uStack_1a0,&plStack_100);
    }
    FUN_0076ad48(&plStack_100);
    FUN_0076ae58(&plStack_100,&DAT_002b9967);
    uVar17 = uStack_198;
    if (uStack_198 < uStack_190) {
      FUN_0076af5c(uStack_198,&plStack_100);
      uStack_198 = uVar17 + 0x10;
    }
    else {
      uStack_198 = FUN_0062f690(&uStack_1a0,&plStack_100);
    }
    FUN_0076ad48(&plStack_100);
  }
  uVar17 = FUN_0076d704(&uStack_98,&DAT_002b9975);
  if ((((uVar17 & 1) != 0) && (lVar13 = FUN_00df5044(), lVar13 != 0)) &&
     (lVar13 = FUN_00df5044(), *(int *)(*(long *)(lVar13 + 0x28) + 0x124) != 0xb)) {
    FUN_0076ae58(&plStack_100,&DAT_002ec010);
    uVar17 = uStack_198;
    if (uStack_198 < uStack_190) {
      FUN_0076af5c(uStack_198,&plStack_100);
      uStack_198 = uVar17 + 0x10;
    }
    else {
      uStack_198 = FUN_0062f690(&uStack_1a0,&plStack_100);
    }
    FUN_0076ad48(&plStack_100);
  }
  uVar17 = FUN_0076d704(&uStack_98,&DAT_002ec027);
  if ((uVar17 & 1) != 0) {
    lVar13 = FUN_00df5044();
    puVar39 = puStack_128;
    puVar20 = puStack_130;
    if (lVar13 != 0) {
      for (; puVar20 != puVar39; puVar20 = puVar20 + 2) {
        FUN_008f5b3c(puVar20);
      }
    }
  }
  FUN_0076ad48(&uStack_98);
  puVar29 = puVar29 + 2;
  if (puVar29 == puVar36) goto LAB_008ef4a0;
  goto LAB_008ed4ec;
  while( true ) {
    lVar13 = lVar13 + 1;
    lVar25 = lVar25 + 0x10;
    if (uStack_168._4_4_ <= lVar13) break;
LAB_008ee2a0:
    uVar17 = FUN_0076b7e4(lStack_170 + lVar25,&DAT_002f315d);
    if ((uVar17 & 1) != 0) {
      if (-1 < (int)lVar13) goto LAB_008ee34c;
      break;
    }
  }
  goto LAB_008ee304;
LAB_008ef4a0:
  puVar36 = puStack_110;
  goto LAB_008ef4ac;
}



/* 00aa3374 FUN_00aa3374; mode=decompile_60_seconds */

/* WARNING: Type propagation algorithm not settling */
/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_00aa3374(long *param_1)

{
  bool bVar1;
  char *pcVar2;
  int iVar3;
  undefined8 *puVar4;
  long *plVar5;
  int iVar6;
  int iVar7;
  int iVar8;
  undefined4 uVar9;
  long lVar10;
  long lVar11;
  ulong uVar12;
  long lVar13;
  long *plVar14;
  undefined8 *puVar15;
  undefined8 *puVar16;
  undefined8 *puVar17;
  undefined8 *puVar18;
  undefined8 uVar19;
  undefined8 uVar20;
  undefined8 uVar21;
  long lVar22;
  undefined *puVar23;
  ulong uVar24;
  int iVar25;
  long lVar26;
  long *plVar27;
  undefined4 uVar28;
  uint uVar29;
  ulong uVar30;
  long *plVar31;
  ulong uVar32;
  uint uVar33;
  undefined8 uVar34;
  uint uVar35;
  undefined8 *puVar36;
  long *plVar37;
  long *plVar38;
  bool bVar39;
  undefined8 *puVar40;
  long *plVar41;
  ulong uVar42;
  long *plVar43;
  long lVar44;
  float fVar45;
  float fVar46;
  long lVar47;
  float fVar48;
  float fVar49;
  int iStack_470;
  long lStack_468;
  undefined1 auStack_460 [8];
  long *plStack_458;
  long lStack_450;
  long *plStack_448;
  long lStack_440;
  long *plStack_438;
  undefined1 auStack_430 [16];
  undefined8 uStack_420;
  undefined8 uStack_418;
  long lStack_410;
  undefined8 uStack_408;
  undefined8 uStack_400;
  long lStack_3f8;
  long lStack_3f0;
  long *plStack_3e8;
  long lStack_3e0;
  undefined8 uStack_3d8;
  undefined *puStack_3d0;
  undefined8 uStack_3c8;
  long lStack_3c0;
  undefined5 uStack_3b8;
  undefined3 uStack_3b3;
  undefined5 uStack_3b0;
  undefined3 uStack_3ab;
  long lStack_3a8;
  long lStack_3a0;
  undefined8 uStack_398;
  undefined4 uStack_390;
  undefined1 uStack_38c;
  undefined1 uStack_388;
  undefined4 uStack_384;
  undefined2 uStack_380;
  undefined1 uStack_36c;
  undefined8 uStack_368;
  undefined7 uStack_360;
  undefined1 uStack_359;
  undefined1 uStack_358;
  undefined2 uStack_357;
  undefined8 uStack_350;
  long *plStack_348;
  undefined4 uStack_340;
  undefined1 uStack_33c;
  undefined1 uStack_32c;
  undefined8 uStack_328;
  undefined1 auStack_320 [16];
  char cStack_310;
  undefined1 uStack_308;
  undefined8 uStack_300;
  undefined1 uStack_2f8;
  long lStack_2f0;
  long lStack_2e8;
  undefined8 uStack_2e0;
  undefined1 uStack_2d8;
  undefined4 uStack_2d4;
  undefined1 auStack_2d0 [16];
  undefined5 uStack_2c0;
  undefined3 uStack_2bb;
  undefined5 uStack_2b8;
  undefined1 uStack_2b0;
  undefined1 uStack_2ac;
  undefined1 uStack_2a8;
  undefined1 uStack_2a4;
  undefined8 uStack_2a0;
  undefined8 uStack_298;
  undefined8 uStack_290;
  undefined8 uStack_288;
  undefined8 uStack_280;
  undefined8 uStack_278;
  undefined1 uStack_270;
  long *plStack_268;
  char cStack_260;
  undefined1 uStack_258;
  undefined8 uStack_250;
  undefined8 uStack_248;
  undefined8 uStack_240;
  long alStack_230 [4];
  long *plStack_210;
  undefined8 uStack_200;
  undefined *puStack_1f8;
  undefined1 uStack_1f0;
  undefined8 uStack_1e8;
  undefined8 uStack_1e0;
  undefined5 uStack_1d8;
  undefined3 uStack_1d3;
  undefined5 uStack_1d0;
  undefined1 uStack_18c;
  undefined8 uStack_188;
  undefined7 uStack_180;
  undefined4 uStack_179;
  undefined8 uStack_170;
  long *plStack_168;
  undefined4 uStack_160;
  undefined1 uStack_15c;
  undefined1 uStack_14c;
  undefined8 uStack_148;
  undefined1 auStack_140 [16];
  char cStack_130;
  undefined1 uStack_128;
  undefined8 uStack_120;
  undefined1 uStack_118;
  long lStack_110;
  long lStack_108;
  undefined8 uStack_100;
  undefined1 uStack_f8;
  undefined4 uStack_f4;
  undefined1 auStack_f0 [16];
  undefined5 uStack_e0;
  undefined3 uStack_db;
  undefined5 uStack_d8;
  undefined1 uStack_d0;
  undefined1 uStack_cc;
  undefined1 uStack_c8;
  undefined1 uStack_c4;
  undefined8 auStack_c0 [2];
  long lStack_b0;
  long *plStack_a8;
  undefined1 auStack_a0 [4];
  int iStack_9c;
  
  lVar44 = *(long *)(*(long *)(*(long *)(*(long *)(*(long *)param_1[0x37] +
                                                  (long)(int)param_1[0x36] * 8) + 0x10) +
                              (long)*(int *)((long)param_1 + 0x1b4) * 8) + 0x20);
  lVar10 = FUN_00eecc40(lVar44);
  iVar6 = FUN_00eeccb0(lVar44);
  lVar11 = FUN_00e01b60();
  if (lVar11 == 0) {
    iStack_470 = 1;
    FUN_0076aa74(auStack_a0);
joined_r0x00aa3890:
    bVar1 = false;
    lStack_468 = 0;
    if (iVar6 < 0xd) goto LAB_00aa342c;
LAB_00aa34e0:
    if (0x10 < iVar6) {
      if (iVar6 == 0x11) {
        FUN_0076ae58(&lStack_3e0,&DAT_002ba506);
        plVar14 = alStack_230;
        cStack_260 = '\0';
        uStack_258 = 0;
        uStack_298 = 0;
        uStack_2a0 = 0;
        uStack_288 = 0;
        uStack_290 = 0;
        uStack_278 = 0;
        uStack_280 = 0;
        uStack_270 = 0;
        plStack_210 = (long *)0x0;
        uStack_240 = 0;
        uStack_250 = 0;
        uStack_248 = 0;
        FUN_00e74970(&uStack_408,&lStack_3e0,&uStack_2a0);
        param_1[0x8e] = (long)uStack_408;
        if (plStack_210 == plVar14) {
          lVar11 = 4;
LAB_00aa4120:
          (**(code **)(*plVar14 + lVar11 * 8))();
        }
        else if (plStack_210 != (long *)0x0) {
          lVar11 = 5;
          plVar14 = plStack_210;
          goto LAB_00aa4120;
        }
        if (((cStack_260 != '\0') && (plStack_268 != (long *)0x0)) &&
           (lVar11 = FUN_0129eb20(0xffffffffffffffff,plStack_268 + 1), lVar11 == 0)) {
          (**(code **)(*plStack_268 + 0x10))(plStack_268);
          _ZNSt6__ndk119__shared_weak_count14__release_weakEv(plStack_268);
        }
        FUN_0076ad48(&lStack_3e0);
        if (*(char *)(param_1[0x8e] + 0x668) == '\0') {
          FUN_00aae4e8(param_1,1);
          goto LAB_00aa744c;
        }
        iVar7 = FUN_00e9026c(lStack_468,lVar44);
        lVar11 = param_1[0x8e];
        FUN_0076ae58(&lStack_3e0,&DAT_002f3ba4);
        FUN_0076dbb8(&uStack_408,iVar7 + 10);
        FUN_00e75f6c(lVar11,&lStack_3e0,&uStack_408,1);
        FUN_0076ad48(&uStack_408);
        FUN_0076ad48(&lStack_3e0);
        lVar11 = param_1[0x8e];
        FUN_0076ae58(&lStack_3e0,&DAT_002fb414);
        lVar11 = FUN_00e7bc7c(lVar11,&lStack_3e0,1);
        FUN_0076ad48(&lStack_3e0);
        if (lVar11 != 0) {
          FUN_006d7b48(lVar11,0,*(short *)(lVar11 + 0xbe) + -1,0);
        }
        lVar11 = param_1[0x8e];
        FUN_0076ae58(&lStack_3e0,&DAT_002a4167);
        lVar11 = FUN_00e7bc7c(lVar11,&lStack_3e0,1);
        FUN_0076ad48(&lStack_3e0);
        if (lVar11 != 0) {
          FUN_006d7b48(lVar11,0,*(short *)(lVar11 + 0xbe) + -1,0);
        }
        lVar11 = *(long *)(*(long *)(*(long *)(*(long *)(*(long *)param_1[0x37] +
                                                        (long)(int)param_1[0x36] * 8) + 0x10) +
                                    (long)*(int *)((long)param_1 + 0x1b4) * 8) + 0x10);
        if (lVar11 == 0) {
          lVar11 = FUN_00ef0b28(lVar10);
        }
        uStack_3d8 = &DAT_002efe88;
        lStack_3e0 = 0x900000009;
        uStack_36c = 0;
        uStack_360 = 0x3e4ccccd;
        lStack_3c0 = 0;
        uStack_3b8 = 0;
        puStack_3d0 = (undefined *)CONCAT71(puStack_3d0._1_7_,1);
        uStack_3c8 = 0;
        uStack_3b3 = 0;
        uStack_3b0 = 0;
        uStack_368 = DAT_00305928;
        uStack_350 = 0;
        plStack_348 = (long *)0x0;
        uStack_359 = 0;
        uStack_358 = 0;
        uStack_357 = 0;
        uStack_340 = 5;
        uStack_33c = 0;
        uStack_32c = 0;
        uStack_328 = 0;
        auStack_320[0] = 0;
        cStack_310 = '\0';
        uStack_308 = 0;
        uStack_300 = 0;
        uStack_2f8 = 0;
        uStack_2d4 = 0;
        lStack_2f0 = 0;
        lStack_2e8 = 0;
        uStack_2d8 = 0;
        uStack_2e0 = 0;
        FUN_0076ae58(auStack_2d0,&DAT_002aadd1);
        lVar26 = param_1[0x8e];
        uStack_2b0 = 0;
        uStack_2ac = 0;
        uStack_2a8 = 0;
        uStack_2a4 = 0;
        uStack_2b8 = 0;
        uStack_2c0 = 0;
        uStack_2bb = 0;
        uStack_358 = 1;
        FUN_0076ae58(&uStack_408,&DAT_002cf8e8);
        FUN_00e7ab94(lVar26,&uStack_408,lVar11,&lStack_3e0);
        FUN_0076ad48(&uStack_408);
        lVar13 = param_1[0x8e];
        lVar26 = *(long *)(lVar13 + 0x510);
        if (lVar26 == 0) {
          lVar26 = *(long *)(lVar13 + 0x518);
        }
        else {
          *(long *)(lVar13 + 0x518) = lVar26;
          *(undefined8 *)(lVar13 + 0x510) = 0;
        }
        param_1[0x40] = lVar26;
        FUN_00cd20a8(0x3fa66666,lVar11);
        if ((((int)param_1[0x36] < *(int *)(param_1[0x37] + 0xc)) &&
            (lVar11 = *(long *)(*(long *)param_1[0x37] + (long)(int)param_1[0x36] * 8), lVar11 != 0)
            ) && (*(int *)((long)param_1 + 0x1b4) < *(int *)(lVar11 + 0x1c))) {
          uVar34 = *(undefined8 *)
                    (*(long *)(lVar11 + 0x10) + (long)*(int *)((long)param_1 + 0x1b4) * 8);
        }
        else {
          uVar34 = 0;
        }
        FUN_00ab0a38(0x3f4ccccd,uVar34);
        FUN_0076ad48(auStack_2d0);
        if (lStack_2f0 != 0) {
          lStack_2e8 = lStack_2f0;
          _ZdlPv();
        }
        if (cStack_310 != '\0') {
          FUN_0076ad48(auStack_320);
        }
        plVar14 = plStack_348;
        if ((plStack_348 == (long *)0x0) ||
           (lVar11 = FUN_0129eb20(0xffffffffffffffff,plStack_348 + 1), lVar11 != 0))
        goto LAB_00aa5668;
        (**(code **)(*plVar14 + 0x10))(plVar14);
        _ZNSt6__ndk119__shared_weak_count14__release_weakEv(plVar14);
        lVar11 = param_1[0x40];
      }
      else {
        if (iVar6 != 0x13) goto LAB_00aa3b98;
        plVar14 = (long *)param_1[0x3b];
        plVar41 = (long *)param_1[0x3c];
        if (plVar14 != plVar41) {
          do {
            lVar11 = *plVar14;
            if (lVar11 != 0) {
              FUN_00de9884(lVar11);
              _ZdlPv(lVar11);
            }
            plVar14 = plVar14 + 1;
          } while (plVar14 != plVar41);
          plVar14 = (long *)param_1[0x3b];
        }
        param_1[0x3c] = (long)plVar14;
        FUN_00e01b60();
        uVar34 = FUN_00e02588();
        iVar7 = FUN_00e8f66c(uVar34,0x22,lVar44);
        puVar23 = &DAT_00302cae;
        if (iVar7 != 2) {
          puVar23 = &DAT_002f3bb0;
        }
        FUN_0076ae58(&lStack_3e0,puVar23);
        FUN_0076ae58(&uStack_408,&DAT_002a3e1b);
        lVar11 = FUN_00e175b0(&uStack_408,&lStack_3e0,0);
        param_1[0x40] = lVar11;
        FUN_0076ad48(&uStack_408);
        FUN_00eecc40(lVar44);
        lVar11 = FUN_00f193c0();
        iVar7 = FUN_00b7f768(*(undefined4 *)(lVar11 + 0x10c));
        FUN_006d79c8(param_1[0x40],&DAT_002fb41e,&DAT_002927e2,0);
        *(undefined1 *)((long)param_1 + 0x2ec) = 1;
        lVar11 = FUN_006d8874(param_1[0x40],&DAT_002a4ad1);
        if (lVar11 != 0) {
          FUN_006d7c30(lVar11,iVar7);
        }
        uStack_408 = (undefined8 *)0x0;
        uStack_400 = (undefined8 *)0x0;
        FUN_00f19fb0(&uStack_408,*(undefined4 *)(lVar44 + 0x10c));
        if (0 < (int)uStack_400._4_4_) {
          uVar9 = rand();
          FUN_006f995c(auStack_c0,uVar9);
          uVar42 = (ulong)(uint)uStack_400._4_4_;
          if (1 < (int)uStack_400._4_4_) {
            do {
              uVar12 = FUN_006f9a28(auStack_c0,uVar42 & 0xffffffff);
              uVar12 = -(uVar12 >> 0x1f & 1) & 0xfffffff800000000 | (uVar12 & 0xffffffff) << 3;
              uVar34 = uStack_408[uVar42 - 1];
              uStack_408[uVar42 - 1] = *(undefined8 *)((long)uStack_408 + uVar12);
              *(undefined8 *)((long)uStack_408 + uVar12) = uVar34;
              bVar39 = 2 < uVar42;
              uVar42 = uVar42 - 1;
            } while (bVar39);
          }
          iVar8 = rand();
          iVar25 = 0;
          plVar14 = param_1 + 0x85;
          do {
            lVar11 = param_1[0x40];
            FUN_0076da2c(&uStack_420,&DAT_002f3bc6,iVar25);
            puVar40 = &uStack_418;
            if (7 < (int)uStack_420._4_4_) {
              puVar40 = uStack_418;
            }
            lVar11 = FUN_00e49fdc(lVar11,puVar40,0,0,0,0,0);
            FUN_0076ad48(&uStack_420);
            if ((lVar11 != 0) &&
               (lVar11 = FUN_00e49fdc(lVar11,&DAT_00302590,0,0,0,0,0), lVar11 != 0)) {
              iVar3 = 0;
              if (uStack_400._4_4_ != 0.0) {
                iVar3 = iVar25 / (int)uStack_400._4_4_;
              }
              lVar26 = lVar44;
              if (iVar25 != iVar8 % 3 + 1 && iVar25 != 0) {
                lVar26 = uStack_408[(uint)(iVar25 - iVar3 * (int)uStack_400._4_4_)];
              }
              FUN_00eecc40(lVar26);
              lVar26 = FUN_00ef0b28();
              uStack_420 = (undefined8 *)0x0;
              uStack_418 = (undefined8 *)0x0;
              FUN_00695378(lVar11,0,&uStack_420,0);
              uVar34 = FUN_00f6547c(*(undefined8 *)(lVar26 + 0x98));
              lStack_3f0 = param_1[0x34];
              plStack_3e8 = (long *)param_1[0x35];
              fVar48 = (float)uStack_418;
              fVar49 = uStack_418._4_4_;
              fVar45 = (float)uStack_420;
              fVar46 = uStack_420._4_4_;
              if (plStack_3e8 != (long *)0x0) {
                FUN_0129eac0(1,plStack_3e8 + 1);
              }
              uVar34 = FUN_008d2af4(fVar48 - fVar45,fVar49 - fVar46,5,uVar34,lVar26,&lStack_3f0,0,1,
                                    0,1,0);
              plVar41 = plStack_3e8;
              if ((plStack_3e8 != (long *)0x0) &&
                 (lVar26 = FUN_0129eb20(0xffffffffffffffff,plStack_3e8 + 1), lVar26 == 0)) {
                (**(code **)(*plVar41 + 0x10))(plVar41);
                _ZNSt6__ndk119__shared_weak_count14__release_weakEv(plVar41);
              }
              FUN_00694130(lVar11,uVar34);
              FUN_008cb32c(0xbf800000,uVar34,7,7);
              FUN_008c6cfc(0,uVar34,0,0);
              puVar40 = (undefined8 *)param_1[0x86];
              if (puVar40 < (undefined8 *)param_1[0x87]) {
                puVar15 = puVar40 + 1;
                *puVar40 = uVar34;
              }
              else {
                puVar18 = (undefined8 *)*plVar14;
                lVar11 = (long)puVar40 - (long)puVar18 >> 3;
                uVar42 = lVar11 + 1;
                if (uVar42 >> 0x3d != 0) {
                    /* WARNING: Subroutine does not return */
                  FUN_008d34e0(plVar14);
                }
                uVar30 = param_1[0x87] - (long)puVar18;
                uVar12 = (long)uVar30 >> 2;
                if (uVar12 <= uVar42) {
                  uVar12 = uVar42;
                }
                if (0x7ffffffffffffff7 < uVar30) {
                  uVar12 = 0x1fffffffffffffff;
                }
                if (uVar12 == 0) {
                  lVar26 = 0;
                  puVar17 = (undefined8 *)(lVar11 * 8);
                  lVar11 = (long)puVar40 - (long)puVar18;
                  puVar15 = puVar17 + 1;
                  *puVar17 = uVar34;
                  puVar16 = puVar17;
                  if (lVar11 != 0) goto LAB_00aa3f84;
                }
                else {
                  if (uVar12 >> 0x3d != 0) goto LAB_00aa7ebc;
                  lVar26 = _Znwm(uVar12 << 3);
                  puVar17 = (undefined8 *)(lVar26 + lVar11 * 8);
                  lVar11 = (long)puVar40 - (long)puVar18;
                  puVar15 = puVar17 + 1;
                  *puVar17 = uVar34;
                  puVar16 = puVar17;
                  if (lVar11 != 0) {
LAB_00aa3f84:
                    puVar17 = puVar16;
                    if ((lVar11 - 8U < 0x38) ||
                       ((ulong)((long)puVar40 + (-((long)puVar40 - (long)puVar18) - lVar26)) < 0x20)
                       ) {
LAB_00aa4040:
                      do {
                        puVar40 = puVar40 + -1;
                        puVar17 = puVar17 + -1;
                        *puVar17 = *puVar40;
                      } while (puVar40 != puVar18);
                    }
                    else {
                      puVar36 = puVar40 + -2;
                      uVar42 = (lVar11 - 8U >> 3) + 1;
                      uVar24 = uVar42 & 0x3ffffffffffffffc;
                      puVar40 = puVar40 + -uVar24;
                      puVar17 = puVar16 + -uVar24;
                      puVar16 = puVar16 + -2;
                      uVar30 = uVar24;
                      do {
                        puVar4 = puVar36 + -1;
                        uVar20 = puVar36[-2];
                        uVar19 = puVar36[1];
                        uVar34 = *puVar36;
                        uVar30 = uVar30 - 4;
                        puVar36 = puVar36 + -4;
                        puVar16[-1] = *puVar4;
                        puVar16[-2] = uVar20;
                        puVar16[1] = uVar19;
                        *puVar16 = uVar34;
                        puVar16 = puVar16 + -4;
                      } while (uVar30 != 0);
                      if (uVar42 != uVar24) goto LAB_00aa4040;
                    }
                    puVar40 = (undefined8 *)*plVar14;
                  }
                }
                param_1[0x85] = (long)puVar17;
                param_1[0x86] = (long)puVar15;
                param_1[0x87] = lVar26 + uVar12 * 8;
                if (puVar40 != (undefined8 *)0x0) {
                  _ZdlPv(puVar40);
                }
              }
              param_1[0x86] = (long)puVar15;
            }
            iVar25 = iVar25 + 1;
          } while (iVar25 != 4);
        }
        lVar11 = FUN_006d8874(param_1[0x40],&DAT_002e1d4a);
        if (lVar11 != 0) {
          FUN_0076da2c(&uStack_420,&DAT_002dafe8,1);
          FUN_006d8fd4(lVar11,&uStack_420,iVar7 == 0);
          if ((iVar7 == 0) && (lVar26 = FUN_006d87b8(lVar11,&uStack_420), lVar26 != 0)) {
            uVar34 = _Znwm(0x30);
            FUN_00de969c(uVar34,lVar26);
            puVar40 = (undefined8 *)param_1[0x3c];
            if (puVar40 < (undefined8 *)param_1[0x3d]) {
              puVar16 = puVar40 + 1;
              *puVar40 = uVar34;
            }
            else {
              puVar15 = (undefined8 *)param_1[0x3b];
              lVar26 = (long)puVar40 - (long)puVar15 >> 3;
              uVar42 = lVar26 + 1;
              if (uVar42 >> 0x3d != 0) goto LAB_00aa7ed8;
              uVar30 = param_1[0x3d] - (long)puVar15;
              uVar12 = (long)uVar30 >> 2;
              if (uVar12 <= uVar42) {
                uVar12 = uVar42;
              }
              if (0x7ffffffffffffff7 < uVar30) {
                uVar12 = 0x1fffffffffffffff;
              }
              if (uVar12 == 0) {
                lVar13 = 0;
              }
              else {
                if (uVar12 >> 0x3d != 0) goto LAB_00aa7ebc;
                lVar13 = _Znwm(uVar12 << 3);
              }
              puVar18 = (undefined8 *)(lVar13 + lVar26 * 8);
              puVar16 = puVar18 + 1;
              *puVar18 = uVar34;
              puVar17 = puVar18;
              if ((long)puVar40 - (long)puVar15 != 0) {
                uVar42 = ((long)puVar40 - (long)puVar15) - 8;
                if ((uVar42 < 0x38) ||
                   ((ulong)((long)puVar40 + (-((long)puVar40 - (long)puVar15) - lVar13)) < 0x20)) {
LAB_00aa7564:
                  do {
                    puVar40 = puVar40 + -1;
                    puVar17 = puVar17 + -1;
                    *puVar17 = *puVar40;
                  } while (puVar40 != puVar15);
                }
                else {
                  puVar36 = puVar40 + -2;
                  uVar42 = (uVar42 >> 3) + 1;
                  uVar24 = uVar42 & 0x3ffffffffffffffc;
                  puVar40 = puVar40 + -uVar24;
                  puVar17 = puVar18 + -uVar24;
                  puVar18 = puVar18 + -2;
                  uVar30 = uVar24;
                  do {
                    puVar4 = puVar36 + -1;
                    uVar20 = puVar36[-2];
                    uVar19 = puVar36[1];
                    uVar34 = *puVar36;
                    uVar30 = uVar30 - 4;
                    puVar36 = puVar36 + -4;
                    puVar18[-1] = *puVar4;
                    puVar18[-2] = uVar20;
                    puVar18[1] = uVar19;
                    *puVar18 = uVar34;
                    puVar18 = puVar18 + -4;
                  } while (uVar30 != 0);
                  if (uVar42 != uVar24) goto LAB_00aa7564;
                }
                puVar40 = (undefined8 *)param_1[0x3b];
              }
              param_1[0x3b] = (long)puVar17;
              param_1[0x3c] = (long)puVar16;
              param_1[0x3d] = lVar13 + uVar12 * 8;
              if (puVar40 != (undefined8 *)0x0) {
                _ZdlPv(puVar40);
              }
            }
            param_1[0x3c] = (long)puVar16;
          }
          FUN_0076ad48(&uStack_420);
          FUN_0076da2c(&uStack_420,&DAT_002dafe8,2);
          FUN_006d8fd4(lVar11,&uStack_420,iVar7 == 1);
          if ((iVar7 == 1) && (lVar26 = FUN_006d87b8(lVar11,&uStack_420), lVar26 != 0)) {
            uVar34 = _Znwm(0x30);
            FUN_00de969c(uVar34,lVar26);
            puVar40 = (undefined8 *)param_1[0x3c];
            if (puVar40 < (undefined8 *)param_1[0x3d]) {
              puVar16 = puVar40 + 1;
              *puVar40 = uVar34;
            }
            else {
              puVar15 = (undefined8 *)param_1[0x3b];
              lVar26 = (long)puVar40 - (long)puVar15 >> 3;
              uVar42 = lVar26 + 1;
              if (uVar42 >> 0x3d != 0) goto LAB_00aa7ed8;
              uVar30 = param_1[0x3d] - (long)puVar15;
              uVar12 = (long)uVar30 >> 2;
              if (uVar12 <= uVar42) {
                uVar12 = uVar42;
              }
              if (0x7ffffffffffffff7 < uVar30) {
                uVar12 = 0x1fffffffffffffff;
              }
              if (uVar12 == 0) {
                lVar13 = 0;
              }
              else {
                if (uVar12 >> 0x3d != 0) goto LAB_00aa7ebc;
                lVar13 = _Znwm(uVar12 << 3);
              }
              puVar18 = (undefined8 *)(lVar13 + lVar26 * 8);
              puVar16 = puVar18 + 1;
              *puVar18 = uVar34;
              puVar17 = puVar18;
              if ((long)puVar40 - (long)puVar15 != 0) {
                uVar42 = ((long)puVar40 - (long)puVar15) - 8;
                if ((uVar42 < 0x38) ||
                   ((ulong)((long)puVar40 + (-((long)puVar40 - (long)puVar15) - lVar13)) < 0x20)) {
LAB_00aa76f4:
                  do {
                    puVar40 = puVar40 + -1;
                    puVar17 = puVar17 + -1;
                    *puVar17 = *puVar40;
                  } while (puVar40 != puVar15);
                }
                else {
                  puVar36 = puVar40 + -2;
                  uVar42 = (uVar42 >> 3) + 1;
                  uVar24 = uVar42 & 0x3ffffffffffffffc;
                  puVar40 = puVar40 + -uVar24;
                  puVar17 = puVar18 + -uVar24;
                  puVar18 = puVar18 + -2;
                  uVar30 = uVar24;
                  do {
                    puVar4 = puVar36 + -1;
                    uVar20 = puVar36[-2];
                    uVar19 = puVar36[1];
                    uVar34 = *puVar36;
                    uVar30 = uVar30 - 4;
                    puVar36 = puVar36 + -4;
                    puVar18[-1] = *puVar4;
                    puVar18[-2] = uVar20;
                    puVar18[1] = uVar19;
                    *puVar18 = uVar34;
                    puVar18 = puVar18 + -4;
                  } while (uVar30 != 0);
                  if (uVar42 != uVar24) goto LAB_00aa76f4;
                }
                puVar40 = (undefined8 *)param_1[0x3b];
              }
              param_1[0x3b] = (long)puVar17;
              param_1[0x3c] = (long)puVar16;
              param_1[0x3d] = lVar13 + uVar12 * 8;
              if (puVar40 != (undefined8 *)0x0) {
                _ZdlPv(puVar40);
              }
            }
            param_1[0x3c] = (long)puVar16;
          }
          FUN_0076ad48(&uStack_420);
          FUN_0076da2c(&uStack_420,&DAT_002dafe8,3);
          FUN_006d8fd4(lVar11,&uStack_420,iVar7 == 2);
          if ((iVar7 == 2) && (lVar26 = FUN_006d87b8(lVar11,&uStack_420), lVar26 != 0)) {
            uVar34 = _Znwm(0x30);
            FUN_00de969c(uVar34,lVar26);
            puVar40 = (undefined8 *)param_1[0x3c];
            if (puVar40 < (undefined8 *)param_1[0x3d]) {
              puVar16 = puVar40 + 1;
              *puVar40 = uVar34;
            }
            else {
              puVar15 = (undefined8 *)param_1[0x3b];
              lVar26 = (long)puVar40 - (long)puVar15 >> 3;
              uVar42 = lVar26 + 1;
              if (uVar42 >> 0x3d != 0) goto LAB_00aa7ed8;
              uVar30 = param_1[0x3d] - (long)puVar15;
              uVar12 = (long)uVar30 >> 2;
              if (uVar12 <= uVar42) {
                uVar12 = uVar42;
              }
              if (0x7ffffffffffffff7 < uVar30) {
                uVar12 = 0x1fffffffffffffff;
              }
              if (uVar12 == 0) {
                lVar13 = 0;
              }
              else {
                if (uVar12 >> 0x3d != 0) goto LAB_00aa7ebc;
                lVar13 = _Znwm(uVar12 << 3);
              }
              puVar18 = (undefined8 *)(lVar13 + lVar26 * 8);
              puVar16 = puVar18 + 1;
              *puVar18 = uVar34;
              puVar17 = puVar18;
              if ((long)puVar40 - (long)puVar15 != 0) {
                uVar42 = ((long)puVar40 - (long)puVar15) - 8;
                if ((uVar42 < 0x38) ||
                   ((ulong)((long)puVar40 + (-((long)puVar40 - (long)puVar15) - lVar13)) < 0x20)) {
LAB_00aa7884:
                  do {
                    puVar40 = puVar40 + -1;
                    puVar17 = puVar17 + -1;
                    *puVar17 = *puVar40;
                  } while (puVar40 != puVar15);
                }
                else {
                  puVar36 = puVar40 + -2;
                  uVar42 = (uVar42 >> 3) + 1;
                  uVar24 = uVar42 & 0x3ffffffffffffffc;
                  puVar40 = puVar40 + -uVar24;
                  puVar17 = puVar18 + -uVar24;
                  puVar18 = puVar18 + -2;
                  uVar30 = uVar24;
                  do {
                    puVar4 = puVar36 + -1;
                    uVar20 = puVar36[-2];
                    uVar19 = puVar36[1];
                    uVar34 = *puVar36;
                    uVar30 = uVar30 - 4;
                    puVar36 = puVar36 + -4;
                    puVar18[-1] = *puVar4;
                    puVar18[-2] = uVar20;
                    puVar18[1] = uVar19;
                    *puVar18 = uVar34;
                    puVar18 = puVar18 + -4;
                  } while (uVar30 != 0);
                  if (uVar42 != uVar24) goto LAB_00aa7884;
                }
                puVar40 = (undefined8 *)param_1[0x3b];
              }
              param_1[0x3b] = (long)puVar17;
              param_1[0x3c] = (long)puVar16;
              param_1[0x3d] = lVar13 + uVar12 * 8;
              if (puVar40 != (undefined8 *)0x0) {
                _ZdlPv(puVar40);
              }
            }
            param_1[0x3c] = (long)puVar16;
          }
          FUN_0076ad48(&uStack_420);
          FUN_0076da2c(&uStack_420,&DAT_002dafe8,4);
          FUN_006d8fd4(lVar11,&uStack_420,iVar7 == 3);
          if ((iVar7 == 3) && (lVar11 = FUN_006d87b8(lVar11,&uStack_420), lVar11 != 0)) {
            uVar34 = _Znwm(0x30);
            FUN_00de969c(uVar34,lVar11);
            puVar40 = (undefined8 *)param_1[0x3c];
            if (puVar40 < (undefined8 *)param_1[0x3d]) {
              puVar16 = puVar40 + 1;
              *puVar40 = uVar34;
            }
            else {
              puVar15 = (undefined8 *)param_1[0x3b];
              lVar11 = (long)puVar40 - (long)puVar15 >> 3;
              uVar42 = lVar11 + 1;
              if (uVar42 >> 0x3d != 0) {
LAB_00aa7ed8:
                    /* WARNING: Subroutine does not return */
                FUN_009e2cbc(param_1 + 0x3b);
              }
              uVar30 = param_1[0x3d] - (long)puVar15;
              uVar12 = (long)uVar30 >> 2;
              if (uVar12 <= uVar42) {
                uVar12 = uVar42;
              }
              if (0x7ffffffffffffff7 < uVar30) {
                uVar12 = 0x1fffffffffffffff;
              }
              if (uVar12 == 0) {
                lVar26 = 0;
              }
              else {
                if (uVar12 >> 0x3d != 0) goto LAB_00aa7ebc;
                lVar26 = _Znwm(uVar12 << 3);
              }
              puVar18 = (undefined8 *)(lVar26 + lVar11 * 8);
              puVar16 = puVar18 + 1;
              *puVar18 = uVar34;
              puVar17 = puVar18;
              if ((long)puVar40 - (long)puVar15 != 0) {
                uVar42 = ((long)puVar40 - (long)puVar15) - 8;
                if ((uVar42 < 0x38) ||
                   ((ulong)((long)puVar40 + (-((long)puVar40 - (long)puVar15) - lVar26)) < 0x20)) {
LAB_00aa7a14:
                  do {
                    puVar40 = puVar40 + -1;
                    puVar17 = puVar17 + -1;
                    *puVar17 = *puVar40;
                  } while (puVar40 != puVar15);
                }
                else {
                  puVar36 = puVar40 + -2;
                  uVar42 = (uVar42 >> 3) + 1;
                  uVar24 = uVar42 & 0x3ffffffffffffffc;
                  puVar40 = puVar40 + -uVar24;
                  puVar17 = puVar18 + -uVar24;
                  puVar18 = puVar18 + -2;
                  uVar30 = uVar24;
                  do {
                    puVar4 = puVar36 + -1;
                    uVar20 = puVar36[-2];
                    uVar19 = puVar36[1];
                    uVar34 = *puVar36;
                    uVar30 = uVar30 - 4;
                    puVar36 = puVar36 + -4;
                    puVar18[-1] = *puVar4;
                    puVar18[-2] = uVar20;
                    puVar18[1] = uVar19;
                    *puVar18 = uVar34;
                    puVar18 = puVar18 + -4;
                  } while (uVar30 != 0);
                  if (uVar42 != uVar24) goto LAB_00aa7a14;
                }
                puVar40 = (undefined8 *)param_1[0x3b];
              }
              param_1[0x3b] = (long)puVar17;
              param_1[0x3c] = (long)puVar16;
              param_1[0x3d] = lVar26 + uVar12 * 8;
              if (puVar40 != (undefined8 *)0x0) {
                _ZdlPv(puVar40);
              }
            }
            param_1[0x3c] = (long)puVar16;
          }
          FUN_0076ad48(&uStack_420);
        }
        FUN_00eecc40(lVar44);
        uVar34 = FUN_00e173ec();
        FUN_00e4a330(uVar34,param_1[0x40],&DAT_002c52aa,&DAT_002d3ddd,0,0,0,0);
        FUN_00eecc40(lVar44);
        lVar11 = FUN_00f226e8();
        if ((lVar11 != 0) && (uVar42 = FUN_00f27270(), (uVar42 & 1) == 0)) {
          uVar34 = FUN_00f2712c(lVar11);
          uVar19 = FUN_00f2713c(lVar11);
          uVar34 = FUN_00e175b0(uVar34,uVar19,0);
          FUN_00e46b38(param_1[0x40],&DAT_0029cafa,uVar34);
          FUN_00cb5a0c(uVar34);
        }
        lVar11 = FUN_006d8874(param_1[0x40],&DAT_002e9318);
        if (lVar11 != 0) {
          FUN_006d7c30(lVar11,iVar7);
        }
        lVar11 = *(long *)(lVar44 + 200);
        if (lVar11 != 0) {
          uVar34 = FUN_00f51d04(**(undefined8 **)(lVar11 + 0x58));
          uVar19 = (**(code **)(*param_1 + 0x170))(param_1);
          FUN_00e1bc14(param_1 + 0x1a,uVar34,uVar19);
          if (0 < *(int *)(lVar11 + 100)) {
            lVar26 = param_1[0x40];
            FUN_0076da2c(&uStack_420,&DAT_002e1d5e,1);
            lVar26 = FUN_006d87b8(lVar26,&uStack_420);
            FUN_0076ad48(&uStack_420);
            if (lVar26 != 0) {
              FUN_006d7da8(lVar26,&DAT_002a4143);
              lVar13 = **(long **)(lVar11 + 0x58);
              if (lVar13 != 0) {
                lVar22 = FUN_006d8874(lVar26,&DAT_002fe81e);
                if (lVar22 != 0) {
                  FUN_006d7c30(lVar22,iVar7);
                }
                FUN_006d906c(lVar26,&DAT_002a4275,0);
                FUN_00e5a7f8(&uStack_420,lVar13);
                FUN_00e4a330(&uStack_420,lVar26,&DAT_0029cb06,&DAT_002aadd4,0,0,0,0);
                uVar34 = FUN_00f51d04(lVar13);
                uVar19 = FUN_00f51d14(lVar13);
                uVar34 = FUN_00e175b0(uVar34,uVar19,0);
                lVar26 = FUN_006d8874(lVar26,&DAT_002da639);
                if (lVar26 != 0) {
                  FUN_006d83f0(lVar26,&DAT_002f7154,uVar34);
                }
                FUN_0076ad48(&uStack_420);
              }
            }
            if (1 < *(int *)(lVar11 + 100)) {
              lVar26 = param_1[0x40];
              FUN_0076da2c(&uStack_420,&DAT_002e1d5e,2);
              lVar26 = FUN_006d87b8(lVar26,&uStack_420);
              FUN_0076ad48(&uStack_420);
              if (lVar26 != 0) {
                FUN_006d7da8(lVar26,&DAT_002a4143);
                lVar13 = *(long *)(*(long *)(lVar11 + 0x58) + 8);
                if (lVar13 != 0) {
                  lVar22 = FUN_006d8874(lVar26,&DAT_002fe81e);
                  if (lVar22 != 0) {
                    FUN_006d7c30(lVar22,iVar7);
                  }
                  FUN_006d906c(lVar26,&DAT_002a4275,0);
                  FUN_00e5a7f8(&uStack_420,lVar13);
                  FUN_00e4a330(&uStack_420,lVar26,&DAT_0029cb06,&DAT_002aadd4,0,0,0,0);
                  uVar34 = FUN_00f51d04(lVar13);
                  uVar19 = FUN_00f51d14(lVar13);
                  uVar34 = FUN_00e175b0(uVar34,uVar19,0);
                  lVar26 = FUN_006d8874(lVar26,&DAT_002da639);
                  if (lVar26 != 0) {
                    FUN_006d83f0(lVar26,&DAT_002f7154,uVar34);
                  }
                  FUN_0076ad48(&uStack_420);
                }
              }
              if (2 < *(int *)(lVar11 + 100)) {
                lVar26 = param_1[0x40];
                FUN_0076da2c(&uStack_420,&DAT_002e1d5e,3);
                lVar26 = FUN_006d87b8(lVar26,&uStack_420);
                FUN_0076ad48(&uStack_420);
                if (lVar26 != 0) {
                  FUN_006d7da8(lVar26,&DAT_002a4143);
                  lVar11 = *(long *)(*(long *)(lVar11 + 0x58) + 0x10);
                  if (lVar11 != 0) {
                    lVar13 = FUN_006d8874(lVar26,&DAT_002fe81e);
                    if (lVar13 != 0) {
                      FUN_006d7c30(lVar13,iVar7);
                    }
                    FUN_006d906c(lVar26,&DAT_002a4275,0);
                    FUN_00e5a7f8(&uStack_420,lVar11);
                    FUN_00e4a330(&uStack_420,lVar26,&DAT_0029cb06,&DAT_002aadd4,0,0,0,0);
                    uVar34 = FUN_00f51d04(lVar11);
                    uVar19 = FUN_00f51d14(lVar11);
                    uVar34 = FUN_00e175b0(uVar34,uVar19,0);
                    lVar11 = FUN_006d8874(lVar26,&DAT_002da639);
                    if (lVar11 != 0) {
                      FUN_006d83f0(lVar11,&DAT_002f7154,uVar34);
                    }
                    FUN_0076ad48(&uStack_420);
                  }
                }
              }
            }
          }
        }
        if (uStack_408 != (undefined8 *)0x0) {
          _ZdaPv();
        }
        FUN_0076ad48(&lStack_3e0);
        lVar11 = param_1[0x40];
      }
      goto joined_r0x00aa3970;
    }
    if (1 < iVar6 - 0xfU && iVar6 != 0xd) goto LAB_00aa3b98;
    FUN_00a70d34(lVar44);
    uVar34 = FUN_0097dc60();
    plVar14 = (long *)FUN_0097f85c(uVar34,0xf9);
    if (plVar14 != (long *)0x0) {
      (**(code **)(*plVar14 + 0x1a8))(0);
      *(undefined1 *)((long)param_1 + 0x461) = 1;
      lVar11 = param_1[0x40];
      goto joined_r0x00aa3970;
    }
LAB_00aa5668:
    lVar11 = param_1[0x40];
  }
  else {
    if (*(long *)(lVar11 + 0x48) == 0) {
      iStack_470 = 1;
      lStack_468 = FUN_00e02588();
    }
    else {
      iStack_470 = FUN_01062744(*(undefined8 *)(*(long *)(lVar11 + 0x48) + 0x50),iVar6);
      lStack_468 = FUN_00e02588();
    }
    if (lStack_468 == 0) {
      FUN_0076aa74(auStack_a0);
      goto joined_r0x00aa3890;
    }
    iVar7 = FUN_00e8f64c(lStack_468,lVar10);
    bVar1 = iVar7 < iStack_470;
    FUN_0076aa74(auStack_a0);
    if (0xc < iVar6) goto LAB_00aa34e0;
LAB_00aa342c:
    if (7 < iVar6) {
      if (iVar6 == 8) {
        lStack_3e0 = CONCAT35(lStack_3e0._5_3_,0x100000024);
        uStack_398 = 0;
        puStack_3d0 = (undefined *)0x0;
        uStack_3d8 = (undefined *)0x0;
        lStack_3c0 = 0;
        uStack_3c8 = 0;
        uStack_3b0 = 0;
        uStack_3ab = 0;
        uStack_3b8 = 0;
        uStack_3b3 = 0;
        lStack_3a0 = 0;
        lStack_3a8 = 0;
        uStack_390 = 2;
        uStack_38c = 0;
        uStack_388 = 0;
        uStack_384 = 0;
        uStack_380 = 0;
        FUN_00e34674(&uStack_408,&lStack_3e0);
        lVar26 = lStack_3a8;
        lVar11 = lStack_3a0;
        if (lStack_3a8 != 0) {
          for (; lVar11 != lVar26; lVar11 = lVar11 + -0x10) {
            FUN_0076ad48(lVar11 + -0x10);
          }
          lStack_3a0 = lVar26;
          _ZdlPv(lStack_3a8);
        }
        lVar11 = lStack_3c0;
        if (lStack_3c0 != 0) {
          lVar26 = CONCAT35(uStack_3b3,uStack_3b8);
          while (lVar26 != lVar11) {
            lVar26 = lVar26 + -0x10;
            FUN_0076ad48(lVar26);
          }
          uStack_3b8 = (undefined5)lVar11;
          uStack_3b3 = (undefined3)((ulong)lVar11 >> 0x28);
          _ZdlPv(lStack_3c0);
        }
        if (uStack_3d8 != (undefined *)0x0) {
          puStack_3d0 = uStack_3d8;
          _ZdlPv();
        }
        if (uStack_408._4_4_ == 0.0) goto LAB_00aa5660;
        FUN_0076ae58(&lStack_3e0,&DAT_002ff202);
        lVar11 = FUN_00e175b0(&uStack_408,&lStack_3e0,0);
        param_1[0x40] = lVar11;
        FUN_0076ad48(&lStack_3e0);
        FUN_0076ae58(&lStack_3e0,&DAT_002fb3d9);
        lVar11 = FUN_00e175b0(&uStack_408,&lStack_3e0,0);
        FUN_0076ad48(&lStack_3e0);
        plVar41 = (long *)param_1[0x6b];
        plVar14 = param_1 + 0x6a;
        if (plVar41 < (long *)param_1[0x6c]) {
          plVar43 = plVar41 + 1;
          *plVar41 = lVar11;
        }
        else {
          plVar38 = (long *)*plVar14;
          lVar26 = (long)plVar41 - (long)plVar38 >> 3;
          uVar42 = lVar26 + 1;
          if (uVar42 >> 0x3d != 0) goto LAB_00aa7ed0;
          uVar30 = param_1[0x6c] - (long)plVar38;
          uVar12 = (long)uVar30 >> 2;
          if (uVar12 <= uVar42) {
            uVar12 = uVar42;
          }
          if (0x7ffffffffffffff7 < uVar30) {
            uVar12 = 0x1fffffffffffffff;
          }
          if (uVar12 == 0) {
            lVar13 = 0;
          }
          else {
            if (uVar12 >> 0x3d != 0) goto LAB_00aa7ebc;
            lVar13 = _Znwm(uVar12 << 3);
          }
          plVar31 = (long *)(lVar13 + lVar26 * 8);
          plVar43 = plVar31 + 1;
          *plVar31 = lVar11;
          if ((long)plVar41 - (long)plVar38 != 0) {
            uVar42 = ((long)plVar41 - (long)plVar38) - 8;
            plVar27 = plVar31;
            if ((uVar42 < 0x38) ||
               ((ulong)((long)plVar41 + (-((long)plVar41 - (long)plVar38) - lVar13)) < 0x20)) {
LAB_00aa506c:
              do {
                plVar41 = plVar41 + -1;
                plVar27 = plVar27 + -1;
                *plVar27 = *plVar41;
              } while (plVar41 != plVar38);
            }
            else {
              plVar37 = plVar41 + -2;
              uVar42 = (uVar42 >> 3) + 1;
              uVar24 = uVar42 & 0x3ffffffffffffffc;
              plVar41 = plVar41 + -uVar24;
              plVar27 = plVar31 + -uVar24;
              plVar31 = plVar31 + -2;
              uVar30 = uVar24;
              do {
                plVar5 = plVar37 + -1;
                lVar47 = plVar37[-2];
                lVar22 = plVar37[1];
                lVar26 = *plVar37;
                uVar30 = uVar30 - 4;
                plVar37 = plVar37 + -4;
                plVar31[-1] = *plVar5;
                plVar31[-2] = lVar47;
                plVar31[1] = lVar22;
                *plVar31 = lVar26;
                plVar31 = plVar31 + -4;
              } while (uVar30 != 0);
              if (uVar42 != uVar24) goto LAB_00aa506c;
            }
            plVar41 = (long *)*plVar14;
            plVar31 = plVar27;
          }
          param_1[0x6a] = (long)plVar31;
          param_1[0x6b] = (long)plVar43;
          param_1[0x6c] = lVar13 + uVar12 * 8;
          if (plVar41 != (long *)0x0) {
            _ZdlPv(plVar41);
          }
        }
        param_1[0x6b] = (long)plVar43;
        FUN_00694138(param_1[0x12],lVar11,(int)param_1[0x69]);
        plVar41 = DAT_0133ba28;
        lVar26 = *DAT_0133ba28;
        fVar45 = *(float *)(lVar26 + 0x178);
        if (*(float *)(lVar26 + 0x178) == 0.0) {
          fVar45 = 0.1;
        }
        FUN_0069531c((float)(*(int *)(lVar26 + 0x284) -
                            (int)((*(float *)(lVar26 + 0x50) + *(float *)(lVar26 + 0x4c)) / fVar45))
                     / 2.0,(float)(*(int *)(lVar26 + 0x288) -
                                  (int)((*(float *)(lVar26 + 0x58) + *(float *)(lVar26 + 0x54)) /
                                       fVar45)) / 2.0,lVar11);
        FUN_006d8304(lVar11,1);
        uVar34 = FUN_00e17028(&DAT_002d3db9);
        FUN_006d8ce0(lVar11,&DAT_002aadd4,uVar34);
        FUN_006d7b48(lVar11,0,*(short *)(lVar11 + 0xbe) + -1,0);
        FUN_0076ae58(&lStack_3e0,&DAT_002927a7);
        uVar34 = FUN_00e175b0(&uStack_408,&lStack_3e0,0);
        FUN_0076ad48(&lStack_3e0);
        puVar40 = (undefined8 *)param_1[0x6b];
        if (puVar40 < (undefined8 *)param_1[0x6c]) {
          puVar17 = puVar40 + 1;
          *puVar40 = uVar34;
        }
        else {
          puVar15 = (undefined8 *)*plVar14;
          lVar11 = (long)puVar40 - (long)puVar15 >> 3;
          uVar42 = lVar11 + 1;
          if (uVar42 >> 0x3d != 0) {
LAB_00aa7ed0:
                    /* WARNING: Subroutine does not return */
            FUN_00978ad0(plVar14);
          }
          uVar30 = param_1[0x6c] - (long)puVar15;
          uVar12 = (long)uVar30 >> 2;
          if (uVar12 <= uVar42) {
            uVar12 = uVar42;
          }
          if (0x7ffffffffffffff7 < uVar30) {
            uVar12 = 0x1fffffffffffffff;
          }
          if (uVar12 == 0) {
            lVar26 = 0;
          }
          else {
            if (uVar12 >> 0x3d != 0) {
LAB_00aa7ebc:
                    /* WARNING: Subroutine does not return */
              FUN_005f9a24();
            }
            lVar26 = _Znwm(uVar12 << 3);
          }
          puVar18 = (undefined8 *)(lVar26 + lVar11 * 8);
          puVar17 = puVar18 + 1;
          *puVar18 = uVar34;
          if ((long)puVar40 - (long)puVar15 != 0) {
            uVar42 = ((long)puVar40 - (long)puVar15) - 8;
            puVar16 = puVar18;
            if ((uVar42 < 0x38) ||
               ((ulong)((long)puVar40 + (-((long)puVar40 - (long)puVar15) - lVar26)) < 0x20)) {
LAB_00aa5500:
              do {
                puVar40 = puVar40 + -1;
                puVar16 = puVar16 + -1;
                *puVar16 = *puVar40;
              } while (puVar40 != puVar15);
            }
            else {
              puVar36 = puVar40 + -2;
              uVar42 = (uVar42 >> 3) + 1;
              uVar24 = uVar42 & 0x3ffffffffffffffc;
              puVar40 = puVar40 + -uVar24;
              puVar16 = puVar18 + -uVar24;
              puVar18 = puVar18 + -2;
              uVar30 = uVar24;
              do {
                puVar4 = puVar36 + -1;
                uVar21 = puVar36[-2];
                uVar20 = puVar36[1];
                uVar19 = *puVar36;
                uVar30 = uVar30 - 4;
                puVar36 = puVar36 + -4;
                puVar18[-1] = *puVar4;
                puVar18[-2] = uVar21;
                puVar18[1] = uVar20;
                *puVar18 = uVar19;
                puVar18 = puVar18 + -4;
              } while (uVar30 != 0);
              if (uVar42 != uVar24) goto LAB_00aa5500;
            }
            puVar40 = (undefined8 *)*plVar14;
            puVar18 = puVar16;
          }
          plVar41 = (long *)&DAT_013eb9f0;
          param_1[0x6a] = (long)puVar18;
          param_1[0x6b] = (long)puVar17;
          param_1[0x6c] = lVar26 + uVar12 * 8;
          if (puVar40 != (undefined8 *)0x0) {
            _ZdlPv(puVar40);
          }
        }
        param_1[0x6b] = (long)puVar17;
        FUN_00694138(param_1[0x12],uVar34,(int)param_1[0x69]);
        lVar11 = *plVar41;
        fVar45 = *(float *)(lVar11 + 0x178);
        if (*(float *)(lVar11 + 0x178) == 0.0) {
          fVar45 = 0.1;
        }
        iVar25 = (int)((*(float *)(lVar11 + 0x50) + *(float *)(lVar11 + 0x4c)) / fVar45);
        iVar7 = *(int *)(lVar11 + 0x284) - iVar25;
        if (*(int *)(lVar11 + 0x284) < iVar25) {
          iVar7 = iVar7 + 1;
        }
        FUN_0069531c((float)-(iVar7 >> 1),
                     (float)(*(int *)(lVar11 + 0x288) -
                            (int)((*(float *)(lVar11 + 0x58) + *(float *)(lVar11 + 0x54)) / fVar45))
                     / 2.0,uVar34);
        FUN_006d8304(uVar34,1);
        lVar11 = FUN_006d8874(uVar34,&DAT_002ac049);
        FUN_006d7b48(lVar11,0,*(short *)(lVar11 + 0xbe) + -1,0);
        uVar19 = FUN_00eecc48(lVar44);
        uVar34 = FUN_006d8874(uVar34,&DAT_002ac049);
        uVar34 = FUN_006d8874(uVar34,&DAT_002f3b8e);
        uVar19 = FUN_00ef7250(uVar19);
        FUN_006d7eac(uVar34,uVar19);
        *(undefined1 *)((long)param_1 + 0x2f4) = 0;
        iVar7 = FUN_006d4f2c(param_1[0x40],&DAT_002ff1d9);
        *(int *)(param_1 + 0x5f) = iVar7;
        *(float *)(param_1 + 0x5e) = *(float *)(param_1[0x40] + 0x8c) * (float)iVar7;
        FUN_006d7da8(param_1[0x40],&DAT_002a4143);
        *(undefined1 *)((long)param_1 + 0x3fb) = 1;
      }
      else if (iVar6 == 10) {
        FUN_00e28370(&uStack_408,lVar44);
        if (uStack_408._4_4_ == 0.0) goto LAB_00aa5660;
        iVar7 = FUN_00eecca8(lVar44);
        puVar23 = &DAT_00299b13;
        if (iVar7 != 0) {
          puVar23 = &DAT_002cc4c5;
        }
        FUN_0076ae58(&lStack_3e0,puVar23);
        lVar11 = FUN_00e175b0(&uStack_408,&lStack_3e0,0);
        param_1[0x40] = lVar11;
        FUN_0076ad48(&lStack_3e0);
        FUN_0076ae58(&lStack_3e0,&DAT_002bdcff);
        lVar11 = FUN_00e175b0(&uStack_408,&lStack_3e0,0);
        FUN_0076ad48(&lStack_3e0);
        plVar14 = (long *)param_1[0x6b];
        if (plVar14 < (long *)param_1[0x6c]) {
          plVar43 = plVar14 + 1;
          *plVar14 = lVar11;
        }
        else {
          plVar41 = param_1 + 0x6a;
          plVar38 = (long *)*plVar41;
          lVar26 = (long)plVar14 - (long)plVar38 >> 3;
          uVar42 = lVar26 + 1;
          if (uVar42 >> 0x3d != 0) {
                    /* WARNING: Subroutine does not return */
            FUN_00978ad0(plVar41);
          }
          uVar30 = param_1[0x6c] - (long)plVar38;
          uVar12 = (long)uVar30 >> 2;
          if (uVar12 <= uVar42) {
            uVar12 = uVar42;
          }
          if (0x7ffffffffffffff7 < uVar30) {
            uVar12 = 0x1fffffffffffffff;
          }
          if (uVar12 == 0) {
            lVar13 = 0;
          }
          else {
            if (uVar12 >> 0x3d != 0) goto LAB_00aa7ebc;
            lVar13 = _Znwm(uVar12 << 3);
          }
          plVar31 = (long *)(lVar13 + lVar26 * 8);
          plVar43 = plVar31 + 1;
          *plVar31 = lVar11;
          if ((long)plVar14 - (long)plVar38 != 0) {
            uVar42 = ((long)plVar14 - (long)plVar38) - 8;
            plVar27 = plVar31;
            if ((uVar42 < 0x38) ||
               ((ulong)((long)plVar14 + (-((long)plVar14 - (long)plVar38) - lVar13)) < 0x20)) {
LAB_00aa4fc4:
              do {
                plVar14 = plVar14 + -1;
                plVar27 = plVar27 + -1;
                *plVar27 = *plVar14;
              } while (plVar14 != plVar38);
            }
            else {
              plVar37 = plVar14 + -2;
              uVar42 = (uVar42 >> 3) + 1;
              uVar24 = uVar42 & 0x3ffffffffffffffc;
              plVar14 = plVar14 + -uVar24;
              plVar27 = plVar31 + -uVar24;
              plVar31 = plVar31 + -2;
              uVar30 = uVar24;
              do {
                plVar5 = plVar37 + -1;
                lVar47 = plVar37[-2];
                lVar22 = plVar37[1];
                lVar26 = *plVar37;
                uVar30 = uVar30 - 4;
                plVar37 = plVar37 + -4;
                plVar31[-1] = *plVar5;
                plVar31[-2] = lVar47;
                plVar31[1] = lVar22;
                *plVar31 = lVar26;
                plVar31 = plVar31 + -4;
              } while (uVar30 != 0);
              if (uVar42 != uVar24) goto LAB_00aa4fc4;
            }
            plVar14 = (long *)*plVar41;
            plVar31 = plVar27;
          }
          param_1[0x6a] = (long)plVar31;
          param_1[0x6b] = (long)plVar43;
          param_1[0x6c] = lVar13 + uVar12 * 8;
          if (plVar14 != (long *)0x0) {
            _ZdlPv(plVar14);
          }
        }
        param_1[0x6b] = (long)plVar43;
        FUN_00694138(param_1[0x12],lVar11,(int)param_1[0x69]);
        lVar26 = *DAT_0133ba28;
        fVar45 = *(float *)(lVar26 + 0x178);
        if (*(float *)(lVar26 + 0x178) == 0.0) {
          fVar45 = 0.1;
        }
        FUN_0069531c((float)(*(int *)(lVar26 + 0x284) -
                            (int)((*(float *)(lVar26 + 0x50) + *(float *)(lVar26 + 0x4c)) / fVar45))
                     / 2.0,(float)(*(int *)(lVar26 + 0x288) -
                                  (int)((*(float *)(lVar26 + 0x58) + *(float *)(lVar26 + 0x54)) /
                                       fVar45)) / 2.0,lVar11);
        FUN_006d8304(lVar11,1);
        uVar34 = FUN_00e17028(&DAT_002bdd2a);
        FUN_006d8ce0(lVar11,&DAT_002aadd4,uVar34);
        FUN_006d7b48(lVar11,0,*(short *)(lVar11 + 0xbe) + -1,0);
        uVar9 = FUN_00eecca8(lVar44);
        iVar7 = FUN_00f1ac90(lStack_468,uVar9,0);
        lVar11 = param_1[0x40];
        if (iVar7 == 1) {
          FUN_0076ae58(&uStack_420,&DAT_002cc4ee);
          lVar11 = FUN_0098a72c(param_1,lVar11,&uStack_420);
          param_1[0x7a] = lVar11;
          param_1[0x7b] = 0;
          FUN_0076ae58(&lStack_3e0,&DAT_002e1501);
          FUN_00872de0(0,&lStack_3e0);
          FUN_0076ad48(&lStack_3e0);
          FUN_0076ad48(&uStack_420);
          FUN_006d906c(param_1[0x40],&DAT_002a492d,0);
          puVar23 = &DAT_002de747;
        }
        else {
          FUN_0076ae58(&uStack_420,&DAT_002de747);
          lVar11 = FUN_0098a72c(param_1,lVar11,&uStack_420);
          lVar26 = param_1[0x40];
          FUN_0076ae58(auStack_c0,&DAT_002a492d);
          lVar26 = FUN_0098a72c(param_1,lVar26,auStack_c0);
          param_1[0x7b] = lVar26;
          param_1[0x7a] = lVar11;
          FUN_0076ae58(&lStack_3e0,&DAT_002e1501);
          FUN_00872de0(lVar26,&lStack_3e0);
          FUN_0076ad48(&lStack_3e0);
          FUN_0076ad48(auStack_c0);
          FUN_0076ad48(&uStack_420);
          puVar23 = &DAT_002cc4ee;
        }
        FUN_006d906c(param_1[0x40],puVar23,0);
        param_1[0x7d] = lVar44;
        *(undefined1 *)(param_1 + 0x7f) = 1;
      }
      else {
        if (iVar6 != 0xc) goto LAB_00aa3b98;
        lStack_3e0 = CONCAT35(lStack_3e0._5_3_,0x100000024);
        uStack_398 = 0;
        puStack_3d0 = (undefined *)0x0;
        uStack_3d8 = (undefined *)0x0;
        lStack_3c0 = 0;
        uStack_3c8 = 0;
        uStack_3b0 = 0;
        uStack_3ab = 0;
        uStack_3b8 = 0;
        uStack_3b3 = 0;
        lStack_3a0 = 0;
        lStack_3a8 = 0;
        uStack_390 = 2;
        uStack_38c = 0;
        uStack_388 = 0;
        uStack_384 = 0;
        uStack_380 = 0;
        FUN_00e34674(&uStack_408,&lStack_3e0);
        lVar26 = lStack_3a8;
        lVar11 = lStack_3a0;
        if (lStack_3a8 != 0) {
          for (; lVar11 != lVar26; lVar11 = lVar11 + -0x10) {
            FUN_0076ad48(lVar11 + -0x10);
          }
          lStack_3a0 = lVar26;
          _ZdlPv(lStack_3a8);
        }
        lVar11 = lStack_3c0;
        if (lStack_3c0 != 0) {
          lVar26 = CONCAT35(uStack_3b3,uStack_3b8);
          while (lVar26 != lVar11) {
            lVar26 = lVar26 + -0x10;
            FUN_0076ad48(lVar26);
          }
          uStack_3b8 = (undefined5)lVar11;
          uStack_3b3 = (undefined3)((ulong)lVar11 >> 0x28);
          _ZdlPv(lStack_3c0);
        }
        if (uStack_3d8 != (undefined *)0x0) {
          puStack_3d0 = uStack_3d8;
          _ZdlPv();
        }
        if (uStack_408._4_4_ == 0.0) goto LAB_00aa5660;
        FUN_0076ae58(&lStack_3e0,&DAT_002ff202);
        lVar11 = FUN_00e175b0(&uStack_408,&lStack_3e0,0);
        param_1[0x40] = lVar11;
        FUN_0076ad48(&lStack_3e0);
        uVar34 = FUN_006d8874(param_1[0x40],&DAT_002cc500);
        uVar34 = FUN_006d8874(uVar34,&DAT_002e8f60);
        uVar34 = FUN_006d8874(uVar34,&DAT_00302590);
        FUN_00eecc40(lVar44);
        uVar19 = FUN_00ef0b28();
        uStack_1d8 = 0;
        puStack_1f8 = &DAT_002efe88;
        uStack_1d3 = 0;
        uStack_1d0 = 0;
        uStack_1f0 = 1;
        uStack_200 = DAT_003061c8;
        uStack_18c = 0;
        uStack_1e8 = 0;
        uStack_180 = 0x3e4ccccd;
        uStack_179 = 0;
        uStack_1e0 = 0;
        uStack_188 = DAT_00305928;
        plStack_168 = (long *)0x0;
        uStack_170 = 0;
        uStack_160 = 5;
        uStack_15c = 0;
        uStack_14c = 0;
        uStack_148 = 0;
        auStack_140[0] = 0;
        cStack_130 = '\0';
        uStack_128 = 0;
        uStack_120 = 0;
        uStack_118 = 0;
        uStack_f4 = 0;
        lStack_108 = 0;
        lStack_110 = 0;
        uStack_f8 = 0;
        uStack_100 = 0;
        FUN_0076ae58(auStack_f0,&DAT_002aadd1);
        uStack_d0 = 0;
        uStack_cc = 0;
        uStack_c8 = 0;
        uStack_c4 = 0;
        uStack_d8 = 0;
        uStack_e0 = 0;
        uStack_db = 0;
        FUN_00e3c4d0(param_1 + 0x49,uVar34,uVar19,&uStack_200);
        FUN_0076ad48(auStack_f0);
        if (lStack_110 != 0) {
          lStack_108 = lStack_110;
          _ZdlPv();
        }
        if (cStack_130 != '\0') {
          FUN_0076ad48(auStack_140);
        }
        plVar14 = plStack_168;
        if ((plStack_168 != (long *)0x0) &&
           (lVar11 = FUN_0129eb20(0xffffffffffffffff,plStack_168 + 1), lVar11 == 0)) {
          (**(code **)(*plVar14 + 0x10))(plVar14);
          _ZNSt6__ndk119__shared_weak_count14__release_weakEv(plVar14);
        }
        uVar34 = FUN_006d8874(param_1[0x40],&DAT_002cc500);
        uVar19 = FUN_00e17028(&DAT_002927cd);
        FUN_006d8ce0(uVar34,&DAT_002aadd4,uVar19);
        uVar34 = FUN_006d8874(param_1[0x40],&DAT_002cc500);
        FUN_00eecc40(lVar44);
        FUN_00f02d38();
        uVar19 = FUN_00e170a8();
        FUN_006d8ce0(uVar34,&DAT_002fb255,uVar19);
        lVar11 = *(long *)(lVar44 + 200);
        uStack_420 = (undefined8 *)0x0;
        uStack_418 = (undefined8 *)0x0;
        uVar33 = *(uint *)(lVar11 + 100);
        uVar42 = (ulong)uVar33;
        if ((int)uVar33 < 1) {
          uVar42 = (ulong)(int)uVar33;
          puVar15 = (undefined8 *)0x0;
          uStack_418 = (undefined8 *)((ulong)uVar33 << 0x20);
          puVar40 = (undefined8 *)(uVar42 << 3);
        }
        else {
          FUN_00ab185c(&uStack_420,uVar33);
          puVar15 = uStack_420;
          lVar26 = (long)(int)uStack_418._4_4_;
          puVar40 = *(undefined8 **)(lVar11 + 0x58);
          puVar18 = uStack_420 + lVar26;
          puVar17 = puVar40;
          uVar29 = uVar33;
          if ((uVar33 < 8) || ((ulong)((long)uStack_420 + (lVar26 * 8 - (long)puVar40)) < 0x20)) {
LAB_00aa4b24:
            uVar29 = uVar29 + 1;
            do {
              uVar29 = uVar29 - 1;
              *puVar18 = *puVar17;
              puVar18 = puVar18 + 1;
              puVar17 = puVar17 + 1;
            } while (1 < uVar29);
          }
          else {
            uVar30 = uVar42 & 0x7ffffffc;
            puVar16 = uStack_420 + lVar26 + 2;
            uVar29 = uVar33 - (int)uVar30;
            puVar17 = puVar40 + uVar30;
            puVar18 = puVar18 + uVar30;
            puVar40 = puVar40 + 2;
            uVar12 = uVar30;
            do {
              puVar36 = puVar40 + -1;
              uVar34 = puVar40[-2];
              uVar20 = puVar40[1];
              uVar19 = *puVar40;
              uVar12 = uVar12 - 4;
              puVar40 = puVar40 + 4;
              puVar16[-1] = *puVar36;
              puVar16[-2] = uVar34;
              puVar16[1] = uVar20;
              *puVar16 = uVar19;
              puVar16 = puVar16 + 4;
            } while (uVar12 != 0);
            if (uVar30 != uVar42) goto LAB_00aa4b24;
          }
          uVar34 = DAT_0133c090;
          uStack_418 = (undefined8 *)CONCAT44(uVar33,(float)uStack_418);
          puVar40 = uStack_420 + uVar42;
          if (0x80 < (int)uVar33) {
            uVar12 = uVar42;
            do {
              lVar11 = _ZnwmRKSt9nothrow_t(uVar12 << 3,uVar34);
              if (lVar11 != 0) {
                FUN_00ab1940(puVar15,puVar40,uVar42,lVar11,uVar12);
                _ZdlPv(lVar11);
                goto LAB_00aa4b9c;
              }
              bVar39 = 1 < uVar12;
              uVar12 = uVar12 >> 1;
            } while (bVar39);
          }
        }
        FUN_00ab1940(puVar15,puVar40,uVar42,0,0);
LAB_00aa4b9c:
        uVar34 = FUN_0097dc60();
        lVar11 = FUN_0097f85c(uVar34,0xc6);
        FUN_0076ae58(auStack_c0,&DAT_002bdc92);
        if (lVar11 != 0) {
          FUN_00dc126c(&lStack_3e0,lVar11);
          FUN_0076aa88(auStack_c0,&lStack_3e0);
          FUN_0076ad48(&lStack_3e0);
          FUN_0076b33c(auStack_a0,lVar11 + 0x338);
        }
        uVar34 = FUN_006d8874(param_1[0x40],&DAT_002a4167);
        FUN_006d7eac(uVar34,auStack_c0);
        uVar34 = FUN_006d8874(param_1[0x40],&DAT_002a4ac5);
        uVar34 = FUN_006d8874(uVar34,&DAT_002a4167);
        FUN_006d7eac(uVar34,auStack_c0);
        uVar34 = FUN_006d8874(param_1[0x40],&DAT_0029d342);
        uVar34 = FUN_006d8874(uVar34,&DAT_002a4167);
        FUN_006d7eac(uVar34,auStack_c0);
        lVar11 = FUN_006d8874(param_1[0x40],&DAT_002f05c7);
        lVar26 = FUN_00eecc40(lVar44);
        if ((lVar11 != 0) && (lVar26 != 0)) {
          FUN_00eecc40(lVar44);
          lVar26 = FUN_00f226e8();
          if (lVar26 != 0) {
            uVar34 = FUN_00f2712c();
            uVar19 = FUN_00f2713c(lVar26);
            lVar13 = FUN_00e175b0(uVar34,uVar19,0);
            if (lVar13 != 0) {
              FUN_00cb5a0c();
              FUN_006d83f0(lVar11,&DAT_0029cafa,lVar13);
            }
            uVar34 = FUN_00f2712c(lVar26);
            uVar19 = FUN_00f2713c(lVar26);
            lVar26 = FUN_00e175b0(uVar34,uVar19,0);
            if (lVar26 != 0) {
              FUN_00cb5a0c();
              FUN_006d83f0(lVar11,&DAT_002fadbd,lVar26);
            }
          }
          uVar34 = FUN_006d8874(lVar11,&DAT_002fe39a);
          FUN_00eecc40(lVar44);
          FUN_00f02d38();
          uVar19 = FUN_00e170a8();
          FUN_006d8ce0(uVar34,&DAT_002fb400,uVar19);
          uVar34 = FUN_006d8874(lVar11,&DAT_002fe39a);
          FUN_00eecc40(lVar44);
          FUN_00f02d38();
          uVar19 = FUN_00e170a8();
          FUN_006d8ce0(uVar34,&DAT_002fb255,uVar19);
        }
        lVar11 = param_1[0x40];
        FUN_0076d990(&lStack_3e0,&DAT_002b2fcf,1);
        lVar11 = FUN_006d87b8(lVar11,&lStack_3e0);
        FUN_0076ad48(&lStack_3e0);
        if (lVar11 != 0) {
          lVar26 = 0;
          do {
            uVar34 = uStack_420[lVar26];
            FUN_006d7da8(lVar11,&DAT_002a4143);
            lVar13 = FUN_006d8874(lVar11,&DAT_002fe81e);
            if (lVar13 != 0) {
              uVar19 = FUN_00e5a8f8(uVar34);
              uVar33 = FUN_006d4f2c(lVar13,uVar19);
              FUN_006d7c30(lVar13,uVar33 & ((int)uVar33 >> 0x1f ^ 0xffffffffU));
            }
            lVar13 = FUN_006d8874(lVar11,&DAT_0029cb06);
            if (lVar13 != 0) {
              FUN_00e5a3dc(&lStack_3e0,uVar34);
              FUN_006d8ce0(lVar13,&DAT_002aadd4,&lStack_3e0);
              FUN_0076ad48(&lStack_3e0);
            }
            lVar13 = FUN_00f51d14(uVar34);
            if (*(int *)(lVar13 + 4) != 0) {
              lVar13 = param_1[0x34];
              uVar19 = FUN_00f51d04(uVar34);
              uStack_3d8 = (undefined *)0xffffffffffffffff;
              puStack_3d0 = (undefined *)0xffffffff;
              lStack_3e0 = -1;
              FUN_00e1c308(lVar13,uVar19,&lStack_3e0);
              FUN_00e1cc08(param_1[0x34],0);
              uVar19 = FUN_00f51d04(uVar34);
              uVar34 = FUN_00f51d14(uVar34);
              uVar34 = FUN_0061ec34(uVar19,uVar34);
              FUN_006d83f0(lVar11,&DAT_002da639,uVar34);
            }
            lVar11 = param_1[0x40];
            FUN_0076d990(&lStack_3e0,&DAT_002b2fcf,(int)lVar26 + 2);
            lVar11 = FUN_006d87b8(lVar11,&lStack_3e0);
            FUN_0076ad48(&lStack_3e0);
            lVar26 = lVar26 + 1;
          } while (lVar11 != 0);
        }
        *(undefined1 *)((long)param_1 + 0x3fb) = 1;
        FUN_0076ad48(auStack_c0);
        if (uStack_420 != (undefined8 *)0x0) {
          _ZdaPv();
        }
      }
LAB_00aa5660:
      FUN_0076ad48(&uStack_408);
      goto LAB_00aa5668;
    }
    if (iVar6 == 5) {
      lVar11 = FUN_00e1763c("sc/ui.sc",&DAT_0029d32a,0);
      param_1[0x40] = lVar11;
    }
    else if (iVar6 == 6) {
      lVar11 = FUN_00e1763c("sc/ui.sc",&DAT_002c528c,0);
      param_1[0x40] = lVar11;
    }
    else if (iVar6 == 7) {
      lVar11 = FUN_00e1763c(&DAT_002a3e1b,&DAT_002ff1e8,0);
      param_1[0x40] = lVar11;
      FUN_006d8708(lVar11,1);
      lStack_3e0 = 0;
      uStack_3d8 = (undefined *)0x0;
      FUN_00f19e30(&lStack_3e0,*(undefined4 *)(lVar44 + 0x10c));
      if (0 < (int)uStack_3d8._4_4_) {
        lVar11 = 0;
        lVar26 = 0;
        uVar33 = uStack_3d8._4_4_;
LAB_00aa34a0:
        uVar33 = uVar33 - 1;
        if (*(long *)(lStack_3e0 + lVar11) != lVar44) goto code_r0x00aa34ac;
        uVar29 = uStack_3d8._4_4_ - 1;
        uStack_3d8 = (undefined *)CONCAT44(uVar29,(undefined4)uStack_3d8);
        if (-(int)lVar26 < (int)uVar29) {
          uVar42 = (ulong)uVar29 + lVar26;
          uVar35 = (uint)uVar42;
          if (0 < (int)uVar35) {
            puVar40 = (undefined8 *)(lStack_3e0 + lVar11);
            if (uVar35 < 4) goto LAB_00aa4428;
            puVar15 = puVar40 + 2;
            puVar40 = (undefined8 *)(lStack_3e0 + (ulong)(uVar33 >> 2) * 0x20 + lVar11);
            uVar12 = uVar42 & 0xfffffffc;
            uVar35 = (uVar33 >> 2) * -4 + uVar29 + (int)lVar26;
            do {
              uVar34 = puVar15[-1];
              uVar19 = puVar15[1];
              uVar12 = uVar12 - 4;
              puVar15[-1] = *puVar15;
              puVar15[-2] = uVar34;
              puVar15[1] = puVar15[2];
              *puVar15 = uVar19;
              puVar15 = puVar15 + 4;
            } while (uVar12 != 0);
            if ((uVar42 & 0xfffffffc) != (uVar42 & 0xffffffff)) {
LAB_00aa4428:
              uVar35 = uVar35 + 1;
              do {
                uVar35 = uVar35 - 1;
                *puVar40 = puVar40[1];
                puVar40 = puVar40 + 1;
              } while (1 < uVar35);
            }
          }
        }
      }
LAB_00aa4448:
      uVar9 = rand();
      FUN_006f995c(&uStack_420,uVar9);
      uVar42 = (ulong)uStack_3d8._4_4_;
      if (1 < (int)uStack_3d8._4_4_) {
        do {
          uVar12 = FUN_006f9a28(&uStack_420,uVar42 & 0xffffffff);
          uVar12 = -(uVar12 >> 0x1f & 1) & 0xfffffff800000000 | (uVar12 & 0xffffffff) << 3;
          lVar11 = lStack_3e0 + uVar42 * 8;
          uVar34 = *(undefined8 *)(lVar11 + -8);
          *(undefined8 *)(lVar11 + -8) = *(undefined8 *)(lStack_3e0 + uVar12);
          *(undefined8 *)(lStack_3e0 + uVar12) = uVar34;
          bVar39 = 2 < uVar42;
          uVar42 = uVar42 - 1;
        } while (bVar39);
      }
      iVar7 = rand();
      *(undefined4 *)((long)param_1 + 0x444) = 0xf;
      uVar9 = 5;
      if (iVar7 % 100 < 0x33) {
        uVar9 = 6;
      }
      uVar28 = 3;
      if (iVar7 % 100 < 0x33) {
        uVar28 = 1;
      }
      *(undefined4 *)(param_1 + 0x88) = uVar9;
      *(undefined4 *)(param_1 + 0x8a) = uVar28;
      if (0 < (int)uStack_3d8._4_4_) {
        uVar42 = 0;
        plVar14 = param_1 + 0x82;
        do {
          lVar11 = param_1[0x40];
          FUN_0076da2c(&uStack_408,&DAT_002bd30e,*(undefined4 *)((long)param_1 + 0x444));
          puVar40 = &uStack_400;
          if (7 < (int)uStack_408._4_4_) {
            puVar40 = uStack_400;
          }
          lVar11 = FUN_00e49fdc(lVar11,&DAT_002a08ea,puVar40,0,0,0,0);
          FUN_0076ad48(&uStack_408);
          if (lVar11 != 0) {
            iVar7 = *(int *)((long)param_1 + 0x444) + -1;
            if (*(int *)((long)param_1 + 0x444) < 1) {
              iVar7 = 0;
            }
            *(int *)((long)param_1 + 0x444) = iVar7;
            lVar26 = FUN_00e4a180(lVar11,&DAT_00295bab,0,0,0,0,0);
            if (lVar26 != 0) {
              lVar13 = lVar44;
              if (uVar42 != *(uint *)(param_1 + 0x8a)) {
                lVar13 = *(long *)(lStack_3e0 + uVar42 * 8);
              }
              FUN_00eecc40(lVar13);
              lVar13 = FUN_00ef0b28();
              uStack_408 = (undefined8 *)0x0;
              uStack_400 = (undefined8 *)0x0;
              FUN_00695378(lVar26,0,&uStack_408,0);
              uVar34 = FUN_00f6547c(*(undefined8 *)(lVar13 + 0x98));
              lStack_b0 = param_1[0x34];
              plStack_a8 = (long *)param_1[0x35];
              fVar48 = (float)uStack_400;
              fVar49 = uStack_400._4_4_;
              fVar45 = (float)uStack_408;
              fVar46 = uStack_408._4_4_;
              if (plStack_a8 != (long *)0x0) {
                FUN_0129eac0(1,plStack_a8 + 1);
              }
              uVar34 = FUN_008d2af4(fVar48 - fVar45,fVar49 - fVar46,5,uVar34,lVar13,&lStack_b0,0,1,0
                                    ,1,0);
              plVar41 = plStack_a8;
              if ((plStack_a8 != (long *)0x0) &&
                 (lVar13 = FUN_0129eb20(0xffffffffffffffff,plStack_a8 + 1), lVar13 == 0)) {
                (**(code **)(*plVar41 + 0x10))(plVar41);
                _ZNSt6__ndk119__shared_weak_count14__release_weakEv(plVar41);
              }
              iVar7 = FUN_0069443c(lVar11,lVar26);
              FUN_00694138(lVar11,uVar34,iVar7 + 1);
              *(undefined1 *)(lVar26 + 8) = 0;
              FUN_008cb32c(0xbf800000,uVar34,7,7);
              FUN_008c6cfc(0,uVar34,0,0);
              if (*(float *)((long)param_1 + 0x44c) <= 0.0) {
                *(float *)((long)param_1 + 0x44c) = (float)uStack_400 - (float)uStack_408;
              }
              puVar40 = (undefined8 *)param_1[0x83];
              if (puVar40 < (undefined8 *)param_1[0x84]) {
                puVar17 = puVar40 + 1;
                *puVar40 = uVar34;
              }
              else {
                puVar15 = (undefined8 *)*plVar14;
                lVar11 = (long)puVar40 - (long)puVar15 >> 3;
                uVar12 = lVar11 + 1;
                if (uVar12 >> 0x3d != 0) {
                    /* WARNING: Subroutine does not return */
                  FUN_008d34e0(plVar14);
                }
                uVar24 = param_1[0x84] - (long)puVar15;
                uVar30 = (long)uVar24 >> 2;
                if (uVar30 <= uVar12) {
                  uVar30 = uVar12;
                }
                if (0x7ffffffffffffff7 < uVar24) {
                  uVar30 = 0x1fffffffffffffff;
                }
                if (uVar30 == 0) {
                  lVar26 = 0;
                  puVar18 = (undefined8 *)(lVar11 * 8);
                  lVar11 = (long)puVar40 - (long)puVar15;
                  puVar17 = puVar18 + 1;
                  *puVar18 = uVar34;
                  if (lVar11 == 0) goto LAB_00aa47a8;
LAB_00aa4770:
                  puVar16 = puVar18;
                  if ((lVar11 - 8U < 0x38) ||
                     ((ulong)((long)puVar40 + (-((long)puVar40 - (long)puVar15) - lVar26)) < 0x20))
                  {
LAB_00aa4844:
                    do {
                      puVar40 = puVar40 + -1;
                      puVar16 = puVar16 + -1;
                      *puVar16 = *puVar40;
                    } while (puVar40 != puVar15);
                  }
                  else {
                    puVar36 = puVar40 + -2;
                    uVar12 = (lVar11 - 8U >> 3) + 1;
                    uVar32 = uVar12 & 0x3ffffffffffffffc;
                    puVar40 = puVar40 + -uVar32;
                    puVar16 = puVar18 + -uVar32;
                    puVar18 = puVar18 + -2;
                    uVar24 = uVar32;
                    do {
                      puVar4 = puVar36 + -1;
                      uVar20 = puVar36[-2];
                      uVar19 = puVar36[1];
                      uVar34 = *puVar36;
                      uVar24 = uVar24 - 4;
                      puVar36 = puVar36 + -4;
                      puVar18[-1] = *puVar4;
                      puVar18[-2] = uVar20;
                      puVar18[1] = uVar19;
                      *puVar18 = uVar34;
                      puVar18 = puVar18 + -4;
                    } while (uVar24 != 0);
                    if (uVar12 != uVar32) goto LAB_00aa4844;
                  }
                  puVar40 = (undefined8 *)*plVar14;
                  param_1[0x82] = (long)puVar16;
                  param_1[0x83] = (long)puVar17;
                  param_1[0x84] = lVar26 + uVar30 * 8;
                }
                else {
                  if (uVar30 >> 0x3d != 0) goto LAB_00aa7ebc;
                  lVar26 = _Znwm(uVar30 << 3);
                  puVar18 = (undefined8 *)(lVar26 + lVar11 * 8);
                  lVar11 = (long)puVar40 - (long)puVar15;
                  puVar17 = puVar18 + 1;
                  *puVar18 = uVar34;
                  if (lVar11 != 0) goto LAB_00aa4770;
LAB_00aa47a8:
                  param_1[0x82] = (long)puVar18;
                  param_1[0x83] = (long)puVar17;
                  param_1[0x84] = lVar26 + uVar30 * 8;
                }
                if (puVar40 != (undefined8 *)0x0) {
                  _ZdlPv(puVar40);
                }
              }
              param_1[0x83] = (long)puVar17;
            }
          }
          uVar42 = uVar42 + 1;
        } while (((long)uVar42 < (long)(int)uStack_3d8._4_4_) &&
                ((long)uVar42 < (long)(int)param_1[0x88]));
      }
      *(undefined1 *)(param_1 + 0x89) = 1;
      FUN_006d79c8(param_1[0x40],&DAT_00295aae,&DAT_002e4fd2,0);
      lVar11 = FUN_006d8874(param_1[0x40],&DAT_002d7504);
      if (lVar11 != 0) {
        FUN_006d79c8(lVar11,&DAT_002fef51,&DAT_002dacb3,0);
      }
      lVar11 = FUN_006d8874(param_1[0x40],&DAT_002a08ea);
      if (lVar11 != 0) {
        FUN_006d7da8(lVar11,"default");
      }
      if (lStack_3e0 == 0) goto LAB_00aa5668;
      _ZdaPv();
      lVar11 = param_1[0x40];
    }
    else {
LAB_00aa3b98:
      if (param_1[0x40] != 0) goto LAB_00aa5668;
      lVar11 = FUN_00e1763c("sc/ui.sc",&DAT_002ac05b,0);
      param_1[0x40] = lVar11;
    }
  }
joined_r0x00aa3970:
  if (lVar11 != 0) {
    FUN_00694138(param_1[0x12],lVar11,(int)param_1[0x69]);
  }
  lVar11 = param_1[0x3a];
  if (lVar11 != 0) {
    FUN_00de9884(lVar11);
    _ZdlPv(lVar11);
  }
  param_1[0x3a] = 0;
  if (param_1[0x8e] == 0) {
    lVar11 = _Znwm(0x30);
    FUN_00de969c(lVar11,param_1[0x40]);
    param_1[0x3a] = lVar11;
    if (iStack_9c != 0) {
      FUN_00de9ed8(lVar11,auStack_a0);
    }
  }
  if (param_1[0x40] == 0) {
LAB_00aa5944:
    lVar11 = 0;
    bVar39 = true;
joined_r0x00aa5950:
    if (iVar6 == 7) goto LAB_00aa5888;
LAB_00aa5954:
    if (iVar6 != 6) {
      bVar39 = false;
      goto LAB_00aa6638;
    }
    FUN_00d2042c(lVar44,lVar11,1,0);
    lVar26 = FUN_006d8ad4(lVar11,&DAT_002aadd4);
    if (lVar26 != 0) {
      FUN_00692558(lVar26,1);
      FUN_00d1d99c(&lStack_3e0,lVar44,0,0);
      FUN_006921a0(lVar26,&lStack_3e0);
      FUN_0076ad48(&lStack_3e0);
    }
    uVar34 = FUN_00e17028(&DAT_002cc519);
    FUN_006d8ce0(lVar11,&DAT_002cc50d,uVar34);
    bVar39 = false;
    lVar11 = param_1[0x40];
  }
  else {
    lVar11 = FUN_006d8874(param_1[0x40],&DAT_002d3bc6);
    if (lVar11 != 0) {
      if ((lVar10 != 0) && (lVar26 = FUN_006d8ad4(lVar11,&DAT_002f7360), lVar26 != 0)) {
        FUN_00f02d38(lVar10);
        uVar34 = FUN_00e170a8();
        FUN_00e46898(lVar26,uVar34,0,0);
      }
      lVar26 = FUN_006d8ad4(lVar11,&DAT_002d3bc6);
      if (lVar26 != 0) {
        FUN_00d1d7c0(lVar44,lVar26,1);
      }
      lVar11 = FUN_006d8ad4(lVar11,"name_txt");
      if (lVar11 != 0) {
        FUN_00f02d38(lVar44);
        uVar34 = FUN_00e170a8();
        FUN_00e46898(lVar11,uVar34,0,0);
      }
    }
    if (param_1[0x40] == 0) goto LAB_00aa5944;
    lVar11 = FUN_006d8874(param_1[0x40],&DAT_002ba4fb);
    if (lVar11 != 0) {
      lVar26 = FUN_006d8874(lVar11,"image_ph");
      lVar13 = _Znwm(0xa0);
      FUN_0097b030(lVar13,0);
      param_1[0x47] = lVar13;
      if (((lVar10 != 0) && (lVar26 != 0)) && (uVar42 = FUN_00aae6c0(lVar10), (uVar42 & 1) == 0)) {
        lVar13 = param_1[0x47];
        uVar34 = FUN_00f02d4c(lVar10);
        FUN_00ef19b0(&lStack_3e0,lVar10);
        FUN_0097b268(lVar13,uVar34,&lStack_3e0);
        FUN_0076ad48(&lStack_3e0);
        lVar13 = param_1[0x47];
        FUN_0076ae58(&lStack_3e0,"image_ph");
        FUN_0097b388(lVar13,lVar26,&lStack_3e0,1,1);
        FUN_0076ad48(&lStack_3e0);
        lVar26 = FUN_006d8874(lVar26,"image_ph");
        *(undefined1 *)(lVar26 + 8) = 0;
      }
      lVar26 = FUN_006d8ad4(lVar11,&DAT_002a4adb);
      if (lVar26 != 0) {
        FUN_00d1d920(lVar44,lVar26,1);
      }
      bVar39 = false;
      goto joined_r0x00aa5950;
    }
    bVar39 = true;
    if (iVar6 != 7) goto LAB_00aa5954;
LAB_00aa5888:
    if (param_1[0x40] != 0) {
      FUN_00debd28(*(undefined4 *)(*DAT_0133c2e8 + 0x40),0,0x3e99999a);
      iVar7 = *(int *)(lVar44 + 0x10c);
      uStack_400 = (undefined8 *)0x0;
      lStack_3f8 = 0;
      uStack_3d8 = (undefined *)_UNK_012d2280;
      lStack_3e0 = _DAT_012d2278;
      uStack_3c8 = _UNK_012d2290;
      puStack_3d0 = _DAT_012d2288;
      puVar40 = &uStack_400;
      uStack_3b8 = (undefined5)_UNK_012d22a0;
      uStack_3b3 = (undefined3)((ulong)_UNK_012d22a0 >> 0x28);
      lStack_3c0 = _DAT_012d2298;
      lStack_3a8 = _UNK_012d22b0;
      uStack_3b0 = (undefined5)_DAT_012d22a8;
      uStack_3ab = (undefined3)((ulong)_DAT_012d22a8 >> 0x28);
      uStack_408 = puVar40;
      plVar14 = (long *)FUN_00ab27d8(&uStack_408,puVar40,&uStack_420,auStack_c0,&lStack_3e0);
      if (*plVar14 == 0) {
        puVar15 = (undefined8 *)_Znwm(0x30);
        *puVar15 = 0;
        puVar15[1] = 0;
        puVar15[5] = uStack_3d8;
        puVar15[4] = lStack_3e0;
        puVar15[2] = uStack_420;
        *plVar14 = (long)puVar15;
        if ((undefined8 *)*uStack_408 != (undefined8 *)0x0) {
          puVar15 = (undefined8 *)*plVar14;
          uStack_408 = (undefined8 *)*uStack_408;
        }
        FUN_00602bd0(uStack_400,puVar15);
        lStack_3f8 = lStack_3f8 + 1;
      }
      plVar14 = (long *)FUN_00ab27d8(&uStack_408,puVar40,&uStack_420,auStack_c0,&puStack_3d0);
      if (*plVar14 == 0) {
        puVar15 = (undefined8 *)_Znwm(0x30);
        *puVar15 = 0;
        puVar15[1] = 0;
        puVar15[5] = uStack_3c8;
        puVar15[4] = puStack_3d0;
        puVar15[2] = uStack_420;
        *plVar14 = (long)puVar15;
        if ((undefined8 *)*uStack_408 != (undefined8 *)0x0) {
          puVar15 = (undefined8 *)*plVar14;
          uStack_408 = (undefined8 *)*uStack_408;
        }
        FUN_00602bd0(uStack_400,puVar15);
        lStack_3f8 = lStack_3f8 + 1;
      }
      plVar14 = (long *)FUN_00ab27d8(&uStack_408,puVar40,&uStack_420,auStack_c0,&lStack_3c0);
      if (*plVar14 == 0) {
        puVar15 = (undefined8 *)_Znwm(0x30);
        *puVar15 = 0;
        puVar15[1] = 0;
        puVar15[5] = CONCAT35(uStack_3b3,uStack_3b8);
        puVar15[4] = lStack_3c0;
        puVar15[2] = uStack_420;
        *plVar14 = (long)puVar15;
        if ((undefined8 *)*uStack_408 != (undefined8 *)0x0) {
          puVar15 = (undefined8 *)*plVar14;
          uStack_408 = (undefined8 *)*uStack_408;
        }
        FUN_00602bd0(uStack_400,puVar15);
        lStack_3f8 = lStack_3f8 + 1;
      }
      plVar14 = (long *)FUN_00ab27d8(&uStack_408,puVar40,&uStack_420,auStack_c0,&uStack_3b0);
      if (*plVar14 == 0) {
        puVar15 = (undefined8 *)_Znwm(0x30);
        *puVar15 = 0;
        puVar15[1] = 0;
        puVar15[5] = lStack_3a8;
        puVar15[4] = CONCAT35(uStack_3ab,uStack_3b0);
        puVar15[2] = uStack_420;
        *plVar14 = (long)puVar15;
        if ((undefined8 *)*uStack_408 != (undefined8 *)0x0) {
          puVar15 = (undefined8 *)*plVar14;
          uStack_408 = (undefined8 *)*uStack_408;
        }
        FUN_00602bd0(uStack_400,puVar15);
        lStack_3f8 = lStack_3f8 + 1;
      }
      if (uStack_400 != (undefined8 *)0x0) {
        puVar15 = puVar40;
        puVar18 = uStack_400;
        do {
          puVar36 = puVar18;
          puVar17 = puVar15;
          puVar15 = puVar36;
          puVar16 = puVar36;
          if (*(int *)(puVar36 + 4) < iVar7) {
            puVar15 = puVar17;
            puVar16 = puVar36 + 1;
          }
          puVar18 = (undefined8 *)*puVar16;
        } while ((undefined8 *)*puVar16 != (undefined8 *)0x0);
        if (puVar15 != puVar40) {
          if (iVar7 <= *(int *)(puVar36 + 4)) {
            puVar17 = puVar36;
          }
          puVar18 = puVar40;
          if (*(int *)(puVar17 + 4) <= iVar7) {
            puVar18 = puVar15;
          }
          if (puVar40 != puVar18) {
            lVar26 = FUN_006d8874(puVar18,param_1[0x40],&DAT_002a4167);
            puVar15 = puVar40;
            puVar18 = uStack_400;
            if (lVar26 != 0) {
              while( true ) {
                puVar17 = puVar15;
                if (puVar18 == (undefined8 *)0x0) break;
                while( true ) {
                  puVar16 = puVar18;
                  puVar15 = puVar16;
                  if (iVar7 < *(int *)(puVar16 + 4)) break;
                  if (iVar7 <= *(int *)(puVar16 + 4)) goto LAB_00aa5cb4;
                  puVar18 = (undefined8 *)puVar16[1];
                  if ((undefined8 *)puVar16[1] == (undefined8 *)0x0) {
                    puVar17 = puVar16 + 1;
                    goto LAB_00aa5c40;
                  }
                }
                puVar18 = (undefined8 *)*puVar16;
              }
LAB_00aa5c40:
              puVar16 = (undefined8 *)_Znwm(0x30);
              *(int *)(puVar16 + 4) = iVar7;
              puVar16[5] = 0;
              *puVar16 = 0;
              puVar16[1] = 0;
              puVar16[2] = puVar15;
              *puVar17 = puVar16;
              puVar15 = puVar16;
              if ((undefined8 *)*uStack_408 != (undefined8 *)0x0) {
                puVar15 = (undefined8 *)*puVar17;
                uStack_408 = (undefined8 *)*uStack_408;
              }
              FUN_00602bd0(uStack_400,puVar15);
              lStack_3f8 = lStack_3f8 + 1;
LAB_00aa5cb4:
              FUN_006d7da8(lVar26,puVar16[5]);
            }
            lVar26 = FUN_006d8874(param_1[0x40],&DAT_002b6cf5);
            puVar15 = puVar40;
            puVar18 = uStack_400;
            if (lVar26 != 0) {
              while( true ) {
                puVar17 = puVar15;
                if (puVar18 == (undefined8 *)0x0) break;
                while( true ) {
                  puVar16 = puVar18;
                  puVar15 = puVar16;
                  if (iVar7 < *(int *)(puVar16 + 4)) break;
                  if (iVar7 <= *(int *)(puVar16 + 4)) goto LAB_00aa5d88;
                  puVar18 = (undefined8 *)puVar16[1];
                  if ((undefined8 *)puVar16[1] == (undefined8 *)0x0) {
                    puVar17 = puVar16 + 1;
                    goto LAB_00aa5d14;
                  }
                }
                puVar18 = (undefined8 *)*puVar16;
              }
LAB_00aa5d14:
              puVar16 = (undefined8 *)_Znwm(0x30);
              *(int *)(puVar16 + 4) = iVar7;
              puVar16[5] = 0;
              *puVar16 = 0;
              puVar16[1] = 0;
              puVar16[2] = puVar15;
              *puVar17 = puVar16;
              puVar15 = puVar16;
              if ((undefined8 *)*uStack_408 != (undefined8 *)0x0) {
                puVar15 = (undefined8 *)*puVar17;
                uStack_408 = (undefined8 *)*uStack_408;
              }
              FUN_00602bd0(uStack_400,puVar15);
              lStack_3f8 = lStack_3f8 + 1;
LAB_00aa5d88:
              FUN_006d7da8(lVar26,puVar16[5]);
            }
            lVar26 = FUN_006d8874(param_1[0x40],&DAT_002c52bb);
            puVar15 = puVar40;
            puVar18 = uStack_400;
            if (lVar26 != 0) {
              while( true ) {
                puVar17 = puVar15;
                if (puVar18 == (undefined8 *)0x0) break;
                while( true ) {
                  puVar16 = puVar18;
                  puVar15 = puVar16;
                  if (iVar7 < *(int *)(puVar16 + 4)) break;
                  if (iVar7 <= *(int *)(puVar16 + 4)) goto LAB_00aa5e5c;
                  puVar18 = (undefined8 *)puVar16[1];
                  if ((undefined8 *)puVar16[1] == (undefined8 *)0x0) {
                    puVar17 = puVar16 + 1;
                    goto LAB_00aa5de8;
                  }
                }
                puVar18 = (undefined8 *)*puVar16;
              }
LAB_00aa5de8:
              puVar16 = (undefined8 *)_Znwm(0x30);
              *(int *)(puVar16 + 4) = iVar7;
              puVar16[5] = 0;
              *puVar16 = 0;
              puVar16[1] = 0;
              puVar16[2] = puVar15;
              *puVar17 = puVar16;
              puVar15 = puVar16;
              if ((undefined8 *)*uStack_408 != (undefined8 *)0x0) {
                puVar15 = (undefined8 *)*puVar17;
                uStack_408 = (undefined8 *)*uStack_408;
              }
              FUN_00602bd0(uStack_400,puVar15);
              lStack_3f8 = lStack_3f8 + 1;
LAB_00aa5e5c:
              FUN_006d7da8(lVar26,puVar16[5]);
            }
            lVar26 = FUN_00e49fdc(param_1[0x40],&DAT_002d3bc6,&DAT_002b6cf5,0,0,0,0);
            puVar15 = uStack_400;
            if (lVar26 != 0) {
              while( true ) {
                puVar18 = puVar40;
                if (puVar15 == (undefined8 *)0x0) break;
                while( true ) {
                  puVar17 = puVar15;
                  puVar40 = puVar17;
                  if (iVar7 < *(int *)(puVar17 + 4)) break;
                  if (iVar7 <= *(int *)(puVar17 + 4)) goto LAB_00aa5f28;
                  puVar15 = (undefined8 *)puVar17[1];
                  if ((undefined8 *)puVar17[1] == (undefined8 *)0x0) {
                    puVar18 = puVar17 + 1;
                    goto LAB_00aa5ed0;
                  }
                }
                puVar15 = (undefined8 *)*puVar17;
              }
LAB_00aa5ed0:
              puVar17 = (undefined8 *)_Znwm(0x30);
              *(int *)(puVar17 + 4) = iVar7;
              puVar17[5] = 0;
              *puVar17 = 0;
              puVar17[1] = 0;
              puVar17[2] = puVar40;
              *puVar18 = puVar17;
              puVar40 = puVar17;
              if ((undefined8 *)*uStack_408 != (undefined8 *)0x0) {
                puVar40 = (undefined8 *)*puVar18;
                uStack_408 = (undefined8 *)*uStack_408;
              }
              FUN_00602bd0(uStack_400,puVar40);
              lStack_3f8 = lStack_3f8 + 1;
LAB_00aa5f28:
              FUN_006d7da8(lVar26,puVar17[5]);
            }
          }
        }
      }
      uStack_418 = (undefined8 *)0x0;
      lStack_410 = 0;
      uStack_3d8 = _UNK_012d22c0;
      lStack_3e0 = _DAT_012d22b8;
      uStack_3c8 = _UNK_012d22d0;
      puStack_3d0 = _DAT_012d22c8;
      uStack_3b8 = (undefined5)_UNK_012d22e0;
      uStack_3b3 = (undefined3)((ulong)_UNK_012d22e0 >> 0x28);
      lStack_3c0 = _DAT_012d22d8;
      lStack_3a8 = _UNK_012d22f0;
      uStack_3b0 = (undefined5)_DAT_012d22e8;
      uStack_3ab = (undefined3)((ulong)_DAT_012d22e8 >> 0x28);
      uStack_420 = &uStack_418;
      plVar14 = (long *)FUN_00ab27d8(&uStack_420,&uStack_418,auStack_c0,auStack_430,&lStack_3e0);
      if (*plVar14 == 0) {
        puVar40 = (undefined8 *)_Znwm(0x30);
        *puVar40 = 0;
        puVar40[1] = 0;
        puVar40[5] = uStack_3d8;
        puVar40[4] = lStack_3e0;
        puVar40[2] = auStack_c0[0];
        *plVar14 = (long)puVar40;
        if ((undefined8 *)*uStack_420 != (undefined8 *)0x0) {
          puVar40 = (undefined8 *)*plVar14;
          uStack_420 = (undefined8 *)*uStack_420;
        }
        FUN_00602bd0(uStack_418,puVar40);
        lStack_410 = lStack_410 + 1;
      }
      plVar14 = (long *)FUN_00ab27d8(&uStack_420,&uStack_418,auStack_c0,auStack_430,&puStack_3d0);
      if (*plVar14 == 0) {
        puVar40 = (undefined8 *)_Znwm(0x30);
        *puVar40 = 0;
        puVar40[1] = 0;
        puVar40[5] = uStack_3c8;
        puVar40[4] = puStack_3d0;
        puVar40[2] = auStack_c0[0];
        *plVar14 = (long)puVar40;
        if ((undefined8 *)*uStack_420 != (undefined8 *)0x0) {
          puVar40 = (undefined8 *)*plVar14;
          uStack_420 = (undefined8 *)*uStack_420;
        }
        FUN_00602bd0(uStack_418,puVar40);
        lStack_410 = lStack_410 + 1;
      }
      plVar14 = (long *)FUN_00ab27d8(&uStack_420,&uStack_418,auStack_c0,auStack_430,&lStack_3c0);
      if (*plVar14 == 0) {
        puVar40 = (undefined8 *)_Znwm(0x30);
        *puVar40 = 0;
        puVar40[1] = 0;
        puVar40[5] = CONCAT35(uStack_3b3,uStack_3b8);
        puVar40[4] = lStack_3c0;
        puVar40[2] = auStack_c0[0];
        *plVar14 = (long)puVar40;
        if ((undefined8 *)*uStack_420 != (undefined8 *)0x0) {
          puVar40 = (undefined8 *)*plVar14;
          uStack_420 = (undefined8 *)*uStack_420;
        }
        FUN_00602bd0(uStack_418,puVar40);
        lStack_410 = lStack_410 + 1;
      }
      plVar14 = (long *)FUN_00ab27d8(&uStack_420,&uStack_418,auStack_c0,auStack_430,&uStack_3b0);
      if (*plVar14 == 0) {
        puVar40 = (undefined8 *)_Znwm(0x30);
        *puVar40 = 0;
        puVar40[1] = 0;
        puVar40[5] = lStack_3a8;
        puVar40[4] = CONCAT35(uStack_3ab,uStack_3b0);
        puVar40[2] = auStack_c0[0];
        *plVar14 = (long)puVar40;
        if ((undefined8 *)*uStack_420 != (undefined8 *)0x0) {
          puVar40 = (undefined8 *)*plVar14;
          uStack_420 = (undefined8 *)*uStack_420;
        }
        FUN_00602bd0(uStack_418,puVar40);
        lStack_410 = lStack_410 + 1;
      }
      if (uStack_418 != (undefined8 *)0x0) {
        puVar40 = &uStack_418;
        puVar15 = uStack_418;
        do {
          puVar16 = puVar15;
          puVar17 = puVar40;
          iVar25 = *(int *)(puVar16 + 4);
          puVar18 = puVar16;
          if (iVar25 < iVar7) {
            puVar18 = puVar16 + 1;
          }
          puVar40 = puVar16;
          if (iVar25 < iVar7) {
            puVar40 = puVar17;
          }
          puVar15 = (undefined8 *)*puVar18;
        } while ((undefined8 *)*puVar18 != (undefined8 *)0x0);
        if (puVar40 != &uStack_418) {
          if (iVar7 <= iVar25) {
            puVar17 = puVar16;
          }
          puVar15 = &uStack_418;
          if (*(int *)(puVar17 + 4) <= iVar7) {
            puVar15 = puVar40;
          }
          puVar40 = uStack_418;
          if (&uStack_418 != puVar15) {
            do {
              while( true ) {
                puVar15 = puVar40;
                if (*(int *)(puVar15 + 4) <= iVar7) break;
                puVar40 = (undefined8 *)*puVar15;
                if ((undefined8 *)*puVar15 == (undefined8 *)0x0) {
                  puVar40 = puVar15;
                  goto LAB_00aa61d0;
                }
              }
              if (iVar7 <= *(int *)(puVar15 + 4)) goto LAB_00aa6224;
              puVar40 = (undefined8 *)puVar15[1];
            } while ((undefined8 *)puVar15[1] != (undefined8 *)0x0);
            puVar40 = puVar15 + 1;
LAB_00aa61d0:
            puVar18 = (undefined8 *)_Znwm(0x30);
            *(int *)(puVar18 + 4) = iVar7;
            puVar18[5] = 0;
            *puVar18 = 0;
            puVar18[1] = 0;
            puVar18[2] = puVar15;
            *puVar40 = puVar18;
            puVar15 = puVar18;
            if ((undefined8 *)*uStack_420 != (undefined8 *)0x0) {
              puVar15 = (undefined8 *)*puVar40;
              uStack_420 = (undefined8 *)*uStack_420;
            }
            FUN_00602bd0(uStack_418,puVar15);
            lStack_410 = lStack_410 + 1;
            puVar15 = puVar18;
LAB_00aa6224:
            FUN_0076ae58(&lStack_3e0,puVar15[5]);
            lVar26 = FUN_00f1cca8(&lStack_3e0,0);
            FUN_0076ad48(&lStack_3e0);
            if (lVar26 != 0) {
              FUN_00debfd0(0x3f800000,0,0x3f800000,*DAT_0133c2e8,lVar26,0xffffffff,0xffffffff);
            }
          }
        }
      }
      FUN_0076ae58(&lStack_3e0,&DAT_002fb42a);
      uVar34 = FUN_00f205b4(&lStack_3e0,0);
      FUN_0076ad48(&lStack_3e0);
      FUN_0076ae58(&lStack_3e0,&DAT_002a4ae9);
      uVar19 = FUN_00f205b4(&lStack_3e0,0);
      FUN_0076ad48(&lStack_3e0);
      FUN_0076ae58(&lStack_3e0,&DAT_002b36c4);
      uVar20 = FUN_00f205b4(&lStack_3e0,0);
      FUN_0076ad48(&lStack_3e0);
      FUN_0076ae58(&lStack_3e0,&DAT_002c8e16);
      uVar21 = FUN_00f205b4(&lStack_3e0,0);
      FUN_0076ad48(&lStack_3e0);
      lVar26 = FUN_00e4a108(param_1[0x40],&DAT_002b6cf5,&DAT_00296386,&DAT_002d2f13,&DAT_002de05d,
                            &DAT_002ac078,0);
      if (lVar26 != 0) {
        FUN_0097c08c(lVar26,uVar34);
      }
      lVar26 = FUN_00e4a108(param_1[0x40],&DAT_002b6cf5,&DAT_002ff225,&DAT_002d2f13,&DAT_002de05d,
                            &DAT_002ff249,0);
      if (lVar26 != 0) {
        FUN_0097c08c(lVar26,uVar19);
      }
      lVar26 = FUN_00e4a108(param_1[0x40],&DAT_002b6cf5,&DAT_002cc533,&DAT_002d2f13,&DAT_002de05d,
                            &DAT_002c15f7,0);
      if (lVar26 != 0) {
        FUN_0097c08c(lVar26,uVar20);
      }
      lVar26 = FUN_00e4a108(param_1[0x40],&DAT_002b6cf5,&DAT_002b00fc,&DAT_002d2f13,&DAT_002de05d,
                            &DAT_002eca96,0);
      if (lVar26 != 0) {
        FUN_0097c08c(lVar26,uVar21);
      }
      lVar26 = FUN_00e4a108(param_1[0x40],&DAT_002d3bc6,&DAT_002b6cf5,&DAT_00296386,&DAT_002d2f13,
                            &DAT_002de05d,&DAT_002ac078);
      if (lVar26 != 0) {
        FUN_0097c08c(lVar26,uVar34);
      }
      lVar26 = FUN_00e4a108(param_1[0x40],&DAT_002d3bc6,&DAT_002b6cf5,&DAT_002ff225,&DAT_002d2f13,
                            &DAT_002de05d,&DAT_002ff249);
      if (lVar26 != 0) {
        FUN_0097c08c(lVar26,uVar19);
      }
      lVar26 = FUN_00e4a108(param_1[0x40],&DAT_002d3bc6,&DAT_002b6cf5,&DAT_002cc533,&DAT_002d2f13,
                            &DAT_002de05d,&DAT_002c15f7);
      if (lVar26 != 0) {
        FUN_0097c08c(lVar26,uVar20);
      }
      lVar26 = FUN_00e4a108(param_1[0x40],&DAT_002d3bc6,&DAT_002b6cf5,&DAT_002b00fc,&DAT_002d2f13,
                            &DAT_002de05d,&DAT_002eca96);
      if (lVar26 != 0) {
        FUN_0097c08c(lVar26,uVar21);
      }
      FUN_00ab2988(&uStack_420,uStack_418);
      FUN_00ab2988(&uStack_408,uStack_400);
    }
    if (bVar39) {
LAB_00aa6634:
      bVar39 = true;
    }
    else {
      lVar26 = FUN_006d8ad4(lVar11,&DAT_002aadd4);
      if (lVar26 != 0) {
        FUN_00d1d920(lVar44,lVar26,1);
      }
      lVar26 = FUN_00e27d0c(0);
      if (((lVar26 == 0) || (lVar13 = FUN_006d8874(param_1[0x40],&DAT_002b9ae1), lVar13 == 0)) ||
         ((lVar13 = FUN_006d8874(lVar13,&DAT_002b9ae1), lVar13 == 0 ||
          (lVar13 = FUN_006d8ad4(lVar13,&DAT_002ab683), lVar13 == 0)))) goto LAB_00aa6634;
      bVar39 = true;
      FUN_00692558(lVar13,1);
      uVar34 = FUN_00e17028(&DAT_002b0104);
      FUN_0076ae58(&uStack_408,&DAT_002c0ec3);
      FUN_00e614a4(&uStack_420,*(undefined4 *)(lVar26 + 0x10),1,0);
      FUN_0076ca18(&lStack_3e0,uVar34,&uStack_408,&uStack_420);
      FUN_006921a0(lVar13,&lStack_3e0);
      FUN_0076ad48(&lStack_3e0);
      FUN_0076ad48(&uStack_420);
      FUN_0076ad48(&uStack_408);
    }
LAB_00aa6638:
    if (iVar6 == 0xc) {
      lVar11 = FUN_006d8874(param_1[0x40],&DAT_002a4b02);
      if ((lVar11 == 0) || (lVar26 = FUN_00e27d0c(0), lVar26 == 0)) goto LAB_00aa6ecc;
      uVar34 = FUN_00e17028(&DAT_002fb434);
      FUN_0076ae58(&uStack_408,&DAT_002c0ec3);
      FUN_00e614a4(&uStack_420,*(undefined4 *)(lVar26 + 0x10),1,0);
      FUN_0076ca18(&lStack_3e0,uVar34,&uStack_408,&uStack_420);
      FUN_006d8ce0(lVar11,&DAT_002ab683,&lStack_3e0);
      FUN_0076ad48(&lStack_3e0);
      FUN_0076ad48(&uStack_420);
      FUN_0076ad48(&uStack_408);
      lVar11 = param_1[0x40];
    }
    else {
      if (iVar6 == 10) {
        uVar34 = FUN_006d8874(param_1[0x40],&DAT_002cc112);
        FUN_006d7da8(uVar34,&DAT_002cc557);
        lVar11 = FUN_006d8ad4(uVar34,&DAT_002d3bc6);
        if (lVar11 != 0) {
          FUN_00d1d7c0(lVar44,lVar11,0);
        }
        lVar11 = FUN_006d8ad4(uVar34,&DAT_002fe825);
        if (lVar11 != 0) {
          FUN_00f02d38(lVar44);
          uVar19 = FUN_00e170a8();
          FUN_00e46898(lVar11,uVar19,0,0);
        }
        iVar6 = FUN_00eecca8(lVar44);
        puVar23 = &DAT_002e58df;
        if (iVar6 != 0) {
          puVar23 = &DAT_002f3bd3;
        }
        FUN_0076ae58(&uStack_408,puVar23);
        uVar19 = FUN_006d8874(param_1[0x40],&DAT_002fe39a);
        uVar19 = FUN_006d8a18(uVar19,&uStack_408);
        uVar20 = FUN_00e170a8(&uStack_408);
        iVar6 = FUN_00eecca8(lVar44);
        pcVar2 = "Angels";
        if (iVar6 != 0) {
          pcVar2 = "Demons";
        }
        FUN_0076ae58(&lStack_3e0,pcVar2);
        uVar21 = FUN_00f205b4(&lStack_3e0,0);
        FUN_0097be7c(uVar19,uVar20,uVar21);
        FUN_0076ad48(&lStack_3e0);
        lVar11 = FUN_006d8874(param_1[0x40],&DAT_002a4174);
        if (lVar11 != 0) {
          lVar26 = FUN_00e27914();
          lVar13 = FUN_00e27c74();
          if ((lVar26 != 0) && (lVar13 != 0)) {
            iVar6 = FUN_00eecca8(lVar44);
            lVar22 = 0x68;
            if (iVar6 != 0) {
              lVar22 = 0x74;
            }
            uVar9 = FUN_00ea009c(lVar26,*(undefined4 *)(lVar13 + lVar22));
            FUN_0076dbb8(auStack_c0);
            FUN_0076b6b8(&uStack_420,auStack_c0,&DAT_002a775c);
            FUN_0076dbb8(auStack_430,uVar9);
            FUN_0076b5e8(&lStack_3e0,&uStack_420,auStack_430);
            FUN_006d8ce0(lVar11,&DAT_002aadd4,&lStack_3e0);
            FUN_0076ad48(&lStack_3e0);
            FUN_0076ad48(auStack_430);
            FUN_0076ad48(&uStack_420);
            FUN_0076ad48(auStack_c0);
          }
        }
        lVar11 = FUN_006d8874(param_1[0x40],&DAT_002b9ae1);
        if (((lVar11 != 0) && (lVar11 = FUN_006d8874(lVar11,&DAT_002b9ae1), lVar11 != 0)) &&
           (lVar26 = FUN_00e27d0c(0), lVar26 != 0)) {
          uVar19 = FUN_00e17028(&DAT_002d7511);
          FUN_0076ae58(&uStack_420,&DAT_0029638a);
          FUN_00e614a4(auStack_c0,*(undefined4 *)(lVar26 + 0x10),1,0);
          FUN_0076ca18(&lStack_3e0,uVar19,&uStack_420,auStack_c0);
          FUN_006d8ce0(lVar11,&DAT_002ab683,&lStack_3e0);
          FUN_0076ad48(&lStack_3e0);
          FUN_0076ad48(auStack_c0);
          FUN_0076ad48(&uStack_420);
        }
        lStack_3e0 = CONCAT35(lStack_3e0._5_3_,0x100000024);
        uStack_398 = 0;
        puStack_3d0 = (undefined *)0x0;
        uStack_3d8 = (undefined *)0x0;
        lStack_3c0 = 0;
        uStack_3c8 = 0;
        uStack_3b0 = 0;
        uStack_3ab = 0;
        uStack_3b8 = 0;
        uStack_3b3 = 0;
        lStack_3a0 = 0;
        lStack_3a8 = 0;
        uStack_390 = 2;
        uStack_38c = 0;
        uStack_388 = 0;
        uStack_384 = 0;
        uStack_380 = 0;
        FUN_00e34674(&uStack_420,&lStack_3e0);
        lVar26 = lStack_3a8;
        lVar11 = lStack_3a0;
        if (lStack_3a8 != 0) {
          for (; lVar11 != lVar26; lVar11 = lVar11 + -0x10) {
            FUN_0076ad48(lVar11 + -0x10);
          }
          lStack_3a0 = lVar26;
          _ZdlPv(lStack_3a8);
        }
        lVar11 = lStack_3c0;
        if (lStack_3c0 != 0) {
          lVar26 = CONCAT35(uStack_3b3,uStack_3b8);
          while (lVar26 != lVar11) {
            lVar26 = lVar26 + -0x10;
            FUN_0076ad48(lVar26);
          }
          uStack_3b8 = (undefined5)lVar11;
          uStack_3b3 = (undefined3)((ulong)lVar11 >> 0x28);
          _ZdlPv(lStack_3c0);
        }
        if (uStack_3d8 != (undefined *)0x0) {
          puStack_3d0 = uStack_3d8;
          _ZdlPv();
        }
        if (uStack_420._4_4_ != 0.0) {
          lVar11 = _Znwm(0xa0);
          FUN_0097b030(lVar11,0);
          param_1[0x47] = lVar11;
          uVar19 = FUN_00f02d54(lVar44);
          FUN_0097b268(lVar11,&uStack_420,uVar19);
          lVar11 = param_1[0x47];
          FUN_0076ae58(&lStack_3e0,&DAT_002f7154);
          FUN_0097b388(lVar11,uVar34,&lStack_3e0,3,1);
          FUN_0076ad48(&lStack_3e0);
          lVar11 = FUN_006d8874(uVar34,&DAT_002f7154);
          *(undefined1 *)(lVar11 + 8) = 0;
        }
        FUN_0076ad48(&uStack_420);
        FUN_0076ad48(&uStack_408);
      }
      else if (iVar6 == 8) {
        lVar11 = FUN_006d8ad4(lVar11,&DAT_002aadd4);
        if (lVar11 != 0) {
          FUN_00d1d920(lVar44,lVar11,1);
        }
        lVar11 = FUN_00e27d0c(0);
        if (lVar11 == 0) {
          lVar11 = param_1[0x40];
          goto joined_r0x00aa59e0;
        }
        uVar34 = FUN_006d8874(param_1[0x40],&DAT_002b9ae1);
        uVar34 = FUN_006d8874(uVar34,&DAT_002b9ae1);
        uVar34 = FUN_006d8ad4(uVar34,&DAT_002ab683);
        FUN_00692558(uVar34,1);
        uVar34 = FUN_006d8874(param_1[0x40],&DAT_002b9ae1);
        uVar34 = FUN_006d8874(uVar34,&DAT_002b9ae1);
        uVar19 = FUN_00e17028(&DAT_002a895e);
        FUN_0076ae58(&uStack_408,&DAT_0029638a);
        FUN_00e614a4(&uStack_420,*(undefined4 *)(lVar11 + 0x10),1,0);
        FUN_0076ca18(&lStack_3e0,uVar19,&uStack_408,&uStack_420);
        FUN_006d8ce0(uVar34,&DAT_002ab683,&lStack_3e0);
        FUN_0076ad48(&lStack_3e0);
        FUN_0076ad48(&uStack_420);
        FUN_0076ad48(&uStack_408);
        uVar34 = FUN_00f02d4c(lVar44);
        uVar19 = FUN_00f02d54(lVar44);
        uVar34 = FUN_00e175b0(uVar34,uVar19,0);
        uVar19 = FUN_006d8874(param_1[0x40],&DAT_002b6d02);
        FUN_006d83f0(uVar19,&DAT_002da639,uVar34);
        uVar34 = FUN_006d8874(param_1[0x40],&DAT_002ba4fb);
        uVar19 = FUN_00e17028(&DAT_002f78ff);
        FUN_0076aed8(&lStack_3e0,uVar19);
        FUN_0076ae58(&uStack_420,&DAT_002923da);
        FUN_0076dbb8(auStack_c0,*(int *)(lVar44 + 0x10c) + 1);
        FUN_0076ca18(&uStack_408,&lStack_3e0,&uStack_420,auStack_c0);
        FUN_0076aa88(&lStack_3e0,&uStack_408);
        FUN_0076ad48(&uStack_408);
        FUN_0076ad48(auStack_c0);
        FUN_0076ad48(&uStack_420);
        FUN_006d8ce0(uVar34,&DAT_002b2f9b,&lStack_3e0);
        uVar19 = FUN_00eecc48(lVar44);
        FUN_00f027b0();
        FUN_0076d398(&uStack_420);
        FUN_0076b6c8(&uStack_408,&DAT_002d3de9,&uStack_420);
        uVar20 = FUN_00e171c8(&uStack_408);
        FUN_006d8ce0(uVar34,&DAT_002a4af8,uVar20);
        FUN_0076ad48(&uStack_408);
        FUN_0076ad48(&uStack_420);
        uVar20 = FUN_006d8874(uVar34,&DAT_002a097a);
        uVar21 = FUN_00ef7250(uVar19);
        FUN_006d7eac(uVar20,uVar21);
        uStack_408 = (undefined8 *)0x0;
        uStack_400 = (undefined8 *)0x0;
        FUN_00f1a81c(uVar19,&uStack_408);
        if ((int)uStack_400._4_4_ < 1) {
LAB_00aa6e64:
          iVar6 = (int)uStack_400._4_4_ + 1;
          do {
            FUN_0076da2c(&uStack_420,&DAT_002b30da,iVar6);
            lVar11 = FUN_006d87b8(uVar34,&uStack_420);
            FUN_0076ad48(&uStack_420);
            if (lVar11 != 0) {
              *(undefined1 *)(lVar11 + 8) = 0;
            }
            iVar6 = iVar6 + 1;
          } while (iVar6 != 0x1f);
        }
        else {
          uVar42 = 0;
          do {
            uVar12 = uVar42 + 1;
            FUN_0076da2c(&uStack_420,&DAT_002b30da,uVar12 & 0xffffffff);
            lVar11 = FUN_006d87b8(uVar34,&uStack_420);
            FUN_0076ad48(&uStack_420);
            if ((lVar11 != 0) && (lVar26 = FUN_00f22214(0,uStack_408[uVar42]), lVar26 != 0)) {
              uVar19 = FUN_00f02d4c();
              uVar20 = FUN_00f2713c(lVar26);
              lVar26 = FUN_00e175b0(uVar19,uVar20,0);
              FUN_006d83f0(lVar11,&DAT_002cb9f0,lVar26);
              FUN_006d7b48(lVar26,0,*(short *)(lVar26 + 0xbe) + -1,0);
              uVar42 = FUN_00f1b314(lStack_468,uStack_408[uVar42]);
              puVar23 = &DAT_002d750a;
              if ((uVar42 & 1) == 0) {
                puVar23 = &DAT_0029d351;
              }
              FUN_006d7da8(lVar11,puVar23);
            }
            uVar42 = uVar12;
          } while ((long)uVar12 < (long)(int)uStack_400._4_4_);
          if ((int)uStack_400._4_4_ < 0x1e) goto LAB_00aa6e64;
        }
        if (uStack_408 != (undefined8 *)0x0) {
          _ZdaPv();
        }
        FUN_0076ad48(&lStack_3e0);
      }
LAB_00aa6ecc:
      lVar11 = param_1[0x40];
    }
  }
joined_r0x00aa59e0:
  if (lVar11 != 0) {
    lVar11 = FUN_006d8874(lVar11,&DAT_002bd7c1);
    if (lVar11 != 0) {
      *(bool *)(lVar11 + 8) = bVar1;
      lVar11 = FUN_006d8874(lVar11,&DAT_002fe39a);
      if ((lVar11 != 0) && (lVar11 = FUN_006d8ad4(lVar11,&DAT_002aadd4), lVar11 != 0)) {
        FUN_00692558(lVar11,1);
        uVar34 = FUN_00e17028(&DAT_002cc56d);
        FUN_0076ae58(&uStack_420,&DAT_002d3df7);
        FUN_00f02d38(lVar10);
        uVar19 = FUN_00e170a8();
        FUN_0076ca18(&uStack_408,uVar34,&uStack_420,uVar19);
        FUN_0076ae58(auStack_c0,&DAT_002923da);
        FUN_0076dbb8(auStack_430,iStack_470);
        FUN_0076ca18(&lStack_3e0,&uStack_408,auStack_c0,auStack_430);
        FUN_006921a0(lVar11,&lStack_3e0);
        FUN_0076ad48(&lStack_3e0);
        FUN_0076ad48(auStack_430);
        FUN_0076ad48(auStack_c0);
        FUN_0076ad48(&uStack_408);
        FUN_0076ad48(&uStack_420);
      }
    }
    if (param_1[0x40] != 0) {
      lVar11 = FUN_006d8874(param_1[0x40],&DAT_002f3325);
      if (lVar11 != 0) {
        *(byte *)(lVar11 + 8) = bVar1 ^ 1;
      }
      if (param_1[0x40] != 0) {
        lVar11 = FUN_006d8874(param_1[0x40],&DAT_002ebf34);
        if (lVar11 != 0) {
          if ((long *)param_1[0x45] != (long *)0x0) {
            (**(code **)(*(long *)param_1[0x45] + 8))();
          }
          param_1[0x45] = 0;
          uVar34 = FUN_00ef0b28(lVar10);
          lStack_440 = param_1[0x34];
          plStack_438 = (long *)param_1[0x35];
          if (plStack_438 != (long *)0x0) {
            FUN_0129eac0(1,plStack_438 + 1);
          }
          lVar26 = FUN_008d2af4(0x43e10000,0x43e10000,3,lVar10,uVar34,&lStack_440,0,1,0,1,0);
          plVar14 = plStack_438;
          param_1[0x45] = lVar26;
          if ((plStack_438 != (long *)0x0) &&
             (lVar26 = FUN_0129eb20(0xffffffffffffffff,plStack_438 + 1), lVar26 == 0)) {
            (**(code **)(*plVar14 + 0x10))(plVar14);
            _ZNSt6__ndk119__shared_weak_count14__release_weakEv(plVar14);
          }
          lVar26 = FUN_00ef0b28(lVar10);
          FUN_00f6547c(*(undefined8 *)(lVar26 + 0x98));
          uVar34 = FUN_00f027b0();
          uVar42 = FUN_0076b7e4(uVar34,&DAT_002b012e);
          uVar9 = 3;
          if ((uVar42 & 1) == 0) {
            uVar9 = 1;
          }
          FUN_008cb104(0,param_1[0x45],uVar9);
          plVar14 = (long *)FUN_006d76d4(lVar11,&DAT_002ecac6);
          plVar41 = (long *)param_1[0x45];
          fVar48 = *(float *)(plVar14 + 4);
          fVar45 = (float)(**(code **)(*plVar14 + 0x60))();
          fVar49 = *(float *)((long)plVar14 + 0x24);
          fVar46 = (float)(**(code **)(*plVar14 + 0x68))(plVar14);
          (**(code **)(*plVar41 + 0x28))(fVar48 + fVar45 * 0.5,fVar49 + fVar46 * 0.5,plVar41);
          FUN_008c6cfc(0,param_1[0x45],0,0);
          FUN_00694130(lVar11,param_1[0x45]);
          *(undefined1 *)((long)param_1 + 0x2f4) = 1;
          if (bVar39) {
            *(undefined1 *)((long)param_1 + 0x2f4) = 0;
            lVar11 = FUN_00e29844(0);
            if (*(int *)(lVar11 + 4) != 0) {
              FUN_008cad44(0,0,0,param_1[0x45],lVar11);
            }
          }
          uVar42 = FUN_00ef0c48(lVar10);
          if ((uVar42 & 1) != 0) {
            if ((long *)param_1[0x46] != (long *)0x0) {
              (**(code **)(*(long *)param_1[0x46] + 8))();
            }
            param_1[0x46] = 0;
            lVar11 = FUN_00ef0b28(lVar10);
            uVar34 = FUN_00f6547c(*(undefined8 *)(*(long *)(lVar11 + 0xa0) + 0x98));
            lVar11 = FUN_00ef0b28(lVar10);
            lStack_450 = param_1[0x34];
            plStack_448 = (long *)param_1[0x35];
            uVar19 = *(undefined8 *)(lVar11 + 0xa0);
            if (plStack_448 != (long *)0x0) {
              FUN_0129eac0(1,plStack_448 + 1);
            }
            lVar11 = FUN_008d2af4(0x43e10000,0x43e10000,3,uVar34,uVar19,&lStack_450,0,1,0,1,0);
            plVar14 = plStack_448;
            param_1[0x46] = lVar11;
            if ((plStack_448 != (long *)0x0) &&
               (lVar11 = FUN_0129eb20(0xffffffffffffffff,plStack_448 + 1), lVar11 == 0)) {
              (**(code **)(*plVar14 + 0x10))(plVar14);
              _ZNSt6__ndk119__shared_weak_count14__release_weakEv(plVar14);
            }
            lVar11 = FUN_00ef0b28(lVar10);
            FUN_00f6547c(*(undefined8 *)(lVar11 + 0x98));
            uVar34 = FUN_00f027b0();
            uVar42 = FUN_0076b7e4(uVar34,&DAT_002b012e);
            uVar9 = 3;
            if ((uVar42 & 1) == 0) {
              uVar9 = 1;
            }
            FUN_008cb32c(0xbf800000,param_1[0x46],uVar9,0xffffffff);
            FUN_008c6cfc(0,param_1[0x46],0,0);
            uVar34 = *(undefined8 *)(**(long **)(param_1[0x45] + 0xb8) + 0x110);
            fVar45 = (float)FUN_00ef0c50(lVar10);
            fVar46 = (float)FUN_00ef0c6c(lVar10);
            FUN_00793bb8(fVar45 * 34.4,fVar46 * 34.4,0,uVar34);
            uVar34 = *(undefined8 *)(**(long **)(param_1[0x46] + 0xb8) + 0x110);
            lVar11 = FUN_00ef0b28(lVar10);
            FUN_00f6547c(*(undefined8 *)(*(long *)(lVar11 + 0xa0) + 0x98));
            fVar45 = (float)FUN_00ef0c50();
            lVar10 = FUN_00ef0b28(lVar10);
            FUN_00f6547c(*(undefined8 *)(*(long *)(lVar10 + 0xa0) + 0x98));
            fVar46 = (float)FUN_00ef0c6c();
            FUN_00793bb8(fVar45 * 34.4,fVar46 * 34.4,0,uVar34);
          }
        }
        if ((param_1[0x40] != 0) &&
           (lVar10 = FUN_006d8874(param_1[0x40],&DAT_002dafd9), lVar10 != 0)) {
          lVar11 = FUN_006d8874(lVar10,&DAT_002f7154);
          FUN_0076ae58(&uStack_408,&DAT_002a4b14);
          FUN_00e1b9c0(auStack_460,param_1 + 0x1a,&uStack_408);
          FUN_00e3963c(&lStack_3e0,auStack_460);
          if ((plStack_458 != (long *)0x0) &&
             (lVar26 = FUN_0129eb20(0xffffffffffffffff,plStack_458 + 1), lVar26 == 0)) {
            (**(code **)(*plStack_458 + 0x10))(plStack_458);
            _ZNSt6__ndk119__shared_weak_count14__release_weakEv(plStack_458);
          }
          FUN_0076ad48(&uStack_408);
          lVar26 = _Znwm(0x60);
          uVar33 = FUN_00e25f50(lVar44);
          FUN_00cecac8(lVar26,uVar33 & 1,6,lVar44,lVar11,0);
          uVar34 = *(undefined8 *)(lVar26 + 0x10);
          param_1[0x48] = lVar26;
          FUN_00694130(lVar10,uVar34);
          if (lVar11 != 0) {
            *(undefined1 *)(lVar11 + 8) = 0;
          }
          FUN_00cee1a0(param_1[0x48],1);
          *(undefined1 *)(lVar10 + 0x48) = 0;
          *(undefined1 *)((long)param_1 + 0x2ec) = 1;
          *(undefined4 *)(param_1 + 0x39) = 0x40400000;
          FUN_00e397e4(&lStack_3e0);
        }
      }
    }
  }
LAB_00aa744c:
  FUN_0076ad48(auStack_a0);
  return;
code_r0x00aa34ac:
  lVar11 = lVar11 + 8;
  lVar26 = lVar26 + -1;
  if ((ulong)uStack_3d8._4_4_ * 8 == lVar11) goto LAB_00aa4448;
  goto LAB_00aa34a0;
}



/* 00bc3284 FUN_00bc3284; mode=decompile_60_seconds */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

bool FUN_00bc3284(undefined1 param_1 [16],undefined4 param_2,long *param_3,long *param_4,
                 byte param_5)

{
  char cVar1;
  undefined1 uVar2;
  bool bVar3;
  bool bVar4;
  long *plVar5;
  long *plVar6;
  byte *pbVar7;
  bool bVar8;
  bool bVar9;
  byte bVar10;
  int iVar11;
  int iVar12;
  undefined4 uVar13;
  undefined4 uVar14;
  undefined4 uVar15;
  uint uVar16;
  int iVar17;
  undefined4 uVar18;
  ulong uVar19;
  long lVar20;
  long lVar21;
  ulong uVar22;
  int *piVar23;
  int *piVar24;
  long lVar25;
  long lVar26;
  undefined8 uVar27;
  undefined8 uVar28;
  undefined8 uVar29;
  long lVar30;
  undefined *puVar31;
  char *pcVar32;
  undefined4 *puVar33;
  long lVar34;
  undefined8 uVar35;
  undefined1 *puVar36;
  undefined8 uVar37;
  code *pcVar38;
  undefined8 uVar39;
  undefined *puVar40;
  uint uVar41;
  long *plVar42;
  undefined8 uVar43;
  undefined8 *puVar44;
  long *plVar45;
  undefined8 uVar46;
  float fVar47;
  undefined8 uStack_5c8;
  undefined8 uStack_5c0;
  undefined1 auStack_5b8 [16];
  undefined4 uStack_5a8;
  undefined1 auStack_5a0 [16];
  undefined1 auStack_590 [16];
  undefined8 auStack_580 [2];
  undefined1 auStack_570 [16];
  undefined1 auStack_560 [16];
  undefined8 auStack_550 [2];
  undefined1 auStack_540 [16];
  undefined1 auStack_530 [16];
  undefined8 auStack_520 [2];
  undefined1 auStack_510 [16];
  undefined1 auStack_500 [16];
  undefined8 auStack_4f0 [2];
  undefined1 auStack_4e0 [16];
  undefined1 auStack_4d0 [16];
  undefined8 auStack_4c0 [2];
  undefined1 auStack_4b0 [16];
  undefined1 auStack_4a0 [16];
  undefined8 auStack_490 [2];
  undefined1 auStack_480 [16];
  undefined1 auStack_470 [16];
  undefined8 auStack_460 [2];
  undefined1 auStack_450 [16];
  undefined1 auStack_440 [16];
  undefined8 auStack_430 [2];
  undefined1 auStack_420 [16];
  undefined1 auStack_410 [16];
  undefined1 auStack_400 [16];
  undefined1 auStack_3f0 [16];
  undefined1 auStack_3e0 [16];
  undefined1 auStack_3d0 [16];
  undefined1 auStack_3c0 [16];
  long alStack_3b0 [2];
  long alStack_3a0 [2];
  long alStack_390 [2];
  long alStack_380 [2];
  long alStack_370 [2];
  undefined8 uStack_360;
  undefined8 uStack_358;
  undefined1 auStack_348 [16];
  undefined1 auStack_338 [16];
  undefined8 auStack_328 [2];
  undefined1 auStack_318 [16];
  undefined1 auStack_308 [16];
  undefined1 auStack_2f8 [16];
  undefined1 auStack_2e8 [16];
  undefined1 auStack_2d8 [16];
  undefined1 auStack_2c8 [16];
  undefined1 auStack_2b8 [16];
  undefined1 auStack_2a8 [16];
  undefined1 auStack_298 [16];
  undefined1 auStack_288 [16];
  undefined1 auStack_278 [16];
  undefined1 auStack_268 [16];
  undefined1 auStack_258 [16];
  undefined1 auStack_248 [16];
  undefined1 auStack_238 [16];
  undefined1 auStack_228 [16];
  undefined1 auStack_218 [16];
  undefined1 auStack_208 [16];
  undefined1 auStack_1f8 [16];
  undefined1 auStack_1e8 [16];
  undefined1 auStack_1d8 [16];
  undefined1 auStack_1c8 [16];
  undefined1 auStack_1b8 [16];
  undefined1 auStack_1a8 [16];
  undefined1 auStack_198 [16];
  undefined1 auStack_188 [16];
  undefined1 auStack_178 [16];
  undefined1 auStack_168 [16];
  undefined1 auStack_158 [16];
  undefined1 auStack_148 [16];
  undefined1 auStack_138 [16];
  undefined1 auStack_128 [16];
  undefined1 auStack_118 [16];
  undefined1 auStack_108 [16];
  undefined1 auStack_f8 [16];
  undefined1 auStack_e8 [16];
  long alStack_d8 [2];
  undefined8 uStack_c8;
  long alStack_b8 [2];
  undefined1 auStack_a8 [16];
  undefined1 auStack_98 [16];
  undefined1 auStack_88 [16];
  undefined8 uStack_78;
  undefined8 uStack_70;
  
  iVar11 = (**(code **)(*param_4 + 0x28))(param_4);
  if (0x1e < iVar11 - 0x4e87U || (1 << (ulong)(iVar11 - 0x4e87U & 0x1f) & 0x60000023U) == 0) {
    if (iVar11 == 0x5e25) {
      FUN_0076ae58(&uStack_5c8,&DAT_002e274f);
      FUN_0076ae58(&uStack_360,"default");
      uStack_78 = CONCAT44(uStack_78._4_4_,2);
      FUN_0081bdb0(&uStack_5c8,&uStack_360,&uStack_78);
      FUN_0076ad48(&uStack_360);
      FUN_0076ad48(&uStack_5c8);
    }
    if (*(int *)*DAT_0133c298 != 8) {
      return true;
    }
    lVar20 = FUN_00dfeefc();
    if (lVar20 == 0) {
LAB_00bc33b0:
      iVar11 = *(int *)((long)param_3 + 0x10c);
      if (iVar11 == (int)param_3[0x21]) {
        iVar12 = 5;
        if (iVar11 * 2 != 0) {
          iVar12 = iVar11 * 2;
        }
        if (iVar11 < iVar12) {
          FUN_00bcd620(param_3 + 0x20);
          iVar11 = *(int *)((long)param_3 + 0x10c);
        }
      }
      *(int *)((long)param_3 + 0x10c) = iVar11 + 1;
      plVar42 = (long *)(param_3[0x20] + (long)iVar11 * 0x10);
      *plVar42 = (long)param_4;
      *(byte *)(plVar42 + 1) = param_5 & 1;
      return false;
    }
    FUN_00dfeefc();
    uVar19 = FUN_00dffd30();
    if ((uVar19 & 1) == 0) goto LAB_00bc33b0;
  }
  (**(code **)(*param_4 + 0x30))(&uStack_5c8,param_4);
  FUN_0076ad48(&uStack_5c8);
  plVar42 = DAT_0133c300;
  if (*DAT_0133c300 == 0) {
    lVar20 = _Znwm(0x118);
    FUN_00993e28();
    *plVar42 = lVar20;
    iVar12 = FUN_0099456c(lVar20,param_4);
    plVar42 = DAT_0133c388;
  }
  else {
    iVar12 = FUN_0099456c(*DAT_0133c300,param_4);
    plVar42 = DAT_0133c388;
  }
  if (iVar12 != 0) {
    DAT_0133c388 = plVar42;
    return iVar12 == 1;
  }
  DAT_0133c388 = plVar42;
  if (*plVar42 != 0) {
    iVar12 = FUN_008ac9d8(*plVar42,param_4);
    if (iVar12 != 1) goto LAB_00bc34a8;
LAB_00bc344c:
    uVar13 = (**(code **)(*param_4 + 0x28))(param_4);
    FUN_0076da2c(&uStack_5c8,&DAT_002dedc0,uVar13);
    goto LAB_00bc3470;
  }
  lVar20 = _Znwm(0x14);
  FUN_008ac990();
  *plVar42 = lVar20;
  iVar12 = FUN_008ac9d8(lVar20,param_4);
  if (iVar12 == 1) goto LAB_00bc344c;
LAB_00bc34a8:
  plVar45 = DAT_0133c4c8;
  plVar42 = DAT_0133c2b0;
  if (0x5abf < iVar11) {
    if (0x5fce < iVar11) {
      if (iVar11 < 0x691f) {
        if (iVar11 < 0x6524) {
          if (0x60c8 < iVar11) {
            if (0x624c < iVar11) {
              if (iVar11 != 0x624d) {
                if (iVar11 != 0x6422) {
                  return true;
                }
                if ((param_3[0x45] != 0) && (FUN_010410cc(), param_3[0x45] != 0)) {
                  _ZdlPv();
                }
                lVar20 = param_4[0x12];
                param_4[0x12] = 0;
                param_3[0x45] = lVar20;
                return true;
              }
              plVar42 = (long *)*DAT_0133c2b0;
              if (plVar42 == (long *)0x0) {
                return true;
              }
              iVar11 = FUN_010807d8(param_4);
              if (iVar11 != 0) {
                FUN_0076dbb8(&uStack_360);
                FUN_0076b6c8(&uStack_5c8,&DAT_003035df,&uStack_360);
                FUN_00610de8(&uStack_5c8);
                FUN_0076ad48(&uStack_5c8);
                FUN_0076ad48(&uStack_360);
                pcVar38 = *(code **)(*plVar42 + 0xc0);
                goto LAB_00bc66a8;
              }
              lVar21 = FUN_010807e0(param_4);
              lVar20 = DAT_0133c050;
              if (lVar21 != 0) {
                lVar20 = lVar21;
              }
              (**(code **)(*plVar42 + 0xb8))(plVar42,lVar20);
              goto joined_r0x00bc6fcc;
            }
            if (iVar11 == 0x60c9) {
              if ((param_3[0x44] != 0) && (FUN_01041cc4(), param_3[0x44] != 0)) {
                _ZdlPv();
              }
              lVar20 = param_4[0x12];
              param_4[0x12] = 0;
              param_3[0x44] = lVar20;
              return true;
            }
            iVar12 = 0x6153;
            goto LAB_00bc3f1c;
          }
          if (iVar11 == 0x5fcf) {
            FUN_00d12264((int)param_4[0x12] == 0,(int)param_4[0x12],
                         *(undefined4 *)((long)param_4 + 0x94));
            return true;
          }
          if (iVar11 == 0x600d) {
            uVar35 = FUN_009a0d98();
            FUN_009b31fc(uVar35,param_4);
            return true;
          }
          if (iVar11 != 0x607e) {
            return true;
          }
          uVar35 = FUN_0097dc60();
          cVar1 = (char)param_4[0x12];
          puVar40 = &DAT_00303663;
          puVar31 = &DAT_002d7dd0;
          goto LAB_00bc46fc;
        }
        if (iVar11 < 0x6595) {
          if (0x6592 < iVar11) {
            if (iVar11 == 0x6593) {
              lVar20 = FUN_0097dc60();
              if (lVar20 == 0) {
                return true;
              }
              uVar19 = FUN_009810fc();
              if (uVar19 == 0) {
                uVar19 = _Znwm(0x1e0);
                FUN_00bceaec(uVar19,0,1);
                uStack_5c8 = (long *)uVar19;
                uVar22 = FUN_0097f344(lVar20,&uStack_5c8,1,0,1);
                if ((uStack_5c8 == (long *)0x0) && (uVar19 = uVar22, uVar22 == 0)) {
                  puVar31 = &DAT_002f80dc;
                  goto LAB_00bc67d8;
                }
              }
              uVar35 = _Znwm(0x110);
              uVar37 = FUN_01044668(param_4);
              FUN_00bdfc34(uVar35,uVar37);
            }
            else {
              if (iVar11 != 0x6594) {
                return true;
              }
              lVar20 = FUN_0097dc60();
              if (lVar20 == 0) {
                return true;
              }
              uVar19 = FUN_009810fc();
              if (uVar19 == 0) {
                return true;
              }
              uVar35 = _Znwm(0x120);
              FUN_00bcf2d8(uVar35,5,0);
            }
            goto LAB_00bc6fa0;
          }
          if (iVar11 == 0x6524) {
            iVar11 = FUN_00bdf44c(param_4);
            if (iVar11 == 3) {
              (**(code **)(*(long *)*DAT_0133c2b0 + 0xe0))((long *)*DAT_0133c2b0,DAT_0133c1f0);
              return true;
            }
            if (iVar11 == 2) {
              uVar35 = FUN_00856ae8();
              FUN_0076ae58(auStack_460,&DAT_002aadd1);
              FUN_0076ae58(auStack_470,&DAT_002aadd1);
              FUN_0076ae58(auStack_480,&DAT_002aadd1);
              FUN_0085bc50(uVar35,0x13,0,auStack_460,auStack_470,auStack_480);
              FUN_0076ad48(auStack_480);
              FUN_0076ad48(auStack_470);
              puVar44 = auStack_460;
              goto LAB_00bc3474;
            }
            if (iVar11 == 1) {
              uVar35 = FUN_00856ae8();
              FUN_0076ae58(auStack_430,&DAT_002aadd1);
              FUN_0076ae58(auStack_440,&DAT_002aadd1);
              FUN_0076ae58(auStack_450,&DAT_002aadd1);
              FUN_0085bc50(uVar35,0xe,0,auStack_430,auStack_440,auStack_450);
              FUN_0076ad48(auStack_450);
              FUN_0076ad48(auStack_440);
              puVar44 = auStack_430;
              goto LAB_00bc3474;
            }
            puVar31 = &DAT_00296a33;
          }
          else {
            if (iVar11 != 0x6592) {
              return true;
            }
            lVar20 = FUN_0097dc60();
            if (lVar20 == 0) {
              return true;
            }
            uVar19 = FUN_009810fc();
            if (uVar19 == 0) {
              return true;
            }
            plVar42 = (long *)FUN_00bcee70();
            iVar11 = (**(code **)(*plVar42 + 0x1b8))();
            if (iVar11 != 5) {
              return true;
            }
            iVar11 = FUN_01043d3c(param_4);
            if (iVar11 < 2) {
              if (iVar11 == 0) {
                uVar35 = _Znwm(0x130);
                uVar37 = FUN_01043d34(param_4);
                uVar13 = FUN_01043d44(param_4);
                FUN_00bcfb44(uVar35,uVar37,uVar13,0);
                goto LAB_00bc6fa0;
              }
              if (iVar11 == 1) goto LAB_00bc85e4;
            }
            else {
              if (iVar11 == 2) goto LAB_00bc8a9c;
              if (iVar11 == 0xb) {
LAB_00bc7958:
                uVar35 = _Znwm(0x120);
                uVar37 = 10;
                goto LAB_00bc8aac;
              }
            }
            puVar31 = &DAT_002db6fb;
          }
          goto LAB_00bc6604;
        }
        if (0x6597 < iVar11) {
          if (iVar11 != 0x6598) {
            if (iVar11 != 0x65e5) {
              return true;
            }
            lVar20 = *DAT_0133c2d8;
            if (lVar20 == 0) {
              return true;
            }
            FUN_008c03ac(lVar20);
            FUN_008c044c(lVar20);
            return true;
          }
          lVar20 = FUN_0097dc60();
          if (lVar20 == 0) {
            return true;
          }
          uVar19 = FUN_009810fc();
          iVar11 = FUN_0104448c(param_4);
          uVar16 = FUN_01044484(param_4);
          if (iVar11 < 2) {
            if (iVar11 == 0) {
              uVar35 = _Znwm(0x120);
              uVar37 = 100;
            }
            else {
              if (iVar11 != 1) {
                return true;
              }
              uVar35 = _Znwm(0x120);
              uVar37 = 0x65;
            }
          }
          else if (iVar11 == 2) {
            uVar35 = _Znwm(0x120);
            uVar37 = 0x66;
          }
          else {
            if (iVar11 != 3) {
              return true;
            }
            uVar35 = _Znwm(0x120);
            uVar37 = 0x67;
          }
          FUN_00bcf2d8(uVar35,uVar37,uVar16 & 1);
          goto LAB_00bc6fa0;
        }
        if (iVar11 != 0x6595) {
          if (iVar11 != 0x6597) {
            return true;
          }
          uVar35 = FUN_010441a4(param_4);
          lVar20 = FUN_010441ac(param_4);
          lVar21 = *DAT_0133c298;
          if (((lVar21 != 0) && (uVar19 = FUN_00641870(uVar35), (uVar19 & 1) == 0)) &&
             (*(int *)(lVar20 + 4) != 0)) {
            uVar13 = *(undefined4 *)(lVar21 + 0x18);
            uVar15 = FUN_0064191c(uVar35);
            uVar14 = FUN_00641924(uVar35);
            FUN_00be624c(lVar21,uVar13,lVar20,uVar15,uVar14);
          }
          lVar20 = FUN_0097dc60();
          if (lVar20 == 0) {
            return true;
          }
          uVar19 = FUN_009810fc();
          if (uVar19 == 0) {
            uVar19 = _Znwm(0x1e0);
            FUN_00bceaec(uVar19,0,1);
            uStack_5c8 = (long *)uVar19;
            uVar22 = FUN_0097f344(lVar20,&uStack_5c8,1,0,1);
            if ((uStack_5c8 == (long *)0x0) && (uVar19 = uVar22, uVar22 == 0)) {
              puVar31 = &DAT_00292ff4;
              goto LAB_00bc67d8;
            }
          }
          uVar35 = _Znwm(0x118);
          FUN_00bd00c4(uVar35,0);
          goto LAB_00bc6fa0;
        }
        lVar20 = FUN_0097dc60();
        if (lVar20 == 0) {
          return true;
        }
        uVar19 = FUN_009810fc();
        if (uVar19 == 0) {
          return true;
        }
        plVar42 = (long *)FUN_0097fb60(lVar20);
        if (plVar42 == (long *)0x0) {
          return true;
        }
        iVar11 = (**(code **)(*plVar42 + 0x1b8))();
        if (iVar11 != 0xf) {
          return true;
        }
        lVar20 = FUN_00bcee70(uVar19);
        if (lVar20 == 0) {
          return true;
        }
        plVar42 = (long *)FUN_00bcee70(uVar19);
        iVar11 = (**(code **)(*plVar42 + 0x1b8))();
        if (iVar11 != 1) {
          plVar42 = (long *)FUN_00bcee70(uVar19);
          iVar11 = (**(code **)(*plVar42 + 0x1b8))();
          if (iVar11 != 2) {
            return true;
          }
        }
        uVar37 = FUN_01044930(param_4);
        plVar42 = (long *)FUN_00bcee70(uVar19);
        iVar11 = (**(code **)(*plVar42 + 0x1b8))();
        FUN_00bcee70(uVar19);
        if (iVar11 == 2) {
          uVar35 = FUN_00bdf938();
        }
        else {
          uVar35 = FUN_00be0d38();
        }
        uVar22 = FUN_0076b864(uVar35,uVar37);
        if ((uVar22 & 1) == 0) {
LAB_00bc8a84:
          uVar35 = _Znwm(0x120);
          uVar37 = 4;
          uVar39 = 1;
        }
        else {
          iVar11 = FUN_01044940(param_4);
          if (iVar11 < 5) {
            if (iVar11 < 2) {
              if (iVar11 == 0) {
                uVar13 = FUN_01044948(param_4);
                uVar39 = FUN_01044938(param_4);
                uVar43 = FUN_01044958(param_4);
                lVar20 = FUN_01044960(param_4);
                uVar15 = FUN_01044950(param_4);
                uVar22 = FUN_00641870(uVar43);
                if ((uVar22 & 1) != 0) {
                  return true;
                }
                if (*(int *)(lVar20 + 4) == 0) {
                  return true;
                }
                uVar35 = _Znwm(0x158);
                uVar14 = FUN_0064191c(uVar43);
                uVar18 = FUN_00641924(uVar43);
                FUN_00bdf488(uVar35,uVar37,uVar13,uVar15,uVar39,lVar20,uVar14,uVar18);
                goto LAB_00bc6fa0;
              }
              if (iVar11 == 1) goto LAB_00bc85e4;
            }
            else {
              if (iVar11 == 2) goto LAB_00bc8a9c;
              if (iVar11 == 4) goto LAB_00bc8a84;
            }
LAB_00bc8ad0:
            puVar31 = &DAT_002ed29e;
            goto LAB_00bc6604;
          }
          if (iVar11 < 7) {
            if (iVar11 == 5) {
              uVar35 = _Znwm(0x120);
              uVar37 = 5;
              uVar39 = 1;
              goto LAB_00bc8ab0;
            }
            if (iVar11 != 6) goto LAB_00bc8ad0;
            uVar35 = _Znwm(0x120);
            uVar37 = 9;
          }
          else {
            if (iVar11 != 7) {
              if (iVar11 == 0xb) goto LAB_00bc7958;
              goto LAB_00bc8ad0;
            }
            uVar35 = _Znwm(0x120);
            uVar37 = 8;
          }
LAB_00bc8aac:
          uVar39 = 0;
        }
LAB_00bc8ab0:
        FUN_00bcf2d8(uVar35,uVar37,uVar39);
LAB_00bc6fa0:
        FUN_00bcf028(uVar19,uVar35);
        return true;
      }
      if (iVar11 < 0x72c5) {
        if (iVar11 < 0x6e73) {
          if (iVar11 - 0x6e03U < 2) goto switchD_00bc34f4_caseD_5686;
          if (iVar11 == 0x691f) {
            uVar35 = FUN_00bc9978();
            FUN_00cae388(uVar35,param_4);
            return true;
          }
          if (iVar11 != 0x697a) {
            return true;
          }
          lVar20 = FUN_0097dc60();
          if (lVar20 == 0) {
            return true;
          }
          uVar19 = FUN_009810fc();
          if (uVar19 == 0) {
            return true;
          }
          plVar42 = (long *)FUN_00bcee70();
          iVar11 = (**(code **)(*plVar42 + 0x1b8))();
          if (iVar11 != 9) {
            return true;
          }
          iVar11 = FUN_01029f3c(param_4);
          if (iVar11 == 2) {
LAB_00bc8a9c:
            uVar35 = _Znwm(0x120);
            uVar37 = 1;
            goto LAB_00bc8aac;
          }
          if (iVar11 == 1) {
LAB_00bc85e4:
            uVar35 = _Znwm(0x120);
            uVar37 = 2;
            goto LAB_00bc8aac;
          }
          if (iVar11 == 0) {
            uVar35 = _Znwm(0x130);
            uVar37 = FUN_01029f34(param_4);
            uVar13 = FUN_01029f44(param_4);
            FUN_00bcfb44(uVar35,uVar37,uVar13,1);
            goto LAB_00bc6fa0;
          }
          puVar31 = &DAT_002e9b77;
LAB_00bc6604:
          FUN_0076da2c(&uStack_5c8,puVar31);
          FUN_00610de8(&uStack_5c8);
        }
        else if (iVar11 == 0x6e73) {
          lVar20 = param_4[0x12];
          if ((((int)param_4[0x15] == 1) && (lVar21 = FUN_0097dc60(), lVar21 != 0)) &&
             (lVar21 = FUN_0097f85c(lVar21,0x4c), lVar21 != 0)) {
            FUN_00b8e7ac(lVar21,param_4);
            return true;
          }
          if ((int)lVar20 == 4) {
            return true;
          }
          lVar21 = FUN_0097dc60();
          if (lVar21 == 0) {
            return true;
          }
          uVar35 = FUN_00e17028(&DAT_002aca41);
          uVar37 = FUN_00e17028(&DAT_002aca66);
          FUN_0076aed8(&uStack_5c8,uVar37);
          uVar16 = (int)lVar20 - 1;
          if (uVar16 < 3) {
            uVar37 = FUN_00e17028(&DAT_0030f5e4 + *(int *)(&DAT_0030f5e4 + (ulong)uVar16 * 4));
            FUN_0076b33c(&uStack_5c8,uVar37);
          }
          lVar20 = _Znwm(0x1b8);
          FUN_00b91124(lVar20,uVar35,&uStack_5c8);
          uStack_360 = lVar20;
          FUN_0097f344(lVar21,&uStack_360,1,0,1);
        }
        else {
          if (iVar11 != 0x700e) {
            if (iVar11 != 0x7011) {
              return true;
            }
            plVar42 = (long *)*DAT_0133c2b0;
            if (plVar42 == (long *)0x0) {
              return true;
            }
            pcVar38 = *(code **)(*plVar42 + 200);
LAB_00bc66a8:
            (*pcVar38)(plVar42);
            return true;
          }
          lVar20 = FUN_0097dc60();
          if (lVar20 == 0) {
            return true;
          }
          lVar21 = param_4[0x12];
          if ((int)lVar21 == 0) {
            return true;
          }
          lVar30 = FUN_0097f85c(lVar20,0x35);
          if (lVar30 != 0) {
            FUN_00a8329c(lVar30,(int)lVar21);
            return true;
          }
          FUN_0076da2c(&uStack_5c8,&DAT_002d4689);
          uVar35 = FUN_00e171c8(&uStack_5c8);
          FUN_0097e74c(0,lVar20,uVar35,0xffffffff,0);
        }
      }
      else {
        if (0x752c < iVar11) {
          if (49000 < iVar11) {
            if (iVar11 != 0xbf69) {
              if (iVar11 != 0xbf6b) {
                return true;
              }
              FUN_00bc27dc(param_3);
              if (0 < *(int *)((long)param_4 + 0x9c)) {
                lVar20 = 0;
                do {
                  uVar35 = *(undefined8 *)(param_4[0x12] + lVar20 * 8);
                  uVar19 = _Znwm(0x38);
                  FUN_00bc9e1c(uVar19,uVar35);
                  uStack_5c8 = (long *)uVar19;
                  FUN_00bc9f04(param_3 + 0x41,&uStack_5c8);
                  lVar20 = lVar20 + 1;
                } while (lVar20 < *(int *)((long)param_4 + 0x9c));
              }
              FUN_00bc2d4c(param_3);
              return true;
            }
            uStack_5c8 = param_4;
            uVar19 = FUN_00bc9b60();
            if ((uVar19 & 1) != 0) {
              FUN_00bc9be0(param_3,param_4);
              return true;
            }
            piVar23 = (int *)FUN_00bdfefc(param_4);
            if (0 < *(int *)((long)param_3 + 0x204)) {
              if (piVar23 == (int *)0x0) {
                lVar20 = 0;
                do {
                  FUN_00bdfefc(*(undefined8 *)(param_3[0x3f] + lVar20 * 8));
                  lVar20 = lVar20 + 1;
                } while (lVar20 < *(int *)((long)param_3 + 0x204));
              }
              else {
                lVar20 = 0;
                do {
                  plVar42 = *(long **)(param_3[0x3f] + lVar20 * 8);
                  piVar24 = (int *)FUN_00bdfefc(plVar42);
                  if ((piVar24 != (int *)0x0) && (*piVar23 == *piVar24)) {
                    *(long **)(param_3[0x3f] + lVar20 * 8) = param_4;
                    (**(code **)(*plVar42 + 0x38))(plVar42);
                    (**(code **)(*plVar42 + 8))(plVar42);
                    return false;
                  }
                  lVar20 = lVar20 + 1;
                } while (lVar20 < *(int *)((long)param_3 + 0x204));
              }
            }
            FUN_00bc9dbc(param_3 + 0x3f,&uStack_5c8);
            return false;
          }
          if (iVar11 != 0x752d) {
            if (iVar11 == 0x9c41) {
              uVar35 = FUN_0086e1e4();
              FUN_0086ff14(uVar35,param_4);
              return true;
            }
            return true;
          }
          FUN_0076dbb8(&uStack_5c8,(int)param_4[0x12]);
          FUN_0076ae58(&uStack_360,&DAT_002c962a);
          FUN_0076ae58(&uStack_78,&DAT_002c1e68);
          FUN_010c5bbc(&uStack_360,&uStack_78,&uStack_5c8);
LAB_00bc4ff8:
          FUN_0076ad48(&uStack_78);
          goto LAB_00bc5000;
        }
        if (iVar11 == 0x72c5) goto switchD_00bc34f4_caseD_5686;
        if (iVar11 != 0x731b) {
          if (iVar11 != 0x74cc) {
            return true;
          }
          lVar20 = *DAT_0133c2b0;
          if (lVar20 == 0) {
            return true;
          }
          uVar35 = FUN_00bd03b8(param_4);
          FUN_00c153dc(lVar20,uVar35);
          return true;
        }
        FUN_0076aa74(&uStack_5c8);
        FUN_0076aa74(auStack_5b8);
        uStack_5a8 = 0;
        FUN_0076b33c(&uStack_5c8,param_4 + 0x13);
        FUN_0076b33c(auStack_5b8,param_4 + 0x15);
        uStack_5a8 = (undefined4)param_4[0x12];
        lVar20 = FUN_00f18f94();
        if ((lVar20 == 0) || (*(int *)(lVar20 + 0x8c) < 1)) {
          *(undefined1 *)(param_3 + 0x15) = 1;
          FUN_00bc9a38(param_3 + 0x16,&uStack_5c8);
        }
        else {
          FUN_00bc99c4(param_3 + 0x1b,&uStack_5c8);
        }
        FUN_0076ad48(auStack_5b8);
      }
      goto LAB_00bc3470;
    }
    if (iVar11 < 0x5de6) {
      if (iVar11 < 0x5ba3) {
        if (0x5ba0 < iVar11) {
          if (iVar11 != 0x5ba1) {
            if (iVar11 == 0x5ba2) {
              uVar35 = FUN_00bc992c();
              FUN_00c9d8a8(uVar35,param_4);
              return true;
            }
            return true;
          }
          lVar20 = FUN_00e01b60();
          if (lVar20 == 0) {
            return true;
          }
          lVar20 = FUN_00e02dd4();
          if (lVar20 == 0) {
            return true;
          }
          FUN_00c611d4(lVar20,param_4);
          return false;
        }
        if (iVar11 == 0x5ac0) {
          lVar20 = FUN_0097dc60();
          if (lVar20 == 0) {
            return true;
          }
          uVar35 = FUN_0097dc60();
          lVar20 = FUN_0097f85c(uVar35,0x1b);
          if (lVar20 == 0) {
            return true;
          }
          FUN_00a1c72c(lVar20,(int)param_4[0x12],*(undefined4 *)((long)param_4 + 0x94));
          return true;
        }
        if (iVar11 != 0x5ba0) {
          return true;
        }
        lVar20 = FUN_00c403fc();
        if (lVar20 == 0) {
          return true;
        }
        lVar20 = FUN_00df5044();
        if (lVar20 != 0) {
          uVar35 = FUN_00df5044();
          FUN_00df5ac4(uVar35,*(undefined4 *)((long)param_4 + 0xa4));
        }
        lVar20 = FUN_00c403fc();
        if (*(long **)(lVar20 + 0xbf0) != (long *)0x0) {
          (**(code **)(**(long **)(lVar20 + 0xbf0) + 0x38))();
          if (*(long **)(lVar20 + 0xbf0) != (long *)0x0) {
            (**(code **)(**(long **)(lVar20 + 0xbf0) + 8))();
          }
        }
        *(long **)(lVar20 + 0xbf0) = param_4;
        return false;
      }
      if (0x5cdd < iVar11) {
        if (iVar11 == 0x5cde) {
          lVar20 = FUN_00ba908c(1);
          if (lVar20 != 0) {
            uVar35 = FUN_00ba908c();
            uVar37 = FUN_0102ca48(param_4);
            FUN_00bab300(uVar35,uVar37);
          }
          lVar20 = FUN_00ba35ec();
          if (lVar20 != 0) {
            uVar35 = FUN_00ba35ec();
            uVar37 = FUN_0102ca48(param_4);
            FUN_00ba3e04(uVar35,uVar37);
          }
          lVar20 = FUN_0086410c();
          if (lVar20 == 0) {
            return true;
          }
          uVar35 = FUN_0086410c();
          uVar37 = FUN_0102ca48(param_4);
          FUN_00864428(uVar35,uVar37);
          return true;
        }
        if (iVar11 != 0x5db4) {
          return true;
        }
        lVar20 = FUN_0097dc60();
        if (lVar20 == 0) {
          return true;
        }
        uVar35 = FUN_0104b594(param_4);
        lVar20 = FUN_00de4538();
        if (lVar20 != 0) {
          uVar13 = FUN_0104b59c(param_4);
          FUN_00de4564(lVar20,uVar35,uVar13);
        }
        thunk_FUN_008435f8(uVar35);
        uVar35 = FUN_0097dc60();
        uVar37 = FUN_00e17028(&DAT_002aca2c);
        FUN_0097e4b8(0,uVar35,uVar37,0xffffffff);
        return true;
      }
      if (iVar11 == 0x5ba3) {
        uVar35 = FUN_00bc992c();
        FUN_00c9e01c(uVar35,param_4);
        return true;
      }
      if (iVar11 != 0x5bc6) {
        return true;
      }
      if (*(char *)(*DAT_0133c2b0 + 0x40) != '\0') {
        uVar19 = FUN_00c15810();
        if ((uVar19 & 1) != 0) {
          return true;
        }
        uVar19 = FUN_00874c28(*plVar42);
        if ((uVar19 & 1) != 0) {
          return true;
        }
      }
      if (((char)param_4[0x16] != '\0') && (*(char *)(*plVar42 + 0x40) != '\0')) {
LAB_00bc3aa4:
        lVar20 = FUN_0097dc60();
        if (lVar20 == 0) {
          return true;
        }
        uVar35 = FUN_0097dc60();
        uStack_5c8 = (long *)_Znwm(0x248);
        uVar37 = 99;
LAB_00bc5c78:
        FUN_00bb2010(uStack_5c8,uVar37,param_4,0);
        uVar16 = FUN_00bc9158();
        FUN_0097f344(uVar35,&uStack_5c8,1,0,uVar16 & 1);
        return true;
      }
      lVar21 = FUN_0104b36c(param_4);
      if (lVar21 != 0) {
        if ((*DAT_0133c2d0 == 0) || (uVar19 = FUN_00bc91b8(), (uVar19 & 1) == 0)) goto LAB_00bc799c;
        FUN_0104b324(param_4,lVar21);
        uVar35 = FUN_0097dc60();
        uStack_5c8 = (long *)_Znwm(0x248);
        uVar37 = 0xd;
        goto LAB_00bc5c78;
      }
      uVar35 = FUN_0097dc60();
      FUN_0076ae58(&uStack_5c8,&DAT_002f812b);
      FUN_00982bd8(uVar35,&uStack_5c8,1,0);
      goto LAB_00bc3470;
    }
    switch(iVar11) {
    case 0x5de6:
      FUN_00d12634((int)param_4[0x12] == 0,(int)param_4[0x12],param_4[0x13]);
      return true;
    case 0x5de7:
    case 0x5de8:
    case 0x5de9:
    case 0x5dea:
    case 0x5deb:
    case 0x5dec:
    case 0x5ded:
    case 0x5dee:
    case 0x5def:
    case 0x5df0:
    case 0x5df1:
    case 0x5df2:
    case 0x5df3:
    case 0x5df4:
    case 0x5df5:
    case 0x5df6:
    case 0x5df7:
    case 0x5df8:
    case 0x5df9:
    case 0x5dfa:
    case 0x5dfb:
    case 0x5dfc:
    case 0x5dfd:
    case 0x5dfe:
    case 0x5dff:
    case 0x5e00:
    case 0x5e01:
    case 0x5e02:
    case 0x5e03:
    case 0x5e04:
    case 0x5e05:
    case 0x5e06:
    case 0x5e07:
    case 0x5e08:
    case 0x5e09:
    case 0x5e0a:
    case 0x5e0b:
    case 0x5e0c:
    case 0x5e0d:
    case 0x5e0e:
    case 0x5e0f:
    case 0x5e10:
    case 0x5e11:
    case 0x5e12:
    case 0x5e13:
    case 0x5e14:
    case 0x5e15:
    case 0x5e16:
    case 0x5e17:
    case 0x5e18:
    case 0x5e19:
    case 0x5e1a:
    case 0x5e1b:
    case 0x5e1c:
    case 0x5e1d:
    case 0x5e1e:
    case 0x5e1f:
    case 0x5e20:
    case 0x5e21:
    case 0x5e22:
    case 0x5e23:
    case 0x5e24:
    case 0x5e26:
    case 0x5e27:
    case 0x5e2a:
    case 0x5e2b:
    case 0x5e2e:
    case 0x5e31:
    case 0x5e32:
    case 0x5e36:
    case 0x5e37:
    case 0x5e38:
    case 0x5e39:
    case 0x5e3a:
    case 0x5e3b:
    case 0x5e3e:
    case 0x5e3f:
    case 0x5e40:
    case 0x5e44:
    case 0x5e45:
    case 0x5e46:
    case 0x5e47:
    case 0x5e48:
    case 0x5e49:
    case 0x5e4a:
    case 0x5e4b:
    case 0x5e4c:
    case 0x5e4d:
    case 0x5e4e:
    case 0x5e4f:
    case 0x5e50:
    case 0x5e51:
    case 0x5e52:
    case 0x5e53:
    case 0x5e54:
    case 0x5e55:
    case 0x5e56:
    case 0x5e57:
    case 0x5e58:
    case 0x5e59:
    case 0x5e5a:
    case 0x5e5b:
    case 0x5e5c:
    case 0x5e5d:
    case 0x5e5e:
    case 0x5e5f:
    case 0x5e60:
    case 0x5e61:
    case 0x5e62:
    case 0x5e63:
    case 0x5e64:
    case 0x5e65:
    case 0x5e66:
    case 0x5e67:
    case 0x5e68:
    case 0x5e69:
    case 0x5e6a:
    case 0x5e6b:
    case 0x5e6c:
    case 0x5e6d:
    case 0x5e6e:
    case 0x5e6f:
    case 0x5e70:
      return true;
    case 0x5e25:
      FUN_0076ae58(&uStack_5c8,&DAT_002dee54);
      FUN_0076ae58(&uStack_360,"default");
      uStack_78 = CONCAT44(uStack_78._4_4_,2);
      FUN_0081bdb0(&uStack_5c8,&uStack_360,&uStack_78);
      FUN_0076ad48(&uStack_360);
      FUN_0076ad48(&uStack_5c8);
      lVar20 = FUN_01065d3c(param_4);
      lVar21 = FUN_01065d4c(param_4);
      lVar30 = FUN_00dfeefc();
      *(undefined4 *)(lVar30 + 8) = 4;
      uVar35 = FUN_00dfeefc();
      uVar13 = FUN_01065de0(param_4);
      if (param_3[0x44] != 0) {
        FUN_01041cc4(param_3[0x44]);
        if (param_3[0x44] != 0) {
          _ZdlPv();
        }
        param_3[0x44] = 0;
      }
      if (param_3[0x45] != 0) {
        FUN_010410cc();
        if (param_3[0x45] != 0) {
          _ZdlPv();
        }
        param_3[0x45] = 0;
      }
      FUN_00e00118(uVar35,lVar20,lVar21,uVar13,1);
      uVar13 = FUN_00e8f4a0(lVar21);
      *(undefined4 *)(param_3 + 0x2b) = uVar13;
      uVar19 = FUN_00bc9240();
      if (((uVar19 & 1) == 0) && (lVar30 = FUN_00856ae8(), -1 < *(int *)(lVar30 + 0x54))) {
        uVar35 = FUN_00bc8f20();
        lVar30 = FUN_00856ae8();
        FUN_008ad04c(uVar35,*(undefined4 *)(lVar30 + 0x54));
        lVar30 = FUN_00856ae8();
        *(undefined4 *)(lVar30 + 0x54) = 0xffffffff;
        FUN_00bc9240();
        bVar8 = false;
      }
      else {
        uVar19 = FUN_00bc9240();
        if ((uVar19 & 1) == 0) {
          uVar19 = FUN_00e8ff94(lVar21);
          if ((uVar19 & 1) != 0) {
            uVar35 = FUN_00dfeefc();
            FUN_00dffc38(uVar35,4);
          }
          bVar8 = true;
        }
        else {
          bVar8 = false;
        }
      }
      iVar11 = *(int *)(lVar21 + 0x278);
      lVar30 = *DAT_0133c2b0;
      *(int *)(param_3 + 0x46) = iVar11;
      if (*(char *)(lVar30 + 0x40) != '\0') {
        *(bool *)(lVar30 + 0x2c0) = iVar11 < 2;
      }
      uVar35 = FUN_00856ae8();
      uVar37 = FUN_01014598(lVar20);
      uVar13 = FUN_0105ad8c(uVar37,0xf,0);
      FUN_0085e500(uVar35,uVar13);
      FUN_00ce5e7c(lVar20 + 0x28);
      uVar35 = FUN_01014598(lVar20);
      uVar37 = FUN_008234c0();
      FUN_0105d91c(uVar35,uVar37);
      lVar30 = FUN_008234c0();
      param_3[0x2c] = lVar30;
      lVar30 = FUN_008234c0();
      param_3[0x2d] = lVar30;
      lVar30 = FUN_008234c0();
      param_3[0x2e] = lVar30;
      lVar30 = FUN_008234c0();
      param_3[0x2f] = lVar30;
      lVar30 = FUN_008234c0();
      param_3[0x30] = lVar30;
      lVar30 = FUN_008234c0();
      param_3[0x31] = lVar30;
      lVar30 = FUN_008234c0();
      param_3[0x32] = lVar30;
      lVar30 = FUN_008234c0();
      param_3[0x33] = lVar30;
      lVar30 = FUN_008234c0();
      param_3[0x34] = lVar30;
      lVar30 = FUN_008234c0();
      param_3[0x35] = lVar30;
      lVar30 = FUN_008234c0();
      param_3[0x36] = lVar30;
      lVar30 = FUN_008234c0();
      param_3[0x37] = lVar30;
      lVar30 = FUN_008234c0();
      param_3[0x39] = lVar30;
      lVar30 = FUN_008234c0();
      param_3[0x3a] = lVar30;
      lVar30 = FUN_008234c0();
      param_3[0x38] = lVar30;
      if ((bVar8) && (uVar19 = FUN_00e8ff94(lVar21), (uVar19 & 1) != 0)) {
        uVar35 = FUN_00dfeefc();
        FUN_00e00280(uVar35,3);
        lVar21 = FUN_010145a0(lVar20);
        if (lVar21 != 0) {
          FUN_010145a0(lVar20);
          FUN_00c5f5c8();
        }
      }
      if (*(int *)((long)param_3 + 0x214) != 0) {
        return true;
      }
      if (param_3[5] != 0) {
        return true;
      }
      if (*(int *)((long)param_3 + 0x204) == 0) {
        uVar35 = _Znwm(0x98);
        FUN_00be0570();
        (**(code **)(*param_3 + 0x18))(param_3,uVar35);
        return true;
      }
      return true;
    case 0x5e28:
      uVar13 = FUN_01065bb0(param_4);
      uVar15 = FUN_01065ba8(param_4);
      FUN_0076da2c(&uStack_5c8,&DAT_002dede8,uVar13,uVar15);
      FUN_00610de8(&uStack_5c8);
      FUN_0076ad48(&uStack_5c8);
      FUN_0076ae58(&uStack_5c8,&DAT_002b08ed);
      FUN_0076ae58(&uStack_360,&DAT_002b08f6);
      FUN_010c5c20(&uStack_5c8,&uStack_360);
      FUN_0076ad48(&uStack_360);
      FUN_0076ad48(&uStack_5c8);
      uVar35 = FUN_00856ae8();
      FUN_0076ae58(auStack_328,&DAT_002aadd1);
      FUN_0076ae58(auStack_338,&DAT_002aadd1);
      FUN_0076ae58(auStack_348,&DAT_002aadd1);
      FUN_0085bc50(uVar35,1,0,auStack_328,auStack_338,auStack_348);
      FUN_0076ad48(auStack_348);
      FUN_0076ad48(auStack_338);
      puVar44 = auStack_328;
      break;
    case 0x5e29:
      lVar20 = FUN_00e01b60();
      if (lVar20 != 0) {
        uVar35 = FUN_00e01b60();
        FUN_00e02e8c(uVar35,0);
        lVar20 = FUN_0097dc60();
        if (lVar20 != 0) {
          iVar11 = (int)param_4[0x12];
          if (iVar11 < 2) {
            if (iVar11 == 0) {
              uVar19 = FUN_00bc9240();
              if ((uVar19 & 1) != 0) goto LAB_00bc7a20;
              puVar31 = &DAT_002ed077;
            }
            else {
              if (iVar11 != 1) goto LAB_00bc7a20;
              puVar31 = &DAT_002c1e74;
            }
          }
          else if (iVar11 == 2) {
            puVar31 = &UNK_002c5ae2;
          }
          else {
            if (iVar11 != 3) goto LAB_00bc7a20;
            puVar31 = &DAT_002ac9d8;
          }
          uVar35 = FUN_0097dc60();
          uVar37 = FUN_00e17028(puVar31);
          FUN_0097e4b8(0,uVar35,uVar37,0xffffffff);
        }
      }
LAB_00bc7a20:
      FUN_0099b5c4();
      FUN_009990f4();
      lVar20 = FUN_00bc8f20();
      if (lVar20 == 0) {
        return true;
      }
      FUN_00bc8f20();
      FUN_008ad0e4();
      FUN_00bc8f20();
      uVar13 = FUN_008ad0c8();
      FUN_0076da2c(&uStack_5c8,&DAT_002c9635,uVar13);
      FUN_0076ad48(&uStack_5c8);
      uVar35 = FUN_00bc8f20();
      FUN_008acc74(uVar35,1);
      return true;
    case 0x5e2c:
      lVar20 = FUN_0097dc60();
      if (lVar20 == 0) goto LAB_00bc871c;
      FUN_010651e8(&uStack_5c8,param_4);
      if (uStack_5c8._4_4_ == 0) {
        iVar11 = FUN_010651e0(param_4);
        if (iVar11 == 0xd) {
          uVar35 = FUN_0097dc60();
          uStack_360._0_4_ = FUN_0097e3bc();
          puVar31 = &DAT_002ab95c;
        }
        else {
          iVar11 = FUN_010651e0(param_4);
          if (iVar11 == 0x1c) {
            uVar35 = FUN_0097dc60();
            uStack_360._0_4_ = FUN_0097e3bc();
            puVar31 = &DAT_002a0873;
          }
          else {
            iVar11 = FUN_010651e0(param_4);
            if (iVar11 != 0x11) {
              iVar11 = FUN_010651e0(param_4);
              if (iVar11 == 0x1a) {
                uVar35 = FUN_00e170a8(&uStack_5c8);
                FUN_01065268(&uStack_360,param_4,uVar35);
                uVar35 = FUN_0097dc60();
                uVar13 = FUN_0097e3bc();
                uStack_78 = CONCAT44(param_2,uVar13);
                puVar44 = &uStack_360;
              }
              else {
                uVar35 = FUN_0097dc60();
                uVar13 = FUN_0097e3bc();
                uStack_78 = CONCAT44(param_2,uVar13);
                FUN_010651e8(&uStack_360,param_4);
                puVar44 = (undefined8 *)FUN_00e171c8(&uStack_360);
              }
              FUN_0097e548(0,uVar35,&uStack_78,puVar44,0xffffffff,0);
              goto LAB_00bc870c;
            }
            uVar35 = FUN_0097dc60();
            uStack_360._0_4_ = FUN_0097e3bc();
            puVar31 = &DAT_002aca19;
          }
        }
        uStack_360 = CONCAT44(param_2,(undefined4)uStack_360);
        uVar37 = FUN_00e17028(puVar31);
        FUN_0097e548(0,uVar35,&uStack_360,uVar37,0xffffffff,0);
      }
      else {
        uVar35 = FUN_00e170a8(&uStack_5c8);
        FUN_01065268(&uStack_360,param_4,uVar35);
        uVar35 = FUN_0097dc60();
        uVar13 = FUN_0097e3bc();
        uStack_78 = CONCAT44(param_2,uVar13);
        FUN_0097e548(0,uVar35,&uStack_78,&uStack_360,0xffffffff,0);
        iVar11 = FUN_010651e0(param_4);
        if (iVar11 == 0x19) {
          uVar35 = FUN_0097dc60();
          lVar20 = _Znwm(0x208);
          FUN_00a9475c(lVar20,0,0);
          uStack_78 = lVar20;
          FUN_0097f344(uVar35,&uStack_78,1,0,1);
        }
        iVar11 = FUN_010651e0(param_4);
        if ((iVar11 == 0x21) && (uVar19 = FUN_00e57bac(), (uVar19 & 1) != 0)) {
          FUN_00bd5638();
        }
LAB_00bc870c:
        FUN_0076ad48(&uStack_360);
      }
      FUN_0076ad48(&uStack_5c8);
LAB_00bc871c:
      plVar42 = (long *)FUN_00e03250();
      if (plVar42 == (long *)0x0) {
        bVar8 = false;
      }
      else {
        if (*plVar42 == 0) {
          bVar8 = false;
        }
        else {
          bVar8 = (char)plVar42[4] == '\0';
        }
        FUN_00dbd51c();
      }
      lVar20 = FUN_0097dc60();
      if ((!bVar8) && (lVar20 != 0)) {
        uVar35 = FUN_0097dc60();
        lVar20 = FUN_0097f85c(uVar35,0);
        if (lVar20 != 0) {
          FUN_00b7af60();
        }
        uVar35 = FUN_0097dc60();
        lVar20 = FUN_0097f85c(uVar35,0x5a);
        if (lVar20 != 0) {
          FUN_00b7e47c();
        }
        uVar35 = FUN_0097dc60();
        lVar20 = FUN_0097f85c(uVar35,0x40);
        if (lVar20 != 0) {
          FUN_00be0564();
        }
        uVar35 = FUN_0097dc60();
        lVar20 = FUN_0097f85c(uVar35,0x90);
        if (lVar20 != 0) {
          FUN_00be26dc();
        }
        uVar35 = FUN_0097dc60();
        lVar20 = FUN_0097f85c(uVar35,0xaf);
        if (lVar20 != 0) {
          FUN_00bd3c08();
        }
        uVar35 = FUN_0097dc60();
        lVar20 = FUN_0097f85c(uVar35,0x1b);
        if (lVar20 != 0) {
          FUN_00a16f3c();
        }
      }
      lVar20 = FUN_00e01b60();
      if (lVar20 == 0) {
        uVar13 = FUN_010651e0(param_4);
        *(undefined4 *)((long)param_3 + 0x234) = uVar13;
        return true;
      }
      return true;
    case 0x5e2d:
      lVar20 = FUN_00df5044();
      if (lVar20 == 0) {
        return false;
      }
      plVar42 = (long *)FUN_00bc9434(param_3,param_4);
      if (plVar42 == (long *)0x0) {
        return false;
      }
      iVar11 = *(int *)((long)plVar42 + 0x9c);
      if (iVar11 < 0) {
        *(int *)((long)param_3 + 0x26c) = *(int *)((long)param_3 + 0x26c) + 1;
        iVar11 = FUN_010cdeec(param_4[0x12]);
        *(int *)(param_3 + 0x4c) = (int)param_3[0x4c] + iVar11;
LAB_00bc83c4:
        lVar21 = param_4[0x13];
        uVar35 = FUN_010cdf10(param_4[0x12]);
        uStack_5c8 = &uStack_360;
        uStack_360 = CONCAT44(uStack_360._4_4_,(int)lVar21);
        lVar21 = FUN_00bcda38(param_3 + 6,&uStack_360,&DAT_00306498,&uStack_5c8,&uStack_78);
        *(undefined8 *)(lVar21 + 0x18) = uVar35;
        uVar19 = FUN_01086844(*(undefined8 *)(lVar20 + 0x28),plVar42);
        if ((uVar19 & 1) != 0) {
          FUN_00ba2fdc(*(undefined8 *)(lVar20 + 0x58),plVar42);
          return false;
        }
      }
      else {
        uStack_5c8 = (long *)CONCAT44(uStack_5c8._4_4_,iVar11);
        lVar21 = FUN_00bcd714(param_3 + 6,&uStack_5c8);
        if (lVar21 == 0) {
          FUN_0076da2c(&uStack_5c8,&DAT_0030360d,iVar11);
        }
        else {
          uVar19 = FUN_010ce4d0(param_4[0x12]);
          if ((uVar19 & 1) == 0) {
            FUN_0076da2c(&uStack_5c8,&DAT_002e61c0);
            FUN_0076ad48(&uStack_5c8);
          }
          uStack_5c8 = (long *)CONCAT44(uStack_5c8._4_4_,iVar11);
          lVar21 = FUN_00bcd714(param_3 + 6,&uStack_5c8);
          if (lVar21 == 0) {
            uVar35 = 0;
          }
          else {
            uVar35 = *(undefined8 *)(lVar21 + 0x18);
          }
          uVar35 = FUN_010ce0e4(param_4[0x12],uVar35);
          iVar12 = *(int *)((long)param_4 + 0xbc);
          iVar17 = FUN_010ce884();
          if (iVar12 == iVar17) {
            *(int *)(param_3 + 0x4e) = (int)param_3[0x4e] + 1;
            iVar17 = FUN_010cdeec(param_4[0x12]);
            *(int *)((long)param_3 + 0x264) = *(int *)((long)param_3 + 0x264) + iVar17;
            iVar17 = FUN_010cdeec(uVar35);
            *(int *)(param_3 + 0x4d) = (int)param_3[0x4d] + iVar17;
            FUN_010cded8(uVar35);
            FUN_0104a770(param_4,uVar35,iVar11,iVar12);
            uStack_5c8 = (long *)0x0;
            uStack_5c0 = 0;
            FUN_00bc9804(param_3 + 6,&uStack_5c8);
            if (0 < uStack_5c0._4_4_) {
              lVar21 = 0;
              iVar12 = uStack_5c0._4_4_;
              do {
                iVar17 = *(int *)((long)uStack_5c8 + lVar21 * 4);
                if (iVar17 < iVar11 + -0x14) {
                  uStack_360 = CONCAT44(uStack_360._4_4_,iVar17);
                  lVar30 = FUN_00bcd714(param_3 + 6,&uStack_360);
                  if ((lVar30 != 0) && (plVar45 = *(long **)(lVar30 + 0x18), plVar45 != (long *)0x0)
                     ) {
                    FUN_010c6b10(plVar45);
                    (**(code **)(*plVar45 + 8))(plVar45);
                  }
                  uStack_360 = CONCAT44(uStack_360._4_4_,
                                        *(undefined4 *)((long)uStack_5c8 + lVar21 * 4));
                  lVar30 = FUN_00bcd7ec(param_3 + 6,&uStack_360);
                  if (lVar30 != 0) {
                    FUN_00bcd8c4(param_3 + 6,lVar30);
                  }
                  iVar12 = uStack_5c0._4_4_;
                }
                lVar21 = lVar21 + 1;
              } while (lVar21 < iVar12);
            }
            if (uStack_5c8 != (long *)0x0) {
              _ZdaPv();
            }
            goto LAB_00bc83c4;
          }
          *(int *)((long)param_3 + 0x274) = *(int *)((long)param_3 + 0x274) + 1;
          FUN_0076da2c(&uStack_5c8,&DAT_002d099a,iVar12,iVar17);
        }
        FUN_0076ad48(&uStack_5c8);
      }
      (**(code **)(*plVar42 + 0x38))(plVar42);
      (**(code **)(*plVar42 + 8))(plVar42);
      return false;
    case 0x5e2f:
      uVar35 = FUN_0104bc88(param_4);
      uStack_5c8 = (long *)uVar35;
      uVar19 = FUN_00bc9a74();
      if ((uVar19 & 1) == 0) {
        FUN_00bc9abc(param_3 + 0x13,&uStack_5c8);
        return true;
      }
      uVar37 = FUN_00e01b60();
      FUN_00e033e0(uVar37,uVar35);
      return true;
    case 0x5e30:
      uVar13 = FUN_01083ec0(param_4);
      lVar21 = FUN_01083eb0(param_4);
      if (lVar21 == 0) {
        FUN_00bc2440(param_3);
        *(undefined1 *)(param_3 + 0x47) = 1;
        return true;
      }
      lVar20 = FUN_01083ec8(param_4);
      if (lVar20 == 0) {
        if (param_3[0x29] == 0) {
          puVar31 = &DAT_002c9682;
        }
        else {
          uVar19 = FUN_00be7188(param_3[0x29],lVar21,uVar13);
          if ((uVar19 & 1) != 0) goto LAB_00bc7990;
          puVar31 = &DAT_002ac9f6;
        }
        FUN_00610dec(puVar31);
      }
      else {
        FUN_00bc2440(param_3);
        *(undefined1 *)(param_3 + 0x47) = 1;
        lVar30 = FUN_01083edc(param_4);
        lVar26 = _Znwm(0x5c0);
        FUN_00be7014();
        param_3[0x29] = lVar26;
        uVar35 = _Znwm(0x10);
        FUN_01021308(uVar35,1);
        lVar25 = param_3[0x29];
        *(undefined8 *)(lVar26 + 0x590) = uVar35;
        uVar19 = FUN_00be7290(lVar25,lVar21,uVar13,lVar20,lVar30,0);
        if ((uVar19 & 1) == 0) {
          FUN_00610dec(&DAT_002bab99);
          lVar26 = param_3[0x29];
          if (lVar26 != 0) {
            FUN_00be706c(lVar26);
            _ZdlPv(lVar26);
          }
          param_3[0x29] = 0;
        }
        _ZdaPv(lVar20);
        if (lVar30 != 0) {
          _ZdaPv(lVar30);
        }
      }
LAB_00bc7990:
      FUN_0076ad48(lVar21);
LAB_00bc799c:
      _ZdlPv(lVar21);
      return true;
    case 0x5e33:
      FUN_00610dec(&DAT_002fbe58);
      iVar11 = (int)param_4[0x12];
      if (iVar11 == 0x32) {
        uVar35 = FUN_00856ae8();
        uVar37 = FUN_00e17028(&DAT_002be562);
        FUN_0076aed8(auStack_550,uVar37);
        FUN_0076ae58(auStack_560,&DAT_002aadd1);
        FUN_0076ae58(auStack_570,&DAT_002aadd1);
        FUN_0085bc50(uVar35,0x17,0,auStack_550,auStack_560,auStack_570);
        FUN_0076ad48(auStack_570);
        FUN_0076ad48(auStack_560);
        puVar44 = auStack_550;
      }
      else if (iVar11 == 0x31) {
        FUN_00be4ef8(*DAT_0133c298,0);
        uVar35 = FUN_00856ae8();
        uVar37 = FUN_00e17028(&DAT_002a53d0);
        FUN_0076aed8(auStack_520,uVar37);
        FUN_0076ae58(auStack_530,&DAT_002aadd1);
        FUN_0076ae58(auStack_540,&DAT_002aadd1);
        FUN_0085bc50(uVar35,0x16,0,auStack_520,auStack_530,auStack_540);
        FUN_0076ad48(auStack_540);
        FUN_0076ad48(auStack_530);
        puVar44 = auStack_520;
      }
      else {
        uVar35 = FUN_00856ae8();
        FUN_0076da2c(auStack_580,&DAT_002d09dd,iVar11);
        FUN_0076ae58(auStack_590,&DAT_002aadd1);
        FUN_0076ae58(auStack_5a0,&DAT_002aadd1);
        FUN_0085bc50(uVar35,0xb,0,auStack_580,auStack_590,auStack_5a0);
        FUN_0076ad48(auStack_5a0);
        FUN_0076ad48(auStack_590);
        puVar44 = auStack_580;
      }
      break;
    case 0x5e34:
      iVar11 = (int)param_4[0x12];
      FUN_0076ae58(&uStack_5c8,&DAT_002b0949);
      if (iVar11 == 2) {
        puVar31 = &DAT_00296a86;
LAB_00bc6404:
        FUN_0076b21c(&uStack_5c8,puVar31);
      }
      else {
        if (iVar11 == 1) {
          puVar31 = &DAT_002d7da1;
          goto LAB_00bc6404;
        }
        if (iVar11 == 0) {
          puVar31 = &DAT_002f814c;
          goto LAB_00bc6404;
        }
        FUN_0076da2c(&uStack_360,&DAT_002c1e90,iVar11);
        FUN_0076aa88(&uStack_5c8,&uStack_360);
        FUN_0076ad48(&uStack_360);
      }
      uVar35 = FUN_0097dc60();
      goto LAB_00bc64ac;
    case 0x5e35:
      uVar35 = FUN_0097dc60();
      cVar1 = (char)param_4[0x12];
      puVar40 = &DAT_002a17b6;
      puVar31 = &UNK_002ffaed;
LAB_00bc46fc:
      if (cVar1 != '\0') {
        puVar31 = puVar40;
      }
      FUN_0076ae58(&uStack_5c8,puVar31);
      goto LAB_00bc64ac;
    case 0x5e3c:
      uVar35 = FUN_009a0d98();
      FUN_009b29ec(uVar35,param_4);
      return true;
    case 0x5e3d:
      uVar35 = FUN_009a0d98();
      FUN_009b2044(uVar35,param_4);
      return true;
    case 0x5e41:
      uVar35 = FUN_009a0d98();
      FUN_009b1cf8(uVar35,param_4);
      return true;
    case 0x5e42:
      uVar35 = FUN_009a0d98();
      FUN_009b22dc(uVar35,param_4);
      return true;
    case 0x5e43:
      uVar35 = FUN_009a0d98();
      FUN_009b2460(uVar35,param_4);
      return true;
    case 0x5e71:
      lVar20 = FUN_0097dc60();
      if (lVar20 != 0) {
        uVar35 = FUN_0097dc60();
        uVar13 = FUN_0097e3bc();
        uStack_c8 = CONCAT44(param_2,uVar13);
        FUN_0076da2c(&uStack_360,&DAT_002f0e09,(int)param_4[0x12]);
        uVar37 = FUN_00e171c8(&uStack_360);
        FUN_0076ae58(&uStack_78,&DAT_002ffb09);
        FUN_0076da2c(alStack_b8,&DAT_0029db3d,*(undefined4 *)((long)param_4 + 0x94));
        uVar39 = FUN_00e171c8(alStack_b8);
        FUN_0076ca18(&uStack_5c8,uVar37,&uStack_78,uVar39);
        FUN_0097e548(0,uVar35,&uStack_c8,&uStack_5c8,0xffffffff,0);
        FUN_0076ad48(&uStack_5c8);
        FUN_0076ad48(alStack_b8);
        FUN_0076ad48(&uStack_78);
        FUN_0076ad48(&uStack_360);
      }
      if ((int)param_4[0x12] != 0) {
        return true;
      }
      lVar20 = FUN_00e02bbc();
      if (lVar20 == 0) {
        return true;
      }
      lVar20 = FUN_00e01b60();
      FUN_0109c1a8(*(undefined8 *)(lVar20 + 0x48));
      lVar20 = FUN_01014598();
      *(undefined4 *)(lVar20 + 0xac) = *(undefined4 *)((long)param_4 + 0x94);
      return true;
    case 0x5e72:
      lVar20 = FUN_0097dc60();
      if (lVar20 == 0) {
        return true;
      }
      uVar35 = FUN_0097dc60();
      FUN_0076da2c(&uStack_360,&DAT_002dee80,(int)param_4[0x12]);
      uVar37 = FUN_00e171c8(&uStack_360);
      FUN_0076ae58(&uStack_78,&DAT_0029a383);
      uVar39 = FUN_00f027b0(param_4[0x13]);
      FUN_0076ca18(&uStack_5c8,uVar37,&uStack_78,uVar39);
      FUN_0097e74c(0,uVar35,&uStack_5c8,0xffffffff,0);
      FUN_0076ad48(&uStack_5c8);
      FUN_0076ad48(&uStack_78);
      FUN_0076ad48(&uStack_360);
      if ((int)param_4[0x12] != 0) {
        return true;
      }
      uVar35 = FUN_0097dc60();
      plVar42 = (long *)FUN_0097f85c(uVar35,0x29);
      if (plVar42 != (long *)0x0) {
        (**(code **)(*plVar42 + 0x1d0))();
      }
      lVar20 = FUN_00e02bbc();
      if (lVar20 != 0) {
        lVar20 = FUN_00e01b60();
        FUN_0109c1a8(*(undefined8 *)(lVar20 + 0x48));
        uVar35 = FUN_01014598();
        uVar37 = _Znwm(0x10);
        uVar39 = FUN_00f027b0(param_4[0x13]);
        FUN_0076aed8(uVar37,uVar39);
        FUN_00bc9b1c(uVar35,uVar37);
        FUN_0105b24c(uVar35);
      }
      uVar35 = FUN_0097dc60();
      lVar20 = FUN_0097f85c(uVar35,8);
      if (lVar20 == 0) {
        return true;
      }
      FUN_0097dc60();
      FUN_0097d9f0();
      FUN_00bb6304();
      return true;
    default:
      if (iVar11 == 0x5eff) {
        uVar35 = FUN_009a0d98();
        FUN_009b26c8(uVar35,param_4);
        return true;
      }
      if (iVar11 != 0x5f53) {
        return true;
      }
      FUN_0097dc60();
      lVar20 = FUN_009825e8();
      if (lVar20 != 0) {
        FUN_00cf77a4(lVar20,param_4);
      }
      lVar20 = FUN_009959d0();
      if (lVar20 != 0) {
        FUN_009f687c(lVar20,param_4);
      }
      lVar20 = FUN_0097dc60();
      if (lVar20 == 0) {
        return true;
      }
      uVar35 = FUN_0097dc60();
      lVar20 = FUN_0097f85c(uVar35,0xbe);
      if (lVar20 != 0) {
        FUN_00a90554(lVar20,param_4);
      }
      uVar35 = FUN_0097dc60();
      lVar20 = FUN_0097f85c(uVar35,0x5b);
      if (lVar20 != 0) {
        FUN_00bd1320(lVar20,param_4);
      }
      uVar35 = FUN_0097dc60();
      lVar20 = FUN_0097f85c(uVar35,0xdf);
      if (lVar20 == 0) {
        return true;
      }
      FUN_00bd1eb8(lVar20,param_4);
      return true;
    }
    goto LAB_00bc3474;
  }
  if (0x5610 < iVar11) {
    if (0x5768 < iVar11) {
      if (0x595e < iVar11) {
        if (iVar11 == 0x595f) {
          iVar11 = FUN_0102ced4(param_4);
          uVar35 = _DAT_01400fa8;
          uVar37 = FUN_0102cecc(param_4);
          FUN_00c243b4(uVar35,uVar37,iVar11 == 0,iVar11 == 2);
          return true;
        }
        if (iVar11 == 0x5a1b) {
          plVar42 = (long *)*DAT_0133c2b0;
          if (plVar42 == (long *)0x0) {
            return true;
          }
          if ((int)param_4[0x12] == 0) {
            pcVar38 = *(code **)(*plVar42 + 0xd8);
          }
          else {
            FUN_0076dbb8(&uStack_360);
            FUN_0076b6c8(&uStack_5c8,&DAT_002cce93,&uStack_360);
            FUN_00610de8(&uStack_5c8);
            FUN_0076ad48(&uStack_5c8);
            FUN_0076ad48(&uStack_360);
            pcVar38 = *(code **)(*plVar42 + 0xd0);
          }
          goto LAB_00bc66a8;
        }
        iVar12 = 0x5a75;
LAB_00bc3f1c:
        if (iVar11 != iVar12) {
          return true;
        }
switchD_00bc34f4_caseD_5686:
        lVar20 = FUN_00e01b60();
        if (lVar20 == 0) {
          return true;
        }
        FUN_00e01b60();
        lVar20 = FUN_00e02dd4();
        if (lVar20 == 0) {
          return true;
        }
        FUN_00e01b60();
        uVar35 = FUN_00e02dd4();
        FUN_00c62b54(uVar35,param_4);
        return true;
      }
      if (iVar11 == 0x5769) {
        iVar11 = FUN_0104b4e4(param_4);
        lVar20 = *DAT_0133c2d0;
        if (iVar11 < 2) {
          if (iVar11 == 0) {
            if (lVar20 == 0) {
              return true;
            }
            FUN_0094419c(lVar20);
            return true;
          }
          if (iVar11 == 1) {
            FUN_00610dec(&DAT_002c5a82);
            goto joined_r0x00bc5814;
          }
        }
        else {
          if (iVar11 == 2) {
            FUN_00610dec(&DAT_002ac9a2);
joined_r0x00bc5814:
            if (lVar20 == 0) {
              return true;
            }
            FUN_00944658(lVar20);
            return true;
          }
          if (iVar11 == 3) {
            FUN_00610dec(&DAT_002b090a);
            goto joined_r0x00bc5814;
          }
        }
        puVar31 = &DAT_0029a34d;
LAB_00bc67d8:
        FUN_00610dec(puVar31);
        return true;
      }
      if (iVar11 == 0x5856) goto switchD_00bc34f4_caseD_5686;
      if (iVar11 != 0x589f) {
        return true;
      }
      if (*DAT_0133c2d8 == 0) {
        return true;
      }
      if (*(char *)(*DAT_0133c2b0 + 0x40) != '\0') {
        uVar19 = FUN_00c15810();
        if ((uVar19 & 1) != 0) {
          return true;
        }
        uVar19 = FUN_00874c28(*plVar42);
        if ((uVar19 & 1) != 0) {
          return true;
        }
      }
      if (((char)param_4[0x17] != '\0') && (*(char *)(*plVar42 + 0x40) != '\0')) goto LAB_00bc3aa4;
      lVar20 = FUN_0104ae00(param_4);
      FUN_0104adf8(param_4,lVar20);
      lVar21 = FUN_0104ade8(param_4);
      if (lVar21 == 0) {
        FUN_0076ae58(&uStack_5c8,&DAT_002aadd1);
      }
      else {
        FUN_0076aed8(&uStack_5c8,lVar21);
      }
      FUN_0104ade0(param_4,lVar21);
      uVar35 = FUN_0104adc0(param_4);
      FUN_0076ae58(&uStack_78,&DAT_002b0900);
      FUN_00be482c(&uStack_360,&uStack_78);
      FUN_0076ad48(&uStack_78);
      FUN_0104adb8(param_4,uVar35);
      if (uStack_360._4_4_ == 0) {
        iVar11 = 1;
      }
      else {
        iVar11 = FUN_00634a50(&uStack_360);
        iVar11 = iVar11 + 1;
      }
      FUN_0076ae58(alStack_b8,&DAT_002ac999);
      FUN_00be482c(&uStack_78,alStack_b8);
      uVar19 = FUN_0076b81c(&uStack_5c8,&uStack_78);
      FUN_0076ad48(&uStack_78);
      FUN_0076ad48(alStack_b8);
      uVar16 = FUN_00bc91b8();
      FUN_0076da2c(&uStack_78,&DAT_002a178f,lVar20 != 0,uVar16 & 1);
      FUN_0076ad48(&uStack_78);
      if (lVar20 == 0) {
        FUN_0076ae58(&uStack_78,&DAT_002ac999);
        FUN_00be6660(&uStack_78,&uStack_5c8);
        FUN_0076ad48(&uStack_78);
        if ((uVar19 & 1) == 0) {
          iVar11 = 1;
        }
        FUN_0076ae58(&uStack_78,&DAT_002b0900);
        FUN_00634c10(alStack_b8,iVar11,0);
LAB_00bc7c14:
        FUN_00be6660(&uStack_78,alStack_b8);
        FUN_0076ad48(alStack_b8);
        goto LAB_00bc4ff8;
      }
      if ((uVar16 & 1) != 0) {
        FUN_0104adb8(param_4,uVar35);
        uVar35 = FUN_0097dc60();
        lVar20 = _Znwm(0x248);
        FUN_00bb2010(lVar20,0xd,param_4,0);
        uVar16 = FUN_00bc9158();
        uStack_78 = lVar20;
        FUN_0097f344(uVar35,&uStack_78,1,0,uVar16 & 1);
        FUN_0076ae58(&uStack_78,&DAT_002ac999);
        FUN_0076ae58(alStack_b8,&DAT_002aadd1);
        goto LAB_00bc7c14;
      }
LAB_00bc5000:
      FUN_0076ad48(&uStack_360);
      goto LAB_00bc3470;
    }
    switch(iVar11) {
    case 0x5611:
      uVar19 = (ulong)*(uint *)((long)param_3 + 0x24c);
      if ((int)*(uint *)((long)param_3 + 0x24c) < 1) {
        return true;
      }
      puVar44 = (undefined8 *)param_3[0x48];
      do {
        if (*(int *)*puVar44 == (int)param_4[0x12]) {
          *(long **)((int *)*puVar44 + 2) = param_4;
          return false;
        }
        uVar19 = uVar19 - 1;
        puVar44 = puVar44 + 1;
      } while (uVar19 != 0);
      return true;
    default:
      return true;
    case 0x5649:
      iVar11 = FUN_01047f74(param_4);
      if (iVar11 == 4) {
        puVar31 = &DAT_002d7de7;
      }
      else if (iVar11 == 3) {
        puVar31 = &DAT_002e620b;
      }
      else {
        if (iVar11 == 1) {
          lVar20 = *DAT_0133c4c8;
          if (lVar20 == 0) {
            return true;
          }
          uVar35 = FUN_01047f64(param_4);
          FUN_008bd988(lVar20,uVar35);
          return true;
        }
        puVar31 = &DAT_0029a38d;
      }
      uVar35 = FUN_0076ae58(&uStack_5c8,puVar31);
      FUN_00bc91e0(uVar35,&uStack_5c8);
      FUN_0076ad48(&uStack_5c8);
      if (*DAT_0133c4c8 == 0) {
        return true;
      }
      FUN_008bd804();
      return true;
    case 0x5654:
      if (*DAT_0133c308 == 0) {
        return true;
      }
      FUN_00bae208(*DAT_0133c308,param_4);
      return true;
    case 0x5655:
      if (*DAT_0133c308 == 0) {
        return true;
      }
      FUN_00bae94c(*DAT_0133c308,param_4);
      return true;
    case 0x5656:
      lVar20 = *DAT_0133c308;
      if (lVar20 == 0) {
        return true;
      }
      uVar35 = FUN_0106f23c(param_4);
      FUN_00badd34(lVar20,uVar35);
      return true;
    case 0x5657:
      lVar20 = FUN_00e0e648();
      if (lVar20 == 0) {
        return true;
      }
      FUN_00e0e648();
      lVar20 = FUN_00e0ef54();
      if (lVar20 == 0) {
        return true;
      }
      FUN_00c9ae98(lVar20,param_4);
      return true;
    case 0x5658:
      if (*DAT_0133c308 == 0) {
        return true;
      }
      FUN_00bae458(*DAT_0133c308,param_4);
      return true;
    case 0x5659:
      if (*DAT_0133c308 == 0) {
        return true;
      }
      FUN_00bae714(*DAT_0133c308,param_4);
      return true;
    case 0x565a:
      if (*DAT_0133c308 == 0) {
        return true;
      }
      FUN_00bae8a8(*DAT_0133c308,param_4);
      return true;
    case 0x565b:
      if (*DAT_0133c308 == 0) {
        return true;
      }
      FUN_00baebc4(*DAT_0133c308,param_4);
      return true;
    case 0x565d:
      lVar20 = param_4[0x12];
      uVar35 = FUN_0097dc60();
      puVar31 = &DAT_002c1ebb;
      if ((int)lVar20 != 1) {
        puVar31 = &DAT_002b3d64;
      }
      puVar40 = &DAT_002fbe74;
      if ((int)lVar20 != 0) {
        puVar40 = puVar31;
      }
      FUN_0076ae58(&uStack_5c8,puVar40);
      break;
    case 0x565f:
      if (*DAT_0133c308 == 0) {
        return true;
      }
      FUN_00bae9f0(*DAT_0133c308,param_4);
      return true;
    case 0x566d:
      if (*DAT_0133c308 == 0) {
        return true;
      }
      FUN_00baedbc(*DAT_0133c308,param_4);
      return true;
    case 0x5686:
    case 0x5687:
    case 0x5688:
    case 0x5689:
    case 0x568a:
    case 0x568b:
    case 0x568c:
    case 0x568d:
    case 0x568e:
    case 0x5694:
      goto switchD_00bc34f4_caseD_5686;
    case 0x568f:
      lVar20 = FUN_00e01b60();
      if (lVar20 != 0) {
        FUN_00e01b60();
        lVar20 = FUN_00e02dd4();
        if (lVar20 != 0) {
          FUN_00e01b60();
          uVar35 = FUN_00e02dd4();
          FUN_00c62cbc(uVar35,param_4);
        }
      }
      lVar20 = FUN_00df5044();
      if (lVar20 == 0) {
        return true;
      }
      uVar35 = FUN_00df5044();
      FUN_00dfea48(uVar35,param_4);
      return true;
    case 0x56ba:
      if (*DAT_0133c308 == 0) {
        return true;
      }
      FUN_00baf954(*DAT_0133c308,param_4);
      return true;
    }
LAB_00bc64ac:
    FUN_0097e4b8(0,uVar35,&uStack_5c8,0xffffffff);
    goto LAB_00bc3470;
  }
  if (0x4f4b < iVar11) {
    if (iVar11 < 0x5015) {
      if (0x4fb5 < iVar11) {
        if (iVar11 != 0x4fb6) {
          if (iVar11 != 0x4fb7) {
            return true;
          }
          lVar20 = FUN_0097dc60();
          if (lVar20 == 0) {
            return true;
          }
          uVar35 = FUN_0097dc60();
          lVar20 = FUN_0097f85c(uVar35,0xaf);
          if (lVar20 == 0) {
            return true;
          }
          FUN_00bd3b84(lVar20,param_4);
          return true;
        }
        plVar42 = (long *)FUN_00e03250();
        if (plVar42 == (long *)0x0) {
          bVar8 = false;
        }
        else {
          bVar8 = *plVar42 != 0;
          FUN_00dbd3e8();
        }
        lVar20 = FUN_0097dc60();
        if (bVar8) {
          return true;
        }
        if (lVar20 == 0) {
          return true;
        }
        uVar35 = FUN_0097dc60(1);
        lVar20 = FUN_0097f85c(uVar35,0);
        if (lVar20 != 0) {
          FUN_00b7af60();
        }
        uVar35 = FUN_0097dc60();
        lVar20 = FUN_0097f85c(uVar35,0xaf);
        if (lVar20 != 0) {
          FUN_00bd3c08();
        }
        uVar35 = FUN_0097dc60();
        lVar20 = FUN_0097f85c(uVar35,0x5a);
        if (lVar20 != 0) {
          FUN_00b7e47c();
        }
        uVar35 = FUN_0097dc60();
        lVar20 = FUN_0097f85c(uVar35,0x40);
        if (lVar20 == 0) {
          return true;
        }
        FUN_00be0564();
        return true;
      }
      if (iVar11 != 0x4f4c) {
        if (iVar11 != 0x4fb5) {
          return true;
        }
        plVar42 = (long *)FUN_00e03250();
        if (plVar42 == (long *)0x0) {
          bVar8 = false;
        }
        else {
          bVar8 = *plVar42 != 0;
        }
        lVar20 = FUN_0097dc60();
        if (bVar8) {
          return true;
        }
        if (lVar20 == 0) {
          return true;
        }
        uVar35 = FUN_0097dc60(1);
        lVar20 = FUN_0097f85c(uVar35,0);
        if (lVar20 != 0) {
          FUN_00b7affc(lVar20,param_4);
        }
        uVar35 = FUN_0097dc60();
        lVar20 = FUN_0097f85c(uVar35,0x5a);
        if (lVar20 != 0) {
          FUN_00b7e518(lVar20,param_4);
        }
        uVar35 = FUN_0097dc60();
        lVar20 = FUN_0097f85c(uVar35,0x40);
        if (lVar20 != 0) {
          FUN_00be053c(lVar20,param_4);
        }
        uVar35 = FUN_0097dc60();
        lVar20 = FUN_0097f85c(uVar35,0xaf);
        if (lVar20 == 0) {
          return true;
        }
        FUN_00bd38e4(lVar20,param_4);
        return true;
      }
      lVar20 = FUN_0097dc60();
      if (lVar20 == 0) {
        return true;
      }
      FUN_0097dc60();
      lVar20 = FUN_00982a9c();
      if (lVar20 == 0) {
        return true;
      }
      FUN_0097dc60();
      plVar42 = (long *)FUN_00982a9c();
      if (plVar42 == (long *)0x0) {
        return true;
      }
      uVar19 = FUN_0103d0b4(param_4);
      if ((uVar19 & 1) != 0) {
        iVar11 = FUN_0103d0bc(param_4);
        if ((iVar11 == 1) || (iVar11 = FUN_0103d0bc(param_4), iVar11 == 3)) {
          puVar31 = &DAT_002a908a;
        }
        else {
          iVar11 = FUN_0103d0bc(param_4);
          if (iVar11 == 2) {
            puVar31 = &DAT_0029a330;
          }
          else {
            iVar11 = FUN_0103d0bc(param_4);
            if (iVar11 == 4) {
              puVar31 = &DAT_002be549;
            }
            else {
              iVar11 = FUN_0103d0bc(param_4);
              if (iVar11 != 6) {
                return true;
              }
              puVar31 = &DAT_002b3d17;
            }
          }
        }
        uVar35 = FUN_00e17028(puVar31);
        (**(code **)*plVar42)(plVar42,uVar35);
        return true;
      }
      lVar21 = FUN_0103d0c4(param_4);
      (**(code **)(*plVar42 + 0x10))(plVar42,lVar21);
joined_r0x00bc6fcc:
      if (lVar21 == 0) {
        return true;
      }
      FUN_0076ad48(lVar21);
      goto LAB_00bc799c;
    }
    if (0x504f < iVar11) {
      if (iVar11 == 0x5050) {
        lVar20 = FUN_00df5044();
        FUN_010876f4(*(undefined8 *)(lVar20 + 0x28),param_4);
        return false;
      }
      iVar12 = 0x5209;
      goto LAB_00bc3f1c;
    }
    if (iVar11 == 0x5015) {
      iVar11 = FUN_01045008(param_4);
      if (iVar11 < 3) {
        if (iVar11 == 1) {
          puVar31 = &DAT_002db734;
        }
        else {
          if (iVar11 != 2) goto LAB_00bc6810;
          puVar31 = &DAT_002a53aa;
        }
      }
      else if (iVar11 == 3) {
        puVar31 = &DAT_0029303e;
      }
      else if (iVar11 == 4) {
        puVar31 = &DAT_0029db19;
      }
      else {
LAB_00bc6810:
        puVar31 = &DAT_002a909b;
      }
      uVar35 = FUN_0076ae58(&uStack_5c8,puVar31);
      FUN_00bc91e0(uVar35,&uStack_5c8);
      goto LAB_00bc3470;
    }
    if (iVar11 != 0x504f) {
      return true;
    }
    FUN_0076ae58(&uStack_5c8,&DAT_00296a59);
    FUN_0076ae58(&uStack_360,"default");
    uStack_78 = CONCAT44(uStack_78._4_4_,2);
    FUN_0081bdb0(&uStack_5c8,&uStack_360,&uStack_78);
    FUN_0076ad48(&uStack_360);
    FUN_0076ad48(&uStack_5c8);
    lVar20 = FUN_00dfeefc();
    if (lVar20 == 0) {
      return true;
    }
    uVar19 = FUN_00bc9240();
    if ((uVar19 & 1) != 0) {
      FUN_00bc8f20();
      FUN_008ad0dc();
    }
    FUN_00bc2440(param_3);
    uVar16 = *(uint *)(param_4 + 0x16);
    iVar11 = *(int *)((long)param_4 + 0xb4);
    uVar15 = (undefined4)param_4[0x17];
    uVar13 = (undefined4)param_4[0x1a];
    uVar14 = FUN_01049d2c(param_4);
    *(undefined4 *)(param_3 + 0x3e) = uVar14;
    uVar35 = FUN_00f1cde4();
    uVar19 = FUN_010d3d3c();
    if ((uVar19 & 1) == 0) {
      bVar10 = FUN_0108e818(uVar15,uVar35);
    }
    else {
      bVar10 = FUN_010d3fe4(uVar15);
    }
    pbVar7 = DAT_0133c4c0;
    *(undefined4 *)(lVar20 + 8) = 5;
    *pbVar7 = bVar10 & 1;
    lVar21 = FUN_00e01b60();
    if ((lVar21 != 0) && (*DAT_0133c390 != 0)) {
      lVar21 = FUN_00e01b60();
      uVar43 = *(undefined8 *)(lVar21 + 0x48);
      lVar21 = FUN_0109c1a8(uVar43);
      uVar39 = *(undefined8 *)(lVar21 + 0xb8);
      uVar37 = FUN_0109c1b0(uVar43);
      uStack_5c8 = (long *)0x0;
      uStack_5c0 = 0;
      uStack_358 = 0;
      uStack_360 = 0;
      if (*(int *)((long)DAT_0133c838 + 0xc) != 0) {
        plVar42 = (long *)*DAT_0133c838;
        lVar21 = (long)*(int *)((long)DAT_0133c838 + 0xc) << 3;
        do {
          puVar44 = (undefined8 *)*plVar42;
          uVar46 = *puVar44;
          uStack_5c0 = uStack_5c0 & 0xffffffff;
          FUN_00f1cb94(uVar46,9,&uStack_5c8);
          if (*DAT_0133c840 == '\0') {
            uVar14 = FUN_00e8f64c(uVar37,uVar46);
            uVar27 = FUN_01013a18(uVar39,uVar46,0);
            uVar28 = FUN_01013a18(uVar39,uVar46,1);
            alStack_b8[0] = FUN_00e8d75c(uVar43,uVar46);
            uStack_c8 = FUN_00e8d8d8(uVar43,uVar46);
            alStack_d8[0] = FUN_00e8d86c(uVar43,uVar46);
            uVar29 = FUN_0109c1b0(uVar43);
            FUN_00e90988(uVar29,*DAT_0133c850,&uStack_360);
            alStack_370[0] = FUN_00e8d948(uVar43,uVar46);
            alStack_380[0] = FUN_00e90cb8(uVar37,4,uVar46,0);
            lVar30 = FUN_00e90cb8(uVar37,5,uVar46,0);
            alStack_390[0] = FUN_00e90cb8(uVar37,0xd,uVar46,0);
            alStack_3a0[0] = FUN_00e90cb8(uVar37,0xf,uVar46,0);
            alStack_3b0[0] = FUN_00e90cb8(uVar37,0x10,uVar46,0);
            uStack_78 = 0;
            uStack_70 = 0;
            if (alStack_380[0] != 0) {
              FUN_00bc928c(&uStack_78,alStack_380);
            }
            if (alStack_b8[0] != 0) {
              FUN_00bc928c(&uStack_78,alStack_b8);
            }
            if (uStack_c8 != 0) {
              FUN_00bc928c(&uStack_78,&uStack_c8);
            }
            if (alStack_d8[0] != 0) {
              FUN_00bc928c(&uStack_78,alStack_d8);
            }
            if (alStack_370[0] != 0) {
              FUN_00bc928c(&uStack_78,alStack_370);
            }
            if (alStack_390[0] != 0) {
              FUN_00bc928c(&uStack_78,alStack_390);
            }
            if (alStack_3b0[0] != 0) {
              FUN_00bc928c(&uStack_78,alStack_3b0);
            }
            if (alStack_3a0[0] != 0) {
              FUN_00bc928c(&uStack_78,alStack_3a0);
            }
            FUN_00bc92ec(&uStack_78,&uStack_5c8);
            FUN_00bc92ec(&uStack_78,&uStack_360);
            lVar26 = _Znwm(0x90);
          }
          else {
            cVar1 = *DAT_0133c848;
            FUN_009a0d98();
            lVar25 = FUN_009b41b4();
            if (lVar25 == 0) {
              alStack_b8[0] = FUN_00e90cb8(uVar37,4,uVar46,0);
              if (alStack_b8[0] == 0) {
                alStack_b8[0] = thunk_FUN_00f1b7e4(uVar46,4);
              }
              lVar25 = FUN_00e90cb8(uVar37,5,uVar46,0);
              if (lVar25 == 0) {
                lVar25 = thunk_FUN_00f1b7e4(uVar46,5);
              }
              uVar27 = FUN_01013a18(uVar39,uVar46,0);
              uVar28 = FUN_01013a18(uVar39,uVar46,1);
              uStack_c8 = FUN_00e90cb8(uVar37,6,uVar46,0);
              alStack_d8[0] = FUN_00e90cb8(uVar37,7,uVar46,0);
              alStack_370[0] = FUN_00e90cb8(uVar37,8,uVar46,0);
              FUN_00e90988(uVar37,*DAT_0133c850,&uStack_360);
              alStack_380[0] = FUN_00e90cb8(uVar37,0xc,uVar46,0);
              alStack_390[0] = FUN_00e90cb8(uVar37,0xd,uVar46,0);
              alStack_3a0[0] = FUN_00e90cb8(uVar37,0xf,uVar46,0);
              alStack_3b0[0] = FUN_00e90cb8(uVar37,0x10,uVar46,0);
              if (uStack_c8 == 0) {
                uStack_c8 = thunk_FUN_00f1b7e4(uVar46,6);
              }
              uStack_78 = 0;
              uStack_70 = 0;
              if (alStack_b8[0] != 0) {
                FUN_00bc928c(&uStack_78,alStack_b8);
              }
              if (uStack_c8 != 0) {
                FUN_00bc928c(&uStack_78,&uStack_c8);
              }
              if (alStack_d8[0] != 0) {
                FUN_00bc928c(&uStack_78,alStack_d8);
              }
              if (alStack_370[0] != 0) {
                FUN_00bc928c(&uStack_78,alStack_370);
              }
              if (alStack_380[0] != 0) {
                FUN_00bc928c(&uStack_78,alStack_380);
              }
              if (alStack_390[0] != 0) {
                FUN_00bc928c(&uStack_78,alStack_390);
              }
              if (alStack_3a0[0] != 0) {
                FUN_00bc928c(&uStack_78,alStack_3a0);
              }
              if (alStack_3b0[0] != 0) {
                FUN_00bc928c(&uStack_78,alStack_3b0);
              }
              FUN_00bc92ec(&uStack_78,&uStack_5c8);
              FUN_00bc92ec(&uStack_78,&uStack_360);
              lVar26 = _Znwm(0x90);
              lVar30 = 0;
              if (cVar1 != '\0') {
                lVar30 = lVar25;
              }
              uVar14 = 0xb;
            }
            else {
              alStack_b8[0] = *(long *)(lVar25 + 0x88);
              uStack_c8 = *(long *)(lVar25 + 0x90);
              FUN_00e90988(uVar37,*DAT_0133c850,&uStack_360);
              alStack_d8[0] = *(long *)(lVar25 + 0x60);
              lVar34 = *(long *)(lVar25 + 0x68);
              alStack_370[0] = *(long *)(lVar25 + 0x80);
              alStack_380[0] = *(long *)(lVar25 + 0xa8);
              uStack_78 = 0;
              uStack_70 = 0;
              if (alStack_d8[0] != 0) {
                FUN_00bc928c(&uStack_78,alStack_d8);
              }
              if (alStack_370[0] != 0) {
                FUN_00bc928c(&uStack_78,alStack_370);
              }
              if (alStack_b8[0] != 0) {
                FUN_00bc928c(&uStack_78,alStack_b8);
              }
              if (uStack_c8 != 0) {
                FUN_00bc928c(&uStack_78,&uStack_c8);
              }
              if (alStack_380[0] != 0) {
                FUN_00bc928c(&uStack_78,alStack_380);
              }
              FUN_00bc92ec(&uStack_78,&uStack_5c8);
              FUN_00bc92ec(&uStack_78,&uStack_360);
              lVar26 = _Znwm(0x90);
              lVar30 = 0;
              if (cVar1 != '\0') {
                lVar30 = lVar34;
              }
              uVar27 = FUN_01037484(lVar25,0);
              uVar28 = FUN_01037484(lVar25,1);
              uVar14 = 0xb;
            }
          }
          FUN_0109ad5c(lVar26,uVar14,lVar30,uVar27,uVar28,&uStack_78,0);
          if (uStack_78 != 0) {
            _ZdaPv();
          }
          lVar30 = FUN_00f1f770(uVar46,0);
          if ((lVar30 != 0) && (iVar12 = FUN_00e8f66c(uVar37,0x22,lVar30), 0 < iVar12)) {
            *(long *)(lVar26 + 0x60) = lVar30;
            *(int *)(lVar26 + 0x68) = iVar12;
          }
          lVar30 = FUN_00e02bbc();
          uVar28 = *(undefined8 *)(lVar30 + 0x1e0);
          uVar27 = FUN_0106c4fc(uVar28,uVar46);
          uVar14 = FUN_00e91978(uVar37);
          uVar46 = FUN_0106cf5c(uVar28,uVar46,uVar14);
          lVar21 = lVar21 + -8;
          plVar42 = plVar42 + 1;
          puVar44[1] = lVar26;
          puVar44[2] = uVar27;
          puVar44[3] = uVar46;
        } while (lVar21 != 0);
        if (uStack_360 != 0) {
          _ZdaPv();
        }
      }
      if (uStack_5c8 != (long *)0x0) {
        _ZdaPv();
      }
    }
    piVar23 = DAT_0133c390;
    lVar21 = FUN_00e026f0();
    if ((lVar21 == 0) || ((int)param_3[0x3e] != 0xd)) {
      if (lVar21 != 0) {
        bVar9 = false;
        bVar8 = false;
        goto LAB_00bc68dc;
      }
      uVar19 = FUN_00dffd20(lVar20,5);
      uVar14 = 0;
      bVar4 = false;
      bVar3 = false;
      bVar8 = false;
      bVar9 = false;
      if ((uVar19 & 1) != 0) goto LAB_00bc6900;
    }
    else {
      iVar12 = FUN_01056cb0(lVar21,0xc4,0);
      bVar8 = iVar12 == 1;
      iVar12 = FUN_01056cb0(lVar21,0xc9,0);
      bVar9 = iVar12 == 1;
LAB_00bc68dc:
      uVar14 = FUN_01056cb0(lVar21,0xd3,0);
    }
    bVar4 = bVar9;
    bVar3 = bVar8;
    *DAT_0133c858 = uVar14;
LAB_00bc6900:
    FUN_00dffc38(lVar20,5);
    FUN_00dffb60(lVar20);
    lVar20 = FUN_00df5044();
    *(undefined1 *)(*(long *)(lVar20 + 0x58) + 0x18) = 1;
    FUN_00df5044();
    FUN_00df624c();
    lVar20 = FUN_00df5044();
    iVar12 = *piVar23;
    lVar20 = *(long *)(lVar20 + 0x28);
    *(int *)(lVar20 + 0xe0) = iVar11;
    if (iVar12 == 0) {
      *(undefined4 *)(lVar20 + 0xe4) = uVar15;
    }
    else {
      uVar37 = FUN_00df5044();
      lVar30 = param_4[0x22];
      uVar15 = *(undefined4 *)((long)param_4 + 0xd4);
      lVar21 = FUN_00e01b60();
      if (lVar21 == 0) {
        uVar14 = 0;
      }
      else {
        FUN_00e02bbc();
        uVar14 = FUN_0105d438();
      }
      FUN_00df5bb0(uVar37,lVar30,uVar15,uVar14);
    }
    FUN_01086fe8(lVar20,(int)param_3[0x3e]);
    FUN_0108489c(lVar20,*(undefined4 *)((long)param_4 + 0xbc));
    FUN_01084e48(lVar20,(int)param_4[0x18]);
    FUN_01084e50(lVar20,(int)param_4[0x16]);
    uVar37 = FUN_01049cd0(param_4);
    FUN_01086b68(lVar20,uVar37);
    uVar37 = FUN_01049d1c(param_4);
    FUN_01086bac(lVar20,uVar37);
    *(undefined4 *)(lVar20 + 0x140) = uVar13;
    FUN_01086c80(lVar20,param_4[0x22]);
    if (((*piVar23 == 0) && ((int)param_3[0x3e] == 0xd)) &&
       (lVar21 = FUN_01086dac(lVar20), lVar21 != 0)) {
      if (bVar3) {
        uStack_5c8 = (long *)CONCAT44(uStack_5c8._4_4_,0x31);
        FUN_00b16730(lVar21,&uStack_5c8);
      }
      if (bVar4) {
        uStack_5c8 = (long *)CONCAT44(uStack_5c8._4_4_,0x35);
        FUN_00b16730(lVar21,&uStack_5c8);
      }
    }
    *(undefined4 *)(lVar20 + 0x148) = *(undefined4 *)((long)param_4 + 0xd4);
    *(char *)(lVar20 + 0x14e) = (char)param_4[0x1b];
    *(undefined1 *)(lVar20 + 0x180) = *(undefined1 *)((long)param_4 + 0xd9);
    *(undefined4 *)(lVar20 + 0x17c) = *(undefined4 *)((long)param_4 + 0xdc);
    *(int *)(lVar20 + 0x1a8) = (int)param_4[0x23];
    *(char *)(lVar20 + 0x1ac) = (char)param_4[0x24];
    *(undefined8 *)(lVar20 + 0x1b0) = *(undefined8 *)((long)param_4 + 0x124);
    FUN_0076b33c(lVar20 + 0x238,param_4 + 0x28);
    uVar37 = FUN_01049d3c(param_4);
    FUN_010877d4(lVar20,uVar37);
    uVar37 = FUN_01049d44(param_4);
    FUN_010877e4(lVar20,uVar37);
    uVar37 = FUN_01049d4c(param_4);
    FUN_010877f4(lVar20,uVar37);
    lVar21 = FUN_01049d54(param_4);
    if (lVar21 != 0) {
      FUN_01087804(lVar20,lVar21);
    }
    pcVar32 = DAT_0133c860;
    if ((0xfffffffd < *(int *)(lVar20 + 0x140) - 3U) || (*DAT_0133c860 != '\0')) {
      if (*DAT_0133c860 != '\0') {
        uVar13 = 1;
      }
      *(undefined4 *)(lVar20 + 0xe0) = 0xffffffff;
      *(undefined4 *)(lVar20 + 0x140) = uVar13;
      *(undefined4 *)(lVar20 + 0xf0) = 0xffffffff;
      *(int *)(lVar20 + 0xf4) = iVar11;
      *(int *)(lVar20 + 0x19c) = (int)param_4[0x1c];
      uVar19 = FUN_010d43e8(uVar35);
      if ((uVar19 & 1) != 0) {
        FUN_00bc8f20();
        uVar19 = FUN_00bc9240();
        if ((uVar19 & 1) == 0) {
          *(int *)(lVar20 + 0xf0) = iVar11;
        }
      }
      FUN_0099b5c4();
      FUN_009990f4();
      lVar21 = FUN_00bc8f20();
      if (lVar21 != 0) {
        FUN_00bc8f20();
        FUN_008ad0e4();
      }
    }
    if (*piVar23 == 0) {
      if (0 < (int)uVar16) {
        lVar21 = 0;
        do {
          uVar35 = FUN_010a7218(*(undefined8 *)(*(long *)param_4[0x20] + lVar21));
          FUN_01084ef0(lVar20,uVar35);
          lVar21 = lVar21 + 8;
        } while ((ulong)uVar16 * 8 != lVar21);
      }
      if (1 < *(int *)(lVar20 + 0x140) - 1U) {
        uVar35 = _Znwm(0xa8);
        uVar37 = _Znwm(0x10);
        FUN_008919dc(uVar37,*(undefined8 *)(_DAT_014053c0 + 0x70));
        uVar39 = _Znwm(0x10);
        FUN_00bc93d0(uVar39,_DAT_014053c0);
        uVar13 = FUN_008919e8(*(undefined8 *)(_DAT_014053c0 + 0x70));
        FUN_010482ac(uVar35,uVar37,uVar39,uVar13);
        (**(code **)(*param_3 + 0x18))(param_3,uVar35);
      }
    }
    else if (0 < (int)uVar16) {
      uVar41 = 0;
      do {
        lVar21 = FUN_00df5044();
        FUN_01089804(*(undefined8 *)(lVar21 + 0x30),uVar41);
        uVar35 = FUN_010a7218();
        FUN_01084ef0(lVar20,uVar35);
        uVar41 = uVar41 + 1;
      } while (uVar16 != uVar41);
    }
    FUN_01086e80(lVar20,*(undefined4 *)((long)param_4 + 0xc4));
    if (*piVar23 == 0) {
      lVar21 = *(long *)(*(long *)param_4[0x20] + (long)iVar11 * 8);
    }
    else {
      lVar21 = FUN_00df5044();
      lVar21 = FUN_01089804(*(undefined8 *)(lVar21 + 0x30),iVar11);
    }
    *(undefined4 *)(lVar20 + 0x100) = *(undefined4 *)(lVar21 + 0x50);
    FUN_0076b33c(lVar20 + 0x238,param_4 + 0x28);
    uVar35 = FUN_00df5044();
    FUN_00df5ad0(uVar35,param_4 + 0x26);
    *(undefined1 *)(lVar20 + 0xa8) = 1;
    if ((*(int *)(lVar20 + 0x140) - 3U < 0xfffffffe) && (*pcVar32 == '\0')) {
      iVar11 = *(int *)(lVar20 + 0x108);
      uVar35 = FUN_00dfeefc();
      if (iVar11 == 8) {
        FUN_00e00280(uVar35,0xf);
      }
      else {
        FUN_00e0035c(uVar35,lVar20);
      }
    }
    else {
      uVar35 = FUN_00dfeefc();
      FUN_00e00280(uVar35,2);
    }
    if (param_3[0x44] != 0) {
      FUN_01041cc4();
      if (param_3[0x44] != 0) {
        _ZdlPv();
      }
      param_3[0x44] = 0;
    }
    if (param_3[0x45] == 0) {
      return true;
    }
    FUN_010410cc();
    if (param_3[0x45] != 0) {
      _ZdlPv();
    }
    param_3[0x45] = 0;
    return true;
  }
  switch(iVar11) {
  case 0x4e87:
    *(undefined4 *)(param_3 + 0x3b) = 0;
    uVar13 = (**(code **)(*param_4 + 0x40))(param_4);
    FUN_0076d990(&uStack_5c8,&DAT_0029dac9,uVar13);
    FUN_00610de8(&uStack_5c8);
    FUN_0076ad48(&uStack_5c8);
    lVar20 = (**(code **)(*param_4 + 0x50))(param_4);
    FUN_0076ae58(&uStack_360,&DAT_002aadd1);
    if (lVar20 != 0) {
      FUN_0076b33c(&uStack_360,lVar20);
      FUN_0076ad48(lVar20);
      _ZdlPv(lVar20);
    }
    iVar11 = (**(code **)(*param_4 + 0x40))(param_4);
    lVar20 = FUN_00856ae8();
    if (lVar20 != 0) {
      uVar35 = FUN_00856ae8();
      uVar13 = FUN_0102a708(param_4);
      FUN_0085e4f8(uVar35,uVar13);
    }
    plVar45 = DAT_0133c320;
    plVar42 = DAT_0133c298;
    if (iVar11 < 0xd) {
      if (iVar11 < 10) {
        if (iVar11 != 7) {
          if (iVar11 == 8) {
            lVar20 = FUN_0102a67c(param_4);
            FUN_0076ae58(&uStack_5c8,&DAT_002aadd1);
            if (lVar20 != 0) {
              FUN_0076b33c(&uStack_5c8,lVar20);
            }
            lVar21 = FUN_00856ae8();
            FUN_0076b33c(lVar21 + 0xa8,&uStack_5c8);
            uVar35 = FUN_00856ae8();
            FUN_0076aed8(auStack_88,&uStack_360);
            FUN_0076ae58(auStack_98,&DAT_002aadd1);
            FUN_0076ae58(auStack_a8,&DAT_002aadd1);
            FUN_0085bc50(uVar35,5,8,auStack_88,auStack_98,auStack_a8);
            FUN_0076ad48(auStack_a8);
            FUN_0076ad48(auStack_98);
            FUN_0076ad48(auStack_88);
            FUN_00be4f9c(*DAT_0133c298,5);
            if (lVar20 != 0) {
              FUN_0076ad48(lVar20);
              _ZdlPv(lVar20);
            }
          }
          else {
            if (iVar11 != 9) goto LAB_00bc8184;
            FUN_00be4ef8(*DAT_0133c298,0);
            FUN_0076aa74(&uStack_5c8);
            uVar35 = FUN_0102a65c(param_4);
            FUN_00635a94(&uStack_5c8,uVar35,&DAT_002aadd1);
            lVar20 = *plVar42;
            FUN_0076ae58(&uStack_78,&DAT_002ac994);
            FUN_00be4a44(lVar20,&uStack_5c8,&uStack_78);
            FUN_0076ad48(&uStack_78);
          }
          goto LAB_00bc8174;
        }
        uVar35 = FUN_00dfeefc();
        uVar19 = FUN_00dffd20(uVar35,2);
        if ((uVar19 & 1) == 0) {
          FUN_00610e30(&DAT_002c1e32,1);
        }
        else {
          lVar20 = FUN_0102a64c(param_4);
          uVar37 = FUN_0102a6e8(param_4);
          FUN_00bc8f6c(&uStack_5c8,uVar37,uVar37);
          lVar21 = FUN_0102a66c(param_4);
          if ((lVar21 == 0) || ((long *)uStack_5c0 != uStack_5c8)) {
            if (lVar21 != 0) goto LAB_00bc8634;
          }
          else {
            if (*(int *)(lVar21 + 4) != 0) {
              FUN_00bc9070(&uStack_5c8,lVar21);
            }
LAB_00bc8634:
            FUN_0076ad48(lVar21);
            _ZdlPv(lVar21);
          }
          uVar35 = FUN_00dffd10(uVar35);
          if (lVar20 == 0) {
            uVar13 = FUN_0102a6cc(param_4);
            lVar20 = FUN_0102a6d4(param_4);
            uStack_78 = 0;
            iVar11 = FUN_006f969c(lVar20,uVar13,&uStack_78,0);
            if (iVar11 < 1) {
              FUN_00610e30(&DAT_002fbe10,1);
            }
            else {
              uVar37 = _Znwm(0x10);
              FUN_0076ae48(uVar37,uStack_78,iVar11);
              FUN_00e066f0(uVar35,uVar37,&uStack_5c8);
            }
            if (lVar20 != 0) {
              _ZdaPv(lVar20);
            }
            if (uStack_78 != 0) {
              _ZdaPv();
            }
          }
          else {
            FUN_00e066f0(uVar35,lVar20,&uStack_5c8);
          }
          FUN_00bc90c0(&uStack_5c8);
        }
        plVar42 = DAT_0133c298;
        lVar20 = *DAT_0133c298;
        if ((char)param_4[0x1d] == '\0') goto LAB_00bc67c0;
        FUN_00be4ef8(lVar20,0);
        lVar20 = *plVar42;
        uVar35 = 0xc;
      }
      else {
        if (iVar11 != 10) {
          if (iVar11 != 0xb) {
            if (iVar11 == 0xc) goto LAB_00bc674c;
            goto LAB_00bc8184;
          }
          uVar19 = FUN_0102a6b4(param_4);
          lVar20 = FUN_0102a6bc(param_4);
          FUN_0076ae58(&uStack_5c8,&DAT_002aadd1);
          if (lVar20 != 0) {
            FUN_0076b33c(&uStack_5c8,lVar20);
            FUN_0076ad48(lVar20);
            _ZdlPv(lVar20);
          }
          plVar42 = DAT_0133c320;
          if (*DAT_0133c320 != 0) {
            lVar20 = FUN_0102a710(param_4);
            FUN_00ba2624(*plVar42,lVar20);
            FUN_0076aa74(&uStack_78);
            lVar21 = *plVar42;
            FUN_0102a730(alStack_b8,param_4);
            uVar35 = FUN_00635a94(&uStack_78,alStack_b8[0],&DAT_002aadd1);
            FUN_00ba263c(lVar21,uVar35);
            FUN_0076aa74(alStack_b8);
            lVar21 = *plVar42;
            FUN_0102a740(&uStack_c8,param_4);
            uVar35 = FUN_00635a94(alStack_b8,uStack_c8,&DAT_002aadd1);
            FUN_00ba2644(lVar21,uVar35);
            FUN_0076aa74(&uStack_c8);
            lVar21 = *plVar42;
            FUN_0102a750(alStack_d8,param_4);
            uVar35 = FUN_00635a94(&uStack_c8,alStack_d8[0],&DAT_002aadd1);
            FUN_00ba264c(lVar21,uVar35);
            FUN_0076aa74(alStack_d8);
            lVar21 = *plVar42;
            FUN_0102a720(alStack_370,param_4);
            uVar35 = FUN_00635a94(alStack_d8,alStack_370[0],&DAT_002aadd1);
            FUN_00ba2634(lVar21,uVar35);
            if (lVar20 != 0) {
              _ZdlPv(lVar20);
            }
            FUN_0076ad48(alStack_d8);
            FUN_0076ad48(&uStack_c8);
            FUN_0076ad48(alStack_b8);
            FUN_0076ad48(&uStack_78);
          }
          uVar35 = FUN_00856ae8();
          uVar13 = 0x10;
          if ((uVar19 & 1) == 0) {
            uVar13 = 9;
          }
          FUN_0076aed8(auStack_e8,&uStack_360);
          FUN_0076aed8(auStack_f8,&uStack_5c8);
          FUN_0076ae58(auStack_108,&DAT_002aadd1);
          FUN_0085bc50(uVar35,uVar13,0xb,auStack_e8,auStack_f8,auStack_108);
          FUN_0076ad48(auStack_108);
          FUN_0076ad48(auStack_f8);
          puVar36 = auStack_e8;
LAB_00bc815c:
          FUN_0076ad48(puVar36);
          FUN_00be4f9c(*DAT_0133c298,5);
LAB_00bc8174:
          FUN_0076ad48(&uStack_5c8);
          puVar44 = &uStack_360;
          goto LAB_00bc3474;
        }
        uVar13 = (**(code **)(*param_4 + 0x60))(param_4);
        uVar15 = FUN_0102a700(param_4);
        uVar35 = FUN_00856ae8();
        FUN_0085ea64(uVar35,uVar13,&uStack_360,uVar15);
        plVar42 = DAT_0133c298;
        FUN_00be4ef8(*DAT_0133c298,0);
        lVar20 = *plVar42;
        uVar35 = 0xd;
      }
    }
    else {
      if (iVar11 < 0x13) {
        if (iVar11 != 0xd) {
          if (iVar11 == 0x10) {
            uVar35 = FUN_00856ae8();
            FUN_0076aed8(auStack_148,&uStack_360);
            FUN_0076ae58(auStack_158,&DAT_002aadd1);
            FUN_0076ae58(auStack_168,&DAT_002aadd1);
            FUN_0085bc50(uVar35,0x11,0x10,auStack_148,auStack_158,auStack_168);
            FUN_0076ad48(auStack_168);
            FUN_0076ad48(auStack_158);
            puVar36 = auStack_148;
          }
          else {
            if (iVar11 != 0x11) goto LAB_00bc8184;
            uVar35 = FUN_00856ae8();
            FUN_0076aed8(auStack_178,&uStack_360);
            FUN_0076ae58(auStack_188,&DAT_002aadd1);
            FUN_0076ae58(auStack_198,&DAT_002aadd1);
            FUN_0085bc50(uVar35,7,0x11,auStack_178,auStack_188,auStack_198);
            FUN_0076ad48(auStack_198);
            FUN_0076ad48(auStack_188);
            puVar36 = auStack_178;
          }
          goto LAB_00bc67b0;
        }
        if (*DAT_0133c320 != 0) {
          lVar20 = FUN_0102a710(param_4);
          FUN_00ba2624(*plVar45,lVar20);
          FUN_0076aa74(&uStack_5c8);
          lVar21 = *plVar45;
          FUN_0102a730(&uStack_78,param_4);
          uVar35 = FUN_00635a94(&uStack_5c8,uStack_78,&DAT_002aadd1);
          FUN_00ba263c(lVar21,uVar35);
          FUN_0076aa74(&uStack_78);
          lVar21 = *plVar45;
          FUN_0102a740(alStack_b8,param_4);
          uVar35 = FUN_00635a94(&uStack_78,alStack_b8[0],&DAT_002aadd1);
          FUN_00ba2644(lVar21,uVar35);
          FUN_0076aa74(alStack_b8);
          lVar21 = *plVar45;
          FUN_0102a750(&uStack_c8,param_4);
          uVar35 = FUN_00635a94(alStack_b8,uStack_c8,&DAT_002aadd1);
          FUN_00ba264c(lVar21,uVar35);
          FUN_0076aa74(&uStack_c8);
          lVar21 = *plVar45;
          FUN_0102a720(alStack_d8,param_4);
          uVar35 = FUN_00635a94(&uStack_c8,alStack_d8[0],&DAT_002aadd1);
          FUN_00ba2634(lVar21,uVar35);
          if (lVar20 != 0) {
            _ZdlPv(lVar20);
          }
          FUN_0076ad48(&uStack_c8);
          FUN_0076ad48(alStack_b8);
          FUN_0076ad48(&uStack_78);
          FUN_0076ad48(&uStack_5c8);
        }
        uVar35 = FUN_00dfeefc();
        uVar19 = FUN_00dffd20(uVar35,2);
        if ((uVar19 & 1) != 0) {
          FUN_00dffd10(uVar35);
          FUN_00e066c4();
        }
      }
      else {
        if (iVar11 - 0x13U < 3) {
LAB_00bc674c:
          uVar35 = FUN_00856ae8();
          FUN_0076aed8(auStack_118,&uStack_360);
          FUN_0076ae58(auStack_128,&DAT_002aadd1);
          FUN_0076ae58(auStack_138,&DAT_002aadd1);
          FUN_0085bc50(uVar35,0xd,iVar11,auStack_118,auStack_128,auStack_138);
          FUN_0076ad48(auStack_138);
          FUN_0076ad48(auStack_128);
          puVar36 = auStack_118;
        }
        else if (iVar11 == 0x1b) {
          uVar35 = FUN_00856ae8();
          FUN_0076aed8(auStack_1a8,&uStack_360);
          FUN_0076ae58(auStack_1b8,&DAT_002aadd1);
          FUN_0076ae58(auStack_1c8,&DAT_002aadd1);
          FUN_0085bc50(uVar35,0x1c,0x1b,auStack_1a8,auStack_1b8,auStack_1c8);
          FUN_0076ad48(auStack_1c8);
          FUN_0076ad48(auStack_1b8);
          puVar36 = auStack_1a8;
        }
        else {
LAB_00bc8184:
          if ((iVar11 == 0xf) && (*DAT_0133c158 == 2 || *DAT_0133c158 == 0x23)) {
            uVar35 = FUN_00856ae8();
            uVar13 = FUN_0102a6f8(param_4);
            FUN_0076aed8(auStack_1d8,&uStack_360);
            FUN_0076ae58(auStack_1e8,&DAT_002aadd1);
            FUN_0076ae58(auStack_1f8,&DAT_002aadd1);
            FUN_0085bc50(uVar35,0x12,uVar13,auStack_1d8,auStack_1e8,auStack_1f8);
            FUN_0076ad48(auStack_1f8);
            FUN_0076ad48(auStack_1e8);
            puVar36 = auStack_1d8;
          }
          else {
            if ((iVar11 - 1U < 2) && (*(char *)((long)param_4 + 0xc9) != '\0')) {
              FUN_00be4020(*DAT_0133c298);
              FUN_00be4ef8(*plVar42,0);
              FUN_00be508c(*plVar42);
              puVar44 = &uStack_360;
              goto LAB_00bc3474;
            }
            if (iVar11 < 0x19) {
              if (iVar11 < 0x17) {
                if (iVar11 == 0x12) {
                  uVar35 = FUN_00856ae8();
                  FUN_0076aed8(auStack_298,&uStack_360);
                  FUN_0076ae58(auStack_2a8,&DAT_002aadd1);
                  FUN_0076ae58(auStack_2b8,&DAT_002aadd1);
                  FUN_0085bc50(uVar35,0x15,0x12,auStack_298,auStack_2a8,auStack_2b8);
                  FUN_0076ad48(auStack_2b8);
                  FUN_0076ad48(auStack_2a8);
                  puVar36 = auStack_298;
                  goto LAB_00bc67b0;
                }
                if (iVar11 == 0x16) {
                  (**(code **)(*(long *)*DAT_0133c2b0 + 0xe0))((long *)*DAT_0133c2b0,DAT_0133c1e8);
                  puVar44 = &uStack_360;
                  goto LAB_00bc3474;
                }
              }
              else {
                if (iVar11 == 0x17) goto LAB_00bc8e5c;
                if (iVar11 == 0x18) {
                  uVar35 = FUN_00856ae8();
                  FUN_0076aed8(auStack_208,&uStack_360);
                  FUN_0076ae58(auStack_218,&DAT_002aadd1);
                  FUN_0076ae58(auStack_228,&DAT_002aadd1);
                  FUN_0085bc50(uVar35,0x18,0x18,auStack_208,auStack_218,auStack_228);
                  FUN_0076ad48(auStack_228);
                  FUN_0076ad48(auStack_218);
                  FUN_0076ad48(auStack_208);
                  FUN_00c17cd8(*DAT_0133c2b0);
                  plVar42 = DAT_0133c298;
                  FUN_00be40d4(*DAT_0133c298,*(undefined4 *)(*DAT_0133c298 + 0x18));
                  FUN_00be4f9c(*plVar42,5);
                  FUN_00be67d0(*plVar42);
                  puVar44 = &uStack_360;
                  goto LAB_00bc3474;
                }
              }
            }
            else if (iVar11 < 0x1c) {
              if (iVar11 == 0x19) {
                uVar35 = FUN_00856ae8();
                FUN_0076aed8(auStack_238,&uStack_360);
                FUN_0076ae58(auStack_248,&DAT_002aadd1);
                FUN_0076ae58(auStack_258,&DAT_002aadd1);
                FUN_0085bc50(uVar35,0x19,0x19,auStack_238,auStack_248,auStack_258);
                FUN_0076ad48(auStack_258);
                FUN_0076ad48(auStack_248);
                FUN_0076ad48(auStack_238);
                plVar42 = DAT_0133c298;
                FUN_00be40d4(*DAT_0133c298,*(undefined4 *)(*DAT_0133c298 + 0x18));
                FUN_00be4f9c(*plVar42,5);
LAB_00bc8e5c:
                (**(code **)(*(long *)*DAT_0133c2b0 + 0xe0))((long *)*DAT_0133c2b0,DAT_0133c1f8);
                puVar44 = &uStack_360;
                goto LAB_00bc3474;
              }
              if (iVar11 == 0x1a) {
                if (*DAT_0133c320 != 0) {
                  lVar20 = FUN_0102a710(param_4);
                  FUN_00ba2624(*plVar45,lVar20);
                  FUN_0076aa74(&uStack_5c8);
                  lVar21 = *plVar45;
                  FUN_0102a730(&uStack_78,param_4);
                  uVar35 = FUN_00635a94(&uStack_5c8,uStack_78,&DAT_002aadd1);
                  FUN_00ba263c(lVar21,uVar35);
                  FUN_0076aa74(&uStack_78);
                  lVar21 = *plVar45;
                  FUN_0102a740(alStack_b8,param_4);
                  uVar35 = FUN_00635a94(&uStack_78,alStack_b8[0],&DAT_002aadd1);
                  FUN_00ba2644(lVar21,uVar35);
                  FUN_0076aa74(alStack_b8);
                  lVar21 = *plVar45;
                  FUN_0102a750(&uStack_c8,param_4);
                  uVar35 = FUN_00635a94(alStack_b8,uStack_c8,&DAT_002aadd1);
                  FUN_00ba264c(lVar21,uVar35);
                  FUN_0076aa74(&uStack_c8);
                  lVar21 = *plVar45;
                  FUN_0102a720(alStack_d8,param_4);
                  uVar35 = FUN_00635a94(&uStack_c8,alStack_d8[0],&DAT_002aadd1);
                  FUN_00ba2634(lVar21,uVar35);
                  if (lVar20 != 0) {
                    _ZdlPv(lVar20);
                  }
                  FUN_0076ad48(&uStack_c8);
                  FUN_0076ad48(alStack_b8);
                  FUN_0076ad48(&uStack_78);
                  FUN_0076ad48(&uStack_5c8);
                }
                uVar35 = FUN_00856ae8();
                uVar13 = (**(code **)(*param_4 + 0x60))(param_4);
                FUN_0076aed8(auStack_268,&uStack_360);
                FUN_0076ae58(auStack_278,&DAT_002aadd1);
                FUN_0076ae58(auStack_288,&DAT_002aadd1);
                FUN_0085bc50(uVar35,0x1b,uVar13,auStack_268,auStack_278,auStack_288);
                FUN_0076ad48(auStack_288);
                FUN_0076ad48(auStack_278);
                puVar36 = auStack_268;
                goto LAB_00bc67b0;
              }
            }
            else {
              if (iVar11 == 0x1c) {
                uVar35 = FUN_00856ae8();
                FUN_0085eb70(uVar35,param_4 + 0x20,(int)param_4[0x22],param_4 + 0x23);
                plVar42 = DAT_0133c298;
                FUN_00be4ef8(*DAT_0133c298,0);
                lVar20 = *plVar42;
                uVar35 = 0xe;
                goto LAB_00bc67c4;
              }
              if (iVar11 == 0x1e) {
                lVar20 = FUN_0102a6bc(param_4);
                FUN_0076ae58(&uStack_5c8,&DAT_002aadd1);
                if (lVar20 != 0) {
                  FUN_0076b33c(&uStack_5c8,lVar20);
                  FUN_0076ad48(lVar20);
                  _ZdlPv(lVar20);
                }
                uVar35 = FUN_00856ae8();
                FUN_0076aed8(auStack_2c8,&uStack_360);
                FUN_0076aed8(auStack_2d8,&uStack_5c8);
                FUN_0076ae58(auStack_2e8,&DAT_002aadd1);
                FUN_0085bc50(uVar35,0x1f,0x1e,auStack_2c8,auStack_2d8,auStack_2e8);
                FUN_0076ad48(auStack_2e8);
                FUN_0076ad48(auStack_2d8);
                puVar36 = auStack_2c8;
                goto LAB_00bc815c;
              }
            }
            uVar35 = FUN_00856ae8();
            FUN_0076aed8(auStack_2f8,&uStack_360);
            FUN_0076ae58(auStack_308,&DAT_002aadd1);
            FUN_0076ae58(auStack_318,&DAT_002aadd1);
            FUN_0085bc50(uVar35,7,iVar11,auStack_2f8,auStack_308,auStack_318);
            FUN_0076ad48(auStack_318);
            FUN_0076ad48(auStack_308);
            puVar36 = auStack_2f8;
          }
        }
LAB_00bc67b0:
        FUN_0076ad48(puVar36);
      }
      lVar20 = *DAT_0133c298;
LAB_00bc67c0:
      uVar35 = 5;
    }
LAB_00bc67c4:
    FUN_00be4f9c(lVar20,uVar35);
    puVar44 = &uStack_360;
    goto LAB_00bc3474;
  case 0x4e88:
    *(undefined4 *)(param_3 + 0x3b) = 0;
    FUN_0076ae58(&uStack_5c8,&DAT_002bab44);
    FUN_0076ae58(&uStack_360,"default");
    uStack_78 = CONCAT44(uStack_78._4_4_,2);
    FUN_0081bdb0(&uStack_5c8,&uStack_360,&uStack_78);
    FUN_0076ad48(&uStack_360);
    FUN_0076ad48(&uStack_5c8);
    plVar42 = DAT_0133c298;
    piVar23 = (int *)*DAT_0133c298;
    if (*piVar23 != 4) {
      puVar31 = &DAT_002b74d1;
      goto LAB_00bc67d8;
    }
    if (*(char *)((long)piVar23 + 0xb5) == '\0') {
      FUN_00610dec(&DAT_003035ac);
      FUN_00be4ef8(*plVar42,0);
      return true;
    }
    FUN_00be4f9c(piVar23,8);
    FUN_00856ae8();
    FUN_0085cf40();
    puVar44 = DAT_0133c310;
    *(undefined4 *)(param_3 + 0xf) = 0;
    uVar19 = FUN_008a795c(*puVar44);
    if ((uVar19 & 1) == 0) {
      FUN_008a796c(*puVar44);
    }
    else {
      FUN_008a7af8();
    }
    lVar20 = FUN_00856ae8();
    uVar13 = FUN_0102c3c0(param_4);
    uVar15 = FUN_0102c3c8(param_4);
    uVar14 = FUN_0102c3d0(param_4);
    lVar30 = *plVar42;
    *(undefined4 *)(lVar20 + 0x188) = uVar13;
    *(undefined4 *)(lVar20 + 0x18c) = uVar15;
    *(undefined4 *)(lVar20 + 400) = uVar14;
    pcVar32 = (char *)FUN_00be5cf0(lVar30,*(undefined4 *)(lVar30 + 0x18));
    lVar20 = FUN_0102c3a0(param_4);
    puVar33 = (undefined4 *)FUN_0102c380(param_4);
    lVar21 = FUN_00f18eb8();
    if (lVar21 != 0) {
      FUN_00f18eb8();
      FUN_0076aa74(&uStack_5c8);
      if ((*DAT_0133c2b0 != 0) && (uVar19 = FUN_0087401c(), (uVar19 & 1) != 0)) {
        FUN_0076b21c(&uStack_5c8,&DAT_002aadd1);
      }
      FUN_008a7c98(*puVar44,*puVar33,puVar33[1],&uStack_5c8);
      FUN_0076ad48(&uStack_5c8);
    }
    uVar35 = FUN_00856ae8();
    uVar37 = FUN_006418f0(puVar33);
    FUN_0085e43c(uVar35,uVar37);
    uVar35 = FUN_00856ae8();
    uVar13 = FUN_0102c86c(param_4);
    FUN_0085e4f8(uVar35,uVar13);
    lVar21 = FUN_0102c884(param_4);
    lVar26 = FUN_00856ae8();
    if (lVar21 == 0) {
      FUN_0076ae58(&uStack_5c8,&DAT_002aadd1);
    }
    else {
      FUN_0076aed8(&uStack_5c8,lVar21);
    }
    FUN_0076b33c(lVar26 + 0x1a8,&uStack_5c8);
    FUN_0076ad48(&uStack_5c8);
    if (lVar21 != 0) {
      FUN_0076ad48(lVar21);
      _ZdlPv(lVar21);
    }
    lVar21 = FUN_00856ae8();
    uVar13 = FUN_0102c3f0(param_4);
    puVar36 = DAT_0133c868;
    *(undefined4 *)(lVar21 + 0x1b8) = uVar13;
    *puVar36 = 0;
    cVar1 = *pcVar32;
    if (cVar1 == '\0') {
      FUN_00be624c(lVar30,*(undefined4 *)(lVar30 + 0x18),lVar20,*puVar33,puVar33[1]);
    }
    *(bool *)((long)param_3 + 0x151) = cVar1 == '\0';
    FUN_00be68dc(lVar30,0);
    lVar21 = FUN_0102c3d8(param_4);
    FUN_0076aa74(&uStack_78);
    lVar30 = FUN_0102c428(param_4);
    if (lVar30 != 0) {
      FUN_0076b33c(&uStack_78,lVar30);
      FUN_0076ad48(lVar30);
      _ZdlPv(lVar30);
    }
    FUN_0085b190(&uStack_78);
    FUN_007748c0(&uStack_78);
    lVar30 = FUN_00856ae8();
    if (lVar30 != 0) {
      lVar30 = FUN_00856ae8();
      FUN_0076b33c(lVar30 + 0x198,&uStack_78);
    }
    FUN_0102c420(param_4);
    plVar45 = DAT_0133c2e0;
    if (*DAT_0133c2e0 != 0) {
      uVar35 = FUN_0102c83c(param_4);
      FUN_00bc8f6c(&uStack_5c8,uVar35,uVar35);
      uVar35 = FUN_0102c84c(param_4);
      FUN_00bc8f6c(&uStack_360,uVar35,uVar35);
      FUN_00bbc1fc(*plVar45,&uStack_5c8,&uStack_360);
      FUN_00bc90c0(&uStack_360);
      FUN_00bc90c0(&uStack_5c8);
    }
    plVar45 = DAT_0133c2b0;
    lVar30 = *DAT_0133c2b0;
    if (*(char *)(lVar30 + 0x40) != '\0') {
      *(short *)(lVar30 + 0x3c2) = (short)param_4[0x34];
      FUN_0102c894(&uStack_5c8,param_4);
      uVar13 = FUN_0064191c(puVar33);
      uVar15 = FUN_00641924(puVar33);
      uVar16 = FUN_0102c8f4(param_4);
      FUN_00c17ea0(lVar30,&uStack_5c8,lVar20,uVar13,uVar15,&uStack_78,uVar16 & 1);
      FUN_0076ad48(&uStack_5c8);
    }
    lVar30 = FUN_0102c3b0(param_4);
    plVar6 = DAT_0133c2d8;
    lVar26 = *DAT_0133c2d8;
    if (lVar30 == 0) {
      FUN_0076ae58(&uStack_5c8,&DAT_002aadd1);
    }
    else {
      FUN_0076aed8(&uStack_5c8,lVar30);
    }
    FUN_008c031c(lVar26,&uStack_5c8);
    FUN_0076ad48(&uStack_5c8);
    lVar26 = FUN_0102c85c(param_4);
    plVar5 = DAT_0133c2d0;
    lVar25 = *DAT_0133c2d0;
    if (lVar26 == 0) {
      FUN_0076ae58(&uStack_5c8,&DAT_002aadd1);
    }
    else {
      FUN_0076aed8(&uStack_5c8,lVar26);
    }
    FUN_009440dc(lVar25,&uStack_5c8);
    FUN_0076ad48(&uStack_5c8);
    lVar25 = FUN_0102c874(param_4);
    if (lVar25 != 0) {
      FUN_0076ad48();
      _ZdlPv(lVar25);
    }
    if (*plVar45 == 0) {
      uVar19 = 0;
    }
    else {
      uVar19 = FUN_0087401c();
      uVar19 = uVar19 & 0xffffffff;
    }
    uVar16 = FUN_008c06bc(*plVar6);
    lVar25 = *plVar5;
    *(uint *)(param_3 + 0x3b) = *(uint *)(param_3 + 0x3b) | uVar16 & 1;
    uVar22 = FUN_00944344(lVar25);
    uVar16 = 2;
    if ((uVar22 & 1) == 0) {
      uVar16 = 0;
    }
    uVar41 = 0x10;
    if ((uVar19 & 1) == 0) {
      uVar41 = 0;
    }
    *(uint *)(param_3 + 0x3b) = uVar16 | uVar41 | *(uint *)(param_3 + 0x3b);
    FUN_0076b21c(param_3 + 0x3c,&DAT_002aadd1);
    lVar25 = FUN_0102c410(param_4);
    if (lVar25 != 0) {
      FUN_0076b33c(param_3 + 0x3c,lVar25);
      FUN_0076ad48(lVar25);
      _ZdlPv(lVar25);
    }
    FUN_0076ae58(&uStack_5c8,&DAT_002aadd1);
    lVar25 = FUN_0102c400(param_4);
    if (lVar25 != 0) {
      FUN_0076b33c(&uStack_5c8,lVar25);
      FUN_0076ad48(lVar25);
      _ZdlPv(lVar25);
    }
    FUN_00773c20(&uStack_360);
    lVar25 = FUN_00be4b60(*plVar42);
    if (lVar25 == 0) {
      uVar35 = DAT_0133bb48;
    }
    else {
      uVar35 = FUN_00f027b0();
    }
    FUN_0076ae58(alStack_b8,&DAT_002c4856);
    lVar25 = *DAT_0133ba28;
    if (lVar25 == 0) {
      uVar19 = 0;
    }
    else {
      fVar47 = *(float *)(lVar25 + 0x178);
      if (*(float *)(lVar25 + 0x178) == 0.0) {
        fVar47 = 0.1;
      }
      uVar19 = CONCAT44((int)((ulong)*(undefined8 *)(lVar25 + 0x284) >> 0x20) -
                        (int)(((float)((ulong)*(undefined8 *)(lVar25 + 0x50) >> 0x20) +
                              *(float *)(lVar25 + 0x58)) / fVar47),
                        (int)*(undefined8 *)(lVar25 + 0x284) -
                        (int)(((float)*(undefined8 *)(lVar25 + 0x50) + *(float *)(lVar25 + 0x4c)) /
                             fVar47));
    }
    FUN_0076da2c(&uStack_c8,&DAT_002dee27,uVar19 & 0xffffffff,uVar19 >> 0x20);
    lVar25 = FUN_0102c904(param_4);
    FUN_0076ae58(alStack_d8,&DAT_002aadd1);
    if (lVar25 != 0) {
      FUN_0076b33c(alStack_d8,lVar25);
    }
    lVar34 = FUN_00856ae8();
    FUN_0076b33c(lVar34 + 0xa8,alStack_d8);
    plVar42 = DAT_0133c320;
    FUN_00ba2624(*DAT_0133c320,puVar33);
    FUN_0076aa74(alStack_370);
    lVar34 = *plVar42;
    FUN_0102c92c(alStack_380,param_4);
    uVar37 = FUN_00635a94(alStack_370,alStack_380[0],&DAT_002aadd1);
    FUN_00ba263c(lVar34,uVar37);
    FUN_0076aa74(alStack_380);
    lVar34 = *plVar42;
    FUN_0102c93c(alStack_390,param_4);
    uVar37 = FUN_00635a94(alStack_380,alStack_390[0],&DAT_002aadd1);
    FUN_00ba2644(lVar34,uVar37);
    FUN_0076aa74(alStack_390);
    lVar34 = *plVar42;
    FUN_0102c94c(alStack_3a0,param_4);
    uVar37 = FUN_00635a94(alStack_390,alStack_3a0[0],&DAT_002aadd1);
    FUN_00ba264c(lVar34,uVar37);
    FUN_0076aa74(alStack_3a0);
    lVar34 = *plVar42;
    FUN_0102c91c(alStack_3b0,param_4);
    uVar37 = FUN_00635a94(alStack_3a0,alStack_3b0[0],&DAT_002aadd1);
    FUN_00ba2634(lVar34,uVar37);
    FUN_0076d990(alStack_3b0,&DAT_0029dae8,*(undefined4 *)(pcVar32 + 4),*(undefined4 *)(pcVar32 + 8)
                );
    FUN_0076ae58(auStack_3c0,&DAT_002aadd1);
    if (lVar30 == 0) {
      FUN_0076ae58(auStack_3d0,&DAT_002aadd1);
    }
    else {
      FUN_0076aed8(auStack_3d0,lVar30);
    }
    uVar13 = FUN_0102c3f8(param_4);
    uVar15 = FUN_0102c3e8(param_4);
    uVar14 = FUN_0102c3f0(param_4);
    FUN_00856ae8();
    FUN_00856b68(auStack_3e0);
    if (lVar26 == 0) {
      FUN_0076ae58(auStack_3f0,&DAT_002aadd1);
    }
    else {
      FUN_0076aed8(auStack_3f0,lVar26);
    }
    FUN_010c5ad0(alStack_3b0,auStack_3c0,auStack_3d0,uVar13,uVar15,uVar14,&uStack_5c8,param_3 + 0x3c
                 ,auStack_3e0,uVar35,auStack_3f0,&uStack_360,alStack_b8,*(undefined4 *)(pcVar32 + 8)
                 ,&uStack_78,&uStack_c8);
    FUN_0076ad48(auStack_3f0);
    FUN_0076ad48(auStack_3e0);
    FUN_0076ad48(auStack_3d0);
    FUN_0076ad48(auStack_3c0);
    FUN_0076ad48(alStack_3b0);
    lVar34 = FUN_00f18ec4();
    if (*(char *)(lVar34 + 0x3e0) != '\0') {
      uVar35 = FUN_0086e1e4();
      FUN_0076ae58(alStack_3b0,&DAT_002a53a4);
      FUN_00be4c54(auStack_3c0);
      uVar16 = FUN_00e8b428();
      FUN_0076ae58(auStack_3d0,&DAT_002aadd1);
      FUN_0086e66c(uVar35,puVar33,alStack_3b0,auStack_3c0,uVar16 & 1,auStack_3d0);
      FUN_0076ad48(auStack_3d0);
      FUN_0076ad48(auStack_3c0);
      FUN_0076ad48(alStack_3b0);
    }
    uVar16 = FUN_0102c914(param_4);
    bVar8 = *(int *)(*DAT_0133c298 + 0x18) == 1;
    lVar34 = FUN_0076deb8(uVar16 & 1);
    plVar42 = (long *)(lVar34 + 8);
    if (7 < *(int *)(lVar34 + 4)) {
      plVar42 = (long *)*(long *)(lVar34 + 8);
    }
    lVar34 = FUN_0076deb8(bVar8);
    plVar45 = (long *)(lVar34 + 8);
    if (7 < *(int *)(lVar34 + 4)) {
      plVar45 = (long *)*(long *)(lVar34 + 8);
    }
    FUN_0076da2c(alStack_3b0,&DAT_002ffac3,plVar42,plVar45);
    FUN_0076ad48(alStack_3b0);
    thunk_FUN_008718dc(uVar16 & 1,!bVar8,1);
    FUN_0081f470(*puVar33,puVar33[1]);
    *DAT_0133b810 = &DAT_00bc9128;
    _ZdlPv(puVar33);
    if (lVar20 != 0) {
      FUN_0076ad48(lVar20);
      _ZdlPv(lVar20);
    }
    if (lVar30 != 0) {
      FUN_0076ad48(lVar30);
      _ZdlPv(lVar30);
    }
    if (lVar21 != 0) {
      FUN_0076ad48(lVar21);
      _ZdlPv(lVar21);
    }
    if (lVar25 != 0) {
      FUN_0076ad48(lVar25);
      _ZdlPv(lVar25);
    }
    if (lVar26 != 0) {
      FUN_0076ad48(lVar26);
      _ZdlPv(lVar26);
    }
    iVar11 = FUN_0102c8fc(param_4);
    if (iVar11 != 0) {
      uVar35 = FUN_00856ae8();
      uVar13 = FUN_0102c8fc(param_4);
      FUN_0076ae58(auStack_400,&DAT_002aadd1);
      FUN_0076ae58(auStack_410,&DAT_002aadd1);
      FUN_0076ae58(auStack_420,&DAT_002aadd1);
      FUN_0085bc50(uVar35,0x1a,uVar13,auStack_400,auStack_410,auStack_420);
      FUN_0076ad48(auStack_420);
      FUN_0076ad48(auStack_410);
      FUN_0076ad48(auStack_400);
    }
    FUN_0076ad48(alStack_3a0);
    FUN_0076ad48(alStack_390);
    FUN_0076ad48(alStack_380);
    FUN_0076ad48(alStack_370);
    FUN_0076ad48(alStack_d8);
    FUN_0076ad48(&uStack_c8);
    FUN_0076ad48(alStack_b8);
    FUN_0076ad48(&uStack_360);
    FUN_0076ad48(&uStack_5c8);
    puVar44 = &uStack_78;
    goto LAB_00bc3474;
  case 0x4e89:
    iVar11 = FUN_01047868(param_4);
    if (iVar11 == 2) {
      lVar20 = *DAT_0133c2d8;
      uVar35 = FUN_01047870(param_4);
      FUN_008c06fc(lVar20,uVar35);
    }
    else {
      iVar11 = FUN_01047868(param_4);
      plVar42 = DAT_0133c4c8;
      if (iVar11 == 0) {
        lVar20 = *DAT_0133c4c8;
        if (lVar20 != 0) {
          uVar2 = *(undefined1 *)((long)param_4 + 0x9c);
          uVar35 = FUN_01047870(param_4);
          FUN_008bc46c(lVar20,uVar2,uVar35);
          *(undefined1 *)(*plVar42 + 0x99) = *(undefined1 *)((long)param_4 + 0x9d);
          return true;
        }
      }
      else {
        iVar11 = FUN_01047868(param_4);
        if (iVar11 == 6) {
          lVar20 = *DAT_0133c2b0;
          if (lVar20 != 0) {
            uStack_5c8 = (long *)FUN_01047870(param_4);
            FUN_00c172d0(lVar20,&uStack_5c8);
          }
        }
        else {
          iVar11 = FUN_01047868(param_4);
          if (iVar11 == 7) {
            lVar20 = *DAT_0133c2b0;
            if (lVar20 != 0) {
              uVar35 = FUN_01047870(param_4);
              FUN_00c16618(lVar20,uVar35);
            }
          }
          else {
            iVar11 = FUN_01047868(param_4);
            if (iVar11 == 8) {
              lVar20 = *DAT_0133c2b0;
              if (lVar20 != 0) {
                uVar35 = FUN_01047870(param_4);
                FUN_00c16e8c(lVar20,uVar35);
              }
            }
            else {
              iVar11 = FUN_01047868(param_4);
              if (iVar11 == 9) {
                lVar20 = *DAT_0133c4c8;
                if (lVar20 != 0) {
                  uVar2 = *(undefined1 *)((long)param_4 + 0x9c);
                  uVar35 = FUN_01047870(param_4);
                  FUN_008bc73c(lVar20,uVar2,uVar35);
                }
              }
              else {
                iVar11 = FUN_01047868(param_4);
                if (iVar11 != 10) {
                  puVar31 = &DAT_002dee2d;
                  goto LAB_00bc67d8;
                }
                lVar20 = *DAT_0133c4c8;
                if (lVar20 != 0) {
                  uVar35 = FUN_01047870(param_4);
                  FUN_008bcc78(lVar20,uVar35);
                }
              }
            }
          }
        }
      }
    }
    break;
  case 0x4e8a:
    if (*DAT_0133c4c8 == 0) {
      return true;
    }
    lVar21 = FUN_01047a70(param_4);
    if (lVar21 == 0) {
      return true;
    }
    FUN_008bcdf8(*plVar45,(char)param_4[0x12],lVar21);
    FUN_0104742c(lVar21);
    FUN_0076ad48(lVar21 + 0x80);
    goto LAB_00bc799c;
  case 0x4e8c:
    FUN_00bc98c0(param_3);
    break;
  case 0x4e90:
    lVar20 = FUN_0097dc60();
    if (lVar20 == 0) {
      return true;
    }
    FUN_0076ae58(&uStack_5c8,&DAT_002e9bb6);
    iVar11 = FUN_01045320(param_4);
    uVar16 = iVar11 - 1;
    if ((uVar16 < 8) && ((0xdbU >> (ulong)(uVar16 & 0x1f) & 1) != 0)) {
      FUN_0076b21c(&uStack_5c8,&DAT_0030f5c4 + *(int *)(&DAT_0030f5c4 + (ulong)uVar16 * 4));
    }
    uVar35 = FUN_0097dc60();
    uVar37 = FUN_00e170a8(&uStack_5c8);
    FUN_00982b44(uVar35,uVar37,1,0,0);
    goto LAB_00bc3470;
  case 0x4e95:
    lVar20 = FUN_0097dc60();
    if (lVar20 == 0) {
      return true;
    }
    if ((int)param_4[0x12] != 1) {
      return true;
    }
    FUN_0076ae58(&uStack_5c8,&DAT_002b32cd);
    FUN_010c5bbc(DAT_0133c6b8,DAT_0133c830,&uStack_5c8);
LAB_00bc3470:
    puVar44 = &uStack_5c8;
    goto LAB_00bc3474;
  case 0x4e96:
    if ((int)param_4[0x12] < 1) {
      param_3[0x50] = 0;
      return true;
    }
    *(int *)(param_3 + 0x50) = (int)param_4[0x12] + 5;
    iVar11 = *(int *)((long)param_4 + 0x94);
    *(int *)((long)param_3 + 0x284) = iVar11;
    lVar20 = FUN_0097dc60();
    if (lVar20 != 0) {
      puVar31 = &DAT_002f4762;
      if (iVar11 != 4) {
        puVar31 = &DAT_002c5afc;
      }
      uVar35 = FUN_00e17028(puVar31);
      uVar37 = FUN_0097dc60();
      FUN_0076ae58(&uStack_360,&DAT_002c0ec3);
      FUN_00e614a4(&uStack_78,(int)param_3[0x50],0,0);
      FUN_0076ca18(&uStack_5c8,uVar35,&uStack_360,&uStack_78);
      FUN_0097e4b8(0,uVar37,&uStack_5c8,0xffffffff);
      FUN_0076ad48(&uStack_5c8);
      FUN_0076ad48(&uStack_78);
      FUN_0076ad48(&uStack_360);
    }
    if (iVar11 != 4) {
      return true;
    }
    lVar20 = FUN_0099c2d8();
    if (lVar20 == 0) {
      return true;
    }
    FUN_0099c2d8();
    FUN_0099c5a4();
    break;
  case 0x4e99:
    FUN_008a6ec0(*DAT_0133c310,param_4 + 0x13,(int)param_4[0x12],*(uint *)((long)param_4 + 0x94) & 1
                );
    break;
  case 0x4ea4:
    lVar20 = FUN_0102d840(param_4);
    lVar21 = FUN_0102d830(param_4);
    lVar30 = *DAT_0133c298;
    if (((lVar30 != 0) && (uVar19 = FUN_00641870(lVar21), (uVar19 & 1) == 0)) &&
       (*(int *)(lVar20 + 4) != 0)) {
      uVar13 = *(undefined4 *)(lVar30 + 0x18);
      uVar15 = FUN_0064191c(lVar21);
      uVar14 = FUN_00641924(lVar21);
      FUN_00be624c(lVar30,uVar13,lVar20,uVar15,uVar14);
    }
    if (lVar21 != 0) {
      _ZdlPv(lVar21);
    }
    if (lVar20 != 0) {
      FUN_0076ad48(lVar20);
      _ZdlPv(lVar20);
    }
    FUN_00856ae8();
    FUN_0085bc3c();
    break;
  case 0x4ea5:
    iVar11 = FUN_0102d52c(param_4);
    if (iVar11 == 10) {
      uVar35 = FUN_00856ae8();
      FUN_0076ae58(auStack_4c0,&DAT_002aadd1);
      FUN_0076ae58(auStack_4d0,&DAT_002aadd1);
      FUN_0076ae58(auStack_4e0,&DAT_002aadd1);
      FUN_0085bc50(uVar35,6,0,auStack_4c0,auStack_4d0,auStack_4e0);
      FUN_0076ad48(auStack_4e0);
      FUN_0076ad48(auStack_4d0);
      puVar44 = auStack_4c0;
    }
    else if (iVar11 == 5) {
      uVar35 = FUN_00856ae8();
      FUN_0076ae58(auStack_490,&DAT_002aadd1);
      FUN_0076ae58(auStack_4a0,&DAT_002aadd1);
      FUN_0076ae58(auStack_4b0,&DAT_002aadd1);
      FUN_0085bc50(uVar35,0xf,0,auStack_490,auStack_4a0,auStack_4b0);
      FUN_0076ad48(auStack_4b0);
      FUN_0076ad48(auStack_4a0);
      puVar44 = auStack_490;
    }
    else {
      if (iVar11 == 4) {
        uVar35 = FUN_00dfeefc();
        uVar19 = FUN_00dffd20(uVar35,2);
        if ((uVar19 & 1) == 0) {
          return true;
        }
        uVar35 = FUN_00dffd10(uVar35);
        uVar13 = FUN_0102d52c(param_4);
        FUN_00e066d0(uVar35,uVar13);
        return true;
      }
      uVar35 = FUN_00856ae8();
      FUN_0076ae58(auStack_4f0,&DAT_002aadd1);
      FUN_0076ae58(auStack_500,&DAT_002aadd1);
      FUN_0076ae58(auStack_510,&DAT_002aadd1);
      FUN_0085bc50(uVar35,7,0,auStack_4f0,auStack_500,auStack_510);
      FUN_0076ad48(auStack_510);
      FUN_0076ad48(auStack_500);
      puVar44 = auStack_4f0;
    }
LAB_00bc3474:
    FUN_0076ad48(puVar44);
    return true;
  case 0x4eb7:
    uVar39 = *DAT_0133c310;
    uVar35 = FUN_01027a5c(param_4);
    uVar37 = FUN_01027a64(param_4);
    goto LAB_00bc4d14;
  case 0x4eb8:
    uVar39 = *DAT_0133c310;
    uVar35 = FUN_010293f4(param_4);
    uVar37 = FUN_010293fc(param_4);
    goto LAB_00bc4d14;
  case 0x4eba:
    uVar39 = *DAT_0133c310;
    uVar35 = FUN_010285e0(param_4);
    uVar37 = FUN_010285e8(param_4);
    goto LAB_00bc4d14;
  case 0x4ebd:
    uVar39 = *DAT_0133c310;
    uVar35 = FUN_01028dc8(param_4);
    uVar37 = FUN_01028dd0(param_4);
LAB_00bc4d14:
    FUN_008a6cd4(uVar39,uVar35,uVar37);
    return true;
  case 0x4ec1:
    lVar20 = FUN_0097dc60();
    if (lVar20 != 0) {
      uVar35 = FUN_0097dc60();
      uVar37 = FUN_00e17028(&DAT_002d4674);
      FUN_0097e4b8(0,uVar35,uVar37,0xffffffff);
    }
    FUN_00dfeefc();
    FUN_00e0026c();
    break;
  case 0x4ee7:
    FUN_008bd9f0(*DAT_0133c4c8,param_4);
    break;
  case 0x4eed:
    lVar20 = FUN_00e01b60();
    if (lVar20 == 0) {
      return true;
    }
    lVar20 = FUN_00e02588();
    if (lVar20 == 0) {
      return true;
    }
    lVar20 = FUN_0097dc60();
    if (lVar20 == 0) {
      return true;
    }
    lVar20 = FUN_0097f85c(lVar20,1);
    if (lVar20 == 0) {
      return true;
    }
    uVar13 = FUN_0103cebc(param_4);
    FUN_00bd5188(lVar20,uVar13);
  }
  return true;
}



/* 00c51460 FUN_00c51460; mode=normalize_15_seconds_lower_level */
/* DECOMPILATION FAILED: Low-level Error: Bad instruction count exceeded:
    ...
    No pcode could be generated at address: r0x00c52464 */
