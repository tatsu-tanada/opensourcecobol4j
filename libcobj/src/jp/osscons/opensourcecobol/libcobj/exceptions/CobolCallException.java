/*
 * Copyright (C) 2020 TOKYO SYSTEM HOUSE Co., Ltd.
 *
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2, or (at your option)
 * any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this software; see the file COPYING.  If not, write to
 * the Free Software Foundation, 51 Franklin Street, Fifth Floor
 * Boston, MA 02110-1301 USA
 */

package jp.osscons.opensourcecobol.libcobj.exceptions;

/**
 * CobolResolveなどでCALLの失敗したときの例外を示すクラス
 */
public class CobolCallException extends Exception {

	public static CobolCallException ex;

	{
		ex = new CobolCallException();
	}

	/**
	 * コンストラクタ
	 */
	public CobolCallException() {
		// TODO 自動生成されたコンストラクター・スタブ
	}
}
